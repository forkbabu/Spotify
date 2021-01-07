package com.spotify.music.newplaying.scroll.container;

import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import io.reactivex.functions.l;
import java.util.Map;

public final /* synthetic */ class b implements l {
    public final /* synthetic */ Map a;

    public /* synthetic */ b(Map map) {
        this.a = map;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (NowPlayingWidget) this.a.get((NowPlayingWidget.Type) obj);
    }
}
