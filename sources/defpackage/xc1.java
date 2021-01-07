package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;

/* renamed from: xc1  reason: default package */
public class xc1 implements nd1 {
    private final ajf<zg1> a;

    public xc1(ajf<zg1> ajf) {
        this.a = ajf;
    }

    @Override // defpackage.nd1
    public qh1 a() {
        return this.a.get();
    }

    @Override // defpackage.nd1
    public boolean b(BrowserParams browserParams) {
        LinkType q = l0.z(browserParams.h()).q();
        return q == LinkType.ARTIST || q == LinkType.COLLECTION_ARTIST;
    }
}
