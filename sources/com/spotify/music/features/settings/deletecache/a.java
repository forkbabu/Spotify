package com.spotify.music.features.settings.deletecache;

import android.content.DialogInterface;
import com.spotify.music.features.settings.deletecache.f;

public final /* synthetic */ class a implements DialogInterface.OnCancelListener {
    public final /* synthetic */ f.a a;

    public /* synthetic */ a(f.a aVar) {
        this.a = aVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        StorageDeleteCacheActivity.this.finish();
    }
}
