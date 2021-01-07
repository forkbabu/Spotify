package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.a;

/* renamed from: bc1  reason: default package */
public class bc1 implements SpotifyServiceIntentProcessor {
    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public SpotifyServiceIntentProcessor.Result a(boolean z, Intent intent) {
        return SpotifyServiceIntentProcessor.Result.IGNORABLE;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public /* synthetic */ SpotifyServiceIntentProcessor.Result b(boolean z, Intent intent, SpotifyServiceIntentProcessor.a aVar) {
        return a.a(this, z, intent, aVar);
    }
}
