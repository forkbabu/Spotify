package com.spotify.music.features.hiddencontent;

import android.os.Parcelable;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ HiddenContentFragment a;
    public final /* synthetic */ Parcelable b;

    public /* synthetic */ a(HiddenContentFragment hiddenContentFragment, Parcelable parcelable) {
        this.a = hiddenContentFragment;
        this.b = parcelable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.Q4(this.b);
    }
}
