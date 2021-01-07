package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.io.SegmentedStringWriter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.Instantiatable;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.datatype.guava.GuavaDeserializers;
import com.fasterxml.jackson.datatype.guava.GuavaSerializers;
import com.fasterxml.jackson.datatype.guava.GuavaTypeModifier;
import com.fasterxml.jackson.datatype.guava.PackageVersion;
import com.fasterxml.jackson.datatype.guava.ser.GuavaBeanSerializerModifier;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ObjectMapper extends ObjectCodec implements Serializable {
    protected static final AnnotationIntrospector DEFAULT_ANNOTATION_INTROSPECTOR;
    protected static final BaseSettings DEFAULT_BASE;
    private static final JavaType JSON_NODE_TYPE = SimpleType.constructUnsafe(JsonNode.class);
    private static final long serialVersionUID = 2;
    protected final ConfigOverrides _configOverrides;
    protected DeserializationConfig _deserializationConfig;
    protected DefaultDeserializationContext _deserializationContext;
    protected InjectableValues _injectableValues;
    protected final JsonFactory _jsonFactory;
    protected SimpleMixInResolver _mixIns;
    protected Set<Object> _registeredModuleTypes;
    protected final ConcurrentHashMap<JavaType, JsonDeserializer<Object>> _rootDeserializers;
    protected SerializationConfig _serializationConfig;
    protected SerializerFactory _serializerFactory;
    protected DefaultSerializerProvider _serializerProvider;
    protected SubtypeResolver _subtypeResolver;
    protected TypeFactory _typeFactory;

    static {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        DEFAULT_ANNOTATION_INTROSPECTOR = jacksonAnnotationIntrospector;
        DEFAULT_BASE = new BaseSettings(null, jacksonAnnotationIntrospector, null, TypeFactory.defaultInstance(), null, StdDateFormat.instance, Locale.getDefault(), null, Base64Variants.MIME_NO_LINEFEEDS);
    }

    public ObjectMapper() {
        this(null, null, null);
    }

    /* access modifiers changed from: protected */
    public final void _configAndWriteValue(JsonGenerator jsonGenerator, Object obj) {
        Exception e;
        SerializationConfig serializationConfig = this._serializationConfig;
        serializationConfig.initialize(jsonGenerator);
        if (!serializationConfig.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            try {
                this._serializerProvider.createInstance(serializationConfig, this._serializerFactory).serializeValue(jsonGenerator, obj);
                jsonGenerator.close();
            } catch (Exception e2) {
                int i = ClassUtil.a;
                jsonGenerator.disable(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
                try {
                    jsonGenerator.close();
                } catch (Exception unused) {
                }
                ClassUtil.throwIfIOE(e2);
                ClassUtil.throwIfRTE(e2);
                throw new RuntimeException(e2);
            }
        } else {
            Closeable closeable = (Closeable) obj;
            try {
                this._serializerProvider.createInstance(serializationConfig, this._serializerFactory).serializeValue(jsonGenerator, obj);
                try {
                    closeable.close();
                    jsonGenerator.close();
                } catch (Exception e3) {
                    e = e3;
                    closeable = null;
                    ClassUtil.closeOnFailAndThrowAsIOE(jsonGenerator, closeable, e);
                    throw null;
                }
            } catch (Exception e4) {
                e = e4;
                ClassUtil.closeOnFailAndThrowAsIOE(jsonGenerator, closeable, e);
                throw null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> _findRootDeserializer(DeserializationContext deserializationContext, JavaType javaType) {
        JsonDeserializer<Object> jsonDeserializer = this._rootDeserializers.get(javaType);
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        JsonDeserializer<Object> findRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
        if (findRootValueDeserializer != null) {
            this._rootDeserializers.put(javaType, findRootValueDeserializer);
            return findRootValueDeserializer;
        }
        throw InvalidDefinitionException.from(deserializationContext._parser, "Cannot find a deserializer for type " + javaType, javaType);
    }

    /* access modifiers changed from: protected */
    public JsonToken _initForReading(JsonParser jsonParser, JavaType javaType) {
        this._deserializationConfig.initialize(jsonParser);
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken != null || (currentToken = jsonParser.nextToken()) != null) {
            return currentToken;
        }
        throw MismatchedInputException.from(jsonParser, javaType, "No content to map due to end-of-input");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (r10 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0058, code lost:
        throw r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object _readMapAndClose(com.fasterxml.jackson.core.JsonParser r10, com.fasterxml.jackson.databind.JavaType r11) {
        /*
            r9 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r9._initForReading(r10, r11)     // Catch:{ all -> 0x0050 }
            com.fasterxml.jackson.databind.DeserializationConfig r7 = r9._deserializationConfig     // Catch:{ all -> 0x0050 }
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext r1 = r9._deserializationContext     // Catch:{ all -> 0x0050 }
            com.fasterxml.jackson.databind.InjectableValues r2 = r9._injectableValues     // Catch:{ all -> 0x0050 }
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext r8 = r1.createInstance(r7, r10, r2)     // Catch:{ all -> 0x0050 }
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ all -> 0x0050 }
            if (r0 != r1) goto L_0x001b
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r9._findRootDeserializer(r8, r11)     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.getNullValue(r8)     // Catch:{ all -> 0x0050 }
            goto L_0x0041
        L_0x001b:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ all -> 0x0050 }
            if (r0 == r1) goto L_0x0040
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ all -> 0x0050 }
            if (r0 != r1) goto L_0x0024
            goto L_0x0040
        L_0x0024:
            com.fasterxml.jackson.databind.JsonDeserializer r6 = r9._findRootDeserializer(r8, r11)     // Catch:{ all -> 0x0050 }
            boolean r0 = r7.useRootWrapping()     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0038
            r1 = r9
            r2 = r10
            r3 = r8
            r4 = r7
            r5 = r11
            java.lang.Object r0 = r1._unwrapAndDeserialize(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0050 }
            goto L_0x003c
        L_0x0038:
            java.lang.Object r0 = r6.deserialize(r10, r8)     // Catch:{ all -> 0x0050 }
        L_0x003c:
            r8.checkUnresolvedObjectId()     // Catch:{ all -> 0x0050 }
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            com.fasterxml.jackson.databind.DeserializationFeature r1 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_TRAILING_TOKENS     // Catch:{ all -> 0x0050 }
            boolean r1 = r7.isEnabled(r1)     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x004c
            r9._verifyNoTrailingTokens(r10, r8, r11)     // Catch:{ all -> 0x0050 }
        L_0x004c:
            r10.close()
            return r0
        L_0x0050:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r11 = move-exception
            if (r10 == 0) goto L_0x0058
            r10.close()     // Catch:{ all -> 0x0058 }
        L_0x0058:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectMapper._readMapAndClose(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.JavaType):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        if (r7 != null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonNode _readTreeAndClose(com.fasterxml.jackson.core.JsonParser r7) {
        /*
            r6 = this;
            com.fasterxml.jackson.databind.JavaType r4 = com.fasterxml.jackson.databind.ObjectMapper.JSON_NODE_TYPE     // Catch:{ all -> 0x0055 }
            com.fasterxml.jackson.databind.DeserializationConfig r3 = r6._deserializationConfig     // Catch:{ all -> 0x0055 }
            r3.initialize(r7)     // Catch:{ all -> 0x0055 }
            com.fasterxml.jackson.core.JsonToken r0 = r7.getCurrentToken()     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x0018
            com.fasterxml.jackson.core.JsonToken r0 = r7.nextToken()     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x0018
            r0 = 0
            r7.close()
            return r0
        L_0x0018:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            if (r0 != r1) goto L_0x0027
            com.fasterxml.jackson.databind.node.JsonNodeFactory r0 = r3._nodeFactory
            r0.getClass()
            com.fasterxml.jackson.databind.node.NullNode r0 = com.fasterxml.jackson.databind.node.NullNode.instance
            r7.close()
            return r0
        L_0x0027:
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext r0 = r6._deserializationContext
            com.fasterxml.jackson.databind.InjectableValues r1 = r6._injectableValues
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext r2 = r0.createInstance(r3, r7, r1)
            com.fasterxml.jackson.databind.JsonDeserializer r5 = r6._findRootDeserializer(r2, r4)
            boolean r0 = r3.useRootWrapping()
            if (r0 == 0) goto L_0x0040
            r0 = r6
            r1 = r7
            java.lang.Object r0 = r0._unwrapAndDeserialize(r1, r2, r3, r4, r5)
            goto L_0x004f
        L_0x0040:
            java.lang.Object r0 = r5.deserialize(r7, r2)
            com.fasterxml.jackson.databind.DeserializationFeature r1 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_TRAILING_TOKENS
            boolean r1 = r3.isEnabled(r1)
            if (r1 == 0) goto L_0x004f
            r6._verifyNoTrailingTokens(r7, r2, r4)
        L_0x004f:
            com.fasterxml.jackson.databind.JsonNode r0 = (com.fasterxml.jackson.databind.JsonNode) r0
            r7.close()
            return r0
        L_0x0055:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r0 = move-exception
            if (r7 == 0) goto L_0x005d
            r7.close()     // Catch:{ all -> 0x005d }
        L_0x005d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectMapper._readTreeAndClose(com.fasterxml.jackson.core.JsonParser):com.fasterxml.jackson.databind.JsonNode");
    }

    /* access modifiers changed from: protected */
    public Object _readValue(DeserializationConfig deserializationConfig, JsonParser jsonParser, JavaType javaType) {
        Object obj;
        JsonToken _initForReading = _initForReading(jsonParser, javaType);
        DefaultDeserializationContext createInstance = this._deserializationContext.createInstance(deserializationConfig, jsonParser, this._injectableValues);
        if (_initForReading == JsonToken.VALUE_NULL) {
            obj = _findRootDeserializer(createInstance, javaType).getNullValue(createInstance);
        } else if (_initForReading == JsonToken.END_ARRAY || _initForReading == JsonToken.END_OBJECT) {
            obj = null;
        } else {
            JsonDeserializer<Object> _findRootDeserializer = _findRootDeserializer(createInstance, javaType);
            obj = deserializationConfig.useRootWrapping() ? _unwrapAndDeserialize(jsonParser, createInstance, deserializationConfig, javaType, _findRootDeserializer) : _findRootDeserializer.deserialize(jsonParser, createInstance);
        }
        jsonParser.clearCurrentToken();
        if (deserializationConfig.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, createInstance, javaType);
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    public DefaultSerializerProvider _serializerProvider(SerializationConfig serializationConfig) {
        return this._serializerProvider.createInstance(serializationConfig, this._serializerFactory);
    }

    /* access modifiers changed from: protected */
    public Object _unwrapAndDeserialize(JsonParser jsonParser, DeserializationContext deserializationContext, DeserializationConfig deserializationConfig, JavaType javaType, JsonDeserializer<Object> jsonDeserializer) {
        String str = deserializationConfig.findRootName(javaType)._simpleName;
        JsonToken currentToken = jsonParser.getCurrentToken();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        if (currentToken == jsonToken) {
            JsonToken nextToken = jsonParser.nextToken();
            JsonToken jsonToken2 = JsonToken.FIELD_NAME;
            if (nextToken == jsonToken2) {
                Object currentName = jsonParser.getCurrentName();
                if (str.equals(currentName)) {
                    jsonParser.nextToken();
                    Object deserialize = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                    JsonToken nextToken2 = jsonParser.nextToken();
                    JsonToken jsonToken3 = JsonToken.END_OBJECT;
                    if (nextToken2 == jsonToken3) {
                        if (deserializationConfig.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
                            _verifyNoTrailingTokens(jsonParser, deserializationContext, javaType);
                        }
                        return deserialize;
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
        JsonToken nextToken = jsonParser.nextToken();
        if (nextToken != null) {
            deserializationContext.reportTrailingTokens(ClassUtil.rawClass(javaType), jsonParser, nextToken);
            throw null;
        }
    }

    public ObjectMapper addMixIn(Class<?> cls, Class<?> cls2) {
        this._mixIns.addLocalDefinition(cls, cls2);
        return this;
    }

    public boolean canDeserialize(JavaType javaType) {
        DefaultDeserializationContext createDeserializationContext = createDeserializationContext(null, this._deserializationConfig);
        createDeserializationContext.getClass();
        try {
            return createDeserializationContext._cache.hasValueDeserializerFor(createDeserializationContext, createDeserializationContext._factory, javaType);
        } catch (JsonMappingException unused) {
            return false;
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public boolean canSerialize(Class<?> cls) {
        return _serializerProvider(this._serializationConfig).hasSerializerFor(cls, null);
    }

    public ObjectMapper configure(MapperFeature mapperFeature, boolean z) {
        this._serializationConfig = (SerializationConfig) (z ? this._serializationConfig.with(mapperFeature) : this._serializationConfig.without(mapperFeature));
        this._deserializationConfig = (DeserializationConfig) (z ? this._deserializationConfig.with(mapperFeature) : this._deserializationConfig.without(mapperFeature));
        return this;
    }

    public JavaType constructType(Type type) {
        return this._typeFactory.constructType(type);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> T convertValue(Object obj, Class<T> cls) {
        T t;
        Class<?> cls2;
        JavaType constructType = this._typeFactory.constructType(cls);
        if (obj != 0 && (cls2 = constructType._class) != Object.class && !constructType.hasGenericTypes() && cls2.isAssignableFrom(obj.getClass())) {
            return obj;
        }
        TokenBuffer tokenBuffer = new TokenBuffer((ObjectCodec) this, false);
        if (this._deserializationConfig.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            tokenBuffer.forceUseOfBigDecimal(true);
        }
        try {
            this._serializerProvider.createInstance(this._serializationConfig.without(SerializationFeature.WRAP_ROOT_VALUE), this._serializerFactory).serializeValue(tokenBuffer, obj);
            JsonParser asParser = tokenBuffer.asParser();
            DeserializationConfig deserializationConfig = this._deserializationConfig;
            JsonToken _initForReading = _initForReading(asParser, constructType);
            if (_initForReading == JsonToken.VALUE_NULL) {
                DefaultDeserializationContext createInstance = this._deserializationContext.createInstance(deserializationConfig, asParser, this._injectableValues);
                t = (T) _findRootDeserializer(createInstance, constructType).getNullValue(createInstance);
            } else {
                if (_initForReading != JsonToken.END_ARRAY) {
                    if (_initForReading != JsonToken.END_OBJECT) {
                        DefaultDeserializationContext createInstance2 = this._deserializationContext.createInstance(deserializationConfig, asParser, this._injectableValues);
                        t = (T) _findRootDeserializer(createInstance2, constructType).deserialize(asParser, createInstance2);
                    }
                }
                t = null;
            }
            asParser.close();
            return t;
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    /* access modifiers changed from: protected */
    public DefaultDeserializationContext createDeserializationContext(JsonParser jsonParser, DeserializationConfig deserializationConfig) {
        return this._deserializationContext.createInstance(deserializationConfig, null, this._injectableValues);
    }

    public TypeFactory getTypeFactory() {
        return this._typeFactory;
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T extends TreeNode> T readTree(JsonParser jsonParser) {
        DeserializationConfig deserializationConfig = this._deserializationConfig;
        if (jsonParser.getCurrentToken() == null && jsonParser.nextToken() == null) {
            return null;
        }
        JsonNode jsonNode = (JsonNode) _readValue(deserializationConfig, jsonParser, JSON_NODE_TYPE);
        if (jsonNode != null) {
            return jsonNode;
        }
        this._deserializationConfig._nodeFactory.getClass();
        return NullNode.instance;
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> T readValue(JsonParser jsonParser, Class<T> cls) {
        return (T) _readValue(this._deserializationConfig, jsonParser, this._typeFactory.constructType(cls));
    }

    public ObjectReader reader() {
        ObjectReader objectReader = new ObjectReader(this, this._deserializationConfig, null, null, null);
        InjectableValues injectableValues = this._injectableValues;
        return objectReader._injectableValues == injectableValues ? objectReader : objectReader._new(objectReader, objectReader._config, objectReader._valueType, objectReader._rootDeserializer, objectReader._valueToUpdate, objectReader._schema, injectableValues, objectReader._dataFormatReaders);
    }

    public ObjectReader readerFor(JavaType javaType) {
        return new ObjectReader(this, this._deserializationConfig, javaType, null, null);
    }

    public ObjectMapper registerModule(Module module) {
        if (this._serializationConfig.isEnabled(MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS)) {
            String name = module.getClass().getName();
            if (this._registeredModuleTypes == null) {
                this._registeredModuleTypes = new LinkedHashSet();
            }
            if (!this._registeredModuleTypes.add(name)) {
                return this;
            }
        }
        if (PackageVersion.VERSION != null) {
            this._deserializationContext = this._deserializationContext.with(this._deserializationContext._factory.withAdditionalDeserializers(new GuavaDeserializers(null)));
            this._serializerFactory = this._serializerFactory.withAdditionalSerializers(new GuavaSerializers());
            TypeFactory withModifier = this._typeFactory.withModifier(new GuavaTypeModifier());
            this._typeFactory = withModifier;
            this._deserializationConfig = (DeserializationConfig) this._deserializationConfig.with(withModifier);
            this._serializationConfig = (SerializationConfig) this._serializationConfig.with(withModifier);
            this._serializerFactory = this._serializerFactory.withSerializerModifier(new GuavaBeanSerializerModifier());
            return this;
        }
        throw new IllegalArgumentException("Module without defined version");
    }

    public ObjectMapper setSerializationInclusion(JsonInclude.Include include) {
        this._configOverrides.setDefaultInclusion(JsonInclude.Value.construct(include, include));
        return this;
    }

    public ObjectMapper setVisibility(PropertyAccessor propertyAccessor, JsonAutoDetect.Visibility visibility) {
        this._configOverrides.setDefaultVisibility(((VisibilityChecker.Std) this._configOverrides.getDefaultVisibility()).withVisibility(propertyAccessor, visibility));
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.fasterxml.jackson.core.TreeNode */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.core.ObjectCodec
    public <T> T treeToValue(TreeNode treeNode, Class<T> cls) {
        T t;
        if (cls != Object.class) {
            try {
                if (cls.isAssignableFrom(treeNode.getClass())) {
                    return treeNode;
                }
            } catch (JsonProcessingException e) {
                throw e;
            } catch (IOException e2) {
                throw new IllegalArgumentException(e2.getMessage(), e2);
            }
        }
        return (treeNode.asToken() != JsonToken.VALUE_EMBEDDED_OBJECT || !(treeNode instanceof POJONode) || ((t = (T) ((POJONode) treeNode).getPojo()) != null && !cls.isInstance(t))) ? (T) _readValue(this._deserializationConfig, new TreeTraversingParser((JsonNode) treeNode, this), this._typeFactory.constructType(cls)) : t;
    }

    @Override // com.fasterxml.jackson.core.ObjectCodec
    public void writeValue(JsonGenerator jsonGenerator, Object obj) {
        SerializationConfig serializationConfig = this._serializationConfig;
        if (serializationConfig.isEnabled(SerializationFeature.INDENT_OUTPUT) && jsonGenerator.getPrettyPrinter() == null) {
            PrettyPrinter prettyPrinter = serializationConfig._defaultPrettyPrinter;
            if (prettyPrinter instanceof Instantiatable) {
                prettyPrinter = (PrettyPrinter) ((Instantiatable) prettyPrinter).createInstance();
            }
            jsonGenerator.setPrettyPrinter(prettyPrinter);
        }
        if (!serializationConfig.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            this._serializerProvider.createInstance(serializationConfig, this._serializerFactory).serializeValue(jsonGenerator, obj);
            if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
                return;
            }
            return;
        }
        Closeable closeable = (Closeable) obj;
        try {
            this._serializerProvider.createInstance(serializationConfig, this._serializerFactory).serializeValue(jsonGenerator, obj);
            if (serializationConfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
            }
            closeable.close();
        } catch (Exception e) {
            ClassUtil.closeOnFailAndThrowAsIOE(null, closeable, e);
            throw null;
        }
    }

    public byte[] writeValueAsBytes(Object obj) {
        ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder(this._jsonFactory._getBufferRecycler(), 500);
        try {
            _configAndWriteValue(this._jsonFactory.createGenerator(byteArrayBuilder, JsonEncoding.UTF8), obj);
            byte[] byteArray = byteArrayBuilder.toByteArray();
            byteArrayBuilder.release();
            return byteArray;
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public String writeValueAsString(Object obj) {
        SegmentedStringWriter segmentedStringWriter = new SegmentedStringWriter(this._jsonFactory._getBufferRecycler());
        try {
            _configAndWriteValue(this._jsonFactory.createGenerator(segmentedStringWriter), obj);
            return segmentedStringWriter.getAndClear();
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public ObjectWriter writer() {
        return new ObjectWriter(this, this._serializationConfig);
    }

    public ObjectWriter writerFor(JavaType javaType) {
        return new ObjectWriter(this, this._serializationConfig, javaType, null);
    }

    public ObjectMapper(JsonFactory jsonFactory, DefaultSerializerProvider defaultSerializerProvider, DefaultDeserializationContext defaultDeserializationContext) {
        this._rootDeserializers = new ConcurrentHashMap<>(64, 0.6f, 2);
        if (jsonFactory == null) {
            this._jsonFactory = new MappingJsonFactory(this);
        } else {
            this._jsonFactory = jsonFactory;
            if (jsonFactory.getCodec() == null) {
                jsonFactory.setCodec(this);
            }
        }
        this._subtypeResolver = new StdSubtypeResolver();
        RootNameLookup rootNameLookup = new RootNameLookup();
        this._typeFactory = TypeFactory.defaultInstance();
        SimpleMixInResolver simpleMixInResolver = new SimpleMixInResolver(null);
        this._mixIns = simpleMixInResolver;
        BaseSettings withClassIntrospector = DEFAULT_BASE.withClassIntrospector(new BasicClassIntrospector());
        ConfigOverrides configOverrides = new ConfigOverrides();
        this._configOverrides = configOverrides;
        this._serializationConfig = new SerializationConfig(withClassIntrospector, this._subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides);
        this._deserializationConfig = new DeserializationConfig(withClassIntrospector, this._subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides);
        this._jsonFactory.getClass();
        SerializationConfig serializationConfig = this._serializationConfig;
        MapperFeature mapperFeature = MapperFeature.SORT_PROPERTIES_ALPHABETICALLY;
        if (serializationConfig.isEnabled(mapperFeature)) {
            configure(mapperFeature, false);
        }
        this._serializerProvider = new DefaultSerializerProvider.Impl();
        this._deserializationContext = new DefaultDeserializationContext.Impl(BeanDeserializerFactory.instance);
        this._serializerFactory = BeanSerializerFactory.instance;
    }

    public <T> T readValue(File file, Class<T> cls) {
        return (T) _readMapAndClose(this._jsonFactory.createParser(file), this._typeFactory.constructType(cls));
    }

    public <T> T readValue(File file, TypeReference typeReference) {
        return (T) _readMapAndClose(this._jsonFactory.createParser(file), this._typeFactory.constructType(typeReference));
    }

    public ObjectMapper configure(SerializationFeature serializationFeature, boolean z) {
        this._serializationConfig = z ? this._serializationConfig.with(serializationFeature) : this._serializationConfig.without(serializationFeature);
        return this;
    }

    public <T> T readValue(String str, Class<T> cls) {
        return (T) _readMapAndClose(this._jsonFactory.createParser(str), this._typeFactory.constructType(cls));
    }

    public <T> T readValue(String str, TypeReference typeReference) {
        return (T) _readMapAndClose(this._jsonFactory.createParser(str), this._typeFactory.constructType(typeReference));
    }

    public ObjectMapper configure(DeserializationFeature deserializationFeature, boolean z) {
        this._deserializationConfig = z ? this._deserializationConfig.with(deserializationFeature) : this._deserializationConfig.without(deserializationFeature);
        return this;
    }

    public <T> T readValue(String str, JavaType javaType) {
        return (T) _readMapAndClose(this._jsonFactory.createParser(str), javaType);
    }

    public JsonNode readTree(InputStream inputStream) {
        return _readTreeAndClose(this._jsonFactory.createParser(inputStream));
    }

    public <T> T readValue(InputStream inputStream, Class<T> cls) {
        return (T) _readMapAndClose(this._jsonFactory.createParser(inputStream), this._typeFactory.constructType(cls));
    }

    public ObjectMapper configure(JsonParser.Feature feature, boolean z) {
        this._jsonFactory.configure(feature, z);
        return this;
    }

    public JsonNode readTree(byte[] bArr) {
        return _readTreeAndClose(this._jsonFactory.createParser(bArr));
    }

    public <T> T readValue(byte[] bArr, Class<T> cls) {
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr), this._typeFactory.constructType(cls));
    }

    public ObjectMapper configure(JsonGenerator.Feature feature, boolean z) {
        this._jsonFactory.configure(feature, z);
        return this;
    }

    public <T> T readValue(byte[] bArr, JavaType javaType) {
        return (T) _readMapAndClose(this._jsonFactory.createParser(bArr), javaType);
    }

    public void writeValue(File file, Object obj) {
        _configAndWriteValue(this._jsonFactory.createGenerator(file, JsonEncoding.UTF8), obj);
    }
}
