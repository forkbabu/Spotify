package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.yourlibrary.container.YourLibraryFragment;
import com.spotify.music.libs.podcast.download.f0;

/* renamed from: s09  reason: default package */
public final /* synthetic */ class s09 implements flb {
    public static final /* synthetic */ s09 a = new s09();

    private /* synthetic */ s09() {
    }

    @Override // defpackage.flb
    public final elb a(Intent intent, c cVar, SessionState sessionState) {
        l0 z = l0.z(intent.getDataString());
        if (f0.b(cVar)) {
            return elb.d(YourLibraryFragment.K4(cVar, sessionState.currentUser(), z));
        }
        return elb.a();
    }
}
