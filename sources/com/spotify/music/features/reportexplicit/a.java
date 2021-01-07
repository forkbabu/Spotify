package com.spotify.music.features.reportexplicit;

import com.spotify.cosmos.router.Response;
import io.reactivex.functions.l;

public final /* synthetic */ class a implements l {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((Response) obj).getStatus() == 200);
    }
}
