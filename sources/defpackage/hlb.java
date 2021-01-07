package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import defpackage.glb;

/* renamed from: hlb  reason: default package */
public abstract class hlb implements glb.c {
    public static hlb b(Intent intent, c cVar, SessionState sessionState) {
        return new wkb(intent, cVar, sessionState);
    }

    @Override // defpackage.glb.c
    public abstract Intent a();

    public abstract c c();

    public abstract SessionState d();
}
