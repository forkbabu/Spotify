package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.eventsender.EventSenderFragment;
import com.spotify.music.navigation.k;

/* renamed from: n05  reason: default package */
public final /* synthetic */ class n05 implements k {
    public static final /* synthetic */ n05 a = new n05();

    private /* synthetic */ n05() {
    }

    @Override // com.spotify.music.navigation.k
    public final s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
        String B = l0Var.B();
        B.getClass();
        if (B.endsWith("eventsender")) {
            return new EventSenderFragment();
        }
        throw new RuntimeException(je.x0("Fragment for Remote Configuration URI not resolved: ", B));
    }
}
