package org.msgpack.jackson.dataformat;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.io.IOContext;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Arrays;

public class MessagePackFactory extends JsonFactory {
    private static final long serialVersionUID = 2578263992015504347L;

    public MessagePackFactory() {
        super(null);
    }

    /* access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.core.JsonFactory
    public JsonParser _createParser(InputStream inputStream, IOContext iOContext) {
        return new b(iOContext, this._parserFeatures, this._objectCodec, inputStream);
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) {
        return new a(this._generatorFeatures, this._objectCodec, outputStream);
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public JsonParser createParser(InputStream inputStream) {
        return new b(new IOContext(_getBufferRecycler(), inputStream, false), this._parserFeatures, this._objectCodec, inputStream);
    }

    /* access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.core.JsonFactory
    public JsonParser _createParser(byte[] bArr, int i, int i2, IOContext iOContext) {
        if (!(i == 0 && i2 == bArr.length)) {
            bArr = Arrays.copyOfRange(bArr, i, i2 + i);
        }
        return new b(iOContext, this._parserFeatures, this._objectCodec, bArr);
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) {
        return createGenerator(new FileOutputStream(file), jsonEncoding);
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public JsonGenerator createGenerator(Writer writer) {
        throw new UnsupportedOperationException();
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public JsonParser createParser(byte[] bArr) {
        return _createParser(bArr, 0, bArr.length, new IOContext(_getBufferRecycler(), bArr, false));
    }
}
