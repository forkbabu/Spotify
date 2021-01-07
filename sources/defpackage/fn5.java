package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import defpackage.f61;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.j;

/* renamed from: fn5  reason: default package */
public final class fn5 implements hn5 {
    private static final String e = (((d) j.b(hn5.class)).h() + ".STATE");
    private static final y51 f = new y51();
    private Parcelable a;
    private final b61 b;
    private final e61 c;
    private final SnackbarManager d;

    public fn5(b61 b61, e61 e61, SnackbarManager snackbarManager) {
        h.e(b61, "hubsPresenter");
        h.e(e61, "hubsViewBinder");
        h.e(snackbarManager, "snackBarManager");
        this.b = b61;
        this.c = e61;
        this.d = snackbarManager;
    }

    @Override // defpackage.hn5
    public void a() {
        SnackbarManager snackbarManager = this.d;
        SnackbarConfiguration build = SnackbarConfiguration.builder((int) C0707R.string.error_general_title).build();
        h.d(build, "SnackbarConfiguration.builder(message).build()");
        snackbarManager.show(build);
    }

    @Override // defpackage.hn5
    public View b(Context context, ViewGroup viewGroup) {
        h.e(context, "context");
        View b2 = this.c.b();
        h.d(b2, "hubsViewBinder.rootView");
        return b2;
    }

    @Override // defpackage.hn5
    public void c(b91 b91, boolean z) {
        h.e(b91, "viewModel");
        f61.b bVar = new f61.b(b91);
        bVar.c(f);
        bVar.b(z);
        this.b.l(bVar.a());
        this.b.i(this.a);
    }

    @Override // defpackage.hn5
    public void d(Bundle bundle) {
        this.a = bundle.getParcelable(e);
    }

    @Override // defpackage.hn5
    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(e, this.b.j());
        return bundle;
    }
}
