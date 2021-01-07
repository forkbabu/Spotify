package defpackage;

import android.app.Activity;
import android.net.Uri;

/* renamed from: co4  reason: default package */
public class co4 {
    private final i80 a;

    public co4(i80 i80) {
        this.a = i80;
    }

    public void a(Activity activity, String str) {
        this.a.c(activity, Uri.parse(str));
    }

    public void b(Activity activity) {
        this.a.c(activity, Uri.parse("https://www.spotify.com/connect/?utm_source=spotify&utm_medium=android_app&utm_campaign=connect_devicemenu_helpicon"));
    }
}
