package com.spotify.music.features.localfilesimport.activity;

import android.content.DialogInterface;

public final /* synthetic */ class h implements DialogInterface.OnClickListener {
    public final /* synthetic */ LocalFilesImportActivity a;

    public /* synthetic */ h(LocalFilesImportActivity localFilesImportActivity) {
        this.a = localFilesImportActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        LocalFilesImportActivity localFilesImportActivity = this.a;
        localFilesImportActivity.a0.g();
        localFilesImportActivity.finish();
    }
}
