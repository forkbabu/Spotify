package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;

/* renamed from: hd1  reason: default package */
public class hd1 implements nd1 {
    private final wlf<jh1> a;
    private final vc1 b;
    private final ae1 c;
    private final yd1 d;
    private final dd1 e;
    private final ee1 f;

    public hd1(wlf<jh1> wlf, vc1 vc1, ae1 ae1, yd1 yd1, dd1 dd1, ee1 ee1) {
        this.a = wlf;
        this.b = vc1;
        this.c = ae1;
        this.d = yd1;
        this.e = dd1;
        this.f = ee1;
    }

    public static boolean c(BrowserParams browserParams) {
        return "com.google.android.deskclock".equals(browserParams.g()) && "wake".equals(browserParams.j());
    }

    @Override // defpackage.nd1
    public qh1 a() {
        return this.a.get();
    }

    @Override // defpackage.nd1
    public boolean b(BrowserParams browserParams) {
        if (browserParams.p()) {
            if (!this.b.b(browserParams) && !this.c.b(browserParams) && !this.d.b(browserParams) && !this.e.b(browserParams) && !this.f.b(browserParams) && !c(browserParams)) {
                return true;
            }
        }
        return false;
    }
}
