package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;

/* renamed from: me1  reason: default package */
public class me1 implements nd1 {
    private final ajf<wi1> a;

    public me1(ajf<wi1> ajf) {
        this.a = ajf;
    }

    @Override // defpackage.nd1
    public qh1 a() {
        return this.a.get();
    }

    @Override // defpackage.nd1
    public boolean b(BrowserParams browserParams) {
        return !browserParams.n() && "com.spotify.your-podcasts".equals(browserParams.h());
    }
}
