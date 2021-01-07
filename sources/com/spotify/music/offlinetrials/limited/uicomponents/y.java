package com.spotify.music.offlinetrials.limited.uicomponents;

import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.offlinetrials.limited.logging.OfflineUserMixImpressionLogger;
import com.spotify.music.offlinetrials.limited.logging.a;

public class y {
    private final SnackbarManager a;
    private final OfflineUserMixImpressionLogger b;

    public y(SnackbarManager snackbarManager, a aVar) {
        this.a = snackbarManager;
        this.b = aVar.a(ViewUris.b0, PageIdentifiers.OFFLINE_MIX_ENTITY);
    }

    public void a() {
        je.e(C0707R.string.user_mix_preview_not_available_offline, this.a);
    }

    public void b() {
        je.e(C0707R.string.user_mix_track_marked_for_download, this.a);
        this.b.e();
    }

    public void c() {
        je.e(C0707R.string.user_mix_track_marked_for_undownload, this.a);
        this.b.f();
    }
}
