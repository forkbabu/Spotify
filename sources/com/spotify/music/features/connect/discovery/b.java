package com.spotify.music.features.connect.discovery;

import com.spotify.music.features.connect.cast.discovery.DiscoveryEvent;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ g a;

    public /* synthetic */ b(g gVar) {
        this.a = gVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.v((DiscoveryEvent) obj);
    }
}
