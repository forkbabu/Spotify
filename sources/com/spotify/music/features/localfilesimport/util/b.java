package com.spotify.music.features.localfilesimport.util;

import android.content.Context;
import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.music.features.localfilesimport.model.PageType;

public interface b {
    Intent a(Context context, c cVar, PageType pageType, LocalFilesImportMessaging localFilesImportMessaging);
}
