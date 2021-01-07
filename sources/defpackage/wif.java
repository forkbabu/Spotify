package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.spotify.loginflow.t;
import com.spotify.magiclink.r;

/* access modifiers changed from: package-private */
/* renamed from: wif  reason: default package */
public final class wif implements r {
    final /* synthetic */ t a;

    wif(t tVar) {
        this.a = tVar;
    }

    @Override // com.spotify.magiclink.r
    public void a(Activity activity) {
        Intent a2 = this.a.a(activity);
        a2.addFlags(268468224);
        activity.startActivity(a2);
    }

    @Override // com.spotify.magiclink.r
    public void b(Activity activity, String str, boolean z) {
        Intent b = this.a.b(activity, str, z);
        b.setFlags(268435456);
        activity.startActivity(b);
    }
}
