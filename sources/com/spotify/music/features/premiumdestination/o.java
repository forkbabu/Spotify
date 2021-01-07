package com.spotify.music.features.premiumdestination;

import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;

public final class o implements fjf<s<RecyclerView>> {
    private final wlf<PublishSubject<RecyclerView>> a;

    public o(wlf<PublishSubject<RecyclerView>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        PublishSubject<RecyclerView> publishSubject = this.a.get();
        if (publishSubject != null) {
            return publishSubject;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
