package com.spotify.music.newplaying.scroll.container;

import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import io.reactivex.functions.b;
import java.util.ArrayList;

public final /* synthetic */ class e implements b {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // io.reactivex.functions.b
    public final void a(Object obj, Object obj2) {
        ((ArrayList) obj).add((NowPlayingWidget) obj2);
    }
}
