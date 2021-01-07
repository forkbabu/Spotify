package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.features.madeforyouhub.view.b;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: hp5  reason: default package */
public final class hp5 implements fjf<up5> {
    private final wlf<b> a;
    private final wlf<y> b;
    private final wlf<vo5> c;
    private final wlf<s<SessionState>> d;
    private final wlf<sp5> e;

    public hp5(wlf<b> wlf, wlf<y> wlf2, wlf<vo5> wlf3, wlf<s<SessionState>> wlf4, wlf<sp5> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new up5(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
