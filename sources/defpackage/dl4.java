package defpackage;

import android.content.Intent;
import androidx.fragment.app.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: dl4  reason: default package */
public class dl4 implements blb {
    private final c a;
    private final zk4 b;

    public dl4(c cVar, zk4 zk4) {
        this.a = cVar;
        this.b = zk4;
    }

    public /* synthetic */ elb a(Intent intent, com.spotify.android.flags.c cVar, SessionState sessionState) {
        this.b.b(this.a);
        return elb.a();
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        ((xkb) glb).k(mlb.b(LinkType.PREMIUM_SIGNUP), "Handle premium signup routing.", new fkb(new cl4(this)));
    }
}
