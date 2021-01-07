package com.spotify.music.podcast.player.trailer.impl;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.podcast.player.trailer.impl.i;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerQueue;
import com.spotify.player.model.command.SetQueueCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.queue.f;
import io.reactivex.functions.l;
import io.reactivex.z;
import kotlin.jvm.internal.h;

public final class PlayerApiQueueComposer implements i {
    private final f a;

    static final class a<T, R> implements l<PlayerQueue, PlayerQueue> {
        final /* synthetic */ PlayerApiQueueComposer a;
        final /* synthetic */ ContextTrack b;

        a(PlayerApiQueueComposer playerApiQueueComposer, ContextTrack contextTrack) {
            this.a = playerApiQueueComposer;
            this.b = contextTrack;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public PlayerQueue apply(PlayerQueue playerQueue) {
            PlayerQueue playerQueue2 = playerQueue;
            h.e(playerQueue2, "playerQueue");
            PlayerApiQueueComposer playerApiQueueComposer = this.a;
            ContextTrack contextTrack = this.b;
            playerApiQueueComposer.getClass();
            int i = ImmutableList.a;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            if (!kxd.k(contextTrack)) {
                ImmutableMap.Builder builder2 = ImmutableMap.builder();
                builder2.putAll(contextTrack.metadata());
                builder2.mo51put("is_queued", String.valueOf(true));
                contextTrack = contextTrack.toBuilder().metadata(builder2.build()).build();
                h.d(contextTrack, "toBuilder().metadata(mapBuilder.build()).build()");
            }
            builder.mo53add((ImmutableList.Builder) contextTrack);
            Optional<ContextTrack> track = playerQueue2.track();
            h.d(track, "currentTrack");
            if (track.isPresent()) {
                builder.mo53add((ImmutableList.Builder) track.get());
            }
            builder.addAll((Iterable) playerQueue2.nextTracks());
            PlayerQueue build = PlayerQueue.builder().prevTracks(playerQueue2.prevTracks()).nextTracks(builder.build()).revision(playerQueue2.revision()).build();
            h.d(build, "PlayerQueue.builder()\n  …n())\n            .build()");
            return build;
        }
    }

    public PlayerApiQueueComposer(f fVar) {
        h.e(fVar, "queueInteractor");
        this.a = fVar;
    }

    public static final z b(PlayerApiQueueComposer playerApiQueueComposer, PlayerQueue playerQueue) {
        z<zwd> b = playerApiQueueComposer.a.b(SetQueueCommand.create(playerQueue).toBuilder().options(CommandOptions.builder().overrideRestrictions(true).build()).build());
        h.d(b, "queueInteractor.setQueue…       .build()\n        )");
        return b;
    }

    @Override // com.spotify.music.podcast.player.trailer.impl.i
    public z<i.a> a(ContextTrack contextTrack) {
        h.e(contextTrack, "trailerTrack");
        z<R> A = this.a.a().E().A(new a(this, contextTrack)).s(new d(new PlayerApiQueueComposer$insertTrailerIntoQueue$2(this))).A(new d(new PlayerApiQueueComposer$insertTrailerIntoQueue$3(this)));
        h.d(A, "queueInteractor\n        …ndResultToComposerResult)");
        return A;
    }
}
