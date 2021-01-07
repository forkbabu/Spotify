package com.spotify.music.features.ads.screensaver;

import com.spotify.cosmos.router.Response;
import io.reactivex.functions.n;

public final /* synthetic */ class w implements n {
    public static final /* synthetic */ w a = new w();

    private /* synthetic */ w() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        Response response = (Response) obj;
        return response.getStatus() >= 200 && response.getStatus() < 300;
    }
}
