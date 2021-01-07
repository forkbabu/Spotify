package defpackage;

import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import kotlin.jvm.internal.h;

/* renamed from: pbb  reason: default package */
public final class pbb implements obb {
    private final SnackbarManager a;

    public pbb(SnackbarManager snackbarManager) {
        h.e(snackbarManager, "snackbarManager");
        this.a = snackbarManager;
    }

    @Override // defpackage.obb
    public void a(SnackbarConfiguration snackbarConfiguration) {
        h.e(snackbarConfiguration, "config");
        this.a.show(snackbarConfiguration);
    }
}
