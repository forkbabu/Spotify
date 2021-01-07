package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.t;
import com.spotify.music.features.checkout.web.i;
import com.spotify.music.libs.viewuri.ViewUris;
import java.lang.ref.WeakReference;

/* renamed from: ti7  reason: default package */
public class ti7 implements a71 {
    private final WeakReference<Activity> a;
    private final zk4 b;
    private final t c;
    private final q71 f;
    private final ri7 n;

    public ti7(Activity activity, zk4 zk4, t tVar, q71 q71, ri7 ri7) {
        this.a = new WeakReference<>(activity);
        this.b = zk4;
        this.c = tVar;
        this.f = q71;
        this.n = ri7;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        String string = o81.data().string("uri");
        if (string == null) {
            i.a c2 = i.c();
            c2.d(this.c);
            this.f.a(c2.a().h().toString(), n61.d(), "mismatched-intent", null);
            this.n.getClass();
            Assertion.g("The URI is null.");
        } else {
            this.f.a(string, n61.d(), null, null);
        }
        Activity activity = this.a.get();
        if (activity != null) {
            i.a c3 = i.c();
            c3.e(false);
            c3.f(ViewUris.SubView.NONE);
            c3.g("");
            c3.d(this.c);
            if (!TextUtils.isEmpty(string)) {
                c3.h(Uri.parse(string));
            }
            this.b.a(activity, c3.a());
        }
    }
}
