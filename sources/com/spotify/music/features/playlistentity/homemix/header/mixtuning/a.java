package com.spotify.music.features.playlistentity.homemix.header.mixtuning;

import com.spotify.music.features.playlistentity.homemix.models.HomeMixTuning;
import io.reactivex.functions.l;

public final /* synthetic */ class a implements l {
    public final /* synthetic */ o a;
    public final /* synthetic */ HomeMixTuning.Style b;

    public /* synthetic */ a(o oVar, HomeMixTuning.Style style) {
        this.a = oVar;
        this.b = style;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, (Boolean) obj);
    }
}
