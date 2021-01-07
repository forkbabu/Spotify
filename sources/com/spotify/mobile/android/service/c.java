package com.spotify.mobile.android.service;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.music.C0707R;
import java.util.List;

public final /* synthetic */ class c implements SpotifyServiceIntentProcessor.a {
    public final /* synthetic */ l2e a;

    public /* synthetic */ c(l2e l2e) {
        this.a = l2e;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a
    public final void a(List list) {
        l2e l2e = this.a;
        l2e.getClass();
        Logger.g("Hiding foreground placeholder notification, reason: %s", list);
        l2e.b(C0707R.id.notification_placeholder_fg_start);
    }
}
