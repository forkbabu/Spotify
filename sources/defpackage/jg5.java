package defpackage;

import android.content.res.Resources;

/* renamed from: jg5  reason: default package */
public final class jg5 implements fjf<ig5> {
    private final wlf<Resources> a;

    public jg5(wlf<Resources> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ig5(this.a.get());
    }
}
