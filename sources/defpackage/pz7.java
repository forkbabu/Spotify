package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.spotify.inappmessaging.j;

/* renamed from: pz7  reason: default package */
public final /* synthetic */ class pz7 implements j {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ d28 b;

    public /* synthetic */ pz7(Activity activity, d28 d28) {
        this.a = activity;
        this.b = d28;
    }

    @Override // com.spotify.inappmessaging.j
    public final void a(String str, String str2) {
        Activity activity = this.a;
        d28 d28 = this.b;
        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
        d28.i(str, str2);
    }
}
