package com.spotify.music.marquee;

import com.spotify.cosmos.router.Response;
import io.reactivex.functions.n;

public final /* synthetic */ class d implements n {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        int i = MarqueeService.q;
        return ((Response) obj).getStatus() == 202;
    }
}
