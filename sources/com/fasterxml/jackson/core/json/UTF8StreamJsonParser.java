package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class UTF8StreamJsonParser extends ParserBase {
    protected static final int FEAT_MASK_TRAILING_COMMA = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    protected static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();
    private static final int[] _icUTF8 = CharTypes.getInputCodeUtf8();
    protected boolean _bufferRecyclable;
    protected byte[] _inputBuffer;
    protected InputStream _inputStream;
    protected int _nameStartCol;
    protected int _nameStartOffset;
    protected int _nameStartRow;
    protected ObjectCodec _objectCodec;
    private int _quad1;
    protected int[] _quadBuffer = new int[16];
    protected final ByteQuadsCanonicalizer _symbols;
    protected boolean _tokenIncomplete;

    public UTF8StreamJsonParser(IOContext iOContext, int i, InputStream inputStream, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, byte[] bArr, int i2, int i3, boolean z) {
        super(iOContext, i);
        this._inputStream = inputStream;
        this._objectCodec = objectCodec;
        this._symbols = byteQuadsCanonicalizer;
        this._inputBuffer = bArr;
        this._inputPtr = i2;
        this._inputEnd = i3;
        this._currInputRowStart = i2;
        this._currInputProcessed = (long) (-i2);
        this._bufferRecyclable = z;
    }

    private final void _checkMatchEnd(String str, int i, int i2) {
        if (Character.isJavaIdentifierPart((char) _decodeCharForError(i2))) {
            _reportInvalidToken(str.substring(0, i));
            throw null;
        }
    }

    private final void _closeArrayScope() {
        _updateLocation();
        if (this._parsingContext.inArray()) {
            this._parsingContext = this._parsingContext.clearAndGetParent();
        } else {
            _reportMismatchedEndMarker(93, '}');
            throw null;
        }
    }

    private final void _closeObjectScope() {
        _updateLocation();
        if (this._parsingContext.inObject()) {
            this._parsingContext = this._parsingContext.clearAndGetParent();
        } else {
            _reportMismatchedEndMarker(125, ']');
            throw null;
        }
    }

    private final int _decodeUtf8_2(int i) {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        byte b = bArr[i2];
        if ((b & 192) == 128) {
            return ((i & 31) << 6) | (b & 63);
        }
        _reportInvalidOther(b & 255, i3);
        throw null;
    }

    private final int _decodeUtf8_3(int i) {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        int i2 = i & 15;
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        byte b = bArr[i3];
        if ((b & 192) == 128) {
            int i5 = (i2 << 6) | (b & 63);
            if (i4 >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i6 = this._inputPtr;
            int i7 = i6 + 1;
            this._inputPtr = i7;
            byte b2 = bArr2[i6];
            if ((b2 & 192) == 128) {
                return (i5 << 6) | (b2 & 63);
            }
            _reportInvalidOther(b2 & 255, i7);
            throw null;
        }
        _reportInvalidOther(b & 255, i4);
        throw null;
    }

    private final int _decodeUtf8_3fast(int i) {
        int i2 = i & 15;
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        byte b = bArr[i3];
        if ((b & 192) == 128) {
            int i5 = (i2 << 6) | (b & 63);
            int i6 = i4 + 1;
            this._inputPtr = i6;
            byte b2 = bArr[i4];
            if ((b2 & 192) == 128) {
                return (i5 << 6) | (b2 & 63);
            }
            _reportInvalidOther(b2 & 255, i6);
            throw null;
        }
        _reportInvalidOther(b & 255, i4);
        throw null;
    }

    private final int _decodeUtf8_4(int i) {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        byte b = bArr[i2];
        if ((b & 192) == 128) {
            int i4 = ((i & 7) << 6) | (b & 63);
            if (i3 >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i5 = this._inputPtr;
            int i6 = i5 + 1;
            this._inputPtr = i6;
            byte b2 = bArr2[i5];
            if ((b2 & 192) == 128) {
                int i7 = (i4 << 6) | (b2 & 63);
                if (i6 >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i8 = this._inputPtr;
                int i9 = i8 + 1;
                this._inputPtr = i9;
                byte b3 = bArr3[i8];
                if ((b3 & 192) == 128) {
                    return ((i7 << 6) | (b3 & 63)) - 65536;
                }
                _reportInvalidOther(b3 & 255, i9);
                throw null;
            }
            _reportInvalidOther(b2 & 255, i6);
            throw null;
        }
        _reportInvalidOther(b & 255, i3);
        throw null;
    }

    private final void _finishString2(char[] cArr, int i) {
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i2 = this._inputPtr;
            if (i2 >= this._inputEnd) {
                _loadMoreGuaranteed();
                i2 = this._inputPtr;
            }
            int i3 = 0;
            if (i >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            int min = Math.min(this._inputEnd, (cArr.length - i) + i2);
            while (true) {
                if (i2 >= min) {
                    this._inputPtr = i2;
                    break;
                }
                int i4 = i2 + 1;
                int i5 = bArr[i2] & 255;
                if (iArr[i5] != 0) {
                    this._inputPtr = i4;
                    if (i5 == 34) {
                        this._textBuffer.setCurrentLength(i);
                        return;
                    }
                    int i6 = iArr[i5];
                    if (i6 == 1) {
                        i5 = _decodeEscaped();
                    } else if (i6 == 2) {
                        i5 = _decodeUtf8_2(i5);
                    } else if (i6 != 3) {
                        if (i6 == 4) {
                            int _decodeUtf8_4 = _decodeUtf8_4(i5);
                            int i7 = i + 1;
                            cArr[i] = (char) (55296 | (_decodeUtf8_4 >> 10));
                            if (i7 >= cArr.length) {
                                cArr = this._textBuffer.finishCurrentSegment();
                                i = 0;
                            } else {
                                i = i7;
                            }
                            i5 = (_decodeUtf8_4 & 1023) | 56320;
                        } else if (i5 < 32) {
                            _throwUnquotedSpace(i5, "string value");
                        } else {
                            _reportInvalidChar(i5);
                            throw null;
                        }
                    } else if (this._inputEnd - i4 >= 2) {
                        i5 = _decodeUtf8_3fast(i5);
                    } else {
                        i5 = _decodeUtf8_3(i5);
                    }
                    if (i >= cArr.length) {
                        cArr = this._textBuffer.finishCurrentSegment();
                    } else {
                        i3 = i;
                    }
                    i = i3 + 1;
                    cArr[i3] = (char) i5;
                } else {
                    cArr[i] = (char) i5;
                    i2 = i4;
                    i++;
                }
            }
        }
    }

    private final void _matchToken2(String str, int i) {
        int i2;
        int i3;
        int length = str.length();
        do {
            if ((this._inputPtr < this._inputEnd || _loadMore()) && this._inputBuffer[this._inputPtr] == str.charAt(i)) {
                i2 = this._inputPtr + 1;
                this._inputPtr = i2;
                i++;
            } else {
                _reportInvalidToken(str.substring(0, i));
                throw null;
            }
        } while (i < length);
        if ((i2 < this._inputEnd || _loadMore()) && (i3 = this._inputBuffer[this._inputPtr] & 255) >= 48 && i3 != 93 && i3 != 125) {
            _checkMatchEnd(str, i, i3);
        }
    }

    private final JsonToken _nextAfterName() {
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        this._currToken = jsonToken;
        return jsonToken;
    }

    private final JsonToken _nextTokenNotInObject(int i) {
        if (i == 34) {
            this._tokenIncomplete = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this._currToken = jsonToken;
            return jsonToken;
        } else if (i == 45) {
            JsonToken _parseNegNumber = _parseNegNumber();
            this._currToken = _parseNegNumber;
            return _parseNegNumber;
        } else if (i == 91) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this._currToken = jsonToken2;
            return jsonToken2;
        } else if (i == 102) {
            _matchFalse();
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this._currToken = jsonToken3;
            return jsonToken3;
        } else if (i == 110) {
            _matchNull();
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this._currToken = jsonToken4;
            return jsonToken4;
        } else if (i == 116) {
            _matchTrue();
            JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
            this._currToken = jsonToken5;
            return jsonToken5;
        } else if (i != 123) {
            switch (i) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    JsonToken _parsePosNumber = _parsePosNumber(i);
                    this._currToken = _parsePosNumber;
                    return _parsePosNumber;
                default:
                    JsonToken _handleUnexpectedValue = _handleUnexpectedValue(i);
                    this._currToken = _handleUnexpectedValue;
                    return _handleUnexpectedValue;
            }
        } else {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken6 = JsonToken.START_OBJECT;
            this._currToken = jsonToken6;
            return jsonToken6;
        }
    }

    private static final int _padLastQuad(int i, int i2) {
        return i2 == 4 ? i : i | (-1 << (i2 << 3));
    }

    private final JsonToken _parseFloat(char[] cArr, int i, int i2, boolean z, int i3) {
        boolean z2;
        int i4;
        int i5 = 0;
        if (i2 == 46) {
            if (i >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            cArr[i] = (char) i2;
            i++;
            i4 = 0;
            while (true) {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this._inputBuffer;
                int i6 = this._inputPtr;
                this._inputPtr = i6 + 1;
                i2 = bArr[i6] & 255;
                if (i2 < 48 || i2 > 57) {
                    break;
                }
                i4++;
                if (i >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i = 0;
                }
                cArr[i] = (char) i2;
                i++;
            }
            z2 = false;
            if (i4 == 0) {
                reportUnexpectedNumberChar(i2, "Decimal point not followed by a digit");
                throw null;
            }
        } else {
            i4 = 0;
            z2 = false;
        }
        if (i2 == 101 || i2 == 69) {
            if (i >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            int i7 = i + 1;
            cArr[i] = (char) i2;
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i8 = this._inputPtr;
            this._inputPtr = i8 + 1;
            int i9 = bArr2[i8] & 255;
            if (i9 == 45 || i9 == 43) {
                if (i7 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i7 = 0;
                }
                int i10 = i7 + 1;
                cArr[i7] = (char) i9;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i11 = this._inputPtr;
                this._inputPtr = i11 + 1;
                i9 = bArr3[i11] & 255;
                i7 = i10;
            }
            i2 = i9;
            int i12 = 0;
            while (true) {
                if (i2 >= 48 && i2 <= 57) {
                    i12++;
                    if (i7 >= cArr.length) {
                        cArr = this._textBuffer.finishCurrentSegment();
                        i7 = 0;
                    }
                    int i13 = i7 + 1;
                    cArr[i7] = (char) i2;
                    if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                        i5 = i12;
                        i = i13;
                        z2 = true;
                        break;
                    }
                    byte[] bArr4 = this._inputBuffer;
                    int i14 = this._inputPtr;
                    this._inputPtr = i14 + 1;
                    i2 = bArr4[i14] & 255;
                    i7 = i13;
                } else {
                    break;
                }
            }
            i5 = i12;
            i = i7;
            if (i5 == 0) {
                reportUnexpectedNumberChar(i2, "Exponent indicator not followed by a digit");
                throw null;
            }
        }
        if (!z2) {
            this._inputPtr--;
            if (this._parsingContext.inRoot()) {
                _verifyRootSpace(i2);
            }
        }
        this._textBuffer.setCurrentLength(i);
        return resetFloat(z, i3, i4, i5);
    }

    private final JsonToken _parseNumber2(char[] cArr, int i, boolean z, int i2) {
        int i3;
        int i4;
        char[] cArr2 = cArr;
        int i5 = i;
        int i6 = i2;
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i7 = this._inputPtr;
                i3 = i7 + 1;
                this._inputPtr = i3;
                i4 = bArr[i7] & 255;
                if (i4 > 57 || i4 < 48) {
                    break;
                }
                if (i5 >= cArr2.length) {
                    i5 = 0;
                    cArr2 = this._textBuffer.finishCurrentSegment();
                }
                cArr2[i5] = (char) i4;
                i6++;
                i5++;
            } else {
                this._textBuffer.setCurrentLength(i5);
                return resetInt(z, i6);
            }
        }
        if (i4 == 46 || i4 == 101 || i4 == 69) {
            return _parseFloat(cArr2, i5, i4, z, i6);
        }
        this._inputPtr = i3 - 1;
        this._textBuffer.setCurrentLength(i5);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace(this._inputBuffer[this._inputPtr] & 255);
        }
        return resetInt(z, i6);
    }

    private final int _skipColon() {
        int i = this._inputPtr;
        if (i + 4 >= this._inputEnd) {
            return _skipColon2(false);
        }
        byte[] bArr = this._inputBuffer;
        byte b = bArr[i];
        if (b == 58) {
            int i2 = i + 1;
            this._inputPtr = i2;
            byte b2 = bArr[i2];
            if (b2 <= 32) {
                if (b2 == 32 || b2 == 9) {
                    int i3 = i2 + 1;
                    this._inputPtr = i3;
                    byte b3 = bArr[i3];
                    if (b3 > 32) {
                        if (b3 == 47 || b3 == 35) {
                            return _skipColon2(true);
                        }
                        this._inputPtr = i3 + 1;
                        return b3;
                    }
                }
                return _skipColon2(true);
            } else if (b2 == 47 || b2 == 35) {
                return _skipColon2(true);
            } else {
                this._inputPtr = i2 + 1;
                return b2;
            }
        } else {
            if (b == 32 || b == 9) {
                int i4 = i + 1;
                this._inputPtr = i4;
                b = bArr[i4];
            }
            if (b != 58) {
                return _skipColon2(false);
            }
            int i5 = this._inputPtr + 1;
            this._inputPtr = i5;
            byte b4 = bArr[i5];
            if (b4 <= 32) {
                if (b4 == 32 || b4 == 9) {
                    int i6 = i5 + 1;
                    this._inputPtr = i6;
                    byte b5 = bArr[i6];
                    if (b5 > 32) {
                        if (b5 == 47 || b5 == 35) {
                            return _skipColon2(true);
                        }
                        this._inputPtr = i6 + 1;
                        return b5;
                    }
                }
                return _skipColon2(true);
            } else if (b4 == 47 || b4 == 35) {
                return _skipColon2(true);
            } else {
                this._inputPtr = i5 + 1;
                return b4;
            }
        }
    }

    private final int _skipColon2(boolean z) {
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i = this._inputPtr;
                int i2 = i + 1;
                this._inputPtr = i2;
                int i3 = bArr[i] & 255;
                if (i3 > 32) {
                    if (i3 == 47) {
                        _skipComment();
                    } else if (i3 != 35 || !_skipYAMLComment()) {
                        if (z) {
                            return i3;
                        }
                        if (i3 == 58) {
                            z = true;
                        } else {
                            _reportUnexpectedChar(i3, "was expecting a colon to separate field name and value");
                            throw null;
                        }
                    }
                } else if (i3 == 32) {
                    continue;
                } else if (i3 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i2;
                } else if (i3 == 13) {
                    _skipCR();
                } else if (i3 != 9) {
                    _throwInvalidSpace(i3);
                    throw null;
                }
            } else {
                StringBuilder V0 = je.V0(" within/between ");
                V0.append(this._parsingContext.typeDesc());
                V0.append(" entries");
                _reportInvalidEOF(V0.toString(), null);
                throw null;
            }
        }
    }

    private final void _skipComment() {
        if (!isEnabled(JsonParser.Feature.ALLOW_COMMENTS)) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
            throw null;
        } else if (this._inputPtr < this._inputEnd || _loadMore()) {
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            int i2 = bArr[i] & 255;
            if (i2 == 47) {
                _skipLine();
            } else if (i2 == 42) {
                int[] inputCodeComment = CharTypes.getInputCodeComment();
                while (true) {
                    if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                        break;
                    }
                    byte[] bArr2 = this._inputBuffer;
                    int i3 = this._inputPtr;
                    int i4 = i3 + 1;
                    this._inputPtr = i4;
                    int i5 = bArr2[i3] & 255;
                    int i6 = inputCodeComment[i5];
                    if (i6 != 0) {
                        if (i6 == 2) {
                            _skipUtf8_2();
                        } else if (i6 == 3) {
                            _skipUtf8_3();
                        } else if (i6 == 4) {
                            _skipUtf8_4();
                        } else if (i6 == 10) {
                            this._currInputRow++;
                            this._currInputRowStart = i4;
                        } else if (i6 == 13) {
                            _skipCR();
                        } else if (i6 == 42) {
                            if (i4 >= this._inputEnd && !_loadMore()) {
                                break;
                            }
                            byte[] bArr3 = this._inputBuffer;
                            int i7 = this._inputPtr;
                            if (bArr3[i7] == 47) {
                                this._inputPtr = i7 + 1;
                                return;
                            }
                        } else {
                            _reportInvalidChar(i5);
                            throw null;
                        }
                    }
                }
                _reportInvalidEOF(" in a comment", null);
                throw null;
            } else {
                _reportUnexpectedChar(i2, "was expecting either '*' or '/' for a comment");
                throw null;
            }
        } else {
            _reportInvalidEOF(" in a comment", null);
            throw null;
        }
    }

    private final void _skipLine() {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i = this._inputPtr;
                int i2 = i + 1;
                this._inputPtr = i2;
                int i3 = bArr[i] & 255;
                int i4 = inputCodeComment[i3];
                if (i4 != 0) {
                    if (i4 == 2) {
                        _skipUtf8_2();
                    } else if (i4 == 3) {
                        _skipUtf8_3();
                    } else if (i4 == 4) {
                        _skipUtf8_4();
                    } else if (i4 == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = i2;
                        return;
                    } else if (i4 == 13) {
                        _skipCR();
                        return;
                    } else if (i4 != 42 && i4 < 0) {
                        _reportInvalidChar(i3);
                        throw null;
                    }
                }
            } else {
                return;
            }
        }
    }

    private final void _skipUtf8_2() {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        int i2 = i + 1;
        this._inputPtr = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, i2);
            throw null;
        }
    }

    private final void _skipUtf8_3() {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        int i2 = i + 1;
        this._inputPtr = i2;
        byte b = bArr[i];
        if ((b & 192) == 128) {
            if (i2 >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i3 = this._inputPtr;
            int i4 = i3 + 1;
            this._inputPtr = i4;
            byte b2 = bArr2[i3];
            if ((b2 & 192) != 128) {
                _reportInvalidOther(b2 & 255, i4);
                throw null;
            }
            return;
        }
        _reportInvalidOther(b & 255, i2);
        throw null;
    }

    private final void _skipUtf8_4() {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        int i2 = i + 1;
        this._inputPtr = i2;
        byte b = bArr[i];
        if ((b & 192) == 128) {
            if (i2 >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i3 = this._inputPtr;
            int i4 = i3 + 1;
            this._inputPtr = i4;
            byte b2 = bArr2[i3];
            if ((b2 & 192) == 128) {
                if (i4 >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i5 = this._inputPtr;
                int i6 = i5 + 1;
                this._inputPtr = i6;
                byte b3 = bArr3[i5];
                if ((b3 & 192) != 128) {
                    _reportInvalidOther(b3 & 255, i6);
                    throw null;
                }
                return;
            }
            _reportInvalidOther(b2 & 255, i4);
            throw null;
        }
        _reportInvalidOther(b & 255, i2);
        throw null;
    }

    private final int _skipWS() {
        while (true) {
            int i = this._inputPtr;
            if (i >= this._inputEnd) {
                return _skipWS2();
            }
            byte[] bArr = this._inputBuffer;
            int i2 = i + 1;
            this._inputPtr = i2;
            int i3 = bArr[i] & 255;
            if (i3 > 32) {
                if (i3 != 47 && i3 != 35) {
                    return i3;
                }
                this._inputPtr = i2 - 1;
                return _skipWS2();
            } else if (i3 != 32) {
                if (i3 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i2;
                } else if (i3 == 13) {
                    _skipCR();
                } else if (i3 != 9) {
                    _throwInvalidSpace(i3);
                    throw null;
                }
            }
        }
    }

    private final int _skipWS2() {
        int i;
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i2 = this._inputPtr;
                int i3 = i2 + 1;
                this._inputPtr = i3;
                i = bArr[i2] & 255;
                if (i > 32) {
                    if (i == 47) {
                        _skipComment();
                    } else if (i != 35 || !_skipYAMLComment()) {
                        break;
                    }
                } else if (i == 32) {
                    continue;
                } else if (i == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (i == 13) {
                    _skipCR();
                } else if (i != 9) {
                    _throwInvalidSpace(i);
                    throw null;
                }
            } else {
                StringBuilder V0 = je.V0("Unexpected end-of-input within/between ");
                V0.append(this._parsingContext.typeDesc());
                V0.append(" entries");
                throw _constructError(V0.toString());
            }
        }
        return i;
    }

    private final int _skipWSOrEnd() {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            int i2 = i + 1;
            this._inputPtr = i2;
            int i3 = bArr[i] & 255;
            if (i3 <= 32) {
                if (i3 != 32) {
                    if (i3 == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = i2;
                    } else if (i3 == 13) {
                        _skipCR();
                    } else if (i3 != 9) {
                        _throwInvalidSpace(i3);
                        throw null;
                    }
                }
                while (true) {
                    int i4 = this._inputPtr;
                    if (i4 >= this._inputEnd) {
                        return _skipWSOrEnd2();
                    }
                    byte[] bArr2 = this._inputBuffer;
                    int i5 = i4 + 1;
                    this._inputPtr = i5;
                    int i6 = bArr2[i4] & 255;
                    if (i6 > 32) {
                        if (i6 != 47 && i6 != 35) {
                            return i6;
                        }
                        this._inputPtr = i5 - 1;
                        return _skipWSOrEnd2();
                    } else if (i6 != 32) {
                        if (i6 == 10) {
                            this._currInputRow++;
                            this._currInputRowStart = i5;
                        } else if (i6 == 13) {
                            _skipCR();
                        } else if (i6 != 9) {
                            _throwInvalidSpace(i6);
                            throw null;
                        }
                    }
                }
            } else if (i3 != 47 && i3 != 35) {
                return i3;
            } else {
                this._inputPtr = i2 - 1;
                return _skipWSOrEnd2();
            }
        } else {
            _eofAsNextChar();
            return -1;
        }
    }

    private final int _skipWSOrEnd2() {
        int i;
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i2 = this._inputPtr;
                int i3 = i2 + 1;
                this._inputPtr = i3;
                i = bArr[i2] & 255;
                if (i > 32) {
                    if (i == 47) {
                        _skipComment();
                    } else if (i != 35 || !_skipYAMLComment()) {
                        break;
                    }
                } else if (i == 32) {
                    continue;
                } else if (i == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (i == 13) {
                    _skipCR();
                } else if (i != 9) {
                    _throwInvalidSpace(i);
                    throw null;
                }
            } else {
                _eofAsNextChar();
                return -1;
            }
        }
        return i;
    }

    private final boolean _skipYAMLComment() {
        if (!isEnabled(JsonParser.Feature.ALLOW_YAML_COMMENTS)) {
            return false;
        }
        _skipLine();
        return true;
    }

    private final void _updateLocation() {
        this._tokenInputRow = this._currInputRow;
        int i = this._inputPtr;
        this._tokenInputTotal = this._currInputProcessed + ((long) i);
        this._tokenInputCol = i - this._currInputRowStart;
    }

    private final int _verifyNoLeadingZeroes() {
        int i;
        if ((this._inputPtr >= this._inputEnd && !_loadMore()) || (i = this._inputBuffer[this._inputPtr] & 255) < 48 || i > 57) {
            return 48;
        }
        if (isEnabled(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS)) {
            this._inputPtr++;
            if (i == 48) {
                do {
                    if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                        break;
                    }
                    byte[] bArr = this._inputBuffer;
                    int i2 = this._inputPtr;
                    i = bArr[i2] & 255;
                    if (i < 48 || i > 57) {
                        return 48;
                    }
                    this._inputPtr = i2 + 1;
                } while (i == 48);
            }
            return i;
        }
        throw _constructError(je.x0("Invalid numeric value: ", "Leading zeroes not allowed"));
    }

    private final void _verifyRootSpace(int i) {
        int i2 = this._inputPtr + 1;
        this._inputPtr = i2;
        if (i == 9) {
            return;
        }
        if (i == 10) {
            this._currInputRow++;
            this._currInputRowStart = i2;
        } else if (i == 13) {
            _skipCR();
        } else if (i != 32) {
            _reportMissingRootWS(i);
            throw null;
        }
    }

    private final String addName(int[] iArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = ((i << 2) - 4) + i2;
        if (i2 < 4) {
            int i7 = i - 1;
            i3 = iArr[i7];
            iArr[i7] = i3 << ((4 - i2) << 3);
        } else {
            i3 = 0;
        }
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i8 = 0;
        int i9 = 0;
        while (i8 < i6) {
            int i10 = (iArr[i8 >> 2] >> ((3 - (i8 & 3)) << 3)) & BitmapRenderer.ALPHA_VISIBLE;
            i8++;
            if (i10 > 127) {
                if ((i10 & 224) == 192) {
                    i5 = i10 & 31;
                    i4 = 1;
                } else if ((i10 & 240) == 224) {
                    i5 = i10 & 15;
                    i4 = 2;
                } else if ((i10 & 248) == 240) {
                    i5 = i10 & 7;
                    i4 = 3;
                } else {
                    _reportInvalidInitial(i10);
                    throw null;
                }
                if (i8 + i4 <= i6) {
                    int i11 = iArr[i8 >> 2] >> ((3 - (i8 & 3)) << 3);
                    i8++;
                    if ((i11 & 192) == 128) {
                        i10 = (i5 << 6) | (i11 & 63);
                        if (i4 > 1) {
                            int i12 = iArr[i8 >> 2] >> ((3 - (i8 & 3)) << 3);
                            i8++;
                            if ((i12 & 192) == 128) {
                                int i13 = (i12 & 63) | (i10 << 6);
                                if (i4 > 2) {
                                    int i14 = iArr[i8 >> 2] >> ((3 - (i8 & 3)) << 3);
                                    i8++;
                                    if ((i14 & 192) == 128) {
                                        i10 = (i13 << 6) | (i14 & 63);
                                    } else {
                                        _reportInvalidOther(i14 & BitmapRenderer.ALPHA_VISIBLE);
                                        throw null;
                                    }
                                } else {
                                    i10 = i13;
                                }
                            } else {
                                _reportInvalidOther(i12);
                                throw null;
                            }
                        }
                        if (i4 > 2) {
                            int i15 = i10 - 65536;
                            if (i9 >= emptyAndGetCurrentSegment.length) {
                                emptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
                            }
                            emptyAndGetCurrentSegment[i9] = (char) ((i15 >> 10) + 55296);
                            i10 = (i15 & 1023) | 56320;
                            i9++;
                        }
                    } else {
                        _reportInvalidOther(i11);
                        throw null;
                    }
                } else {
                    _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
                    throw null;
                }
            }
            if (i9 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
            }
            emptyAndGetCurrentSegment[i9] = (char) i10;
            i9++;
        }
        String str = new String(emptyAndGetCurrentSegment, 0, i9);
        if (i2 < 4) {
            iArr[i - 1] = i3;
        }
        return this._symbols.addName(str, iArr, i);
    }

    private final String findName(int i, int i2) {
        int _padLastQuad = _padLastQuad(i, i2);
        String findName = this._symbols.findName(_padLastQuad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = _padLastQuad;
        return addName(iArr, 1, i2);
    }

    private int nextByte() {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        return bArr[i] & 255;
    }

    private final String parseName(int i, int i2, int i3) {
        return parseEscapedName(this._quadBuffer, 0, i, i2, i3);
    }

    /* access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _closeInput() {
        if (this._inputStream != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this._inputStream.close();
            }
            this._inputStream = null;
        }
    }

    /* access modifiers changed from: protected */
    public final byte[] _decodeBase64(Base64Variant base64Variant) {
        ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            int i2 = bArr[i] & 255;
            if (i2 > 32) {
                int decodeBase64Char = base64Variant.decodeBase64Char(i2);
                if (decodeBase64Char < 0) {
                    if (i2 == 34) {
                        return _getByteArrayBuilder.toByteArray();
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, i2, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr2 = this._inputBuffer;
                int i3 = this._inputPtr;
                this._inputPtr = i3 + 1;
                int i4 = bArr2[i3] & 255;
                int decodeBase64Char2 = base64Variant.decodeBase64Char(i4);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, i4, 1);
                }
                int i5 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i6 = this._inputPtr;
                this._inputPtr = i6 + 1;
                int i7 = bArr3[i6] & 255;
                int decodeBase64Char3 = base64Variant.decodeBase64Char(i7);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (i7 == 34) {
                            _getByteArrayBuilder.append(i5 >> 4);
                            if (!base64Variant.usesPadding()) {
                                return _getByteArrayBuilder.toByteArray();
                            }
                            this._inputPtr--;
                            _handleBase64MissingPadding(base64Variant);
                            throw null;
                        }
                        decodeBase64Char3 = _decodeBase64Escape(base64Variant, i7, 2);
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        byte[] bArr4 = this._inputBuffer;
                        int i8 = this._inputPtr;
                        this._inputPtr = i8 + 1;
                        int i9 = bArr4[i8] & 255;
                        if (base64Variant.usesPaddingChar(i9) || _decodeBase64Escape(base64Variant, i9, 3) == -2) {
                            _getByteArrayBuilder.append(i5 >> 4);
                        } else {
                            StringBuilder V0 = je.V0("expected padding character '");
                            V0.append(base64Variant.getPaddingChar());
                            V0.append("'");
                            throw reportInvalidBase64Char(base64Variant, i9, 3, V0.toString());
                        }
                    }
                }
                int i10 = (i5 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr5 = this._inputBuffer;
                int i11 = this._inputPtr;
                this._inputPtr = i11 + 1;
                int i12 = bArr5[i11] & 255;
                int decodeBase64Char4 = base64Variant.decodeBase64Char(i12);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (i12 == 34) {
                            _getByteArrayBuilder.appendTwoBytes(i10 >> 2);
                            if (!base64Variant.usesPadding()) {
                                return _getByteArrayBuilder.toByteArray();
                            }
                            this._inputPtr--;
                            _handleBase64MissingPadding(base64Variant);
                            throw null;
                        }
                        decodeBase64Char4 = _decodeBase64Escape(base64Variant, i12, 3);
                    }
                    if (decodeBase64Char4 == -2) {
                        _getByteArrayBuilder.appendTwoBytes(i10 >> 2);
                    }
                }
                _getByteArrayBuilder.appendThreeBytes((i10 << 6) | decodeBase64Char4);
            }
        }
    }

    /* access modifiers changed from: protected */
    public int _decodeCharForError(int i) {
        int i2;
        char c;
        int i3 = i & BitmapRenderer.ALPHA_VISIBLE;
        if (i3 <= 127) {
            return i3;
        }
        if ((i3 & 224) == 192) {
            i2 = i3 & 31;
            c = 1;
        } else if ((i3 & 240) == 224) {
            i2 = i3 & 15;
            c = 2;
        } else if ((i3 & 248) == 240) {
            i2 = i3 & 7;
            c = 3;
        } else {
            _reportInvalidInitial(i3 & BitmapRenderer.ALPHA_VISIBLE);
            throw null;
        }
        int nextByte = nextByte();
        if ((nextByte & 192) == 128) {
            int i4 = (i2 << 6) | (nextByte & 63);
            if (c <= 1) {
                return i4;
            }
            int nextByte2 = nextByte();
            if ((nextByte2 & 192) == 128) {
                int i5 = (i4 << 6) | (nextByte2 & 63);
                if (c <= 2) {
                    return i5;
                }
                int nextByte3 = nextByte();
                if ((nextByte3 & 192) == 128) {
                    return (i5 << 6) | (nextByte3 & 63);
                }
                _reportInvalidOther(nextByte3 & BitmapRenderer.ALPHA_VISIBLE);
                throw null;
            }
            _reportInvalidOther(nextByte2 & BitmapRenderer.ALPHA_VISIBLE);
            throw null;
        }
        _reportInvalidOther(nextByte & BitmapRenderer.ALPHA_VISIBLE);
        throw null;
    }

    /* access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.core.base.ParserBase
    public char _decodeEscaped() {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            byte b = bArr[i];
            if (b == 34 || b == 47 || b == 92) {
                return (char) b;
            }
            if (b == 98) {
                return '\b';
            }
            if (b == 102) {
                return '\f';
            }
            if (b == 110) {
                return '\n';
            }
            if (b == 114) {
                return '\r';
            }
            if (b == 116) {
                return '\t';
            }
            if (b != 117) {
                char _decodeCharForError = (char) _decodeCharForError(b);
                _handleUnrecognizedCharacterEscape(_decodeCharForError);
                return _decodeCharForError;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < 4; i3++) {
                if (this._inputPtr < this._inputEnd || _loadMore()) {
                    byte[] bArr2 = this._inputBuffer;
                    int i4 = this._inputPtr;
                    this._inputPtr = i4 + 1;
                    int i5 = bArr2[i4] & 255;
                    int charToHex = CharTypes.charToHex(i5);
                    if (charToHex >= 0) {
                        i2 = (i2 << 4) | charToHex;
                    } else {
                        _reportUnexpectedChar(i5, "expected a hex-digit for character escape sequence");
                        throw null;
                    }
                } else {
                    _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
                    throw null;
                }
            }
            return (char) i2;
        }
        _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
        throw null;
    }

    /* access modifiers changed from: protected */
    public String _finishAndReturnString() {
        int i = this._inputPtr;
        if (i >= this._inputEnd) {
            _loadMoreGuaranteed();
            i = this._inputPtr;
        }
        int i2 = 0;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int min = Math.min(this._inputEnd, emptyAndGetCurrentSegment.length + i);
        byte[] bArr = this._inputBuffer;
        while (true) {
            if (i >= min) {
                break;
            }
            int i3 = bArr[i] & 255;
            if (iArr[i3] == 0) {
                i++;
                emptyAndGetCurrentSegment[i2] = (char) i3;
                i2++;
            } else if (i3 == 34) {
                this._inputPtr = i + 1;
                return this._textBuffer.setCurrentAndReturn(i2);
            }
        }
        this._inputPtr = i;
        _finishString2(emptyAndGetCurrentSegment, i2);
        return this._textBuffer.contentsAsString();
    }

    /* access modifiers changed from: protected */
    public void _finishString() {
        int i = this._inputPtr;
        if (i >= this._inputEnd) {
            _loadMoreGuaranteed();
            i = this._inputPtr;
        }
        int i2 = 0;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int min = Math.min(this._inputEnd, emptyAndGetCurrentSegment.length + i);
        byte[] bArr = this._inputBuffer;
        while (true) {
            if (i >= min) {
                break;
            }
            int i3 = bArr[i] & 255;
            if (iArr[i3] == 0) {
                i++;
                emptyAndGetCurrentSegment[i2] = (char) i3;
                i2++;
            } else if (i3 == 34) {
                this._inputPtr = i + 1;
                this._textBuffer.setCurrentLength(i2);
                return;
            }
        }
        this._inputPtr = i;
        _finishString2(emptyAndGetCurrentSegment, i2);
    }

    /* access modifiers changed from: protected */
    public final String _getText2(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int id = jsonToken.id();
        if (id == 5) {
            return this._parsingContext._currentName;
        }
        if (id == 6 || id == 7 || id == 8) {
            return this._textBuffer.contentsAsString();
        }
        return jsonToken.asString();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, byte], vars: [r4v0 ??, r4v1 ??, r4v4 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    protected com.fasterxml.jackson.core.JsonToken _handleInvalidNumberStart(
/*
[93] Method generation error in method: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._handleInvalidNumberStart(int, boolean):com.fasterxml.jackson.core.JsonToken, file: classes.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v0 ??
    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:228)
    	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:191)
    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:147)
    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:336)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:294)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:263)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
    
*/

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        if (r12 != 44) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        if (r11._parsingContext.inArray() == false) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e5, code lost:
        if (r7 != 39) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e7, code lost:
        r11._textBuffer.setCurrentLength(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00ee, code lost:
        return com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ef, code lost:
        r6 = r1[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f1, code lost:
        if (r6 == 1) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f4, code lost:
        if (r6 == 2) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00f7, code lost:
        if (r6 == 3) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00fa, code lost:
        if (r6 == 4) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00fe, code lost:
        if (r7 >= 32) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0100, code lost:
        _throwUnquotedSpace(r7, "string value");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0105, code lost:
        _reportInvalidChar(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0108, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0109, code lost:
        r6 = _decodeUtf8_4(r7);
        r7 = r5 + 1;
        r12[r5] = (char) (55296 | (r6 >> 10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0119, code lost:
        if (r7 < r12.length) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x011b, code lost:
        r12 = r11._textBuffer.finishCurrentSegment();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0123, code lost:
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0124, code lost:
        r6 = (r6 & 1023) | 56320;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x012e, code lost:
        if ((r11._inputEnd - r8) < 2) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0130, code lost:
        r6 = _decodeUtf8_3fast(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0135, code lost:
        r6 = _decodeUtf8_3(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x013a, code lost:
        r6 = _decodeUtf8_2(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x013f, code lost:
        r6 = _decodeEscaped();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0144, code lost:
        if (r5 < r12.length) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0146, code lost:
        r12 = r11._textBuffer.finishCurrentSegment();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x014d, code lost:
        r12[r5] = (char) r6;
        r5 = r5 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.JsonToken _handleUnexpectedValue(int r12) {
        /*
        // Method dump skipped, instructions count: 375
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._handleUnexpectedValue(int):com.fasterxml.jackson.core.JsonToken");
    }

    /* access modifiers changed from: protected */
    public final boolean _loadMore() {
        byte[] bArr;
        int length;
        int i = this._inputEnd;
        this._currInputProcessed += (long) i;
        this._currInputRowStart -= i;
        this._nameStartOffset -= i;
        InputStream inputStream = this._inputStream;
        if (inputStream == null || (length = (bArr = this._inputBuffer).length) == 0) {
            return false;
        }
        int read = inputStream.read(bArr, 0, length);
        if (read > 0) {
            this._inputPtr = 0;
            this._inputEnd = read;
            return true;
        }
        _closeInput();
        if (read == 0) {
            throw new IOException(je.B0(je.V0("InputStream.read() returned 0 characters when trying to read "), this._inputBuffer.length, " bytes"));
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void _loadMoreGuaranteed() {
        if (!_loadMore()) {
            _reportInvalidEOF();
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public final void _matchFalse() {
        int i;
        int i2 = this._inputPtr;
        if (i2 + 4 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i3 = i2 + 1;
            if (bArr[i2] == 97) {
                int i4 = i3 + 1;
                if (bArr[i3] == 108) {
                    int i5 = i4 + 1;
                    if (bArr[i4] == 115) {
                        int i6 = i5 + 1;
                        if (bArr[i5] == 101 && ((i = bArr[i6] & 255) < 48 || i == 93 || i == 125)) {
                            this._inputPtr = i6;
                            return;
                        }
                    }
                }
            }
        }
        _matchToken2("false", 1);
    }

    /* access modifiers changed from: protected */
    public final void _matchNull() {
        int i;
        int i2 = this._inputPtr;
        if (i2 + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i3 = i2 + 1;
            if (bArr[i2] == 117) {
                int i4 = i3 + 1;
                if (bArr[i3] == 108) {
                    int i5 = i4 + 1;
                    if (bArr[i4] == 108 && ((i = bArr[i5] & 255) < 48 || i == 93 || i == 125)) {
                        this._inputPtr = i5;
                        return;
                    }
                }
            }
        }
        _matchToken2("null", 1);
    }

    /* access modifiers changed from: protected */
    public final void _matchToken(String str, int i) {
        int length = str.length();
        if (this._inputPtr + length >= this._inputEnd) {
            _matchToken2(str, i);
            return;
        }
        while (this._inputBuffer[this._inputPtr] == str.charAt(i)) {
            int i2 = this._inputPtr + 1;
            this._inputPtr = i2;
            i++;
            if (i >= length) {
                int i3 = this._inputBuffer[i2] & 255;
                if (i3 >= 48 && i3 != 93 && i3 != 125) {
                    _checkMatchEnd(str, i, i3);
                    return;
                }
                return;
            }
        }
        _reportInvalidToken(str.substring(0, i));
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void _matchTrue() {
        int i;
        int i2 = this._inputPtr;
        if (i2 + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i3 = i2 + 1;
            if (bArr[i2] == 114) {
                int i4 = i3 + 1;
                if (bArr[i3] == 117) {
                    int i5 = i4 + 1;
                    if (bArr[i4] == 101 && ((i = bArr[i5] & 255) < 48 || i == 93 || i == 125)) {
                        this._inputPtr = i5;
                        return;
                    }
                }
            }
        }
        _matchToken2("true", 1);
    }

    /* access modifiers changed from: protected */
    public final String _parseName(int i) {
        String findName;
        int i2 = i;
        int i3 = 0;
        if (i2 != 34) {
            if (i2 != 39 || !isEnabled(JsonParser.Feature.ALLOW_SINGLE_QUOTES)) {
                if (isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES)) {
                    int[] inputCodeUtf8JsNames = CharTypes.getInputCodeUtf8JsNames();
                    if (inputCodeUtf8JsNames[i2] == 0) {
                        int[] iArr = this._quadBuffer;
                        int i4 = 0;
                        int i5 = 0;
                        while (true) {
                            if (i3 < 4) {
                                i3++;
                                i5 = i2 | (i5 << 8);
                            } else {
                                if (i4 >= iArr.length) {
                                    iArr = ParserBase.growArrayBy(iArr, iArr.length);
                                    this._quadBuffer = iArr;
                                }
                                iArr[i4] = i5;
                                i5 = i2;
                                i4++;
                                i3 = 1;
                            }
                            if (this._inputPtr < this._inputEnd || _loadMore()) {
                                byte[] bArr = this._inputBuffer;
                                int i6 = this._inputPtr;
                                i2 = bArr[i6] & 255;
                                if (inputCodeUtf8JsNames[i2] != 0) {
                                    if (i3 > 0) {
                                        if (i4 >= iArr.length) {
                                            int[] growArrayBy = ParserBase.growArrayBy(iArr, iArr.length);
                                            this._quadBuffer = growArrayBy;
                                            iArr = growArrayBy;
                                        }
                                        iArr[i4] = i5;
                                        i4++;
                                    }
                                    findName = this._symbols.findName(iArr, i4);
                                    if (findName == null) {
                                        findName = addName(iArr, i4, i3);
                                    }
                                } else {
                                    this._inputPtr = i6 + 1;
                                }
                            } else {
                                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
                                throw null;
                            }
                        }
                    } else {
                        _reportUnexpectedChar(i2, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
                        throw null;
                    }
                } else {
                    _reportUnexpectedChar((char) _decodeCharForError(i), "was expecting double-quote to start field name");
                    throw null;
                }
            } else if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr2 = this._inputBuffer;
                int i7 = this._inputPtr;
                this._inputPtr = i7 + 1;
                int i8 = bArr2[i7] & 255;
                if (i8 == 39) {
                    return "";
                }
                int[] iArr2 = this._quadBuffer;
                int[] iArr3 = _icLatin1;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                while (i8 != 39) {
                    if (!(iArr3[i8] == 0 || i8 == 34)) {
                        if (i8 != 92) {
                            _throwUnquotedSpace(i8, "name");
                        } else {
                            i8 = _decodeEscaped();
                        }
                        if (i8 > 127) {
                            if (i9 >= 4) {
                                if (i10 >= iArr2.length) {
                                    iArr2 = ParserBase.growArrayBy(iArr2, iArr2.length);
                                    this._quadBuffer = iArr2;
                                }
                                iArr2[i10] = i11;
                                i10++;
                                i9 = 0;
                                i11 = 0;
                            }
                            int i12 = i11 << 8;
                            if (i8 < 2048) {
                                i11 = i12 | (i8 >> 6) | 192;
                                i9++;
                            } else {
                                int i13 = i12 | (i8 >> 12) | 224;
                                int i14 = i9 + 1;
                                if (i14 >= 4) {
                                    if (i10 >= iArr2.length) {
                                        iArr2 = ParserBase.growArrayBy(iArr2, iArr2.length);
                                        this._quadBuffer = iArr2;
                                    }
                                    iArr2[i10] = i13;
                                    i10++;
                                    i14 = 0;
                                    i13 = 0;
                                }
                                i11 = (i13 << 8) | ((i8 >> 6) & 63) | 128;
                                i9 = i14 + 1;
                            }
                            i8 = (i8 & 63) | 128;
                        }
                    }
                    if (i9 < 4) {
                        i9++;
                        i11 = i8 | (i11 << 8);
                    } else {
                        if (i10 >= iArr2.length) {
                            iArr2 = ParserBase.growArrayBy(iArr2, iArr2.length);
                            this._quadBuffer = iArr2;
                        }
                        iArr2[i10] = i11;
                        i11 = i8;
                        i10++;
                        i9 = 1;
                    }
                    if (this._inputPtr < this._inputEnd || _loadMore()) {
                        byte[] bArr3 = this._inputBuffer;
                        int i15 = this._inputPtr;
                        this._inputPtr = i15 + 1;
                        i8 = bArr3[i15] & 255;
                    } else {
                        _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
                        throw null;
                    }
                }
                if (i9 > 0) {
                    if (i10 >= iArr2.length) {
                        int[] growArrayBy2 = ParserBase.growArrayBy(iArr2, iArr2.length);
                        this._quadBuffer = growArrayBy2;
                        iArr2 = growArrayBy2;
                    }
                    iArr2[i10] = _padLastQuad(i11, i9);
                    i10++;
                }
                findName = this._symbols.findName(iArr2, i10);
                if (findName == null) {
                    return addName(iArr2, i10, i9);
                }
            } else {
                _reportInvalidEOF(": was expecting closing ''' for field name", JsonToken.FIELD_NAME);
                throw null;
            }
            return findName;
        }
        int i16 = this._inputPtr;
        int i17 = i16 + 13;
        int i18 = this._inputEnd;
        if (i17 <= i18) {
            byte[] bArr4 = this._inputBuffer;
            int[] iArr4 = _icLatin1;
            int i19 = i16 + 1;
            this._inputPtr = i19;
            int i20 = bArr4[i16] & 255;
            if (iArr4[i20] == 0) {
                int i21 = i19 + 1;
                this._inputPtr = i21;
                int i22 = bArr4[i19] & 255;
                if (iArr4[i22] == 0) {
                    int i23 = (i20 << 8) | i22;
                    int i24 = i21 + 1;
                    this._inputPtr = i24;
                    int i25 = bArr4[i21] & 255;
                    if (iArr4[i25] == 0) {
                        int i26 = (i23 << 8) | i25;
                        int i27 = i24 + 1;
                        this._inputPtr = i27;
                        int i28 = bArr4[i24] & 255;
                        if (iArr4[i28] == 0) {
                            int i29 = i28 | (i26 << 8);
                            int i30 = i27 + 1;
                            this._inputPtr = i30;
                            int i31 = bArr4[i27] & 255;
                            if (iArr4[i31] == 0) {
                                this._quad1 = i29;
                                int i32 = i30 + 1;
                                this._inputPtr = i32;
                                int i33 = bArr4[i30] & 255;
                                if (iArr4[i33] == 0) {
                                    int i34 = i33 | (i31 << 8);
                                    int i35 = i32 + 1;
                                    this._inputPtr = i35;
                                    int i36 = bArr4[i32] & 255;
                                    if (iArr4[i36] == 0) {
                                        int i37 = (i34 << 8) | i36;
                                        int i38 = i35 + 1;
                                        this._inputPtr = i38;
                                        int i39 = bArr4[i35] & 255;
                                        if (iArr4[i39] == 0) {
                                            int i40 = i39 | (i37 << 8);
                                            int i41 = i38 + 1;
                                            this._inputPtr = i41;
                                            int i42 = bArr4[i38] & 255;
                                            if (iArr4[i42] == 0) {
                                                int i43 = i41 + 1;
                                                this._inputPtr = i43;
                                                int i44 = bArr4[i41] & 255;
                                                if (iArr4[i44] == 0) {
                                                    int i45 = (i42 << 8) | i44;
                                                    int i46 = i43 + 1;
                                                    this._inputPtr = i46;
                                                    int i47 = bArr4[i43] & 255;
                                                    if (iArr4[i47] == 0) {
                                                        int i48 = (i45 << 8) | i47;
                                                        int i49 = i46 + 1;
                                                        this._inputPtr = i49;
                                                        int i50 = bArr4[i46] & 255;
                                                        if (iArr4[i50] == 0) {
                                                            int i51 = (i48 << 8) | i50;
                                                            this._inputPtr = i49 + 1;
                                                            int i52 = bArr4[i49] & 255;
                                                            if (iArr4[i52] == 0) {
                                                                int[] iArr5 = this._quadBuffer;
                                                                iArr5[0] = i29;
                                                                iArr5[1] = i40;
                                                                iArr5[2] = i51;
                                                                int i53 = 3;
                                                                while (true) {
                                                                    int i54 = this._inputPtr;
                                                                    if (i54 + 4 > this._inputEnd) {
                                                                        return parseEscapedName(this._quadBuffer, i53, 0, i52, 0);
                                                                    }
                                                                    int i55 = i54 + 1;
                                                                    this._inputPtr = i55;
                                                                    int i56 = bArr4[i54] & 255;
                                                                    if (iArr4[i56] == 0) {
                                                                        int i57 = i56 | (i52 << 8);
                                                                        int i58 = i55 + 1;
                                                                        this._inputPtr = i58;
                                                                        int i59 = bArr4[i55] & 255;
                                                                        if (iArr4[i59] == 0) {
                                                                            int i60 = (i57 << 8) | i59;
                                                                            int i61 = i58 + 1;
                                                                            this._inputPtr = i61;
                                                                            int i62 = bArr4[i58] & 255;
                                                                            if (iArr4[i62] == 0) {
                                                                                int i63 = (i60 << 8) | i62;
                                                                                this._inputPtr = i61 + 1;
                                                                                i52 = bArr4[i61] & 255;
                                                                                if (iArr4[i52] == 0) {
                                                                                    int[] iArr6 = this._quadBuffer;
                                                                                    if (i53 >= iArr6.length) {
                                                                                        this._quadBuffer = ParserBase.growArrayBy(iArr6, i53);
                                                                                    }
                                                                                    this._quadBuffer[i53] = i63;
                                                                                    i53++;
                                                                                } else if (i52 == 34) {
                                                                                    return findName(this._quadBuffer, i53, i63, 4);
                                                                                } else {
                                                                                    return parseEscapedName(this._quadBuffer, i53, i63, i52, 4);
                                                                                }
                                                                            } else if (i62 == 34) {
                                                                                return findName(this._quadBuffer, i53, i60, 3);
                                                                            } else {
                                                                                return parseEscapedName(this._quadBuffer, i53, i60, i62, 3);
                                                                            }
                                                                        } else if (i59 == 34) {
                                                                            return findName(this._quadBuffer, i53, i57, 2);
                                                                        } else {
                                                                            return parseEscapedName(this._quadBuffer, i53, i57, i59, 2);
                                                                        }
                                                                    } else if (i56 == 34) {
                                                                        return findName(this._quadBuffer, i53, i52, 1);
                                                                    } else {
                                                                        return parseEscapedName(this._quadBuffer, i53, i52, i56, 1);
                                                                    }
                                                                }
                                                            } else if (i52 == 34) {
                                                                return findName(i29, i40, i51, 4);
                                                            } else {
                                                                return parseName(i29, i40, i51, i52, 4);
                                                            }
                                                        } else if (i50 == 34) {
                                                            return findName(i29, i40, i48, 3);
                                                        } else {
                                                            return parseName(i29, i40, i48, i50, 3);
                                                        }
                                                    } else if (i47 == 34) {
                                                        return findName(i29, i40, i45, 2);
                                                    } else {
                                                        return parseName(i29, i40, i45, i47, 2);
                                                    }
                                                } else if (i44 == 34) {
                                                    return findName(i29, i40, i42, 1);
                                                } else {
                                                    return parseName(i29, i40, i42, i44, 1);
                                                }
                                            } else if (i42 == 34) {
                                                return findName(i29, i40, 4);
                                            } else {
                                                return parseName(i29, i40, i42, 4);
                                            }
                                        } else if (i39 == 34) {
                                            return findName(i29, i37, 3);
                                        } else {
                                            return parseName(i29, i37, i39, 3);
                                        }
                                    } else if (i36 == 34) {
                                        return findName(i29, i34, 2);
                                    } else {
                                        return parseName(i29, i34, i36, 2);
                                    }
                                } else if (i33 == 34) {
                                    return findName(i29, i31, 1);
                                } else {
                                    return parseName(i29, i31, i33, 1);
                                }
                            } else if (i31 == 34) {
                                return findName(i29, 4);
                            } else {
                                return parseName(i29, i31, 4);
                            }
                        } else if (i28 == 34) {
                            return findName(i26, 3);
                        } else {
                            return parseName(i26, i28, 3);
                        }
                    } else if (i25 == 34) {
                        return findName(i23, 2);
                    } else {
                        return parseName(i23, i25, 2);
                    }
                } else if (i22 == 34) {
                    return findName(i20, 1);
                } else {
                    return parseName(i20, i22, 1);
                }
            } else if (i20 == 34) {
                return "";
            } else {
                return parseName(0, i20, 0);
            }
        } else if (i16 < i18 || _loadMore()) {
            byte[] bArr5 = this._inputBuffer;
            int i64 = this._inputPtr;
            this._inputPtr = i64 + 1;
            int i65 = bArr5[i64] & 255;
            if (i65 == 34) {
                return "";
            }
            return parseEscapedName(this._quadBuffer, 0, 0, i65, 0);
        } else {
            _reportInvalidEOF(": was expecting closing '\"' for name", JsonToken.FIELD_NAME);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public JsonToken _parseNegNumber() {
        int i;
        int i2;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment[0] = '-';
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        int i4 = bArr[i3] & 255;
        if (i4 <= 48) {
            if (i4 != 48) {
                return _handleInvalidNumberStart(i4, true);
            }
            i4 = _verifyNoLeadingZeroes();
        } else if (i4 > 57) {
            return _handleInvalidNumberStart(i4, true);
        }
        int i5 = 2;
        emptyAndGetCurrentSegment[1] = (char) i4;
        int min = Math.min(this._inputEnd, (this._inputPtr + emptyAndGetCurrentSegment.length) - 2);
        int i6 = 1;
        while (true) {
            int i7 = this._inputPtr;
            if (i7 >= min) {
                return _parseNumber2(emptyAndGetCurrentSegment, i5, true, i6);
            }
            byte[] bArr2 = this._inputBuffer;
            i = i7 + 1;
            this._inputPtr = i;
            i2 = bArr2[i7] & 255;
            if (i2 < 48 || i2 > 57) {
                break;
            }
            i6++;
            emptyAndGetCurrentSegment[i5] = (char) i2;
            i5++;
        }
        if (i2 == 46 || i2 == 101 || i2 == 69) {
            return _parseFloat(emptyAndGetCurrentSegment, i5, i2, true, i6);
        }
        this._inputPtr = i - 1;
        this._textBuffer.setCurrentLength(i5);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace(i2);
        }
        return resetInt(true, i6);
    }

    /* access modifiers changed from: protected */
    public JsonToken _parsePosNumber(int i) {
        int i2;
        int i3;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        if (i == 48) {
            i = _verifyNoLeadingZeroes();
        }
        emptyAndGetCurrentSegment[0] = (char) i;
        int min = Math.min(this._inputEnd, (this._inputPtr + emptyAndGetCurrentSegment.length) - 1);
        int i4 = 1;
        int i5 = 1;
        while (true) {
            int i6 = this._inputPtr;
            if (i6 >= min) {
                return _parseNumber2(emptyAndGetCurrentSegment, i4, false, i5);
            }
            byte[] bArr = this._inputBuffer;
            i2 = i6 + 1;
            this._inputPtr = i2;
            i3 = bArr[i6] & 255;
            if (i3 < 48 || i3 > 57) {
                break;
            }
            i5++;
            emptyAndGetCurrentSegment[i4] = (char) i3;
            i4++;
        }
        if (i3 == 46 || i3 == 101 || i3 == 69) {
            return _parseFloat(emptyAndGetCurrentSegment, i4, i3, false, i5);
        }
        this._inputPtr = i2 - 1;
        this._textBuffer.setCurrentLength(i4);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace(i3);
        }
        return resetInt(false, i5);
    }

    /* access modifiers changed from: protected */
    public int _readBinary(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) {
        int i = 3;
        int length = bArr.length - 3;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            int i6 = bArr2[i5] & 255;
            if (i6 > 32) {
                int decodeBase64Char = base64Variant.decodeBase64Char(i6);
                if (decodeBase64Char < 0) {
                    if (i6 == 34) {
                        break;
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, i6, i2);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                if (i3 > length) {
                    i4 += i3;
                    outputStream.write(bArr, i2, i3);
                    i3 = 0;
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i7 = this._inputPtr;
                this._inputPtr = i7 + 1;
                int i8 = bArr3[i7] & 255;
                int decodeBase64Char2 = base64Variant.decodeBase64Char(i8);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, i8, 1);
                }
                int i9 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr4 = this._inputBuffer;
                int i10 = this._inputPtr;
                this._inputPtr = i10 + 1;
                int i11 = bArr4[i10] & 255;
                int decodeBase64Char3 = base64Variant.decodeBase64Char(i11);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (i11 == 34) {
                            int i12 = i3 + 1;
                            bArr[i3] = (byte) (i9 >> 4);
                            if (!base64Variant.usesPadding()) {
                                i3 = i12;
                            } else {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                                throw null;
                            }
                        } else {
                            decodeBase64Char3 = _decodeBase64Escape(base64Variant, i11, 2);
                        }
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        byte[] bArr5 = this._inputBuffer;
                        int i13 = this._inputPtr;
                        this._inputPtr = i13 + 1;
                        int i14 = bArr5[i13] & 255;
                        if (base64Variant.usesPaddingChar(i14) || _decodeBase64Escape(base64Variant, i14, i) == -2) {
                            bArr[i3] = (byte) (i9 >> 4);
                            i3++;
                            i2 = 0;
                        } else {
                            StringBuilder V0 = je.V0("expected padding character '");
                            V0.append(base64Variant.getPaddingChar());
                            V0.append("'");
                            throw reportInvalidBase64Char(base64Variant, i14, i, V0.toString());
                        }
                    }
                }
                int i15 = (i9 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr6 = this._inputBuffer;
                int i16 = this._inputPtr;
                this._inputPtr = i16 + 1;
                int i17 = bArr6[i16] & 255;
                int decodeBase64Char4 = base64Variant.decodeBase64Char(i17);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (i17 == 34) {
                            int i18 = i15 >> 2;
                            int i19 = i3 + 1;
                            bArr[i3] = (byte) (i18 >> 8);
                            i3 = i19 + 1;
                            bArr[i19] = (byte) i18;
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                                throw null;
                            }
                        } else {
                            decodeBase64Char4 = _decodeBase64Escape(base64Variant, i17, 3);
                        }
                    }
                    i2 = 0;
                    if (decodeBase64Char4 == -2) {
                        int i20 = i15 >> 2;
                        int i21 = i3 + 1;
                        bArr[i3] = (byte) (i20 >> 8);
                        i3 = i21 + 1;
                        bArr[i21] = (byte) i20;
                    }
                } else {
                    i2 = 0;
                }
                int i22 = (i15 << 6) | decodeBase64Char4;
                int i23 = i3 + 1;
                bArr[i3] = (byte) (i22 >> 16);
                int i24 = i23 + 1;
                bArr[i23] = (byte) (i22 >> 8);
                bArr[i24] = (byte) i22;
                i3 = i24 + 1;
            }
            i = 3;
        }
        this._tokenIncomplete = false;
        if (i3 <= 0) {
            return i4;
        }
        int i25 = i4 + i3;
        outputStream.write(bArr, 0, i3);
        return i25;
    }

    /* access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _releaseBuffers() {
        byte[] bArr;
        super._releaseBuffers();
        this._symbols.release();
        if (this._bufferRecyclable && (bArr = this._inputBuffer) != null) {
            this._inputBuffer = ParserMinimalBase.NO_BYTES;
            this._ioContext.releaseReadIOBuffer(bArr);
        }
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidChar(int i) {
        if (i < 32) {
            _throwInvalidSpace(i);
            throw null;
        } else {
            _reportInvalidInitial(i);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidInitial(int i) {
        StringBuilder V0 = je.V0("Invalid UTF-8 start byte 0x");
        V0.append(Integer.toHexString(i));
        throw _constructError(V0.toString());
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidOther(int i) {
        StringBuilder V0 = je.V0("Invalid UTF-8 middle byte 0x");
        V0.append(Integer.toHexString(i));
        throw _constructError(V0.toString());
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidToken(String str) {
        _reportInvalidToken(str, "'null', 'true', 'false' or NaN");
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void _skipCR() {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            if (bArr[i] == 10) {
                this._inputPtr = i + 1;
            }
        }
        this._currInputRow++;
        this._currInputRowStart = this._inputPtr;
    }

    /* access modifiers changed from: protected */
    public void _skipString() {
        this._tokenIncomplete = false;
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i = this._inputPtr;
            int i2 = this._inputEnd;
            if (i >= i2) {
                _loadMoreGuaranteed();
                i = this._inputPtr;
                i2 = this._inputEnd;
            }
            while (true) {
                if (i >= i2) {
                    this._inputPtr = i;
                    break;
                }
                int i3 = i + 1;
                int i4 = bArr[i] & 255;
                if (iArr[i4] != 0) {
                    this._inputPtr = i3;
                    if (i4 != 34) {
                        int i5 = iArr[i4];
                        if (i5 == 1) {
                            _decodeEscaped();
                        } else if (i5 == 2) {
                            _skipUtf8_2();
                        } else if (i5 == 3) {
                            _skipUtf8_3();
                        } else if (i5 == 4) {
                            _skipUtf8_4();
                        } else if (i4 < 32) {
                            _throwUnquotedSpace(i4, "string value");
                        } else {
                            _reportInvalidChar(i4);
                            throw null;
                        }
                    } else {
                        return;
                    }
                } else {
                    i = i3;
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING || (jsonToken == JsonToken.VALUE_EMBEDDED_OBJECT && this._binaryValue != null)) {
            if (this._tokenIncomplete) {
                try {
                    this._binaryValue = _decodeBase64(base64Variant);
                    this._tokenIncomplete = false;
                } catch (IllegalArgumentException e) {
                    throw _constructError("Failed to decode VALUE_STRING as base64 (" + base64Variant + "): " + e.getMessage());
                }
            } else if (this._binaryValue == null) {
                ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
                _decodeBase64(getText(), _getByteArrayBuilder, base64Variant);
                this._binaryValue = _getByteArrayBuilder.toByteArray();
            }
            return this._binaryValue;
        }
        StringBuilder V0 = je.V0("Current token (");
        V0.append(this._currToken);
        V0.append(") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        throw _constructError(V0.toString());
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation getCurrentLocation() {
        return new JsonLocation(_getSourceReference(), this._currInputProcessed + ((long) this._inputPtr), -1, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String getText() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return _getText2(jsonToken);
        }
        if (!this._tokenIncomplete) {
            return this._textBuffer.contentsAsString();
        }
        this._tokenIncomplete = false;
        return _finishAndReturnString();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public char[] getTextCharacters() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return null;
        }
        int id = jsonToken.id();
        if (id != 5) {
            if (id != 6) {
                if (!(id == 7 || id == 8)) {
                    return this._currToken.asCharArray();
                }
            } else if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.getTextBuffer();
        }
        if (!this._nameCopied) {
            String str = this._parsingContext._currentName;
            int length = str.length();
            char[] cArr = this._nameCopyBuffer;
            if (cArr == null) {
                this._nameCopyBuffer = this._ioContext.allocNameCopyBuffer(length);
            } else if (cArr.length < length) {
                this._nameCopyBuffer = new char[length];
            }
            str.getChars(0, length, this._nameCopyBuffer, 0);
            this._nameCopied = true;
        }
        return this._nameCopyBuffer;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getTextLength() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        int id = jsonToken.id();
        if (id == 5) {
            return this._parsingContext._currentName.length();
        }
        if (id != 6) {
            if (!(id == 7 || id == 8)) {
                return this._currToken.asCharArray().length;
            }
        } else if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r0 != 8) goto L_0x0024;
     */
    @Override // com.fasterxml.jackson.core.JsonParser
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getTextOffset() {
        /*
            r3 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r3._currToken
            r1 = 0
            if (r0 == 0) goto L_0x0024
            int r0 = r0.id()
            r2 = 6
            if (r0 == r2) goto L_0x0014
            r2 = 7
            if (r0 == r2) goto L_0x001d
            r2 = 8
            if (r0 == r2) goto L_0x001d
            goto L_0x0024
        L_0x0014:
            boolean r0 = r3._tokenIncomplete
            if (r0 == 0) goto L_0x001d
            r3._tokenIncomplete = r1
            r3._finishString()
        L_0x001d:
            com.fasterxml.jackson.core.util.TextBuffer r0 = r3._textBuffer
            int r0 = r0.getTextOffset()
            return r0
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getTextOffset():int");
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation getTokenLocation() {
        if (this._currToken != JsonToken.FIELD_NAME) {
            return new JsonLocation(_getSourceReference(), this._tokenInputTotal - 1, -1, this._tokenInputRow, this._tokenInputCol);
        }
        return new JsonLocation(_getSourceReference(), this._currInputProcessed + ((long) (this._nameStartOffset - 1)), -1, this._nameStartRow, this._nameStartCol);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.getValueAsInt(0);
        }
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

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (!this._tokenIncomplete) {
                return this._textBuffer.contentsAsString();
            }
            this._tokenIncomplete = false;
            return _finishAndReturnString();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        } else {
            return super.getValueAsString(null);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextFieldName() {
        JsonToken jsonToken;
        this._numTypesValid = 0;
        JsonToken jsonToken2 = this._currToken;
        JsonToken jsonToken3 = JsonToken.FIELD_NAME;
        if (jsonToken2 == jsonToken3) {
            _nextAfterName();
            return null;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd == 93) {
            _closeArrayScope();
            this._currToken = JsonToken.END_ARRAY;
            return null;
        } else if (_skipWSOrEnd == 125) {
            _closeObjectScope();
            this._currToken = JsonToken.END_OBJECT;
            return null;
        } else {
            if (this._parsingContext.expectComma()) {
                if (_skipWSOrEnd == 44) {
                    _skipWSOrEnd = _skipWS();
                    if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                        if (_skipWSOrEnd == 125) {
                            _closeObjectScope();
                            this._currToken = JsonToken.END_OBJECT;
                        } else {
                            _closeArrayScope();
                            this._currToken = JsonToken.END_ARRAY;
                        }
                        return null;
                    }
                } else {
                    StringBuilder V0 = je.V0("was expecting comma to separate ");
                    V0.append(this._parsingContext.typeDesc());
                    V0.append(" entries");
                    _reportUnexpectedChar(_skipWSOrEnd, V0.toString());
                    throw null;
                }
            }
            if (!this._parsingContext.inObject()) {
                _updateLocation();
                _nextTokenNotInObject(_skipWSOrEnd);
                return null;
            }
            this._nameStartRow = this._currInputRow;
            int i = this._inputPtr;
            this._nameStartOffset = i;
            this._nameStartCol = i - this._currInputRowStart;
            String _parseName = _parseName(_skipWSOrEnd);
            this._parsingContext.setCurrentName(_parseName);
            this._currToken = jsonToken3;
            int _skipColon = _skipColon();
            _updateLocation();
            if (_skipColon == 34) {
                this._tokenIncomplete = true;
                this._nextToken = JsonToken.VALUE_STRING;
                return _parseName;
            }
            if (_skipColon == 45) {
                jsonToken = _parseNegNumber();
            } else if (_skipColon == 91) {
                jsonToken = JsonToken.START_ARRAY;
            } else if (_skipColon == 102) {
                _matchFalse();
                jsonToken = JsonToken.VALUE_FALSE;
            } else if (_skipColon == 110) {
                _matchNull();
                jsonToken = JsonToken.VALUE_NULL;
            } else if (_skipColon == 116) {
                _matchTrue();
                jsonToken = JsonToken.VALUE_TRUE;
            } else if (_skipColon != 123) {
                switch (_skipColon) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        jsonToken = _parsePosNumber(_skipColon);
                        break;
                    default:
                        jsonToken = _handleUnexpectedValue(_skipColon);
                        break;
                }
            } else {
                jsonToken = JsonToken.START_OBJECT;
            }
            this._nextToken = jsonToken;
            return _parseName;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextTextValue() {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            this._currToken = jsonToken;
            if (jsonToken != JsonToken.VALUE_STRING) {
                if (jsonToken == JsonToken.START_ARRAY) {
                    this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
                } else if (jsonToken == JsonToken.START_OBJECT) {
                    this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
                }
                return null;
            } else if (!this._tokenIncomplete) {
                return this._textBuffer.contentsAsString();
            } else {
                this._tokenIncomplete = false;
                return _finishAndReturnString();
            }
        } else if (nextToken() == JsonToken.VALUE_STRING) {
            return getText();
        } else {
            return null;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken nextToken() {
        JsonToken jsonToken;
        JsonToken jsonToken2 = this._currToken;
        JsonToken jsonToken3 = JsonToken.FIELD_NAME;
        if (jsonToken2 == jsonToken3) {
            return _nextAfterName();
        }
        this._numTypesValid = 0;
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd == 93) {
            _closeArrayScope();
            JsonToken jsonToken4 = JsonToken.END_ARRAY;
            this._currToken = jsonToken4;
            return jsonToken4;
        } else if (_skipWSOrEnd == 125) {
            _closeObjectScope();
            JsonToken jsonToken5 = JsonToken.END_OBJECT;
            this._currToken = jsonToken5;
            return jsonToken5;
        } else {
            if (this._parsingContext.expectComma()) {
                if (_skipWSOrEnd == 44) {
                    _skipWSOrEnd = _skipWS();
                    if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                        if (_skipWSOrEnd == 125) {
                            _closeObjectScope();
                            JsonToken jsonToken6 = JsonToken.END_OBJECT;
                            this._currToken = jsonToken6;
                            return jsonToken6;
                        }
                        _closeArrayScope();
                        JsonToken jsonToken7 = JsonToken.END_ARRAY;
                        this._currToken = jsonToken7;
                        return jsonToken7;
                    }
                } else {
                    StringBuilder V0 = je.V0("was expecting comma to separate ");
                    V0.append(this._parsingContext.typeDesc());
                    V0.append(" entries");
                    _reportUnexpectedChar(_skipWSOrEnd, V0.toString());
                    throw null;
                }
            }
            if (!this._parsingContext.inObject()) {
                _updateLocation();
                return _nextTokenNotInObject(_skipWSOrEnd);
            }
            this._nameStartRow = this._currInputRow;
            int i = this._inputPtr;
            this._nameStartOffset = i;
            this._nameStartCol = i - this._currInputRowStart;
            this._parsingContext.setCurrentName(_parseName(_skipWSOrEnd));
            this._currToken = jsonToken3;
            int _skipColon = _skipColon();
            _updateLocation();
            if (_skipColon == 34) {
                this._tokenIncomplete = true;
                this._nextToken = JsonToken.VALUE_STRING;
                return this._currToken;
            }
            if (_skipColon == 45) {
                jsonToken = _parseNegNumber();
            } else if (_skipColon == 91) {
                jsonToken = JsonToken.START_ARRAY;
            } else if (_skipColon == 102) {
                _matchFalse();
                jsonToken = JsonToken.VALUE_FALSE;
            } else if (_skipColon == 110) {
                _matchNull();
                jsonToken = JsonToken.VALUE_NULL;
            } else if (_skipColon == 116) {
                _matchTrue();
                jsonToken = JsonToken.VALUE_TRUE;
            } else if (_skipColon != 123) {
                switch (_skipColon) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        jsonToken = _parsePosNumber(_skipColon);
                        break;
                    default:
                        jsonToken = _handleUnexpectedValue(_skipColon);
                        break;
                }
            } else {
                jsonToken = JsonToken.START_OBJECT;
            }
            this._nextToken = jsonToken;
            return this._currToken;
        }
    }

    /* access modifiers changed from: protected */
    public final String parseEscapedName(int[] iArr, int i, int i2, int i3, int i4) {
        int[] iArr2 = _icLatin1;
        while (true) {
            if (iArr2[i3] != 0) {
                if (i3 == 34) {
                    if (i4 > 0) {
                        if (i >= iArr.length) {
                            iArr = ParserBase.growArrayBy(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        iArr[i] = _padLastQuad(i2, i4);
                        i++;
                    }
                    String findName = this._symbols.findName(iArr, i);
                    return findName == null ? addName(iArr, i, i4) : findName;
                }
                if (i3 != 92) {
                    _throwUnquotedSpace(i3, "name");
                } else {
                    i3 = _decodeEscaped();
                }
                if (i3 > 127) {
                    int i5 = 0;
                    if (i4 >= 4) {
                        if (i >= iArr.length) {
                            iArr = ParserBase.growArrayBy(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        iArr[i] = i2;
                        i++;
                        i2 = 0;
                        i4 = 0;
                    }
                    if (i3 < 2048) {
                        i2 = (i2 << 8) | (i3 >> 6) | 192;
                        i4++;
                    } else {
                        int i6 = (i2 << 8) | (i3 >> 12) | 224;
                        int i7 = i4 + 1;
                        if (i7 >= 4) {
                            if (i >= iArr.length) {
                                iArr = ParserBase.growArrayBy(iArr, iArr.length);
                                this._quadBuffer = iArr;
                            }
                            iArr[i] = i6;
                            i++;
                            i7 = 0;
                        } else {
                            i5 = i6;
                        }
                        i2 = (i5 << 8) | ((i3 >> 6) & 63) | 128;
                        i4 = i7 + 1;
                    }
                    i3 = (i3 & 63) | 128;
                }
            }
            if (i4 < 4) {
                i4++;
                i2 = (i2 << 8) | i3;
            } else {
                if (i >= iArr.length) {
                    iArr = ParserBase.growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i] = i2;
                i2 = i3;
                i++;
                i4 = 1;
            }
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i8 = this._inputPtr;
                this._inputPtr = i8 + 1;
                i3 = bArr[i8] & 255;
            } else {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
                throw null;
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) {
        if (!this._tokenIncomplete || this._currToken != JsonToken.VALUE_STRING) {
            byte[] binaryValue = getBinaryValue(base64Variant);
            outputStream.write(binaryValue);
            return binaryValue.length;
        }
        byte[] allocBase64Buffer = this._ioContext.allocBase64Buffer();
        try {
            return _readBinary(base64Variant, outputStream, allocBase64Buffer);
        } finally {
            this._ioContext.releaseBase64Buffer(allocBase64Buffer);
        }
    }

    private final String parseName(int i, int i2, int i3, int i4) {
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        return parseEscapedName(iArr, 1, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidToken(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char _decodeCharForError = (char) _decodeCharForError(bArr[i]);
            if (!Character.isJavaIdentifierPart(_decodeCharForError)) {
                break;
            }
            sb.append(_decodeCharForError);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        _reportError("Unrecognized token '%s': was expecting %s", sb, str2);
        throw null;
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidOther(int i, int i2) {
        this._inputPtr = i2;
        _reportInvalidOther(i);
        throw null;
    }

    private final String parseName(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = i2;
        return parseEscapedName(iArr, 2, i3, i4, i5);
    }

    private final String findName(int i, int i2, int i3) {
        int _padLastQuad = _padLastQuad(i2, i3);
        String findName = this._symbols.findName(i, _padLastQuad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = _padLastQuad;
        return addName(iArr, 2, i3);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt(int i) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.getValueAsInt(i);
        }
        int i2 = this._numTypesValid;
        if ((i2 & 1) == 0) {
            if (i2 == 0) {
                return _parseIntValue();
            }
            if ((i2 & 1) == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString(String str) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (!this._tokenIncomplete) {
                return this._textBuffer.contentsAsString();
            }
            this._tokenIncomplete = false;
            return _finishAndReturnString();
        } else if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        } else {
            return super.getValueAsString(str);
        }
    }

    private final String findName(int i, int i2, int i3, int i4) {
        int _padLastQuad = _padLastQuad(i3, i4);
        String findName = this._symbols.findName(i, i2, _padLastQuad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = _padLastQuad(_padLastQuad, i4);
        return addName(iArr, 3, i4);
    }

    private final String findName(int[] iArr, int i, int i2, int i3) {
        if (i >= iArr.length) {
            iArr = ParserBase.growArrayBy(iArr, iArr.length);
            this._quadBuffer = iArr;
        }
        int i4 = i + 1;
        iArr[i] = _padLastQuad(i2, i3);
        String findName = this._symbols.findName(iArr, i4);
        return findName == null ? addName(iArr, i4, i3) : findName;
    }
}
