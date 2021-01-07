package com.spotify.music.features.profile.editprofile;

import android.net.Uri;

public final /* synthetic */ class g implements io.reactivex.functions.g {
    public final /* synthetic */ ChangeImageActivity a;

    public /* synthetic */ g(ChangeImageActivity changeImageActivity) {
        this.a = changeImageActivity;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        ChangeImageActivity.b1(this.a, (Uri) obj);
    }
}
