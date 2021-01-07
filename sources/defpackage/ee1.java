package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;

/* renamed from: ee1  reason: default package */
public class ee1 implements nd1 {
    private final ajf<oi1> a;

    public ee1(ajf<oi1> ajf) {
        this.a = ajf;
    }

    @Override // defpackage.nd1
    public qh1 a() {
        return this.a.get();
    }

    @Override // defpackage.nd1
    public boolean b(BrowserParams browserParams) {
        if (!("6783171782de443ca02df9b63520fc32".equals(browserParams.e()) || "superbird".equals(browserParams.e())) || !browserParams.p()) {
            return false;
        }
        return true;
    }
}
