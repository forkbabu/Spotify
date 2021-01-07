package defpackage;

import defpackage.il1;
import java.util.List;

/* renamed from: ml1  reason: default package */
public abstract class ml1 {

    /* renamed from: ml1$a */
    public static abstract class a {
        public abstract a a(List<gl1> list);

        public abstract a b(List<nl1> list);

        public abstract ml1 c();

        public abstract a d(List<nl1> list);

        public abstract a e(List<nl1> list);

        public abstract a f(List<ol1> list);
    }

    public static a c() {
        return new il1.b();
    }

    public abstract List<gl1> a();

    public abstract List<nl1> b();

    public abstract List<nl1> d();

    public boolean e() {
        List<gl1> a2 = a();
        return a2 != null && !a2.isEmpty();
    }

    public boolean f() {
        List<nl1> b = b();
        return b != null && !b.isEmpty();
    }

    public boolean g() {
        List<nl1> d = d();
        return d != null && !d.isEmpty();
    }

    public boolean h() {
        List<nl1> j = j();
        return j != null && !j.isEmpty();
    }

    public boolean i() {
        List<ol1> k = k();
        return k != null && !k.isEmpty();
    }

    public abstract List<nl1> j();

    public abstract List<ol1> k();
}
