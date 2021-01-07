package com.fasterxml.jackson.core.base;

import com.adjust.sdk.Constants;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public abstract class ParserBase extends ParserMinimalBase {
    protected byte[] _binaryValue;
    protected ByteArrayBuilder _byteArrayBuilder;
    protected boolean _closed;
    protected long _currInputProcessed;
    protected int _currInputRow = 1;
    protected int _currInputRowStart;
    protected int _inputEnd;
    protected int _inputPtr;
    protected int _intLength;
    protected final IOContext _ioContext;
    protected boolean _nameCopied;
    protected char[] _nameCopyBuffer;
    protected JsonToken _nextToken;
    protected int _numTypesValid = 0;
    protected BigDecimal _numberBigDecimal;
    protected BigInteger _numberBigInt;
    protected double _numberDouble;
    protected int _numberInt;
    protected long _numberLong;
    protected boolean _numberNegative;
    protected JsonReadContext _parsingContext;
    protected final TextBuffer _textBuffer;
    protected int _tokenInputCol;
    protected int _tokenInputRow = 1;
    protected long _tokenInputTotal;

    protected ParserBase(IOContext iOContext, int i) {
        super(i);
        this._ioContext = iOContext;
        this._textBuffer = iOContext.constructTextBuffer();
        this._parsingContext = new JsonReadContext(null, JsonParser.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i) ? DupDetector.rootDetector(this) : null, 0, 1, 0);
    }

    protected static int[] growArrayBy(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return Arrays.copyOf(iArr, iArr.length + i);
    }

    /* access modifiers changed from: protected */
    public void _checkStdFeatureChanges(int i, int i2) {
        int mask = JsonParser.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        if ((i2 & mask) != 0 && (i & mask) != 0) {
            if (this._parsingContext.getDupDetector() == null) {
                JsonReadContext jsonReadContext = this._parsingContext;
                jsonReadContext.withDupDetector(DupDetector.rootDetector(this));
                this._parsingContext = jsonReadContext;
                return;
            }
            JsonReadContext jsonReadContext2 = this._parsingContext;
            jsonReadContext2.withDupDetector(null);
            this._parsingContext = jsonReadContext2;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void _closeInput();

    /* access modifiers changed from: protected */
    public final int _decodeBase64Escape(Base64Variant base64Variant, int i, int i2) {
        if (i == 92) {
            char _decodeEscaped = _decodeEscaped();
            if (_decodeEscaped <= ' ' && i2 == 0) {
                return -1;
            }
            int decodeBase64Char = base64Variant.decodeBase64Char((int) _decodeEscaped);
            if (decodeBase64Char >= 0 || decodeBase64Char == -2) {
                return decodeBase64Char;
            }
            throw reportInvalidBase64Char(base64Variant, _decodeEscaped, i2, null);
        }
        throw reportInvalidBase64Char(base64Variant, i, i2, null);
    }

    /* access modifiers changed from: protected */
    public abstract char _decodeEscaped();

    /* access modifiers changed from: protected */
    public final int _eofAsNextChar() {
        _handleEOF();
        return -1;
    }

    public ByteArrayBuilder _getByteArrayBuilder() {
        ByteArrayBuilder byteArrayBuilder = this._byteArrayBuilder;
        if (byteArrayBuilder == null) {
            this._byteArrayBuilder = new ByteArrayBuilder(null, 500);
        } else {
            byteArrayBuilder.reset();
        }
        return this._byteArrayBuilder;
    }

    /* access modifiers changed from: protected */
    public Object _getSourceReference() {
        if (JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION.enabledIn(this._features)) {
            return this._ioContext.getSourceReference();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void _handleBase64MissingPadding(Base64Variant base64Variant) {
        throw _constructError(base64Variant.missingPaddingMessage());
    }

    /* access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
    public void _handleEOF() {
        if (!this._parsingContext.inRoot()) {
            _reportInvalidEOF(String.format(": expected close marker for %s (start marker at %s)", this._parsingContext.inArray() ? "Array" : "Object", this._parsingContext.getStartLocation(_getSourceReference())), null);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public int _parseIntValue() {
        if (this._currToken != JsonToken.VALUE_NUMBER_INT || this._intLength > 9) {
            _parseNumericValue(1);
            if ((this._numTypesValid & 1) == 0) {
                convertNumberToInt();
            }
            return this._numberInt;
        }
        int contentsAsInt = this._textBuffer.contentsAsInt(this._numberNegative);
        this._numberInt = contentsAsInt;
        this._numTypesValid = 1;
        return contentsAsInt;
    }

    /* access modifiers changed from: protected */
    public void _parseNumericValue(int i) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
            int i2 = this._intLength;
            if (i2 <= 9) {
                this._numberInt = this._textBuffer.contentsAsInt(this._numberNegative);
                this._numTypesValid = 1;
            } else if (i2 <= 18) {
                long contentsAsLong = this._textBuffer.contentsAsLong(this._numberNegative);
                if (i2 == 10) {
                    if (this._numberNegative) {
                        if (contentsAsLong >= -2147483648L) {
                            this._numberInt = (int) contentsAsLong;
                            this._numTypesValid = 1;
                            return;
                        }
                    } else if (contentsAsLong <= 2147483647L) {
                        this._numberInt = (int) contentsAsLong;
                        this._numTypesValid = 1;
                        return;
                    }
                }
                this._numberLong = contentsAsLong;
                this._numTypesValid = 2;
            } else {
                String contentsAsString = this._textBuffer.contentsAsString();
                try {
                    int i3 = this._intLength;
                    char[] textBuffer = this._textBuffer.getTextBuffer();
                    int textOffset = this._textBuffer.getTextOffset();
                    boolean z = this._numberNegative;
                    if (z) {
                        textOffset++;
                    }
                    if (NumberInput.inLongRange(textBuffer, textOffset, i3, z)) {
                        this._numberLong = Long.parseLong(contentsAsString);
                        this._numTypesValid = 2;
                        return;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 8) {
                                if (i != 32) {
                                    this._numberBigInt = new BigInteger(contentsAsString);
                                    this._numTypesValid = 4;
                                    return;
                                }
                            }
                            this._numberDouble = NumberInput.parseDouble(contentsAsString);
                            this._numTypesValid = 8;
                            return;
                        }
                    }
                    _reportError("Numeric value (%s) out of range of %s", _longIntegerDesc(contentsAsString), i == 2 ? Constants.LONG : "int");
                    throw null;
                } catch (NumberFormatException e) {
                    throw new JsonParseException(this, je.I0(je.V0("Malformed numeric value ("), _longNumberDesc(contentsAsString), ")"), e);
                }
            }
        } else if (jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            _reportError("Current token (%s) not numeric, can not use numeric value accessors", jsonToken);
            throw null;
        } else if (i == 16) {
            try {
                this._numberBigDecimal = this._textBuffer.contentsAsDecimal();
                this._numTypesValid = 16;
            } catch (NumberFormatException e2) {
                throw new JsonParseException(this, je.I0(je.V0("Malformed numeric value ("), _longNumberDesc(this._textBuffer.contentsAsString()), ")"), e2);
            }
        } else {
            this._numberDouble = NumberInput.parseDouble(this._textBuffer.contentsAsString());
            this._numTypesValid = 8;
        }
    }

    /* access modifiers changed from: protected */
    public void _releaseBuffers() {
        this._textBuffer.releaseBuffers();
        char[] cArr = this._nameCopyBuffer;
        if (cArr != null) {
            this._nameCopyBuffer = null;
            this._ioContext.releaseNameCopyBuffer(cArr);
        }
    }

    /* access modifiers changed from: protected */
    public void _reportMismatchedEndMarker(int i, char c) {
        JsonReadContext jsonReadContext = this._parsingContext;
        throw _constructError(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", Character.valueOf((char) i), Character.valueOf(c), jsonReadContext.typeDesc(), jsonReadContext.getStartLocation(_getSourceReference())));
    }

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this._closed) {
            this._inputPtr = Math.max(this._inputPtr, this._inputEnd);
            this._closed = true;
            try {
                _closeInput();
            } finally {
                _releaseBuffers();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void convertNumberToInt() {
        int i = this._numTypesValid;
        if ((i & 2) != 0) {
            long j = this._numberLong;
            int i2 = (int) j;
            if (((long) i2) == j) {
                this._numberInt = i2;
            } else {
                StringBuilder V0 = je.V0("Numeric value (");
                V0.append(getText());
                V0.append(") out of range of int");
                throw _constructError(V0.toString());
            }
        } else if ((i & 4) != 0) {
            if (ParserMinimalBase.BI_MIN_INT.compareTo(this._numberBigInt) > 0 || ParserMinimalBase.BI_MAX_INT.compareTo(this._numberBigInt) < 0) {
                reportOverflowInt();
                throw null;
            }
            this._numberInt = this._numberBigInt.intValue();
        } else if ((i & 8) != 0) {
            double d = this._numberDouble;
            if (d < -2.147483648E9d || d > 2.147483647E9d) {
                reportOverflowInt();
                throw null;
            }
            this._numberInt = (int) d;
        } else if ((i & 16) == 0) {
            VersionUtil.throwInternal();
            throw null;
        } else if (ParserMinimalBase.BD_MIN_INT.compareTo(this._numberBigDecimal) > 0 || ParserMinimalBase.BD_MAX_INT.compareTo(this._numberBigDecimal) < 0) {
            reportOverflowInt();
            throw null;
        } else {
            this._numberInt = this._numberBigDecimal.intValue();
        }
        this._numTypesValid |= 1;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigInteger getBigIntegerValue() {
        int i = this._numTypesValid;
        if ((i & 4) == 0) {
            if (i == 0) {
                _parseNumericValue(4);
            }
            int i2 = this._numTypesValid;
            if ((i2 & 4) == 0) {
                if ((i2 & 16) != 0) {
                    this._numberBigInt = this._numberBigDecimal.toBigInteger();
                } else if ((i2 & 2) != 0) {
                    this._numberBigInt = BigInteger.valueOf(this._numberLong);
                } else if ((i2 & 1) != 0) {
                    this._numberBigInt = BigInteger.valueOf((long) this._numberInt);
                } else if ((i2 & 8) != 0) {
                    this._numberBigInt = BigDecimal.valueOf(this._numberDouble).toBigInteger();
                } else {
                    VersionUtil.throwInternal();
                    throw null;
                }
                this._numTypesValid |= 4;
            }
        }
        return this._numberBigInt;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String getCurrentName() {
        JsonReadContext parent;
        JsonToken jsonToken = this._currToken;
        if ((jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) && (parent = this._parsingContext.mo10getParent()) != null) {
            return parent.getCurrentName();
        }
        return this._parsingContext.getCurrentName();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigDecimal getDecimalValue() {
        int i = this._numTypesValid;
        if ((i & 16) == 0) {
            if (i == 0) {
                _parseNumericValue(16);
            }
            int i2 = this._numTypesValid;
            if ((i2 & 16) == 0) {
                if ((i2 & 8) != 0) {
                    this._numberBigDecimal = NumberInput.parseBigDecimal(getText());
                } else if ((i2 & 4) != 0) {
                    this._numberBigDecimal = new BigDecimal(this._numberBigInt);
                } else if ((i2 & 2) != 0) {
                    this._numberBigDecimal = BigDecimal.valueOf(this._numberLong);
                } else if ((i2 & 1) != 0) {
                    this._numberBigDecimal = BigDecimal.valueOf((long) this._numberInt);
                } else {
                    VersionUtil.throwInternal();
                    throw null;
                }
                this._numTypesValid |= 16;
            }
        }
        return this._numberBigDecimal;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double getDoubleValue() {
        int i = this._numTypesValid;
        if ((i & 8) == 0) {
            if (i == 0) {
                _parseNumericValue(8);
            }
            int i2 = this._numTypesValid;
            if ((i2 & 8) == 0) {
                if ((i2 & 16) != 0) {
                    this._numberDouble = this._numberBigDecimal.doubleValue();
                } else if ((i2 & 4) != 0) {
                    this._numberDouble = this._numberBigInt.doubleValue();
                } else if ((i2 & 2) != 0) {
                    this._numberDouble = (double) this._numberLong;
                } else if ((i2 & 1) != 0) {
                    this._numberDouble = (double) this._numberInt;
                } else {
                    VersionUtil.throwInternal();
                    throw null;
                }
                this._numTypesValid |= 8;
            }
        }
        return this._numberDouble;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public float getFloatValue() {
        return (float) getDoubleValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getIntValue() {
        int i = this._numTypesValid;
        if ((i & 1) == 0) {
            if (i == 0) {
                return _parseIntValue();
            }
            if ((i & 1) == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long getLongValue() {
        int i = this._numTypesValid;
        if ((i & 2) == 0) {
            if (i == 0) {
                _parseNumericValue(2);
            }
            int i2 = this._numTypesValid;
            if ((i2 & 2) == 0) {
                if ((i2 & 1) != 0) {
                    this._numberLong = (long) this._numberInt;
                } else if ((i2 & 4) != 0) {
                    if (ParserMinimalBase.BI_MIN_LONG.compareTo(this._numberBigInt) > 0 || ParserMinimalBase.BI_MAX_LONG.compareTo(this._numberBigInt) < 0) {
                        reportOverflowLong();
                        throw null;
                    }
                    this._numberLong = this._numberBigInt.longValue();
                } else if ((i2 & 8) != 0) {
                    double d = this._numberDouble;
                    if (d < -9.223372036854776E18d || d > 9.223372036854776E18d) {
                        reportOverflowLong();
                        throw null;
                    }
                    this._numberLong = (long) d;
                } else if ((i2 & 16) == 0) {
                    VersionUtil.throwInternal();
                    throw null;
                } else if (ParserMinimalBase.BD_MIN_LONG.compareTo(this._numberBigDecimal) > 0 || ParserMinimalBase.BD_MAX_LONG.compareTo(this._numberBigDecimal) < 0) {
                    reportOverflowLong();
                    throw null;
                } else {
                    this._numberLong = this._numberBigDecimal.longValue();
                }
                this._numTypesValid |= 2;
            }
        }
        return this._numberLong;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType getNumberType() {
        if (this._numTypesValid == 0) {
            _parseNumericValue(0);
        }
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            int i = this._numTypesValid;
            if ((i & 1) != 0) {
                return JsonParser.NumberType.INT;
            }
            if ((i & 2) != 0) {
                return JsonParser.NumberType.LONG;
            }
            return JsonParser.NumberType.BIG_INTEGER;
        } else if ((this._numTypesValid & 16) != 0) {
            return JsonParser.NumberType.BIG_DECIMAL;
        } else {
            return JsonParser.NumberType.DOUBLE;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number getNumberValue() {
        if (this._numTypesValid == 0) {
            _parseNumericValue(0);
        }
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            int i = this._numTypesValid;
            if ((i & 1) != 0) {
                return Integer.valueOf(this._numberInt);
            }
            if ((i & 2) != 0) {
                return Long.valueOf(this._numberLong);
            }
            if ((i & 4) != 0) {
                return this._numberBigInt;
            }
            return this._numberBigDecimal;
        }
        int i2 = this._numTypesValid;
        if ((i2 & 16) != 0) {
            return this._numberBigDecimal;
        }
        if ((i2 & 8) != 0) {
            return Double.valueOf(this._numberDouble);
        }
        VersionUtil.throwInternal();
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonStreamContext getParsingContext() {
        return this._parsingContext;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean hasTextCharacters() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return true;
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this._nameCopied;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean isNaN() {
        if (this._currToken != JsonToken.VALUE_NUMBER_FLOAT || (this._numTypesValid & 8) == 0) {
            return false;
        }
        double d = this._numberDouble;
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            return true;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser overrideStdFeatures(int i, int i2) {
        int i3 = this._features;
        int i4 = (i & i2) | ((i2 ^ -1) & i3);
        int i5 = i3 ^ i4;
        if (i5 != 0) {
            this._features = i4;
            _checkStdFeatureChanges(i4, i5);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public IllegalArgumentException reportInvalidBase64Char(Base64Variant base64Variant, int i, int i2, String str) {
        String str2;
        if (i <= 32) {
            str2 = String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", Integer.toHexString(i), Integer.valueOf(i2 + 1));
        } else if (base64Variant.usesPaddingChar(i)) {
            StringBuilder V0 = je.V0("Unexpected padding character ('");
            V0.append(base64Variant.getPaddingChar());
            V0.append("') as character #");
            V0.append(i2 + 1);
            V0.append(" of 4-char base64 unit: padding only legal as 3rd or 4th character");
            str2 = V0.toString();
        } else if (!Character.isDefined(i) || Character.isISOControl(i)) {
            StringBuilder V02 = je.V0("Illegal character (code 0x");
            V02.append(Integer.toHexString(i));
            V02.append(") in base64 content");
            str2 = V02.toString();
        } else {
            StringBuilder V03 = je.V0("Illegal character '");
            V03.append((char) i);
            V03.append("' (code 0x");
            V03.append(Integer.toHexString(i));
            V03.append(") in base64 content");
            str2 = V03.toString();
        }
        if (str != null) {
            str2 = je.y0(str2, ": ", str);
        }
        return new IllegalArgumentException(str2);
    }

    /* access modifiers changed from: protected */
    public final JsonToken reset(boolean z, int i, int i2, int i3) {
        if (i2 >= 1 || i3 >= 1) {
            this._numberNegative = z;
            this._intLength = i;
            this._numTypesValid = 0;
            return JsonToken.VALUE_NUMBER_FLOAT;
        }
        this._numberNegative = z;
        this._intLength = i;
        this._numTypesValid = 0;
        return JsonToken.VALUE_NUMBER_INT;
    }

    /* access modifiers changed from: protected */
    public final JsonToken resetAsNaN(String str, double d) {
        this._textBuffer.resetWithString(str);
        this._numberDouble = d;
        this._numTypesValid = 8;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    /* access modifiers changed from: protected */
    public final JsonToken resetFloat(boolean z, int i, int i2, int i3) {
        this._numberNegative = z;
        this._intLength = i;
        this._numTypesValid = 0;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    /* access modifiers changed from: protected */
    public final JsonToken resetInt(boolean z, int i) {
        this._numberNegative = z;
        this._intLength = i;
        this._numTypesValid = 0;
        return JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void setCurrentValue(Object obj) {
        this._parsingContext.setCurrentValue(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public JsonParser setFeatureMask(int i) {
        int i2 = this._features ^ i;
        if (i2 != 0) {
            this._features = i;
            _checkStdFeatureChanges(i, i2);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public final int _decodeBase64Escape(Base64Variant base64Variant, char c, int i) {
        if (c == '\\') {
            char _decodeEscaped = _decodeEscaped();
            if (_decodeEscaped <= ' ' && i == 0) {
                return -1;
            }
            int decodeBase64Char = base64Variant.decodeBase64Char(_decodeEscaped);
            if (decodeBase64Char >= 0 || (decodeBase64Char == -2 && i >= 2)) {
                return decodeBase64Char;
            }
            throw reportInvalidBase64Char(base64Variant, _decodeEscaped, i, null);
        }
        throw reportInvalidBase64Char(base64Variant, c, i, null);
    }
}
