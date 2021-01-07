package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.a;
import com.spotify.music.libs.audio.focus.v;

/* renamed from: e2a  reason: default package */
public class e2a implements SpotifyServiceIntentProcessor {
    private final v a;

    e2a(v vVar) {
        this.a = vVar;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public SpotifyServiceIntentProcessor.Result a(boolean z, Intent intent) {
        ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra("callback");
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("audio_session_id", this.a.g());
            resultReceiver.send(0, bundle);
        }
        return SpotifyServiceIntentProcessor.Result.IGNORABLE;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public /* synthetic */ SpotifyServiceIntentProcessor.Result b(boolean z, Intent intent, SpotifyServiceIntentProcessor.a aVar) {
        return a.a(this, z, intent, aVar);
    }
}
