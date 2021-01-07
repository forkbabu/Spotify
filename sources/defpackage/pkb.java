package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.navigation.k;
import defpackage.glb;

/* renamed from: pkb  reason: default package */
public final /* synthetic */ class pkb implements glb.a {
    public final /* synthetic */ zkb a;
    public final /* synthetic */ k b;

    public /* synthetic */ pkb(zkb zkb, k kVar) {
        this.a = zkb;
        this.b = kVar;
    }

    @Override // defpackage.glb.a
    public final void a(Object obj, Object obj2, Object obj3) {
        this.a.c(this.b, (Intent) obj, (c) obj2, (SessionState) obj3);
    }
}
