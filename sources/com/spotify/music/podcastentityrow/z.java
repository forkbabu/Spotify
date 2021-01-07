package com.spotify.music.podcastentityrow;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.podcastentityrow.w;
import com.spotify.playlist.models.Episode;
import kotlin.jvm.internal.h;

public final class z implements v {
    private final c a;
    private final Player b;
    private final w c;

    public z(c cVar, Player player, w wVar) {
        h.e(cVar, "viewUri");
        h.e(player, "player");
        h.e(wVar, "contextCreator");
        this.a = cVar;
        this.b = player;
        this.c = wVar;
    }

    @Override // com.spotify.music.podcastentityrow.v
    public void a(Episode[] episodeArr, int i) {
        h.e(episodeArr, "episodes");
        w wVar = this.c;
        String cVar = this.a.toString();
        h.d(cVar, "viewUri.toString()");
        w.a a2 = wVar.a(cVar, i, episodeArr);
        this.b.play(a2.b(), a2.a());
    }

    @Override // com.spotify.music.podcastentityrow.v
    public int b(String str, Episode[] episodeArr) {
        h.e(str, "uri");
        h.e(episodeArr, "episodes");
        int length = episodeArr.length;
        for (int i = 0; i < length; i++) {
            if (h.a(str, episodeArr[i].getUri())) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.spotify.music.podcastentityrow.v
    public void pause() {
        this.b.pause();
    }
}
