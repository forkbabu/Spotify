package com.spotify.music.preview;

import com.spotify.music.preview.PreviewPlayerImpl;
import io.reactivex.functions.c;

public final /* synthetic */ class j implements c {
    public final /* synthetic */ PreviewPlayerImpl a;

    public /* synthetic */ j(PreviewPlayerImpl previewPlayerImpl) {
        this.a = previewPlayerImpl;
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        return this.a.D((PreviewPlayerImpl.b) obj, (String) obj2);
    }
}
