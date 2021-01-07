package com.spotify.music.libs.collection.played;

import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.music.json.g;

public final class f {
    public static void a(PlayedStateService playedStateService, FireAndForgetResolver fireAndForgetResolver) {
        playedStateService.b = fireAndForgetResolver;
    }

    public static void b(PlayedStateService playedStateService, g gVar) {
        playedStateService.a = gVar;
    }
}
