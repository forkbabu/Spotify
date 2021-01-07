package com.spotify.music.features.editplaylist.operations;

import io.reactivex.functions.l;

public final /* synthetic */ class m implements l {
    public final /* synthetic */ SetPlaylistPictureWorker a;
    public final /* synthetic */ String b;

    public /* synthetic */ m(SetPlaylistPictureWorker setPlaylistPictureWorker, String str) {
        this.a = setPlaylistPictureWorker;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.t.f(this.b, (String) obj);
    }
}
