package defpackage;

import androidx.fragment.app.Fragment;
import com.spotify.music.navigation.t;

/* renamed from: i4d  reason: default package */
public final class i4d implements fjf<h4d> {
    private final wlf<Fragment> a;
    private final wlf<t> b;

    public i4d(wlf<Fragment> wlf, wlf<t> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h4d(this.a.get(), this.b.get());
    }
}
