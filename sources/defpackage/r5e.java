package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.common.base.Optional;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import com.spotify.share.sharedata.p;
import com.spotify.share.sharedata.t;
import com.spotify.share.util.c;
import com.spotify.share.util.g;
import com.spotify.share.util.o;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* renamed from: r5e  reason: default package */
public final class r5e implements i6e {
    private final o a;
    private final c b;
    private final g c;
    private final Optional<g6e> d;
    private final SnackbarManager e;
    private final Optional<tg0<View>> f;

    public r5e(o oVar, c cVar, g gVar, Optional<g6e> optional, SnackbarManager snackbarManager, Optional<tg0<View>> optional2) {
        h.e(oVar, "shareFileProvider");
        h.e(cVar, "bitmapToFileConverter");
        h.e(gVar, "downloadNotificationManager");
        h.e(optional, "permissionManager");
        h.e(snackbarManager, "snackbarManager");
        h.e(optional2, "snackbarViewProducer");
        this.a = oVar;
        this.b = cVar;
        this.c = gVar;
        this.d = optional;
        this.e = snackbarManager;
        this.f = optional2;
    }

    public static final void g(r5e r5e) {
        V v;
        r5e.getClass();
        try {
            v = r5e.f.transform(q5e.a).orNull();
        } catch (Exception unused) {
            v = null;
        }
        if (v != null) {
            SnackbarManager snackbarManager = r5e.e;
            SnackbarConfiguration build = SnackbarConfiguration.builder((int) C0707R.string.toast_download).build();
            h.d(build, "SnackbarConfiguration.bu…g.toast_download).build()");
            snackbarManager.showInView(build, v);
            return;
        }
        SnackbarManager snackbarManager2 = r5e.e;
        SnackbarConfiguration build2 = SnackbarConfiguration.builder((int) C0707R.string.toast_download).build();
        h.d(build2, "SnackbarConfiguration.bu…g.toast_download).build()");
        snackbarManager2.show(build2);
    }

    @Override // defpackage.i6e
    public /* synthetic */ Exception a(Context context, o8e o8e) {
        return h6e.a(this, context, o8e);
    }

    @Override // defpackage.i6e
    public boolean b(t tVar) {
        h.e(tVar, "shareData");
        return tVar instanceof p;
    }

    @Override // defpackage.i6e
    public z<String> c(Activity activity, o8e o8e, t tVar, z7e z7e, d8e d8e, long j) {
        z<String> zVar;
        h.e(activity, "activity");
        h.e(o8e, "shareDestination");
        h.e(tVar, "shareData");
        h.e(z7e, "legacyShareEventEmitter");
        h.e(d8e, "shareEventEmitter");
        if (!this.d.isPresent()) {
            z<String> q = z.q(a(activity, o8e));
            h.d(q, "Single.error(getGeneralE…ivity, shareDestination))");
            return q;
        }
        if (b(tVar)) {
            zVar = this.d.get().e2("android.permission.WRITE_EXTERNAL_STORAGE").r(n5e.a).h(new p5e(this, activity, tVar)).P("");
        } else {
            zVar = z.q(a(activity, o8e));
        }
        h.d(zVar, "if (isShareDataSupported…reDestination))\n        }");
        return zVar;
    }
}
