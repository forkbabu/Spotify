package com.spotify.music.features.ads.screensaver;

import com.spotify.cosmos.router.Response;
import com.spotify.music.features.ads.model.AdSlot;
import com.spotify.rxjava2.p;
import io.reactivex.v;

public class t0 {
    private final ds3 a;
    private final u0 b;
    private final os3 c;
    private final p d = new p();

    public t0(ds3 ds3, u0 u0Var, os3 os3) {
        this.a = ds3;
        this.b = u0Var;
        this.c = os3;
    }

    public void a() {
        this.d.a();
    }

    public /* synthetic */ v b(Response response) {
        return this.b.b();
    }

    public void c() {
        this.d.b(this.a.a(AdSlot.MOBILE_SCREENSAVER).Q(w.a).N(y.a).J0(new x(this)).subscribe(this.c));
    }
}
