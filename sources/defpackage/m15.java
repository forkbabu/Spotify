package defpackage;

import com.spotify.mobile.android.util.ui.h;

/* renamed from: m15  reason: default package */
public final class m15 implements fjf<l15> {
    private final wlf<h> a;

    public m15(wlf<h> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l15(this.a.get());
    }
}
