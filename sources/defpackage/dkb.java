package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.navigation.k;
import com.spotify.music.navigation.v;

/* renamed from: dkb  reason: default package */
public final /* synthetic */ class dkb implements k {
    public final /* synthetic */ xkb a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ v c;

    public /* synthetic */ dkb(xkb xkb, Class cls, v vVar) {
        this.a = xkb;
        this.b = cls;
        this.c = vVar;
    }

    @Override // com.spotify.music.navigation.k
    public final s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
        return this.a.c(this.b, this.c, intent, l0Var, str, cVar, sessionState);
    }
}
