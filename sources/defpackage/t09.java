package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.yourlibrary.container.YourLibraryFragment;
import com.spotify.music.navigation.k;

/* renamed from: t09  reason: default package */
public final /* synthetic */ class t09 implements k {
    public static final /* synthetic */ t09 a = new t09();

    private /* synthetic */ t09() {
    }

    @Override // com.spotify.music.navigation.k
    public final s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
        return YourLibraryFragment.K4(cVar, sessionState.currentUser(), l0Var);
    }
}
