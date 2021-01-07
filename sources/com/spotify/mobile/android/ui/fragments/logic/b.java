package com.spotify.mobile.android.ui.fragments.logic;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.spotify.mobile.android.ui.fragments.logic.OfflineSyncErrorFragment;
import com.spotify.music.libs.viewuri.ViewUris;

public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ OfflineSyncErrorFragment.a a;

    public /* synthetic */ b(OfflineSyncErrorFragment.a aVar) {
        this.a = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OfflineSyncErrorFragment.a aVar = this.a;
        aVar.getClass();
        OfflineSyncErrorFragment.this.B2().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ViewUris.b1.toString())));
    }
}
