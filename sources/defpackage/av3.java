package defpackage;

import android.content.Intent;
import androidx.fragment.app.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;

/* renamed from: av3  reason: default package */
public class av3 implements blb {
    private final c a;
    private final bv3 b;

    public av3(c cVar, bv3 bv3) {
        this.a = cVar;
        this.b = bv3;
    }

    public /* synthetic */ elb a(Intent intent, com.spotify.android.flags.c cVar, SessionState sessionState) {
        this.b.b(this.a);
        return elb.a();
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        ((xkb) glb).k(mlb.b(LinkType.ADS_MIC_PERMISSIONS), "Request mic permission", new fkb(new qu3(this)));
    }
}
