package defpackage;

import android.content.Context;

/* renamed from: ki5  reason: default package */
public final class ki5 implements fjf<ji5> {
    private final wlf<Context> a;

    public ki5(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ji5(this.a.get());
    }
}
