package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.functions.l;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: w9b  reason: default package */
public final /* synthetic */ class w9b implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ w9b(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        String str = this.a;
        bab bab = (bab) obj;
        ImmutableMap of = ImmutableMap.of("title", bab.a(), "media.type", "video", "is_backgroundable", "true", "media.live", "true", PlayerTrack.Metadata.MEDIA_MANIFEST, je.y0("[{\"url\": \"", bab.b().replace("{eventid}", str).replace("{format}", ""), "\",\"mimeType\": \"video/mp4\",\"bitrate\": 216000}]"));
        PlayerTrack create = PlayerTrack.create("spotify:live:" + str, of);
        String x0 = je.x0("spotify:playlist:", str);
        PlayerTrack[] playerTrackArr = {create};
        HashSet hashSet = new HashSet(Collections.singletonList("live"));
        return PlayerContext.create(x0, playerTrackArr, new PlayerRestrictions(hashSet, hashSet, hashSet, hashSet, Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), hashSet, Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet(), Collections.emptySet()), Collections.emptyMap());
    }
}
