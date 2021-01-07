package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.i;

public final class c implements i.a {
    private final Cache a;

    public c(Cache cache, long j) {
        this.a = cache;
    }

    public i a() {
        return new CacheDataSink(this.a, 5242880, 20480);
    }
}
