package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;

/* renamed from: oe1  reason: default package */
public class oe1 implements nd1 {
    private final ajf<yi1> a;

    public oe1(ajf<yi1> ajf) {
        this.a = ajf;
    }

    @Override // defpackage.nd1
    public qh1 a() {
        return this.a.get();
    }

    @Override // defpackage.nd1
    public boolean b(BrowserParams browserParams) {
        String h = browserParams.h();
        return "com.spotify.your-playlists".equals(h) || h.contains(":folder:");
    }
}
