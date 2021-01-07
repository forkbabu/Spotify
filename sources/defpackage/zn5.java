package defpackage;

import com.spotify.mobile.android.util.v;

/* renamed from: zn5  reason: default package */
public final class zn5 implements fjf<t2a> {
    private final wlf<v> a;

    public zn5(wlf<v> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        v vVar = this.a.get();
        vVar.getClass();
        return new un5(vVar);
    }
}
