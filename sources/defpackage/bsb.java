package defpackage;

import android.content.res.Resources;

/* renamed from: bsb  reason: default package */
public final class bsb implements fjf<asb> {
    private final wlf<Resources> a;

    public bsb(wlf<Resources> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new asb(this.a.get());
    }
}
