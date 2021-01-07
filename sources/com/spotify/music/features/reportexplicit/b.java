package com.spotify.music.features.reportexplicit;

import com.spotify.cosmos.router.Response;
import io.reactivex.functions.l;

public final /* synthetic */ class b implements l {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((Response) obj).getStatus() == 200);
    }
}
