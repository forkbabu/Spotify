package com.spotify.music.features.voice;

import com.google.common.base.Optional;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

public final /* synthetic */ class c implements l {
    public static final /* synthetic */ c a = new c();

    private /* synthetic */ c() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        int i = VoiceActivity.J;
        Optional<ContextTrack> track = ((PlayerState) obj).track();
        return track.isPresent() ? track.get().uri() : "";
    }
}
