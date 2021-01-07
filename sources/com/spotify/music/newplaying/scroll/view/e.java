package com.spotify.music.newplaying.scroll.view;

import com.spotify.music.newplaying.scroll.view.PeekScrollView;
import io.reactivex.h;

public final /* synthetic */ class e implements PeekScrollView.a {
    public final /* synthetic */ h a;

    public /* synthetic */ e(h hVar) {
        this.a = hVar;
    }

    @Override // com.spotify.music.newplaying.scroll.view.PeekScrollView.a
    public final void a(int i, int i2) {
        this.a.onNext(new h(i, i2));
    }
}
