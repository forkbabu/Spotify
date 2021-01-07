package com.spotify.music.autoplay;

import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* access modifiers changed from: package-private */
public class g0 implements l<PlayerState, RadioSeedBundle> {
    g0() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public RadioSeedBundle apply(PlayerState playerState) {
        PlayerState playerState2 = playerState;
        String contextUri = playerState2.contextUri();
        String str = playerState2.playbackId().get();
        if (ViewUris.s1.a(contextUri) || ViewUris.r1.a(contextUri)) {
            StringBuilder V0 = je.V0("spotify:");
            V0.append(contextUri.substring(contextUri.indexOf(":collection:") + 12));
            return RadioSeedBundle.create(V0.toString(), str, ixd.a(playerState2.playOrigin()));
        } else if (ViewUris.o0.a(contextUri) || ViewUris.m1.a(contextUri)) {
            return RadioSeedBundle.create(playerState2.track().get().uri(), str, ixd.a(playerState2.playOrigin()));
        } else {
            return RadioSeedBundle.create(contextUri, str, ixd.a(playerState2.playOrigin()));
        }
    }
}
