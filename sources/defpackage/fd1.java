package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;

/* renamed from: fd1  reason: default package */
public class fd1 implements nd1 {
    private final ajf<hh1> a;

    fd1(ajf<hh1> ajf) {
        this.a = ajf;
    }

    @Override // defpackage.nd1
    public qh1 a() {
        return this.a.get();
    }

    @Override // defpackage.nd1
    public boolean b(BrowserParams browserParams) {
        return l0.z(browserParams.h()).q() == LinkType.COLLECTION_ALBUM;
    }
}
