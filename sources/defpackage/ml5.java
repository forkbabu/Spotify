package defpackage;

import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.music.libs.performance.tracking.h0;
import com.spotify.music.libs.performance.tracking.i0;
import com.spotify.music.libs.viewuri.c;
import io.reactivex.s;
import io.reactivex.v;

/* renamed from: ml5  reason: default package */
public class ml5 extends i0<b91> {
    ml5(k kVar, h0 h0Var, c cVar, ij9 ij9) {
        super(kVar, h0Var, cVar, ij9);
    }

    public static void p(ml5 ml5, b91 b91) {
        ml5.getClass();
        if (qf5.e(b91) || qf5.g(b91)) {
            ml5.h();
        }
        if (ej5.b(b91.custom(), b91.body())) {
            ml5.l(ViewLoadingTracker.DataSource.CACHE);
        } else if (b91.custom().boolValue("remote", false)) {
            ml5.l(ViewLoadingTracker.DataSource.REMOTE);
        }
    }

    @Override // io.reactivex.w
    public v apply(s sVar) {
        return super.g(sVar.N(new cl5(this)).L(new bl5(this)));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // com.spotify.music.libs.performance.tracking.i0
    public boolean i(b91 b91) {
        b91 b912 = b91;
        if (!HubsImmutableViewModel.EMPTY.equals(b912)) {
            int i = t71.c;
            if (!"hubs/placeholder".equals(b912.id())) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ void o(Throwable th) {
        h();
    }
}
