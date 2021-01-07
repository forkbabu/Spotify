package com.spotify.music.features.profile.editprofile;

import android.view.View;

public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ ChangeImageActivity a;

    public /* synthetic */ b(ChangeImageActivity changeImageActivity) {
        this.a = changeImageActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ChangeImageActivity changeImageActivity = this.a;
        changeImageActivity.setResult(0);
        changeImageActivity.K.l();
        changeImageActivity.finish();
    }
}
