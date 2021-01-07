package com.spotify.music.features.localfilesimport.activity;

import android.content.DialogInterface;

class q implements DialogInterface.OnDismissListener {
    final /* synthetic */ LocalFilesImportActivity a;

    q(LocalFilesImportActivity localFilesImportActivity) {
        this.a = localFilesImportActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.a.finish();
    }
}
