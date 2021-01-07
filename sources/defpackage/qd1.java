package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;

/* renamed from: qd1  reason: default package */
public class qd1 implements nd1 {
    private final ajf<rh1> a;

    public qd1(ajf<rh1> ajf) {
        this.a = ajf;
    }

    @Override // defpackage.nd1
    public qh1 a() {
        return this.a.get();
    }

    @Override // defpackage.nd1
    public boolean b(BrowserParams browserParams) {
        return l0.z(browserParams.h()).q() == LinkType.PLAYLIST_V2;
    }
}
