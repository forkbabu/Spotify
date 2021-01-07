package defpackage;

import android.content.Intent;
import io.reactivex.a;
import io.reactivex.functions.l;

/* renamed from: mkb  reason: default package */
public final /* synthetic */ class mkb implements l {
    public final /* synthetic */ zkb a;
    public final /* synthetic */ Intent b;

    public /* synthetic */ mkb(zkb zkb, Intent intent) {
        this.a = zkb;
        this.b = intent;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        zkb zkb = this.a;
        Intent intent = this.b;
        zkb.getClass();
        return (a) ((elb) obj).b(skb.a, new jkb(zkb, intent), new rkb(zkb, intent));
    }
}
