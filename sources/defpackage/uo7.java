package defpackage;

import com.spotify.music.features.profile.editprofile.p;
import com.spotify.remoteconfig.s6;
import io.reactivex.y;

/* renamed from: uo7  reason: default package */
public final class uo7 implements fjf<to7> {
    private final wlf<lqa> a;
    private final wlf<s6> b;
    private final wlf<y> c;
    private final wlf<qu7> d;
    private final wlf<p> e;

    public uo7(wlf<lqa> wlf, wlf<s6> wlf2, wlf<y> wlf3, wlf<qu7> wlf4, wlf<p> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new to7(this.a, this.b, this.c, this.d, this.e);
    }
}
