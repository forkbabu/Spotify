package com.spotify.music.features.settings.deletecache;

import android.content.DialogInterface;
import com.spotify.music.features.settings.deletecache.f;

public final /* synthetic */ class b implements DialogInterface.OnClickListener {
    public final /* synthetic */ f.a a;

    public /* synthetic */ b(f.a aVar) {
        this.a = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        StorageDeleteCacheActivity.this.finish();
    }
}
