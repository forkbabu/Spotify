package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;

/* renamed from: jd1  reason: default package */
public class jd1 implements nd1 {
    private final ajf<lh1> a;

    public jd1(ajf<lh1> ajf) {
        this.a = ajf;
    }

    @Override // defpackage.nd1
    public qh1 a() {
        return this.a.get();
    }

    @Override // defpackage.nd1
    public boolean b(BrowserParams browserParams) {
        return browserParams.h().startsWith("genie");
    }
}
