package com.spotify.music.features.premiumdestination;

import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.subjects.PublishSubject;

public final class p implements fjf<PublishSubject<RecyclerView>> {

    /* access modifiers changed from: private */
    public static final class a {
        private static final p a = new p();
    }

    public static p a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return PublishSubject.h1();
    }
}
