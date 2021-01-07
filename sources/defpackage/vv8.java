package defpackage;

import com.spotify.mobile.android.rx.w;

/* renamed from: vv8  reason: default package */
public final class vv8 implements fjf<uv8> {
    private final wlf<w> a;

    public vv8(wlf<w> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new uv8(this.a.get());
    }
}
