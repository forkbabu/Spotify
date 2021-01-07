package defpackage;

import android.content.Intent;
import android.net.Uri;
import defpackage.elb;
import io.reactivex.a;

/* renamed from: rkb  reason: default package */
public final /* synthetic */ class rkb implements ti0 {
    public final /* synthetic */ zkb a;
    public final /* synthetic */ Intent b;

    public /* synthetic */ rkb(zkb zkb, Intent intent) {
        this.a = zkb;
        this.b = intent;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        zkb zkb = this.a;
        Intent intent = this.b;
        zkb.getClass();
        return a.u(new qkb(zkb, new Intent(intent).setData(Uri.parse(((elb.b) obj).e().B()))));
    }
}
