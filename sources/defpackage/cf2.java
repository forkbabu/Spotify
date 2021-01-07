package defpackage;

import com.spotify.mobile.android.cosmos.JacksonModel;
import io.reactivex.s;

/* renamed from: cf2  reason: default package */
public final class cf2<A extends JacksonModel, R extends JacksonModel> {
    private final Class<A> a;
    private final Class<R> b;
    private int c;
    private c<A, R> d;
    private String e;

    /* renamed from: cf2$b */
    public static class b<A extends JacksonModel, R extends JacksonModel> implements bf2<A, R> {
        private final Class<A> a;
        private final int b;
        private final c<A, R> c;
        private final String d;

        b(Class cls, Class cls2, String str, int i, c cVar, a aVar) {
            this.a = cls;
            this.d = str;
            this.b = i;
            this.c = cVar;
        }

        @Override // defpackage.bf2
        public s<R> a(A a2) {
            return this.c.a(a2);
        }

        @Override // defpackage.bf2
        public int b() {
            return this.b;
        }

        @Override // defpackage.bf2
        public Class<A> c() {
            return this.a;
        }

        @Override // defpackage.bf2
        public String getUri() {
            return this.d;
        }
    }

    /* renamed from: cf2$c */
    public interface c<A extends JacksonModel, R extends JacksonModel> {
        s<R> a(A a);
    }

    private cf2(Class<A> cls, Class<R> cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static <A extends JacksonModel, R extends JacksonModel> cf2<A, R> b(Class<A> cls, Class<R> cls2) {
        return new cf2<>(cls, cls2);
    }

    public bf2<A, R> a() {
        Class<A> cls = this.a;
        cls.getClass();
        Class<R> cls2 = this.b;
        cls2.getClass();
        String str = this.e;
        str.getClass();
        int i = this.c;
        c<A, R> cVar = this.d;
        cVar.getClass();
        return new b(cls, cls2, str, i, cVar, null);
    }

    public cf2<A, R> c(int i) {
        this.c = i;
        return this;
    }

    public cf2<A, R> d(String str) {
        this.e = str;
        return this;
    }

    public cf2<A, R> e(c<A, R> cVar) {
        this.d = cVar;
        return this;
    }
}
