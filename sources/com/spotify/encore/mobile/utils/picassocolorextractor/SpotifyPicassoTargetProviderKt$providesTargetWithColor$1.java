package com.spotify.encore.mobile.utils.picassocolorextractor;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* access modifiers changed from: package-private */
public final class SpotifyPicassoTargetProviderKt$providesTargetWithColor$1 implements pud {
    final /* synthetic */ ImageView $imageView;

    SpotifyPicassoTargetProviderKt$providesTargetWithColor$1(ImageView imageView) {
        this.$imageView = imageView;
    }

    @Override // defpackage.pud
    public final Drawable createDrawable(Bitmap bitmap) {
        return new BitmapDrawable(this.$imageView.getResources(), bitmap);
    }
}
