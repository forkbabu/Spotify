package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import defpackage.glb;

/* renamed from: gkb  reason: default package */
public final /* synthetic */ class gkb implements glb.a {
    public final /* synthetic */ xkb a;
    public final /* synthetic */ glb.b b;

    public /* synthetic */ gkb(xkb xkb, glb.b bVar) {
        this.a = xkb;
        this.b = bVar;
    }

    @Override // defpackage.glb.a
    public final void a(Object obj, Object obj2, Object obj3) {
        this.a.b(this.b, (Intent) obj, (c) obj2, (SessionState) obj3);
    }
}
