package com.spotify.music.features.connect.discovery;

import com.spotify.music.features.connect.cast.discovery.DiscoveredDevice;
import com.spotify.music.features.connect.discovery.g;

public final /* synthetic */ class a implements io.reactivex.functions.a {
    public final /* synthetic */ g.c a;
    public final /* synthetic */ DiscoveredDevice b;

    public /* synthetic */ a(g.c cVar, DiscoveredDevice discoveredDevice) {
        this.a = cVar;
        this.b = discoveredDevice;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        g.this.l.b(this.b.getDeviceId());
    }
}
