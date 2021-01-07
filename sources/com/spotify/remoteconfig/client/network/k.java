package com.spotify.remoteconfig.client.network;

import io.reactivex.functions.c;

final class k<T1, T2, R> implements c<Throwable, Integer, u3<Throwable, Integer>> {
    public static final k a = new k();

    k() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.c
    public u3<Throwable, Integer> a(Throwable th, Integer num) {
        return new u3<>(th, num);
    }
}
