package com.spotify.music.features.nowplayingbar.eventsources;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.nowplayingbar.domain.Track;
import com.spotify.music.features.nowplayingbar.domain.b;
import com.spotify.music.features.nowplayingbar.domain.g;
import com.spotify.music.features.nowplayingbar.domain.h;
import com.spotify.music.features.nowplayingbar.domain.i;
import com.spotify.music.features.nowplayingbar.domain.j;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import io.reactivex.functions.l;

/* access modifiers changed from: package-private */
public final class d<T, R> implements l<PlayerState, h> {
    final /* synthetic */ cmf a;

    d(cmf cmf) {
        this.a = cmf;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public h apply(PlayerState playerState) {
        PlayerState playerState2 = playerState;
        kotlin.jvm.internal.h.e(playerState2, "it");
        cmf cmf = this.a;
        kotlin.jvm.internal.h.e(playerState2, "playerState");
        kotlin.jvm.internal.h.e(cmf, "currentTimeMs");
        ContextTrack orNull = playerState2.track().orNull();
        if (orNull == null || kxd.q(orNull) == null) {
            return h.a.a;
        }
        String contextUri = playerState2.contextUri();
        kotlin.jvm.internal.h.d(contextUri, "playerState.contextUri()");
        ImmutableList<ContextTrack> prevTracks = playerState2.prevTracks();
        kotlin.jvm.internal.h.d(prevTracks, "playerState.prevTracks()");
        ContextTrack contextTrack = (ContextTrack) kotlin.collections.d.r(prevTracks);
        Track track = null;
        Track b = contextTrack != null ? b.b(contextTrack) : null;
        ContextTrack contextTrack2 = playerState2.track().get();
        kotlin.jvm.internal.h.d(contextTrack2, "playerState.track().get()");
        Track b2 = b.b(contextTrack2);
        ImmutableList<ContextTrack> nextTracks = playerState2.nextTracks();
        kotlin.jvm.internal.h.d(nextTracks, "playerState.nextTracks()");
        ContextTrack contextTrack3 = (ContextTrack) kotlin.collections.d.l(nextTracks);
        if (contextTrack3 != null) {
            track = b.b(contextTrack3);
        }
        j jVar = new j(b, b2, track);
        kotlin.jvm.internal.h.e(playerState2, "playerState");
        kotlin.jvm.internal.h.e(cmf, "currentTimeMs");
        boolean z = !playerState2.isPaused();
        Long or = playerState2.duration().or((Optional<Long>) 0L);
        kotlin.jvm.internal.h.d(or, "playerState.duration().or(0L)");
        long longValue = or.longValue();
        Long or2 = playerState2.position(((Number) cmf.invoke()).longValue()).or((Optional<Long>) 0L);
        kotlin.jvm.internal.h.d(or2, "playerState.position(cur…ntTimeMs.invoke()).or(0L)");
        g gVar = new g(z, longValue, or2.longValue(), (float) playerState2.playbackSpeed().or((Optional<Double>) Double.valueOf(0.0d)).doubleValue());
        Restrictions restrictions = playerState2.restrictions();
        kotlin.jvm.internal.h.d(restrictions, "playerState.restrictions()");
        kotlin.jvm.internal.h.e(restrictions, "restrictions");
        return new h.b(contextUri, jVar, gVar, new i(!restrictions.disallowResumingReasons().isEmpty(), !restrictions.disallowPausingReasons().isEmpty(), !restrictions.disallowSkippingNextReasons().isEmpty(), !restrictions.disallowSkippingPrevReasons().isEmpty(), !restrictions.disallowPeekingNextReasons().isEmpty(), !restrictions.disallowPeekingPrevReasons().isEmpty(), !restrictions.disallowTransferringPlaybackReasons().isEmpty()));
    }
}
