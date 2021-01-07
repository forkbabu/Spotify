package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.a0;
import okhttp3.t;
import okhttp3.w;

/* access modifiers changed from: package-private */
public final class u {
    private final Method a;
    private final okhttp3.u b;
    final String c;
    private final String d;
    private final t e;
    private final w f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final r<?>[] j;
    final boolean k;

    /* access modifiers changed from: package-private */
    public static final class a {
        private static final Pattern x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        private static final Pattern y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
        final w a;
        final Method b;
        final Annotation[] c;
        final Annotation[][] d;
        final Type[] e;
        boolean f;
        boolean g;
        boolean h;
        boolean i;
        boolean j;
        boolean k;
        boolean l;
        boolean m;
        String n;
        boolean o;
        boolean p;
        boolean q;
        String r;
        t s;
        w t;
        Set<String> u;
        r<?>[] v;
        boolean w;

        a(w wVar, Method method) {
            this.a = wVar;
            this.b = method;
            this.c = method.getAnnotations();
            this.e = method.getGenericParameterTypes();
            this.d = method.getParameterAnnotations();
        }

        private static Class<?> a(Class<?> cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            return Short.TYPE == cls ? Short.class : cls;
        }

        private void c(String str, String str2, boolean z) {
            String str3 = this.n;
            if (str3 == null) {
                this.n = str;
                this.o = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (x.matcher(substring).find()) {
                            throw a0.k(this.b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.r = str2;
                    Matcher matcher = x.matcher(str2);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    while (matcher.find()) {
                        linkedHashSet.add(matcher.group(1));
                    }
                    this.u = linkedHashSet;
                    return;
                }
                return;
            }
            throw a0.k(this.b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        private void d(int i2, Type type) {
            if (a0.i(type)) {
                throw a0.m(this.b, i2, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:376:0x0988  */
        /* JADX WARNING: Removed duplicated region for block: B:504:0x098c A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public retrofit2.u b() {
            /*
            // Method dump skipped, instructions count: 2633
            */
            throw new UnsupportedOperationException("Method not decompiled: retrofit2.u.a.b():retrofit2.u");
        }
    }

    u(a aVar) {
        this.a = aVar.b;
        this.b = aVar.a.c;
        this.c = aVar.n;
        this.d = aVar.r;
        this.e = aVar.s;
        this.f = aVar.t;
        this.g = aVar.o;
        this.h = aVar.p;
        this.i = aVar.q;
        this.j = aVar.v;
        this.k = aVar.w;
    }

    /* access modifiers changed from: package-private */
    public a0 a(Object[] objArr) {
        r<?>[] rVarArr = this.j;
        int length = objArr.length;
        if (length == rVarArr.length) {
            t tVar = new t(this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i);
            if (this.k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(objArr[i2]);
                rVarArr[i2].a(tVar, objArr[i2]);
            }
            a0.a i3 = tVar.i();
            i3.i(m.class, new m(this.a, arrayList));
            return i3.b();
        }
        throw new IllegalArgumentException(je.B0(je.W0("Argument count (", length, ") doesn't match expected count ("), rVarArr.length, ")"));
    }
}
