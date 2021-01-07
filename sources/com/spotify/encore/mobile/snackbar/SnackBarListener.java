package com.spotify.encore.mobile.snackbar;

import com.google.android.material.snackbar.Snackbar;

public interface SnackBarListener {
    void onDismissed(Snackbar snackbar);

    void onShown(Snackbar snackbar);
}
