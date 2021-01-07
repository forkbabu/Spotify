package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class UTF8JsonGenerator extends JsonGeneratorImpl {
    private static final byte[] FALSE_BYTES = {102, 97, 108, 115, 101};
    private static final byte[] HEX_CHARS = CharTypes.copyHexBytes();
    private static final byte[] NULL_BYTES = {110, 117, 108, 108};
    private static final byte[] TRUE_BYTES = {116, 114, 117, 101};
    protected boolean _bufferRecyclable;
    protected char[] _charBuffer;
    protected final int _charBufferLength;
    protected byte[] _outputBuffer;
    protected final int _outputEnd;
    protected final int _outputMaxContiguous;
    protected final OutputStream _outputStream;
    protected int _outputTail;
    protected byte _quoteChar = 34;

    public UTF8JsonGenerator(IOContext iOContext, int i, ObjectCodec objectCodec, OutputStream outputStream) {
        super(iOContext, i, objectCodec);
        this._outputStream = outputStream;
        this._bufferRecyclable = true;
        byte[] allocWriteEncodingBuffer = iOContext.allocWriteEncodingBuffer();
        this._outputBuffer = allocWriteEncodingBuffer;
        int length = allocWriteEncodingBuffer.length;
        this._outputEnd = length;
        this._outputMaxContiguous = length >> 3;
        char[] allocConcatBuffer = iOContext.allocConcatBuffer();
        this._charBuffer = allocConcatBuffer;
        this._charBufferLength = allocConcatBuffer.length;
        if (isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII)) {
            setHighestNonEscapedChar(127);
        }
    }

    private final int _outputMultiByteChar(int i, int i2) {
        byte[] bArr = this._outputBuffer;
        if (i < 55296 || i > 57343) {
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((i >> 12) | 224);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((i >> 6) & 63) | 128);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i & 63) | 128);
            return i5;
        }
        int i6 = i2 + 1;
        bArr[i2] = 92;
        int i7 = i6 + 1;
        bArr[i6] = 117;
        int i8 = i7 + 1;
        byte[] bArr2 = HEX_CHARS;
        bArr[i7] = bArr2[(i >> 12) & 15];
        int i9 = i8 + 1;
        bArr[i8] = bArr2[(i >> 8) & 15];
        int i10 = i9 + 1;
        bArr[i9] = bArr2[(i >> 4) & 15];
        int i11 = i10 + 1;
        bArr[i10] = bArr2[i & 15];
        return i11;
    }

    private final int _outputRawMultiByteChar(int i, char[] cArr, int i2, int i3) {
        if (i < 55296 || i > 57343) {
            byte[] bArr = this._outputBuffer;
            int i4 = this._outputTail;
            int i5 = i4 + 1;
            this._outputTail = i5;
            bArr[i4] = (byte) ((i >> 12) | 224);
            int i6 = i5 + 1;
            this._outputTail = i6;
            bArr[i5] = (byte) (((i >> 6) & 63) | 128);
            this._outputTail = i6 + 1;
            bArr[i6] = (byte) ((i & 63) | 128);
            return i2;
        } else if (i2 >= i3 || cArr == null) {
            throw new JsonGenerationException(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", Integer.valueOf(i)), this);
        } else {
            char c = cArr[i2];
            if (c < 56320 || c > 57343) {
                StringBuilder V0 = je.V0("Incomplete surrogate pair: first char 0x");
                V0.append(Integer.toHexString(i));
                V0.append(", second 0x");
                V0.append(Integer.toHexString(c));
                throw new JsonGenerationException(V0.toString(), this);
            }
            int i7 = (c - 56320) + ((i - 55296) << 10) + 65536;
            if (this._outputTail + 4 > this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr2 = this._outputBuffer;
            int i8 = this._outputTail;
            int i9 = i8 + 1;
            this._outputTail = i9;
            bArr2[i8] = (byte) ((i7 >> 18) | 240);
            int i10 = i9 + 1;
            this._outputTail = i10;
            bArr2[i9] = (byte) (((i7 >> 12) & 63) | 128);
            int i11 = i10 + 1;
            this._outputTail = i11;
            bArr2[i10] = (byte) (((i7 >> 6) & 63) | 128);
            this._outputTail = i11 + 1;
            bArr2[i11] = (byte) ((i7 & 63) | 128);
            return i2 + 1;
        }
    }

    private final int _readMore(InputStream inputStream, byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        while (i < i2) {
            bArr[i4] = bArr[i];
            i4++;
            i++;
        }
        int min = Math.min(i3, bArr.length);
        do {
            int i5 = min - i4;
            if (i5 == 0) {
                break;
            }
            int read = inputStream.read(bArr, i4, i5);
            if (read < 0) {
                return i4;
            }
            i4 += read;
        } while (i4 < 3);
        return i4;
    }

    private final void _writeBytes(byte[] bArr) {
        int length = bArr.length;
        if (this._outputTail + length > this._outputEnd) {
            _flushBuffer();
            if (length > 512) {
                this._outputStream.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this._outputBuffer, this._outputTail, length);
        this._outputTail += length;
    }

    private int _writeGenericEscape(int i, int i2) {
        int i3;
        byte[] bArr = this._outputBuffer;
        int i4 = i2 + 1;
        bArr[i2] = 92;
        int i5 = i4 + 1;
        bArr[i4] = 117;
        if (i > 255) {
            int i6 = 255 & (i >> 8);
            int i7 = i5 + 1;
            byte[] bArr2 = HEX_CHARS;
            bArr[i5] = bArr2[i6 >> 4];
            i3 = i7 + 1;
            bArr[i7] = bArr2[i6 & 15];
            i &= BitmapRenderer.ALPHA_VISIBLE;
        } else {
            int i8 = i5 + 1;
            bArr[i5] = 48;
            i3 = i8 + 1;
            bArr[i8] = 48;
        }
        int i9 = i3 + 1;
        byte[] bArr3 = HEX_CHARS;
        bArr[i3] = bArr3[i >> 4];
        int i10 = i9 + 1;
        bArr[i9] = bArr3[i & 15];
        return i10;
    }

    private final void _writeNull() {
        if (this._outputTail + 4 >= this._outputEnd) {
            _flushBuffer();
        }
        System.arraycopy(NULL_BYTES, 0, this._outputBuffer, this._outputTail, 4);
        this._outputTail += 4;
    }

    private final void _writeQuotedRaw(String str) {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = this._quoteChar;
        writeRaw(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr2[i2] = this._quoteChar;
    }

    private final void _writeStringSegment(char[] cArr, int i, int i2) {
        int i3;
        int i4;
        char c;
        int i5 = i2 + i;
        int i6 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i < i5 && (c = cArr[i]) <= 127 && iArr[c] == 0) {
            bArr[i6] = (byte) c;
            i++;
            i6++;
        }
        this._outputTail = i6;
        if (i >= i5) {
            return;
        }
        if (this._maximumNonEscapedChar == 0) {
            if (((i5 - i) * 6) + i6 > this._outputEnd) {
                _flushBuffer();
            }
            int i7 = this._outputTail;
            byte[] bArr2 = this._outputBuffer;
            int[] iArr2 = this._outputEscapes;
            while (i < i5) {
                int i8 = i + 1;
                char c2 = cArr[i];
                if (c2 <= 127) {
                    if (iArr2[c2] == 0) {
                        bArr2[i7] = (byte) c2;
                        i = i8;
                        i7++;
                    } else {
                        int i9 = iArr2[c2];
                        if (i9 > 0) {
                            int i10 = i7 + 1;
                            bArr2[i7] = 92;
                            i7 = i10 + 1;
                            bArr2[i10] = (byte) i9;
                            i = i8;
                        } else {
                            i4 = _writeGenericEscape(c2, i7);
                        }
                    }
                } else if (c2 <= 2047) {
                    int i11 = i7 + 1;
                    bArr2[i7] = (byte) ((c2 >> 6) | 192);
                    i7 = i11 + 1;
                    bArr2[i11] = (byte) ((c2 & '?') | 128);
                    i = i8;
                } else {
                    i4 = _outputMultiByteChar(c2, i7);
                }
                i7 = i4;
                i = i8;
            }
            this._outputTail = i7;
            return;
        }
        if (((i5 - i) * 6) + i6 > this._outputEnd) {
            _flushBuffer();
        }
        int i12 = this._outputTail;
        byte[] bArr3 = this._outputBuffer;
        int[] iArr3 = this._outputEscapes;
        int i13 = this._maximumNonEscapedChar;
        while (i < i5) {
            int i14 = i + 1;
            char c3 = cArr[i];
            if (c3 <= 127) {
                if (iArr3[c3] == 0) {
                    bArr3[i12] = (byte) c3;
                    i = i14;
                    i12++;
                } else {
                    int i15 = iArr3[c3];
                    if (i15 > 0) {
                        int i16 = i12 + 1;
                        bArr3[i12] = 92;
                        i12 = i16 + 1;
                        bArr3[i16] = (byte) i15;
                        i = i14;
                    } else {
                        i3 = _writeGenericEscape(c3, i12);
                    }
                }
            } else if (c3 > i13) {
                i3 = _writeGenericEscape(c3, i12);
            } else if (c3 <= 2047) {
                int i17 = i12 + 1;
                bArr3[i12] = (byte) ((c3 >> 6) | 192);
                i12 = i17 + 1;
                bArr3[i17] = (byte) ((c3 & '?') | 128);
                i = i14;
            } else {
                i3 = _outputMultiByteChar(c3, i12);
            }
            i12 = i3;
            i = i14;
        }
        this._outputTail = i12;
    }

    private final void _writeStringSegments(String str, boolean z) {
        if (z) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = this._quoteChar;
        }
        int length = str.length();
        int i2 = 0;
        while (length > 0) {
            int min = Math.min(this._outputMaxContiguous, length);
            if (this._outputTail + min > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(str, i2, min);
            i2 += min;
            length -= min;
        }
        if (z) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr2 = this._outputBuffer;
            int i3 = this._outputTail;
            this._outputTail = i3 + 1;
            bArr2[i3] = this._quoteChar;
        }
    }

    /* access modifiers changed from: protected */
    public final void _flushBuffer() {
        int i = this._outputTail;
        if (i > 0) {
            this._outputTail = 0;
            this._outputStream.write(this._outputBuffer, 0, i);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    public final void _verifyValueWrite(String str) {
        byte b;
        int writeValue = this._writeContext.writeValue();
        if (this._cfgPrettyPrinter != null) {
            _verifyPrettyValueWrite(str, writeValue);
            return;
        }
        if (writeValue == 1) {
            b = 44;
        } else if (writeValue == 2) {
            b = 58;
        } else if (writeValue == 3) {
            SerializableString serializableString = this._rootValueSeparator;
            if (serializableString != null) {
                byte[] asUnquotedUTF8 = serializableString.asUnquotedUTF8();
                if (asUnquotedUTF8.length > 0) {
                    _writeBytes(asUnquotedUTF8);
                    return;
                }
                return;
            }
            return;
        } else if (writeValue == 5) {
            _reportCantWriteValueExpectName(str);
            throw null;
        } else {
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = b;
    }

    /* access modifiers changed from: protected */
    public final int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i) {
        int _readMore;
        int i2 = this._outputEnd - 6;
        int i3 = 2;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i4 = -3;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i <= 2) {
                break;
            }
            if (i5 > i4) {
                i6 = _readMore(inputStream, bArr, i5, i6, i);
                if (i6 < 3) {
                    i5 = 0;
                    break;
                }
                i4 = i6 - 3;
                i5 = 0;
            }
            if (this._outputTail > i2) {
                _flushBuffer();
            }
            int i7 = i5 + 1;
            int i8 = i7 + 1;
            i5 = i8 + 1;
            i -= 3;
            int encodeBase64Chunk = base64Variant.encodeBase64Chunk((((bArr[i7] & 255) | (bArr[i5] << 8)) << 8) | (bArr[i8] & 255), this._outputBuffer, this._outputTail);
            this._outputTail = encodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this._outputBuffer;
                int i9 = encodeBase64Chunk + 1;
                this._outputTail = i9;
                bArr2[encodeBase64Chunk] = 92;
                this._outputTail = i9 + 1;
                bArr2[i9] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i <= 0 || (_readMore = _readMore(inputStream, bArr, i5, i6, i)) <= 0) {
            return i;
        }
        if (this._outputTail > i2) {
            _flushBuffer();
        }
        int i10 = bArr[0] << 16;
        if (1 < _readMore) {
            i10 |= (bArr[1] & 255) << 8;
        } else {
            i3 = 1;
        }
        this._outputTail = base64Variant.encodeBase64Partial(i10, i3, this._outputBuffer, this._outputTail);
        return i - i3;
    }

    /* access modifiers changed from: protected */
    public final void _writePPFieldName(String str) {
        int writeFieldName = this._writeContext.writeFieldName(str);
        if (writeFieldName != 4) {
            if (writeFieldName == 1) {
                this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
            } else {
                this._cfgPrettyPrinter.beforeObjectEntries(this);
            }
            if (this._cfgUnqNames) {
                _writeStringSegments(str, false);
                return;
            }
            int length = str.length();
            if (length > this._charBufferLength) {
                _writeStringSegments(str, true);
                return;
            }
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = this._quoteChar;
            str.getChars(0, length, this._charBuffer, 0);
            if (length <= this._outputMaxContiguous) {
                if (this._outputTail + length > this._outputEnd) {
                    _flushBuffer();
                }
                _writeStringSegment(this._charBuffer, 0, length);
            } else {
                _writeStringSegments(this._charBuffer, 0, length);
            }
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr2 = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            bArr2[i2] = this._quoteChar;
            return;
        }
        throw new JsonGenerationException("Can not write a field name, expecting a value", this);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this._outputBuffer != null && isEnabled(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                JsonStreamContext outputContext = getOutputContext();
                if (!outputContext.inArray()) {
                    if (!outputContext.inObject()) {
                        break;
                    }
                    writeEndObject();
                } else {
                    writeEndArray();
                }
            }
        }
        _flushBuffer();
        this._outputTail = 0;
        if (this._outputStream != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                this._outputStream.close();
            } else if (isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                this._outputStream.flush();
            }
        }
        byte[] bArr = this._outputBuffer;
        if (bArr != null && this._bufferRecyclable) {
            this._outputBuffer = null;
            this._ioContext.releaseWriteEncodingBuffer(bArr);
        }
        char[] cArr = this._charBuffer;
        if (cArr != null) {
            this._charBuffer = null;
            this._ioContext.releaseConcatBuffer(cArr);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() {
        _flushBuffer();
        if (this._outputStream != null && isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            this._outputStream.flush();
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr2[i3] = this._quoteChar;
        int i4 = i2 + i;
        int i5 = i4 - 3;
        int i6 = this._outputEnd - 6;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        while (i <= i5) {
            if (this._outputTail > i6) {
                _flushBuffer();
            }
            int i7 = i + 1;
            int i8 = i7 + 1;
            int i9 = i8 + 1;
            int encodeBase64Chunk = base64Variant.encodeBase64Chunk((((bArr[i] << 8) | (bArr[i7] & 255)) << 8) | (bArr[i8] & 255), this._outputBuffer, this._outputTail);
            this._outputTail = encodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr3 = this._outputBuffer;
                int i10 = encodeBase64Chunk + 1;
                this._outputTail = i10;
                bArr3[encodeBase64Chunk] = 92;
                this._outputTail = i10 + 1;
                bArr3[i10] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
            i = i9;
        }
        int i11 = i4 - i;
        if (i11 > 0) {
            if (this._outputTail > i6) {
                _flushBuffer();
            }
            int i12 = i + 1;
            int i13 = bArr[i] << 16;
            if (i11 == 2) {
                i13 |= (bArr[i12] & 255) << 8;
            }
            this._outputTail = base64Variant.encodeBase64Partial(i13, i11, this._outputBuffer, this._outputTail);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr4 = this._outputBuffer;
        int i14 = this._outputTail;
        this._outputTail = i14 + 1;
        bArr4[i14] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBoolean(boolean z) {
        _verifyValueWrite("write a boolean value");
        if (this._outputTail + 5 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = z ? TRUE_BYTES : FALSE_BYTES;
        int length = bArr.length;
        System.arraycopy(bArr, 0, this._outputBuffer, this._outputTail, length);
        this._outputTail += length;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeEndArray() {
        if (this._writeContext.inArray()) {
            PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
            if (prettyPrinter != null) {
                prettyPrinter.writeEndArray(this, this._writeContext.getEntryCount());
            } else {
                if (this._outputTail >= this._outputEnd) {
                    _flushBuffer();
                }
                byte[] bArr = this._outputBuffer;
                int i = this._outputTail;
                this._outputTail = i + 1;
                bArr[i] = 93;
            }
            this._writeContext = this._writeContext.clearAndGetParent();
            return;
        }
        StringBuilder V0 = je.V0("Current context not Array but ");
        V0.append(this._writeContext.typeDesc());
        throw new JsonGenerationException(V0.toString(), this);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeEndObject() {
        if (this._writeContext.inObject()) {
            PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
            if (prettyPrinter != null) {
                prettyPrinter.writeEndObject(this, this._writeContext.getEntryCount());
            } else {
                if (this._outputTail >= this._outputEnd) {
                    _flushBuffer();
                }
                byte[] bArr = this._outputBuffer;
                int i = this._outputTail;
                this._outputTail = i + 1;
                bArr[i] = 125;
            }
            this._writeContext = this._writeContext.clearAndGetParent();
            return;
        }
        StringBuilder V0 = je.V0("Current context not Object but ");
        V0.append(this._writeContext.typeDesc());
        throw new JsonGenerationException(V0.toString(), this);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(String str) {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(str);
            return;
        }
        int writeFieldName = this._writeContext.writeFieldName(str);
        if (writeFieldName != 4) {
            if (writeFieldName == 1) {
                if (this._outputTail >= this._outputEnd) {
                    _flushBuffer();
                }
                byte[] bArr = this._outputBuffer;
                int i = this._outputTail;
                this._outputTail = i + 1;
                bArr[i] = 44;
            }
            int i2 = 0;
            if (this._cfgUnqNames) {
                _writeStringSegments(str, false);
                return;
            }
            int length = str.length();
            if (length > this._charBufferLength) {
                _writeStringSegments(str, true);
                return;
            }
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr2 = this._outputBuffer;
            int i3 = this._outputTail;
            int i4 = i3 + 1;
            this._outputTail = i4;
            bArr2[i3] = this._quoteChar;
            if (length <= this._outputMaxContiguous) {
                if (i4 + length > this._outputEnd) {
                    _flushBuffer();
                }
                _writeStringSegment(str, 0, length);
            } else {
                do {
                    int min = Math.min(this._outputMaxContiguous, length);
                    if (this._outputTail + min > this._outputEnd) {
                        _flushBuffer();
                    }
                    _writeStringSegment(str, i2, min);
                    i2 += min;
                    length -= min;
                } while (length > 0);
            }
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr3 = this._outputBuffer;
            int i5 = this._outputTail;
            this._outputTail = i5 + 1;
            bArr3[i5] = this._quoteChar;
            return;
        }
        throw new JsonGenerationException("Can not write a field name, expecting a value", this);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNull() {
        _verifyValueWrite("write a null");
        _writeNull();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(short s) {
        _verifyValueWrite("write a number");
        if (this._outputTail + 6 >= this._outputEnd) {
            _flushBuffer();
        }
        if (this._cfgNumbersAsStrings) {
            if (this._outputTail + 8 >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i = this._outputTail;
            int i2 = i + 1;
            this._outputTail = i2;
            bArr[i] = this._quoteChar;
            int outputInt = NumberOutput.outputInt(s, bArr, i2);
            this._outputTail = outputInt;
            byte[] bArr2 = this._outputBuffer;
            this._outputTail = outputInt + 1;
            bArr2[outputInt] = this._quoteChar;
            return;
        }
        this._outputTail = NumberOutput.outputInt(s, this._outputBuffer, this._outputTail);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str) {
        int i;
        char c;
        int length = str.length();
        char[] cArr = this._charBuffer;
        if (length <= cArr.length) {
            str.getChars(0, length, cArr, 0);
            writeRaw(cArr, 0, length);
            return;
        }
        int length2 = cArr.length;
        if (length <= length2) {
            str.getChars(0, 0 + length, cArr, 0);
            writeRaw(cArr, 0, length);
            return;
        }
        int i2 = this._outputEnd;
        int min = Math.min(length2, (i2 >> 2) + (i2 >> 4));
        int i3 = min * 3;
        int i4 = 0;
        while (length > 0) {
            int min2 = Math.min(min, length);
            str.getChars(i4, i4 + min2, cArr, 0);
            if (this._outputTail + i3 > this._outputEnd) {
                _flushBuffer();
            }
            if (min2 > 1 && (c = cArr[min2 - 1]) >= 55296 && c <= 56319) {
                min2 = i;
            }
            int i5 = 0;
            while (i5 < min2) {
                do {
                    char c2 = cArr[i5];
                    if (c2 > 127) {
                        int i6 = i5 + 1;
                        char c3 = cArr[i5];
                        if (c3 < 2048) {
                            byte[] bArr = this._outputBuffer;
                            int i7 = this._outputTail;
                            int i8 = i7 + 1;
                            this._outputTail = i8;
                            bArr[i7] = (byte) ((c3 >> 6) | 192);
                            this._outputTail = i8 + 1;
                            bArr[i8] = (byte) ((c3 & '?') | 128);
                            i5 = i6;
                        } else {
                            i5 = _outputRawMultiByteChar(c3, cArr, i6, min2);
                        }
                    } else {
                        byte[] bArr2 = this._outputBuffer;
                        int i9 = this._outputTail;
                        this._outputTail = i9 + 1;
                        bArr2[i9] = (byte) c2;
                        i5++;
                    }
                } while (i5 < min2);
                break;
            }
            i4 += min2;
            length -= min2;
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(SerializableString serializableString) {
        _verifyValueWrite("write a raw (unencoded) value");
        byte[] asUnquotedUTF8 = serializableString.asUnquotedUTF8();
        if (asUnquotedUTF8.length > 0) {
            _writeBytes(asUnquotedUTF8);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartArray() {
        _verifyValueWrite("start an array");
        this._writeContext = this._writeContext.createChildArrayContext();
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartArray(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = 91;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartObject() {
        _verifyValueWrite("start an object");
        this._writeContext = this._writeContext.createChildObjectContext();
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = 123;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(String str) {
        _verifyValueWrite("write a string");
        if (str == null) {
            _writeNull();
            return;
        }
        int length = str.length();
        if (length > this._outputMaxContiguous) {
            _writeStringSegments(str, true);
            return;
        }
        if (this._outputTail + length >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = this._quoteChar;
        _writeStringSegment(str, 0, length);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr2[i2] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject(Object obj) {
        _verifyValueWrite("start an object");
        JsonWriteContext createChildObjectContext = this._writeContext.createChildObjectContext();
        this._writeContext = createChildObjectContext;
        if (obj != null) {
            createChildObjectContext._currentValue = obj;
        }
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = 123;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(int i) {
        _verifyValueWrite("write a number");
        if (this._outputTail + 11 >= this._outputEnd) {
            _flushBuffer();
        }
        if (this._cfgNumbersAsStrings) {
            if (this._outputTail + 13 >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i2 = this._outputTail;
            int i3 = i2 + 1;
            this._outputTail = i3;
            bArr[i2] = this._quoteChar;
            int outputInt = NumberOutput.outputInt(i, bArr, i3);
            this._outputTail = outputInt;
            byte[] bArr2 = this._outputBuffer;
            this._outputTail = outputInt + 1;
            bArr2[outputInt] = this._quoteChar;
            return;
        }
        this._outputTail = NumberOutput.outputInt(i, this._outputBuffer, this._outputTail);
    }

    private final void _writeStringSegments(char[] cArr, int i, int i2) {
        do {
            int min = Math.min(this._outputMaxContiguous, i2);
            if (this._outputTail + min > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(cArr, i, min);
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(char[] cArr, int i, int i2) {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        int i4 = i3 + 1;
        this._outputTail = i4;
        bArr[i3] = this._quoteChar;
        if (i2 <= this._outputMaxContiguous) {
            if (i4 + i2 > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(cArr, i, i2);
        } else {
            _writeStringSegments(cArr, i, i2);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i5 = this._outputTail;
        this._outputTail = i5 + 1;
        bArr2[i5] = this._quoteChar;
    }

    /* access modifiers changed from: protected */
    public final int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) {
        int i = this._outputEnd - 6;
        int i2 = 2;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i3 = -3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i4 > i3) {
                i5 = _readMore(inputStream, bArr, i4, i5, bArr.length);
                if (i5 < 3) {
                    break;
                }
                i3 = i5 - 3;
                i4 = 0;
            }
            if (this._outputTail > i) {
                _flushBuffer();
            }
            int i7 = i4 + 1;
            int i8 = i7 + 1;
            i4 = i8 + 1;
            i6 += 3;
            int encodeBase64Chunk = base64Variant.encodeBase64Chunk((((bArr[i7] & 255) | (bArr[i4] << 8)) << 8) | (bArr[i8] & 255), this._outputBuffer, this._outputTail);
            this._outputTail = encodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this._outputBuffer;
                int i9 = encodeBase64Chunk + 1;
                this._outputTail = i9;
                bArr2[encodeBase64Chunk] = 92;
                this._outputTail = i9 + 1;
                bArr2[i9] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i5 <= 0) {
            return i6;
        }
        if (this._outputTail > i) {
            _flushBuffer();
        }
        int i10 = bArr[0] << 16;
        if (1 < i5) {
            i10 |= (bArr[1] & 255) << 8;
        } else {
            i2 = 1;
        }
        int i11 = i6 + i2;
        this._outputTail = base64Variant.encodeBase64Partial(i10, i2, this._outputBuffer, this._outputTail);
        return i11;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(long j) {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            if (this._outputTail + 23 >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i = this._outputTail;
            int i2 = i + 1;
            this._outputTail = i2;
            bArr[i] = this._quoteChar;
            int outputLong = NumberOutput.outputLong(j, bArr, i2);
            this._outputTail = outputLong;
            byte[] bArr2 = this._outputBuffer;
            this._outputTail = outputLong + 1;
            bArr2[outputLong] = this._quoteChar;
            return;
        }
        if (this._outputTail + 21 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputLong(j, this._outputBuffer, this._outputTail);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(SerializableString serializableString) {
        byte[] asUnquotedUTF8 = serializableString.asUnquotedUTF8();
        if (asUnquotedUTF8.length > 0) {
            _writeBytes(asUnquotedUTF8);
        }
    }

    /* access modifiers changed from: protected */
    public final void _writePPFieldName(SerializableString serializableString) {
        int writeFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (writeFieldName != 4) {
            if (writeFieldName == 1) {
                this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
            } else {
                this._cfgPrettyPrinter.beforeObjectEntries(this);
            }
            boolean z = !this._cfgUnqNames;
            if (z) {
                if (this._outputTail >= this._outputEnd) {
                    _flushBuffer();
                }
                byte[] bArr = this._outputBuffer;
                int i = this._outputTail;
                this._outputTail = i + 1;
                bArr[i] = this._quoteChar;
            }
            _writeBytes(serializableString.asQuotedUTF8());
            if (z) {
                if (this._outputTail >= this._outputEnd) {
                    _flushBuffer();
                }
                byte[] bArr2 = this._outputBuffer;
                int i2 = this._outputTail;
                this._outputTail = i2 + 1;
                bArr2[i2] = this._quoteChar;
                return;
            }
            return;
        }
        throw new JsonGenerationException("Can not write a field name, expecting a value", this);
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i) {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = this._quoteChar;
        byte[] allocBase64Buffer = this._ioContext.allocBase64Buffer();
        if (i < 0) {
            try {
                i = _writeBinary(base64Variant, inputStream, allocBase64Buffer);
            } catch (Throwable th) {
                this._ioContext.releaseBase64Buffer(allocBase64Buffer);
                throw th;
            }
        } else {
            int _writeBinary = _writeBinary(base64Variant, inputStream, allocBase64Buffer, i);
            if (_writeBinary > 0) {
                throw new JsonGenerationException("Too few bytes available: missing " + _writeBinary + " bytes (out of " + i + ")", this);
            }
        }
        this._ioContext.releaseBase64Buffer(allocBase64Buffer);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr2[i3] = this._quoteChar;
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        r1 = r10 + 1;
        r10 = r9[r10];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r10 >= 2048) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r5 = r8._outputTail;
        r6 = r5 + 1;
        r8._outputTail = r6;
        r0[r5] = (byte) ((r10 >> 6) | 192);
        r8._outputTail = r6 + 1;
        r0[r6] = (byte) ((r10 & '?') | 128);
        r10 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        r10 = _outputRawMultiByteChar(r10, r9, r1, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        r0 = r10 + 1;
        r10 = r9[r10];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        if (r10 >= 2048) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
        r1 = r8._outputBuffer;
        r2 = r8._outputTail;
        r5 = r2 + 1;
        r8._outputTail = r5;
        r1[r2] = (byte) ((r10 >> 6) | 192);
        r8._outputTail = r5 + 1;
        r1[r5] = (byte) ((r10 & '?') | 128);
        r10 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008a, code lost:
        r10 = _outputRawMultiByteChar(r10, r9, r0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if ((r8._outputTail + 3) < r8._outputEnd) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        _flushBuffer();
     */
    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeRaw(char[] r9, int r10, int r11) {
        /*
            r8 = this;
            int r0 = r11 + r11
            int r0 = r0 + r11
            int r1 = r8._outputTail
            int r1 = r1 + r0
            int r2 = r8._outputEnd
            r3 = 2048(0x800, float:2.87E-42)
            r4 = 128(0x80, float:1.794E-43)
            if (r1 <= r2) goto L_0x0060
            if (r2 >= r0) goto L_0x005d
            byte[] r0 = r8._outputBuffer
            int r11 = r11 + r10
        L_0x0013:
            if (r10 >= r11) goto L_0x005c
        L_0x0015:
            char r1 = r9[r10]
            if (r1 < r4) goto L_0x0048
            int r1 = r8._outputTail
            int r1 = r1 + 3
            int r5 = r8._outputEnd
            if (r1 < r5) goto L_0x0024
            r8._flushBuffer()
        L_0x0024:
            int r1 = r10 + 1
            char r10 = r9[r10]
            if (r10 >= r3) goto L_0x0043
            int r5 = r8._outputTail
            int r6 = r5 + 1
            r8._outputTail = r6
            int r7 = r10 >> 6
            r7 = r7 | 192(0xc0, float:2.69E-43)
            byte r7 = (byte) r7
            r0[r5] = r7
            int r5 = r6 + 1
            r8._outputTail = r5
            r10 = r10 & 63
            r10 = r10 | r4
            byte r10 = (byte) r10
            r0[r6] = r10
            r10 = r1
            goto L_0x0013
        L_0x0043:
            int r10 = r8._outputRawMultiByteChar(r10, r9, r1, r11)
            goto L_0x0013
        L_0x0048:
            int r5 = r8._outputTail
            if (r5 < r2) goto L_0x004f
            r8._flushBuffer()
        L_0x004f:
            int r5 = r8._outputTail
            int r6 = r5 + 1
            r8._outputTail = r6
            byte r1 = (byte) r1
            r0[r5] = r1
            int r10 = r10 + 1
            if (r10 < r11) goto L_0x0015
        L_0x005c:
            return
        L_0x005d:
            r8._flushBuffer()
        L_0x0060:
            int r11 = r11 + r10
        L_0x0061:
            if (r10 >= r11) goto L_0x009e
        L_0x0063:
            char r0 = r9[r10]
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L_0x008f
            int r0 = r10 + 1
            char r10 = r9[r10]
            if (r10 >= r3) goto L_0x008a
            byte[] r1 = r8._outputBuffer
            int r2 = r8._outputTail
            int r5 = r2 + 1
            r8._outputTail = r5
            int r6 = r10 >> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r1[r2] = r6
            int r2 = r5 + 1
            r8._outputTail = r2
            r10 = r10 & 63
            r10 = r10 | r4
            byte r10 = (byte) r10
            r1[r5] = r10
            r10 = r0
            goto L_0x0061
        L_0x008a:
            int r10 = r8._outputRawMultiByteChar(r10, r9, r0, r11)
            goto L_0x0061
        L_0x008f:
            byte[] r1 = r8._outputBuffer
            int r2 = r8._outputTail
            int r5 = r2 + 1
            r8._outputTail = r5
            byte r0 = (byte) r0
            r1[r2] = r0
            int r10 = r10 + 1
            if (r10 < r11) goto L_0x0063
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8JsonGenerator.writeRaw(char[], int, int):void");
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public final void writeString(SerializableString serializableString) {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        int i2 = i + 1;
        this._outputTail = i2;
        bArr[i] = this._quoteChar;
        int appendQuotedUTF8 = serializableString.appendQuotedUTF8(bArr, i2);
        if (appendQuotedUTF8 < 0) {
            _writeBytes(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += appendQuotedUTF8;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr2[i3] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(SerializableString serializableString) {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(serializableString);
            return;
        }
        int writeFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (writeFieldName != 4) {
            if (writeFieldName == 1) {
                if (this._outputTail >= this._outputEnd) {
                    _flushBuffer();
                }
                byte[] bArr = this._outputBuffer;
                int i = this._outputTail;
                this._outputTail = i + 1;
                bArr[i] = 44;
            }
            if (this._cfgUnqNames) {
                int appendQuotedUTF8 = serializableString.appendQuotedUTF8(this._outputBuffer, this._outputTail);
                if (appendQuotedUTF8 < 0) {
                    _writeBytes(serializableString.asQuotedUTF8());
                } else {
                    this._outputTail += appendQuotedUTF8;
                }
            } else {
                if (this._outputTail >= this._outputEnd) {
                    _flushBuffer();
                }
                byte[] bArr2 = this._outputBuffer;
                int i2 = this._outputTail;
                int i3 = i2 + 1;
                this._outputTail = i3;
                bArr2[i2] = this._quoteChar;
                int appendQuotedUTF82 = serializableString.appendQuotedUTF8(bArr2, i3);
                if (appendQuotedUTF82 < 0) {
                    _writeBytes(serializableString.asQuotedUTF8());
                } else {
                    this._outputTail += appendQuotedUTF82;
                }
                if (this._outputTail >= this._outputEnd) {
                    _flushBuffer();
                }
                byte[] bArr3 = this._outputBuffer;
                int i4 = this._outputTail;
                this._outputTail = i4 + 1;
                bArr3[i4] = this._quoteChar;
            }
        } else {
            throw new JsonGenerationException("Can not write a field name, expecting a value", this);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigInteger bigInteger) {
        _verifyValueWrite("write a number");
        if (bigInteger == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(bigInteger.toString());
        } else {
            writeRaw(bigInteger.toString());
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(double d) {
        if (this._cfgNumbersAsStrings || ((Double.isNaN(d) || Double.isInfinite(d)) && JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this._features))) {
            writeString(String.valueOf(d));
            return;
        }
        _verifyValueWrite("write a number");
        writeRaw(String.valueOf(d));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(float f) {
        if (this._cfgNumbersAsStrings || ((Float.isNaN(f) || Float.isInfinite(f)) && JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this._features))) {
            writeString(String.valueOf(f));
            return;
        }
        _verifyValueWrite("write a number");
        writeRaw(String.valueOf(f));
    }

    private final void _writeStringSegment(String str, int i, int i2) {
        int i3;
        int i4;
        char charAt;
        int i5 = i2 + i;
        int i6 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i < i5 && (charAt = str.charAt(i)) <= 127 && iArr[charAt] == 0) {
            bArr[i6] = (byte) charAt;
            i++;
            i6++;
        }
        this._outputTail = i6;
        if (i >= i5) {
            return;
        }
        if (this._maximumNonEscapedChar == 0) {
            if (((i5 - i) * 6) + i6 > this._outputEnd) {
                _flushBuffer();
            }
            int i7 = this._outputTail;
            byte[] bArr2 = this._outputBuffer;
            int[] iArr2 = this._outputEscapes;
            while (i < i5) {
                int i8 = i + 1;
                char charAt2 = str.charAt(i);
                if (charAt2 <= 127) {
                    if (iArr2[charAt2] == 0) {
                        bArr2[i7] = (byte) charAt2;
                        i = i8;
                        i7++;
                    } else {
                        int i9 = iArr2[charAt2];
                        if (i9 > 0) {
                            int i10 = i7 + 1;
                            bArr2[i7] = 92;
                            i7 = i10 + 1;
                            bArr2[i10] = (byte) i9;
                            i = i8;
                        } else {
                            i4 = _writeGenericEscape(charAt2, i7);
                        }
                    }
                } else if (charAt2 <= 2047) {
                    int i11 = i7 + 1;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    i7 = i11 + 1;
                    bArr2[i11] = (byte) ((charAt2 & '?') | 128);
                    i = i8;
                } else {
                    i4 = _outputMultiByteChar(charAt2, i7);
                }
                i7 = i4;
                i = i8;
            }
            this._outputTail = i7;
            return;
        }
        if (((i5 - i) * 6) + i6 > this._outputEnd) {
            _flushBuffer();
        }
        int i12 = this._outputTail;
        byte[] bArr3 = this._outputBuffer;
        int[] iArr3 = this._outputEscapes;
        int i13 = this._maximumNonEscapedChar;
        while (i < i5) {
            int i14 = i + 1;
            char charAt3 = str.charAt(i);
            if (charAt3 <= 127) {
                if (iArr3[charAt3] == 0) {
                    bArr3[i12] = (byte) charAt3;
                    i = i14;
                    i12++;
                } else {
                    int i15 = iArr3[charAt3];
                    if (i15 > 0) {
                        int i16 = i12 + 1;
                        bArr3[i12] = 92;
                        i12 = i16 + 1;
                        bArr3[i16] = (byte) i15;
                        i = i14;
                    } else {
                        i3 = _writeGenericEscape(charAt3, i12);
                    }
                }
            } else if (charAt3 > i13) {
                i3 = _writeGenericEscape(charAt3, i12);
            } else if (charAt3 <= 2047) {
                int i17 = i12 + 1;
                bArr3[i12] = (byte) ((charAt3 >> 6) | 192);
                i12 = i17 + 1;
                bArr3[i17] = (byte) ((charAt3 & '?') | 128);
                i = i14;
            } else {
                i3 = _outputMultiByteChar(charAt3, i12);
            }
            i12 = i3;
            i = i14;
        }
        this._outputTail = i12;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char c) {
        if (this._outputTail + 3 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        if (c <= 127) {
            int i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = (byte) c;
        } else if (c < 2048) {
            int i2 = this._outputTail;
            int i3 = i2 + 1;
            this._outputTail = i3;
            bArr[i2] = (byte) ((c >> 6) | 192);
            this._outputTail = i3 + 1;
            bArr[i3] = (byte) ((c & '?') | 128);
        } else {
            _outputRawMultiByteChar(c, null, 0, 0);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigDecimal bigDecimal) {
        _verifyValueWrite("write a number");
        if (bigDecimal == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(_asString(bigDecimal));
        } else {
            writeRaw(_asString(bigDecimal));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(String str) {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(str);
        } else {
            writeRaw(str);
        }
    }
}
