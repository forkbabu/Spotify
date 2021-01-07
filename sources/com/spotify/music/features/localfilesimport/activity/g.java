package com.spotify.music.features.localfilesimport.activity;

import android.content.DialogInterface;

public final /* synthetic */ class g implements DialogInterface.OnClickListener {
    public final /* synthetic */ LocalFilesImportActivity a;

    public /* synthetic */ g(LocalFilesImportActivity localFilesImportActivity) {
        this.a = localFilesImportActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.d1(dialogInterface, i);
    }
}
