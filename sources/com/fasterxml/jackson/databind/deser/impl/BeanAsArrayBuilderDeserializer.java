package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.PropertyValue;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.Set;

public class BeanAsArrayBuilderDeserializer extends BeanDeserializerBase {
    private static final long serialVersionUID = 1;
    protected final AnnotatedMethod _buildMethod;
    protected final BeanDeserializerBase _delegate;
    protected final SettableBeanProperty[] _orderedProperties;
    protected final JavaType _targetType;

    public BeanAsArrayBuilderDeserializer(BeanDeserializerBase beanDeserializerBase, JavaType javaType, SettableBeanProperty[] settableBeanPropertyArr, AnnotatedMethod annotatedMethod) {
        super(beanDeserializerBase);
        this._delegate = beanDeserializerBase;
        this._targetType = javaType;
        this._orderedProperties = settableBeanPropertyArr;
        this._buildMethod = annotatedMethod;
    }

    /* access modifiers changed from: protected */
    public Object _deserializeFromNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        deserializationContext.handleUnexpectedToken(handledType(), jsonParser.getCurrentToken(), jsonParser, "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", this._beanType.getRawClass().getName(), jsonParser.getCurrentToken());
        throw null;
    }

    /* access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) {
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        PropertyValueBuffer propertyValueBuffer = new PropertyValueBuffer(jsonParser, deserializationContext, propertyBasedCreator._propertyCount, this._objectIdReader);
        SettableBeanProperty[] settableBeanPropertyArr = this._orderedProperties;
        int length = settableBeanPropertyArr.length;
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        Object obj = null;
        int i = 0;
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            SettableBeanProperty settableBeanProperty = i < length ? settableBeanPropertyArr[i] : null;
            if (settableBeanProperty == null) {
                jsonParser.skipChildren();
            } else if (activeView != null && !settableBeanProperty.visibleInView(activeView)) {
                jsonParser.skipChildren();
            } else if (obj != null) {
                try {
                    obj = settableBeanProperty.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
                } catch (Exception e) {
                    wrapAndThrow(e, obj, settableBeanProperty.getName(), deserializationContext);
                    throw null;
                }
            } else {
                String name = settableBeanProperty.getName();
                SettableBeanProperty findCreatorProperty = propertyBasedCreator.findCreatorProperty(name);
                if (findCreatorProperty != null) {
                    if (propertyValueBuffer.assignParameter(findCreatorProperty, findCreatorProperty.deserialize(jsonParser, deserializationContext))) {
                        try {
                            obj = propertyBasedCreator.build(deserializationContext, propertyValueBuffer);
                            if (obj.getClass() != this._beanType.getRawClass()) {
                                JavaType javaType = this._beanType;
                                deserializationContext.reportBadDefinition(javaType, String.format("Cannot support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s", javaType.getRawClass().getName(), obj.getClass().getName()));
                                throw null;
                            }
                        } catch (Exception e2) {
                            wrapAndThrow(e2, this._beanType.getRawClass(), name, deserializationContext);
                            throw null;
                        }
                    } else {
                        continue;
                    }
                } else if (!propertyValueBuffer.readIdProperty(name)) {
                    propertyValueBuffer._buffered = new PropertyValue.Regular(propertyValueBuffer._buffered, settableBeanProperty.deserialize(jsonParser, deserializationContext), settableBeanProperty);
                }
            }
            i++;
        }
        if (obj != null) {
            return obj;
        }
        try {
            return propertyBasedCreator.build(deserializationContext, propertyValueBuffer);
        } catch (Exception e3) {
            wrapInstantiationProblem(e3, deserializationContext);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase asArrayDeserializer() {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object obj;
        if (!jsonParser.isExpectedStartArrayToken()) {
            _deserializeFromNonArray(jsonParser, deserializationContext);
            throw null;
        } else if (!this._vanillaProcessing) {
            if (this._nonStandardCreation) {
                obj = deserializeFromObjectUsingNonDefault(jsonParser, deserializationContext);
            } else {
                Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
                if (this._injectables != null) {
                    injectValues(deserializationContext, createUsingDefault);
                }
                Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
                SettableBeanProperty[] settableBeanPropertyArr = this._orderedProperties;
                int length = settableBeanPropertyArr.length;
                int i = 0;
                while (true) {
                    JsonToken nextToken = jsonParser.nextToken();
                    JsonToken jsonToken = JsonToken.END_ARRAY;
                    if (nextToken == jsonToken) {
                        break;
                    } else if (i != length) {
                        SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
                        i++;
                        if (settableBeanProperty == null || (activeView != null && !settableBeanProperty.visibleInView(activeView))) {
                            jsonParser.skipChildren();
                        } else {
                            try {
                                settableBeanProperty.deserializeSetAndReturn(jsonParser, deserializationContext, createUsingDefault);
                            } catch (Exception e) {
                                wrapAndThrow(e, createUsingDefault, settableBeanProperty.getName(), deserializationContext);
                                throw null;
                            }
                        }
                    } else if (this._ignoreAllUnknown || !deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                            jsonParser.skipChildren();
                        }
                    } else {
                        deserializationContext.reportWrongTokenException(this, jsonToken, "Unexpected JSON value(s); expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                        throw null;
                    }
                }
                obj = createUsingDefault;
            }
            return finishBuild(deserializationContext, obj);
        } else {
            Object createUsingDefault2 = this._valueInstantiator.createUsingDefault(deserializationContext);
            SettableBeanProperty[] settableBeanPropertyArr2 = this._orderedProperties;
            int length2 = settableBeanPropertyArr2.length;
            int i2 = 0;
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                if (i2 != length2) {
                    SettableBeanProperty settableBeanProperty2 = settableBeanPropertyArr2[i2];
                    if (settableBeanProperty2 != null) {
                        try {
                            createUsingDefault2 = settableBeanProperty2.deserializeSetAndReturn(jsonParser, deserializationContext, createUsingDefault2);
                        } catch (Exception e2) {
                            wrapAndThrow(e2, createUsingDefault2, settableBeanProperty2.getName(), deserializationContext);
                            throw null;
                        }
                    } else {
                        jsonParser.skipChildren();
                    }
                    i2++;
                } else if (this._ignoreAllUnknown || !deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                        jsonParser.skipChildren();
                    }
                    return finishBuild(deserializationContext, createUsingDefault2);
                } else {
                    deserializationContext.reportInputMismatch(handledType(), "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length2));
                    throw null;
                }
            }
            return finishBuild(deserializationContext, createUsingDefault2);
        }
    }

    /* access modifiers changed from: protected */
    public final Object finishBuild(DeserializationContext deserializationContext, Object obj) {
        try {
            return this._buildMethod.mo17getMember().invoke(obj, null);
        } catch (Exception e) {
            wrapInstantiationProblem(e, deserializationContext);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        return this._delegate.unwrappingDeserializer(nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withBeanProperties(BeanPropertyMap beanPropertyMap) {
        return new BeanAsArrayBuilderDeserializer(this._delegate.withBeanProperties(beanPropertyMap), this._targetType, this._orderedProperties, this._buildMethod);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withIgnorableProperties(Set<String> set) {
        return new BeanAsArrayBuilderDeserializer(this._delegate.withIgnorableProperties(set), this._targetType, this._orderedProperties, this._buildMethod);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withObjectIdReader(ObjectIdReader objectIdReader) {
        return new BeanAsArrayBuilderDeserializer(this._delegate.withObjectIdReader(objectIdReader), this._targetType, this._orderedProperties, this._buildMethod);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        return this._delegate.deserialize(jsonParser, deserializationContext, obj);
    }
}
