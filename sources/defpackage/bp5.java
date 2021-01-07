package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.madeforyouhub.view.MadeForYouHubFragment;

/* renamed from: bp5  reason: default package */
public final /* synthetic */ class bp5 implements flb {
    public static final /* synthetic */ bp5 a = new bp5();

    private /* synthetic */ bp5() {
    }

    @Override // defpackage.flb
    public final elb a(Intent intent, c cVar, SessionState sessionState) {
        if (l0.z(intent.getDataString()).q() == LinkType.CLUSTER_STATIONS_ROOT && cVar != null && !((Boolean) cVar.M0(em9.c)).booleanValue()) {
            return elb.a();
        }
        cVar.getClass();
        MadeForYouHubFragment madeForYouHubFragment = new MadeForYouHubFragment();
        d.a(madeForYouHubFragment, cVar);
        return elb.d(madeForYouHubFragment);
    }
}
