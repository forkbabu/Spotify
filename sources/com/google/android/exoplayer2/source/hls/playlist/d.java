package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.offline.u;
import com.google.android.exoplayer2.offline.x;
import com.google.android.exoplayer2.upstream.x;
import java.util.List;

public final class d implements i {
    private final i a;
    private final List<x> b;

    public d(i iVar, List<x> list) {
        this.a = iVar;
        this.b = list;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.i
    public x.a<g> a() {
        return new u(this.a.a(), this.b);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.i
    public x.a<g> b(e eVar) {
        return new u(this.a.b(eVar), this.b);
    }
}
