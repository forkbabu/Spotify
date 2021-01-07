package defpackage;

import com.spotify.mobile.android.util.ui.k;

/* renamed from: tm8  reason: default package */
public final class tm8 implements fjf<sm8> {
    private final wlf<k> a;

    public tm8(wlf<k> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new sm8(this.a.get());
    }
}
