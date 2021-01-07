package okhttp3;

import com.adjust.sdk.Constants;
import com.spotify.cosmos.router.Request;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.t;

public final class a0 {
    final u a;
    final String b;
    final t c;
    final c0 d;
    final Map<Class<?>, Object> e;
    private volatile d f;

    a0(a aVar) {
        Map<Class<?>, Object> map;
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = new t(aVar.c);
        this.d = aVar.d;
        Map<Class<?>, Object> map2 = aVar.e;
        byte[] bArr = rnf.a;
        if (map2.isEmpty()) {
            map = Collections.emptyMap();
        } else {
            map = Collections.unmodifiableMap(new LinkedHashMap(map2));
        }
        this.e = map;
    }

    public c0 a() {
        return this.d;
    }

    public d b() {
        d dVar = this.f;
        if (dVar != null) {
            return dVar;
        }
        d j = d.j(this.c);
        this.f = j;
        return j;
    }

    public String c(String str) {
        return this.c.c(str);
    }

    public List<String> d(String str) {
        return this.c.j(str);
    }

    public t e() {
        return this.c;
    }

    public boolean f() {
        return this.a.a.equals(Constants.SCHEME);
    }

    public String g() {
        return this.b;
    }

    public a h() {
        return new a(this);
    }

    public Object i() {
        return Object.class.cast(this.e.get(Object.class));
    }

    public <T> T j(Class<? extends T> cls) {
        return (T) cls.cast(this.e.get(cls));
    }

    public u k() {
        return this.a;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Request{method=");
        V0.append(this.b);
        V0.append(", url=");
        V0.append(this.a);
        V0.append(", tags=");
        V0.append(this.e);
        V0.append('}');
        return V0.toString();
    }

    public static class a {
        u a;
        String b;
        t.a c;
        c0 d;
        Map<Class<?>, Object> e;

        public a() {
            this.e = Collections.emptyMap();
            this.b = Request.GET;
            this.c = new t.a();
        }

        public a a(String str, String str2) {
            this.c.a(str, str2);
            return this;
        }

        public a0 b() {
            if (this.a != null) {
                return new a0(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a c(d dVar) {
            String dVar2 = dVar.toString();
            if (dVar2.isEmpty()) {
                this.c.g("Cache-Control");
                return this;
            }
            e("Cache-Control", dVar2);
            return this;
        }

        public a d() {
            g(Request.GET, null);
            return this;
        }

        public a e(String str, String str2) {
            t.a aVar = this.c;
            aVar.getClass();
            t.a(str);
            t.b(str2, str);
            aVar.g(str);
            aVar.a.add(str);
            aVar.a.add(str2.trim());
            return this;
        }

        public a f(t tVar) {
            this.c = tVar.e();
            return this;
        }

        public a g(String str, c0 c0Var) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (c0Var != null && !yif.F(str)) {
                throw new IllegalArgumentException(je.y0("method ", str, " must not have a request body."));
            } else if (c0Var != null || !yif.K(str)) {
                this.b = str;
                this.d = c0Var;
                return this;
            } else {
                throw new IllegalArgumentException(je.y0("method ", str, " must have a request body."));
            }
        }

        public a h(String str) {
            this.c.g(str);
            return this;
        }

        public <T> a i(Class<? super T> cls, T t) {
            if (cls != null) {
                if (t == null) {
                    this.e.remove(cls);
                } else {
                    if (this.e.isEmpty()) {
                        this.e = new LinkedHashMap();
                    }
                    this.e.put(cls, cls.cast(t));
                }
                return this;
            }
            throw new NullPointerException("type == null");
        }

        public a j(String str) {
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    StringBuilder V0 = je.V0("http:");
                    V0.append(str.substring(3));
                    str = V0.toString();
                } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                    StringBuilder V02 = je.V0("https:");
                    V02.append(str.substring(4));
                    str = V02.toString();
                }
                this.a = u.j(str);
                return this;
            }
            throw new NullPointerException("url == null");
        }

        public a k(u uVar) {
            if (uVar != null) {
                this.a = uVar;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        a(a0 a0Var) {
            Map<Class<?>, Object> map;
            this.e = Collections.emptyMap();
            this.a = a0Var.a;
            this.b = a0Var.b;
            this.d = a0Var.d;
            if (a0Var.e.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = new LinkedHashMap<>(a0Var.e);
            }
            this.e = map;
            this.c = a0Var.c.e();
        }
    }
}
