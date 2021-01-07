package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.c0;
import okhttp3.e0;
import retrofit2.j;

/* access modifiers changed from: package-private */
public final class a extends j.a {
    private boolean a = true;

    /* renamed from: retrofit2.a$a  reason: collision with other inner class name */
    static final class C0673a implements j<e0, e0> {
        static final C0673a a = new C0673a();

        C0673a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // retrofit2.j
        public e0 convert(e0 e0Var) {
            e0 e0Var2 = e0Var;
            try {
                return a0.a(e0Var2);
            } finally {
                e0Var2.close();
            }
        }
    }

    static final class b implements j<c0, c0> {
        static final b a = new b();

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // retrofit2.j
        public c0 convert(c0 c0Var) {
            return c0Var;
        }
    }

    static final class c implements j<e0, e0> {
        static final c a = new c();

        c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // retrofit2.j
        public e0 convert(e0 e0Var) {
            return e0Var;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements j<Object, String> {
        static final d a = new d();

        d() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // retrofit2.j
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    static final class e implements j<e0, kotlin.f> {
        static final e a = new e();

        e() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // retrofit2.j
        public kotlin.f convert(e0 e0Var) {
            e0Var.close();
            return kotlin.f.a;
        }
    }

    static final class f implements j<e0, Void> {
        static final f a = new f();

        f() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // retrofit2.j
        public Void convert(e0 e0Var) {
            e0Var.close();
            return null;
        }
    }

    a() {
    }

    @Override // retrofit2.j.a
    public j<?, c0> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, w wVar) {
        if (c0.class.isAssignableFrom(a0.g(type))) {
            return b.a;
        }
        return null;
    }

    @Override // retrofit2.j.a
    public j<e0, ?> b(Type type, Annotation[] annotationArr, w wVar) {
        if (type == e0.class) {
            if (a0.j(annotationArr, qrf.class)) {
                return c.a;
            }
            return C0673a.a;
        } else if (type == Void.class) {
            return f.a;
        } else {
            if (!this.a || type != kotlin.f.class) {
                return null;
            }
            try {
                return e.a;
            } catch (NoClassDefFoundError unused) {
                this.a = false;
                return null;
            }
        }
    }
}
