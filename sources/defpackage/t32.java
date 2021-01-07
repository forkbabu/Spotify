package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.mobile.android.ui.contextmenu.s3;
import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.mobile.android.ui.contextmenu.z3;
import com.spotify.playlist.models.Show;
import defpackage.v32;

/* renamed from: t32  reason: default package */
public class t32 {
    private final z3<Show> a;

    /* access modifiers changed from: package-private */
    /* renamed from: t32$a */
    public static class a implements c, d, b {
        private final v32.a a;
        private final z3<Show> b;
        private y3<Show> c;
        private com.spotify.music.libs.viewuri.c d;
        private boolean e = true;
        private Optional<s3> f = Optional.absent();
        private Optional<ifd> g = Optional.absent();
        private boolean h;

        a(v32.a aVar, z3<Show> z3Var) {
            this.a = aVar;
            this.b = z3Var;
        }

        @Override // defpackage.t32.d
        public b a(com.spotify.music.libs.viewuri.c cVar) {
            this.d = cVar;
            return this;
        }

        @Override // defpackage.t32.b
        public r3 b() {
            com.spotify.music.libs.viewuri.c cVar = this.d;
            cVar.getClass();
            return r3.a(this.c, this.b, this.a.c(this.g.or((Optional<ifd>) kfd.w1), cVar, this.e, this.f.or((Optional<s3>) s3.a), this.h));
        }

        @Override // defpackage.t32.b
        public b c(boolean z) {
            this.h = z;
            return this;
        }

        @Override // defpackage.t32.b
        public b d(boolean z) {
            this.e = z;
            return this;
        }

        public d e(String str, String str2) {
            this.c = y3.k(PageIdentifiers.CONTEXTMENU_SHOW, str, str2);
            return this;
        }

        @Override // defpackage.t32.b
        public b g(s3 s3Var) {
            this.f = Optional.of(s3Var);
            return this;
        }
    }

    /* renamed from: t32$b */
    public interface b {
        r3 b();

        b c(boolean z);

        b d(boolean z);

        b g(s3 s3Var);
    }

    /* renamed from: t32$c */
    public interface c {
    }

    /* renamed from: t32$d */
    public interface d {
        b a(com.spotify.music.libs.viewuri.c cVar);
    }

    public t32(z3<Show> z3Var) {
        this.a = z3Var;
    }

    public c a(v32.a aVar) {
        return new a(aVar, this.a);
    }
}
