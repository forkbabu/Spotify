package com.spotify.music.features.diskalmostfull;

import android.os.Bundle;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.paste.widgets.DialogLayout;

public class DiskAlmostFullActivity extends ss2 {
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DialogLayout dialogLayout = new DialogLayout(this);
        setContentView(dialogLayout);
        dialogLayout.setTitle(C0707R.string.disk_almost_full_title);
        dialogLayout.setBody(C0707R.string.disk_almost_full_message);
        dialogLayout.c(C0707R.string.disk_almost_full_ok, new a(this));
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.DIALOG_DISKALMOSTFULL, ViewUris.X0.toString());
    }
}
