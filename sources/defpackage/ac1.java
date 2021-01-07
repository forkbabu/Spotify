package defpackage;

import android.content.Intent;
import android.view.KeyEvent;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;

/* renamed from: ac1  reason: default package */
public class ac1 implements SpotifyServiceIntentProcessor {
    private final ajf<oia> a;
    private final wha b;

    public ac1(ajf<oia> ajf, wha wha) {
        this.a = ajf;
        this.b = wha;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public SpotifyServiceIntentProcessor.Result a(boolean z, Intent intent) {
        return b(z, intent, vb1.a);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public SpotifyServiceIntentProcessor.Result b(boolean z, Intent intent, SpotifyServiceIntentProcessor.a aVar) {
        MoreObjects.checkArgument(intent.getAction() != null && intent.getAction().equals("com.spotify.mobile.android.service.action.media_button"));
        if (!z) {
            return SpotifyServiceIntentProcessor.Result.NOT_PROCESSED;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent != null) {
            this.b.b(keyEvent);
            this.a.get().a(keyEvent, new ub1(aVar));
        }
        return SpotifyServiceIntentProcessor.Result.PROCESSED;
    }
}
