package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

@JacksonStdImpl
public class StdKeyDeserializer extends KeyDeserializer implements Serializable {
    private static final long serialVersionUID = 1;
    protected final FromStringDeserializer<?> _deser;
    protected final Class<?> _keyClass;
    protected final int _kind;

    /* access modifiers changed from: package-private */
    public static final class DelegatingKD extends KeyDeserializer implements Serializable {
        private static final long serialVersionUID = 1;
        protected final JsonDeserializer<?> _delegate;
        protected final Class<?> _keyClass;

        protected DelegatingKD(Class<?> cls, JsonDeserializer<?> jsonDeserializer) {
            this._keyClass = cls;
            this._delegate = jsonDeserializer;
        }

        @Override // com.fasterxml.jackson.databind.KeyDeserializer
        public final Object deserializeKey(String str, DeserializationContext deserializationContext) {
            if (str == null) {
                return null;
            }
            TokenBuffer tokenBuffer = new TokenBuffer(deserializationContext.getParser(), deserializationContext);
            tokenBuffer.writeString(str);
            try {
                JsonParser asParser = tokenBuffer.asParser();
                asParser.nextToken();
                Object deserialize = this._delegate.deserialize(asParser, deserializationContext);
                if (deserialize != null) {
                    return deserialize;
                }
                deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation", new Object[0]);
                throw null;
            } catch (Exception e) {
                deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation: %s", e.getMessage());
                throw null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @JacksonStdImpl
    public static final class EnumKD extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;
        protected final EnumResolver _byNameResolver;
        protected EnumResolver _byToStringResolver;
        protected final Enum<?> _enumDefaultValue;
        protected final AnnotatedMethod _factory;

        protected EnumKD(EnumResolver enumResolver, AnnotatedMethod annotatedMethod) {
            super(-1, enumResolver.getEnumClass());
            this._byNameResolver = enumResolver;
            this._factory = annotatedMethod;
            this._enumDefaultValue = enumResolver.getDefaultValue();
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer
        public Object _parse(String str, DeserializationContext deserializationContext) {
            EnumResolver enumResolver;
            AnnotatedMethod annotatedMethod = this._factory;
            if (annotatedMethod != null) {
                try {
                    return annotatedMethod.call1(str);
                } catch (Exception e) {
                    Throwable rootCause = ClassUtil.getRootCause(e);
                    String message = rootCause.getMessage();
                    ClassUtil.throwIfRTE(rootCause);
                    ClassUtil.throwIfError(rootCause);
                    throw new IllegalArgumentException(message, rootCause);
                }
            } else {
                if (deserializationContext.isEnabled(DeserializationFeature.READ_ENUMS_USING_TO_STRING)) {
                    enumResolver = this._byToStringResolver;
                    if (enumResolver == null) {
                        synchronized (this) {
                            enumResolver = EnumResolver.constructUnsafeUsingToString(this._byNameResolver.getEnumClass(), deserializationContext.getAnnotationIntrospector());
                            this._byToStringResolver = enumResolver;
                        }
                    }
                } else {
                    enumResolver = this._byNameResolver;
                }
                Enum<?> findEnum = enumResolver.findEnum(str);
                if (findEnum != null) {
                    return findEnum;
                }
                if (this._enumDefaultValue != null && deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                    return this._enumDefaultValue;
                }
                if (deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                    return findEnum;
                }
                deserializationContext.handleWeirdKey(this._keyClass, str, "not one of values excepted for Enum class: %s", enumResolver.getEnumIds());
                throw null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class StringCtorKeyDeserializer extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;
        protected final Constructor<?> _ctor;

        public StringCtorKeyDeserializer(Constructor<?> constructor) {
            super(-1, constructor.getDeclaringClass());
            this._ctor = constructor;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer
        public Object _parse(String str, DeserializationContext deserializationContext) {
            return this._ctor.newInstance(str);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class StringFactoryKeyDeserializer extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;
        final Method _factoryMethod;

        public StringFactoryKeyDeserializer(Method method) {
            super(-1, method.getDeclaringClass());
            this._factoryMethod = method;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer
        public Object _parse(String str, DeserializationContext deserializationContext) {
            return this._factoryMethod.invoke(null, str);
        }
    }

    @JacksonStdImpl
    static final class StringKD extends StdKeyDeserializer {
        private static final StringKD sObject = new StringKD(Object.class);
        private static final StringKD sString = new StringKD(String.class);
        private static final long serialVersionUID = 1;

        private StringKD(Class<?> cls) {
            super(-1, cls);
        }

        public static StringKD forType(Class<?> cls) {
            if (cls == String.class) {
                return sString;
            }
            if (cls == Object.class) {
                return sObject;
            }
            return new StringKD(cls);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer, com.fasterxml.jackson.databind.KeyDeserializer
        public Object deserializeKey(String str, DeserializationContext deserializationContext) {
            return str;
        }
    }

    protected StdKeyDeserializer(int i, Class<?> cls) {
        this._kind = i;
        this._keyClass = cls;
        this._deser = null;
    }

    /* access modifiers changed from: protected */
    public Object _parse(String str, DeserializationContext deserializationContext) {
        switch (this._kind) {
            case 1:
                if ("true".equals(str)) {
                    return Boolean.TRUE;
                }
                if ("false".equals(str)) {
                    return Boolean.FALSE;
                }
                deserializationContext.handleWeirdKey(this._keyClass, str, "value not 'true' or 'false'", new Object[0]);
                throw null;
            case 2:
                int parseInt = Integer.parseInt(str);
                if (parseInt >= -128 && parseInt <= 255) {
                    return Byte.valueOf((byte) parseInt);
                }
                deserializationContext.handleWeirdKey(this._keyClass, str, "overflow, value cannot be represented as 8-bit value", new Object[0]);
                throw null;
            case 3:
                int parseInt2 = Integer.parseInt(str);
                if (parseInt2 >= -32768 && parseInt2 <= 32767) {
                    return Short.valueOf((short) parseInt2);
                }
                deserializationContext.handleWeirdKey(this._keyClass, str, "overflow, value cannot be represented as 16-bit value", new Object[0]);
                throw null;
            case 4:
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                deserializationContext.handleWeirdKey(this._keyClass, str, "can only convert 1-character Strings", new Object[0]);
                throw null;
            case 5:
                return Integer.valueOf(Integer.parseInt(str));
            case 6:
                return Long.valueOf(Long.parseLong(str));
            case 7:
                return Float.valueOf((float) NumberInput.parseDouble(str));
            case 8:
                return Double.valueOf(NumberInput.parseDouble(str));
            case 9:
                try {
                    return this._deser._deserialize(str, deserializationContext);
                } catch (IllegalArgumentException e) {
                    _weirdKey(deserializationContext, str, e);
                    throw null;
                }
            case 10:
                return deserializationContext.parseDate(str);
            case 11:
                Date parseDate = deserializationContext.parseDate(str);
                Calendar instance = Calendar.getInstance(deserializationContext.getTimeZone());
                instance.setTime(parseDate);
                return instance;
            case 12:
                try {
                    return UUID.fromString(str);
                } catch (Exception e2) {
                    _weirdKey(deserializationContext, str, e2);
                    throw null;
                }
            case 13:
                try {
                    return URI.create(str);
                } catch (Exception e3) {
                    _weirdKey(deserializationContext, str, e3);
                    throw null;
                }
            case 14:
                try {
                    return new URL(str);
                } catch (MalformedURLException e4) {
                    _weirdKey(deserializationContext, str, e4);
                    throw null;
                }
            case 15:
                try {
                    return deserializationContext.getTypeFactory().findClass(str);
                } catch (Exception unused) {
                    deserializationContext.handleWeirdKey(this._keyClass, str, "unable to parse key as Class", new Object[0]);
                    throw null;
                }
            case 16:
                try {
                    return this._deser._deserialize(str, deserializationContext);
                } catch (IllegalArgumentException e5) {
                    _weirdKey(deserializationContext, str, e5);
                    throw null;
                }
            case 17:
                try {
                    Base64Variant base64Variant = deserializationContext.mo12getConfig().getBase64Variant();
                    base64Variant.getClass();
                    ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder(null, 500);
                    base64Variant.decode(str, byteArrayBuilder);
                    return byteArrayBuilder.toByteArray();
                } catch (IllegalArgumentException e6) {
                    _weirdKey(deserializationContext, str, e6);
                    throw null;
                }
            default:
                StringBuilder V0 = je.V0("Internal error: unknown key type ");
                V0.append(this._keyClass);
                throw new IllegalStateException(V0.toString());
        }
    }

    /* access modifiers changed from: protected */
    public Object _weirdKey(DeserializationContext deserializationContext, String str, Exception exc) {
        deserializationContext.handleWeirdKey(this._keyClass, str, "problem: %s", ClassUtil.exceptionMessage(exc));
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.KeyDeserializer
    public Object deserializeKey(String str, DeserializationContext deserializationContext) {
        if (str == null) {
            return null;
        }
        try {
            Object _parse = _parse(str, deserializationContext);
            if (_parse != null) {
                return _parse;
            }
            if (this._keyClass.isEnum() && deserializationContext.mo12getConfig().isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation", new Object[0]);
            throw null;
        } catch (Exception e) {
            deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation, problem: (%s) %s", e.getClass().getName(), ClassUtil.exceptionMessage(e));
            throw null;
        }
    }

    protected StdKeyDeserializer(int i, Class<?> cls, FromStringDeserializer<?> fromStringDeserializer) {
        this._kind = i;
        this._keyClass = cls;
        this._deser = fromStringDeserializer;
    }
}
