package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import defpackage.glb;

/* renamed from: mf5  reason: default package */
public final /* synthetic */ class mf5 implements glb.a {
    public final /* synthetic */ sf5 a;

    public /* synthetic */ mf5(sf5 sf5) {
        this.a = sf5;
    }

    @Override // defpackage.glb.a
    public final void a(Object obj, Object obj2, Object obj3) {
        sf5.d(this.a, (Intent) obj, (c) obj2, (SessionState) obj3);
    }
}
