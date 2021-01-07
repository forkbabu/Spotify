package com.spotify.music.features.ads.video;

import com.spotify.music.features.ads.model.Ad;
import io.reactivex.functions.n;

public final /* synthetic */ class e implements n {
    public final /* synthetic */ o a;

    public /* synthetic */ e(o oVar) {
        this.a = oVar;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return this.a.b((Ad) obj);
    }
}
