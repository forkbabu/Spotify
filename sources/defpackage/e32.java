package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.playlist.models.a;
import com.spotify.playlist.models.b;
import io.reactivex.functions.l;
import java.util.HashMap;

/* renamed from: e32  reason: default package */
public final /* synthetic */ class e32 implements l {
    public final /* synthetic */ String a;
    public final /* synthetic */ y3 b;

    public /* synthetic */ e32(String str, y3 y3Var) {
        this.a = str;
        this.b = y3Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        String str = this.a;
        y3 y3Var = this.b;
        u3 u3Var = (u3) obj;
        if (str == null) {
            return y3.b(y3Var, u3Var.a);
        }
        S s = u3Var.b;
        if (s != null) {
            ImmutableMap.Builder builder = ImmutableMap.builder();
            HashMap hashMap = new HashMap(y3Var.d());
            builder.mo51put("audio_track_uri_in_collection", String.valueOf(s.isInCollection()));
            ImmutableList<b> artists = s.getArtists();
            if (artists != null && !artists.isEmpty()) {
                builder.mo51put("audio_track_artist_name", artists.get(0).f());
                builder.mo51put("audio_track_artist_uri", artists.get(0).getUri());
            }
            a album = s.getAlbum();
            builder.mo51put("audio_track_album_name", album.g());
            builder.mo51put("audio_track_album_uri", album.getUri());
            builder.putAll(hashMap);
            y3Var = y3.l(y3Var.i(), y3Var.j(), y3Var.g(), y3Var.e(), false, builder.build());
        }
        return y3.b(y3Var, u3Var.a);
    }
}
