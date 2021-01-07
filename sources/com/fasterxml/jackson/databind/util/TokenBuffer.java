package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;

public class TokenBuffer extends JsonGenerator {
    protected static final int DEFAULT_GENERATOR_FEATURES = JsonGenerator.Feature.collectDefaults();
    protected int _appendAt;
    protected Segment _first;
    protected boolean _forceBigDecimal;
    protected int _generatorFeatures;
    protected boolean _hasNativeId = false;
    protected boolean _hasNativeObjectIds;
    protected boolean _hasNativeTypeIds;
    protected Segment _last;
    protected boolean _mayHaveNativeIds;
    protected ObjectCodec _objectCodec;
    protected Object _objectId;
    protected JsonStreamContext _parentContext;
    protected Object _typeId;
    protected JsonWriteContext _writeContext;

    /* access modifiers changed from: protected */
    public static final class Parser extends ParserMinimalBase {
        protected transient ByteArrayBuilder _byteBuilder;
        protected boolean _closed;
        protected ObjectCodec _codec;
        protected final boolean _hasNativeObjectIds;
        protected final boolean _hasNativeTypeIds;
        protected JsonLocation _location = null;
        protected TokenBufferReadContext _parsingContext;
        protected Segment _segment;
        protected int _segmentPtr;

        public Parser(Segment segment, ObjectCodec objectCodec, boolean z, boolean z2, JsonStreamContext jsonStreamContext) {
            super(0);
            TokenBufferReadContext tokenBufferReadContext;
            this._segment = segment;
            this._segmentPtr = -1;
            this._codec = objectCodec;
            if (jsonStreamContext == null) {
                tokenBufferReadContext = new TokenBufferReadContext();
            } else {
                tokenBufferReadContext = new TokenBufferReadContext(jsonStreamContext, null);
            }
            this._parsingContext = tokenBufferReadContext;
            this._hasNativeTypeIds = z;
            this._hasNativeObjectIds = z2;
        }

        /* access modifiers changed from: protected */
        public final Object _currentObject() {
            Segment segment = this._segment;
            return segment._tokens[this._segmentPtr];
        }

        /* access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
        public void _handleEOF() {
            VersionUtil.throwInternal();
            throw null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean canReadObjectId() {
            return this._hasNativeObjectIds;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean canReadTypeId() {
            return this._hasNativeTypeIds;
        }

        @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this._closed) {
                this._closed = true;
            }
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public BigInteger getBigIntegerValue() {
            Number numberValue = getNumberValue();
            if (numberValue instanceof BigInteger) {
                return (BigInteger) numberValue;
            }
            if (getNumberType() == JsonParser.NumberType.BIG_DECIMAL) {
                return ((BigDecimal) numberValue).toBigInteger();
            }
            return BigInteger.valueOf(numberValue.longValue());
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public byte[] getBinaryValue(Base64Variant base64Variant) {
            if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object _currentObject = _currentObject();
                if (_currentObject instanceof byte[]) {
                    return (byte[]) _currentObject;
                }
            }
            if (this._currToken == JsonToken.VALUE_STRING) {
                String text = getText();
                if (text == null) {
                    return null;
                }
                ByteArrayBuilder byteArrayBuilder = this._byteBuilder;
                if (byteArrayBuilder == null) {
                    byteArrayBuilder = new ByteArrayBuilder(null, 100);
                    this._byteBuilder = byteArrayBuilder;
                } else {
                    byteArrayBuilder.reset();
                }
                _decodeBase64(text, byteArrayBuilder, base64Variant);
                return byteArrayBuilder.toByteArray();
            }
            StringBuilder V0 = je.V0("Current token (");
            V0.append(this._currToken);
            V0.append(") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), cannot access as binary");
            throw _constructError(V0.toString());
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public ObjectCodec getCodec() {
            return this._codec;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JsonLocation getCurrentLocation() {
            JsonLocation jsonLocation = this._location;
            return jsonLocation == null ? JsonLocation.NA : jsonLocation;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public String getCurrentName() {
            JsonToken jsonToken = this._currToken;
            if (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) {
                return this._parsingContext._parent.getCurrentName();
            }
            return this._parsingContext._currentName;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public BigDecimal getDecimalValue() {
            Number numberValue = getNumberValue();
            if (numberValue instanceof BigDecimal) {
                return (BigDecimal) numberValue;
            }
            int ordinal = getNumberType().ordinal();
            if (ordinal == 0 || ordinal == 1) {
                return BigDecimal.valueOf(numberValue.longValue());
            }
            if (ordinal != 2) {
                return BigDecimal.valueOf(numberValue.doubleValue());
            }
            return new BigDecimal((BigInteger) numberValue);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public double getDoubleValue() {
            return getNumberValue().doubleValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public Object getEmbeddedObject() {
            if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                return _currentObject();
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public float getFloatValue() {
            return getNumberValue().floatValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public int getIntValue() {
            Number numberValue = this._currToken == JsonToken.VALUE_NUMBER_INT ? (Number) _currentObject() : getNumberValue();
            if (!(numberValue instanceof Integer)) {
                if (!((numberValue instanceof Short) || (numberValue instanceof Byte))) {
                    if (numberValue instanceof Long) {
                        long longValue = numberValue.longValue();
                        int i = (int) longValue;
                        if (((long) i) == longValue) {
                            return i;
                        }
                        reportOverflowInt();
                        throw null;
                    }
                    if (numberValue instanceof BigInteger) {
                        BigInteger bigInteger = (BigInteger) numberValue;
                        if (ParserMinimalBase.BI_MIN_INT.compareTo(bigInteger) > 0 || ParserMinimalBase.BI_MAX_INT.compareTo(bigInteger) < 0) {
                            reportOverflowInt();
                            throw null;
                        }
                    } else if ((numberValue instanceof Double) || (numberValue instanceof Float)) {
                        double doubleValue = numberValue.doubleValue();
                        if (doubleValue >= -2.147483648E9d && doubleValue <= 2.147483647E9d) {
                            return (int) doubleValue;
                        }
                        reportOverflowInt();
                        throw null;
                    } else if (numberValue instanceof BigDecimal) {
                        BigDecimal bigDecimal = (BigDecimal) numberValue;
                        if (ParserMinimalBase.BD_MIN_INT.compareTo(bigDecimal) > 0 || ParserMinimalBase.BD_MAX_INT.compareTo(bigDecimal) < 0) {
                            reportOverflowInt();
                            throw null;
                        }
                    } else {
                        VersionUtil.throwInternal();
                        throw null;
                    }
                    return numberValue.intValue();
                }
            }
            return numberValue.intValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public long getLongValue() {
            Number numberValue = this._currToken == JsonToken.VALUE_NUMBER_INT ? (Number) _currentObject() : getNumberValue();
            if (!(numberValue instanceof Long)) {
                if (!((numberValue instanceof Integer) || (numberValue instanceof Short) || (numberValue instanceof Byte))) {
                    if (numberValue instanceof BigInteger) {
                        BigInteger bigInteger = (BigInteger) numberValue;
                        if (ParserMinimalBase.BI_MIN_LONG.compareTo(bigInteger) > 0 || ParserMinimalBase.BI_MAX_LONG.compareTo(bigInteger) < 0) {
                            reportOverflowLong();
                            throw null;
                        }
                    } else if ((numberValue instanceof Double) || (numberValue instanceof Float)) {
                        double doubleValue = numberValue.doubleValue();
                        if (doubleValue >= -9.223372036854776E18d && doubleValue <= 9.223372036854776E18d) {
                            return (long) doubleValue;
                        }
                        reportOverflowLong();
                        throw null;
                    } else if (numberValue instanceof BigDecimal) {
                        BigDecimal bigDecimal = (BigDecimal) numberValue;
                        if (ParserMinimalBase.BD_MIN_LONG.compareTo(bigDecimal) > 0 || ParserMinimalBase.BD_MAX_LONG.compareTo(bigDecimal) < 0) {
                            reportOverflowLong();
                            throw null;
                        }
                    } else {
                        VersionUtil.throwInternal();
                        throw null;
                    }
                    return numberValue.longValue();
                }
            }
            return numberValue.longValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JsonParser.NumberType getNumberType() {
            JsonParser.NumberType numberType = JsonParser.NumberType.INT;
            Number numberValue = getNumberValue();
            if (numberValue instanceof Integer) {
                return numberType;
            }
            if (numberValue instanceof Long) {
                return JsonParser.NumberType.LONG;
            }
            if (numberValue instanceof Double) {
                return JsonParser.NumberType.DOUBLE;
            }
            if (numberValue instanceof BigDecimal) {
                return JsonParser.NumberType.BIG_DECIMAL;
            }
            if (numberValue instanceof BigInteger) {
                return JsonParser.NumberType.BIG_INTEGER;
            }
            if (numberValue instanceof Float) {
                return JsonParser.NumberType.FLOAT;
            }
            if (numberValue instanceof Short) {
                return numberType;
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final Number getNumberValue() {
            JsonToken jsonToken = this._currToken;
            if (jsonToken == null || !jsonToken.isNumeric()) {
                StringBuilder V0 = je.V0("Current token (");
                V0.append(this._currToken);
                V0.append(") not numeric, cannot use numeric value accessors");
                throw _constructError(V0.toString());
            }
            Object _currentObject = _currentObject();
            if (_currentObject instanceof Number) {
                return (Number) _currentObject;
            }
            if (_currentObject instanceof String) {
                String str = (String) _currentObject;
                if (str.indexOf(46) >= 0) {
                    return Double.valueOf(Double.parseDouble(str));
                }
                return Long.valueOf(Long.parseLong(str));
            } else if (_currentObject == null) {
                return null;
            } else {
                StringBuilder V02 = je.V0("Internal error: entry should be a Number, but is of type ");
                V02.append(_currentObject.getClass().getName());
                throw new IllegalStateException(V02.toString());
            }
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public Object getObjectId() {
            return Segment.access$000(this._segment, this._segmentPtr);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JsonStreamContext getParsingContext() {
            return this._parsingContext;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public String getText() {
            JsonToken jsonToken = this._currToken;
            if (jsonToken == JsonToken.VALUE_STRING || jsonToken == JsonToken.FIELD_NAME) {
                Object _currentObject = _currentObject();
                if (_currentObject instanceof String) {
                    return (String) _currentObject;
                }
                int i = ClassUtil.a;
                if (_currentObject == null) {
                    return null;
                }
                return _currentObject.toString();
            } else if (jsonToken == null) {
                return null;
            } else {
                int ordinal = jsonToken.ordinal();
                if (ordinal != 8 && ordinal != 9) {
                    return this._currToken.asString();
                }
                Object _currentObject2 = _currentObject();
                int i2 = ClassUtil.a;
                if (_currentObject2 == null) {
                    return null;
                }
                return _currentObject2.toString();
            }
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public char[] getTextCharacters() {
            String text = getText();
            if (text == null) {
                return null;
            }
            return text.toCharArray();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public int getTextLength() {
            String text = getText();
            if (text == null) {
                return 0;
            }
            return text.length();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public int getTextOffset() {
            return 0;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JsonLocation getTokenLocation() {
            return getCurrentLocation();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public Object getTypeId() {
            return Segment.access$100(this._segment, this._segmentPtr);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean hasTextCharacters() {
            return false;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean isNaN() {
            if (this._currToken != JsonToken.VALUE_NUMBER_FLOAT) {
                return false;
            }
            Object _currentObject = _currentObject();
            if (_currentObject instanceof Double) {
                Double d = (Double) _currentObject;
                if (d.isNaN() || d.isInfinite()) {
                    return true;
                }
                return false;
            } else if (!(_currentObject instanceof Float)) {
                return false;
            } else {
                Float f = (Float) _currentObject;
                if (f.isNaN() || f.isInfinite()) {
                    return true;
                }
                return false;
            }
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public String nextFieldName() {
            Segment segment;
            JsonToken jsonToken;
            if (!this._closed && (segment = this._segment) != null) {
                int i = this._segmentPtr + 1;
                if (i < 16 && segment.type(i) == (jsonToken = JsonToken.FIELD_NAME)) {
                    this._segmentPtr = i;
                    this._currToken = jsonToken;
                    String str = this._segment._tokens[i];
                    String obj = str instanceof String ? str : str.toString();
                    this._parsingContext._currentName = obj;
                    return obj;
                } else if (nextToken() == JsonToken.FIELD_NAME) {
                    return getCurrentName();
                }
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JsonToken nextToken() {
            Segment segment;
            TokenBufferReadContext tokenBufferReadContext;
            if (this._closed || (segment = this._segment) == null) {
                return null;
            }
            int i = this._segmentPtr + 1;
            this._segmentPtr = i;
            if (i >= 16) {
                this._segmentPtr = 0;
                Segment segment2 = segment._next;
                this._segment = segment2;
                if (segment2 == null) {
                    return null;
                }
            }
            JsonToken type = this._segment.type(this._segmentPtr);
            this._currToken = type;
            if (type == JsonToken.FIELD_NAME) {
                Object _currentObject = _currentObject();
                this._parsingContext._currentName = _currentObject instanceof String ? (String) _currentObject : _currentObject.toString();
            } else if (type == JsonToken.START_OBJECT) {
                TokenBufferReadContext tokenBufferReadContext2 = this._parsingContext;
                tokenBufferReadContext2.getClass();
                this._parsingContext = new TokenBufferReadContext(tokenBufferReadContext2, 2, -1);
            } else if (type == JsonToken.START_ARRAY) {
                TokenBufferReadContext tokenBufferReadContext3 = this._parsingContext;
                tokenBufferReadContext3.getClass();
                this._parsingContext = new TokenBufferReadContext(tokenBufferReadContext3, 1, -1);
            } else if (type == JsonToken.END_OBJECT || type == JsonToken.END_ARRAY) {
                TokenBufferReadContext tokenBufferReadContext4 = this._parsingContext;
                JsonStreamContext jsonStreamContext = tokenBufferReadContext4._parent;
                if (jsonStreamContext instanceof TokenBufferReadContext) {
                    tokenBufferReadContext = (TokenBufferReadContext) jsonStreamContext;
                } else if (jsonStreamContext == null) {
                    tokenBufferReadContext = new TokenBufferReadContext();
                } else {
                    tokenBufferReadContext = new TokenBufferReadContext(jsonStreamContext, tokenBufferReadContext4._startLocation);
                }
                this._parsingContext = tokenBufferReadContext;
            }
            return this._currToken;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) {
            byte[] binaryValue = getBinaryValue(base64Variant);
            if (binaryValue == null) {
                return 0;
            }
            outputStream.write(binaryValue, 0, binaryValue.length);
            return binaryValue.length;
        }
    }

    public TokenBuffer(ObjectCodec objectCodec, boolean z) {
        this._objectCodec = objectCodec;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURES;
        this._writeContext = JsonWriteContext.createRootContext(null);
        Segment segment = new Segment();
        this._last = segment;
        this._first = segment;
        this._appendAt = 0;
        this._hasNativeTypeIds = z;
        this._hasNativeObjectIds = z;
        this._mayHaveNativeIds = z | z;
    }

    private final void _appendNativeIds(StringBuilder sb) {
        Object access$000 = Segment.access$000(this._last, this._appendAt - 1);
        if (access$000 != null) {
            sb.append("[objectId=");
            sb.append(String.valueOf(access$000));
            sb.append(']');
        }
        Object access$100 = Segment.access$100(this._last, this._appendAt - 1);
        if (access$100 != null) {
            sb.append("[typeId=");
            sb.append(String.valueOf(access$100));
            sb.append(']');
        }
    }

    private final void _checkNativeIds(JsonParser jsonParser) {
        Object typeId = jsonParser.getTypeId();
        this._typeId = typeId;
        if (typeId != null) {
            this._hasNativeId = true;
        }
        Object objectId = jsonParser.getObjectId();
        this._objectId = objectId;
        if (objectId != null) {
            this._hasNativeId = true;
        }
    }

    public static TokenBuffer asCopyOfValue(JsonParser jsonParser) {
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, (DeserializationContext) null);
        tokenBuffer.copyCurrentStructure(jsonParser);
        return tokenBuffer;
    }

    /* access modifiers changed from: protected */
    public final void _append(JsonToken jsonToken) {
        Segment segment;
        if (this._hasNativeId) {
            segment = this._last.append(this._appendAt, jsonToken, this._objectId, this._typeId);
        } else {
            segment = this._last.append(this._appendAt, jsonToken);
        }
        if (segment == null) {
            this._appendAt++;
            return;
        }
        this._last = segment;
        this._appendAt = 1;
    }

    /* access modifiers changed from: protected */
    public final void _appendValue(JsonToken jsonToken) {
        Segment segment;
        this._writeContext.writeValue();
        if (this._hasNativeId) {
            segment = this._last.append(this._appendAt, jsonToken, this._objectId, this._typeId);
        } else {
            segment = this._last.append(this._appendAt, jsonToken);
        }
        if (segment == null) {
            this._appendAt++;
            return;
        }
        this._last = segment;
        this._appendAt = 1;
    }

    /* access modifiers changed from: protected */
    public void _reportUnsupportedOperation() {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    public TokenBuffer append(TokenBuffer tokenBuffer) {
        if (!this._hasNativeTypeIds) {
            this._hasNativeTypeIds = tokenBuffer._hasNativeTypeIds;
        }
        if (!this._hasNativeObjectIds) {
            this._hasNativeObjectIds = tokenBuffer._hasNativeObjectIds;
        }
        this._mayHaveNativeIds = this._hasNativeTypeIds | this._hasNativeObjectIds;
        JsonParser asParser = tokenBuffer.asParser();
        while (asParser.nextToken() != null) {
            copyCurrentStructure(asParser);
        }
        return this;
    }

    public JsonParser asParser() {
        return new Parser(this._first, this._objectCodec, this._hasNativeTypeIds, this._hasNativeObjectIds, this._parentContext);
    }

    public JsonParser asParserOnFirstToken() {
        Parser parser = new Parser(this._first, this._objectCodec, this._hasNativeTypeIds, this._hasNativeObjectIds, this._parentContext);
        parser.nextToken();
        return parser;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean canWriteBinaryNatively() {
        return true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean canWriteObjectId() {
        return this._hasNativeObjectIds;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean canWriteTypeId() {
        return this._hasNativeTypeIds;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void copyCurrentStructure(JsonParser jsonParser) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.FIELD_NAME) {
            if (this._mayHaveNativeIds) {
                _checkNativeIds(jsonParser);
            }
            writeFieldName(jsonParser.getCurrentName());
            currentToken = jsonParser.nextToken();
        }
        if (this._mayHaveNativeIds) {
            _checkNativeIds(jsonParser);
        }
        int ordinal = currentToken.ordinal();
        if (ordinal == 1) {
            writeStartObject();
            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                copyCurrentStructure(jsonParser);
            }
            writeEndObject();
        } else if (ordinal != 3) {
            if (this._mayHaveNativeIds) {
                _checkNativeIds(jsonParser);
            }
            switch (jsonParser.getCurrentToken().ordinal()) {
                case 1:
                    writeStartObject();
                    return;
                case 2:
                    writeEndObject();
                    return;
                case 3:
                    writeStartArray();
                    return;
                case 4:
                    writeEndArray();
                    return;
                case 5:
                    writeFieldName(jsonParser.getCurrentName());
                    return;
                case 6:
                    writeObject(jsonParser.getEmbeddedObject());
                    return;
                case 7:
                    if (jsonParser.hasTextCharacters()) {
                        writeString(jsonParser.getTextCharacters(), jsonParser.getTextOffset(), jsonParser.getTextLength());
                        return;
                    } else {
                        writeString(jsonParser.getText());
                        return;
                    }
                case 8:
                    int ordinal2 = jsonParser.getNumberType().ordinal();
                    if (ordinal2 == 0) {
                        writeNumber(jsonParser.getIntValue());
                        return;
                    } else if (ordinal2 != 2) {
                        writeNumber(jsonParser.getLongValue());
                        return;
                    } else {
                        writeNumber(jsonParser.getBigIntegerValue());
                        return;
                    }
                case 9:
                    if (this._forceBigDecimal) {
                        writeNumber(jsonParser.getDecimalValue());
                        return;
                    }
                    int ordinal3 = jsonParser.getNumberType().ordinal();
                    if (ordinal3 == 3) {
                        writeNumber(jsonParser.getFloatValue());
                        return;
                    } else if (ordinal3 != 5) {
                        writeNumber(jsonParser.getDoubleValue());
                        return;
                    } else {
                        writeNumber(jsonParser.getDecimalValue());
                        return;
                    }
                case 10:
                    writeBoolean(true);
                    return;
                case 11:
                    writeBoolean(false);
                    return;
                case 12:
                    _appendValue(JsonToken.VALUE_NULL);
                    return;
                default:
                    throw new RuntimeException("Internal error: should never end up through this code path");
            }
        } else {
            writeStartArray();
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                copyCurrentStructure(jsonParser);
            }
            writeEndArray();
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator disable(JsonGenerator.Feature feature) {
        this._generatorFeatures = (feature.getMask() ^ -1) & this._generatorFeatures;
        return this;
    }

    public JsonToken firstToken() {
        return this._first.type(0);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() {
    }

    public TokenBuffer forceUseOfBigDecimal(boolean z) {
        this._forceBigDecimal = z;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int getFeatureMask() {
        return this._generatorFeatures;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonStreamContext getOutputContext() {
        return this._writeContext;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator overrideStdFeatures(int i, int i2) {
        this._generatorFeatures = (i & i2) | (this._generatorFeatures & (i2 ^ -1));
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0034 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void serialize(com.fasterxml.jackson.core.JsonGenerator r9) {
        /*
        // Method dump skipped, instructions count: 402
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.util.TokenBuffer.serialize(com.fasterxml.jackson.core.JsonGenerator):void");
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    @Deprecated
    public JsonGenerator setFeatureMask(int i) {
        this._generatorFeatures = i;
        return this;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("[TokenBuffer: ");
        JsonParser asParser = asParser();
        int i = 0;
        boolean z = this._hasNativeTypeIds || this._hasNativeObjectIds;
        while (true) {
            try {
                JsonToken nextToken = asParser.nextToken();
                if (nextToken == null) {
                    break;
                }
                if (z) {
                    _appendNativeIds(V0);
                }
                if (i < 100) {
                    if (i > 0) {
                        V0.append(", ");
                    }
                    V0.append(nextToken.toString());
                    if (nextToken == JsonToken.FIELD_NAME) {
                        V0.append('(');
                        V0.append(asParser.getCurrentName());
                        V0.append(')');
                    }
                }
                i++;
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        if (i >= 100) {
            V0.append(" ... (truncated ");
            V0.append(i - 100);
            V0.append(" entries)");
        }
        V0.append(']');
        return V0.toString();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        writeObject(bArr2);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBoolean(boolean z) {
        _appendValue(z ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeEmbeddedObject(Object obj) {
        _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeEndArray() {
        _append(JsonToken.END_ARRAY);
        JsonWriteContext parent = this._writeContext.mo11getParent();
        if (parent != null) {
            this._writeContext = parent;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeEndObject() {
        _append(JsonToken.END_OBJECT);
        JsonWriteContext parent = this._writeContext.mo11getParent();
        if (parent != null) {
            this._writeContext = parent;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeFieldName(String str) {
        this._writeContext.writeFieldName(str);
        _append(JsonToken.FIELD_NAME, str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNull() {
        _appendValue(JsonToken.VALUE_NULL);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(short s) {
        _appendValue(JsonToken.VALUE_NUMBER_INT, Short.valueOf(s));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeObject(Object obj) {
        if (obj == null) {
            _appendValue(JsonToken.VALUE_NULL);
        } else if (obj.getClass() == byte[].class || (obj instanceof RawValue)) {
            _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
        } else {
            ObjectCodec objectCodec = this._objectCodec;
            if (objectCodec == null) {
                _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
            } else {
                objectCodec.writeValue(this, obj);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeObjectId(Object obj) {
        this._objectId = obj;
        this._hasNativeId = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str) {
        _reportUnsupportedOperation();
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(String str) {
        _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, new RawValue(str));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartArray() {
        this._writeContext.writeValue();
        _append(JsonToken.START_ARRAY);
        this._writeContext = this._writeContext.createChildArrayContext();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartObject() {
        this._writeContext.writeValue();
        _append(JsonToken.START_OBJECT);
        this._writeContext = this._writeContext.createChildObjectContext();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(char[] cArr, int i, int i2) {
        writeString(new String(cArr, i, i2));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeTypeId(Object obj) {
        this._typeId = obj;
        this._hasNativeId = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(int i) {
        _appendValue(JsonToken.VALUE_NUMBER_INT, Integer.valueOf(i));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(SerializableString serializableString) {
        _reportUnsupportedOperation();
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(SerializableString serializableString) {
        if (serializableString == null) {
            _appendValue(JsonToken.VALUE_NULL);
        } else {
            _appendValue(JsonToken.VALUE_STRING, serializableString);
        }
    }

    /* access modifiers changed from: protected */
    public static final class Segment {
        private static final JsonToken[] TOKEN_TYPES_BY_INDEX;
        protected TreeMap<Integer, Object> _nativeIds;
        protected Segment _next;
        protected long _tokenTypes;
        protected final Object[] _tokens = new Object[16];

        static {
            JsonToken[] jsonTokenArr = new JsonToken[16];
            TOKEN_TYPES_BY_INDEX = jsonTokenArr;
            System.arraycopy(JsonToken.values(), 1, jsonTokenArr, 1, Math.min(15, 12));
        }

        static Object access$000(Segment segment, int i) {
            TreeMap<Integer, Object> treeMap = segment._nativeIds;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(i + i + 1));
        }

        static Object access$100(Segment segment, int i) {
            TreeMap<Integer, Object> treeMap = segment._nativeIds;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(i + i));
        }

        private final void assignNativeIds(int i, Object obj, Object obj2) {
            if (this._nativeIds == null) {
                this._nativeIds = new TreeMap<>();
            }
            if (obj != null) {
                this._nativeIds.put(Integer.valueOf(i + i + 1), obj);
            }
            if (obj2 != null) {
                this._nativeIds.put(Integer.valueOf(i + i), obj2);
            }
        }

        private void set(int i, JsonToken jsonToken, Object obj, Object obj2) {
            long ordinal = (long) jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this._tokenTypes = ordinal | this._tokenTypes;
            assignNativeIds(i, obj, obj2);
        }

        public Segment append(int i, JsonToken jsonToken, Object obj, Object obj2) {
            if (i < 16) {
                set(i, jsonToken, obj, obj2);
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment.set(0, jsonToken, obj, obj2);
            return this._next;
        }

        public JsonToken type(int i) {
            long j = this._tokenTypes;
            if (i > 0) {
                j >>= i << 2;
            }
            return TOKEN_TYPES_BY_INDEX[((int) j) & 15];
        }

        private void set(int i, JsonToken jsonToken, Object obj) {
            this._tokens[i] = obj;
            long ordinal = (long) jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this._tokenTypes = ordinal | this._tokenTypes;
        }

        public Segment append(int i, JsonToken jsonToken, Object obj) {
            if (i < 16) {
                set(i, jsonToken, obj);
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment.set(0, jsonToken, obj);
            return this._next;
        }

        private void set(int i, JsonToken jsonToken, Object obj, Object obj2, Object obj3) {
            this._tokens[i] = obj;
            long ordinal = (long) jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this._tokenTypes = ordinal | this._tokenTypes;
            assignNativeIds(i, obj2, obj3);
        }

        public Segment append(int i, JsonToken jsonToken, Object obj, Object obj2, Object obj3) {
            if (i < 16) {
                set(i, jsonToken, obj, obj2, obj3);
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment.set(0, jsonToken, obj, obj2, obj3);
            return this._next;
        }

        public Segment append(int i, JsonToken jsonToken) {
            if (i < 16) {
                long ordinal = (long) jsonToken.ordinal();
                if (i > 0) {
                    ordinal <<= i << 2;
                }
                this._tokenTypes |= ordinal;
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment._tokenTypes = ((long) jsonToken.ordinal()) | segment._tokenTypes;
            return this._next;
        }
    }

    public JsonParser asParser(JsonParser jsonParser) {
        Parser parser = new Parser(this._first, jsonParser.getCodec(), this._hasNativeTypeIds, this._hasNativeObjectIds, this._parentContext);
        parser._location = jsonParser.getTokenLocation();
        return parser;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(SerializableString serializableString) {
        this._writeContext.writeFieldName(serializableString.getValue());
        _append(JsonToken.FIELD_NAME, serializableString);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(long j) {
        _appendValue(JsonToken.VALUE_NUMBER_INT, Long.valueOf(j));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char[] cArr, int i, int i2) {
        _reportUnsupportedOperation();
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(double d) {
        _appendValue(JsonToken.VALUE_NUMBER_FLOAT, Double.valueOf(d));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char c) {
        _reportUnsupportedOperation();
        throw null;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject(Object obj) {
        this._writeContext.writeValue();
        _append(JsonToken.START_OBJECT);
        JsonWriteContext createChildObjectContext = this._writeContext.createChildObjectContext();
        this._writeContext = createChildObjectContext;
        if (obj != null) {
            createChildObjectContext.setCurrentValue(obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(String str) {
        if (str == null) {
            _appendValue(JsonToken.VALUE_NULL);
        } else {
            _appendValue(JsonToken.VALUE_STRING, str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(float f) {
        _appendValue(JsonToken.VALUE_NUMBER_FLOAT, Float.valueOf(f));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(String str) {
        _appendValue(JsonToken.VALUE_NUMBER_FLOAT, str);
    }

    /* access modifiers changed from: protected */
    public final void _append(JsonToken jsonToken, Object obj) {
        Segment segment;
        if (this._hasNativeId) {
            segment = this._last.append(this._appendAt, jsonToken, obj, this._objectId, this._typeId);
        } else {
            segment = this._last.append(this._appendAt, jsonToken, obj);
        }
        if (segment == null) {
            this._appendAt++;
            return;
        }
        this._last = segment;
        this._appendAt = 1;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            _appendValue(JsonToken.VALUE_NULL);
        } else {
            _appendValue(JsonToken.VALUE_NUMBER_FLOAT, bigDecimal);
        }
    }

    /* access modifiers changed from: protected */
    public final void _appendValue(JsonToken jsonToken, Object obj) {
        Segment segment;
        this._writeContext.writeValue();
        if (this._hasNativeId) {
            segment = this._last.append(this._appendAt, jsonToken, obj, this._objectId, this._typeId);
        } else {
            segment = this._last.append(this._appendAt, jsonToken, obj);
        }
        if (segment == null) {
            this._appendAt++;
            return;
        }
        this._last = segment;
        this._appendAt = 1;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigInteger bigInteger) {
        if (bigInteger == null) {
            _appendValue(JsonToken.VALUE_NULL);
        } else {
            _appendValue(JsonToken.VALUE_NUMBER_INT, bigInteger);
        }
    }

    public TokenBuffer(JsonParser jsonParser, DeserializationContext deserializationContext) {
        boolean z = false;
        this._objectCodec = jsonParser.getCodec();
        this._parentContext = jsonParser.getParsingContext();
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURES;
        this._writeContext = JsonWriteContext.createRootContext(null);
        Segment segment = new Segment();
        this._last = segment;
        this._first = segment;
        this._appendAt = 0;
        this._hasNativeTypeIds = jsonParser.canReadTypeId();
        boolean canReadObjectId = jsonParser.canReadObjectId();
        this._hasNativeObjectIds = canReadObjectId;
        this._mayHaveNativeIds = canReadObjectId | this._hasNativeTypeIds;
        this._forceBigDecimal = deserializationContext != null ? deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) : z;
    }
}
