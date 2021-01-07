package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.InputDecorator;
import com.fasterxml.jackson.core.io.OutputDecorator;
import com.fasterxml.jackson.core.io.UTF8Writer;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.BufferRecyclers;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;

public class JsonFactory implements Serializable {
    protected static final int DEFAULT_FACTORY_FEATURE_FLAGS = Feature.collectDefaults();
    protected static final int DEFAULT_GENERATOR_FEATURE_FLAGS = JsonGenerator.Feature.collectDefaults();
    protected static final int DEFAULT_PARSER_FEATURE_FLAGS = JsonParser.Feature.collectDefaults();
    private static final SerializableString DEFAULT_ROOT_VALUE_SEPARATOR = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
    private static final long serialVersionUID = 1;
    protected final transient ByteQuadsCanonicalizer _byteSymbolCanonicalizer;
    protected CharacterEscapes _characterEscapes;
    protected int _factoryFeatures;
    protected int _generatorFeatures;
    protected InputDecorator _inputDecorator;
    protected ObjectCodec _objectCodec;
    protected OutputDecorator _outputDecorator;
    protected int _parserFeatures;
    protected final transient CharsToNameCanonicalizer _rootCharSymbols;
    protected SerializableString _rootValueSeparator;

    public enum Feature {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);
        
        private final boolean _defaultState;

        private Feature(boolean z) {
            this._defaultState = z;
        }

        public static int collectDefaults() {
            Feature[] values = values();
            int i = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                Feature feature = values[i2];
                if (feature._defaultState) {
                    i |= 1 << feature.ordinal();
                }
            }
            return i;
        }

        public boolean enabledIn(int i) {
            return (i & (1 << ordinal())) != 0;
        }
    }

    public JsonFactory() {
        this(null);
    }

    /* access modifiers changed from: protected */
    public JsonGenerator _createGenerator(Writer writer, IOContext iOContext) {
        WriterBasedJsonGenerator writerBasedJsonGenerator = new WriterBasedJsonGenerator(iOContext, this._generatorFeatures, this._objectCodec, writer);
        CharacterEscapes characterEscapes = this._characterEscapes;
        if (characterEscapes != null) {
            writerBasedJsonGenerator.setCharacterEscapes(characterEscapes);
        }
        SerializableString serializableString = this._rootValueSeparator;
        if (serializableString != DEFAULT_ROOT_VALUE_SEPARATOR) {
            writerBasedJsonGenerator.setRootValueSeparator(serializableString);
        }
        return writerBasedJsonGenerator;
    }

    /* access modifiers changed from: protected */
    public JsonParser _createParser(InputStream inputStream, IOContext iOContext) {
        return new ByteSourceJsonBootstrapper(iOContext, inputStream).constructParser(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
    }

    /* access modifiers changed from: protected */
    public JsonGenerator _createUTF8Generator(OutputStream outputStream, IOContext iOContext) {
        UTF8JsonGenerator uTF8JsonGenerator = new UTF8JsonGenerator(iOContext, this._generatorFeatures, this._objectCodec, outputStream);
        CharacterEscapes characterEscapes = this._characterEscapes;
        if (characterEscapes != null) {
            uTF8JsonGenerator.setCharacterEscapes(characterEscapes);
        }
        SerializableString serializableString = this._rootValueSeparator;
        if (serializableString != DEFAULT_ROOT_VALUE_SEPARATOR) {
            uTF8JsonGenerator.setRootValueSeparator(serializableString);
        }
        return uTF8JsonGenerator;
    }

    public BufferRecycler _getBufferRecycler() {
        if (Feature.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.enabledIn(this._factoryFeatures)) {
            return BufferRecyclers.getBufferRecycler();
        }
        return new BufferRecycler();
    }

    public final JsonFactory configure(JsonParser.Feature feature, boolean z) {
        if (z) {
            this._parserFeatures = feature.getMask() | this._parserFeatures;
        } else {
            this._parserFeatures = (feature.getMask() ^ -1) & this._parserFeatures;
        }
        return this;
    }

    public JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) {
        Writer writer;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        IOContext iOContext = new IOContext(_getBufferRecycler(), fileOutputStream, true);
        iOContext.setEncoding(jsonEncoding);
        JsonEncoding jsonEncoding2 = JsonEncoding.UTF8;
        if (jsonEncoding != jsonEncoding2) {
            if (jsonEncoding == jsonEncoding2) {
                writer = new UTF8Writer(iOContext, fileOutputStream);
            } else {
                writer = new OutputStreamWriter(fileOutputStream, jsonEncoding.getJavaName());
            }
            if (this._outputDecorator == null) {
                return _createGenerator(writer, iOContext);
            }
            throw null;
        } else if (this._outputDecorator == null) {
            return _createUTF8Generator(fileOutputStream, iOContext);
        } else {
            throw null;
        }
    }

    public JsonParser createParser(String str) {
        int length = str.length();
        if (this._inputDecorator != null || length > 32768) {
            return createParser(new StringReader(str));
        }
        IOContext iOContext = new IOContext(_getBufferRecycler(), str, true);
        char[] allocTokenBuffer = iOContext.allocTokenBuffer(length);
        str.getChars(0, length, allocTokenBuffer, 0);
        return new ReaderBasedJsonParser(iOContext, this._parserFeatures, null, this._objectCodec, this._rootCharSymbols.makeChild(this._factoryFeatures), allocTokenBuffer, 0, 0 + length, true);
    }

    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    /* access modifiers changed from: protected */
    public Object readResolve() {
        return new JsonFactory(this, this._objectCodec);
    }

    public JsonFactory setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
        return this;
    }

    public JsonFactory(ObjectCodec objectCodec) {
        this._rootCharSymbols = CharsToNameCanonicalizer.createRoot();
        this._byteSymbolCanonicalizer = ByteQuadsCanonicalizer.createRoot();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = objectCodec;
    }

    /* access modifiers changed from: protected */
    public JsonParser _createParser(byte[] bArr, int i, int i2, IOContext iOContext) {
        return new ByteSourceJsonBootstrapper(iOContext, bArr, i, i2).constructParser(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
    }

    public final JsonFactory configure(JsonGenerator.Feature feature, boolean z) {
        if (z) {
            this._generatorFeatures = feature.getMask() | this._generatorFeatures;
        } else {
            this._generatorFeatures = (feature.getMask() ^ -1) & this._generatorFeatures;
        }
        return this;
    }

    public JsonParser createParser(File file) {
        IOContext iOContext = new IOContext(_getBufferRecycler(), file, true);
        FileInputStream fileInputStream = new FileInputStream(file);
        if (this._inputDecorator == null) {
            return _createParser(fileInputStream, iOContext);
        }
        throw null;
    }

    protected JsonFactory(JsonFactory jsonFactory, ObjectCodec objectCodec) {
        this._rootCharSymbols = CharsToNameCanonicalizer.createRoot();
        this._byteSymbolCanonicalizer = ByteQuadsCanonicalizer.createRoot();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = objectCodec;
        this._factoryFeatures = jsonFactory._factoryFeatures;
        this._parserFeatures = jsonFactory._parserFeatures;
        this._generatorFeatures = jsonFactory._generatorFeatures;
        this._rootValueSeparator = jsonFactory._rootValueSeparator;
    }

    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) {
        Writer writer;
        IOContext iOContext = new IOContext(_getBufferRecycler(), outputStream, false);
        iOContext.setEncoding(jsonEncoding);
        JsonEncoding jsonEncoding2 = JsonEncoding.UTF8;
        if (jsonEncoding != jsonEncoding2) {
            if (jsonEncoding == jsonEncoding2) {
                writer = new UTF8Writer(iOContext, outputStream);
            } else {
                writer = new OutputStreamWriter(outputStream, jsonEncoding.getJavaName());
            }
            if (this._outputDecorator == null) {
                return _createGenerator(writer, iOContext);
            }
            throw null;
        } else if (this._outputDecorator == null) {
            return _createUTF8Generator(outputStream, iOContext);
        } else {
            throw null;
        }
    }

    public JsonParser createParser(InputStream inputStream) {
        IOContext iOContext = new IOContext(_getBufferRecycler(), inputStream, false);
        if (this._inputDecorator == null) {
            return _createParser(inputStream, iOContext);
        }
        throw null;
    }

    public JsonParser createParser(Reader reader) {
        IOContext iOContext = new IOContext(_getBufferRecycler(), reader, false);
        if (this._inputDecorator == null) {
            return new ReaderBasedJsonParser(iOContext, this._parserFeatures, reader, this._objectCodec, this._rootCharSymbols.makeChild(this._factoryFeatures));
        }
        throw null;
    }

    public JsonParser createParser(byte[] bArr) {
        IOContext iOContext = new IOContext(_getBufferRecycler(), bArr, true);
        if (this._inputDecorator == null) {
            return _createParser(bArr, 0, bArr.length, iOContext);
        }
        int length = bArr.length;
        throw null;
    }

    public JsonGenerator createGenerator(Writer writer) {
        IOContext iOContext = new IOContext(_getBufferRecycler(), writer, false);
        if (this._outputDecorator == null) {
            return _createGenerator(writer, iOContext);
        }
        throw null;
    }
}
