package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapDeserializer;
import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.ArrayIterator;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.Serializable;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

public final class DeserializerCache implements Serializable {
    private static final long serialVersionUID = 1;
    protected final ConcurrentHashMap<JavaType, JsonDeserializer<Object>> _cachedDeserializers = new ConcurrentHashMap<>(64, 0.75f, 4);
    protected final HashMap<JavaType, JsonDeserializer<Object>> _incompleteDeserializers = new HashMap<>(8);

    private boolean _hasCustomHandlers(JavaType javaType) {
        if (!javaType.isContainerType()) {
            return false;
        }
        JavaType contentType = javaType.getContentType();
        if (contentType != null && (contentType.getValueHandler() != null || contentType.getTypeHandler() != null)) {
            return true;
        }
        if (!javaType.isMapLikeType() || javaType.getKeyType().getValueHandler() == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> _createAndCache2(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) {
        try {
            JsonDeserializer<Object> _createDeserializer = _createDeserializer(deserializationContext, deserializerFactory, javaType);
            if (_createDeserializer == null) {
                return null;
            }
            boolean z = !_hasCustomHandlers(javaType) && _createDeserializer.isCachable();
            if (_createDeserializer instanceof ResolvableDeserializer) {
                this._incompleteDeserializers.put(javaType, _createDeserializer);
                ((ResolvableDeserializer) _createDeserializer).resolve(deserializationContext);
                this._incompleteDeserializers.remove(javaType);
            }
            if (z) {
                this._cachedDeserializers.put(javaType, _createDeserializer);
            }
            return _createDeserializer;
        } catch (IllegalArgumentException e) {
            throw JsonMappingException.from(deserializationContext, ClassUtil.exceptionMessage(e), e);
        }
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> _createAndCacheValueDeserializer(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) {
        JsonDeserializer<Object> jsonDeserializer;
        synchronized (this._incompleteDeserializers) {
            JsonDeserializer<Object> _findCachedDeserializer = _findCachedDeserializer(javaType);
            if (_findCachedDeserializer != null) {
                return _findCachedDeserializer;
            }
            int size = this._incompleteDeserializers.size();
            if (size > 0 && (jsonDeserializer = this._incompleteDeserializers.get(javaType)) != null) {
                return jsonDeserializer;
            }
            try {
                return _createAndCache2(deserializationContext, deserializerFactory, javaType);
            } finally {
                if (size == 0 && this._incompleteDeserializers.size() > 0) {
                    this._incompleteDeserializers.clear();
                }
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:51:0x00c1 */
    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> _createDeserializer(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) {
        JsonDeserializer<Object> jsonDeserializer;
        JavaType javaType2;
        JavaType javaType3;
        Object findContentDeserializer;
        JavaType keyType;
        Object findKeyDeserializer;
        KeyDeserializer keyDeserializerInstance;
        Converter<Object, Object> converter;
        DeserializationConfig config = deserializationContext.mo12getConfig();
        if (javaType.isAbstract() || javaType.isMapLikeType() || javaType.isCollectionLikeType()) {
            deserializerFactory.mapAbstractType(config, javaType);
        }
        BeanDescription forDeserialization = config.getClassIntrospector().forDeserialization(config, javaType, config);
        AnnotatedClass classInfo = forDeserialization.getClassInfo();
        Object findDeserializer = deserializationContext.getAnnotationIntrospector().findDeserializer(classInfo);
        Object obj = null;
        if (findDeserializer == null) {
            jsonDeserializer = null;
        } else {
            jsonDeserializer = deserializationContext.deserializerInstance(classInfo, findDeserializer);
            Object findDeserializationConverter = deserializationContext.getAnnotationIntrospector().findDeserializationConverter(classInfo);
            if (findDeserializationConverter == null) {
                converter = null;
            } else {
                converter = deserializationContext.converterInstance(classInfo, findDeserializationConverter);
            }
            if (converter != null) {
                jsonDeserializer = new StdDelegatingDeserializer<>(converter, converter.getInputType(deserializationContext.getTypeFactory()), jsonDeserializer);
            }
        }
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        AnnotatedClass classInfo2 = forDeserialization.getClassInfo();
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            javaType2 = javaType;
        } else {
            if (!javaType.isMapLikeType() || (keyType = javaType.getKeyType()) == null || keyType.getValueHandler() != null || (findKeyDeserializer = annotationIntrospector.findKeyDeserializer(classInfo2)) == null || (keyDeserializerInstance = deserializationContext.keyDeserializerInstance(classInfo2, findKeyDeserializer)) == null) {
                javaType3 = javaType;
            } else {
                MapLikeType withKeyValueHandler = ((MapLikeType) javaType).withKeyValueHandler(keyDeserializerInstance);
                withKeyValueHandler.getKeyType();
                javaType3 = withKeyValueHandler;
            }
            JavaType contentType = javaType3.getContentType();
            if (!(contentType == null || contentType.getValueHandler() != null || (findContentDeserializer = annotationIntrospector.findContentDeserializer(classInfo2)) == null)) {
                if (findContentDeserializer instanceof JsonDeserializer) {
                    JsonDeserializer jsonDeserializer2 = (JsonDeserializer) findContentDeserializer;
                } else if (findContentDeserializer instanceof Class) {
                    Class cls = (Class) findContentDeserializer;
                    if (cls == JsonDeserializer.None.class || ClassUtil.isBogusClass(cls)) {
                        cls = null;
                    }
                    if (cls != null) {
                        obj = deserializationContext.deserializerInstance(classInfo2, cls);
                    }
                } else {
                    throw new IllegalStateException(je.n0(findContentDeserializer, je.a1("AnnotationIntrospector.", "findContentDeserializer", "() returned value of type "), ": expected type JsonSerializer or Class<JsonSerializer> instead"));
                }
                if (obj != null) {
                    javaType3 = javaType3.withContentValueHandler(obj);
                }
            }
            javaType2 = annotationIntrospector.refineDeserializationType(deserializationContext.mo12getConfig(), classInfo2, javaType3);
        }
        if (javaType2 != javaType) {
            forDeserialization = config.introspect(javaType2);
            javaType = javaType2;
        }
        Class<?> findPOJOBuilder = forDeserialization.findPOJOBuilder();
        if (findPOJOBuilder != null) {
            return deserializerFactory.createBuilderBasedDeserializer(deserializationContext, javaType, forDeserialization, findPOJOBuilder);
        }
        Converter<Object, Object> findDeserializationConverter2 = forDeserialization.findDeserializationConverter();
        if (findDeserializationConverter2 == null) {
            return _createDeserializer2(deserializationContext, deserializerFactory, javaType, forDeserialization);
        }
        JavaType inputType = findDeserializationConverter2.getInputType(deserializationContext.getTypeFactory());
        if (!inputType.hasRawClass(javaType.getRawClass())) {
            forDeserialization = config.getClassIntrospector().forDeserialization(config, inputType, config);
        }
        return new StdDelegatingDeserializer(findDeserializationConverter2, inputType, _createDeserializer2(deserializationContext, deserializerFactory, inputType, forDeserialization));
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:209:0x01ad */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:86:0x01f0 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:210:0x0299 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: com.fasterxml.jackson.databind.deser.Deserializers */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    public JsonDeserializer<?> _createDeserializer2(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType, BeanDescription beanDescription) {
        JsonDeserializer<?> jsonDeserializer;
        JsonFormat.Value findExpectedFormat;
        JsonFormat.Value findExpectedFormat2;
        JsonDeserializer<?> jsonDeserializer2;
        JsonDeserializer<?> jsonDeserializer3;
        BasicDeserializerFactory basicDeserializerFactory;
        DeserializationConfig deserializationConfig;
        BasicDeserializerFactory basicDeserializerFactory2;
        MapType mapType;
        EnumMapDeserializer enumMapDeserializer;
        MapType mapType2;
        BeanDescription beanDescription2;
        MapType mapType3;
        AbstractDeserializer abstractDeserializer;
        ValueInstantiator valueInstantiator;
        JsonFormat.Shape shape = JsonFormat.Shape.OBJECT;
        DeserializationConfig config = deserializationContext.mo12getConfig();
        if (javaType.isEnumType()) {
            BasicDeserializerFactory basicDeserializerFactory3 = (BasicDeserializerFactory) deserializerFactory;
            basicDeserializerFactory3.getClass();
            DeserializationConfig config2 = deserializationContext.mo12getConfig();
            Class<?> rawClass = javaType.getRawClass();
            JsonDeserializer<?> _findCustomEnumDeserializer = basicDeserializerFactory3._findCustomEnumDeserializer(rawClass, config2, beanDescription);
            if (_findCustomEnumDeserializer == null) {
                ValueInstantiator _constructDefaultValueInstantiator = basicDeserializerFactory3._constructDefaultValueInstantiator(deserializationContext, beanDescription);
                SettableBeanProperty[] fromObjectArguments = _constructDefaultValueInstantiator.getFromObjectArguments(deserializationContext.mo12getConfig());
                Iterator<AnnotatedMethod> it = beanDescription.getFactoryMethods().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AnnotatedMethod next = it.next();
                    if (basicDeserializerFactory3._hasCreatorAnnotation(deserializationContext, next)) {
                        if (next.getParameterCount() == 0) {
                            _findCustomEnumDeserializer = EnumDeserializer.deserializerForNoArgsCreator(config2, rawClass, next);
                            break;
                        } else if (next.getRawReturnType().isAssignableFrom(rawClass)) {
                            _findCustomEnumDeserializer = EnumDeserializer.deserializerForCreator(config2, rawClass, next, _constructDefaultValueInstantiator, fromObjectArguments);
                            break;
                        }
                    }
                }
                if (_findCustomEnumDeserializer == null) {
                    _findCustomEnumDeserializer = new EnumDeserializer(basicDeserializerFactory3.constructEnumResolver(rawClass, config2, beanDescription.findJsonValueAccessor()), Boolean.valueOf(config2.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)));
                }
            }
            if (basicDeserializerFactory3._factoryConfig.hasDeserializerModifiers()) {
                ArrayIterator arrayIterator = (ArrayIterator) basicDeserializerFactory3._factoryConfig.deserializerModifiers();
                while (arrayIterator.hasNext()) {
                    ((BeanDeserializerModifier) arrayIterator.next()).getClass();
                }
            }
            return _findCustomEnumDeserializer;
        }
        JsonDeserializer<?> jsonDeserializer4 = null;
        ObjectArrayDeserializer objectArrayDeserializer = null;
        Set<String> set = null;
        JsonDeserializer<?> jsonDeserializer5 = null;
        JsonDeserializer<?> jsonDeserializer6 = null;
        ValueInstantiator valueInstantiator2 = null;
        if (javaType.isContainerType()) {
            if (javaType.isArrayType()) {
                ArrayType arrayType = (ArrayType) javaType;
                BasicDeserializerFactory basicDeserializerFactory4 = (BasicDeserializerFactory) deserializerFactory;
                basicDeserializerFactory4.getClass();
                DeserializationConfig config3 = deserializationContext.mo12getConfig();
                JavaType contentType = arrayType.getContentType();
                JsonDeserializer<?> jsonDeserializer7 = (JsonDeserializer) contentType.getValueHandler();
                TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
                if (typeDeserializer == null) {
                    typeDeserializer = basicDeserializerFactory4.findTypeDeserializer(config3, contentType);
                }
                ArrayIterator arrayIterator2 = (ArrayIterator) basicDeserializerFactory4._factoryConfig.deserializers();
                while (true) {
                    if (arrayIterator2.hasNext()) {
                        JsonDeserializer<?> findArrayDeserializer = ((Deserializers) arrayIterator2.next()).findArrayDeserializer(arrayType, config3, beanDescription, typeDeserializer, jsonDeserializer7);
                        if (findArrayDeserializer != null) {
                            objectArrayDeserializer = findArrayDeserializer;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (objectArrayDeserializer == null) {
                    if (jsonDeserializer7 == null) {
                        Class<?> rawClass2 = contentType.getRawClass();
                        if (contentType.isPrimitive()) {
                            return PrimitiveArrayDeserializers.forType(rawClass2);
                        }
                        if (rawClass2 == String.class) {
                            return StringArrayDeserializer.instance;
                        }
                    }
                    objectArrayDeserializer = new ObjectArrayDeserializer(arrayType, jsonDeserializer7, typeDeserializer);
                }
                if (basicDeserializerFactory4._factoryConfig.hasDeserializerModifiers()) {
                    ArrayIterator arrayIterator3 = (ArrayIterator) basicDeserializerFactory4._factoryConfig.deserializerModifiers();
                    while (arrayIterator3.hasNext()) {
                        ((BeanDeserializerModifier) arrayIterator3.next()).getClass();
                    }
                }
                return objectArrayDeserializer;
            } else if (javaType.isMapLikeType() && ((findExpectedFormat2 = beanDescription.findExpectedFormat(null)) == null || findExpectedFormat2.getShape() != shape)) {
                MapLikeType mapLikeType = (MapLikeType) javaType;
                if (mapLikeType.isTrueMapType()) {
                    MapType mapType4 = (MapType) mapLikeType;
                    BasicDeserializerFactory basicDeserializerFactory5 = (BasicDeserializerFactory) deserializerFactory;
                    basicDeserializerFactory5.getClass();
                    DeserializationConfig config4 = deserializationContext.mo12getConfig();
                    JavaType keyType = mapType4.getKeyType();
                    JavaType contentType2 = mapType4.getContentType();
                    JsonDeserializer<?> jsonDeserializer8 = (JsonDeserializer) contentType2.getValueHandler();
                    KeyDeserializer keyDeserializer = (KeyDeserializer) keyType.getValueHandler();
                    TypeDeserializer typeDeserializer2 = (TypeDeserializer) contentType2.getTypeHandler();
                    TypeDeserializer findTypeDeserializer = typeDeserializer2 == null ? basicDeserializerFactory5.findTypeDeserializer(config4, contentType2) : typeDeserializer2;
                    ArrayIterator arrayIterator4 = (ArrayIterator) basicDeserializerFactory5._factoryConfig.deserializers();
                    while (true) {
                        if (!arrayIterator4.hasNext()) {
                            jsonDeserializer2 = null;
                            break;
                        }
                        jsonDeserializer2 = ((Deserializers) arrayIterator4.next()).findMapDeserializer(mapType4, config4, beanDescription, keyDeserializer, findTypeDeserializer, jsonDeserializer8);
                        if (jsonDeserializer2 != null) {
                            break;
                        }
                    }
                    if (jsonDeserializer2 == null) {
                        Class<?> rawClass3 = mapType4.getRawClass();
                        if (EnumMap.class.isAssignableFrom(rawClass3)) {
                            if (rawClass3 == EnumMap.class) {
                                valueInstantiator = null;
                            } else {
                                valueInstantiator = basicDeserializerFactory5.findValueInstantiator(deserializationContext, beanDescription);
                            }
                            Class<?> rawClass4 = keyType.getRawClass();
                            if (rawClass4 == null || !rawClass4.isEnum()) {
                                throw new IllegalArgumentException("Cannot construct EnumMap; generic (key) type not available");
                            }
                            deserializationConfig = config4;
                            basicDeserializerFactory2 = basicDeserializerFactory5;
                            mapType = mapType4;
                            enumMapDeserializer = new EnumMapDeserializer(mapType4, valueInstantiator, null, jsonDeserializer8, findTypeDeserializer, null);
                        } else {
                            deserializationConfig = config4;
                            basicDeserializerFactory2 = basicDeserializerFactory5;
                            mapType = mapType4;
                            enumMapDeserializer = jsonDeserializer2;
                        }
                        if (enumMapDeserializer == null) {
                            if (mapType.isInterface() || mapType.isAbstract()) {
                                Class<? extends Map> cls = BasicDeserializerFactory._mapFallbacks.get(rawClass3.getName());
                                if (cls != null) {
                                    mapType3 = (MapType) deserializationConfig.constructSpecializedType(mapType, cls);
                                    beanDescription2 = deserializationConfig.getClassIntrospector().forCreation(deserializationConfig, mapType3, deserializationConfig);
                                    abstractDeserializer = enumMapDeserializer;
                                } else if (mapType.getTypeHandler() != null) {
                                    mapType3 = mapType;
                                    beanDescription2 = beanDescription;
                                    abstractDeserializer = new AbstractDeserializer(beanDescription);
                                } else {
                                    throw new IllegalArgumentException("Cannot find a deserializer for non-concrete Map type " + mapType);
                                }
                                mapType2 = mapType3;
                                enumMapDeserializer = abstractDeserializer;
                            } else {
                                jsonDeserializer3 = JavaUtilCollectionsDeserializers.findForMap(mapType);
                                if (jsonDeserializer3 == null) {
                                    mapType2 = mapType;
                                    beanDescription2 = beanDescription;
                                    enumMapDeserializer = jsonDeserializer3;
                                }
                                return jsonDeserializer3;
                            }
                            if (enumMapDeserializer == null) {
                                basicDeserializerFactory = basicDeserializerFactory2;
                                MapDeserializer mapDeserializer = new MapDeserializer(mapType2, basicDeserializerFactory2.findValueInstantiator(deserializationContext, beanDescription2), keyDeserializer, jsonDeserializer8, findTypeDeserializer);
                                JsonIgnoreProperties.Value defaultPropertyIgnorals = deserializationConfig.getDefaultPropertyIgnorals(Map.class, beanDescription2.getClassInfo());
                                if (defaultPropertyIgnorals != null) {
                                    set = defaultPropertyIgnorals.findIgnoredForDeserialization();
                                }
                                mapDeserializer.setIgnorableProperties(set);
                                jsonDeserializer3 = mapDeserializer;
                            }
                        }
                        basicDeserializerFactory = basicDeserializerFactory2;
                        jsonDeserializer3 = enumMapDeserializer;
                    } else {
                        basicDeserializerFactory = basicDeserializerFactory5;
                        jsonDeserializer3 = jsonDeserializer2;
                    }
                    if (basicDeserializerFactory._factoryConfig.hasDeserializerModifiers()) {
                        ArrayIterator arrayIterator5 = (ArrayIterator) basicDeserializerFactory._factoryConfig.deserializerModifiers();
                        while (arrayIterator5.hasNext()) {
                            ((BeanDeserializerModifier) arrayIterator5.next()).getClass();
                        }
                    }
                    return jsonDeserializer3;
                }
                BasicDeserializerFactory basicDeserializerFactory6 = (BasicDeserializerFactory) deserializerFactory;
                basicDeserializerFactory6.getClass();
                JavaType keyType2 = mapLikeType.getKeyType();
                JavaType contentType3 = mapLikeType.getContentType();
                DeserializationConfig config5 = deserializationContext.mo12getConfig();
                JsonDeserializer<?> jsonDeserializer9 = (JsonDeserializer) contentType3.getValueHandler();
                KeyDeserializer keyDeserializer2 = (KeyDeserializer) keyType2.getValueHandler();
                TypeDeserializer typeDeserializer3 = (TypeDeserializer) contentType3.getTypeHandler();
                if (typeDeserializer3 == null) {
                    typeDeserializer3 = basicDeserializerFactory6.findTypeDeserializer(config5, contentType3);
                }
                ArrayIterator arrayIterator6 = (ArrayIterator) basicDeserializerFactory6._factoryConfig.deserializers();
                while (true) {
                    if (arrayIterator6.hasNext()) {
                        JsonDeserializer<?> findMapLikeDeserializer = ((Deserializers) arrayIterator6.next()).findMapLikeDeserializer(mapLikeType, config5, beanDescription, keyDeserializer2, typeDeserializer3, jsonDeserializer9);
                        if (findMapLikeDeserializer != null) {
                            jsonDeserializer5 = findMapLikeDeserializer;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (jsonDeserializer5 != null && basicDeserializerFactory6._factoryConfig.hasDeserializerModifiers()) {
                    ArrayIterator arrayIterator7 = (ArrayIterator) basicDeserializerFactory6._factoryConfig.deserializerModifiers();
                    while (arrayIterator7.hasNext()) {
                        ((BeanDeserializerModifier) arrayIterator7.next()).getClass();
                    }
                }
                return jsonDeserializer5;
            } else if (javaType.isCollectionLikeType() && ((findExpectedFormat = beanDescription.findExpectedFormat(null)) == null || findExpectedFormat.getShape() != shape)) {
                CollectionLikeType collectionLikeType = (CollectionLikeType) javaType;
                if (collectionLikeType.isTrueCollectionType()) {
                    return deserializerFactory.createCollectionDeserializer(deserializationContext, (CollectionType) collectionLikeType, beanDescription);
                }
                BasicDeserializerFactory basicDeserializerFactory7 = (BasicDeserializerFactory) deserializerFactory;
                basicDeserializerFactory7.getClass();
                JavaType contentType4 = collectionLikeType.getContentType();
                JsonDeserializer<?> jsonDeserializer10 = (JsonDeserializer) contentType4.getValueHandler();
                DeserializationConfig config6 = deserializationContext.mo12getConfig();
                TypeDeserializer typeDeserializer4 = (TypeDeserializer) contentType4.getTypeHandler();
                if (typeDeserializer4 == null) {
                    typeDeserializer4 = basicDeserializerFactory7.findTypeDeserializer(config6, contentType4);
                }
                ArrayIterator arrayIterator8 = (ArrayIterator) basicDeserializerFactory7._factoryConfig.deserializers();
                while (true) {
                    if (arrayIterator8.hasNext()) {
                        JsonDeserializer<?> findCollectionLikeDeserializer = ((Deserializers) arrayIterator8.next()).findCollectionLikeDeserializer(collectionLikeType, config6, beanDescription, typeDeserializer4, jsonDeserializer10);
                        if (findCollectionLikeDeserializer != null) {
                            jsonDeserializer6 = findCollectionLikeDeserializer;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (jsonDeserializer6 != null && basicDeserializerFactory7._factoryConfig.hasDeserializerModifiers()) {
                    ArrayIterator arrayIterator9 = (ArrayIterator) basicDeserializerFactory7._factoryConfig.deserializerModifiers();
                    while (arrayIterator9.hasNext()) {
                        ((BeanDeserializerModifier) arrayIterator9.next()).getClass();
                    }
                }
                return jsonDeserializer6;
            }
        }
        if (javaType.isReferenceType()) {
            ReferenceType referenceType = (ReferenceType) javaType;
            BasicDeserializerFactory basicDeserializerFactory8 = (BasicDeserializerFactory) deserializerFactory;
            basicDeserializerFactory8.getClass();
            JavaType contentType5 = referenceType.getContentType();
            JsonDeserializer<?> jsonDeserializer11 = (JsonDeserializer) contentType5.getValueHandler();
            DeserializationConfig config7 = deserializationContext.mo12getConfig();
            TypeDeserializer typeDeserializer5 = (TypeDeserializer) contentType5.getTypeHandler();
            if (typeDeserializer5 == null) {
                typeDeserializer5 = basicDeserializerFactory8.findTypeDeserializer(config7, contentType5);
            }
            ArrayIterator arrayIterator10 = (ArrayIterator) basicDeserializerFactory8._factoryConfig.deserializers();
            while (true) {
                if (!arrayIterator10.hasNext()) {
                    jsonDeserializer = null;
                    break;
                }
                jsonDeserializer = ((Deserializers) arrayIterator10.next()).findReferenceDeserializer(referenceType, config7, beanDescription, typeDeserializer5, jsonDeserializer11);
                if (jsonDeserializer != null) {
                    break;
                }
            }
            if (jsonDeserializer == null && referenceType.isTypeOrSubTypeOf(AtomicReference.class)) {
                if (referenceType.getRawClass() != AtomicReference.class) {
                    valueInstantiator2 = basicDeserializerFactory8.findValueInstantiator(deserializationContext, beanDescription);
                }
                return new AtomicReferenceDeserializer(referenceType, valueInstantiator2, typeDeserializer5, jsonDeserializer11);
            } else if (jsonDeserializer == null || !basicDeserializerFactory8._factoryConfig.hasDeserializerModifiers()) {
                return jsonDeserializer;
            } else {
                ArrayIterator arrayIterator11 = (ArrayIterator) basicDeserializerFactory8._factoryConfig.deserializerModifiers();
                while (arrayIterator11.hasNext()) {
                    ((BeanDeserializerModifier) arrayIterator11.next()).getClass();
                }
                return jsonDeserializer;
            }
        } else if (!JsonNode.class.isAssignableFrom(javaType.getRawClass())) {
            return deserializerFactory.createBeanDeserializer(deserializationContext, javaType, beanDescription);
        } else {
            BasicDeserializerFactory basicDeserializerFactory9 = (BasicDeserializerFactory) deserializerFactory;
            basicDeserializerFactory9.getClass();
            Class<?> rawClass5 = javaType.getRawClass();
            ArrayIterator arrayIterator12 = (ArrayIterator) basicDeserializerFactory9._factoryConfig.deserializers();
            while (true) {
                if (arrayIterator12.hasNext()) {
                    JsonDeserializer<?> findTreeNodeDeserializer = ((Deserializers) arrayIterator12.next()).findTreeNodeDeserializer(rawClass5, config, beanDescription);
                    if (findTreeNodeDeserializer != null) {
                        jsonDeserializer4 = findTreeNodeDeserializer;
                        break;
                    }
                } else {
                    break;
                }
            }
            return jsonDeserializer4 != null ? jsonDeserializer4 : JsonNodeDeserializer.getDeserializer(rawClass5);
        }
    }

    /* access modifiers changed from: protected */
    public JsonDeserializer<Object> _findCachedDeserializer(JavaType javaType) {
        if (javaType == null) {
            throw new IllegalArgumentException("Null JavaType passed");
        } else if (_hasCustomHandlers(javaType)) {
            return null;
        } else {
            return this._cachedDeserializers.get(javaType);
        }
    }

    public KeyDeserializer findKeyDeserializer(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) {
        KeyDeserializer keyDeserializer;
        KeyDeserializer constructEnumKeyDeserializer;
        BasicDeserializerFactory basicDeserializerFactory = (BasicDeserializerFactory) deserializerFactory;
        basicDeserializerFactory.getClass();
        DeserializationConfig config = deserializationContext.mo12getConfig();
        if (basicDeserializerFactory._factoryConfig.hasKeyDeserializers()) {
            BeanDescription introspectClassAnnotations = config.introspectClassAnnotations(javaType.getRawClass());
            ArrayIterator arrayIterator = (ArrayIterator) basicDeserializerFactory._factoryConfig.keyDeserializers();
            keyDeserializer = null;
            while (arrayIterator.hasNext() && (keyDeserializer = ((KeyDeserializers) arrayIterator.next()).findKeyDeserializer(javaType, config, introspectClassAnnotations)) == null) {
            }
        } else {
            keyDeserializer = null;
        }
        if (keyDeserializer == null) {
            if (javaType.isEnumType()) {
                DeserializationConfig config2 = deserializationContext.mo12getConfig();
                Class<?> rawClass = javaType.getRawClass();
                BeanDescription forDeserialization = config2.getClassIntrospector().forDeserialization(config2, javaType, config2);
                keyDeserializer = basicDeserializerFactory.findKeyDeserializerFromAnnotation(deserializationContext, forDeserialization.getClassInfo());
                if (keyDeserializer == null) {
                    JsonDeserializer<?> _findCustomEnumDeserializer = basicDeserializerFactory._findCustomEnumDeserializer(rawClass, config2, forDeserialization);
                    if (_findCustomEnumDeserializer == null) {
                        JsonDeserializer<Object> findDeserializerFromAnnotation = basicDeserializerFactory.findDeserializerFromAnnotation(deserializationContext, forDeserialization.getClassInfo());
                        if (findDeserializerFromAnnotation == null) {
                            EnumResolver constructEnumResolver = basicDeserializerFactory.constructEnumResolver(rawClass, config2, forDeserialization.findJsonValueAccessor());
                            Iterator<AnnotatedMethod> it = forDeserialization.getFactoryMethods().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    constructEnumKeyDeserializer = StdKeyDeserializers.constructEnumKeyDeserializer(constructEnumResolver);
                                    break;
                                }
                                AnnotatedMethod next = it.next();
                                if (basicDeserializerFactory._hasCreatorAnnotation(deserializationContext, next)) {
                                    if (next.getParameterCount() != 1 || !next.getRawReturnType().isAssignableFrom(rawClass)) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("Unsuitable method (");
                                        sb.append(next);
                                        sb.append(") decorated with @JsonCreator (for Enum type ");
                                        throw new IllegalArgumentException(je.l0(rawClass, sb, ")"));
                                    } else if (next.getRawParameterType(0) == String.class) {
                                        if (config2.canOverrideAccessModifiers()) {
                                            ClassUtil.checkAndFixAccess(next.mo17getMember(), deserializationContext.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                                        }
                                        constructEnumKeyDeserializer = StdKeyDeserializers.constructEnumKeyDeserializer(constructEnumResolver, next);
                                    } else {
                                        throw new IllegalArgumentException("Parameter #0 type for factory method (" + next + ") not suitable, must be java.lang.String");
                                    }
                                }
                            }
                        } else {
                            constructEnumKeyDeserializer = StdKeyDeserializers.constructDelegatingKeyDeserializer(javaType, findDeserializerFromAnnotation);
                        }
                    } else {
                        constructEnumKeyDeserializer = StdKeyDeserializers.constructDelegatingKeyDeserializer(javaType, _findCustomEnumDeserializer);
                    }
                    keyDeserializer = constructEnumKeyDeserializer;
                }
            } else {
                keyDeserializer = StdKeyDeserializers.findStringBasedKeyDeserializer(config, javaType);
            }
        }
        if (keyDeserializer != null && basicDeserializerFactory._factoryConfig.hasDeserializerModifiers()) {
            ArrayIterator arrayIterator2 = (ArrayIterator) basicDeserializerFactory._factoryConfig.deserializerModifiers();
            while (arrayIterator2.hasNext()) {
                ((BeanDeserializerModifier) arrayIterator2.next()).getClass();
            }
        }
        if (keyDeserializer != null) {
            if (keyDeserializer instanceof ResolvableDeserializer) {
                ((ResolvableDeserializer) keyDeserializer).resolve(deserializationContext);
            }
            return keyDeserializer;
        }
        deserializationContext.reportBadDefinition(javaType, "Cannot find a (Map) Key deserializer for type " + javaType);
        throw null;
    }

    public JsonDeserializer<Object> findValueDeserializer(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) {
        JsonDeserializer<Object> _findCachedDeserializer = _findCachedDeserializer(javaType);
        if (_findCachedDeserializer != null || (_findCachedDeserializer = _createAndCacheValueDeserializer(deserializationContext, deserializerFactory, javaType)) != null) {
            return _findCachedDeserializer;
        }
        Class<?> rawClass = javaType.getRawClass();
        int i = ClassUtil.a;
        if (!((rawClass.getModifiers() & 1536) == 0)) {
            deserializationContext.reportBadDefinition(javaType, "Cannot find a Value deserializer for abstract type " + javaType);
            throw null;
        }
        deserializationContext.reportBadDefinition(javaType, "Cannot find a Value deserializer for type " + javaType);
        throw null;
    }

    public boolean hasValueDeserializerFor(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) {
        JsonDeserializer<Object> _findCachedDeserializer = _findCachedDeserializer(javaType);
        if (_findCachedDeserializer == null) {
            _findCachedDeserializer = _createAndCacheValueDeserializer(deserializationContext, deserializerFactory, javaType);
        }
        return _findCachedDeserializer != null;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        this._incompleteDeserializers.clear();
        return this;
    }
}
