package com.spotify.music.libs.audio.focus;

import com.spotify.music.playback.api.RemotePlaybackStatus;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;
import java.util.Random;

public final class s implements fjf<io.reactivex.s<AudioDriverStatus>> {
    public static t a(g<PlayerState> gVar, io.reactivex.s<AudioDriverStatus> sVar, io.reactivex.s<RemotePlaybackStatus> sVar2, y yVar, Random random) {
        return new t(gVar, sVar, sVar2, yVar, random);
    }

    public static w b(v vVar, z zVar) {
        return new w(vVar, zVar);
    }
}
