package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Closeable;
import java.io.Serializable;
import java.util.Map;

public class SettableAnyProperty implements Serializable {
    private static final long serialVersionUID = 1;
    protected final KeyDeserializer _keyDeserializer;
    protected final BeanProperty _property;
    protected final AnnotatedMember _setter;
    final boolean _setterIsField;
    protected final JavaType _type;
    protected JsonDeserializer<Object> _valueDeserializer;
    protected final TypeDeserializer _valueTypeDeserializer;

    /* access modifiers changed from: private */
    public static class AnySetterReferring extends ReadableObjectId.Referring {
        private final SettableAnyProperty _parent;
        private final Object _pojo;
        private final String _propName;

        public AnySetterReferring(SettableAnyProperty settableAnyProperty, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj, String str) {
            super(unresolvedForwardReference, cls);
            this._parent = settableAnyProperty;
            this._pojo = obj;
            this._propName = str;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
        public void handleResolvedForwardReference(Object obj, Object obj2) {
            if (hasId(obj)) {
                this._parent.set(this._pojo, this._propName, obj2);
                return;
            }
            StringBuilder V0 = je.V0("Trying to resolve a forward reference with id [");
            V0.append(obj.toString());
            V0.append("] that wasn't previously registered.");
            throw new IllegalArgumentException(V0.toString());
        }
    }

    public SettableAnyProperty(BeanProperty beanProperty, AnnotatedMember annotatedMember, JavaType javaType, KeyDeserializer keyDeserializer, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer) {
        this._property = beanProperty;
        this._setter = annotatedMember;
        this._type = javaType;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
        this._keyDeserializer = keyDeserializer;
        this._setterIsField = annotatedMember instanceof AnnotatedField;
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
            return this._valueDeserializer.getNullValue(deserializationContext);
        }
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        if (typeDeserializer != null) {
            return this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
        }
        return this._valueDeserializer.deserialize(jsonParser, deserializationContext);
    }

    public final void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) {
        Object obj2;
        try {
            KeyDeserializer keyDeserializer = this._keyDeserializer;
            if (keyDeserializer == null) {
                obj2 = str;
            } else {
                obj2 = keyDeserializer.deserializeKey(str, deserializationContext);
            }
            set(obj, obj2, deserialize(jsonParser, deserializationContext));
        } catch (UnresolvedForwardReference e) {
            if (this._valueDeserializer.getObjectIdReader() != null) {
                e.getRoid().appendReferring(new AnySetterReferring(this, e, this._type.getRawClass(), obj, str));
                return;
            }
            throw new JsonMappingException(jsonParser, "Unresolved forward reference but no identity info.", e);
        }
    }

    /* access modifiers changed from: package-private */
    public Object readResolve() {
        AnnotatedMember annotatedMember = this._setter;
        if (annotatedMember != null && annotatedMember.mo14getAnnotated() != null) {
            return this;
        }
        throw new IllegalArgumentException("Missing method (broken JDK (de)serialization?)");
    }

    public void set(Object obj, Object obj2, Object obj3) {
        try {
            if (this._setterIsField) {
                Map map = (Map) ((AnnotatedField) this._setter).getValue(obj);
                if (map != null) {
                    map.put(obj2, obj3);
                    return;
                }
                return;
            }
            ((AnnotatedMethod) this._setter).callOnWith(obj, obj2, obj3);
        } catch (Exception e) {
            if (e instanceof IllegalArgumentException) {
                String classNameOf = ClassUtil.classNameOf(obj3);
                StringBuilder sb = new StringBuilder("Problem deserializing \"any\" property '");
                sb.append(obj2);
                StringBuilder V0 = je.V0("' of class ");
                V0.append(this._setter.getDeclaringClass().getName());
                V0.append(" (expected type: ");
                sb.append(V0.toString());
                sb.append(this._type);
                sb.append("; actual type: ");
                sb.append(classNameOf);
                sb.append(")");
                String exceptionMessage = ClassUtil.exceptionMessage(e);
                if (exceptionMessage != null) {
                    sb.append(", problem: ");
                    sb.append(exceptionMessage);
                } else {
                    sb.append(" (no error message provided)");
                }
                throw new JsonMappingException((Closeable) null, sb.toString(), e);
            }
            ClassUtil.throwIfIOE(e);
            ClassUtil.throwIfRTE(e);
            Throwable rootCause = ClassUtil.getRootCause(e);
            throw new JsonMappingException((Closeable) null, ClassUtil.exceptionMessage(rootCause), rootCause);
        }
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("[any property on class ");
        V0.append(this._setter.getDeclaringClass().getName());
        V0.append("]");
        return V0.toString();
    }
}
