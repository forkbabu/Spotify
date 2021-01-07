package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.mobile.android.ui.contextmenu.s3;
import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.mobile.android.ui.contextmenu.z3;
import com.spotify.music.libs.podcast.download.a0;
import com.spotify.music.libs.podcast.download.d0;
import com.spotify.playlist.models.Episode;
import defpackage.l32;
import java.util.Map;

/* renamed from: j32  reason: default package */
public class j32 {
    private final a0 a;
    private final d0 b;
    private final m8a c;
    private final z3<Episode> d;

    /* access modifiers changed from: package-private */
    /* renamed from: j32$a */
    public class a implements i, k, g, d, c, b, e, f, h, j {
        private final l32.a a;
        private y3<Episode> b;
        private com.spotify.music.libs.viewuri.c c;
        private boolean d;
        private boolean e;
        private boolean f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private boolean k;
        private boolean l;
        private boolean m;
        private boolean n = true;
        private boolean o;
        private boolean p;
        private boolean q;
        private Optional<String> r = Optional.absent();
        private Optional<String> s = Optional.absent();
        private Optional<s3> t = Optional.absent();
        private Optional<o32> u = Optional.absent();
        private Optional<ifd> v = Optional.absent();

        a(l32.a aVar) {
            this.a = aVar;
        }

        @Override // defpackage.j32.k
        public g a(com.spotify.music.libs.viewuri.c cVar) {
            this.c = cVar;
            return this;
        }

        @Override // defpackage.j32.h
        public r3 b() {
            com.spotify.music.libs.viewuri.c cVar = this.c;
            cVar.getClass();
            Optional<o32> optional = this.u;
            int i2 = o32.a;
            return r3.a(this.b, j32.this.d, this.a.f(this.v.or((Optional<ifd>) kfd.w1), cVar, this.e, this.f, this.g, this.h, this.i, this.j, this.d, this.t.or((Optional<s3>) s3.a), optional.or((Optional<o32>) g32.b), this.m, this.k, this.l, this.n, this.o, this.p, this.q, this.r, this.s, j32.this.a, j32.this.b, j32.this.c));
        }

        @Override // defpackage.j32.d, defpackage.j32.c
        public b c(boolean z) {
            this.f = z;
            return this;
        }

        @Override // defpackage.j32.g
        public c d(boolean z) {
            this.e = z;
            return this;
        }

        @Override // defpackage.j32.h
        public h e(ifd ifd) {
            this.v = Optional.of(ifd);
            return this;
        }

        @Override // defpackage.j32.i
        public k f(boolean z) {
            this.d = z;
            return this;
        }

        @Override // defpackage.j32.b
        public b g(boolean z) {
            this.g = z;
            return this;
        }

        @Override // defpackage.j32.b
        public e h(boolean z) {
            this.h = z;
            return this;
        }

        @Override // defpackage.j32.h
        public h i(boolean z) {
            this.k = z;
            return this;
        }

        @Override // defpackage.j32.h
        public h j(boolean z) {
            this.p = z;
            return this;
        }

        @Override // defpackage.j32.j
        public h k(boolean z) {
            this.o = z;
            return this;
        }

        @Override // defpackage.j32.h
        public h l(boolean z) {
            this.l = z;
            return this;
        }

        @Override // defpackage.j32.h
        public h m(Optional<String> optional, Optional<String> optional2) {
            this.r = optional;
            this.s = optional2;
            return this;
        }

        @Override // defpackage.j32.h
        public h n(boolean z) {
            this.q = z;
            return this;
        }

        @Override // defpackage.j32.j
        public j o(o32 o32) {
            this.u = Optional.of(o32);
            return this;
        }

        @Override // defpackage.j32.e
        public f p(boolean z) {
            this.i = z;
            return this;
        }

        @Override // defpackage.j32.c
        public d q(boolean z) {
            this.m = z;
            return this;
        }

        @Override // defpackage.j32.h
        public h r(boolean z) {
            this.n = z;
            return this;
        }

        @Override // defpackage.j32.f
        public j s(boolean z) {
            this.j = z;
            return this;
        }

        public i t(String str, String str2, String str3, boolean z, Map<String, String> map) {
            this.b = y3.l(PageIdentifiers.CONTEXTMENU_EPISODE, str, str2, str3, z, map);
            return this;
        }
    }

    /* renamed from: j32$b */
    public interface b {
        b g(boolean z);

        e h(boolean z);
    }

    /* renamed from: j32$c */
    public interface c {
        b c(boolean z);

        d q(boolean z);
    }

    /* renamed from: j32$d */
    public interface d {
        @Override // defpackage.j32.c
        b c(boolean z);
    }

    /* renamed from: j32$e */
    public interface e {
        f p(boolean z);
    }

    /* renamed from: j32$f */
    public interface f {
        j s(boolean z);
    }

    /* renamed from: j32$g */
    public interface g {
        c d(boolean z);
    }

    /* renamed from: j32$h */
    public interface h {
        r3 b();

        h e(ifd ifd);

        h i(boolean z);

        h j(boolean z);

        h l(boolean z);

        h m(Optional<String> optional, Optional<String> optional2);

        h n(boolean z);

        h r(boolean z);
    }

    /* renamed from: j32$i */
    public interface i {
        k f(boolean z);
    }

    /* renamed from: j32$j */
    public interface j {
        h k(boolean z);

        j o(o32 o32);
    }

    /* renamed from: j32$k */
    public interface k {
        g a(com.spotify.music.libs.viewuri.c cVar);
    }

    public j32(a0 a0Var, d0 d0Var, m8a m8a, z3<Episode> z3Var) {
        this.a = a0Var;
        this.b = d0Var;
        this.c = m8a;
        this.d = z3Var;
    }
}
