package com.spotify.music.features.freetierallsongsdialog;

import android.os.Parcelable;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ FreeTierAllSongsDialogActivity a;
    public final /* synthetic */ Parcelable b;

    public /* synthetic */ a(FreeTierAllSongsDialogActivity freeTierAllSongsDialogActivity, Parcelable parcelable) {
        this.a = freeTierAllSongsDialogActivity;
        this.b = parcelable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c1(this.b);
    }
}
