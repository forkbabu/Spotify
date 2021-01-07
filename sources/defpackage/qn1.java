package defpackage;

import com.spotify.mobile.android.observablestates.docking.DockingStatus;
import com.spotify.mobile.android.service.SpotifyServiceCommandHandlingStatus;
import com.spotify.mobile.android.service.k;
import com.spotify.music.features.connect.discovery.DiscoveredDeviceConnectionStatus;
import com.spotify.music.features.offlinesync.e;
import com.spotify.music.playback.api.LocalPlaybackStatus;
import com.spotify.music.playback.api.RemotePlaybackStatus;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: qn1  reason: default package */
public final class qn1 implements fjf<pn1> {
    private final wlf<e> a;
    private final wlf<y> b;
    private final wlf<s<Boolean>> c;
    private final wlf<s<DiscoveredDeviceConnectionStatus>> d;
    private final wlf<s<SpotifyServiceCommandHandlingStatus>> e;
    private final wlf<j4a> f;
    private final wlf<s<DockingStatus>> g;
    private final wlf<s<LocalPlaybackStatus>> h;
    private final wlf<s<RemotePlaybackStatus>> i;
    private final wlf<er0> j;
    private final wlf<k> k;
    private final wlf<zw9> l;

    public qn1(wlf<e> wlf, wlf<y> wlf2, wlf<s<Boolean>> wlf3, wlf<s<DiscoveredDeviceConnectionStatus>> wlf4, wlf<s<SpotifyServiceCommandHandlingStatus>> wlf5, wlf<j4a> wlf6, wlf<s<DockingStatus>> wlf7, wlf<s<LocalPlaybackStatus>> wlf8, wlf<s<RemotePlaybackStatus>> wlf9, wlf<er0> wlf10, wlf<k> wlf11, wlf<zw9> wlf12) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
        this.k = wlf11;
        this.l = wlf12;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pn1(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get());
    }
}
