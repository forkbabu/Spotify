package com.spotify.music.features.editplaylist.operations;

import com.spotify.music.features.editplaylist.upload.ImageUploadEndpoint;
import com.spotify.music.features.editplaylist.upload.a;
import com.spotify.playlist.endpoints.i;

public final class q0 implements fjf<ImageUploadEndpoint> {
    public static void a(SetPlaylistPictureWorker setPlaylistPictureWorker, ImageUploadEndpoint imageUploadEndpoint) {
        setPlaylistPictureWorker.s = imageUploadEndpoint;
    }

    public static void b(SetPlaylistPictureWorker setPlaylistPictureWorker, a aVar) {
        setPlaylistPictureWorker.r = aVar;
    }

    public static void c(SetPlaylistPictureWorker setPlaylistPictureWorker, i iVar) {
        setPlaylistPictureWorker.t = iVar;
    }
}
