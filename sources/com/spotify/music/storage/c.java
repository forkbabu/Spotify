package com.spotify.music.storage;

import android.view.View;

public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ MoveCacheConfirmationActivity a;

    public /* synthetic */ c(MoveCacheConfirmationActivity moveCacheConfirmationActivity) {
        this.a = moveCacheConfirmationActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.finish();
    }
}
