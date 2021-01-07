package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.lang.reflect.Type;

public abstract class DatabindContext {
    /* access modifiers changed from: protected */
    public String _colonConcat(String str, String str2) {
        return str2 == null ? str : je.y0(str, ": ", str2);
    }

    /* access modifiers changed from: protected */
    public final String _format(String str, Object... objArr) {
        return objArr.length > 0 ? String.format(str, objArr) : str;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0033: APUT  (r0v1 java.lang.Object[]), (0 ??[int, short, byte, char]), (r6v1 java.lang.String) */
    /* access modifiers changed from: protected */
    public String _quotedString(String str) {
        if (str == null) {
            return "[N/A]";
        }
        Object[] objArr = new Object[1];
        if (str.length() > 500) {
            str = str.substring(0, 500) + "]...[" + str.substring(str.length() - 500);
        }
        objArr[0] = str;
        return String.format("\"%s\"", objArr);
    }

    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) {
        if (javaType._class == cls) {
            return javaType;
        }
        return mo12getConfig().constructSpecializedType(javaType, cls);
    }

    public JavaType constructType(Type type) {
        if (type == null) {
            return null;
        }
        return getTypeFactory().constructType(type);
    }

    public Converter<Object, Object> converterInstance(Annotated annotated, Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Converter) {
            return (Converter) obj;
        }
        if (obj instanceof Class) {
            Class cls = (Class) obj;
            if (cls == Converter.None.class || ClassUtil.isBogusClass(cls)) {
                return null;
            }
            if (Converter.class.isAssignableFrom(cls)) {
                MapperConfig<?> config = mo12getConfig();
                config.getHandlerInstantiator();
                return (Converter) ClassUtil.createInstance(cls, config.canOverrideAccessModifiers());
            }
            throw new IllegalStateException(je.l0(cls, je.V0("AnnotationIntrospector returned Class "), "; expected Class<Converter>"));
        }
        throw new IllegalStateException(je.n0(obj, je.V0("AnnotationIntrospector returned Converter definition of type "), "; expected type Converter or Class<Converter> instead"));
    }

    /* renamed from: getConfig */
    public abstract MapperConfig<?> mo12getConfig();

    public abstract TypeFactory getTypeFactory();

    /* access modifiers changed from: protected */
    public abstract JsonMappingException invalidTypeIdException(JavaType javaType, String str, String str2);

    public ObjectIdGenerator<?> objectIdGeneratorInstance(Annotated annotated, ObjectIdInfo objectIdInfo) {
        Class<? extends ObjectIdGenerator<?>> generatorType = objectIdInfo.getGeneratorType();
        MapperConfig<?> config = mo12getConfig();
        config.getHandlerInstantiator();
        return ((ObjectIdGenerator) ClassUtil.createInstance(generatorType, config.canOverrideAccessModifiers())).forScope(objectIdInfo.getScope());
    }

    public ObjectIdResolver objectIdResolverInstance(Annotated annotated, ObjectIdInfo objectIdInfo) {
        Class<? extends ObjectIdResolver> resolverType = objectIdInfo.getResolverType();
        MapperConfig<?> config = mo12getConfig();
        config.getHandlerInstantiator();
        return (ObjectIdResolver) ClassUtil.createInstance(resolverType, config.canOverrideAccessModifiers());
    }

    public abstract <T> T reportBadDefinition(JavaType javaType, String str);

    public <T> T reportBadDefinition(Class<?> cls, String str) {
        return (T) reportBadDefinition(constructType(cls), str);
    }

    public JavaType resolveSubType(JavaType javaType, String str) {
        if (str.indexOf(60) > 0) {
            JavaType constructFromCanonical = getTypeFactory().constructFromCanonical(str);
            if (constructFromCanonical.isTypeOrSubTypeOf(javaType._class)) {
                return constructFromCanonical;
            }
        } else {
            try {
                Class<?> findClass = getTypeFactory().findClass(str);
                if (javaType.isTypeOrSuperTypeOf(findClass)) {
                    return getTypeFactory().constructSpecializedType(javaType, findClass);
                }
            } catch (ClassNotFoundException unused) {
                return null;
            } catch (Exception e) {
                throw invalidTypeIdException(javaType, str, String.format("problem: (%s) %s", e.getClass().getName(), ClassUtil.exceptionMessage(e)));
            }
        }
        throw invalidTypeIdException(javaType, str, "Not a subtype");
    }
}
