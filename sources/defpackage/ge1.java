package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;

/* renamed from: ge1  reason: default package */
public class ge1 implements nd1 {
    private final ajf<qi1> a;

    public ge1(ajf<qi1> ajf) {
        this.a = ajf;
    }

    @Override // defpackage.nd1
    public qh1 a() {
        return this.a.get();
    }

    @Override // defpackage.nd1
    public boolean b(BrowserParams browserParams) {
        return "com.spotify.your-albums".equals(browserParams.h());
    }
}
