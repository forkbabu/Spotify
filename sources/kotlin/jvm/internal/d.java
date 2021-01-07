package kotlin.jvm.internal;

import com.adjust.sdk.Constants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.b;
import kotlin.reflect.c;
import kotlin.text.e;

public final class d implements c<Object>, c {
    private static final Map<Class<? extends b<?>>, Integer> b;
    private static final HashMap<String, String> c;
    private static final HashMap<String, String> f;
    private static final HashMap<String, String> n;
    private static final Map<String, String> o;
    public static final a p = new a(null);
    private final Class<?> a;

    public static final class a {
        public a(f fVar) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v10, resolved type: java.util.HashMap<java.lang.String, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 0;
        List u = kotlin.collections.d.u(cmf.class, nmf.class, rmf.class, smf.class, tmf.class, umf.class, vmf.class, wmf.class, xmf.class, ymf.class, dmf.class, emf.class, fmf.class, gmf.class, hmf.class, imf.class, jmf.class, kmf.class, lmf.class, mmf.class, omf.class, pmf.class, qmf.class);
        ArrayList arrayList = new ArrayList(kotlin.collections.d.e(u, 10));
        for (Object obj : u) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new Pair((Class) obj, Integer.valueOf(i)));
                i = i2;
            } else {
                kotlin.collections.d.L();
                throw null;
            }
        }
        b = kotlin.collections.d.S(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put(Constants.LONG, "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        c = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        h.d(values, "primitiveFqNames.values");
        for (T t : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            h.d(t, "kotlinName");
            sb.append(e.A(t, '.', null, 2, null));
            sb.append("CompanionObject");
            Pair pair = new Pair(sb.toString(), je.x0(t, ".Companion"));
            hashMap3.put(pair.c(), pair.d());
        }
        for (Map.Entry<Class<? extends b<?>>, Integer> entry : b.entrySet()) {
            int intValue = entry.getValue().intValue();
            String name = entry.getKey().getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        n = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.d.w(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), e.A((String) entry2.getValue(), '.', null, 2, null));
        }
        o = linkedHashMap;
    }

    public d(Class<?> cls) {
        h.e(cls, "jClass");
        this.a = cls;
    }

    @Override // kotlin.reflect.c
    public boolean a(Object obj) {
        Class<?> cls = this.a;
        h.e(cls, "jClass");
        Map map = b;
        if (map != null) {
            Integer num = (Integer) map.get(cls);
            if (num != null) {
                return m.c(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                h.e(cls, "$this$kotlin");
                cls = yif.t(j.b(cls));
            }
            return cls.isInstance(obj);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
    }

    @Override // kotlin.jvm.internal.c
    public Class<?> c() {
        return this.a;
    }

    @Override // kotlin.reflect.c
    public String d() {
        String str;
        Class<?> cls = this.a;
        h.e(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) n.get(componentType.getName())) != null) {
                str2 = je.x0(str, "Array");
            }
            if (str2 != null) {
                return str2;
            }
            return "kotlin.Array";
        }
        String str3 = (String) n.get(cls.getName());
        return str3 != null ? str3 : cls.getCanonicalName();
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && h.a(yif.t(this), yif.t((c) obj));
    }

    public String h() {
        String str;
        String str2;
        Class<?> cls = this.a;
        h.e(cls, "jClass");
        String str3 = null;
        if (!cls.isAnonymousClass()) {
            if (cls.isLocalClass()) {
                String simpleName = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod != null) {
                    h.d(simpleName, "name");
                    str2 = e.z(simpleName, enclosingMethod.getName() + "$", null, 2, null);
                } else {
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    if (enclosingConstructor != null) {
                        h.d(simpleName, "name");
                        str2 = e.z(simpleName, enclosingConstructor.getName() + "$", null, 2, null);
                    } else {
                        str2 = null;
                    }
                }
                if (str2 != null) {
                    return str2;
                }
                h.d(simpleName, "name");
                h.e(simpleName, "$this$substringAfter");
                h.e(simpleName, "missingDelimiterValue");
                int k = e.k(simpleName, '$', 0, false, 6, null);
                if (k == -1) {
                    return simpleName;
                }
                String substring = simpleName.substring(k + 1, simpleName.length());
                h.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return substring;
            } else if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) o.get(componentType.getName())) != null) {
                    str3 = je.x0(str, "Array");
                }
                if (str3 == null) {
                    return "Array";
                }
            } else {
                String str4 = (String) o.get(cls.getName());
                return str4 != null ? str4 : cls.getSimpleName();
            }
        }
        return str3;
    }

    public int hashCode() {
        return yif.t(this).hashCode();
    }

    public String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
