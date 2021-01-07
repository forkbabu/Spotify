package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;

/* renamed from: ld1  reason: default package */
public class ld1 implements nd1 {
    private final ajf<nh1> a;

    public ld1(ajf<nh1> ajf) {
        this.a = ajf;
    }

    @Override // defpackage.nd1
    public qh1 a() {
        return this.a.get();
    }

    @Override // defpackage.nd1
    public boolean b(BrowserParams browserParams) {
        return LinkType.COLLECTION_TRACKS == l0.z(browserParams.h()).q();
    }
}
