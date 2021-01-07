package defpackage;

import com.spotify.music.libs.assistedcuration.model.GenreResponse;
import io.reactivex.z;

/* renamed from: zz9  reason: default package */
public interface zz9 {
    @zqf("playlistextender/v2/top-genre-tracks")
    z<GenreResponse> a(@nrf("max_genres") int i, @nrf("max_artists") int i2, @nrf("max_tracks") int i3, @nrf("title") String str);
}
