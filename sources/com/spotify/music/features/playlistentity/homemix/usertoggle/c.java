package com.spotify.music.features.playlistentity.homemix.usertoggle;

import com.spotify.music.features.playlistentity.homemix.models.HomeMixTuning;
import io.reactivex.functions.l;

public final /* synthetic */ class c implements l {
    public final /* synthetic */ k a;

    public /* synthetic */ c(k kVar) {
        this.a = kVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return k.e(this.a, (HomeMixTuning) obj);
    }
}
