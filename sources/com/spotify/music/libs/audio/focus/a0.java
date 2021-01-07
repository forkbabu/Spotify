package com.spotify.music.libs.audio.focus;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.music.libs.audio.focus.MediaFocusManager;
import com.spotify.music.playback.api.LocalPlaybackStatus;
import com.spotify.player.controls.c;
import com.spotify.player.model.AudioStream;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.y;

public class a0 implements d, y {
    private final Context a;
    private final wlf<com.spotify.player.controls.d> b;
    private final MediaFocusManager c;
    private final s<LocalPlaybackStatus> f;
    private final g<PlayerState> n;
    private final y o;
    private final q p = new q();
    private AudioStream q = AudioStream.DEFAULT;
    private MediaFocusManager.ContentType r = MediaFocusManager.ContentType.DEFAULT;
    private boolean s;
    private final BroadcastReceiver t = new a();

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Logger.n("Audio has become noisy - headset probably removed", new Object[0]);
            if (a0.this.b.get() != null) {
                a0.this.p.a(((com.spotify.player.controls.d) a0.this.b.get()).a(c.c()).subscribe());
            }
        }
    }

    public a0(Context context, wlf<com.spotify.player.controls.d> wlf, MediaFocusManager mediaFocusManager, s<LocalPlaybackStatus> sVar, g<PlayerState> gVar, y yVar) {
        this.a = context.getApplicationContext();
        this.b = wlf;
        this.c = mediaFocusManager;
        this.f = sVar;
        this.n = gVar;
        this.o = yVar;
    }

    public static void e(a0 a0Var, PlayerState playerState) {
        AudioStream audioStream = a0Var.q;
        if (playerState.audioStream() != null && playerState.isPlaying() && !playerState.isPaused()) {
            audioStream = playerState.audioStream();
        }
        V or = playerState.track().transform(a.a).transform(n.a).transform(l.a).or((Optional<V>) a0Var.r);
        if (audioStream != a0Var.q || or != a0Var.r) {
            a0Var.q = audioStream;
            a0Var.r = or;
            if (a0Var.c.i()) {
                Logger.b("Request audio focus", new Object[0]);
                a0Var.c.k(a0Var.q, a0Var.r);
            }
        }
    }

    public static void f(a0 a0Var, LocalPlaybackStatus localPlaybackStatus) {
        a0Var.getClass();
        if (localPlaybackStatus == LocalPlaybackStatus.PLAYING) {
            Logger.b("Request audio focus", new Object[0]);
            a0Var.c.k(a0Var.q, a0Var.r);
            if (!a0Var.s) {
                a0Var.a.registerReceiver(a0Var.t, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                a0Var.s = true;
            }
        } else if (a0Var.s) {
            a0Var.a.unregisterReceiver(a0Var.t);
            a0Var.s = false;
        }
    }

    @Override // com.spotify.music.libs.audio.focus.y
    public AudioStream a() {
        return this.q;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.p.b(this.n.Q(this.o).subscribe(new k(this)), this.f.o0(this.o).subscribe(new m(this)));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.p.c();
        if (this.s) {
            this.a.unregisterReceiver(this.t);
            this.s = false;
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "MediaFocusManager";
    }
}
