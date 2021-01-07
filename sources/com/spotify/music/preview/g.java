package com.spotify.music.preview;

import com.spotify.music.preview.PreviewPlayerImpl;

public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ PreviewPlayerImpl a;
    public final /* synthetic */ PreviewPlayerImpl.b b;
    public final /* synthetic */ long c;

    public /* synthetic */ g(PreviewPlayerImpl previewPlayerImpl, PreviewPlayerImpl.b bVar, long j) {
        this.a = previewPlayerImpl;
        this.b = bVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.E(this.b, this.c);
    }
}
