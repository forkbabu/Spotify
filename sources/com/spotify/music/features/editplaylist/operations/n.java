package com.spotify.music.features.editplaylist.operations;

import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.editplaylist.upload.ImageUploadEndpoint;
import com.spotify.music.features.editplaylist.upload.proto.RegisterPlaylistImageRequest;
import io.reactivex.functions.l;

public final /* synthetic */ class n implements l {
    public final /* synthetic */ SetPlaylistPictureWorker a;
    public final /* synthetic */ String b;

    public /* synthetic */ n(SetPlaylistPictureWorker setPlaylistPictureWorker, String str) {
        this.a = setPlaylistPictureWorker;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        SetPlaylistPictureWorker setPlaylistPictureWorker = this.a;
        String str = this.b;
        setPlaylistPictureWorker.getClass();
        String uploadToken = ((ImageUploadEndpoint.ImageUploadResponse) obj).uploadToken();
        RegisterPlaylistImageRequest.b i = RegisterPlaylistImageRequest.i();
        i.m(uploadToken);
        return setPlaylistPictureWorker.r.a(l0.z(str).i(), (RegisterPlaylistImageRequest) i.build());
    }
}
