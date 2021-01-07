package defpackage;

import com.spotify.music.nowplaying.core.modes.NowPlayingMode;
import com.spotify.music.nowplaying.core.modes.a;
import java.util.Map;

/* renamed from: gv5  reason: default package */
public final class gv5 implements fjf<fv5> {
    private final wlf<Map<NowPlayingMode, a>> a;

    public gv5(wlf<Map<NowPlayingMode, a>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fv5(this.a.get());
    }
}
