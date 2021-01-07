package defpackage;

import com.spotify.mobile.android.observablestates.headset.HeadsetPluggedStatus;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: cx9  reason: default package */
public final class cx9 implements fjf<bx9> {
    private final wlf<y> a;
    private final wlf<zw9> b;
    private final wlf<s<HeadsetPluggedStatus>> c;
    private final wlf<s<na1>> d;

    public cx9(wlf<y> wlf, wlf<zw9> wlf2, wlf<s<HeadsetPluggedStatus>> wlf3, wlf<s<na1>> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new bx9(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
