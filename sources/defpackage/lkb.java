package defpackage;

import android.content.Intent;
import defpackage.elb;
import io.reactivex.functions.a;

/* renamed from: lkb  reason: default package */
public final /* synthetic */ class lkb implements a {
    public final /* synthetic */ zkb a;
    public final /* synthetic */ elb.c b;
    public final /* synthetic */ Intent c;

    public /* synthetic */ lkb(zkb zkb, elb.c cVar, Intent intent) {
        this.a = zkb;
        this.b = cVar;
        this.c = intent;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.b(this.b, this.c);
    }
}
