package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.filter.TokenFilter;
import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

public class ObjectReader extends ObjectCodec implements Serializable {
    private static final JavaType JSON_NODE_TYPE = SimpleType.constructUnsafe(JsonNode.class);
    private static final long serialVersionUID = 2;
    protected final DeserializationConfig _config;
    protected final DefaultDeserializationContext _context;
    protected final DataFormatReaders _dataFormatReaders;
    private final TokenFilter _filter;
    protected final InjectableValues _injectableValues;
    protected final JsonFactory _parserFactory;
    protected final JsonDeserializer<Object> _rootDeserializer;
    protected final ConcurrentHashMap<JavaType, JsonDeserializer<Object>> _rootDeserializers;
    protected final FormatSchema _schema;
    protected final boolean _unwrapRoot;
    protected final Object _valueToUpdate;
    protected final JavaType _valueType;

    protected ObjectReader(ObjectMapper objectMapper, DeserializationConfig deserializationConfig, JavaType javaType, Object obj, FormatSchema formatSchema) {
        this._config = deserializationConfig;
        this._context = objectMapper._deserializationContext;
        this._rootDeserializers = objectMapper._rootDeserializers;
        this._parserFactory = objectMapper._jsonFactory;
        this._valueType = javaType;
        this._valueToUpdate = obj;
        this._schema = formatSchema;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._rootDeserializer = _prefetchRootDeserializer(javaType);
        this._filter = null;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> _findRootDeserializer(DeserializationContext deserializationContext) {
        JsonDeserializer<Object> jsonDeserializer = this._rootDeserializer;
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        JavaType javaType = this._valueType;
        if (javaType != null) {
            JsonDeserializer<Object> jsonDeserializer2 = this._rootDeserializers.get(javaType);
            if (jsonDeserializer2 != null) {
                return jsonDeserializer2;
            }
            JsonDeserializer<Object> findRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
            if (findRootValueDeserializer != null) {
                this._rootDeserializers.put(javaType, findRootValueDeserializer);
                return findRootValueDeserializer;
            }
            throw InvalidDefinitionException.from(deserializationContext._parser, "Cannot find a deserializer for type " + javaType, javaType);
        }
        deserializationContext.reportBadDefinition((JavaType) null, "No value type configured for ObjectReader");
        throw null;
    }

    /* access modifiers changed from: protected */
    public JsonToken _initForReading(DeserializationContext deserializationContext, JsonParser jsonParser) {
        FormatSchema formatSchema = this._schema;
        if (formatSchema != null) {
            jsonParser.setSchema(formatSchema);
        }
        this._config.initialize(jsonParser);
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken != null || (currentToken = jsonParser.nextToken()) != null) {
            return currentToken;
        }
        deserializationContext.reportInputMismatch(this._valueType, "No content to map due to end-of-input", new Object[0]);
        throw null;
    }

    /* access modifiers changed from: protected */
    public ObjectReader _new(ObjectReader objectReader, DeserializationConfig deserializationConfig, JavaType javaType, JsonDeserializer<Object> jsonDeserializer, Object obj, FormatSchema formatSchema, InjectableValues injectableValues, DataFormatReaders dataFormatReaders) {
        return new ObjectReader(objectReader, deserializationConfig, javaType, jsonDeserializer, obj, formatSchema);
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> _prefetchRootDeserializer(JavaType javaType) {
        if (javaType == null || !this._config.isEnabled(DeserializationFeature.EAGER_DESERIALIZER_FETCH)) {
            return null;
        }
        JsonDeserializer<Object> jsonDeserializer = this._rootDeserializers.get(javaType);
        if (jsonDeserializer == null) {
            try {
                jsonDeserializer = createDeserializationContext(null).findRootValueDeserializer(javaType);
                if (jsonDeserializer != null) {
                    this._rootDeserializers.put(javaType, jsonDeserializer);
                }
            } catch (JsonProcessingException unused) {
            }
        }
        return jsonDeserializer;
    }

    /* access modifiers changed from: protected */
    public Object _unwrapAndDeserialize(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType, JsonDeserializer<Object> jsonDeserializer) {
        Object obj;
        String str = this._config.findRootName(javaType)._simpleName;
        JsonToken currentToken = jsonParser.getCurrentToken();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        if (currentToken == jsonToken) {
            JsonToken nextToken = jsonParser.nextToken();
            JsonToken jsonToken2 = JsonToken.FIELD_NAME;
            if (nextToken == jsonToken2) {
                Object currentName = jsonParser.getCurrentName();
                if (str.equals(currentName)) {
                    jsonParser.nextToken();
                    Object obj2 = this._valueToUpdate;
                    if (obj2 == null) {
                        obj = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                    } else {
                        jsonDeserializer.deserialize(jsonParser, deserializationContext, obj2);
                        obj = this._valueToUpdate;
                    }
                    JsonToken nextToken2 = jsonParser.nextToken();
                    JsonToken jsonToken3 = JsonToken.END_OBJECT;
                    if (nextToken2 == jsonToken3) {
                        if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
                            _verifyNoTrailingTokens(jsonParser, deserializationContext, this._valueType);
                        }
                        return obj;
                    }
                    deserializationContext.reportWrongTokenException(javaType, jsonToken3, "Current token not END_OBJECT (to match wrapper object with root name '%s'), but %s", str, jsonParser.getCurrentToken());
                    throw null;
                }
                throw MismatchedInputException.from(deserializationContext._parser, javaType, deserializationContext._format("Root name '%s' does not match expected ('%s') for type %s", currentName, str, javaType));
            }
            deserializationContext.reportWrongTokenException(javaType, jsonToken2, "Current token not FIELD_NAME (to contain expected root name '%s'), but %s", str, jsonParser.getCurrentToken());
            throw null;
        }
        deserializationContext.reportWrongTokenException(javaType, jsonToken, "Current token not START_OBJECT (needed to unwrap root name '%s'), but %s", str, jsonParser.getCurrentToken());
        throw null;
    }

    /* access modifiers changed from: protected */
    public final void _verifyNoTrailingTokens(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) {
        Object obj;
        JsonToken nextToken = jsonParser.nextToken();
        if (nextToken != null) {
            Class<?> rawClass = ClassUtil.rawClass(javaType);
            if (rawClass == null && (obj = this._valueToUpdate) != null) {
                rawClass = obj.getClass();
            }
            deserializationContext.reportTrailingTokens(rawClass, jsonParser, nextToken);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public DefaultDeserializationContext createDeserializationContext(JsonParser jsonParser) {
        return this._context.createInstance(this._config, null, this._injectableValues);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T extends TreeNode> T readTree(JsonParser jsonParser) {
        Object obj;
        this._config.initialize(jsonParser);
        FormatSchema formatSchema = this._schema;
        if (formatSchema != null) {
            jsonParser.setSchema(formatSchema);
        }
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == null && (currentToken = jsonParser.nextToken()) == null) {
            return null;
        }
        DefaultDeserializationContext createInstance = this._context.createInstance(this._config, jsonParser, this._injectableValues);
        if (currentToken == JsonToken.VALUE_NULL) {
            createInstance._config._nodeFactory.getClass();
            return NullNode.instance;
        }
        ConcurrentHashMap<JavaType, JsonDeserializer<Object>> concurrentHashMap = this._rootDeserializers;
        JavaType javaType = JSON_NODE_TYPE;
        JsonDeserializer<Object> jsonDeserializer = concurrentHashMap.get(javaType);
        if (jsonDeserializer == null) {
            jsonDeserializer = createInstance.findRootValueDeserializer(javaType);
            if (jsonDeserializer != null) {
                this._rootDeserializers.put(javaType, jsonDeserializer);
            } else {
                throw InvalidDefinitionException.from(createInstance._parser, "Cannot find a deserializer for type " + javaType, javaType);
            }
        }
        if (this._unwrapRoot) {
            obj = _unwrapAndDeserialize(jsonParser, createInstance, javaType, jsonDeserializer);
        } else {
            Object deserialize = jsonDeserializer.deserialize(jsonParser, createInstance);
            if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
                _verifyNoTrailingTokens(jsonParser, createInstance, javaType);
            }
            obj = deserialize;
        }
        return (JsonNode) obj;
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> T readValue(JsonParser jsonParser, Class<T> cls) {
        ObjectReader objectReader;
        JavaType constructType = this._config.constructType(cls);
        if (constructType == null || !constructType.equals(this._valueType)) {
            JsonDeserializer<Object> _prefetchRootDeserializer = _prefetchRootDeserializer(constructType);
            DataFormatReaders dataFormatReaders = this._dataFormatReaders;
            if (dataFormatReaders == null) {
                objectReader = _new(this, this._config, constructType, _prefetchRootDeserializer, this._valueToUpdate, this._schema, this._injectableValues, dataFormatReaders);
            } else {
                throw null;
            }
        } else {
            objectReader = this;
        }
        T t = (T) objectReader._valueToUpdate;
        DefaultDeserializationContext createInstance = objectReader._context.createInstance(objectReader._config, jsonParser, objectReader._injectableValues);
        JsonToken _initForReading = objectReader._initForReading(createInstance, jsonParser);
        if (_initForReading == JsonToken.VALUE_NULL) {
            if (t == null) {
                t = (T) objectReader._findRootDeserializer(createInstance).getNullValue(createInstance);
            }
        } else if (!(_initForReading == JsonToken.END_ARRAY || _initForReading == JsonToken.END_OBJECT)) {
            JsonDeserializer<Object> _findRootDeserializer = objectReader._findRootDeserializer(createInstance);
            t = objectReader._unwrapRoot ? (T) objectReader._unwrapAndDeserialize(jsonParser, createInstance, objectReader._valueType, _findRootDeserializer) : t == null ? (T) _findRootDeserializer.deserialize(jsonParser, createInstance) : (T) _findRootDeserializer.deserialize(jsonParser, createInstance, t);
        }
        jsonParser.clearCurrentToken();
        if (objectReader._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            objectReader._verifyNoTrailingTokens(jsonParser, createInstance, objectReader._valueType);
        }
        return t;
    }

    public JsonParser treeAsTokens(TreeNode treeNode) {
        ObjectReader objectReader;
        if (this._valueToUpdate == null) {
            objectReader = this;
        } else {
            objectReader = _new(this, this._config, this._valueType, this._rootDeserializer, null, this._schema, this._injectableValues, this._dataFormatReaders);
        }
        return new TreeTraversingParser((JsonNode) treeNode, objectReader);
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> T treeToValue(TreeNode treeNode, Class<T> cls) {
        try {
            return (T) readValue(treeAsTokens(treeNode), cls);
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public ObjectReader withRootName(String str) {
        DeserializationConfig deserializationConfig = this._config;
        deserializationConfig.getClass();
        DeserializationConfig deserializationConfig2 = (DeserializationConfig) deserializationConfig.withRootName(PropertyName.construct(str));
        if (deserializationConfig2 == this._config) {
            return this;
        }
        ObjectReader objectReader = new ObjectReader(this, deserializationConfig2);
        if (this._dataFormatReaders == null) {
            return objectReader;
        }
        throw null;
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public void writeValue(JsonGenerator jsonGenerator, Object obj) {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }

    /* JADX WARN: Incorrect args count in method signature: (Lcom/fasterxml/jackson/databind/ObjectReader;Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/JsonDeserializer<Ljava/lang/Object;>;Ljava/lang/Object;Lcom/fasterxml/jackson/core/FormatSchema;Lcom/fasterxml/jackson/databind/InjectableValues;Lcom/fasterxml/jackson/databind/deser/DataFormatReaders;)V */
    protected ObjectReader(ObjectReader objectReader, DeserializationConfig deserializationConfig, JavaType javaType, JsonDeserializer jsonDeserializer, Object obj, FormatSchema formatSchema) {
        this._config = deserializationConfig;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = objectReader._parserFactory;
        this._valueType = javaType;
        this._rootDeserializer = jsonDeserializer;
        this._valueToUpdate = obj;
        this._schema = formatSchema;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._filter = objectReader._filter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0081, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T readValue(java.io.Reader r5) {
        /*
            r4 = this;
            com.fasterxml.jackson.databind.deser.DataFormatReaders r0 = r4._dataFormatReaders
            if (r0 != 0) goto L_0x0082
            com.fasterxml.jackson.core.JsonFactory r0 = r4._parserFactory
            com.fasterxml.jackson.core.JsonParser r5 = r0.createParser(r5)
            com.fasterxml.jackson.core.filter.TokenFilter r0 = r4._filter
            if (r0 == 0) goto L_0x0020
            java.lang.Class<com.fasterxml.jackson.core.filter.FilteringParserDelegate> r0 = com.fasterxml.jackson.core.filter.FilteringParserDelegate.class
            boolean r0 = r0.isInstance(r5)
            if (r0 == 0) goto L_0x0017
            goto L_0x0020
        L_0x0017:
            com.fasterxml.jackson.core.filter.FilteringParserDelegate r0 = new com.fasterxml.jackson.core.filter.FilteringParserDelegate
            com.fasterxml.jackson.core.filter.TokenFilter r1 = r4._filter
            r2 = 0
            r0.<init>(r5, r1, r2, r2)
            r5 = r0
        L_0x0020:
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext r0 = r4._context     // Catch:{ all -> 0x007b }
            com.fasterxml.jackson.databind.DeserializationConfig r1 = r4._config     // Catch:{ all -> 0x007b }
            com.fasterxml.jackson.databind.InjectableValues r2 = r4._injectableValues     // Catch:{ all -> 0x007b }
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext r0 = r0.createInstance(r1, r5, r2)     // Catch:{ all -> 0x007b }
            com.fasterxml.jackson.core.JsonToken r1 = r4._initForReading(r0, r5)     // Catch:{ all -> 0x007b }
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ all -> 0x007b }
            if (r1 != r2) goto L_0x003f
            java.lang.Object r1 = r4._valueToUpdate     // Catch:{ all -> 0x007b }
            if (r1 != 0) goto L_0x0068
            com.fasterxml.jackson.databind.JsonDeserializer r1 = r4._findRootDeserializer(r0)     // Catch:{ all -> 0x007b }
            java.lang.Object r1 = r1.getNullValue(r0)     // Catch:{ all -> 0x007b }
            goto L_0x0068
        L_0x003f:
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ all -> 0x007b }
            if (r1 == r2) goto L_0x0066
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ all -> 0x007b }
            if (r1 != r2) goto L_0x0048
            goto L_0x0066
        L_0x0048:
            com.fasterxml.jackson.databind.JsonDeserializer r1 = r4._findRootDeserializer(r0)     // Catch:{ all -> 0x007b }
            boolean r2 = r4._unwrapRoot     // Catch:{ all -> 0x007b }
            if (r2 == 0) goto L_0x0057
            com.fasterxml.jackson.databind.JavaType r2 = r4._valueType     // Catch:{ all -> 0x007b }
            java.lang.Object r1 = r4._unwrapAndDeserialize(r5, r0, r2, r1)     // Catch:{ all -> 0x007b }
            goto L_0x0068
        L_0x0057:
            java.lang.Object r2 = r4._valueToUpdate     // Catch:{ all -> 0x007b }
            if (r2 != 0) goto L_0x0060
            java.lang.Object r1 = r1.deserialize(r5, r0)     // Catch:{ all -> 0x007b }
            goto L_0x0068
        L_0x0060:
            r1.deserialize(r5, r0, r2)     // Catch:{ all -> 0x007b }
            java.lang.Object r1 = r4._valueToUpdate     // Catch:{ all -> 0x007b }
            goto L_0x0068
        L_0x0066:
            java.lang.Object r1 = r4._valueToUpdate     // Catch:{ all -> 0x007b }
        L_0x0068:
            com.fasterxml.jackson.databind.DeserializationConfig r2 = r4._config     // Catch:{ all -> 0x007b }
            com.fasterxml.jackson.databind.DeserializationFeature r3 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_TRAILING_TOKENS     // Catch:{ all -> 0x007b }
            boolean r2 = r2.isEnabled(r3)     // Catch:{ all -> 0x007b }
            if (r2 == 0) goto L_0x0077
            com.fasterxml.jackson.databind.JavaType r2 = r4._valueType     // Catch:{ all -> 0x007b }
            r4._verifyNoTrailingTokens(r5, r0, r2)     // Catch:{ all -> 0x007b }
        L_0x0077:
            r5.close()
            return r1
        L_0x007b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x007d }
        L_0x007d:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0081 }
        L_0x0081:
            throw r0
        L_0x0082:
            com.fasterxml.jackson.core.JsonParseException r0 = new com.fasterxml.jackson.core.JsonParseException
            java.lang.String r1 = "Cannot use source of type "
            java.lang.StringBuilder r1 = defpackage.je.V0(r1)
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r1.append(r5)
            java.lang.String r5 = " with format auto-detection: must be byte- not char-based"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r1 = 0
            r0.<init>(r1, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectReader.readValue(java.io.Reader):java.lang.Object");
    }

    protected ObjectReader(ObjectReader objectReader, DeserializationConfig deserializationConfig) {
        this._config = deserializationConfig;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = objectReader._parserFactory;
        this._valueType = objectReader._valueType;
        this._rootDeserializer = objectReader._rootDeserializer;
        this._valueToUpdate = objectReader._valueToUpdate;
        this._schema = objectReader._schema;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._filter = objectReader._filter;
    }
}
