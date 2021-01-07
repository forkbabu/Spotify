package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.spotify.inappmessaging.j;
import com.spotify.music.features.notificationsettings.combined.NotificationPreferenceUpdateService;

/* renamed from: xz7  reason: default package */
public final /* synthetic */ class xz7 implements j {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ d28 b;

    public /* synthetic */ xz7(Activity activity, d28 d28) {
        this.a = activity;
        this.b = d28;
    }

    @Override // com.spotify.inappmessaging.j
    public final void a(String str, String str2) {
        Activity activity = this.a;
        d28 d28 = this.b;
        int i = NotificationPreferenceUpdateService.o;
        Intent intent = new Intent(activity, NotificationPreferenceUpdateService.class);
        intent.setAction(str2);
        activity.startService(intent);
        d28.a(str, str2);
    }
}
