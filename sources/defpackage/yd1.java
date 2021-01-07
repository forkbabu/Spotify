package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;

/* renamed from: yd1  reason: default package */
public class yd1 implements nd1 {
    private final wlf<bi1> a;

    public yd1(wlf<bi1> wlf) {
        this.a = wlf;
    }

    public static boolean c(String str) {
        return "com.samsung.android.honeyboard".equals(str) || "com.samsung.android.icecone".equals(str);
    }

    @Override // defpackage.nd1
    public qh1 a() {
        return this.a.get();
    }

    @Override // defpackage.nd1
    public boolean b(BrowserParams browserParams) {
        return browserParams.h().startsWith("spotify_media_browser_root_samsung") && c(browserParams.g()) && browserParams.p();
    }
}
