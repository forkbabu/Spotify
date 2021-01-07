package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;

/* renamed from: dd1  reason: default package */
public class dd1 implements nd1 {
    private final ajf<fh1> a;
    private final vc1 b;
    private final ee1 c;

    public dd1(ajf<fh1> ajf, vc1 vc1, ee1 ee1) {
        this.a = ajf;
        this.b = vc1;
        this.c = ee1;
    }

    @Override // defpackage.nd1
    public qh1 a() {
        return this.a.get();
    }

    @Override // defpackage.nd1
    public boolean b(BrowserParams browserParams) {
        return browserParams.j() != null && browserParams.j().equals("default-cars") && browserParams.p() && !this.b.b(browserParams) && !this.c.b(browserParams);
    }
}
