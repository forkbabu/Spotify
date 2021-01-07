package com.spotify.music.features.localfilesimport.activity;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity;
import com.spotify.music.features.localfilesimport.model.LocalTracks;
import io.reactivex.functions.l;

public final /* synthetic */ class e implements l {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        LocalTracks localTracks = (LocalTracks) obj;
        int i = LocalFilesImportActivity.h0;
        boolean z = false;
        Logger.b("Local files: switching LocalTracks into StatusAndTracks(): localTracks size() %d, unfiltered: %d", Integer.valueOf(localTracks.getItems().size()), Integer.valueOf(localTracks.getUnfilteredLength()));
        if (!(localTracks.getItems().size() == 0)) {
            return new LocalFilesImportActivity.e(LocalFilesImportActivity.Status.HAVE_CONTENT, localTracks.getItems());
        }
        if (localTracks.getUnfilteredLength() > 0) {
            z = true;
        }
        return new LocalFilesImportActivity.e(z ? LocalFilesImportActivity.Status.NO_CONTENT_EVERYTHING_IMPORTED : LocalFilesImportActivity.Status.NO_CONTENT_NO_FILES, localTracks.getItems());
    }
}
