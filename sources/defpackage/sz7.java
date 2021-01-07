package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.spotify.inappmessaging.j;
import com.spotify.music.features.quicksilver.v2.inappinternalwebview.InAppInternalWebviewActivity;

/* renamed from: sz7  reason: default package */
public final /* synthetic */ class sz7 implements j {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ d28 b;

    public /* synthetic */ sz7(Activity activity, d28 d28) {
        this.a = activity;
        this.b = d28;
    }

    @Override // com.spotify.inappmessaging.j
    public final void a(String str, String str2) {
        Activity activity = this.a;
        d28 d28 = this.b;
        int i = InAppInternalWebviewActivity.G;
        Intent intent = new Intent(activity, InAppInternalWebviewActivity.class);
        intent.putExtra("inapp_internalwebview_uri", str2);
        activity.startActivity(intent);
        d28.k(str, str2);
    }
}
