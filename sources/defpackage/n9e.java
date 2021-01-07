package defpackage;

import android.content.Context;

/* renamed from: n9e  reason: default package */
public final class n9e implements fjf<l9e> {
    private final wlf<Context> a;
    private final wlf<o9e> b;

    public n9e(wlf<Context> wlf, wlf<o9e> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l9e(this.a.get(), this.b.get());
    }
}
