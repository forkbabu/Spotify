package com.spotify.mobile.android.video.offline;

import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.offline.j;
import com.google.android.exoplayer2.offline.q;
import com.google.android.exoplayer2.offline.r;
import com.google.android.exoplayer2.offline.s;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.video.exo.d;
import io.reactivex.z;

public class v implements s {
    private final z<p62> a;
    private final r b;

    public v(Cache cache, d dVar, z<p62> zVar) {
        this.a = zVar;
        this.b = new r(cache, dVar, null, null, null, new i0());
    }

    @Override // com.google.android.exoplayer2.offline.s
    public q a(DownloadRequest downloadRequest) {
        if ("spotifyAdaptive".equals(downloadRequest.b)) {
            return new s82(downloadRequest.c, downloadRequest.f, this.b, this.a);
        }
        return new j(this.b).a(downloadRequest);
    }
}
