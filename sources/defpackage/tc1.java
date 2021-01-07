package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;

/* renamed from: tc1  reason: default package */
public class tc1 implements nd1 {
    private final ajf<vg1> a;

    public tc1(ajf<vg1> ajf) {
        this.a = ajf;
    }

    @Override // defpackage.nd1
    public qh1 a() {
        return this.a.get();
    }

    @Override // defpackage.nd1
    public boolean b(BrowserParams browserParams) {
        return "com.spotify.androidauto.home".equals(browserParams.h());
    }
}
