package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.q;

/* renamed from: od1  reason: default package */
public class od1 implements nd1 {
    private final ajf<q> a;

    public od1(ajf<q> ajf) {
        this.a = ajf;
    }

    @Override // defpackage.nd1
    public qh1 a() {
        return this.a.get();
    }

    @Override // defpackage.nd1
    public boolean b(BrowserParams browserParams) {
        return browserParams.h().equals("com.spotify.offline");
    }
}
