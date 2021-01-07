package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.Set;

public class ThrowableDeserializer extends BeanDeserializer {
    private static final long serialVersionUID = 1;

    public ThrowableDeserializer(BeanDeserializer beanDeserializer) {
        super(beanDeserializer);
        this._vanillaProcessing = false;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializer
    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) {
        Object obj;
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingPropertyBased(jsonParser, deserializationContext);
        }
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null) {
            return this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        }
        if (!this._beanType.isAbstract()) {
            boolean canCreateFromString = this._valueInstantiator.canCreateFromString();
            boolean canCreateUsingDefault = this._valueInstantiator.canCreateUsingDefault();
            if (canCreateFromString || canCreateUsingDefault) {
                Object obj2 = null;
                Object[] objArr = null;
                int i = 0;
                while (jsonParser.getCurrentToken() != JsonToken.END_OBJECT) {
                    String currentName = jsonParser.getCurrentName();
                    SettableBeanProperty find = this._beanProperties.find(currentName);
                    jsonParser.nextToken();
                    if (find != null) {
                        if (obj2 != null) {
                            find.deserializeAndSet(jsonParser, deserializationContext, obj2);
                        } else {
                            if (objArr == null) {
                                int size = this._beanProperties.size();
                                objArr = new Object[(size + size)];
                            }
                            int i2 = i + 1;
                            objArr[i] = find;
                            i = i2 + 1;
                            objArr[i2] = find.deserialize(jsonParser, deserializationContext);
                        }
                    } else if (!"message".equals(currentName) || !canCreateFromString) {
                        Set<String> set = this._ignorableProps;
                        if (set == null || !set.contains(currentName)) {
                            SettableAnyProperty settableAnyProperty = this._anySetter;
                            if (settableAnyProperty != null) {
                                settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, obj2, currentName);
                            } else {
                                handleUnknownProperty(jsonParser, deserializationContext, obj2, currentName);
                            }
                        } else {
                            jsonParser.skipChildren();
                        }
                    } else {
                        obj2 = this._valueInstantiator.createFromString(deserializationContext, jsonParser.getValueAsString());
                        if (objArr != null) {
                            for (int i3 = 0; i3 < i; i3 += 2) {
                                ((SettableBeanProperty) objArr[i3]).set(obj2, objArr[i3 + 1]);
                            }
                            objArr = null;
                        }
                    }
                    jsonParser.nextToken();
                }
                if (obj2 == null) {
                    if (canCreateFromString) {
                        obj = this._valueInstantiator.createFromString(deserializationContext, null);
                    } else {
                        obj = this._valueInstantiator.createUsingDefault(deserializationContext);
                    }
                    obj2 = obj;
                    if (objArr != null) {
                        for (int i4 = 0; i4 < i; i4 += 2) {
                            ((SettableBeanProperty) objArr[i4]).set(obj2, objArr[i4 + 1]);
                        }
                    }
                }
                return obj2;
            }
            deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonParser, "Throwable needs a default contructor, a single-String-arg constructor; or explicit @JsonCreator", new Object[0]);
            throw null;
        }
        deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonParser, "abstract type (need to add/enable type information?)", new Object[0]);
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        if (getClass() != ThrowableDeserializer.class) {
            return this;
        }
        return new ThrowableDeserializer(this, nameTransformer);
    }

    protected ThrowableDeserializer(BeanDeserializer beanDeserializer, NameTransformer nameTransformer) {
        super(beanDeserializer, nameTransformer);
    }
}
