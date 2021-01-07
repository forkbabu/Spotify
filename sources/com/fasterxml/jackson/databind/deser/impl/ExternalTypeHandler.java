package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ExternalTypeHandler {
    private final JavaType _beanType;
    private final Map<String, Object> _nameToPropertyIndex;
    private final ExtTypedProperty[] _properties;
    private final TokenBuffer[] _tokens;
    private final String[] _typeIds;

    public static class Builder {
        private final JavaType _beanType;
        private final Map<String, Object> _nameToPropertyIndex = new HashMap();
        private final List<ExtTypedProperty> _properties = new ArrayList();

        protected Builder(JavaType javaType) {
            this._beanType = javaType;
        }

        private void _addPropertyIndex(String str, Integer num) {
            Object obj = this._nameToPropertyIndex.get(str);
            if (obj == null) {
                this._nameToPropertyIndex.put(str, num);
            } else if (obj instanceof List) {
                ((List) obj).add(num);
            } else {
                LinkedList linkedList = new LinkedList();
                linkedList.add(obj);
                linkedList.add(num);
                this._nameToPropertyIndex.put(str, linkedList);
            }
        }

        public void addExternal(SettableBeanProperty settableBeanProperty, TypeDeserializer typeDeserializer) {
            Integer valueOf = Integer.valueOf(this._properties.size());
            this._properties.add(new ExtTypedProperty(settableBeanProperty, typeDeserializer));
            _addPropertyIndex(settableBeanProperty.getName(), valueOf);
            _addPropertyIndex(typeDeserializer.getPropertyName(), valueOf);
        }

        public ExternalTypeHandler build(BeanPropertyMap beanPropertyMap) {
            int size = this._properties.size();
            ExtTypedProperty[] extTypedPropertyArr = new ExtTypedProperty[size];
            for (int i = 0; i < size; i++) {
                ExtTypedProperty extTypedProperty = this._properties.get(i);
                SettableBeanProperty find = beanPropertyMap.find(extTypedProperty.getTypePropertyName());
                if (find != null) {
                    extTypedProperty.linkTypeProperty(find);
                }
                extTypedPropertyArr[i] = extTypedProperty;
            }
            return new ExternalTypeHandler(this._beanType, extTypedPropertyArr, this._nameToPropertyIndex, null, null);
        }
    }

    /* access modifiers changed from: private */
    public static final class ExtTypedProperty {
        private final SettableBeanProperty _property;
        private final TypeDeserializer _typeDeserializer;
        private SettableBeanProperty _typeProperty;
        private final String _typePropertyName;

        public ExtTypedProperty(SettableBeanProperty settableBeanProperty, TypeDeserializer typeDeserializer) {
            this._property = settableBeanProperty;
            this._typeDeserializer = typeDeserializer;
            this._typePropertyName = typeDeserializer.getPropertyName();
        }

        public String getDefaultTypeId() {
            Class<?> defaultImpl = this._typeDeserializer.getDefaultImpl();
            if (defaultImpl == null) {
                return null;
            }
            return this._typeDeserializer.getTypeIdResolver().idFromValueAndType(null, defaultImpl);
        }

        public SettableBeanProperty getProperty() {
            return this._property;
        }

        public SettableBeanProperty getTypeProperty() {
            return this._typeProperty;
        }

        public String getTypePropertyName() {
            return this._typePropertyName;
        }

        public boolean hasDefaultType() {
            return this._typeDeserializer.getDefaultImpl() != null;
        }

        public boolean hasTypePropertyName(String str) {
            return str.equals(this._typePropertyName);
        }

        public void linkTypeProperty(SettableBeanProperty settableBeanProperty) {
            this._typeProperty = settableBeanProperty;
        }
    }

    protected ExternalTypeHandler(JavaType javaType, ExtTypedProperty[] extTypedPropertyArr, Map<String, Object> map, String[] strArr, TokenBuffer[] tokenBufferArr) {
        this._beanType = javaType;
        this._properties = extTypedPropertyArr;
        this._nameToPropertyIndex = map;
        this._typeIds = null;
        this._tokens = null;
    }

    private final boolean _handleTypePropertyValue(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj, String str2, int i) {
        boolean z = false;
        if (!this._properties[i].hasTypePropertyName(str)) {
            return false;
        }
        if (!(obj == null || this._tokens[i] == null)) {
            z = true;
        }
        if (z) {
            _deserializeAndSet(jsonParser, deserializationContext, obj, i, str2);
            this._tokens[i] = null;
        } else {
            this._typeIds[i] = str2;
        }
        return true;
    }

    public static Builder builder(JavaType javaType) {
        return new Builder(javaType);
    }

    /* access modifiers changed from: protected */
    public final void _deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, int i, String str) {
        JsonParser asParser = this._tokens[i].asParser(jsonParser);
        if (asParser.nextToken() == JsonToken.VALUE_NULL) {
            this._properties[i].getProperty().set(obj, null);
            return;
        }
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        tokenBuffer.writeStartArray();
        tokenBuffer.writeString(str);
        tokenBuffer.copyCurrentStructure(asParser);
        tokenBuffer.writeEndArray();
        JsonParser asParser2 = tokenBuffer.asParser(jsonParser);
        asParser2.nextToken();
        this._properties[i].getProperty().deserializeAndSet(asParser2, deserializationContext, obj);
    }

    public Object complete(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        int length = this._properties.length;
        for (int i = 0; i < length; i++) {
            String str = this._typeIds[i];
            if (str == null) {
                TokenBuffer tokenBuffer = this._tokens[i];
                if (tokenBuffer == null) {
                    continue;
                } else if (tokenBuffer.firstToken().isScalarValue()) {
                    JsonParser asParser = tokenBuffer.asParser(jsonParser);
                    asParser.nextToken();
                    SettableBeanProperty property = this._properties[i].getProperty();
                    Object deserializeIfNatural = TypeDeserializer.deserializeIfNatural(asParser, deserializationContext, property.getType());
                    if (deserializeIfNatural != null) {
                        property.set(obj, deserializeIfNatural);
                    } else if (this._properties[i].hasDefaultType()) {
                        str = this._properties[i].getDefaultTypeId();
                    } else {
                        deserializationContext.reportInputMismatch(obj.getClass(), "Missing external type id property '%s'", this._properties[i].getTypePropertyName());
                        throw null;
                    }
                }
            } else if (this._tokens[i] == null) {
                SettableBeanProperty property2 = this._properties[i].getProperty();
                if (!(property2.isRequired() || deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY))) {
                    return obj;
                }
                deserializationContext.reportInputMismatch(obj.getClass(), "Missing property '%s' for external type id '%s'", property2.getName(), this._properties[i].getTypePropertyName());
                throw null;
            }
            _deserializeAndSet(jsonParser, deserializationContext, obj, i, str);
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0094, code lost:
        if (r10._tokens[r0] != null) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a9, code lost:
        if (r10._typeIds[r0] != null) goto L_0x00ab;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handlePropertyValue(com.fasterxml.jackson.core.JsonParser r11, com.fasterxml.jackson.databind.DeserializationContext r12, java.lang.String r13, java.lang.Object r14) {
        /*
            r10 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r10._nameToPropertyIndex
            java.lang.Object r0 = r0.get(r13)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            boolean r2 = r0 instanceof java.util.List
            r3 = 1
            if (r2 == 0) goto L_0x0073
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r14 = r0.iterator()
            java.lang.Object r0 = r14.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty[] r1 = r10._properties
            int r2 = r0.intValue()
            r1 = r1[r2]
            boolean r13 = r1.hasTypePropertyName(r13)
            if (r13 == 0) goto L_0x004d
            java.lang.String r12 = r11.getText()
            r11.skipChildren()
            java.lang.String[] r11 = r10._typeIds
            int r13 = r0.intValue()
            r11[r13] = r12
        L_0x0038:
            boolean r11 = r14.hasNext()
            if (r11 == 0) goto L_0x0072
            java.lang.String[] r11 = r10._typeIds
            java.lang.Object r13 = r14.next()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r11[r13] = r12
            goto L_0x0038
        L_0x004d:
            com.fasterxml.jackson.databind.util.TokenBuffer r13 = new com.fasterxml.jackson.databind.util.TokenBuffer
            r13.<init>(r11, r12)
            r13.copyCurrentStructure(r11)
            com.fasterxml.jackson.databind.util.TokenBuffer[] r11 = r10._tokens
            int r12 = r0.intValue()
            r11[r12] = r13
        L_0x005d:
            boolean r11 = r14.hasNext()
            if (r11 == 0) goto L_0x0072
            com.fasterxml.jackson.databind.util.TokenBuffer[] r11 = r10._tokens
            java.lang.Object r12 = r14.next()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r11[r12] = r13
            goto L_0x005d
        L_0x0072:
            return r3
        L_0x0073:
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty[] r2 = r10._properties
            r2 = r2[r0]
            boolean r13 = r2.hasTypePropertyName(r13)
            if (r13 == 0) goto L_0x0097
            java.lang.String[] r13 = r10._typeIds
            java.lang.String r2 = r11.getText()
            r13[r0] = r2
            r11.skipChildren()
            if (r14 == 0) goto L_0x00ac
            com.fasterxml.jackson.databind.util.TokenBuffer[] r13 = r10._tokens
            r13 = r13[r0]
            if (r13 == 0) goto L_0x00ac
            goto L_0x00ab
        L_0x0097:
            com.fasterxml.jackson.databind.util.TokenBuffer r13 = new com.fasterxml.jackson.databind.util.TokenBuffer
            r13.<init>(r11, r12)
            r13.copyCurrentStructure(r11)
            com.fasterxml.jackson.databind.util.TokenBuffer[] r2 = r10._tokens
            r2[r0] = r13
            if (r14 == 0) goto L_0x00ac
            java.lang.String[] r13 = r10._typeIds
            r13 = r13[r0]
            if (r13 == 0) goto L_0x00ac
        L_0x00ab:
            r1 = 1
        L_0x00ac:
            if (r1 == 0) goto L_0x00c1
            java.lang.String[] r13 = r10._typeIds
            r9 = r13[r0]
            r1 = 0
            r13[r0] = r1
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r14
            r8 = r0
            r4._deserializeAndSet(r5, r6, r7, r8, r9)
            com.fasterxml.jackson.databind.util.TokenBuffer[] r11 = r10._tokens
            r11[r0] = r1
        L_0x00c1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.String, java.lang.Object):boolean");
    }

    public boolean handleTypePropertyValue(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj) {
        Object obj2 = this._nameToPropertyIndex.get(str);
        boolean z = false;
        if (obj2 == null) {
            return false;
        }
        String text = jsonParser.getText();
        if (!(obj2 instanceof List)) {
            return _handleTypePropertyValue(jsonParser, deserializationContext, str, obj, text, ((Integer) obj2).intValue());
        }
        for (Integer num : (List) obj2) {
            if (_handleTypePropertyValue(jsonParser, deserializationContext, str, obj, text, num.intValue())) {
                z = true;
            }
        }
        return z;
    }

    public ExternalTypeHandler start() {
        return new ExternalTypeHandler(this);
    }

    protected ExternalTypeHandler(ExternalTypeHandler externalTypeHandler) {
        this._beanType = externalTypeHandler._beanType;
        ExtTypedProperty[] extTypedPropertyArr = externalTypeHandler._properties;
        this._properties = extTypedPropertyArr;
        this._nameToPropertyIndex = externalTypeHandler._nameToPropertyIndex;
        int length = extTypedPropertyArr.length;
        this._typeIds = new String[length];
        this._tokens = new TokenBuffer[length];
    }

    public Object complete(JsonParser jsonParser, DeserializationContext deserializationContext, PropertyValueBuffer propertyValueBuffer, PropertyBasedCreator propertyBasedCreator) {
        String str;
        int length = this._properties.length;
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            String str2 = this._typeIds[i];
            ExtTypedProperty extTypedProperty = this._properties[i];
            Object obj = null;
            if (str2 != null) {
                str = str2;
                if (this._tokens[i] == null) {
                    SettableBeanProperty property = extTypedProperty.getProperty();
                    if (!property.isRequired()) {
                        str = str2;
                        if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY)) {
                        }
                    }
                    deserializationContext.reportInputMismatch(this._beanType, "Missing property '%s' for external type id '%s'", property.getName(), this._properties[i].getTypePropertyName());
                    throw null;
                }
            } else if (this._tokens[i] == null) {
                continue;
            } else if (extTypedProperty.hasDefaultType()) {
                str = extTypedProperty.getDefaultTypeId();
            } else {
                deserializationContext.reportInputMismatch(this._beanType, "Missing external type id property '%s'", extTypedProperty.getTypePropertyName());
                throw null;
            }
            TokenBuffer[] tokenBufferArr = this._tokens;
            if (tokenBufferArr[i] != null) {
                JsonParser asParser = tokenBufferArr[i].asParser(jsonParser);
                if (asParser.nextToken() != JsonToken.VALUE_NULL) {
                    TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
                    tokenBuffer.writeStartArray();
                    tokenBuffer.writeString(str);
                    tokenBuffer.copyCurrentStructure(asParser);
                    tokenBuffer.writeEndArray();
                    JsonParser asParser2 = tokenBuffer.asParser(jsonParser);
                    asParser2.nextToken();
                    obj = this._properties[i].getProperty().deserialize(asParser2, deserializationContext);
                }
                objArr[i] = obj;
            }
            SettableBeanProperty property2 = extTypedProperty.getProperty();
            if (property2.getCreatorIndex() >= 0) {
                propertyValueBuffer.assignParameter(property2, objArr[i]);
                SettableBeanProperty typeProperty = extTypedProperty.getTypeProperty();
                if (typeProperty != null && typeProperty.getCreatorIndex() >= 0) {
                    String str3 = str;
                    if (!typeProperty.getType().hasRawClass(String.class)) {
                        TokenBuffer tokenBuffer2 = new TokenBuffer(jsonParser, deserializationContext);
                        tokenBuffer2.writeString(str);
                        str3 = typeProperty.getValueDeserializer().deserialize(tokenBuffer2.asParserOnFirstToken(), deserializationContext);
                    }
                    propertyValueBuffer.assignParameter(typeProperty, str3);
                }
            }
        }
        Object build = propertyBasedCreator.build(deserializationContext, propertyValueBuffer);
        for (int i2 = 0; i2 < length; i2++) {
            SettableBeanProperty property3 = this._properties[i2].getProperty();
            if (property3.getCreatorIndex() < 0) {
                property3.set(build, objArr[i2]);
            }
        }
        return build;
    }
}
