package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.mobile.android.ui.contextmenu.s3;
import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.mobile.android.ui.contextmenu.z3;
import defpackage.p22;

/* renamed from: n22  reason: default package */
public class n22 {
    private final z3<com.spotify.music.libs.collection.model.a> a;

    /* access modifiers changed from: package-private */
    /* renamed from: n22$a */
    public class a implements f, b, d, c, e {
        private final p22.a a;
        private y3<com.spotify.music.libs.collection.model.a> b;
        private com.spotify.music.libs.viewuri.c c;
        private boolean d;
        private boolean e;
        private boolean f;
        private Optional<s3> g = Optional.absent();
        private Optional<ifd> h = Optional.absent();

        a(p22.a aVar) {
            this.a = aVar;
        }

        @Override // defpackage.n22.f
        public b a(com.spotify.music.libs.viewuri.c cVar) {
            this.c = cVar;
            return this;
        }

        @Override // defpackage.n22.e
        public r3 b() {
            com.spotify.music.libs.viewuri.c cVar = this.c;
            cVar.getClass();
            return r3.a(this.b, n22.this.a, this.a.d(this.h.or((Optional<ifd>) kfd.w1), cVar, this.d, this.e, this.f, this.g.or((Optional<s3>) s3.a)));
        }

        @Override // defpackage.n22.d
        public c c(boolean z) {
            this.e = z;
            return this;
        }

        @Override // defpackage.n22.c
        public e d(boolean z) {
            this.f = z;
            return this;
        }

        @Override // defpackage.n22.e
        public e e(ifd ifd) {
            this.h = Optional.of(ifd);
            return this;
        }

        public f f(String str, String str2) {
            this.b = y3.k(PageIdentifiers.CONTEXTMENU_ALBUM, str, str2);
            return this;
        }

        @Override // defpackage.n22.b
        public d g(boolean z) {
            this.d = z;
            return this;
        }
    }

    /* renamed from: n22$b */
    public interface b {
        d g(boolean z);
    }

    /* renamed from: n22$c */
    public interface c {
        e d(boolean z);
    }

    /* renamed from: n22$d */
    public interface d {
        c c(boolean z);
    }

    /* renamed from: n22$e */
    public interface e {
        r3 b();

        e e(ifd ifd);
    }

    /* renamed from: n22$f */
    public interface f {
        b a(com.spotify.music.libs.viewuri.c cVar);
    }

    public n22(z3<com.spotify.music.libs.collection.model.a> z3Var) {
        this.a = z3Var;
    }
}
