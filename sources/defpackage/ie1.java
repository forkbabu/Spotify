package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;

/* renamed from: ie1  reason: default package */
public class ie1 implements nd1 {
    private final ajf<si1> a;

    public ie1(ajf<si1> ajf) {
        this.a = ajf;
    }

    @Override // defpackage.nd1
    public qh1 a() {
        return this.a.get();
    }

    @Override // defpackage.nd1
    public boolean b(BrowserParams browserParams) {
        return "com.spotify.your-artists".equals(browserParams.h());
    }
}
