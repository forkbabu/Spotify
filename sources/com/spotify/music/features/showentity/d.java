package com.spotify.music.features.showentity;

import com.spotify.music.features.showentity.r;
import com.spotify.music.features.showentity.t;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.schedulers.a;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class d implements l {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        r.a aVar = (r.a) obj;
        return s.i0(new t.b()).C(500, TimeUnit.MILLISECONDS, a.a());
    }
}
