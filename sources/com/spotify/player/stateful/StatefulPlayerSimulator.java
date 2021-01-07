package com.spotify.player.stateful;

import android.os.Handler;
import com.google.common.base.Optional;
import com.spotify.player.model.ContextIndex;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlaybackQuality;
import com.spotify.player.model.PlayerOptions;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import com.spotify.player.options.RepeatMode;
import com.spotify.rxjava2.p;
import io.reactivex.g;
import io.reactivex.internal.functions.Functions;
import io.reactivex.processors.PublishProcessor;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public class StatefulPlayerSimulator {
    private static final long n = TimeUnit.SECONDS.toMillis(3);
    public static final /* synthetic */ int o = 0;
    private final g<PlayerState> a;
    private final cqe b;
    private final t c;
    private final u d;
    private final Handler e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private PlayerState j = PlayerState.EMPTY;
    private Runnable k = m.a;
    private final p l = new p();
    private final PublishProcessor<PlayerState> m = PublishProcessor.r0();

    /* access modifiers changed from: private */
    public enum StateOrigin {
        LOCAL,
        REMOTE
    }

    StatefulPlayerSimulator(g<PlayerState> gVar, cqe cqe, t tVar, u uVar, Handler handler) {
        this.a = gVar;
        this.b = cqe;
        this.c = tVar;
        this.d = uVar;
        this.e = handler;
    }

    public static void a(StatefulPlayerSimulator statefulPlayerSimulator, PlayerState playerState) {
        statefulPlayerSimulator.l(playerState, StateOrigin.REMOTE, false);
    }

    private void l(PlayerState playerState, StateOrigin stateOrigin, boolean z) {
        StateOrigin stateOrigin2 = StateOrigin.REMOTE;
        if (stateOrigin == stateOrigin2) {
            this.f = playerState.isPaused();
            this.h = playerState.options().repeatingTrack();
            this.i = playerState.options().repeatingContext();
            this.g = playerState.options().shufflingContext();
            this.c.d(playerState);
            this.d.g(playerState, z);
        }
        boolean f2 = this.d.f();
        this.e.removeCallbacks(this.k);
        if (stateOrigin != stateOrigin2 || f2 || z) {
            long d2 = this.b.d();
            boolean f3 = this.d.f();
            PlayerState.Builder options = PlayerState.builder().timestamp(d2).contextUri(playerState.contextUri()).contextUrl(playerState.contextUrl()).contextRestrictions(playerState.contextRestrictions()).playOrigin(playerState.playOrigin()).isPlaying(playerState.isPlaying()).isPaused(this.f).isBuffering(playerState.isBuffering()).isSystemInitiated(playerState.isSystemInitiated()).options(PlayerOptions.builder().shufflingContext(this.g).repeatingContext(this.i).repeatingTrack(this.h).build());
            Restrictions restrictions = playerState.restrictions();
            Restrictions.Builder builder = restrictions.toBuilder();
            HashSet hashSet = new HashSet(restrictions.disallowPausingReasons());
            if (this.f) {
                hashSet.add("already_paused");
            } else {
                hashSet.remove("already_paused");
            }
            Restrictions.Builder disallowPausingReasons = builder.disallowPausingReasons(hashSet);
            HashSet hashSet2 = new HashSet(restrictions.disallowResumingReasons());
            if (this.f) {
                hashSet2.remove("not_paused");
            } else {
                hashSet2.add("not_paused");
            }
            PlayerState.Builder audioStream = options.restrictions(disallowPausingReasons.disallowResumingReasons(hashSet2).build()).suppressions(playerState.suppressions()).prevTracks(this.d.d()).nextTracks(this.d.a()).contextMetadata(playerState.contextMetadata()).pageMetadata(playerState.pageMetadata()).sessionId(playerState.sessionId()).queueRevision(playerState.queueRevision()).audioStream(playerState.audioStream());
            Optional<ContextTrack> e2 = this.d.e();
            if (e2.isPresent()) {
                audioStream.track(e2.get());
                Optional<String> c2 = this.d.c();
                if (c2.isPresent()) {
                    audioStream.playbackId(c2.get());
                }
                Optional<PlaybackQuality> playbackQuality = playerState.playbackQuality();
                if (playbackQuality.isPresent()) {
                    audioStream.playbackQuality(playbackQuality.get());
                }
                Optional<ContextIndex> b2 = this.d.b();
                if (b2.isPresent()) {
                    audioStream.index(b2.get());
                }
            }
            if (f3) {
                Optional<Long> a2 = this.c.a(d2);
                if (a2.isPresent()) {
                    audioStream.positionAsOfTimestamp(a2.get());
                }
                Optional<Long> duration = playerState.duration();
                if (duration.isPresent()) {
                    audioStream.duration(duration.get());
                }
                Optional<Double> b3 = !this.f ? this.c.b() : Optional.of(Double.valueOf(0.0d));
                if (b3.isPresent()) {
                    audioStream.playbackSpeed(b3.get());
                }
            }
            PlayerState build = audioStream.build();
            this.j = build;
            this.m.onNext(build);
            return;
        }
        p pVar = new p(this, playerState, stateOrigin);
        this.k = pVar;
        this.e.postDelayed(pVar, 200);
    }

    public /* synthetic */ void b(vpf vpf) {
        this.l.b(this.a.subscribe(new o(this)));
    }

    public /* synthetic */ void c(PlayerState playerState, StateOrigin stateOrigin) {
        l(playerState, stateOrigin, true);
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.f = true;
        l(this.j, StateOrigin.LOCAL, false);
    }

    /* access modifiers changed from: package-private */
    public g<PlayerState> e() {
        g<PlayerState> z = this.m.z(new n(this), Functions.f, Functions.c);
        p pVar = this.l;
        pVar.getClass();
        return z.v(new a(pVar)).V(1).r0();
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f = false;
        l(this.j, StateOrigin.LOCAL, false);
    }

    /* access modifiers changed from: package-private */
    public void g(long j2) {
        this.c.c(j2);
        l(this.j, StateOrigin.LOCAL, false);
    }

    /* access modifiers changed from: package-private */
    public void h(RepeatMode repeatMode) {
        int ordinal = repeatMode.ordinal();
        if (ordinal == 1) {
            this.i = true;
            this.h = false;
        } else if (ordinal != 2) {
            this.i = false;
            this.h = false;
        } else {
            this.i = true;
            this.h = true;
        }
        l(this.j, StateOrigin.LOCAL, false);
    }

    /* access modifiers changed from: package-private */
    public void i(boolean z) {
        this.g = z;
        l(this.j, StateOrigin.LOCAL, false);
    }

    /* access modifiers changed from: package-private */
    public void j() {
        this.d.h();
        l(this.j, StateOrigin.LOCAL, false);
    }

    /* access modifiers changed from: package-private */
    public void k(boolean z) {
        if (!z || this.j.position(this.b.d()).or((Optional<Long>) 0L).longValue() < n) {
            this.d.i();
        } else {
            this.c.c(0);
        }
        l(this.j, StateOrigin.LOCAL, false);
    }
}
