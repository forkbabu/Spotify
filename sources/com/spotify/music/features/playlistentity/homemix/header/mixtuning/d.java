package com.spotify.music.features.playlistentity.homemix.header.mixtuning;

import com.spotify.music.features.playlistentity.homemix.models.HomeMixTuning;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ o a;
    public final /* synthetic */ HomeMixTuning.Style b;

    public /* synthetic */ d(o oVar, HomeMixTuning.Style style) {
        this.a = oVar;
        this.b = style;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b(this.b, (Boolean) obj);
    }
}
