package com.spotify.music.preview;

import com.spotify.music.preview.PreviewPlayerImpl;
import io.reactivex.functions.a;

public final /* synthetic */ class f implements a {
    public final /* synthetic */ PreviewPlayerImpl.a a;
    public final /* synthetic */ PreviewPlayerImpl.b b;
    public final /* synthetic */ long c;

    public /* synthetic */ f(PreviewPlayerImpl.a aVar, PreviewPlayerImpl.b bVar, long j) {
        this.a = aVar;
        this.b = bVar;
        this.c = j;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        PreviewPlayerImpl.a aVar = this.a;
        PreviewPlayerImpl.b bVar = this.b;
        long j = this.c;
        PreviewPlayerImpl.r(PreviewPlayerImpl.this);
        PreviewPlayerImpl.s(PreviewPlayerImpl.this, bVar, j);
    }
}
