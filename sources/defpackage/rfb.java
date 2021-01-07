package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.music.lyrics.vocalremoval.model.KaraokeState;
import com.spotify.music.lyrics.vocalremoval.model.KaraokeStatus;
import com.spotify.music.lyrics.vocalremoval.model.KaraokeVocalVolume;
import io.reactivex.a;
import io.reactivex.s;

@CosmosService
/* renamed from: rfb  reason: default package */
public interface rfb {
    @POST("sp://karaoke/status")
    a a(@Body KaraokeStatus karaokeStatus);

    @POST("sp://karaoke/vocal-volume")
    a b(@Body KaraokeVocalVolume karaokeVocalVolume);

    @SUB("sp://karaoke/events")
    s<KaraokeState> events();
}
