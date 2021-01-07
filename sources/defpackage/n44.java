package defpackage;

import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import io.reactivex.functions.a;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: n44  reason: default package */
public final class n44 implements a {
    final /* synthetic */ SnackbarManager a;

    n44(SnackbarManager snackbarManager) {
        this.a = snackbarManager;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        SnackbarConfiguration build = SnackbarConfiguration.builder((int) C0707R.string.invitation_error).build();
        SnackbarManager snackbarManager = this.a;
        h.d(build, "snackbarConfiguration");
        snackbarManager.show(build);
    }
}
