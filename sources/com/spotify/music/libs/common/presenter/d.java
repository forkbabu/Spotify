package com.spotify.music.libs.common.presenter;

import android.os.Parcelable;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ f a;

    public /* synthetic */ d(f fVar) {
        this.a = fVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.e((Parcelable) obj);
    }
}
