package defpackage;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.a;

/* access modifiers changed from: package-private */
/* renamed from: dc1  reason: default package */
public class dc1 implements SpotifyServiceIntentProcessor {
    dc1() {
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public SpotifyServiceIntentProcessor.Result a(boolean z, Intent intent) {
        Logger.g("Start service action received.", new Object[0]);
        return SpotifyServiceIntentProcessor.Result.IGNORABLE;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public /* synthetic */ SpotifyServiceIntentProcessor.Result b(boolean z, Intent intent, SpotifyServiceIntentProcessor.a aVar) {
        return a.a(this, z, intent, aVar);
    }
}
