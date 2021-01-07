package defpackage;

import com.spotify.music.podcast.speedcontrol.SpeedControlInteractor;
import io.reactivex.a;
import io.reactivex.s;

/* renamed from: oq2  reason: default package */
public class oq2 {
    private final SpeedControlInteractor a;

    public oq2(SpeedControlInteractor speedControlInteractor) {
        this.a = speedControlInteractor;
    }

    public s<Integer> a() {
        return this.a.c();
    }

    public a b(int i) {
        return this.a.d(i);
    }
}
