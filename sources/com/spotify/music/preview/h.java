package com.spotify.music.preview;

import java.util.concurrent.Callable;

public final /* synthetic */ class h implements Callable {
    public final /* synthetic */ PreviewPlayerImpl a;

    public /* synthetic */ h(PreviewPlayerImpl previewPlayerImpl) {
        this.a = previewPlayerImpl;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.a.C();
        return Boolean.TRUE;
    }
}
