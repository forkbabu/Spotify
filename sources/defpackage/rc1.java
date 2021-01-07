package defpackage;

import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;

/* renamed from: rc1  reason: default package */
public class rc1 implements nd1 {
    private final ajf<tg1> a;

    public rc1(ajf<tg1> ajf) {
        this.a = ajf;
    }

    @Override // defpackage.nd1
    public qh1 a() {
        return this.a.get();
    }

    @Override // defpackage.nd1
    public boolean b(BrowserParams browserParams) {
        return l0.z(browserParams.h()).q() == LinkType.ALBUM;
    }
}
