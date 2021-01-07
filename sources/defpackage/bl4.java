package defpackage;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.c;
import com.spotify.mobile.android.service.session.SessionState;

/* renamed from: bl4  reason: default package */
public class bl4 implements blb {
    private final c a;
    private final zk4 b;
    private final gha c;

    public bl4(c cVar, zk4 zk4, gha gha) {
        this.a = cVar;
        this.b = zk4;
        this.c = gha;
    }

    public static elb a(bl4 bl4, Intent intent, com.spotify.android.flags.c cVar, SessionState sessionState) {
        bl4.getClass();
        Uri data = intent.getData();
        data.getClass();
        bl4.b.c(bl4.a, data);
        return ((sf5) bl4.c).c(intent, cVar, sessionState);
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        ((xkb) glb).f(jlb.b("https://www.spotify.com/redirect/get-premium/"), "get Premium routine", new yk4(this));
    }
}
