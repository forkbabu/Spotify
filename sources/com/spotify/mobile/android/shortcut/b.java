package com.spotify.mobile.android.shortcut;

import com.spotify.encore.mobile.snackbar.SnackbarManager;

public final class b {
    public static void a(ShortcutInstallerService shortcutInstallerService, a aVar) {
        shortcutInstallerService.a = aVar;
    }

    public static void b(ShortcutPinnedReceiver shortcutPinnedReceiver, SnackbarManager snackbarManager) {
        shortcutPinnedReceiver.a = snackbarManager;
    }
}
