package defpackage;

import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.spotify.music.features.profile.saveprofile.domain.r;
import defpackage.ll7;

/* renamed from: mm7  reason: default package */
public abstract class mm7 implements Parcelable {
    public static final mm7 a;

    /* renamed from: mm7$a */
    public static abstract class a {
        public abstract mm7 a();

        public abstract a b(boolean z);

        public abstract a c(int i);

        public abstract a d(String str);

        public abstract a e(boolean z);

        public abstract a f(boolean z);

        public abstract a g(boolean z);

        public abstract a h(String str);

        public abstract a i(String str);

        public abstract a j(boolean z);

        public abstract a k(r rVar);

        public abstract a l(boolean z);

        public abstract a m(String str);
    }

    static {
        ll7.b bVar = new ll7.b();
        bVar.m("");
        bVar.d("");
        bVar.e(false);
        bVar.j(false);
        bVar.b(false);
        bVar.g(false);
        bVar.h(null);
        bVar.f(false);
        bVar.i("");
        bVar.c(0);
        bVar.l(false);
        bVar.k(r.a);
        a = bVar.a();
    }

    public abstract boolean a();

    public boolean b() {
        return f() || h();
    }

    public abstract int c();

    public abstract String e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract String i();

    public abstract String j();

    public boolean k() {
        return !MoreObjects.isNullOrEmpty(j()) || (!MoreObjects.isNullOrEmpty(i()) && g() && !h());
    }

    public abstract boolean l();

    public abstract r m();

    public abstract boolean n();

    public abstract a o();

    public abstract String p();

    public mm7 q(boolean z) {
        a o = o();
        o.b(z);
        return o.a();
    }

    public mm7 r(boolean z) {
        a o = o();
        o.j(z);
        return o.a();
    }

    public mm7 s(boolean z) {
        a o = o();
        o.l(z);
        return o.a();
    }
}
