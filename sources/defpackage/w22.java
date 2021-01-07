package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.mobile.android.ui.contextmenu.s3;
import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.mobile.android.ui.contextmenu.z3;
import defpackage.y22;

/* renamed from: w22  reason: default package */
public final class w22 {
    private final z3<com.spotify.playlist.models.b> a;

    /* access modifiers changed from: package-private */
    /* renamed from: w22$a */
    public static class a implements b, e, c, d {
        private final y22.a a;
        private y3<com.spotify.playlist.models.b> b;
        private com.spotify.music.libs.viewuri.c c;
        private boolean d;
        private boolean e;
        private boolean f;
        private boolean g;
        private boolean h;
        private Optional<s3> i = Optional.absent();
        private Optional<ifd> j = Optional.absent();
        private final z3<com.spotify.playlist.models.b> k;

        a(y22.a aVar, z3<com.spotify.playlist.models.b> z3Var) {
            this.a = aVar;
            this.k = z3Var;
        }

        @Override // defpackage.w22.e
        public c a(com.spotify.music.libs.viewuri.c cVar) {
            this.c = cVar;
            return this;
        }

        @Override // defpackage.w22.d
        public r3 b() {
            com.spotify.music.libs.viewuri.c cVar = this.c;
            cVar.getClass();
            return r3.a(this.b, this.k, this.a.a(this.j.or((Optional<ifd>) kfd.w1), cVar, this.d, this.e, this.f, this.g, this.h, this.i.or((Optional<s3>) s3.a)));
        }

        @Override // defpackage.w22.d
        public d c(boolean z) {
            this.g = z;
            return this;
        }

        @Override // defpackage.w22.c
        public d d(boolean z) {
            this.d = z;
            return this;
        }

        public e e(String str, String str2) {
            this.b = y3.k(PageIdentifiers.CONTEXTMENU_ARTIST, str, str2);
            return this;
        }

        @Override // defpackage.w22.d
        public d f(boolean z) {
            this.e = z;
            return this;
        }

        @Override // defpackage.w22.d
        public d g(s3 s3Var) {
            this.i = Optional.of(s3Var);
            return this;
        }

        @Override // defpackage.w22.d
        public d h(boolean z) {
            this.h = z;
            return this;
        }

        @Override // defpackage.w22.d
        public d i(boolean z) {
            this.f = z;
            return this;
        }
    }

    /* renamed from: w22$b */
    public interface b {
    }

    /* renamed from: w22$c */
    public interface c {
        d d(boolean z);
    }

    /* renamed from: w22$d */
    public interface d {
        r3 b();

        d c(boolean z);

        d f(boolean z);

        d g(s3 s3Var);

        d h(boolean z);

        d i(boolean z);
    }

    /* renamed from: w22$e */
    public interface e {
        c a(com.spotify.music.libs.viewuri.c cVar);
    }

    public w22(z3<com.spotify.playlist.models.b> z3Var) {
        this.a = z3Var;
    }

    public b a(y22.a aVar) {
        return new a(aVar, this.a);
    }
}
