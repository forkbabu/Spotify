package retrofit2;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import okhttp3.c0;
import okhttp3.t;
import okhttp3.x;
import retrofit2.a;

/* access modifiers changed from: package-private */
public abstract class r<T> {

    /* access modifiers changed from: package-private */
    public static final class a<T> extends r<T> {
        private final Method a;
        private final int b;
        private final j<T, c0> c;

        a(Method method, int i, j<T, c0> jVar) {
            this.a = method;
            this.b = i;
            this.c = jVar;
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.r
        public void a(t tVar, T t) {
            if (t != null) {
                try {
                    tVar.j(this.c.convert(t));
                } catch (IOException e) {
                    Method method = this.a;
                    int i = this.b;
                    throw a0.n(method, e, i, "Unable to convert " + ((Object) t) + " to RequestBody", new Object[0]);
                }
            } else {
                throw a0.m(this.a, this.b, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> extends r<T> {
        private final String a;
        private final j<T, String> b;
        private final boolean c;

        b(String str, j<T, String> jVar, boolean z) {
            if (str != null) {
                this.a = str;
                this.b = jVar;
                this.c = z;
                return;
            }
            throw new NullPointerException("name == null");
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.r
        public void a(t tVar, T t) {
            String obj;
            if (t != null && (obj = t.toString()) != null) {
                tVar.a(this.a, obj, this.c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> extends r<Map<String, T>> {
        private final Method a;
        private final int b;
        private final j<T, String> c;
        private final boolean d;

        c(Method method, int i, j<T, String> jVar, boolean z) {
            this.a = method;
            this.b = i;
            this.c = jVar;
            this.d = z;
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.r
        public void a(t tVar, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                tVar.a(str, obj2, this.d);
                            } else {
                                Method method = this.a;
                                int i = this.b;
                                throw a0.m(method, i, "Field map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw a0.m(this.a, this.b, je.y0("Field map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw a0.m(this.a, this.b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw a0.m(this.a, this.b, "Field map was null.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> extends r<T> {
        private final String a;
        private final j<T, String> b;

        d(String str, j<T, String> jVar) {
            if (str != null) {
                this.a = str;
                this.b = jVar;
                return;
            }
            throw new NullPointerException("name == null");
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.r
        public void a(t tVar, T t) {
            String obj;
            if (t != null && (obj = t.toString()) != null) {
                tVar.b(this.a, obj);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> extends r<Map<String, T>> {
        private final Method a;
        private final int b;
        private final j<T, String> c;

        e(Method method, int i, j<T, String> jVar) {
            this.a = method;
            this.b = i;
            this.c = jVar;
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.r
        public void a(t tVar, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            tVar.b(str, value.toString());
                        } else {
                            throw a0.m(this.a, this.b, je.y0("Header map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw a0.m(this.a, this.b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw a0.m(this.a, this.b, "Header map was null.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends r<t> {
        private final Method a;
        private final int b;

        f(Method method, int i) {
            this.a = method;
            this.b = i;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [retrofit2.t, java.lang.Object] */
        /* access modifiers changed from: package-private */
        @Override // retrofit2.r
        public void a(t tVar, t tVar2) {
            t tVar3 = tVar2;
            if (tVar3 != null) {
                tVar.c(tVar3);
                return;
            }
            throw a0.m(this.a, this.b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> extends r<T> {
        private final Method a;
        private final int b;
        private final t c;
        private final j<T, c0> d;

        g(Method method, int i, t tVar, j<T, c0> jVar) {
            this.a = method;
            this.b = i;
            this.c = tVar;
            this.d = jVar;
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.r
        public void a(t tVar, T t) {
            if (t != null) {
                try {
                    tVar.d(this.c, this.d.convert(t));
                } catch (IOException e) {
                    Method method = this.a;
                    int i = this.b;
                    throw a0.m(method, i, "Unable to convert " + ((Object) t) + " to RequestBody", e);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<T> extends r<Map<String, T>> {
        private final Method a;
        private final int b;
        private final j<T, c0> c;
        private final String d;

        h(Method method, int i, j<T, c0> jVar, String str) {
            this.a = method;
            this.b = i;
            this.c = jVar;
            this.d = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: retrofit2.j<T, okhttp3.c0> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        @Override // retrofit2.r
        public void a(t tVar, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            tVar.d(t.f("Content-Disposition", je.y0("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.d), (c0) this.c.convert(value));
                        } else {
                            throw a0.m(this.a, this.b, je.y0("Part map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw a0.m(this.a, this.b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw a0.m(this.a, this.b, "Part map was null.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<T> extends r<T> {
        private final Method a;
        private final int b;
        private final String c;
        private final j<T, String> d;
        private final boolean e;

        i(Method method, int i, String str, j<T, String> jVar, boolean z) {
            this.a = method;
            this.b = i;
            if (str != null) {
                this.c = str;
                this.d = jVar;
                this.e = z;
                return;
            }
            throw new NullPointerException("name == null");
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.r
        public void a(t tVar, T t) {
            if (t != null) {
                tVar.f(this.c, t.toString(), this.e);
                return;
            }
            throw a0.m(this.a, this.b, je.I0(je.V0("Path parameter \""), this.c, "\" value must not be null."), new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<T> extends r<T> {
        private final String a;
        private final j<T, String> b;
        private final boolean c;

        j(String str, j<T, String> jVar, boolean z) {
            if (str != null) {
                this.a = str;
                this.b = jVar;
                this.c = z;
                return;
            }
            throw new NullPointerException("name == null");
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.r
        public void a(t tVar, T t) {
            String obj;
            if (t != null && (obj = t.toString()) != null) {
                tVar.g(this.a, obj, this.c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k<T> extends r<Map<String, T>> {
        private final Method a;
        private final int b;
        private final j<T, String> c;
        private final boolean d;

        k(Method method, int i, j<T, String> jVar, boolean z) {
            this.a = method;
            this.b = i;
            this.c = jVar;
            this.d = z;
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.r
        public void a(t tVar, Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                tVar.g(str, obj2, this.d);
                            } else {
                                Method method = this.a;
                                int i = this.b;
                                throw a0.m(method, i, "Query map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw a0.m(this.a, this.b, je.y0("Query map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw a0.m(this.a, this.b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw a0.m(this.a, this.b, "Query map was null", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l<T> extends r<T> {
        private final j<T, String> a;
        private final boolean b;

        l(j<T, String> jVar, boolean z) {
            this.a = jVar;
            this.b = z;
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.r
        public void a(t tVar, T t) {
            if (t != null) {
                tVar.g(t.toString(), null, this.b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m extends r<x.b> {
        static final m a = new m();

        private m() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [retrofit2.t, java.lang.Object] */
        /* access modifiers changed from: package-private */
        @Override // retrofit2.r
        public void a(t tVar, x.b bVar) {
            x.b bVar2 = bVar;
            if (bVar2 != null) {
                tVar.e(bVar2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n extends r<Object> {
        private final Method a;
        private final int b;

        n(Method method, int i) {
            this.a = method;
            this.b = i;
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.r
        public void a(t tVar, Object obj) {
            if (obj != null) {
                tVar.k(obj);
                return;
            }
            throw a0.m(this.a, this.b, "@Url parameter is null.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o<T> extends r<T> {
        final Class<T> a;

        o(Class<T> cls) {
            this.a = cls;
        }

        /* access modifiers changed from: package-private */
        @Override // retrofit2.r
        public void a(t tVar, T t) {
            tVar.h(this.a, t);
        }
    }

    r() {
    }

    /* access modifiers changed from: package-private */
    public abstract void a(t tVar, T t);
}
