package defpackage;

import android.app.Activity;

/* renamed from: je2  reason: default package */
public final class je2 implements fjf<he2> {
    private final wlf<Activity> a;
    private final wlf<fe2> b;

    public je2(wlf<Activity> wlf, wlf<fe2> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new he2(this.a.get(), this.b.get());
    }
}
