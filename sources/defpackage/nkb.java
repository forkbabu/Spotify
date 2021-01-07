package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import defpackage.alb;

/* renamed from: nkb  reason: default package */
public final /* synthetic */ class nkb implements alb.c {
    public final /* synthetic */ zkb a;
    public final /* synthetic */ vkb b;

    public /* synthetic */ nkb(zkb zkb, vkb vkb) {
        this.a = zkb;
        this.b = vkb;
    }

    @Override // defpackage.alb.c
    public final Object a(Object obj, Object obj2, Object obj3) {
        zkb zkb = this.a;
        Intent intent = (Intent) obj;
        zkb.getClass();
        return this.b.a(intent, (c) obj2, (SessionState) obj3).t(new mkb(zkb, intent));
    }
}
