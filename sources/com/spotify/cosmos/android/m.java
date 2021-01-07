package com.spotify.cosmos.android;

import io.reactivex.functions.n;

public final /* synthetic */ class m implements n {
    public final /* synthetic */ long a;

    public /* synthetic */ m(long j) {
        this.a = j;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        long j = this.a;
        F f = ((u3) obj).a;
        return ((long) (f == null ? 0 : f.intValue())) <= j;
    }
}
