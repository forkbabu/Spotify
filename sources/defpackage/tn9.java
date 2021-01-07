package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;

/* renamed from: tn9  reason: default package */
public class tn9 implements nd1 {
    private final wlf<pn9> a;

    public tn9(wlf<pn9> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.nd1
    public qh1 a() {
        return this.a.get();
    }

    @Override // defpackage.nd1
    public boolean b(BrowserParams browserParams) {
        return !browserParams.p() && !ao9.c(browserParams.h()) && hd1.c(browserParams);
    }
}
