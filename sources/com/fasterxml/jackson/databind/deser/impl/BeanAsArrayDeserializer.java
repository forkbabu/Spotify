package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.PropertyValue;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.Set;

public class BeanAsArrayDeserializer extends BeanDeserializerBase {
    private static final long serialVersionUID = 1;
    protected final BeanDeserializerBase _delegate;
    protected final SettableBeanProperty[] _orderedProperties;

    public BeanAsArrayDeserializer(BeanDeserializerBase beanDeserializerBase, SettableBeanProperty[] settableBeanPropertyArr) {
        super(beanDeserializerBase);
        this._delegate = beanDeserializerBase;
        this._orderedProperties = settableBeanPropertyArr;
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
                    settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, obj);
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
                            jsonParser.setCurrentValue(obj);
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
        if (!jsonParser.isExpectedStartArrayToken()) {
            _deserializeFromNonArray(jsonParser, deserializationContext);
            throw null;
        } else if (this._vanillaProcessing) {
            Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
            jsonParser.setCurrentValue(createUsingDefault);
            SettableBeanProperty[] settableBeanPropertyArr = this._orderedProperties;
            int length = settableBeanPropertyArr.length;
            int i = 0;
            while (true) {
                JsonToken nextToken = jsonParser.nextToken();
                JsonToken jsonToken = JsonToken.END_ARRAY;
                if (nextToken == jsonToken) {
                    return createUsingDefault;
                }
                if (i != length) {
                    SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
                    if (settableBeanProperty != null) {
                        try {
                            settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, createUsingDefault);
                        } catch (Exception e) {
                            wrapAndThrow(e, createUsingDefault, settableBeanProperty.getName(), deserializationContext);
                            throw null;
                        }
                    } else {
                        jsonParser.skipChildren();
                    }
                    i++;
                } else if (this._ignoreAllUnknown || !deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    do {
                        jsonParser.skipChildren();
                    } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
                    return createUsingDefault;
                } else {
                    deserializationContext.reportWrongTokenException(this, jsonToken, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                    throw null;
                }
            }
        } else if (this._nonStandardCreation) {
            return deserializeFromObjectUsingNonDefault(jsonParser, deserializationContext);
        } else {
            Object createUsingDefault2 = this._valueInstantiator.createUsingDefault(deserializationContext);
            jsonParser.setCurrentValue(createUsingDefault2);
            if (this._injectables != null) {
                injectValues(deserializationContext, createUsingDefault2);
            }
            Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
            SettableBeanProperty[] settableBeanPropertyArr2 = this._orderedProperties;
            int length2 = settableBeanPropertyArr2.length;
            int i2 = 0;
            while (true) {
                JsonToken nextToken2 = jsonParser.nextToken();
                JsonToken jsonToken2 = JsonToken.END_ARRAY;
                if (nextToken2 == jsonToken2) {
                    break;
                } else if (i2 != length2) {
                    SettableBeanProperty settableBeanProperty2 = settableBeanPropertyArr2[i2];
                    i2++;
                    if (settableBeanProperty2 == null || (activeView != null && !settableBeanProperty2.visibleInView(activeView))) {
                        jsonParser.skipChildren();
                    } else {
                        try {
                            settableBeanProperty2.deserializeAndSet(jsonParser, deserializationContext, createUsingDefault2);
                        } catch (Exception e2) {
                            wrapAndThrow(e2, createUsingDefault2, settableBeanProperty2.getName(), deserializationContext);
                            throw null;
                        }
                    }
                } else if (this._ignoreAllUnknown) {
                    do {
                        jsonParser.skipChildren();
                    } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
                } else {
                    deserializationContext.reportWrongTokenException(this, jsonToken2, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length2));
                    throw null;
                }
            }
            return createUsingDefault2;
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        return this._delegate.unwrappingDeserializer(nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withBeanProperties(BeanPropertyMap beanPropertyMap) {
        return new BeanAsArrayDeserializer(this._delegate.withBeanProperties(beanPropertyMap), this._orderedProperties);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withIgnorableProperties(Set<String> set) {
        return new BeanAsArrayDeserializer(this._delegate.withIgnorableProperties(set), this._orderedProperties);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withObjectIdReader(ObjectIdReader objectIdReader) {
        return new BeanAsArrayDeserializer(this._delegate.withObjectIdReader(objectIdReader), this._orderedProperties);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        jsonParser.setCurrentValue(obj);
        if (jsonParser.isExpectedStartArrayToken()) {
            if (this._injectables != null) {
                injectValues(deserializationContext, obj);
            }
            SettableBeanProperty[] settableBeanPropertyArr = this._orderedProperties;
            int length = settableBeanPropertyArr.length;
            int i = 0;
            while (true) {
                JsonToken nextToken = jsonParser.nextToken();
                JsonToken jsonToken = JsonToken.END_ARRAY;
                if (nextToken == jsonToken) {
                    return obj;
                }
                if (i != length) {
                    SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
                    if (settableBeanProperty != null) {
                        try {
                            settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, obj);
                        } catch (Exception e) {
                            wrapAndThrow(e, obj, settableBeanProperty.getName(), deserializationContext);
                            throw null;
                        }
                    } else {
                        jsonParser.skipChildren();
                    }
                    i++;
                } else if (this._ignoreAllUnknown || !deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    do {
                        jsonParser.skipChildren();
                    } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
                    return obj;
                } else {
                    deserializationContext.reportWrongTokenException(this, jsonToken, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                    throw null;
                }
            }
        } else {
            _deserializeFromNonArray(jsonParser, deserializationContext);
            throw null;
        }
    }
}
