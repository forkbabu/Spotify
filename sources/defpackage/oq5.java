package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;

/* renamed from: oq5  reason: default package */
public class oq5 implements nd1 {
    private final ajf<nq5> a;

    public oq5(ajf<nq5> ajf) {
        this.a = ajf;
    }

    @Override // defpackage.nd1
    public qh1 a() {
        return this.a.get();
    }

    @Override // defpackage.nd1
    public boolean b(BrowserParams browserParams) {
        return "spotify_root_media_resumption".equals(browserParams.h());
    }
}
