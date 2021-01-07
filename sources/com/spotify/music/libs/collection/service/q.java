package com.spotify.music.libs.collection.service;

import com.spotify.music.libs.collection.service.CollectionService;

public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ CollectionService a;
    public final /* synthetic */ String b;
    public final /* synthetic */ CollectionService.Items c;

    public /* synthetic */ q(CollectionService collectionService, String str, CollectionService.Items items) {
        this.a = collectionService;
        this.b = str;
        this.c = items;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CollectionService collectionService = this.a;
        String str = this.b;
        CollectionService.Items items = this.c;
        collectionService.getClass();
        CollectionService.i(collectionService, new String[]{str}, items.source, items.contextSource, CollectionService.Messaging.ONLY_ERROR_DIALOG);
    }
}
