package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.a;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

/* renamed from: yd2  reason: default package */
public final class yd2 implements SpotifyServiceIntentProcessor {
    private final l2e a;
    private final xd2 b;

    public yd2(l2e l2e, xd2 xd2) {
        h.e(l2e, "foregroundNotifier");
        h.e(xd2, "alarmHeadsUpNotificationFactory");
        this.a = l2e;
        this.b = xd2;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public SpotifyServiceIntentProcessor.Result a(boolean z, Intent intent) {
        h.e(intent, "intent");
        if (h.a(intent.getStringExtra("com.spotify.music.EXTRA_PREPARE_REASON_KEY"), "PREPARE_ALARM")) {
            this.a.e(C0707R.id.notification_placeholder_fg_start, this.b.a());
        }
        return SpotifyServiceIntentProcessor.Result.IGNORABLE;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public /* synthetic */ SpotifyServiceIntentProcessor.Result b(boolean z, Intent intent, SpotifyServiceIntentProcessor.a aVar) {
        return a.a(this, z, intent, aVar);
    }
}
