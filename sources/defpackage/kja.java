package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;

/* renamed from: kja  reason: default package */
public class kja {
    private final Context a;

    public kja(Context context) {
        this.a = context;
    }

    public String a(PlayerState playerState, ImmutableMap<String, String> immutableMap, String str, Optional<pja> optional) {
        String str2 = playerState.contextMetadata().get("context_description");
        if (str2 != null) {
            return str2;
        }
        if (l0.b(str, LinkType.ALBUM)) {
            return immutableMap.get("album_title");
        }
        if (l0.b(str, LinkType.ARTIST)) {
            return immutableMap.get(ContextTrack.Metadata.KEY_ALBUM_ARTIST_NAME);
        }
        if (l0.b(str, LinkType.COLLECTION_TRACKS)) {
            return this.a.getString(C0707R.string.collection_liked_songs_title);
        }
        return (!l0.b(str, LinkType.SHOW_SHOW) || !optional.isPresent()) ? str2 : optional.get().b();
    }
}
