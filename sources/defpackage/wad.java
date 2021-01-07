package defpackage;

import android.content.Context;

/* renamed from: wad  reason: default package */
public final class wad implements fjf<vad> {
    private final wlf<lqa> a;
    private final wlf<Context> b;

    public wad(wlf<lqa> wlf, wlf<Context> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vad(this.a.get(), this.b.get());
    }
}
