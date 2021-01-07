package com.spotify.music.features.trackcredits;

import com.spotify.music.features.trackcredits.model.TrackCredits;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ f a;

    public /* synthetic */ a(f fVar) {
        this.a = fVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        f.c(this.a, (TrackCredits) obj);
    }
}
