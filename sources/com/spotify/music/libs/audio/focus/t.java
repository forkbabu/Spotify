package com.spotify.music.libs.audio.focus;

import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.music.playback.api.RemotePlaybackStatus;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.y;
import java.util.Random;

public class t implements d {
    private final g<PlayerState> a;
    private final s<AudioDriverStatus> b;
    private final s<RemotePlaybackStatus> c;
    private final y f;
    private final q n = new q();

    t(g<PlayerState> gVar, s<AudioDriverStatus> sVar, s<RemotePlaybackStatus> sVar2, y yVar, Random random) {
        this.a = gVar;
        this.b = sVar;
        this.c = sVar2;
        this.f = yVar;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.n.b(this.a.Q(this.f).subscribe(new c(this)), this.b.o0(this.f).subscribe(new b(this)), this.c.o0(this.f).subscribe(new d(this)));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.n.c();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "PlaybackStatesVerifier";
    }
}
