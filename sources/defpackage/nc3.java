package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.mobile.android.util.o0;
import com.spotify.music.C0707R;

/* renamed from: nc3  reason: default package */
public class nc3 implements blb {
    private final o0 a;

    public nc3(o0 o0Var) {
        this.a = o0Var;
    }

    public /* synthetic */ elb a(Intent intent, c cVar, SessionState sessionState) {
        l0 z = l0.z(intent.getDataString());
        if (z.q() == LinkType.UPSELL) {
            this.a.c(C0707R.string.toast_feature_premium_discovered, new Object[0]);
        } else if (z.q() == LinkType.START_TRIAL_UPSELL) {
            this.a.c(C0707R.string.trial_started_message, new Object[0]);
        }
        return elb.a();
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        mc3 mc3 = new mc3(this);
        ((xkb) glb).k(mlb.b(LinkType.UPSELL), "Handle upsell uri routing", new fkb(mc3));
        ((xkb) glb).k(mlb.b(LinkType.START_TRIAL_UPSELL), "Handle start trial upsell uri routing", new fkb(mc3));
    }
}
