package com.spotify.music.lyrics.share.assetpicker.ui;

import android.view.View;

final class a implements Runnable {
    final /* synthetic */ AssetScaleView a;

    a(AssetScaleView assetScaleView) {
        this.a = assetScaleView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View.OnClickListener d = AssetScaleView.d(this.a);
        if (d != null) {
            d.onClick(this.a);
        }
    }
}
