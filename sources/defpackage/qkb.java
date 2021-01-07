package defpackage;

import android.content.Intent;
import io.reactivex.functions.a;

/* renamed from: qkb  reason: default package */
public final /* synthetic */ class qkb implements a {
    public final /* synthetic */ zkb a;
    public final /* synthetic */ Intent b;

    public /* synthetic */ qkb(zkb zkb, Intent intent) {
        this.a = zkb;
        this.b = intent;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.a(this.b);
    }
}
