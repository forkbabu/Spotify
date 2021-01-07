package com.spotify.music.features.localfilesimport.util;

import android.content.Context;
import android.content.Intent;
import com.spotify.music.features.localfilesimport.activity.LocalFilesImportActivity;
import com.spotify.music.features.localfilesimport.model.PageType;

public class c implements b {
    @Override // com.spotify.music.features.localfilesimport.util.b
    public Intent a(Context context, com.spotify.android.flags.c cVar, PageType pageType, LocalFilesImportMessaging localFilesImportMessaging) {
        int i = LocalFilesImportActivity.h0;
        Intent intent = new Intent(context, LocalFilesImportActivity.class);
        cVar.getClass();
        intent.putExtra("FlagsArgumentHelper.Flags", cVar);
        intent.putExtra("page", pageType);
        intent.putExtra("messaging", localFilesImportMessaging);
        return intent;
    }
}
