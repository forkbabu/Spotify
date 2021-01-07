package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.yourlibrary.container.YourLibraryFragment;
import com.spotify.music.libs.podcast.download.f0;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: q09  reason: default package */
public final /* synthetic */ class q09 implements flb {
    public static final /* synthetic */ q09 a = new q09();

    private /* synthetic */ q09() {
    }

    @Override // defpackage.flb
    public final elb a(Intent intent, c cVar, SessionState sessionState) {
        l0 z = l0.z(ViewUris.v1.toString());
        if (f0.b(cVar)) {
            return elb.d(YourLibraryFragment.K4(cVar, sessionState.currentUser(), z));
        }
        return elb.a();
    }
}
