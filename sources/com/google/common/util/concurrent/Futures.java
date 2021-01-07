package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ImmediateFuture;

public final class Futures extends GwtFuturesCatchingSpecialization {
    public static <V> ListenableFuture<V> immediateFuture(V v) {
        if (v == null) {
            return ImmediateFuture.ImmediateSuccessfulFuture.NULL;
        }
        return new ImmediateFuture.ImmediateSuccessfulFuture(v);
    }
}
