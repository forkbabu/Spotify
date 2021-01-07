package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;

/* renamed from: ce1  reason: default package */
public class ce1 implements nd1 {
    private final wlf<fi1> a;
    private final ud1 b;

    public ce1(wlf<fi1> wlf, ud1 ud1) {
        this.a = wlf;
        this.b = ud1;
    }

    @Override // defpackage.nd1
    public qh1 a() {
        return this.a.get();
    }

    @Override // defpackage.nd1
    public boolean b(BrowserParams browserParams) {
        if (browserParams.h().startsWith("spotify:space_item:")) {
            this.b.getClass();
            if (!"com.spotify.recently-played".equals(browserParams.h()) && !hd1.c(browserParams)) {
                return true;
            }
        }
        return false;
    }
}
