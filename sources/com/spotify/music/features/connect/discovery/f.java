package com.spotify.music.features.connect.discovery;

import android.content.Intent;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.a;

public class f implements SpotifyServiceIntentProcessor {
    private final ConnectManager a;
    private final g b;

    public f(ConnectManager connectManager, g gVar) {
        this.a = connectManager;
        this.b = gVar;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public SpotifyServiceIntentProcessor.Result a(boolean z, Intent intent) {
        this.a.stop();
        this.a.start();
        this.b.z();
        return SpotifyServiceIntentProcessor.Result.IGNORABLE;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public /* synthetic */ SpotifyServiceIntentProcessor.Result b(boolean z, Intent intent, SpotifyServiceIntentProcessor.a aVar) {
        return a.a(this, z, intent, aVar);
    }
}
