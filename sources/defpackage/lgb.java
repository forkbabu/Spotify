package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.mainactivity.l;
import com.spotify.music.navigation.i;
import com.spotify.music.navigation.q;

/* renamed from: lgb  reason: default package */
public class lgb implements blb {
    private final l a;
    private final q b;

    public lgb(i iVar, q qVar) {
        this.a = new l(iVar, qVar);
        this.b = qVar;
    }

    public /* synthetic */ void a(Intent intent, c cVar, SessionState sessionState) {
        this.b.i();
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        xkb xkb = (xkb) glb;
        xkb.d("com.spotify.mobile.android.ui.action.view.CLEAR_BACKSTACK", "Should clear backstack", new fgb(this));
        xkb.d("com.spotify.mobile.android.ui.action.view.SPOTIFY_URI", "Should probably pop a fragment", new ggb(this));
    }

    public /* synthetic */ void c(Intent intent, c cVar, SessionState sessionState) {
        this.a.a(intent);
    }
}
