package defpackage;

import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import io.reactivex.functions.a;

/* renamed from: xbd  reason: default package */
public final /* synthetic */ class xbd implements a {
    public final /* synthetic */ SnackbarManager a;
    public final /* synthetic */ String b;

    public /* synthetic */ xbd(SnackbarManager snackbarManager, String str) {
        this.a = snackbarManager;
        this.b = str;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        SnackbarManager snackbarManager = this.a;
        String str = this.b;
        if (snackbarManager.isAttached()) {
            snackbarManager.show(SnackbarConfiguration.builder(str).build());
        }
    }
}
