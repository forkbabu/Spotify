package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.remoteconfig.fragments.RemoteConfigurationFragment;
import com.spotify.music.navigation.k;

/* renamed from: k48  reason: default package */
public final /* synthetic */ class k48 implements k {
    public static final /* synthetic */ k48 a = new k48();

    private /* synthetic */ k48() {
    }

    @Override // com.spotify.music.navigation.k
    public final s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
        String B = l0Var.B();
        B.getClass();
        if (B.endsWith("remoteconfiguration")) {
            return new RemoteConfigurationFragment();
        }
        throw new RuntimeException(je.x0("Fragment for Remote Configuration URI not resolved: ", B));
    }
}
