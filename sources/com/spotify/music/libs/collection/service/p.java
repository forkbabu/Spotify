package com.spotify.music.libs.collection.service;

import io.reactivex.functions.a;

public final /* synthetic */ class p implements a {
    public final /* synthetic */ CollectionService a;
    public final /* synthetic */ String b;

    public /* synthetic */ p(CollectionService collectionService, String str) {
        this.a = collectionService;
        this.b = str;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        CollectionService collectionService = this.a;
        collectionService.f.c(this.b);
    }
}
