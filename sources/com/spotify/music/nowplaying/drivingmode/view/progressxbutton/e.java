package com.spotify.music.nowplaying.drivingmode.view.progressxbutton;

import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public class e {
    private final y a;
    private final y b;

    public e(y yVar, y yVar2) {
        this.a = yVar;
        this.b = yVar2;
    }

    public s<Integer> a() {
        return s.u0(1, 360).w(new a(this)).o0(this.b);
    }

    public /* synthetic */ v b(Integer num) {
        return s.i0(num).C(41, TimeUnit.MILLISECONDS, this.a);
    }
}
