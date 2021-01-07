package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.contextmenu.d4;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.mobile.android.ui.contextmenu.s3;
import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.mobile.android.ui.contextmenu.z3;
import com.spotify.playlist.models.o;
import defpackage.f42;
import java.util.Map;

/* renamed from: d42  reason: default package */
public class d42 {
    private final z3<o> a;

    /* access modifiers changed from: package-private */
    /* renamed from: d42$a */
    public static class a implements g, b, h, c, e, d, f {
        private boolean A;
        private final f42.a a;
        private y3<o> b;
        private com.spotify.music.libs.viewuri.c c;
        private boolean d;
        private boolean e;
        private boolean f;
        private boolean g;
        private Optional<String> h = Optional.absent();
        private Optional<s3> i = Optional.absent();
        private Optional<ifd> j = Optional.absent();
        private boolean k;
        private boolean l;
        private boolean m;
        private Optional<String> n = Optional.absent();
        private boolean o;
        private boolean p;
        private boolean q;
        private boolean r;
        private boolean s;
        private boolean t;
        private Optional<qzc> u = Optional.absent();
        private Optional<d4> v = Optional.absent();
        private Optional<d4> w = Optional.absent();
        private boolean x;
        private final z3<o> y;
        private boolean z;

        a(f42.a aVar, z3<o> z3Var) {
            this.a = aVar;
            this.y = z3Var;
        }

        @Override // defpackage.d42.h
        public b a(com.spotify.music.libs.viewuri.c cVar) {
            this.c = cVar;
            return this;
        }

        @Override // defpackage.d42.f
        public r3 b() {
            com.spotify.music.libs.viewuri.c cVar = this.c;
            cVar.getClass();
            return r3.a(this.b, this.y, this.a.b(this.j.or((Optional<ifd>) kfd.w1), cVar, this.d, this.e, this.f, this.g, this.o, this.A, this.h, this.k, this.i.or((Optional<s3>) s3.a), this.n, this.l, this.m, this.p, this.q, this.r, this.s, this.v, this.w, this.x, this.t, this.u, this.z));
        }

        @Override // defpackage.d42.f
        public f c(boolean z2) {
            this.q = z2;
            return this;
        }

        @Override // defpackage.d42.d
        public f d(boolean z2, String str) {
            this.g = z2;
            this.n = str == null ? Optional.absent() : Optional.of(str);
            return this;
        }

        @Override // defpackage.d42.f
        public f e(ifd ifd) {
            this.j = Optional.of(ifd);
            return this;
        }

        @Override // defpackage.d42.f
        public f f(boolean z2) {
            this.p = z2;
            return this;
        }

        @Override // defpackage.d42.c
        public e g(boolean z2) {
            this.e = z2;
            return this;
        }

        @Override // defpackage.d42.f
        public f h(boolean z2) {
            this.r = z2;
            return this;
        }

        @Override // defpackage.d42.f
        public f i(boolean z2) {
            this.l = z2;
            return this;
        }

        @Override // defpackage.d42.f
        public f j(boolean z2) {
            this.k = z2;
            return this;
        }

        @Override // defpackage.d42.f
        public f k(boolean z2) {
            this.t = z2;
            return this;
        }

        @Override // defpackage.d42.f
        public f l(boolean z2) {
            this.m = z2;
            return this;
        }

        @Override // defpackage.d42.f
        public f m(boolean z2) {
            this.A = z2;
            return this;
        }

        @Override // defpackage.d42.f
        public f n(boolean z2) {
            this.z = z2;
            return this;
        }

        @Override // defpackage.d42.f
        public f o(qzc qzc) {
            this.u = Optional.of(qzc);
            return this;
        }

        @Override // defpackage.d42.f
        public f p(boolean z2) {
            this.s = z2;
            return this;
        }

        @Override // defpackage.d42.f
        public f q(boolean z2) {
            this.o = z2;
            return this;
        }

        @Override // defpackage.d42.e
        public d r(boolean z2) {
            this.f = z2;
            return this;
        }

        @Override // defpackage.d42.f
        public f s(d4 d4Var) {
            this.w = Optional.of(d4Var);
            return this;
        }

        @Override // defpackage.d42.b
        public c t(boolean z2) {
            this.d = z2;
            return this;
        }

        @Override // defpackage.d42.f
        public f u(String str) {
            this.h = Optional.of(str);
            return this;
        }

        @Override // defpackage.d42.f
        public f v(boolean z2) {
            this.x = z2;
            return this;
        }

        @Override // defpackage.d42.d
        public f w(boolean z2) {
            d(z2, null);
            return this;
        }

        @Override // defpackage.d42.f
        public f x(d4 d4Var) {
            this.v = Optional.of(d4Var);
            return this;
        }

        public h y(String str, String str2, String str3, boolean z2, Map<String, String> map) {
            this.b = y3.l(PageIdentifiers.CONTEXTMENU_TRACK, str, str2, str3, z2, map);
            return this;
        }
    }

    /* renamed from: d42$b */
    public interface b {
        c t(boolean z);
    }

    /* renamed from: d42$c */
    public interface c {
        e g(boolean z);
    }

    /* renamed from: d42$d */
    public interface d {
        f d(boolean z, String str);

        f w(boolean z);
    }

    /* renamed from: d42$e */
    public interface e {
        d r(boolean z);
    }

    /* renamed from: d42$f */
    public interface f {
        r3 b();

        f c(boolean z);

        f e(ifd ifd);

        f f(boolean z);

        f h(boolean z);

        f i(boolean z);

        f j(boolean z);

        f k(boolean z);

        f l(boolean z);

        f m(boolean z);

        f n(boolean z);

        f o(qzc qzc);

        f p(boolean z);

        f q(boolean z);

        f s(d4 d4Var);

        f u(String str);

        f v(boolean z);

        f x(d4 d4Var);
    }

    /* renamed from: d42$g */
    public interface g {
    }

    /* renamed from: d42$h */
    public interface h {
        b a(com.spotify.music.libs.viewuri.c cVar);
    }

    public d42(z3<o> z3Var) {
        this.a = z3Var;
    }

    public g a(f42.a aVar) {
        return new a(aVar, this.a);
    }
}
