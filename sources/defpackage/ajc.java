package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.playlist.models.Episode;
import io.reactivex.functions.l;

/* renamed from: ajc  reason: default package */
public final /* synthetic */ class ajc implements l {
    public final /* synthetic */ ijc a;
    public final /* synthetic */ String b;

    public /* synthetic */ ajc(ijc ijc, String str) {
        this.a = ijc;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        ijc ijc = this.a;
        String str = this.b;
        ijc.getClass();
        Episode[] episodeArr = (Episode[]) ((qyd) obj).getItems().toArray(new Episode[0]);
        int length = episodeArr.length;
        PlayerTrack[] playerTrackArr = new PlayerTrack[length];
        for (int i = 0; i < length; i++) {
            Episode episode = episodeArr[i];
            playerTrackArr[i] = PlayerTrack.create(episode.getUri(), ImmutableMap.builder().putAll(episode.m()).mo51put("added_at", Integer.toString(episode.u())).build());
        }
        return PlayerContext.create(str, playerTrackArr, ImmutableMap.of("sorting.criteria", String.format("%s ASC", "added_at")));
    }
}
