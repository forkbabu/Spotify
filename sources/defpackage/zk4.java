package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.spotify.mobile.android.util.t;
import com.spotify.music.features.checkout.web.PremiumSignupActivity;
import com.spotify.music.features.checkout.web.i;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: zk4  reason: default package */
public class zk4 {
    private final t a;

    public zk4(t tVar) {
        this.a = tVar;
    }

    public void a(Activity activity, i iVar) {
        activity.startActivity(PremiumSignupActivity.U0(activity, iVar));
    }

    @Deprecated
    public void b(Context context) {
        i.a c = i.c();
        c.d(this.a);
        a((Activity) context, c.a());
    }

    @Deprecated
    public void c(Context context, Uri uri) {
        i.a c = i.c();
        c.d(this.a);
        c.h(uri);
        a((Activity) context, c.a());
    }

    @Deprecated
    public void d(Context context, Uri uri, ViewUris.SubView subView) {
        i.a c = i.c();
        c.d(this.a);
        c.h(uri);
        c.f(subView);
        a((Activity) context, c.a());
    }
}
