package defpackage;

import android.content.Intent;
import android.os.Process;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.a;

/* access modifiers changed from: package-private */
/* renamed from: yb1  reason: default package */
public class yb1 implements SpotifyServiceIntentProcessor {
    yb1() {
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public SpotifyServiceIntentProcessor.Result a(boolean z, Intent intent) {
        Process.killProcess(Process.myPid());
        return SpotifyServiceIntentProcessor.Result.IGNORABLE;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public /* synthetic */ SpotifyServiceIntentProcessor.Result b(boolean z, Intent intent, SpotifyServiceIntentProcessor.a aVar) {
        return a.a(this, z, intent, aVar);
    }
}
