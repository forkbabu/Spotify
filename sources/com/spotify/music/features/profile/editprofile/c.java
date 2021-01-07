package com.spotify.music.features.profile.editprofile;

import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ ChangeImageActivity a;

    public /* synthetic */ c(ChangeImageActivity changeImageActivity) {
        this.a = changeImageActivity;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        ChangeImageActivity changeImageActivity = this.a;
        Throwable th = (Throwable) obj;
        changeImageActivity.setResult(100);
        changeImageActivity.finish();
    }
}
