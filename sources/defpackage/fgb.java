package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import defpackage.glb;

/* renamed from: fgb  reason: default package */
public final /* synthetic */ class fgb implements glb.a {
    public final /* synthetic */ lgb a;

    public /* synthetic */ fgb(lgb lgb) {
        this.a = lgb;
    }

    @Override // defpackage.glb.a
    public final void a(Object obj, Object obj2, Object obj3) {
        this.a.a((Intent) obj, (c) obj2, (SessionState) obj3);
    }
}
