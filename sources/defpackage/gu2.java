package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: gu2  reason: default package */
public final class gu2 implements fjf<Handler> {
    private final wlf<Looper> a;

    public gu2(wlf<Looper> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new Handler(this.a.get());
    }
}
