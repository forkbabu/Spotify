package defpackage;

import com.spotify.music.lyrics.core.experience.model.LyricsWrapper;
import io.reactivex.z;

/* renamed from: ocb  reason: default package */
public interface ocb {
    @zqf("color-lyrics/v1/track/{trackId}/image/{imageUri}")
    z<LyricsWrapper> a(@mrf("trackId") String str, @mrf("imageUri") String str2, @nrf("vocalRemoval") boolean z, @nrf("syllableSync") boolean z2);

    @zqf("color-lyrics/v1/track/{trackId}")
    z<LyricsWrapper> b(@mrf("trackId") String str, @nrf("vocalRemoval") boolean z, @nrf("syllableSync") boolean z2);
}
