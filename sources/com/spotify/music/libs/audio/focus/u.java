package com.spotify.music.libs.audio.focus;

import com.spotify.mobile.android.observablestates.localspeaker.LocalSpeakerStatus;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.audio.focus.MediaFocusManager;
import com.spotify.music.playback.api.b;
import com.spotify.music.playback.api.e;
import com.spotify.player.controls.c;
import com.spotify.player.model.AudioStream;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PreparePlayCommand;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.play.f;
import com.spotify.rxjava2.q;
import io.reactivex.d0;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.y;

public class u implements d {
    private final MediaFocusManager a;
    private final y b;
    private final e c;
    private final b f;
    private final ajf<f> n;
    private final ajf<com.spotify.player.controls.d> o;
    private final g<PlayerState> p;
    private final y q;
    private final s<LocalSpeakerStatus> r;
    private final MediaFocusManager.d s = new a();
    private final q t = new q();
    private boolean u;
    private boolean v;

    class a implements MediaFocusManager.d {
        a() {
        }

        @Override // com.spotify.music.libs.audio.focus.MediaFocusManager.d
        public void a() {
            u.a(u.this);
        }

        @Override // com.spotify.music.libs.audio.focus.MediaFocusManager.d
        public void b(boolean z, boolean z2) {
            u.this.v = z;
            if (!z || !z2) {
                u.this.h();
            }
        }
    }

    public u(MediaFocusManager mediaFocusManager, y yVar, e eVar, b bVar, ajf<f> ajf, ajf<com.spotify.player.controls.d> ajf2, g<PlayerState> gVar, y yVar2, s<LocalSpeakerStatus> sVar) {
        this.a = mediaFocusManager;
        this.b = yVar;
        this.c = eVar;
        this.f = bVar;
        this.n = ajf;
        this.o = ajf2;
        this.p = gVar;
        this.q = yVar2;
        this.r = sVar;
    }

    static void a(u uVar) {
        if (uVar.u && uVar.v) {
            if (uVar.b.a() == AudioStream.ALARM) {
                uVar.t.a(uVar.p.D(PlayerState.EMPTY).s(new e(uVar)).s(j.a).subscribe());
            } else {
                uVar.c(c.e());
            }
        }
        uVar.u = false;
    }

    private void c(c cVar) {
        com.spotify.player.controls.d dVar = this.o.get();
        Assertion.e(dVar);
        this.t.a(dVar.a(cVar).subscribe());
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.t.a(this.r.o0(this.q).Q(f.a).subscribe(new g(this)));
        this.a.h(this.s);
    }

    public /* synthetic */ void e(LocalSpeakerStatus localSpeakerStatus) {
        this.v = false;
    }

    public /* synthetic */ d0 f(PlayerState playerState) {
        Context fromUri = Context.fromUri(playerState.contextUri());
        PreparePlayCommand build = PreparePlayCommand.builder(fromUri, playerState.playOrigin()).options(PreparePlayOptions.builder().audioStream(AudioStream.ALARM).build()).build();
        f fVar = this.n.get();
        Assertion.e(fVar);
        return fVar.b(build);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.a.j(this.s);
        this.t.c();
    }

    public void h() {
        if (this.c.a() && this.f.a()) {
            c(c.c());
            this.u = true;
            return;
        }
        this.u = false;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "AudioFocusPlugin";
    }
}
