package defpackage;

import com.spotify.music.artist.model.ArtistModel;
import io.reactivex.z;

/* renamed from: zj2  reason: default package */
public interface zj2 {
    @zqf("artist/v1/{artistId}/android?format=json&release_window=true")
    z<ArtistModel> a(@mrf("artistId") String str);
}
