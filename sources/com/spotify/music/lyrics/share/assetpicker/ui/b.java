package com.spotify.music.lyrics.share.assetpicker.ui;

import android.view.View;
import android.view.ViewTreeObserver;

public final class b implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ LyricsShareAssetPickerFragment a;
    final /* synthetic */ View b;

    b(LyricsShareAssetPickerFragment lyricsShareAssetPickerFragment, View view) {
        this.a = lyricsShareAssetPickerFragment;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        LyricsShareAssetPickerFragment.e5(this.a).k(new keb(), -1);
        return false;
    }
}
