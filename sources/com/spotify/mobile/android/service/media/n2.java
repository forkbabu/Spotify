package com.spotify.mobile.android.service.media;

import android.content.Context;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerQueue;
import com.spotify.player.queue.f;
import com.spotify.rxjava2.q;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.internal.operators.flowable.k;
import io.reactivex.subjects.a;
import io.reactivex.z;

public class n2 implements p2 {
    private final q a = new q();
    private final f b;
    private final a<Boolean> c = a.h1();

    public n2(f fVar) {
        this.b = fVar;
    }

    private static boolean l(ContextTrack contextTrack) {
        if (contextTrack == null) {
            return false;
        }
        if (LinkType.TRACK == l0.z(contextTrack.uri()).q() || LinkType.SHOW_EPISODE == l0.z(contextTrack.uri()).q()) {
            return true;
        }
        return false;
    }

    public static PlayerQueue n(PlayerQueue playerQueue) {
        ImmutableList<ContextTrack> nextTracks = playerQueue.nextTracks();
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (ContextTrack contextTrack : nextTracks) {
            if (l(contextTrack)) {
                builder.mo53add((ImmutableList.Builder) contextTrack);
            }
        }
        ImmutableList<ContextTrack> prevTracks = playerQueue.prevTracks();
        ImmutableList.Builder builder2 = new ImmutableList.Builder();
        for (ContextTrack contextTrack2 : prevTracks) {
            if (l(contextTrack2)) {
                builder2.mo53add((ImmutableList.Builder) contextTrack2);
            }
        }
        return playerQueue.toBuilder().nextTracks(builder.build()).prevTracks(builder2.build()).build();
    }

    @Override // com.spotify.mobile.android.service.media.p2
    public g<PlayerQueue> b() {
        return this.c.Y0(BackpressureStrategy.BUFFER).f0(new q0(this));
    }

    @Override // com.spotify.mobile.android.service.media.p2
    public void i(Context context, String str) {
        this.a.a(this.b.c(ContextTrack.create(str)).subscribe());
    }

    @Override // com.spotify.mobile.android.service.media.p2
    public z<Optional<ContextTrack>> m(int i) {
        return this.c.Y0(BackpressureStrategy.BUFFER).f0(new p0(this)).E().A(new o0(i));
    }

    public /* synthetic */ tpf o(Boolean bool) {
        if (bool.booleanValue()) {
            return this.b.a().O(r0.a);
        }
        int i = g.b;
        return k.c;
    }

    public /* synthetic */ tpf p(Boolean bool) {
        if (bool.booleanValue()) {
            return this.b.a();
        }
        int i = g.b;
        return k.c;
    }

    @Override // com.spotify.mobile.android.service.media.v2
    public void start() {
        this.c.onNext(Boolean.TRUE);
    }

    @Override // com.spotify.mobile.android.service.media.v2
    public void stop() {
        this.c.onNext(Boolean.FALSE);
    }
}
