package com.spotify.encore.mobile.snackbar;

import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import com.spotify.mobile.android.util.Assertion;

/* access modifiers changed from: package-private */
public final class SnackbarManager$show$2 implements Runnable {
    final /* synthetic */ nmf $findViewById;
    final /* synthetic */ SnackbarConfiguration $snackbarConfiguration;
    final /* synthetic */ SnackbarManager this$0;

    SnackbarManager$show$2(SnackbarManager snackbarManager, nmf nmf, SnackbarConfiguration snackbarConfiguration) {
        this.this$0 = snackbarManager;
        this.$findViewById = nmf;
        this.$snackbarConfiguration = snackbarConfiguration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.this$0.findSnackbarContainerView(this.$findViewById);
        if (view != null) {
            SnackbarManager snackbarManager = this.this$0;
            Snackbar snackbar = snackbarManager.buildSnackbar(this.$snackbarConfiguration, view);
            snackbar.H();
            snackbarManager.currentSnackBar = snackbar;
            Snackbar snackbar2 = this.this$0.currentSnackBar;
            if (snackbar2 != null) {
                snackbar2.n(new SnackbarManager$show$2$$special$$inlined$let$lambda$1(snackbar2, this));
                return;
            }
            return;
        }
        Assertion.g("There is no CoordinatorLayout with id `content`/`snackbarContainer` in the view hierarchy");
    }
}
