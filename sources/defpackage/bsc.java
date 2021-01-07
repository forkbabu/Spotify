package defpackage;

import android.view.LayoutInflater;
import defpackage.zrc;
import java.util.Set;

/* renamed from: bsc  reason: default package */
public final class bsc implements fjf<zrc> {
    private final wlf<LayoutInflater> a;
    private final wlf<Set<zrc.a>> b;

    public bsc(wlf<LayoutInflater> wlf, wlf<Set<zrc.a>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new asc(this.a.get(), this.b.get());
    }
}
