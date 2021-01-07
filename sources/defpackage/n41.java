package defpackage;

import com.spotify.remoteconfig.AndroidFeatureDrivingJumpstartProperties;
import io.reactivex.s;

/* renamed from: n41  reason: default package */
public final class n41 implements fjf<m41> {
    private final wlf<AndroidFeatureDrivingJumpstartProperties> a;
    private final wlf<s<d7a>> b;

    public n41(wlf<AndroidFeatureDrivingJumpstartProperties> wlf, wlf<s<d7a>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m41(this.a, this.b.get());
    }
}
