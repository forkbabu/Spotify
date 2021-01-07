package defpackage;

import android.os.Bundle;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.music.features.blendtastematch.view.g;
import com.spotify.music.navigation.t;
import com.spotify.ubi.specification.factories.a0;
import io.reactivex.w;
import kotlin.jvm.internal.h;

/* renamed from: l54  reason: default package */
public final class l54 {

    /* renamed from: l54$a */
    /* compiled from: java-style lambda group */
    static final class a implements io.reactivex.functions.a {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public a(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        @Override // io.reactivex.functions.a
        public final void run() {
            int i = this.a;
            if (i == 0) {
                ((g) this.b).z();
            } else if (i == 1) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("link_expired", true);
                ((t) this.b).f("spotify:blend:invitation", bundle);
            } else {
                throw null;
            }
        }
    }

    /* renamed from: l54$b */
    static final class b<T> implements io.reactivex.functions.g<i54> {
        final /* synthetic */ t a;

        b(t tVar) {
            this.a = tVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(i54 i54) {
            this.a.d(i54.a());
        }
    }

    /* renamed from: l54$c */
    static final class c implements io.reactivex.functions.a {
        final /* synthetic */ ere a;
        final /* synthetic */ a0 b;

        c(ere ere, a0 a0Var) {
            this.a = ere;
            this.b = a0Var;
        }

        @Override // io.reactivex.functions.a
        public final void run() {
            this.a.a(this.b.b().b().a());
        }
    }

    public static final w<s44, t44> a(com.spotify.music.features.blendtastematch.api.a aVar, g gVar, t tVar, ere ere, a0 a0Var, SnackbarManager snackbarManager) {
        h.e(aVar, "blendInvitationEndpoint");
        h.e(gVar, "viewDismisser");
        h.e(tVar, "navigator");
        h.e(ere, "eventLogger");
        h.e(a0Var, "eventFactory");
        h.e(snackbarManager, "snackbarManager");
        m f = i.f();
        f.h(x44.class, new m54(aVar));
        f.b(z44.class, new a(0, gVar));
        f.d(i54.class, new b(tVar));
        f.b(h54.class, new a(1, tVar));
        f.b(g54.class, new c(ere, a0Var));
        f.b(j54.class, new n54(snackbarManager));
        return f.i();
    }
}
