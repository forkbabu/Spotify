package com.spotify.mobile.android.service.media;

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerQueue;
import io.reactivex.g;
import io.reactivex.z;

public interface p2 extends v2 {
    g<PlayerQueue> b();

    void i(Context context, String str);

    z<Optional<ContextTrack>> m(int i);
}
