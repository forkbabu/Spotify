package com.spotify.music.nowplaying.podcast.mixedmedia.player;

import com.spotify.paste.widgets.b;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

public final class g implements f {
    private final io.reactivex.g<e> a;
    private final io.reactivex.g<PlayerState> b;

    static final class a<T, R> implements l<PlayerState, e> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public e apply(PlayerState playerState) {
            PlayerState playerState2 = playerState;
            h.e(playerState2, "playerState");
            String contextUri = playerState2.contextUri();
            h.d(contextUri, "playerState.contextUri()");
            boolean g = iyb.g(playerState2);
            String e = b.e(playerState2);
            h.e(playerState2, "$this$segmentIndex");
            String str = iyb.f(playerState2).get(ContextTrack.Metadata.KEY_SEGMENT_INDEX);
            Integer num = null;
            if (str != null) {
                try {
                    num = Integer.valueOf(Integer.parseInt(str));
                } catch (NumberFormatException unused) {
                }
            }
            return new e(contextUri, g, e, num);
        }
    }

    public g(io.reactivex.g<PlayerState> gVar) {
        h.e(gVar, "playerStateFlowable");
        this.b = gVar;
        this.a = gVar.O(a.a).s().Z();
    }

    @Override // com.spotify.music.nowplaying.podcast.mixedmedia.player.f
    public io.reactivex.g<e> a() {
        return this.a;
    }
}
