package com.spotify.music.libs.collection.service;

import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.music.json.g;
import com.spotify.music.libs.collection.service.v;

public final class x {
    public static void a(CollectionService collectionService, Object obj) {
        collectionService.a = (v.a) obj;
    }

    public static void b(OffliningService offliningService, FireAndForgetResolver fireAndForgetResolver) {
        offliningService.a = fireAndForgetResolver;
    }

    public static void c(CollectionService collectionService, g gVar) {
        collectionService.b = gVar;
    }

    public static void d(CollectionService collectionService, FireAndForgetResolver fireAndForgetResolver) {
        collectionService.c = fireAndForgetResolver;
    }
}
