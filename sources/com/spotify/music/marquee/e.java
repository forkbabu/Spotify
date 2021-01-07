package com.spotify.music.marquee;

import com.spotify.cosmos.router.Response;
import io.reactivex.functions.g;

public final /* synthetic */ class e implements g {
    public final /* synthetic */ MarqueeService a;

    public /* synthetic */ e(MarqueeService marqueeService) {
        this.a = marqueeService;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.f((Response) obj);
    }
}
