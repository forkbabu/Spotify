package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.inappmessaging.j;
import com.spotify.mobile.android.util.t;
import com.spotify.music.features.checkout.web.i;

/* renamed from: c08  reason: default package */
public final /* synthetic */ class c08 implements j {
    public final /* synthetic */ t a;
    public final /* synthetic */ zk4 b;
    public final /* synthetic */ Activity c;

    public /* synthetic */ c08(t tVar, zk4 zk4, Activity activity) {
        this.a = tVar;
        this.b = zk4;
        this.c = activity;
    }

    @Override // com.spotify.inappmessaging.j
    public final void a(String str, String str2) {
        t tVar = this.a;
        zk4 zk4 = this.b;
        Activity activity = this.c;
        i.a c2 = i.c();
        c2.d(tVar);
        if (!TextUtils.isEmpty(str2)) {
            c2.h(Uri.parse(str2));
        }
        zk4.a(activity, c2.a());
    }
}
