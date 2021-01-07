package defpackage;

import com.spotify.mobile.android.util.ui.e;

/* renamed from: anb  reason: default package */
public final class anb implements fjf<zmb> {
    private final wlf<e> a;

    public anb(wlf<e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zmb(this.a.get());
    }
}
