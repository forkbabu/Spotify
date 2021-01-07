package defpackage;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: wl0  reason: default package */
public final /* synthetic */ class wl0 implements Callable {
    public final /* synthetic */ zl0 a;
    public final /* synthetic */ Bundle b;

    public /* synthetic */ wl0(zl0 zl0, Bundle bundle) {
        this.a = zl0;
        this.b = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.a(this.b);
    }
}
