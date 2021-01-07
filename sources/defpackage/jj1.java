package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import io.reactivex.z;

/* renamed from: jj1  reason: default package */
public class jj1 {
    private final ij1 a;
    private final ii1 b;

    public jj1(ij1 ij1, ii1 ii1) {
        this.a = ij1;
        this.b = ii1;
    }

    public z<b91> a(BrowserParams browserParams) {
        return this.a.a(this.b.a(browserParams, "").b("locale")).A(fj1.a);
    }
}
