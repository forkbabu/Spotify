package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.spotify.inappmessaging.j;
import com.spotify.music.features.quicksilver.utils.QuicksilverPlaybackService;
import com.spotify.player.model.ContextTrack;

/* renamed from: tz7  reason: default package */
public final /* synthetic */ class tz7 implements j {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ d28 b;

    public /* synthetic */ tz7(Activity activity, d28 d28) {
        this.a = activity;
        this.b = d28;
    }

    @Override // com.spotify.inappmessaging.j
    public final void a(String str, String str2) {
        Activity activity = this.a;
        d28 d28 = this.b;
        int i = QuicksilverPlaybackService.c;
        Intent intent = new Intent(activity, QuicksilverPlaybackService.class);
        intent.putExtra(ContextTrack.Metadata.KEY_ENTITY_URI, str2);
        activity.startService(intent);
        d28.g(str, str2);
    }
}
