package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;

/* renamed from: vc1  reason: default package */
public class vc1 implements nd1 {
    private final ajf<xg1> a;

    public vc1(ajf<xg1> ajf) {
        this.a = ajf;
    }

    @Override // defpackage.nd1
    public qh1 a() {
        return this.a.get();
    }

    @Override // defpackage.nd1
    public boolean b(BrowserParams browserParams) {
        return browserParams.h().startsWith("spotify_media_browser_root_android_auto");
    }
}
