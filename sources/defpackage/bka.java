package defpackage;

import android.app.Application;

/* renamed from: bka  reason: default package */
public final class bka implements fjf<aka> {
    private final wlf<Application> a;

    public bka(wlf<Application> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new aka(this.a.get());
    }
}
