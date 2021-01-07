package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;

/* renamed from: qe1  reason: default package */
public class qe1 implements nd1 {
    private final ajf<aj1> a;

    public qe1(ajf<aj1> ajf) {
        this.a = ajf;
    }

    @Override // defpackage.nd1
    public qh1 a() {
        return this.a.get();
    }

    @Override // defpackage.nd1
    public boolean b(BrowserParams browserParams) {
        return browserParams.n() && "com.spotify.your-podcasts".equals(browserParams.h());
    }
}
