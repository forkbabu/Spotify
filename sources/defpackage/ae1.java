package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;

/* renamed from: ae1  reason: default package */
public class ae1 implements nd1 {
    private final yd1 a;
    private final wlf<di1> b;

    public ae1(wlf<di1> wlf, yd1 yd1) {
        this.b = wlf;
        this.a = yd1;
    }

    @Override // defpackage.nd1
    public qh1 a() {
        return this.b.get();
    }

    @Override // defpackage.nd1
    public boolean b(BrowserParams browserParams) {
        return browserParams.h().startsWith("spotify_media_browser_root_samsung") && browserParams.p() && !this.a.b(browserParams);
    }
}
