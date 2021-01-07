package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import defpackage.glb;

/* renamed from: ngb  reason: default package */
public class ngb implements ykb {
    private glb.a<Intent, c, SessionState> b = ikb.a;

    @Override // defpackage.ykb
    public void a(glb.a<Intent, c, SessionState> aVar) {
        aVar.getClass();
        this.b = aVar;
    }

    @Override // defpackage.ykb
    public void b(Intent intent, c cVar, SessionState sessionState) {
        this.b.a(intent, cVar, sessionState);
    }
}
