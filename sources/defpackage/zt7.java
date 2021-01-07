package defpackage;

import com.google.common.base.Optional;

/* renamed from: zt7  reason: default package */
public final /* synthetic */ class zt7 implements Runnable {
    public final /* synthetic */ hu7 a;
    public final /* synthetic */ Optional b;
    public final /* synthetic */ Optional c;

    public /* synthetic */ zt7(hu7 hu7, Optional optional, Optional optional2) {
        this.a = hu7;
        this.b = optional;
        this.c = optional2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.i(this.b, this.c);
    }
}
