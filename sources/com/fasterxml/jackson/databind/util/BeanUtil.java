package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class BeanUtil {
    public static Object getDefaultValue(JavaType javaType) {
        Class<?> rawClass = javaType.getRawClass();
        Class<?> primitiveType = ClassUtil.primitiveType(rawClass);
        if (primitiveType != null) {
            if (primitiveType == Integer.TYPE) {
                return 0;
            }
            if (primitiveType == Long.TYPE) {
                return 0L;
            }
            if (primitiveType == Boolean.TYPE) {
                return Boolean.FALSE;
            }
            if (primitiveType == Double.TYPE) {
                return Double.valueOf(0.0d);
            }
            if (primitiveType == Float.TYPE) {
                return Float.valueOf(0.0f);
            }
            if (primitiveType == Byte.TYPE) {
                return (byte) 0;
            }
            if (primitiveType == Short.TYPE) {
                return (short) 0;
            }
            if (primitiveType == Character.TYPE) {
                return (char) 0;
            }
            throw new IllegalArgumentException(je.l0(primitiveType, je.V0("Class "), " is not a primitive type"));
        } else if (javaType.isContainerType() || javaType.isReferenceType()) {
            return JsonInclude.Include.NON_EMPTY;
        } else {
            if (rawClass == String.class) {
                return "";
            }
            if (javaType.isTypeOrSubTypeOf(Date.class)) {
                return new Date(0);
            }
            if (!javaType.isTypeOrSubTypeOf(Calendar.class)) {
                return null;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(0);
            return gregorianCalendar;
        }
    }

    protected static String legacyManglePropertyName(String str, int i) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char charAt = str.charAt(i);
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i);
        }
        StringBuilder sb = new StringBuilder(length - i);
        sb.append(lowerCase);
        while (true) {
            i++;
            if (i >= length) {
                break;
            }
            char charAt2 = str.charAt(i);
            char lowerCase2 = Character.toLowerCase(charAt2);
            if (charAt2 == lowerCase2) {
                sb.append((CharSequence) str, i, length);
                break;
            }
            sb.append(lowerCase2);
        }
        return sb.toString();
    }

    public static String okNameForIsGetter(AnnotatedMethod annotatedMethod, String str, boolean z) {
        if (!str.startsWith("is")) {
            return null;
        }
        Class<?> rawType = annotatedMethod.getRawType();
        if (rawType != Boolean.class && rawType != Boolean.TYPE) {
            return null;
        }
        if (z) {
            return stdManglePropertyName(str, 2);
        }
        return legacyManglePropertyName(str, 2);
    }

    public static String okNameForMutator(AnnotatedMethod annotatedMethod, String str, boolean z) {
        String name = annotatedMethod.getName();
        if (!name.startsWith(str)) {
            return null;
        }
        if (z) {
            return stdManglePropertyName(name, str.length());
        }
        return legacyManglePropertyName(name, str.length());
    }

    public static String okNameForRegularGetter(AnnotatedMethod annotatedMethod, String str, boolean z) {
        String packageName;
        if (!str.startsWith("get")) {
            return null;
        }
        boolean z2 = true;
        if ("getCallbacks".equals(str)) {
            Class<?> rawType = annotatedMethod.getRawType();
            if (!rawType.isArray() || (packageName = ClassUtil.getPackageName(rawType.getComponentType())) == null || !packageName.contains(".cglib") || (!packageName.startsWith("net.sf.cglib") && !packageName.startsWith("org.hibernate.repackage.cglib") && !packageName.startsWith("org.springframework.cglib"))) {
                z2 = false;
            }
            if (z2) {
                return null;
            }
        } else if ("getMetaClass".equals(str)) {
            String packageName2 = ClassUtil.getPackageName(annotatedMethod.getRawType());
            if (packageName2 == null || !packageName2.startsWith("groovy.lang")) {
                z2 = false;
            }
            if (z2) {
                return null;
            }
        }
        if (z) {
            return stdManglePropertyName(str, 3);
        }
        return legacyManglePropertyName(str, 3);
    }

    protected static String stdManglePropertyName(String str, int i) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char charAt = str.charAt(i);
        char lowerCase = Character.toLowerCase(charAt);
        if (charAt == lowerCase) {
            return str.substring(i);
        }
        int i2 = i + 1;
        if (i2 < length && Character.isUpperCase(str.charAt(i2))) {
            return str.substring(i);
        }
        StringBuilder sb = new StringBuilder(length - i);
        sb.append(lowerCase);
        sb.append((CharSequence) str, i2, length);
        return sb.toString();
    }
}
