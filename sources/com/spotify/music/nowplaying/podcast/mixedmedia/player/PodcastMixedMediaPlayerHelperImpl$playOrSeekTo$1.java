package com.spotify.music.nowplaying.podcast.mixedmedia.player;

import com.google.common.base.Optional;
import com.spotify.music.nowplaying.podcast.mixedmedia.player.PodcastMixedMediaPlayerHelperImpl;
import com.spotify.player.model.PlayerState;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;
import kotlin.text.e;

final /* synthetic */ class PodcastMixedMediaPlayerHelperImpl$playOrSeekTo$1 extends FunctionReferenceImpl implements nmf<PlayerState, Optional<PodcastMixedMediaPlayerHelperImpl.a>> {
    PodcastMixedMediaPlayerHelperImpl$playOrSeekTo$1(PodcastMixedMediaPlayerHelperImpl podcastMixedMediaPlayerHelperImpl) {
        super(1, podcastMixedMediaPlayerHelperImpl, PodcastMixedMediaPlayerHelperImpl.class, "toLocalPlayerState", "toLocalPlayerState(Lcom/spotify/player/model/PlayerState;)Lcom/google/common/base/Optional;", 0);
    }

    /* renamed from: e */
    public final Optional<PodcastMixedMediaPlayerHelperImpl.a> invoke(PlayerState playerState) {
        PodcastMixedMediaPlayerHelperImpl.a aVar;
        h.e(playerState, "p1");
        ((PodcastMixedMediaPlayerHelperImpl) this.receiver).getClass();
        String c = iyb.c(playerState);
        if (e.n(c)) {
            aVar = null;
        } else {
            boolean g = iyb.g(playerState);
            h.e(playerState, "$this$isPlayingEpisodeUri");
            h.e(c, "uri");
            boolean z = false;
            if ((c.length() > 0) && h.a(iyb.c(playerState), c) && iyb.g(playerState)) {
                z = true;
            }
            aVar = new PodcastMixedMediaPlayerHelperImpl.a(c, g, z);
        }
        Optional<PodcastMixedMediaPlayerHelperImpl.a> fromNullable = Optional.fromNullable(aVar);
        h.d(fromNullable, "when {\n            curre…tional.fromNullable(it) }");
        return fromNullable;
    }
}
