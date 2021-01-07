package com.spotify.music.storylines.service;

import com.spotify.mobile.android.storylines.model.StorylinesUris;
import io.reactivex.functions.l;
import java.util.Collections;

public final /* synthetic */ class i implements l {
    public static final /* synthetic */ i a = new i();

    private /* synthetic */ i() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        int i = StorylinesUrisFetcher.w;
        return new StorylinesUris(Collections.singleton(""));
    }
}
