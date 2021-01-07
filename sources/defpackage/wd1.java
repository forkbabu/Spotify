package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;

/* renamed from: wd1  reason: default package */
public class wd1 implements nd1 {
    private final wlf<zh1> a;

    public wd1(wlf<zh1> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.nd1
    public qh1 a() {
        return this.a.get();
    }

    @Override // defpackage.nd1
    public boolean b(BrowserParams browserParams) {
        return browserParams.h().startsWith("spotify_media_browser_root_samsung") && yd1.c(browserParams.g()) && !browserParams.p();
    }
}
