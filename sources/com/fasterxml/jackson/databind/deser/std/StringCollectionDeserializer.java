package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.util.Collection;

@JacksonStdImpl
public final class StringCollectionDeserializer extends ContainerDeserializerBase<Collection<String>> implements ContextualDeserializer {
    private static final long serialVersionUID = 1;
    protected final JsonDeserializer<Object> _delegateDeserializer;
    protected final JsonDeserializer<String> _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.fasterxml.jackson.databind.JsonDeserializer<?> */
    /* JADX WARN: Multi-variable type inference failed */
    public StringCollectionDeserializer(JavaType javaType, JsonDeserializer<?> jsonDeserializer, ValueInstantiator valueInstantiator) {
        super(javaType, jsonDeserializer, (Boolean) null);
        this._valueDeserializer = jsonDeserializer;
        this._valueInstantiator = valueInstantiator;
        this._delegateDeserializer = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JsonDeserializer<?> createContextual(com.fasterxml.jackson.databind.DeserializationContext r10, com.fasterxml.jackson.databind.BeanProperty r11) {
        /*
            r9 = this;
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r9._valueInstantiator
            r1 = 0
            if (r0 == 0) goto L_0x0032
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r0 = r0.getArrayDelegateCreator()
            if (r0 == 0) goto L_0x001b
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r9._valueInstantiator
            com.fasterxml.jackson.databind.DeserializationConfig r2 = r10.mo12getConfig()
            com.fasterxml.jackson.databind.JavaType r0 = r0.getArrayDelegateType(r2)
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r9.findDeserializer(r10, r0, r11)
        L_0x0019:
            r5 = r0
            goto L_0x0033
        L_0x001b:
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r9._valueInstantiator
            com.fasterxml.jackson.databind.introspect.AnnotatedWithParams r0 = r0.getDelegateCreator()
            if (r0 == 0) goto L_0x0032
            com.fasterxml.jackson.databind.deser.ValueInstantiator r0 = r9._valueInstantiator
            com.fasterxml.jackson.databind.DeserializationConfig r2 = r10.mo12getConfig()
            com.fasterxml.jackson.databind.JavaType r0 = r0.getDelegateType(r2)
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r9.findDeserializer(r10, r0, r11)
            goto L_0x0019
        L_0x0032:
            r5 = r1
        L_0x0033:
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> r0 = r9._valueDeserializer
            com.fasterxml.jackson.databind.JavaType r2 = r9._containerType
            com.fasterxml.jackson.databind.JavaType r2 = r2.getContentType()
            if (r0 != 0) goto L_0x0048
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r9.findConvertingContentDeserializer(r10, r11, r0)
            if (r0 != 0) goto L_0x004c
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r10.findContextualValueDeserializer(r2, r11)
            goto L_0x004c
        L_0x0048:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r10.handleSecondaryContextualization(r0, r11, r2)
        L_0x004c:
            java.lang.Class<java.util.Collection> r2 = java.util.Collection.class
            com.fasterxml.jackson.annotation.JsonFormat$Feature r3 = com.fasterxml.jackson.annotation.JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY
            java.lang.Boolean r8 = r9.findFormatFeature(r10, r11, r2, r3)
            com.fasterxml.jackson.databind.deser.NullValueProvider r7 = r9.findContentNullProvider(r10, r11, r0)
            boolean r10 = r9.isDefaultDeserializer(r0)
            if (r10 == 0) goto L_0x0060
            r6 = r1
            goto L_0x0061
        L_0x0060:
            r6 = r0
        L_0x0061:
            java.lang.Boolean r10 = r9._unwrapSingle
            if (r10 != r8) goto L_0x0073
            com.fasterxml.jackson.databind.deser.NullValueProvider r10 = r9._nullProvider
            if (r10 != r7) goto L_0x0073
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.String> r10 = r9._valueDeserializer
            if (r10 != r6) goto L_0x0073
            com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> r10 = r9._delegateDeserializer
            if (r10 != r5) goto L_0x0073
            r10 = r9
            goto L_0x007d
        L_0x0073:
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer r10 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer
            com.fasterxml.jackson.databind.JavaType r3 = r9._containerType
            com.fasterxml.jackson.databind.deser.ValueInstantiator r4 = r9._valueInstantiator
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
        L_0x007d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer.createContextual(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.BeanProperty):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        Collection<String> collection = (Collection) obj;
        deserialize(jsonParser, deserializationContext, collection);
        return collection;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public JsonDeserializer<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return this._valueDeserializer == null && this._delegateDeserializer == null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null) {
            return (Collection) this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        }
        Collection<String> collection = (Collection) this._valueInstantiator.createUsingDefault(deserializationContext);
        deserialize(jsonParser, deserializationContext, collection);
        return collection;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.fasterxml.jackson.databind.JsonDeserializer<?> */
    /* JADX WARN: Multi-variable type inference failed */
    protected StringCollectionDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, JsonDeserializer<?> jsonDeserializer, JsonDeserializer<?> jsonDeserializer2, NullValueProvider nullValueProvider, Boolean bool) {
        super(javaType, nullValueProvider, bool);
        this._valueDeserializer = jsonDeserializer2;
        this._valueInstantiator = valueInstantiator;
        this._delegateDeserializer = jsonDeserializer;
    }

    public Collection<String> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<String> collection) {
        String str;
        Object obj;
        String str2;
        if (!jsonParser.isExpectedStartArrayToken()) {
            Boolean bool = this._unwrapSingle;
            if (bool == Boolean.TRUE || (bool == null && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
                JsonDeserializer<String> jsonDeserializer = this._valueDeserializer;
                if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                    if (!this._skipNullValues) {
                        str2 = (String) this._nullProvider.getNullValue(deserializationContext);
                    }
                    return collection;
                }
                str2 = jsonDeserializer == null ? _parseString(jsonParser, deserializationContext) : jsonDeserializer.deserialize(jsonParser, deserializationContext);
                collection.add(str2);
                return collection;
            }
            deserializationContext.handleUnexpectedToken(this._containerType.getRawClass(), jsonParser);
            throw null;
        }
        JsonDeserializer<String> jsonDeserializer2 = this._valueDeserializer;
        if (jsonDeserializer2 != null) {
            while (true) {
                if (jsonParser.nextTextValue() == null) {
                    JsonToken currentToken = jsonParser.getCurrentToken();
                    if (currentToken == JsonToken.END_ARRAY) {
                        return collection;
                    }
                    if (currentToken != JsonToken.VALUE_NULL) {
                        obj = jsonDeserializer2.deserialize(jsonParser, deserializationContext);
                    } else if (!this._skipNullValues) {
                        obj = this._nullProvider.getNullValue(deserializationContext);
                    }
                } else {
                    obj = jsonDeserializer2.deserialize(jsonParser, deserializationContext);
                }
                collection.add((String) obj);
            }
        } else {
            while (true) {
                try {
                    String nextTextValue = jsonParser.nextTextValue();
                    if (nextTextValue != null) {
                        collection.add(nextTextValue);
                    } else {
                        JsonToken currentToken2 = jsonParser.getCurrentToken();
                        if (currentToken2 == JsonToken.END_ARRAY) {
                            return collection;
                        }
                        if (currentToken2 != JsonToken.VALUE_NULL) {
                            str = _parseString(jsonParser, deserializationContext);
                        } else if (!this._skipNullValues) {
                            str = (String) this._nullProvider.getNullValue(deserializationContext);
                        }
                        collection.add(str);
                    }
                } catch (Exception e) {
                    throw JsonMappingException.wrapWithPath(e, collection, collection.size());
                }
            }
        }
    }
}
