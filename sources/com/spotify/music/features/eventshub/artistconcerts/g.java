package com.spotify.music.features.eventshub.artistconcerts;

import com.spotify.music.features.eventshub.model.ArtistConcertsModel;
import com.spotify.music.features.eventshub.model.ConcertResult;
import com.spotify.music.libs.common.presenter.e;

public interface g extends e<ArtistConcertsModel> {
    void I(String str);

    void j(ConcertResult concertResult);
}
