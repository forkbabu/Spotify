package com.spotify.music.features.connect.cast;

import com.google.common.base.Optional;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ r a;

    public /* synthetic */ d(r rVar) {
        this.a = rVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.l((Optional) obj);
    }
}
