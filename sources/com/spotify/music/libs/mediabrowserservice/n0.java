package com.spotify.music.libs.mediabrowserservice;

import android.support.v4.media.RatingCompat;
import io.reactivex.functions.g;

public final /* synthetic */ class n0 implements g {
    public final /* synthetic */ RatingCompat a;

    public /* synthetic */ n0(RatingCompat ratingCompat) {
        this.a = ratingCompat;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        ((a2) obj).l(this.a);
    }
}
