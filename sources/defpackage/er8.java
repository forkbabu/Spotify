package defpackage;

import com.spotify.mobile.android.ui.activity.c;
import com.spotify.music.features.tasteonboarding.f;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: er8  reason: default package */
public final class er8 implements fjf<dr8> {
    private final wlf<c> a;
    private final wlf<lq8> b;
    private final wlf<y> c;
    private final wlf<s<Boolean>> d;
    private final wlf<f> e;
    private final wlf<hha> f;

    public er8(wlf<c> wlf, wlf<lq8> wlf2, wlf<y> wlf3, wlf<s<Boolean>> wlf4, wlf<f> wlf5, wlf<hha> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dr8(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
