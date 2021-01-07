package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import com.spotify.mobile.android.util.t;
import com.spotify.music.features.checkout.web.i;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: tzd  reason: default package */
public class tzd {
    private final Activity a;
    private final t b;
    private final zk4 c;
    private final jz1 d;
    private final cqe e;

    public tzd(Activity activity, zk4 zk4, t tVar, jz1 jz1, cqe cqe) {
        this.a = activity;
        this.c = zk4;
        this.b = tVar;
        this.d = jz1;
        this.e = cqe;
    }

    public void a(View view) {
        this.d.a(new fa1(null, kfd.W0.getName(), ViewUris.c0.toString(), null, -1, "https://www.spotify.com/account/subscription/change/", "hit", null, (double) this.e.d()));
        i.a c2 = i.c();
        c2.d(this.b);
        c2.h(Uri.parse("https://www.spotify.com/account/subscription/change/"));
        c2.e(false);
        this.c.a(this.a, c2.a());
    }
}
