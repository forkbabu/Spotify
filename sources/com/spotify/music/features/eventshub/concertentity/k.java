package com.spotify.music.features.eventshub.concertentity;

import android.net.Uri;
import com.spotify.music.features.eventshub.model.ConcertEntityModel;
import com.spotify.music.features.eventshub.model.ConcertResult;
import com.spotify.music.libs.common.presenter.e;

public interface k extends e<ConcertEntityModel> {
    void D(Uri uri);

    void E0();

    void j(ConcertResult concertResult);
}
