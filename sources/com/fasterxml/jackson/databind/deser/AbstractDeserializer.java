package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.Serializable;
import java.util.Map;

public class AbstractDeserializer extends JsonDeserializer<Object> implements ContextualDeserializer, Serializable {
    private static final long serialVersionUID = 1;
    protected final boolean _acceptBoolean;
    protected final boolean _acceptDouble;
    protected final boolean _acceptInt;
    protected final boolean _acceptString;
    protected final Map<String, SettableBeanProperty> _backRefProperties;
    protected final JavaType _baseType;
    protected final ObjectIdReader _objectIdReader;
    protected transient Map<String, SettableBeanProperty> _properties;

    public AbstractDeserializer(BeanDeserializerBuilder beanDeserializerBuilder, BeanDescription beanDescription, Map<String, SettableBeanProperty> map, Map<String, SettableBeanProperty> map2) {
        JavaType type = beanDescription.getType();
        this._baseType = type;
        this._objectIdReader = beanDeserializerBuilder._objectIdReader;
        this._backRefProperties = map;
        this._properties = map2;
        Class<?> rawClass = type.getRawClass();
        this._acceptString = rawClass.isAssignableFrom(String.class);
        boolean z = true;
        this._acceptBoolean = rawClass == Boolean.TYPE || rawClass.isAssignableFrom(Boolean.class);
        this._acceptInt = rawClass == Integer.TYPE || rawClass.isAssignableFrom(Integer.class);
        if (rawClass != Double.TYPE && !rawClass.isAssignableFrom(Double.class)) {
            z = false;
        }
        this._acceptDouble = z;
    }

    /* access modifiers changed from: protected */
    public Object _deserializeFromObjectId(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object readObjectReference = this._objectIdReader.readObjectReference(jsonParser, deserializationContext);
        ObjectIdReader objectIdReader = this._objectIdReader;
        ReadableObjectId findObjectId = deserializationContext.findObjectId(readObjectReference, objectIdReader.generator, objectIdReader.resolver);
        Object resolve = findObjectId.resolve();
        if (resolve != null) {
            return resolve;
        }
        throw new UnresolvedForwardReference(jsonParser, "Could not resolve Object Id [" + readObjectReference + "] -- unresolved forward-reference?", jsonParser.getCurrentLocation(), findObjectId);
    }

    /* access modifiers changed from: protected */
    public Object _deserializeIfNatural(JsonParser jsonParser) {
        switch (jsonParser.getCurrentTokenId()) {
            case 6:
                if (this._acceptString) {
                    return jsonParser.getText();
                }
                return null;
            case 7:
                if (this._acceptInt) {
                    return Integer.valueOf(jsonParser.getIntValue());
                }
                return null;
            case 8:
                if (this._acceptDouble) {
                    return Double.valueOf(jsonParser.getDoubleValue());
                }
                return null;
            case 9:
                if (this._acceptBoolean) {
                    return Boolean.TRUE;
                }
                return null;
            case 10:
                if (this._acceptBoolean) {
                    return Boolean.FALSE;
                }
                return null;
            default:
                return null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        AnnotatedMember member;
        ObjectIdInfo findObjectIdInfo;
        SettableBeanProperty settableBeanProperty;
        JavaType javaType;
        ObjectIdGenerator<?> objectIdGenerator;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (beanProperty != null && annotationIntrospector != null && (member = beanProperty.getMember()) != null && (findObjectIdInfo = annotationIntrospector.findObjectIdInfo(member)) != null) {
            ObjectIdResolver objectIdResolverInstance = deserializationContext.objectIdResolverInstance(member, findObjectIdInfo);
            ObjectIdInfo findObjectReferenceInfo = annotationIntrospector.findObjectReferenceInfo(member, findObjectIdInfo);
            Class<? extends ObjectIdGenerator<?>> generatorType = findObjectReferenceInfo.getGeneratorType();
            if (generatorType == ObjectIdGenerators$PropertyGenerator.class) {
                PropertyName propertyName = findObjectReferenceInfo.getPropertyName();
                Map<String, SettableBeanProperty> map = this._properties;
                SettableBeanProperty settableBeanProperty2 = map == null ? null : map.get(propertyName.getSimpleName());
                if (settableBeanProperty2 != null) {
                    JavaType javaType2 = settableBeanProperty2._type;
                    objectIdGenerator = new PropertyBasedObjectIdGenerator(findObjectReferenceInfo.getScope());
                    javaType = javaType2;
                    settableBeanProperty = settableBeanProperty2;
                } else {
                    deserializationContext.reportBadDefinition(this._baseType, String.format("Invalid Object Id definition for %s: cannot find property with name '%s'", handledType().getName(), propertyName));
                    throw null;
                }
            } else {
                objectIdResolverInstance = deserializationContext.objectIdResolverInstance(member, findObjectReferenceInfo);
                JavaType javaType3 = deserializationContext.getTypeFactory().findTypeParameters(deserializationContext.constructType((Class<?>) generatorType), ObjectIdGenerator.class)[0];
                objectIdGenerator = deserializationContext.objectIdGeneratorInstance(member, findObjectReferenceInfo);
                settableBeanProperty = null;
                javaType = javaType3;
            }
            return new AbstractDeserializer(this, ObjectIdReader.construct(javaType, findObjectReferenceInfo.getPropertyName(), objectIdGenerator, deserializationContext.findRootValueDeserializer(javaType), settableBeanProperty, objectIdResolverInstance), null);
        } else if (this._properties == null) {
            return this;
        } else {
            return new AbstractDeserializer(this, this._objectIdReader, null);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        deserializationContext.handleMissingInstantiator(this._baseType.getRawClass(), new ValueInstantiator.Base(this._baseType), jsonParser, "abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information", new Object[0]);
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        JsonToken currentToken;
        if (!(this._objectIdReader == null || (currentToken = jsonParser.getCurrentToken()) == null)) {
            if (currentToken.isScalarValue()) {
                return _deserializeFromObjectId(jsonParser, deserializationContext);
            }
            if (currentToken == JsonToken.START_OBJECT) {
                currentToken = jsonParser.nextToken();
            }
            if (currentToken == JsonToken.FIELD_NAME) {
                this._objectIdReader.maySerializeAsObject();
            }
        }
        Object _deserializeIfNatural = _deserializeIfNatural(jsonParser);
        if (_deserializeIfNatural != null) {
            return _deserializeIfNatural;
        }
        return typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public SettableBeanProperty findBackReference(String str) {
        Map<String, SettableBeanProperty> map = this._backRefProperties;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public ObjectIdReader getObjectIdReader() {
        return this._objectIdReader;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Class<?> handledType() {
        return this._baseType.getRawClass();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return null;
    }

    protected AbstractDeserializer(BeanDescription beanDescription) {
        JavaType type = beanDescription.getType();
        this._baseType = type;
        this._objectIdReader = null;
        this._backRefProperties = null;
        Class<?> rawClass = type.getRawClass();
        this._acceptString = rawClass.isAssignableFrom(String.class);
        boolean z = false;
        this._acceptBoolean = rawClass == Boolean.TYPE || rawClass.isAssignableFrom(Boolean.class);
        this._acceptInt = rawClass == Integer.TYPE || rawClass.isAssignableFrom(Integer.class);
        this._acceptDouble = (rawClass == Double.TYPE || rawClass.isAssignableFrom(Double.class)) ? true : z;
    }

    protected AbstractDeserializer(AbstractDeserializer abstractDeserializer, ObjectIdReader objectIdReader, Map<String, SettableBeanProperty> map) {
        this._baseType = abstractDeserializer._baseType;
        this._backRefProperties = abstractDeserializer._backRefProperties;
        this._acceptString = abstractDeserializer._acceptString;
        this._acceptBoolean = abstractDeserializer._acceptBoolean;
        this._acceptInt = abstractDeserializer._acceptInt;
        this._acceptDouble = abstractDeserializer._acceptDouble;
        this._objectIdReader = objectIdReader;
        this._properties = null;
    }
}
