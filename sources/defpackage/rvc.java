package defpackage;

import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import kotlin.jvm.internal.h;

/* renamed from: rvc  reason: default package */
public final class rvc {
    private final SnackbarManager a;

    public rvc(SnackbarManager snackbarManager) {
        h.e(snackbarManager, "snackbarManager");
        this.a = snackbarManager;
    }

    public final void a(int i) {
        SnackbarConfiguration build = SnackbarConfiguration.builder(i).build();
        SnackbarManager snackbarManager = this.a;
        h.d(build, "snackbarConfiguration");
        snackbarManager.show(build);
    }
}
