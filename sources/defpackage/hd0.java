package defpackage;

import android.os.Bundle;

/* renamed from: hd0  reason: default package */
public final /* synthetic */ class hd0 implements Runnable {
    public final /* synthetic */ id0 a;
    public final /* synthetic */ Bundle b;

    public /* synthetic */ hd0(id0 id0, Bundle bundle) {
        this.a = id0;
        this.b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.N0(this.b);
    }
}
