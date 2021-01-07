package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.remoteconfig.AndroidGoogleClockProperties;

/* renamed from: vn9  reason: default package */
public class vn9 implements nd1 {
    private final AndroidGoogleClockProperties a;
    private final wlf<jh1> b;
    private final wlf<co9> c;
    private final wlf<rn9> d;

    public vn9(AndroidGoogleClockProperties androidGoogleClockProperties, wlf<jh1> wlf, wlf<co9> wlf2, wlf<rn9> wlf3) {
        this.a = androidGoogleClockProperties;
        this.b = wlf;
        this.c = wlf2;
        this.d = wlf3;
    }

    @Override // defpackage.nd1
    public qh1 a() {
        int ordinal = this.a.a().ordinal();
        if (ordinal == 1) {
            return this.d.get();
        }
        if (ordinal != 2) {
            return this.b.get();
        }
        return this.c.get();
    }

    @Override // defpackage.nd1
    public boolean b(BrowserParams browserParams) {
        return (browserParams.p() || ao9.c(browserParams.h())) && hd1.c(browserParams);
    }
}
