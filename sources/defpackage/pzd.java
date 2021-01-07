package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.navigation.k;
import com.spotify.premiumhub.PremiumHubFragment;

/* renamed from: pzd  reason: default package */
public final /* synthetic */ class pzd implements k {
    public static final /* synthetic */ pzd a = new pzd();

    private /* synthetic */ pzd() {
    }

    @Override // com.spotify.music.navigation.k
    public final s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
        return new PremiumHubFragment();
    }
}
