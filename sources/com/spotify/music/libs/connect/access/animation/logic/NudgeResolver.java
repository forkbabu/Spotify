package com.spotify.music.libs.connect.access.animation.logic;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.w;
import com.spotify.music.libs.connect.access.k;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.p;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.y;

public class NudgeResolver implements m {
    private final s<Boolean> a;
    private final g<PlayerState> b;
    private final y c;
    private final p f = new p();
    private final p n = new p();
    private a o;
    private Boolean p;
    private boolean q = true;

    public interface a {
    }

    public NudgeResolver(s<Boolean> sVar, g<PlayerState> gVar, y yVar) {
        this.a = sVar;
        this.b = gVar;
        this.c = yVar;
    }

    public /* synthetic */ void a(Boolean bool) {
        if (!bool.booleanValue()) {
            this.q = true;
        }
    }

    public void b(PlayerState playerState) {
        boolean isPaused = playerState.isPaused();
        Boolean bool = this.p;
        if (bool != null && bool.booleanValue() && !isPaused && this.q) {
            ((k) this.o).a.i();
            this.q = false;
        }
        this.p = Boolean.valueOf(isPaused);
    }

    public void c(a aVar) {
        this.o = aVar;
    }

    /* access modifiers changed from: package-private */
    @w(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        this.f.b(this.a.o0(this.c).subscribe(new b(this)));
    }

    /* access modifiers changed from: package-private */
    @w(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.f.a();
    }

    @w(Lifecycle.Event.ON_START)
    public void onStart() {
        this.n.b(this.b.Q(this.c).subscribe(new a(this)));
    }

    @w(Lifecycle.Event.ON_STOP)
    public void onStop() {
        this.n.a();
    }
}
