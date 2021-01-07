package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import defpackage.glb;

/* renamed from: ggb  reason: default package */
public final /* synthetic */ class ggb implements glb.a {
    public final /* synthetic */ lgb a;

    public /* synthetic */ ggb(lgb lgb) {
        this.a = lgb;
    }

    @Override // defpackage.glb.a
    public final void a(Object obj, Object obj2, Object obj3) {
        this.a.c((Intent) obj, (c) obj2, (SessionState) obj3);
    }
}
