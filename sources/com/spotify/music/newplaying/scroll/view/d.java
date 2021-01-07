package com.spotify.music.newplaying.scroll.view;

import com.spotify.music.newplaying.scroll.view.PeekScrollView;
import io.reactivex.functions.f;

public final /* synthetic */ class d implements f {
    public final /* synthetic */ PeekScrollView a;
    public final /* synthetic */ PeekScrollView.a b;

    public /* synthetic */ d(PeekScrollView peekScrollView, PeekScrollView.a aVar) {
        this.a = peekScrollView;
        this.b = aVar;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.f(this.b);
    }
}
