package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.browse.BrowseDrillDownFragment;
import com.spotify.music.features.browse.BrowseFragment;
import com.spotify.music.navigation.k;
import com.spotify.music.sociallistening.participantlist.impl.m;

/* renamed from: zb4  reason: default package */
public final /* synthetic */ class zb4 implements k {
    public static final /* synthetic */ zb4 a = new zb4();

    private /* synthetic */ zb4() {
    }

    @Override // com.spotify.music.navigation.k
    public final s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
        String B = l0Var.B();
        if (!cg4.c(B)) {
            return BrowseFragment.K4(str, sessionState.currentUser(), B, cVar);
        }
        String currentUser = sessionState.currentUser();
        BrowseDrillDownFragment browseDrillDownFragment = new BrowseDrillDownFragment();
        Bundle D2 = browseDrillDownFragment.D2();
        if (D2 == null) {
            D2 = new Bundle();
            browseDrillDownFragment.r4(D2);
        }
        D2.putString("username", currentUser);
        D2.putString("title", str);
        D2.putString("view_uri", B);
        d.a(browseDrillDownFragment, cVar);
        m.d(browseDrillDownFragment, bu9.w);
        return browseDrillDownFragment;
    }
}
