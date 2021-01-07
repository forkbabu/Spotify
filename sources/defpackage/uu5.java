package defpackage;

import androidx.fragment.app.Fragment;
import com.spotify.music.nowplaying.core.modes.NowPlayingMode;
import defpackage.ev5;
import io.reactivex.z;

/* renamed from: uu5  reason: default package */
public final /* synthetic */ class uu5 implements ti0 {
    public final /* synthetic */ av5 a;

    public /* synthetic */ uu5(av5 av5) {
        this.a = av5;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        av5 av5 = this.a;
        wlf<z<Fragment>> wlf = av5.c.get(((ev5.b) obj).b());
        if (wlf == null) {
            return av5.c.get(NowPlayingMode.DEFAULT).get();
        }
        return wlf.get();
    }
}
