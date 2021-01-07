package defpackage;

import android.content.Intent;
import defpackage.elb;
import io.reactivex.a;

/* renamed from: jkb  reason: default package */
public final /* synthetic */ class jkb implements ti0 {
    public final /* synthetic */ zkb a;
    public final /* synthetic */ Intent b;

    public /* synthetic */ jkb(zkb zkb, Intent intent) {
        this.a = zkb;
        this.b = intent;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        zkb zkb = this.a;
        Intent intent = this.b;
        zkb.getClass();
        return a.u(new lkb(zkb, (elb.c) obj, intent));
    }
}
