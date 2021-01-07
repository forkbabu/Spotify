package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

public class StdKeyDeserializers implements KeyDeserializers, Serializable {
    private static final long serialVersionUID = 1;

    /* JADX WARN: Incorrect args count in method signature: (Lcom/fasterxml/jackson/databind/DeserializationConfig;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/JsonDeserializer<*>;)Lcom/fasterxml/jackson/databind/KeyDeserializer; */
    public static KeyDeserializer constructDelegatingKeyDeserializer(JavaType javaType, JsonDeserializer jsonDeserializer) {
        return new StdKeyDeserializer.DelegatingKD(javaType.getRawClass(), jsonDeserializer);
    }

    public static KeyDeserializer constructEnumKeyDeserializer(EnumResolver enumResolver) {
        return new StdKeyDeserializer.EnumKD(enumResolver, null);
    }

    public static KeyDeserializer findStringBasedKeyDeserializer(DeserializationConfig deserializationConfig, JavaType javaType) {
        BeanDescription forDeserialization = deserializationConfig.getClassIntrospector().forDeserialization(deserializationConfig, javaType, deserializationConfig);
        Constructor<?> findSingleArgConstructor = forDeserialization.findSingleArgConstructor(String.class);
        if (findSingleArgConstructor != null) {
            if (deserializationConfig.canOverrideAccessModifiers()) {
                ClassUtil.checkAndFixAccess(findSingleArgConstructor, deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            return new StdKeyDeserializer.StringCtorKeyDeserializer(findSingleArgConstructor);
        }
        Method findFactoryMethod = forDeserialization.findFactoryMethod(String.class);
        if (findFactoryMethod == null) {
            return null;
        }
        if (deserializationConfig.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(findFactoryMethod, deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new StdKeyDeserializer.StringFactoryKeyDeserializer(findFactoryMethod);
    }

    @Override // com.fasterxml.jackson.databind.deser.KeyDeserializers
    public KeyDeserializer findKeyDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        int i;
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass.isPrimitive()) {
            rawClass = ClassUtil.wrapperType(rawClass);
        }
        if (rawClass == String.class || rawClass == Object.class || rawClass == CharSequence.class) {
            return StdKeyDeserializer.StringKD.forType(rawClass);
        }
        if (rawClass == UUID.class) {
            i = 12;
        } else if (rawClass == Integer.class) {
            i = 5;
        } else if (rawClass == Long.class) {
            i = 6;
        } else if (rawClass == Date.class) {
            i = 10;
        } else if (rawClass == Calendar.class) {
            i = 11;
        } else if (rawClass == Boolean.class) {
            i = 1;
        } else if (rawClass == Byte.class) {
            i = 2;
        } else if (rawClass == Character.class) {
            i = 4;
        } else if (rawClass == Short.class) {
            i = 3;
        } else if (rawClass == Float.class) {
            i = 7;
        } else if (rawClass == Double.class) {
            i = 8;
        } else if (rawClass == URI.class) {
            i = 13;
        } else if (rawClass == URL.class) {
            i = 14;
        } else if (rawClass == Class.class) {
            i = 15;
        } else if (rawClass == Locale.class) {
            return new StdKeyDeserializer(9, rawClass, FromStringDeserializer.findDeserializer(Locale.class));
        } else {
            if (rawClass == Currency.class) {
                return new StdKeyDeserializer(16, rawClass, FromStringDeserializer.findDeserializer(Currency.class));
            }
            if (rawClass != byte[].class) {
                return null;
            }
            i = 17;
        }
        return new StdKeyDeserializer(i, rawClass);
    }

    public static KeyDeserializer constructEnumKeyDeserializer(EnumResolver enumResolver, AnnotatedMethod annotatedMethod) {
        return new StdKeyDeserializer.EnumKD(enumResolver, annotatedMethod);
    }
}
