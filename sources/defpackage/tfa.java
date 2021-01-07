package defpackage;

import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

/* renamed from: tfa  reason: default package */
public final class tfa implements sfa {
    private final SnackbarManager a;

    public tfa(SnackbarManager snackbarManager) {
        h.e(snackbarManager, "snackbarManager");
        this.a = snackbarManager;
    }

    @Override // defpackage.sfa
    public void a() {
        SnackbarConfiguration build = SnackbarConfiguration.builder((int) C0707R.string.track_preview_tier_upsell_message).build();
        SnackbarManager snackbarManager = this.a;
        h.d(build, "configuration");
        snackbarManager.show(build);
    }
}
