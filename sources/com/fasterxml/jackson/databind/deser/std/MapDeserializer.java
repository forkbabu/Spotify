package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@JacksonStdImpl
public class MapDeserializer extends ContainerDeserializerBase<Map<Object, Object>> implements ContextualDeserializer, ResolvableDeserializer {
    private static final long serialVersionUID = 1;
    protected JsonDeserializer<Object> _delegateDeserializer;
    protected final boolean _hasDefaultCreator;
    protected Set<String> _ignorableProperties;
    protected final KeyDeserializer _keyDeserializer;
    protected PropertyBasedCreator _propertyBasedCreator;
    protected boolean _standardStringKey;
    protected final JsonDeserializer<Object> _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;
    protected final TypeDeserializer _valueTypeDeserializer;

    /* access modifiers changed from: package-private */
    public static class MapReferring extends ReadableObjectId.Referring {
        private final MapReferringAccumulator _parent;
        public final Object key;
        public final Map<Object, Object> next = new LinkedHashMap();

        MapReferring(MapReferringAccumulator mapReferringAccumulator, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj) {
            super(unresolvedForwardReference, cls);
            this._parent = mapReferringAccumulator;
            this.key = obj;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
        public void handleResolvedForwardReference(Object obj, Object obj2) {
            this._parent.resolveForwardReference(obj, obj2);
        }
    }

    /* access modifiers changed from: private */
    public static final class MapReferringAccumulator {
        private List<MapReferring> _accumulator = new ArrayList();
        private Map<Object, Object> _result;
        private final Class<?> _valueType;

        public MapReferringAccumulator(Class<?> cls, Map<Object, Object> map) {
            this._valueType = cls;
            this._result = map;
        }

        public ReadableObjectId.Referring handleUnresolvedReference(UnresolvedForwardReference unresolvedForwardReference, Object obj) {
            MapReferring mapReferring = new MapReferring(this, unresolvedForwardReference, this._valueType, obj);
            this._accumulator.add(mapReferring);
            return mapReferring;
        }

        public void put(Object obj, Object obj2) {
            if (this._accumulator.isEmpty()) {
                this._result.put(obj, obj2);
                return;
            }
            List<MapReferring> list = this._accumulator;
            list.get(list.size() - 1).next.put(obj, obj2);
        }

        public void resolveForwardReference(Object obj, Object obj2) {
            Iterator<MapReferring> it = this._accumulator.iterator();
            Map<Object, Object> map = this._result;
            while (it.hasNext()) {
                MapReferring next = it.next();
                if (next.hasId(obj)) {
                    it.remove();
                    map.put(next.key, obj2);
                    map.putAll(next.next);
                    return;
                }
                map = next.next;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }
    }

    public MapDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, KeyDeserializer keyDeserializer, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer) {
        super(javaType, (NullValueProvider) null, (Boolean) null);
        this._keyDeserializer = keyDeserializer;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
        this._valueInstantiator = valueInstantiator;
        this._hasDefaultCreator = valueInstantiator.canCreateUsingDefault();
        this._delegateDeserializer = null;
        this._propertyBasedCreator = null;
        this._standardStringKey = _isStdKeyDeser(javaType, keyDeserializer);
    }

    private void handleUnresolvedReference(DeserializationContext deserializationContext, MapReferringAccumulator mapReferringAccumulator, Object obj, UnresolvedForwardReference unresolvedForwardReference) {
        if (mapReferringAccumulator != null) {
            unresolvedForwardReference.getRoid().appendReferring(mapReferringAccumulator.handleUnresolvedReference(unresolvedForwardReference, obj));
            return;
        }
        deserializationContext.reportInputMismatch(this, "Unresolved forward reference but no identity info: " + unresolvedForwardReference, new Object[0]);
        throw null;
    }

    /* access modifiers changed from: protected */
    public final boolean _isStdKeyDeser(JavaType javaType, KeyDeserializer keyDeserializer) {
        JavaType keyType;
        if (keyDeserializer == null || (keyType = javaType.getKeyType()) == null) {
            return true;
        }
        Class<?> rawClass = keyType.getRawClass();
        if ((rawClass == String.class || rawClass == Object.class) && isDefaultKeyDeserializer(keyDeserializer)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void _readAndBind(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) {
        String str;
        Object obj;
        KeyDeserializer keyDeserializer = this._keyDeserializer;
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        boolean z = jsonDeserializer.getObjectIdReader() != null;
        MapReferringAccumulator mapReferringAccumulator = z ? new MapReferringAccumulator(this._containerType.getContentType().getRawClass(), map) : null;
        if (jsonParser.isExpectedStartObjectToken()) {
            str = jsonParser.nextFieldName();
        } else {
            JsonToken currentToken = jsonParser.getCurrentToken();
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (currentToken == jsonToken) {
                str = jsonParser.getCurrentName();
            } else if (currentToken != JsonToken.END_OBJECT) {
                deserializationContext.reportWrongTokenException(this, jsonToken, (String) null, new Object[0]);
                throw null;
            } else {
                return;
            }
        }
        while (str != null) {
            Object deserializeKey = keyDeserializer.deserializeKey(str, deserializationContext);
            JsonToken nextToken = jsonParser.nextToken();
            Set<String> set = this._ignorableProperties;
            if (set == null || !set.contains(str)) {
                try {
                    if (nextToken == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            obj = this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else if (typeDeserializer == null) {
                        obj = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                    } else {
                        obj = jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                    }
                    if (z) {
                        mapReferringAccumulator.put(deserializeKey, obj);
                    } else {
                        map.put(deserializeKey, obj);
                    }
                } catch (UnresolvedForwardReference e) {
                    handleUnresolvedReference(deserializationContext, mapReferringAccumulator, deserializeKey, e);
                } catch (Exception e2) {
                    wrapAndThrow(e2, map, str);
                    throw null;
                }
            } else {
                jsonParser.skipChildren();
            }
            str = jsonParser.nextFieldName();
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JsonDeserializer<?> jsonDeserializer;
        AnnotatedMember member;
        JsonIgnoreProperties.Value findPropertyIgnorals;
        KeyDeserializer keyDeserializer = this._keyDeserializer;
        if (keyDeserializer == null) {
            keyDeserializer = deserializationContext.findKeyDeserializer(this._containerType.getKeyType(), beanProperty);
        } else if (keyDeserializer instanceof ContextualKeyDeserializer) {
            keyDeserializer = ((ContextualKeyDeserializer) keyDeserializer).createContextual(deserializationContext, beanProperty);
        }
        JsonDeserializer<?> jsonDeserializer2 = this._valueDeserializer;
        if (beanProperty != null) {
            jsonDeserializer2 = findConvertingContentDeserializer(deserializationContext, beanProperty, jsonDeserializer2);
        }
        JavaType contentType = this._containerType.getContentType();
        if (jsonDeserializer2 == null) {
            jsonDeserializer = deserializationContext.findContextualValueDeserializer(contentType, beanProperty);
        } else {
            jsonDeserializer = deserializationContext.handleSecondaryContextualization(jsonDeserializer2, beanProperty, contentType);
        }
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        if (typeDeserializer != null) {
            typeDeserializer = typeDeserializer.forProperty(beanProperty);
        }
        Set<String> set = this._ignorableProperties;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (!(!StdDeserializer._neitherNull(annotationIntrospector, beanProperty) || (member = beanProperty.getMember()) == null || (findPropertyIgnorals = annotationIntrospector.findPropertyIgnorals(member)) == null)) {
            Set<String> findIgnoredForDeserialization = findPropertyIgnorals.findIgnoredForDeserialization();
            if (!findIgnoredForDeserialization.isEmpty()) {
                set = set == null ? new HashSet<>() : new HashSet(set);
                for (String str : findIgnoredForDeserialization) {
                    set.add(str);
                }
            }
        }
        NullValueProvider findContentNullProvider = findContentNullProvider(deserializationContext, beanProperty, jsonDeserializer);
        return (this._keyDeserializer == keyDeserializer && this._valueDeserializer == jsonDeserializer && this._valueTypeDeserializer == typeDeserializer && this._nullProvider == findContentNullProvider && this._ignorableProperties == set) ? this : new MapDeserializer(this, keyDeserializer, jsonDeserializer, typeDeserializer, findContentNullProvider, set);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        String str;
        Object obj2;
        String str2;
        Object obj3;
        Map map = (Map) obj;
        jsonParser.setCurrentValue(map);
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.START_OBJECT || currentToken == JsonToken.FIELD_NAME) {
            if (this._standardStringKey) {
                JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
                TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
                if (jsonParser.isExpectedStartObjectToken()) {
                    str2 = jsonParser.nextFieldName();
                } else {
                    JsonToken currentToken2 = jsonParser.getCurrentToken();
                    if (currentToken2 != JsonToken.END_OBJECT) {
                        JsonToken jsonToken = JsonToken.FIELD_NAME;
                        if (currentToken2 == jsonToken) {
                            str2 = jsonParser.getCurrentName();
                        } else {
                            deserializationContext.reportWrongTokenException(this, jsonToken, (String) null, new Object[0]);
                            throw null;
                        }
                    }
                }
                while (str2 != null) {
                    JsonToken nextToken = jsonParser.nextToken();
                    Set<String> set = this._ignorableProperties;
                    if (set == null || !set.contains(str2)) {
                        try {
                            if (nextToken != JsonToken.VALUE_NULL) {
                                Object obj4 = map.get(str2);
                                if (obj4 != null) {
                                    obj3 = jsonDeserializer.deserialize(jsonParser, deserializationContext, obj4);
                                } else if (typeDeserializer == null) {
                                    obj3 = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                                } else {
                                    obj3 = jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                                }
                                if (obj3 != obj4) {
                                    map.put(str2, obj3);
                                }
                            } else if (!this._skipNullValues) {
                                map.put(str2, this._nullProvider.getNullValue(deserializationContext));
                            }
                        } catch (Exception e) {
                            wrapAndThrow(e, map, str2);
                            throw null;
                        }
                    } else {
                        jsonParser.skipChildren();
                    }
                    str2 = jsonParser.nextFieldName();
                }
            } else {
                KeyDeserializer keyDeserializer = this._keyDeserializer;
                JsonDeserializer<Object> jsonDeserializer2 = this._valueDeserializer;
                TypeDeserializer typeDeserializer2 = this._valueTypeDeserializer;
                if (jsonParser.isExpectedStartObjectToken()) {
                    str = jsonParser.nextFieldName();
                } else {
                    JsonToken currentToken3 = jsonParser.getCurrentToken();
                    if (currentToken3 != JsonToken.END_OBJECT) {
                        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
                        if (currentToken3 == jsonToken2) {
                            str = jsonParser.getCurrentName();
                        } else {
                            deserializationContext.reportWrongTokenException(this, jsonToken2, (String) null, new Object[0]);
                            throw null;
                        }
                    }
                }
                while (str != null) {
                    Object deserializeKey = keyDeserializer.deserializeKey(str, deserializationContext);
                    JsonToken nextToken2 = jsonParser.nextToken();
                    Set<String> set2 = this._ignorableProperties;
                    if (set2 == null || !set2.contains(str)) {
                        try {
                            if (nextToken2 != JsonToken.VALUE_NULL) {
                                Object obj5 = map.get(deserializeKey);
                                if (obj5 != null) {
                                    obj2 = jsonDeserializer2.deserialize(jsonParser, deserializationContext, obj5);
                                } else if (typeDeserializer2 == null) {
                                    obj2 = jsonDeserializer2.deserialize(jsonParser, deserializationContext);
                                } else {
                                    obj2 = jsonDeserializer2.deserializeWithType(jsonParser, deserializationContext, typeDeserializer2);
                                }
                                if (obj2 != obj5) {
                                    map.put(deserializeKey, obj2);
                                }
                            } else if (!this._skipNullValues) {
                                map.put(deserializeKey, this._nullProvider.getNullValue(deserializationContext));
                            }
                        } catch (Exception e2) {
                            wrapAndThrow(e2, map, str);
                            throw null;
                        }
                    } else {
                        jsonParser.skipChildren();
                    }
                    str = jsonParser.nextFieldName();
                }
            }
            return map;
        }
        deserializationContext.handleUnexpectedToken(this._containerType.getRawClass(), jsonParser);
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public JsonDeserializer<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public JavaType getValueType() {
        return this._containerType;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return this._valueDeserializer == null && this._keyDeserializer == null && this._valueTypeDeserializer == null && this._ignorableProperties == null;
    }

    @Override // com.fasterxml.jackson.databind.deser.ResolvableDeserializer
    public void resolve(DeserializationContext deserializationContext) {
        if (this._valueInstantiator.canCreateUsingDelegate()) {
            JavaType delegateType = this._valueInstantiator.getDelegateType(deserializationContext.mo12getConfig());
            if (delegateType != null) {
                this._delegateDeserializer = findDeserializer(deserializationContext, delegateType, null);
            } else {
                JavaType javaType = this._containerType;
                deserializationContext.reportBadDefinition(javaType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", javaType, this._valueInstantiator.getClass().getName()));
                throw null;
            }
        } else if (this._valueInstantiator.canCreateUsingArrayDelegate()) {
            JavaType arrayDelegateType = this._valueInstantiator.getArrayDelegateType(deserializationContext.mo12getConfig());
            if (arrayDelegateType != null) {
                this._delegateDeserializer = findDeserializer(deserializationContext, arrayDelegateType, null);
            } else {
                JavaType javaType2 = this._containerType;
                deserializationContext.reportBadDefinition(javaType2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", javaType2, this._valueInstantiator.getClass().getName()));
                throw null;
            }
        }
        if (this._valueInstantiator.canCreateFromObjectWith()) {
            this._propertyBasedCreator = PropertyBasedCreator.construct(deserializationContext, this._valueInstantiator, this._valueInstantiator.getFromObjectArguments(deserializationContext.mo12getConfig()), deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
        }
        this._standardStringKey = _isStdKeyDeser(this._containerType, this._keyDeserializer);
    }

    public void setIgnorableProperties(Set<String> set) {
        if (set == null || set.size() == 0) {
            set = null;
        }
        this._ignorableProperties = set;
    }

    protected MapDeserializer(MapDeserializer mapDeserializer, KeyDeserializer keyDeserializer, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer, NullValueProvider nullValueProvider, Set<String> set) {
        super(mapDeserializer, nullValueProvider, mapDeserializer._unwrapSingle);
        this._keyDeserializer = keyDeserializer;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
        this._valueInstantiator = mapDeserializer._valueInstantiator;
        this._propertyBasedCreator = mapDeserializer._propertyBasedCreator;
        this._delegateDeserializer = mapDeserializer._delegateDeserializer;
        this._hasDefaultCreator = mapDeserializer._hasDefaultCreator;
        this._ignorableProperties = set;
        this._standardStringKey = _isStdKeyDeser(this._containerType, keyDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String str;
        Object obj;
        String str2;
        Object obj2;
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        if (propertyBasedCreator != null) {
            PropertyValueBuffer startBuilding = propertyBasedCreator.startBuilding(jsonParser, deserializationContext, null);
            JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
            TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
            if (jsonParser.isExpectedStartObjectToken()) {
                str2 = jsonParser.nextFieldName();
            } else {
                str2 = jsonParser.hasToken(JsonToken.FIELD_NAME) ? jsonParser.getCurrentName() : null;
            }
            while (str2 != null) {
                JsonToken nextToken = jsonParser.nextToken();
                Set<String> set = this._ignorableProperties;
                if (set == null || !set.contains(str2)) {
                    SettableBeanProperty findCreatorProperty = propertyBasedCreator.findCreatorProperty(str2);
                    if (findCreatorProperty == null) {
                        Object deserializeKey = this._keyDeserializer.deserializeKey(str2, deserializationContext);
                        try {
                            if (nextToken == JsonToken.VALUE_NULL) {
                                if (!this._skipNullValues) {
                                    obj2 = this._nullProvider.getNullValue(deserializationContext);
                                }
                            } else if (typeDeserializer == null) {
                                obj2 = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                            } else {
                                obj2 = jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                            }
                            startBuilding.bufferMapProperty(deserializeKey, obj2);
                        } catch (Exception e) {
                            wrapAndThrow(e, this._containerType.getRawClass(), str2);
                            throw null;
                        }
                    } else if (startBuilding.assignParameter(findCreatorProperty, findCreatorProperty.deserialize(jsonParser, deserializationContext))) {
                        jsonParser.nextToken();
                        try {
                            Map<Object, Object> map = (Map) propertyBasedCreator.build(deserializationContext, startBuilding);
                            _readAndBind(jsonParser, deserializationContext, map);
                            return map;
                        } catch (Exception e2) {
                            wrapAndThrow(e2, this._containerType.getRawClass(), str2);
                            throw null;
                        }
                    }
                } else {
                    jsonParser.skipChildren();
                }
                str2 = jsonParser.nextFieldName();
            }
            try {
                return (Map) propertyBasedCreator.build(deserializationContext, startBuilding);
            } catch (Exception e3) {
                wrapAndThrow(e3, this._containerType.getRawClass(), str2);
                throw null;
            }
        } else {
            JsonDeserializer<Object> jsonDeserializer2 = this._delegateDeserializer;
            if (jsonDeserializer2 != null) {
                return (Map) this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer2.deserialize(jsonParser, deserializationContext));
            }
            if (this._hasDefaultCreator) {
                JsonToken currentToken = jsonParser.getCurrentToken();
                if (currentToken == JsonToken.START_OBJECT || currentToken == JsonToken.FIELD_NAME || currentToken == JsonToken.END_OBJECT) {
                    Map<Object, Object> map2 = (Map) this._valueInstantiator.createUsingDefault(deserializationContext);
                    if (this._standardStringKey) {
                        JsonDeserializer<Object> jsonDeserializer3 = this._valueDeserializer;
                        TypeDeserializer typeDeserializer2 = this._valueTypeDeserializer;
                        boolean z = jsonDeserializer3.getObjectIdReader() != null;
                        MapReferringAccumulator mapReferringAccumulator = z ? new MapReferringAccumulator(this._containerType.getContentType().getRawClass(), map2) : null;
                        if (jsonParser.isExpectedStartObjectToken()) {
                            str = jsonParser.nextFieldName();
                        } else {
                            JsonToken currentToken2 = jsonParser.getCurrentToken();
                            if (currentToken2 == JsonToken.END_OBJECT) {
                                return map2;
                            }
                            JsonToken jsonToken = JsonToken.FIELD_NAME;
                            if (currentToken2 == jsonToken) {
                                str = jsonParser.getCurrentName();
                            } else {
                                deserializationContext.reportWrongTokenException(this, jsonToken, (String) null, new Object[0]);
                                throw null;
                            }
                        }
                        while (str != null) {
                            JsonToken nextToken2 = jsonParser.nextToken();
                            Set<String> set2 = this._ignorableProperties;
                            if (set2 == null || !set2.contains(str)) {
                                try {
                                    if (nextToken2 == JsonToken.VALUE_NULL) {
                                        if (!this._skipNullValues) {
                                            obj = this._nullProvider.getNullValue(deserializationContext);
                                        }
                                    } else if (typeDeserializer2 == null) {
                                        obj = jsonDeserializer3.deserialize(jsonParser, deserializationContext);
                                    } else {
                                        obj = jsonDeserializer3.deserializeWithType(jsonParser, deserializationContext, typeDeserializer2);
                                    }
                                    if (z) {
                                        mapReferringAccumulator.put(str, obj);
                                    } else {
                                        map2.put(str, obj);
                                    }
                                } catch (UnresolvedForwardReference e4) {
                                    handleUnresolvedReference(deserializationContext, mapReferringAccumulator, str, e4);
                                } catch (Exception e5) {
                                    wrapAndThrow(e5, map2, str);
                                    throw null;
                                }
                            } else {
                                jsonParser.skipChildren();
                            }
                            str = jsonParser.nextFieldName();
                        }
                        return map2;
                    }
                    _readAndBind(jsonParser, deserializationContext, map2);
                    return map2;
                } else if (currentToken == JsonToken.VALUE_STRING) {
                    return (Map) this._valueInstantiator.createFromString(deserializationContext, jsonParser.getText());
                } else {
                    return (Map) _deserializeFromEmpty(jsonParser, deserializationContext);
                }
            } else {
                deserializationContext.handleMissingInstantiator(this._containerType.getRawClass(), this._valueInstantiator, jsonParser, "no default constructor found", new Object[0]);
                throw null;
            }
        }
    }
}
