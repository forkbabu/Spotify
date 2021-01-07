package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import defpackage.glb;

/* renamed from: egb  reason: default package */
public final /* synthetic */ class egb implements glb.a {
    public final /* synthetic */ kgb a;

    public /* synthetic */ egb(kgb kgb) {
        this.a = kgb;
    }

    @Override // defpackage.glb.a
    public final void a(Object obj, Object obj2, Object obj3) {
        this.a.a((Intent) obj, (c) obj2, (SessionState) obj3);
    }
}
