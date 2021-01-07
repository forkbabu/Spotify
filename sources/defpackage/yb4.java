package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.browse.BrowseFragment;
import com.spotify.music.navigation.k;

/* renamed from: yb4  reason: default package */
public final /* synthetic */ class yb4 implements k {
    public static final /* synthetic */ yb4 a = new yb4();

    private /* synthetic */ yb4() {
    }

    @Override // com.spotify.music.navigation.k
    public final s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
        return BrowseFragment.K4(str, sessionState.currentUser(), l0Var.B(), cVar);
    }
}
