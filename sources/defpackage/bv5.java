package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import com.spotify.music.nowplaying.core.modes.NowPlayingMode;
import io.reactivex.g;
import io.reactivex.z;
import java.util.Map;

/* renamed from: bv5  reason: default package */
public final class bv5 implements fjf<av5> {
    private final wlf<o> a;
    private final wlf<g<ev5>> b;
    private final wlf<Map<NowPlayingMode, wlf<z<Fragment>>>> c;
    private final wlf<z<Fragment>> d;

    public bv5(wlf<o> wlf, wlf<g<ev5>> wlf2, wlf<Map<NowPlayingMode, wlf<z<Fragment>>>> wlf3, wlf<z<Fragment>> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        av5 av5 = new av5(this.a.get(), this.b.get());
        av5.c = this.c.get();
        av5.f = this.d;
        return av5;
    }
}
