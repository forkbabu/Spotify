package com.spotify.music.features.playlistentity.homemix.tasteviz;

import io.reactivex.functions.l;
import retrofit2.v;

public final /* synthetic */ class b implements l {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        v vVar = (v) obj;
        int i = n.m;
        if (vVar.b() == 200) {
            return Integer.valueOf(vVar.b());
        }
        throw new RuntimeException(String.format("Server returned error %d", Integer.valueOf(vVar.b())));
    }
}
