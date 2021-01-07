package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import defpackage.alb;
import defpackage.glb;
import io.reactivex.a;

/* renamed from: ukb  reason: default package */
public final /* synthetic */ class ukb implements alb.c {
    public final /* synthetic */ glb.a a;

    public /* synthetic */ ukb(glb.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.alb.c
    public final Object a(Object obj, Object obj2, Object obj3) {
        return a.u(new tkb(this.a, (Intent) obj, (c) obj2, (SessionState) obj3));
    }
}
