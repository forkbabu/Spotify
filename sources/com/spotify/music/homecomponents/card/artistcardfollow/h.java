package com.spotify.music.homecomponents.card.artistcardfollow;

import androidx.lifecycle.n;
import com.spotify.encore.Component;
import com.spotify.encore.consumer.components.artist.api.artistcardfollow.ArtistCardFollow;

public final class h implements fjf<EncoreArtistCardFollowComponent> {
    private final wlf<aq9> a;
    private final wlf<b> b;
    private final wlf<Component<ArtistCardFollow.Model, ArtistCardFollow.Events>> c;
    private final wlf<n> d;

    public h(wlf<aq9> wlf, wlf<b> wlf2, wlf<Component<ArtistCardFollow.Model, ArtistCardFollow.Events>> wlf3, wlf<n> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new EncoreArtistCardFollowComponent(this.a.get(), this.b.get(), this.c, this.d.get());
    }
}
