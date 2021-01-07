package defpackage;

import com.spotify.music.podcast.speedcontrol.SpeedControlInteractor;
import io.reactivex.s;

/* renamed from: rq2  reason: default package */
public final class rq2 implements fjf<s<Integer>> {
    private final wlf<SpeedControlInteractor> a;

    public rq2(wlf<SpeedControlInteractor> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().c();
    }
}
