package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import java.io.Serializable;

public abstract class t<T> {
    public static final t<Integer> b = new c(false);
    public static final t<Integer> c = new d(false);
    public static final t<int[]> d = new e(true);
    public static final t<Long> e = new f(false);
    public static final t<long[]> f = new g(true);
    public static final t<Float> g = new h(false);
    public static final t<float[]> h = new i(true);
    public static final t<Boolean> i = new j(false);
    public static final t<boolean[]> j = new k(true);
    public static final t<String> k = new a(true);
    public static final t<String[]> l = new b(true);
    private final boolean a;

    class a extends t<String> {
        a(boolean z) {
            super(z);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // androidx.navigation.t
        public String a(Bundle bundle, String str) {
            return (String) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return "string";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // androidx.navigation.t
        public String d(String str) {
            return str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.os.Bundle, java.lang.String, java.lang.Object] */
        @Override // androidx.navigation.t
        public void e(Bundle bundle, String str, String str2) {
            bundle.putString(str, str2);
        }
    }

    class b extends t<String[]> {
        b(boolean z) {
            super(z);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // androidx.navigation.t
        public String[] a(Bundle bundle, String str) {
            return (String[]) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return "string[]";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // androidx.navigation.t
        public String[] d(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.os.Bundle, java.lang.String, java.lang.Object] */
        @Override // androidx.navigation.t
        public void e(Bundle bundle, String str, String[] strArr) {
            bundle.putStringArray(str, strArr);
        }
    }

    class c extends t<Integer> {
        c(boolean z) {
            super(z);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // androidx.navigation.t
        public Integer a(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return "integer";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // androidx.navigation.t
        public Integer d(String str) {
            if (str.startsWith("0x")) {
                return Integer.valueOf(Integer.parseInt(str.substring(2), 16));
            }
            return Integer.valueOf(Integer.parseInt(str));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.os.Bundle, java.lang.String, java.lang.Object] */
        @Override // androidx.navigation.t
        public void e(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    class d extends t<Integer> {
        d(boolean z) {
            super(z);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // androidx.navigation.t
        public Integer a(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return "reference";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // androidx.navigation.t
        public Integer d(String str) {
            throw new UnsupportedOperationException("References don't support parsing string values.");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.os.Bundle, java.lang.String, java.lang.Object] */
        @Override // androidx.navigation.t
        public void e(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    class e extends t<int[]> {
        e(boolean z) {
            super(z);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // androidx.navigation.t
        public int[] a(Bundle bundle, String str) {
            return (int[]) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return "integer[]";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // androidx.navigation.t
        public int[] d(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.os.Bundle, java.lang.String, java.lang.Object] */
        @Override // androidx.navigation.t
        public void e(Bundle bundle, String str, int[] iArr) {
            bundle.putIntArray(str, iArr);
        }
    }

    class f extends t<Long> {
        f(boolean z) {
            super(z);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // androidx.navigation.t
        public Long a(Bundle bundle, String str) {
            return (Long) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return Constants.LONG;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // androidx.navigation.t
        public Long d(String str) {
            if (str.endsWith("L")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.startsWith("0x")) {
                return Long.valueOf(Long.parseLong(str.substring(2), 16));
            }
            return Long.valueOf(Long.parseLong(str));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.os.Bundle, java.lang.String, java.lang.Object] */
        @Override // androidx.navigation.t
        public void e(Bundle bundle, String str, Long l) {
            bundle.putLong(str, l.longValue());
        }
    }

    class g extends t<long[]> {
        g(boolean z) {
            super(z);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // androidx.navigation.t
        public long[] a(Bundle bundle, String str) {
            return (long[]) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return "long[]";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // androidx.navigation.t
        public long[] d(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.os.Bundle, java.lang.String, java.lang.Object] */
        @Override // androidx.navigation.t
        public void e(Bundle bundle, String str, long[] jArr) {
            bundle.putLongArray(str, jArr);
        }
    }

    class h extends t<Float> {
        h(boolean z) {
            super(z);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // androidx.navigation.t
        public Float a(Bundle bundle, String str) {
            return (Float) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return "float";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // androidx.navigation.t
        public Float d(String str) {
            return Float.valueOf(Float.parseFloat(str));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.os.Bundle, java.lang.String, java.lang.Object] */
        @Override // androidx.navigation.t
        public void e(Bundle bundle, String str, Float f) {
            bundle.putFloat(str, f.floatValue());
        }
    }

    class i extends t<float[]> {
        i(boolean z) {
            super(z);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // androidx.navigation.t
        public float[] a(Bundle bundle, String str) {
            return (float[]) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return "float[]";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // androidx.navigation.t
        public float[] d(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.os.Bundle, java.lang.String, java.lang.Object] */
        @Override // androidx.navigation.t
        public void e(Bundle bundle, String str, float[] fArr) {
            bundle.putFloatArray(str, fArr);
        }
    }

    class j extends t<Boolean> {
        j(boolean z) {
            super(z);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // androidx.navigation.t
        public Boolean a(Bundle bundle, String str) {
            return (Boolean) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return "boolean";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // androidx.navigation.t
        public Boolean d(String str) {
            if ("true".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equals(str)) {
                return Boolean.FALSE;
            }
            throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.os.Bundle, java.lang.String, java.lang.Object] */
        @Override // androidx.navigation.t
        public void e(Bundle bundle, String str, Boolean bool) {
            bundle.putBoolean(str, bool.booleanValue());
        }
    }

    class k extends t<boolean[]> {
        k(boolean z) {
            super(z);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // androidx.navigation.t
        public boolean[] a(Bundle bundle, String str) {
            return (boolean[]) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return "boolean[]";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // androidx.navigation.t
        public boolean[] d(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.os.Bundle, java.lang.String, java.lang.Object] */
        @Override // androidx.navigation.t
        public void e(Bundle bundle, String str, boolean[] zArr) {
            bundle.putBooleanArray(str, zArr);
        }
    }

    public static final class l<D extends Enum> extends p<D> {
        private final Class<D> n;

        public l(Class<D> cls) {
            super(false, cls);
            if (cls.isEnum()) {
                this.n = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " is not an Enum type.");
        }

        @Override // androidx.navigation.t.p, androidx.navigation.t
        public String b() {
            return this.n.getName();
        }

        /* renamed from: g */
        public D f(String str) {
            D[] enumConstants = this.n.getEnumConstants();
            for (D d : enumConstants) {
                if (d.name().equals(str)) {
                    return d;
                }
            }
            throw new IllegalArgumentException(je.l0(this.n, je.a1("Enum value ", str, " not found for type "), "."));
        }
    }

    public static final class m<D extends Parcelable> extends t<D[]> {
        private final Class<D[]> m;

        public m(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls)) {
                try {
                    this.m = (Class<D[]>) Class.forName("[L" + cls.getName() + ";");
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new IllegalArgumentException(cls + " does not implement Parcelable.");
            }
        }

        @Override // androidx.navigation.t
        public Object a(Bundle bundle, String str) {
            return (Parcelable[]) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return this.m.getName();
        }

        @Override // androidx.navigation.t
        public Object d(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.t
        public void e(Bundle bundle, String str, Object obj) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            this.m.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || m.class != obj.getClass()) {
                return false;
            }
            return this.m.equals(((m) obj).m);
        }

        public int hashCode() {
            return this.m.hashCode();
        }
    }

    public static final class n<D> extends t<D> {
        private final Class<D> m;

        public n(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Parcelable or Serializable.");
        }

        @Override // androidx.navigation.t
        public D a(Bundle bundle, String str) {
            return (D) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return this.m.getName();
        }

        @Override // androidx.navigation.t
        public D d(String str) {
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // androidx.navigation.t
        public void e(Bundle bundle, String str, D d) {
            this.m.cast(d);
            if (d == null || (d instanceof Parcelable)) {
                bundle.putParcelable(str, d);
            } else if (d instanceof Serializable) {
                bundle.putSerializable(str, d);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || n.class != obj.getClass()) {
                return false;
            }
            return this.m.equals(((n) obj).m);
        }

        public int hashCode() {
            return this.m.hashCode();
        }
    }

    public static final class o<D extends Serializable> extends t<D[]> {
        private final Class<D[]> m;

        public o(Class<D> cls) {
            super(true);
            if (Serializable.class.isAssignableFrom(cls)) {
                try {
                    this.m = (Class<D[]>) Class.forName("[L" + cls.getName() + ";");
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
        }

        @Override // androidx.navigation.t
        public Object a(Bundle bundle, String str) {
            return (Serializable[]) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return this.m.getName();
        }

        @Override // androidx.navigation.t
        public Object d(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.os.Bundle */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.io.Serializable[], java.io.Serializable] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // androidx.navigation.t
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void e(android.os.Bundle r2, java.lang.String r3, java.lang.Object r4) {
            /*
                r1 = this;
                java.io.Serializable[] r4 = (java.io.Serializable[]) r4
                java.lang.Class<D extends java.io.Serializable[]> r0 = r1.m
                r0.cast(r4)
                r2.putSerializable(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.t.o.e(android.os.Bundle, java.lang.String, java.lang.Object):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || o.class != obj.getClass()) {
                return false;
            }
            return this.m.equals(((o) obj).m);
        }

        public int hashCode() {
            return this.m.hashCode();
        }
    }

    t(boolean z) {
        this.a = z;
    }

    public abstract T a(Bundle bundle, String str);

    public abstract String b();

    public boolean c() {
        return this.a;
    }

    public abstract T d(String str);

    public abstract void e(Bundle bundle, String str, T t);

    public String toString() {
        return b();
    }

    public static class p<D extends Serializable> extends t<D> {
        private final Class<D> m;

        public p(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            } else if (!cls.isEnum()) {
                this.m = cls;
            } else {
                throw new IllegalArgumentException(cls + " is an Enum. You should use EnumType instead.");
            }
        }

        @Override // androidx.navigation.t
        public Object a(Bundle bundle, String str) {
            return (Serializable) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return this.m.getName();
        }

        @Override // androidx.navigation.t
        public void e(Bundle bundle, String str, Object obj) {
            Serializable serializable = (Serializable) obj;
            this.m.cast(serializable);
            bundle.putSerializable(str, serializable);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            return this.m.equals(((p) obj).m);
        }

        /* renamed from: f */
        public D d(String str) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public int hashCode() {
            return this.m.hashCode();
        }

        p(boolean z, Class<D> cls) {
            super(z);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Serializable.");
        }
    }
}
