package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.android.goldenpath.GoldenPathTutorialStep01Fragment;
import com.spotify.android.goldenpath.GoldenPathTutorialStep02Fragment;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.navigation.k;
import com.spotify.music.toptracks.TopTrackByCountryFragment;

/* renamed from: hgb  reason: default package */
public final /* synthetic */ class hgb implements k {
    public static final /* synthetic */ hgb a = new hgb();

    private /* synthetic */ hgb() {
    }

    @Override // com.spotify.music.navigation.k
    public final s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
        String B = l0Var.B();
        B.getClass();
        if (B.endsWith("goldenpathtutorialstep01")) {
            return new GoldenPathTutorialStep01Fragment();
        }
        if (B.endsWith("goldenpathtutorialstep02")) {
            return new GoldenPathTutorialStep02Fragment();
        }
        if (B.endsWith("toptracks")) {
            return new TopTrackByCountryFragment();
        }
        throw new RuntimeException(je.x0("Fragment for Golden Path URI not resolved: ", B));
    }
}
