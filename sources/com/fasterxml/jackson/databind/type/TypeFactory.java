package com.fasterxml.jackson.databind.type;

import com.adjust.sdk.Constants;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeParser;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.TreeSet;

public final class TypeFactory implements Serializable {
    private static final Class<?> CLS_BOOL;
    private static final Class<?> CLS_CLASS = Class.class;
    private static final Class<?> CLS_COMPARABLE = Comparable.class;
    private static final Class<?> CLS_ENUM = Enum.class;
    private static final Class<?> CLS_INT;
    private static final Class<?> CLS_LONG;
    private static final Class<?> CLS_OBJECT = Object.class;
    private static final Class<?> CLS_STRING = String.class;
    protected static final SimpleType CORE_TYPE_BOOL;
    protected static final SimpleType CORE_TYPE_CLASS = new SimpleType(Class.class);
    protected static final SimpleType CORE_TYPE_COMPARABLE = new SimpleType(Comparable.class);
    protected static final SimpleType CORE_TYPE_ENUM = new SimpleType(Enum.class);
    protected static final SimpleType CORE_TYPE_INT;
    protected static final SimpleType CORE_TYPE_LONG;
    protected static final SimpleType CORE_TYPE_OBJECT = new SimpleType(Object.class);
    protected static final SimpleType CORE_TYPE_STRING = new SimpleType(String.class);
    protected static final TypeBindings EMPTY_BINDINGS = TypeBindings.emptyBindings();
    private static final JavaType[] NO_TYPES = new JavaType[0];
    protected static final TypeFactory instance = new TypeFactory();
    private static final long serialVersionUID = 1;
    protected final ClassLoader _classLoader;
    protected final TypeModifier[] _modifiers;
    protected final TypeParser _parser;
    protected final LRUMap<Object, JavaType> _typeCache;

    static {
        Class<?> cls = Boolean.TYPE;
        CLS_BOOL = cls;
        Class<?> cls2 = Integer.TYPE;
        CLS_INT = cls2;
        Class<?> cls3 = Long.TYPE;
        CLS_LONG = cls3;
        CORE_TYPE_BOOL = new SimpleType(cls);
        CORE_TYPE_INT = new SimpleType(cls2);
        CORE_TYPE_LONG = new SimpleType(cls3);
    }

    private TypeFactory() {
        this._typeCache = new LRUMap<>(16, 200);
        this._parser = new TypeParser(this);
        this._modifiers = null;
        this._classLoader = null;
    }

    private boolean _verifyAndResolvePlaceholders(JavaType javaType, JavaType javaType2) {
        if (javaType2 instanceof PlaceholderForType) {
            ((PlaceholderForType) javaType2)._actualType = javaType;
            return true;
        } else if (javaType.getRawClass() != javaType2.getRawClass()) {
            return false;
        } else {
            List<JavaType> typeParameters = javaType.getBindings().getTypeParameters();
            List<JavaType> typeParameters2 = javaType2.getBindings().getTypeParameters();
            int size = typeParameters.size();
            for (int i = 0; i < size; i++) {
                if (!_verifyAndResolvePlaceholders(typeParameters.get(i), typeParameters2.get(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static TypeFactory defaultInstance() {
        return instance;
    }

    public static JavaType unknownType() {
        instance.getClass();
        return CORE_TYPE_OBJECT;
    }

    /* access modifiers changed from: protected */
    public JavaType _findWellKnownSimple(Class<?> cls) {
        if (cls.isPrimitive()) {
            if (cls == CLS_BOOL) {
                return CORE_TYPE_BOOL;
            }
            if (cls == CLS_INT) {
                return CORE_TYPE_INT;
            }
            if (cls == CLS_LONG) {
                return CORE_TYPE_LONG;
            }
            return null;
        } else if (cls == CLS_STRING) {
            return CORE_TYPE_STRING;
        } else {
            if (cls == CLS_OBJECT) {
                return CORE_TYPE_OBJECT;
            }
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public JavaType _fromAny(ClassStack classStack, Type type, TypeBindings typeBindings) {
        JavaType javaType;
        Type[] bounds;
        int i;
        TypeBindings typeBindings2;
        if (type instanceof Class) {
            javaType = _fromClass(classStack, (Class) type, EMPTY_BINDINGS);
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class<?> cls = (Class) parameterizedType.getRawType();
            if (cls == CLS_ENUM) {
                javaType = CORE_TYPE_ENUM;
            } else if (cls == CLS_COMPARABLE) {
                javaType = CORE_TYPE_COMPARABLE;
            } else if (cls == CLS_CLASS) {
                javaType = CORE_TYPE_CLASS;
            } else {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                if (actualTypeArguments == null) {
                    i = 0;
                } else {
                    i = actualTypeArguments.length;
                }
                if (i == 0) {
                    typeBindings2 = EMPTY_BINDINGS;
                } else {
                    JavaType[] javaTypeArr = new JavaType[i];
                    for (int i2 = 0; i2 < i; i2++) {
                        javaTypeArr[i2] = _fromAny(classStack, actualTypeArguments[i2], typeBindings);
                    }
                    typeBindings2 = TypeBindings.create(cls, javaTypeArr);
                }
                javaType = _fromClass(classStack, cls, typeBindings2);
            }
        } else if (type instanceof JavaType) {
            return (JavaType) type;
        } else {
            if (type instanceof GenericArrayType) {
                javaType = ArrayType.construct(_fromAny(classStack, ((GenericArrayType) type).getGenericComponentType(), typeBindings), typeBindings);
            } else if (type instanceof TypeVariable) {
                TypeVariable typeVariable = (TypeVariable) type;
                String name = typeVariable.getName();
                if (typeBindings != null) {
                    JavaType findBoundType = typeBindings.findBoundType(name);
                    if (findBoundType != null) {
                        javaType = findBoundType;
                    } else if (typeBindings.hasUnbound(name)) {
                        javaType = CORE_TYPE_OBJECT;
                    } else {
                        TypeBindings withUnboundVariable = typeBindings.withUnboundVariable(name);
                        synchronized (typeVariable) {
                            bounds = typeVariable.getBounds();
                        }
                        javaType = _fromAny(classStack, bounds[0], withUnboundVariable);
                    }
                } else {
                    throw new IllegalArgumentException(je.y0("Null `bindings` passed (type variable \"", name, "\")"));
                }
            } else if (type instanceof WildcardType) {
                javaType = _fromAny(classStack, ((WildcardType) type).getUpperBounds()[0], typeBindings);
            } else {
                StringBuilder V0 = je.V0("Unrecognized Type: ");
                V0.append(type == null ? "[null]" : type.toString());
                throw new IllegalArgumentException(V0.toString());
            }
        }
        if (this._modifiers != null) {
            TypeBindings bindings = javaType.getBindings();
            if (bindings == null) {
                bindings = EMPTY_BINDINGS;
            }
            TypeModifier[] typeModifierArr = this._modifiers;
            int length = typeModifierArr.length;
            int i3 = 0;
            while (i3 < length) {
                TypeModifier typeModifier = typeModifierArr[i3];
                JavaType modifyType = typeModifier.modifyType(javaType, type, bindings, this);
                if (modifyType != null) {
                    i3++;
                    javaType = modifyType;
                } else {
                    throw new IllegalStateException(String.format("TypeModifier %s (of type %s) return null for type %s", typeModifier, typeModifier.getClass().getName(), javaType));
                }
            }
        }
        return javaType;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x017a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.JavaType _fromClass(com.fasterxml.jackson.databind.type.ClassStack r20, java.lang.Class<?> r21, com.fasterxml.jackson.databind.type.TypeBindings r22) {
        /*
        // Method dump skipped, instructions count: 423
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.type.TypeFactory._fromClass(com.fasterxml.jackson.databind.type.ClassStack, java.lang.Class, com.fasterxml.jackson.databind.type.TypeBindings):com.fasterxml.jackson.databind.JavaType");
    }

    /* access modifiers changed from: protected */
    public JavaType _newSimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new SimpleType(cls, typeBindings, javaType, javaTypeArr, null, null, false);
    }

    /* access modifiers changed from: protected */
    public JavaType[] _resolveSuperInterfaces(ClassStack classStack, Class<?> cls, TypeBindings typeBindings) {
        int i = ClassUtil.a;
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces == null || genericInterfaces.length == 0) {
            return NO_TYPES;
        }
        int length = genericInterfaces.length;
        JavaType[] javaTypeArr = new JavaType[length];
        for (int i2 = 0; i2 < length; i2++) {
            javaTypeArr[i2] = _fromAny(classStack, genericInterfaces[i2], typeBindings);
        }
        return javaTypeArr;
    }

    public CollectionType constructCollectionType(Class<? extends Collection> cls, Class<?> cls2) {
        return constructCollectionType(cls, _fromClass(null, cls2, EMPTY_BINDINGS));
    }

    public JavaType constructFromCanonical(String str) {
        TypeParser typeParser = this._parser;
        typeParser.getClass();
        TypeParser.MyTokenizer myTokenizer = new TypeParser.MyTokenizer(str.trim());
        JavaType parseType = typeParser.parseType(myTokenizer);
        if (!myTokenizer.hasMoreTokens()) {
            return parseType;
        }
        throw typeParser._problem(myTokenizer, "Unexpected tokens after complete type");
    }

    public JavaType constructGeneralizedType(JavaType javaType, Class<?> cls) {
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == cls) {
            return javaType;
        }
        JavaType findSuperType = javaType.findSuperType(cls);
        if (findSuperType != null) {
            return findSuperType;
        }
        if (!cls.isAssignableFrom(rawClass)) {
            throw new IllegalArgumentException(String.format("Class %s not a super-type of %s", cls.getName(), javaType));
        }
        throw new IllegalArgumentException(String.format("Internal error: class %s not included as super-type for %s", cls.getName(), javaType));
    }

    public MapType constructMapType(Class<? extends Map> cls, Class<?> cls2, Class<?> cls3) {
        JavaType javaType;
        JavaType javaType2;
        if (cls == Properties.class) {
            javaType2 = CORE_TYPE_STRING;
            javaType = javaType2;
        } else {
            TypeBindings typeBindings = EMPTY_BINDINGS;
            javaType2 = _fromClass(null, cls2, typeBindings);
            javaType = _fromClass(null, cls3, typeBindings);
        }
        return constructMapType(cls, javaType2, javaType);
    }

    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) {
        JavaType javaType2;
        String str;
        JavaType javaType3;
        JavaType javaType4;
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == cls) {
            return javaType;
        }
        if (rawClass == Object.class) {
            javaType2 = _fromClass(null, cls, EMPTY_BINDINGS);
        } else {
            if (!rawClass.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(String.format("Class %s not subtype of %s", cls.getName(), javaType));
            } else if (javaType.getBindings().isEmpty()) {
                javaType2 = _fromClass(null, cls, EMPTY_BINDINGS);
            } else {
                if (javaType.isContainerType()) {
                    if (javaType.isMapLikeType()) {
                        if (cls == HashMap.class || cls == LinkedHashMap.class || cls == EnumMap.class || cls == TreeMap.class) {
                            javaType2 = _fromClass(null, cls, TypeBindings.create(cls, javaType.getKeyType(), javaType.getContentType()));
                        }
                    } else if (javaType.isCollectionLikeType()) {
                        if (cls == ArrayList.class || cls == LinkedList.class || cls == HashSet.class || cls == TreeSet.class) {
                            javaType2 = _fromClass(null, cls, TypeBindings.create(cls, javaType.getContentType()));
                        } else if (rawClass == EnumSet.class) {
                            return javaType;
                        }
                    }
                }
                int length = cls.getTypeParameters().length;
                if (length == 0) {
                    javaType2 = _fromClass(null, cls, EMPTY_BINDINGS);
                } else {
                    PlaceholderForType[] placeholderForTypeArr = new PlaceholderForType[length];
                    for (int i = 0; i < length; i++) {
                        placeholderForTypeArr[i] = new PlaceholderForType(i);
                    }
                    JavaType findSuperType = _fromClass(null, cls, TypeBindings.create(cls, placeholderForTypeArr)).findSuperType(javaType.getRawClass());
                    if (findSuperType != null) {
                        List<JavaType> typeParameters = javaType.getBindings().getTypeParameters();
                        List<JavaType> typeParameters2 = findSuperType.getBindings().getTypeParameters();
                        int size = typeParameters.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                str = null;
                                break;
                            }
                            javaType3 = typeParameters.get(i2);
                            javaType4 = typeParameters2.get(i2);
                            if (_verifyAndResolvePlaceholders(javaType3, javaType4) || javaType3.hasRawClass(Object.class) || ((i2 == 0 && javaType.hasRawClass(Map.class) && javaType4.hasRawClass(Object.class)) || (javaType3.isInterface() && javaType3.isTypeOrSuperTypeOf(javaType4.getRawClass())))) {
                                i2++;
                            }
                        }
                        str = String.format("Type parameter #%d/%d differs; can not specialize %s with %s", Integer.valueOf(i2 + 1), Integer.valueOf(size), javaType3.toCanonical(), javaType4.toCanonical());
                        if (str == null) {
                            JavaType[] javaTypeArr = new JavaType[length];
                            for (int i3 = 0; i3 < length; i3++) {
                                JavaType javaType5 = placeholderForTypeArr[i3]._actualType;
                                if (javaType5 == null) {
                                    javaType5 = unknownType();
                                }
                                javaTypeArr[i3] = javaType5;
                            }
                            javaType2 = _fromClass(null, cls, TypeBindings.create(cls, javaTypeArr));
                        } else {
                            StringBuilder V0 = je.V0("Failed to specialize base type ");
                            V0.append(javaType.toCanonical());
                            V0.append(" as ");
                            V0.append(cls.getName());
                            V0.append(", problem: ");
                            V0.append(str);
                            throw new IllegalArgumentException(V0.toString());
                        }
                    } else {
                        throw new IllegalArgumentException(String.format("Internal error: unable to locate supertype (%s) from resolved subtype %s", javaType.getRawClass().getName(), cls.getName()));
                    }
                }
            }
        }
        return javaType2.withHandlersFrom(javaType);
    }

    public JavaType constructType(Type type) {
        return _fromAny(null, type, EMPTY_BINDINGS);
    }

    public Class<?> findClass(String str) {
        Class<?> cls;
        Throwable th = null;
        if (str.indexOf(46) < 0) {
            if ("int".equals(str)) {
                cls = Integer.TYPE;
            } else if (Constants.LONG.equals(str)) {
                cls = Long.TYPE;
            } else if ("float".equals(str)) {
                cls = Float.TYPE;
            } else if ("double".equals(str)) {
                cls = Double.TYPE;
            } else if ("boolean".equals(str)) {
                cls = Boolean.TYPE;
            } else if ("byte".equals(str)) {
                cls = Byte.TYPE;
            } else if ("char".equals(str)) {
                cls = Character.TYPE;
            } else if ("short".equals(str)) {
                cls = Short.TYPE;
            } else {
                cls = "void".equals(str) ? Void.TYPE : null;
            }
            if (cls != null) {
                return cls;
            }
        }
        ClassLoader classLoader = this._classLoader;
        if (classLoader == null) {
            classLoader = Thread.currentThread().getContextClassLoader();
        }
        if (classLoader != null) {
            try {
                return Class.forName(str, true, classLoader);
            } catch (Exception e) {
                th = ClassUtil.getRootCause(e);
            }
        }
        try {
            return Class.forName(str);
        } catch (Exception e2) {
            if (th == null) {
                th = ClassUtil.getRootCause(e2);
            }
            ClassUtil.throwIfRTE(th);
            throw new ClassNotFoundException(th.getMessage(), th);
        }
    }

    public JavaType[] findTypeParameters(JavaType javaType, Class<?> cls) {
        JavaType findSuperType = javaType.findSuperType(cls);
        if (findSuperType == null) {
            return NO_TYPES;
        }
        return findSuperType.getBindings().typeParameterArray();
    }

    @Deprecated
    public JavaType uncheckedSimpleType(Class<?> cls) {
        JavaType _findWellKnownSimple;
        TypeBindings typeBindings = EMPTY_BINDINGS;
        return (!typeBindings.isEmpty() || (_findWellKnownSimple = _findWellKnownSimple(cls)) == null) ? _newSimpleType(cls, typeBindings, null, null) : _findWellKnownSimple;
    }

    public TypeFactory withModifier(TypeModifier typeModifier) {
        LRUMap<Object, JavaType> lRUMap = this._typeCache;
        TypeModifier[] typeModifierArr = null;
        if (typeModifier == null) {
            lRUMap = null;
        } else {
            TypeModifier[] typeModifierArr2 = this._modifiers;
            if (typeModifierArr2 == null) {
                typeModifierArr = new TypeModifier[]{typeModifier};
                lRUMap = null;
            } else {
                typeModifierArr = (TypeModifier[]) ArrayBuilders.insertInListNoDup(typeModifierArr2, typeModifier);
            }
        }
        return new TypeFactory(lRUMap, this._parser, typeModifierArr, this._classLoader);
    }

    public JavaType constructType(Type type, TypeBindings typeBindings) {
        return _fromAny(null, type, typeBindings);
    }

    public JavaType constructType(TypeReference<?> typeReference) {
        return _fromAny(null, typeReference.getType(), EMPTY_BINDINGS);
    }

    public CollectionType constructCollectionType(Class<? extends Collection> cls, JavaType javaType) {
        TypeBindings createIfNeeded = TypeBindings.createIfNeeded(cls, javaType);
        CollectionType collectionType = (CollectionType) _fromClass(null, cls, createIfNeeded);
        if (createIfNeeded.isEmpty() && javaType != null) {
            JavaType contentType = collectionType.findSuperType(Collection.class).getContentType();
            if (!contentType.equals(javaType)) {
                throw new IllegalArgumentException(String.format("Non-generic Collection class %s did not resolve to something with element type %s but %s ", ClassUtil.nameOf(cls), javaType, contentType));
            }
        }
        return collectionType;
    }

    public MapType constructMapType(Class<? extends Map> cls, JavaType javaType, JavaType javaType2) {
        TypeBindings createIfNeeded = TypeBindings.createIfNeeded(cls, new JavaType[]{javaType, javaType2});
        MapType mapType = (MapType) _fromClass(null, cls, createIfNeeded);
        if (createIfNeeded.isEmpty()) {
            JavaType findSuperType = mapType.findSuperType(Map.class);
            JavaType keyType = findSuperType.getKeyType();
            if (keyType.equals(javaType)) {
                JavaType contentType = findSuperType.getContentType();
                if (!contentType.equals(javaType2)) {
                    throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with value type %s but %s ", ClassUtil.nameOf(cls), javaType2, contentType));
                }
            } else {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with key type %s but %s ", ClassUtil.nameOf(cls), javaType, keyType));
            }
        }
        return mapType;
    }

    protected TypeFactory(LRUMap<Object, JavaType> lRUMap, TypeParser typeParser, TypeModifier[] typeModifierArr, ClassLoader classLoader) {
        this._typeCache = lRUMap == null ? new LRUMap<>(16, 200) : lRUMap;
        this._parser = this != typeParser._factory ? new TypeParser(this) : typeParser;
        this._modifiers = typeModifierArr;
        this._classLoader = classLoader;
    }
}
