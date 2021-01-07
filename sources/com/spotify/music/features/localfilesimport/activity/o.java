package com.spotify.music.features.localfilesimport.activity;

import android.content.DialogInterface;

public final /* synthetic */ class o implements DialogInterface.OnDismissListener {
    public final /* synthetic */ LocalFilesImportActivity a;

    public /* synthetic */ o(LocalFilesImportActivity localFilesImportActivity) {
        this.a = localFilesImportActivity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.finish();
    }
}
