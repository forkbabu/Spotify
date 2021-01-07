package defpackage;

import com.spotify.pageloader.o0;
import kotlin.jvm.internal.h;

/* renamed from: rac  reason: default package */
public final class rac implements qac {
    private final zac a;

    /* renamed from: rac$a */
    public static final class a implements dtd {
        private final pac<T> a;
        final /* synthetic */ rac b;
        final /* synthetic */ psd c;
        final /* synthetic */ nac d;
        final /* synthetic */ o0 e;

        a(rac rac, psd psd, nac nac, o0 o0Var) {
            this.b = rac;
            this.c = psd;
            this.d = nac;
            this.e = o0Var;
            this.a = new pac<>(rac.a, o0Var);
        }

        @Override // defpackage.dtd
        public ctd a() {
            return this.a;
        }

        @Override // defpackage.dtd
        public btd b() {
            return new oac(this.b.a, this.c, this.a.a(), this.d);
        }
    }

    public rac(zac zac) {
        h.e(zac, "pageLoaderFactory");
        this.a = zac;
    }

    @Override // defpackage.qac
    public <T> dtd a(psd psd, o0<T> o0Var, nac<T> nac) {
        h.e(psd, "page");
        h.e(o0Var, "loadable");
        h.e(nac, "config");
        return new a(this, psd, nac, o0Var);
    }
}
