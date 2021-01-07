package com.spotify.music.playback.api;

import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.player.extras.transformers.PlayerStateTransformers;
import com.spotify.player.model.PlayerState;
import io.reactivex.disposables.b;
import io.reactivex.g;
import io.reactivex.y;

public class c implements d, e {
    private final g<PlayerState> a;
    private final y b;
    private boolean c;
    private b f;

    public c(g<PlayerState> gVar, y yVar) {
        this.a = gVar;
        this.b = yVar;
    }

    @Override // com.spotify.music.playback.api.e
    public boolean a() {
        return this.c;
    }

    public /* synthetic */ void b(Boolean bool) {
        this.c = bool.booleanValue();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.f = this.a.l(PlayerStateTransformers.e()).Q(this.b).subscribe(new a(this));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.f.dispose();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "PlaybackStatusObserver";
    }
}
