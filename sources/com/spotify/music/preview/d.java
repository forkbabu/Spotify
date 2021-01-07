package com.spotify.music.preview;

import com.spotify.music.preview.PreviewPlayerImpl;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ PreviewPlayerImpl.AnonymousClass1 a;

    public /* synthetic */ d(PreviewPlayerImpl.AnonymousClass1 r1) {
        this.a = r1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        PreviewPlayerImpl.y(PreviewPlayerImpl.this, (PreviewPlayerImpl.b) obj);
    }
}
