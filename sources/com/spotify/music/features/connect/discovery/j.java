package com.spotify.music.features.connect.discovery;

import com.spotify.music.features.connect.discovery.g;
import io.reactivex.s;
import io.reactivex.subjects.a;

public class j implements g.d {
    private final a<DiscoveredDeviceConnectionStatus> a = a.i1(DiscoveredDeviceConnectionStatus.NOT_CONNECTED);

    @Override // com.spotify.music.features.connect.discovery.g.d
    public void a(boolean z) {
        this.a.onNext(z ? DiscoveredDeviceConnectionStatus.CONNECTED : DiscoveredDeviceConnectionStatus.NOT_CONNECTED);
    }

    public s<DiscoveredDeviceConnectionStatus> b() {
        return this.a;
    }
}
