package com.spotify.music.nowplayingmini.def;

import com.spotify.encore.consumer.elements.heart.Heart;
import com.spotify.music.nowplaying.common.view.heart.i;

class c implements i {
    final /* synthetic */ DefaultModeFragment a;

    c(DefaultModeFragment defaultModeFragment) {
        this.a = defaultModeFragment;
    }

    @Override // com.spotify.music.nowplaying.common.view.heart.i
    public void b(boolean z) {
    }

    @Override // com.spotify.music.nowplaying.common.view.heart.i
    public void setEnabled(boolean z) {
        DefaultModeFragment.K4(this.a).setEnabled(z);
    }

    @Override // com.spotify.music.nowplaying.common.view.heart.i
    public void setHeartState(boolean z) {
        DefaultModeFragment.K4(this.a).render(new Heart.Model(z, DefaultModeFragment.L4(this.a)));
    }

    @Override // com.spotify.music.nowplaying.common.view.heart.i
    public void setListener(i.a aVar) {
        DefaultModeFragment.K4(this.a).onEvent(new a(aVar));
    }
}
