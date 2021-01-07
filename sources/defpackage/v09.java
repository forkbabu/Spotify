package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.yourlibrary.container.YourLibraryFragment;

/* renamed from: v09  reason: default package */
public final /* synthetic */ class v09 implements flb {
    public static final /* synthetic */ v09 a = new v09();

    private /* synthetic */ v09() {
    }

    @Override // defpackage.flb
    public final elb a(Intent intent, c cVar, SessionState sessionState) {
        return elb.d(YourLibraryFragment.K4(cVar, sessionState.currentUser(), l0.z(intent.getDataString())));
    }
}
