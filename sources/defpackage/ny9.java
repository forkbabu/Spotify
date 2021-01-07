package defpackage;

import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

/* renamed from: ny9  reason: default package */
public final class ny9 implements my9 {
    private final SnackbarManager a;
    private final dy9 b;

    public ny9(SnackbarManager snackbarManager, dy9 dy9) {
        h.e(snackbarManager, "snackBarManager");
        h.e(dy9, "instrumentation");
        this.a = snackbarManager;
        this.b = dy9;
    }

    @Override // defpackage.my9
    public void a() {
        SnackbarConfiguration build = SnackbarConfiguration.builder((int) C0707R.string.google_snackbar_text).build();
        SnackbarManager snackbarManager = this.a;
        h.d(build, "configuration");
        snackbarManager.show(build);
        this.b.a();
    }
}
