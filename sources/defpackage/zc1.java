package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;

/* renamed from: zc1  reason: default package */
public class zc1 implements nd1 {
    private final ajf<bh1> a;

    public zc1(ajf<bh1> ajf) {
        this.a = ajf;
    }

    @Override // defpackage.nd1
    public qh1 a() {
        return this.a.get();
    }

    @Override // defpackage.nd1
    public boolean b(BrowserParams browserParams) {
        return browserParams.h().contains("spotify:genre:");
    }
}
