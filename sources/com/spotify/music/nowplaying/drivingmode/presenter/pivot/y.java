package com.spotify.music.nowplaying.drivingmode.presenter.pivot;

import com.spotify.playlist.models.Episode;
import io.reactivex.functions.l;
import java.util.Map;

public final /* synthetic */ class y implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ y(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        String str = this.a;
        Episode episode = (Episode) ((Map) obj).get(str);
        return (episode == null || episode.w() == null) ? str : episode.w().getUri();
    }
}
