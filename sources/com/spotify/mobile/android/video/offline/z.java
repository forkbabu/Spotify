package com.spotify.mobile.android.video.offline;

import com.google.android.exoplayer2.database.a;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.s;
import com.spotify.mobile.android.video.u;
import java.io.File;

public class z implements u {
    private final com.google.android.exoplayer2.upstream.cache.u a;

    public z(a aVar, File file) {
        this.a = new com.google.android.exoplayer2.upstream.cache.u(file, new s(), aVar, null, false, false);
    }

    @Override // com.spotify.mobile.android.video.u
    public Cache a() {
        return this.a;
    }
}
