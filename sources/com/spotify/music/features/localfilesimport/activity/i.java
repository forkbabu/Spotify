package com.spotify.music.features.localfilesimport.activity;

import com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity;
import io.reactivex.functions.g;

public final /* synthetic */ class i implements g {
    public final /* synthetic */ LocalFilesImportActivity a;

    public /* synthetic */ i(LocalFilesImportActivity localFilesImportActivity) {
        this.a = localFilesImportActivity;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c1((LocalFilesImportActivity.e) obj);
    }
}
