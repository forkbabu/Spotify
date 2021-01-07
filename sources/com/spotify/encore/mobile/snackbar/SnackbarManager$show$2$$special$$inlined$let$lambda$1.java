package com.spotify.encore.mobile.snackbar;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public final class SnackbarManager$show$2$$special$$inlined$let$lambda$1 extends BaseTransientBottomBar.h<Snackbar> {
    final /* synthetic */ Snackbar $snackBar;
    final /* synthetic */ SnackbarManager$show$2 this$0;

    SnackbarManager$show$2$$special$$inlined$let$lambda$1(Snackbar snackbar, SnackbarManager$show$2 snackbarManager$show$2) {
        this.$snackBar = snackbar;
        this.this$0 = snackbarManager$show$2;
    }

    public void onDismissed(Snackbar snackbar, int i) {
        for (SnackBarListener snackBarListener : this.this$0.this$0.listeners) {
            snackBarListener.onDismissed(this.$snackBar);
        }
        Snackbar snackbar2 = this.this$0.this$0.currentSnackBar;
        if (snackbar2 != null) {
            snackbar2.x(this);
        }
    }

    public void onShown(Snackbar snackbar) {
        for (SnackBarListener snackBarListener : this.this$0.this$0.listeners) {
            snackBarListener.onShown(this.$snackBar);
        }
    }
}
