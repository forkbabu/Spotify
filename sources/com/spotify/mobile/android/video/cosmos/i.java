package com.spotify.mobile.android.video.cosmos;

import com.google.common.base.Optional;
import com.spotify.mobile.android.video.StreamingType;
import com.spotify.mobile.android.video.a0;
import com.spotify.mobile.android.video.cosmos.j;
import com.spotify.mobile.android.video.d0;
import com.spotify.mobile.android.video.e0;
import com.spotify.mobile.android.video.events.ReasonEnd;
import com.spotify.mobile.android.video.events.f0;
import com.spotify.mobile.android.video.events.g0;
import com.spotify.mobile.android.video.events.h0;
import com.spotify.mobile.android.video.exception.BetamaxException;
import com.spotify.mobile.android.video.exception.ErrorType;
import com.spotify.mobile.android.video.i0;
import com.spotify.mobile.android.video.model.PlayerError;
import com.spotify.mobile.android.video.model.PlayerState;
import com.spotify.mobile.android.video.model.VideoPlayerCommand;
import com.spotify.mobile.android.video.r;
import com.spotify.mobile.android.video.s;
import com.spotify.mobile.android.video.v;
import io.reactivex.disposables.b;
import io.reactivex.y;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class i implements f0, j.a {
    private static final Set<String> w = Collections.unmodifiableSet(new HashSet(Arrays.asList("video/webm", "video/mp4", "video/3gpp")));
    private final y a;
    private final s b;
    private final l72 c;
    private final j f;
    private final k n;
    private r o;
    private Optional<e0> p = Optional.absent();
    private Optional<Long> q = Optional.absent();
    private Optional<b> r = Optional.absent();
    private boolean s;
    private Optional<i0> t = Optional.absent();
    private h0 u;
    private final l v;

    class a extends h0 {
        final /* synthetic */ com.spotify.mobile.android.video.f0 f;
        final /* synthetic */ d0 n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d0 d0Var, a0 a0Var, com.spotify.mobile.android.video.f0 f0Var, d0 d0Var2) {
            super(d0Var, a0Var);
            this.f = f0Var;
            this.n = d0Var2;
        }

        private void z() {
            if (i.this.r.isPresent()) {
                ((b) i.this.r.get()).dispose();
                i.this.r = Optional.absent();
            }
        }

        @Override // com.spotify.mobile.android.video.events.h0, com.spotify.mobile.android.video.events.e0
        public void c(long j) {
            super.c(j);
            i.a(i.this, g());
        }

        @Override // com.spotify.mobile.android.video.events.h0, com.spotify.mobile.android.video.events.e0
        public void e(long j, long j2) {
            super.e(j, j2);
            i.a(i.this, g());
        }

        @Override // com.spotify.mobile.android.video.events.h0, com.spotify.mobile.android.video.events.e0
        public void l(BetamaxException betamaxException, long j, long j2) {
            super.l(betamaxException, j, j2);
            i.a(i.this, g());
            ErrorType a = betamaxException.a();
            if (a == ErrorType.ERROR_AUDIO_ONLY_NOT_ALLOWED) {
                i.this.n.b(k.e);
            } else if (a == ErrorType.ERROR_MANIFEST_DELETED) {
                i.this.n.b(k.f);
            } else if (a == ErrorType.ERROR_UNAVAILABLE) {
                i.this.n.b(k.f);
            } else if (a != ErrorType.ERROR_IN_OFFLINE_MODE) {
                i.this.n.c(PlayerError.fromVideoPlaybackError(betamaxException, this.n));
            }
        }

        @Override // com.spotify.mobile.android.video.events.h0, com.spotify.mobile.android.video.events.e0
        public void m(boolean z, long j) {
            super.m(z, j);
            i.a(i.this, g());
        }

        @Override // com.spotify.mobile.android.video.events.h0, com.spotify.mobile.android.video.events.e0
        public void o(BetamaxException betamaxException, long j, long j2) {
            super.o(betamaxException, j, j2);
            i.a(i.this, g());
            i.this.n.c(PlayerError.fromVideoPlaybackError(betamaxException, this.n));
        }

        @Override // com.spotify.mobile.android.video.events.h0, com.spotify.mobile.android.video.events.e0
        public void p(v vVar, ReasonEnd reasonEnd, long j, long j2) {
            super.p(vVar, reasonEnd, j, j2);
            z();
            i.a(i.this, g());
            if (reasonEnd == ReasonEnd.PLAYED_TO_END) {
                i.this.n.b(k.d);
            }
        }

        @Override // com.spotify.mobile.android.video.events.h0, com.spotify.mobile.android.video.events.e0
        public void q(StreamingType streamingType, long j, long j2) {
            super.q(streamingType, j, j2);
            z();
            i.a(i.this, g());
            i.this.v.f(this.f);
        }

        @Override // com.spotify.mobile.android.video.events.h0, com.spotify.mobile.android.video.events.e0
        public void s(float f2, long j, long j2) {
            super.s(f2, j, j2);
            i.a(i.this, g());
        }

        @Override // com.spotify.mobile.android.video.events.h0, com.spotify.mobile.android.video.events.e0
        public void w(long j, long j2) {
            super.w(j, j2);
            i.a(i.this, g());
            if (!g().c()) {
                z();
                if (i.this.q.isPresent()) {
                    i iVar = i.this;
                    iVar.r = Optional.of(io.reactivex.s.X0(((Long) iVar.q.get()).longValue(), TimeUnit.SECONDS, i.this.a).subscribe(new b(this), a.a));
                }
            }
        }

        @Override // com.spotify.mobile.android.video.events.h0, com.spotify.mobile.android.video.events.e0
        public void x(long j, long j2) {
            super.x(j, j2);
            z();
            i.a(i.this, g());
        }
    }

    public i(j jVar, k kVar, s sVar, l72 l72, y yVar, List<f0> list, l lVar) {
        this.f = jVar;
        this.n = kVar;
        this.b = sVar;
        this.c = l72;
        this.a = yVar;
        list.add(0, this);
        sVar.c(list);
        this.v = lVar;
    }

    static void a(i iVar, g0 g0Var) {
        if (iVar.f.b()) {
            iVar.n.d(PlayerState.fromPlaybackState(g0Var));
        }
    }

    private boolean j(e0 e0Var) {
        return Boolean.valueOf(e0Var.e().get("media.live")).booleanValue();
    }

    private void t(VideoPlayerCommand videoPlayerCommand) {
        this.o.E(videoPlayerCommand.configuration.getPlaybackSpeed().or((Optional<Float>) Float.valueOf(1.0f)).floatValue());
    }

    @Override // com.spotify.mobile.android.video.events.f0
    public Optional<com.spotify.mobile.android.video.events.e0> g(d0 d0Var, a0 a0Var, com.spotify.mobile.android.video.f0 f0Var, String str, com.spotify.mobile.android.video.g0 g0Var) {
        a aVar = new a(d0Var, a0Var, f0Var, d0Var);
        this.u = aVar;
        return Optional.of(aVar);
    }

    public void i() {
        this.n.e();
        this.f.d(this);
    }

    public void k(VideoPlayerCommand videoPlayerCommand) {
        if (this.o != null) {
            t(videoPlayerCommand);
        }
        if (videoPlayerCommand.configuration.hasSubtitle()) {
            r rVar = this.o;
            if (rVar != null) {
                rVar.U(videoPlayerCommand.configuration.getSubtitle());
            } else {
                this.t = videoPlayerCommand.configuration.getSubtitle();
            }
        }
    }

    public void l(VideoPlayerCommand videoPlayerCommand) {
        if (this.p.isPresent()) {
            this.o.pause();
        }
    }

    public void m(VideoPlayerCommand videoPlayerCommand) {
        if (this.p.isPresent()) {
            if (j(this.p.get())) {
                this.o.seekTo(Long.MAX_VALUE);
            }
            this.o.resume();
        }
    }

    public void n(VideoPlayerCommand videoPlayerCommand) {
        if (this.p.isPresent()) {
            long j = videoPlayerCommand.seekToInMs;
            Long c2 = this.v.c();
            boolean z = false;
            if (c2 != null && j >= c2.longValue()) {
                z = true;
            }
            if (z) {
                this.v.g();
            }
            this.o.seekTo(j);
        }
    }

    public void o(VideoPlayerCommand videoPlayerCommand) {
        if (this.p.isPresent()) {
            this.v.d(videoPlayerCommand.stopPositionInMs);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:113:0x0115 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.util.List] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0296  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p(com.spotify.mobile.android.video.model.VideoPlayerCommand r19) {
        /*
        // Method dump skipped, instructions count: 798
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.video.cosmos.i.p(com.spotify.mobile.android.video.model.VideoPlayerCommand):void");
    }

    public void q(VideoPlayerCommand videoPlayerCommand) {
        if (this.p.isPresent()) {
            this.o.stop();
        }
    }

    public void r(v vVar) {
        this.n.a();
        this.f.a();
        r rVar = this.o;
        if (rVar != null) {
            rVar.c(vVar);
            this.o = null;
        }
    }

    public void s(boolean z) {
        this.s = z;
        r rVar = this.o;
        if (rVar != null) {
            rVar.A(z);
        }
    }
}
