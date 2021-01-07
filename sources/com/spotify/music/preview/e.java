package com.spotify.music.preview;

import io.reactivex.functions.l;

public final /* synthetic */ class e implements l {
    public final /* synthetic */ PreviewPlayerImpl a;

    public /* synthetic */ e(PreviewPlayerImpl previewPlayerImpl) {
        this.a = previewPlayerImpl;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return PreviewPlayerImpl.B(this.a, (Boolean) obj);
    }
}
