package com.spotify.mobile.android.shortcut;

import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import dagger.android.a;
import dagger.android.d;

public class ShortcutPinnedReceiver extends d {
    public static final /* synthetic */ int b = 0;
    SnackbarManager a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Logger.g("onReceive: %s", intent);
        a.c(this, context);
        if ("com.spotify.mobile.android.shortcut.SHORTCUT_PINNED".equals(intent.getAction())) {
            this.a.showOnNextAttach(SnackbarConfiguration.builder((int) C0707R.string.snackbar_added_to_home_screen).build());
        }
    }
}
