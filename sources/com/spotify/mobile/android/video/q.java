package com.spotify.mobile.android.video;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.google.android.exoplayer2.upstream.cache.n;
import com.google.android.exoplayer2.upstream.cache.r;
import com.google.android.exoplayer2.upstream.cache.u;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.video.exo.d;
import java.io.File;
import java.io.InputStream;
import okhttp3.y;

public class q implements u {
    private final Cache a;
    private final y b;

    public q(File file, long j, y yVar) {
        this.a = new u(file, new r(j), null, null, false, true);
        this.b = yVar;
    }

    @Override // com.spotify.mobile.android.video.u
    public Cache a() {
        return this.a;
    }

    public InputStream b(String str) {
        d dVar = new d(this.b, null);
        Cache cache = this.a;
        return new l(new com.google.android.exoplayer2.upstream.cache.d(cache, dVar.b(), new FileDataSource(), new CacheDataSink(cache, 5242880, 20480), 0, null, null), new m(Uri.parse(str), 0, -1, null, 0));
    }

    public boolean c(String str) {
        return this.a.j(str, 0, n.a(this.a.b(str)));
    }
}
