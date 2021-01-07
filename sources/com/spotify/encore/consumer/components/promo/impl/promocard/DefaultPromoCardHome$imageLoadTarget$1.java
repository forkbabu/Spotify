package com.spotify.encore.consumer.components.promo.impl.promocard;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import kotlin.jvm.internal.h;

public final class DefaultPromoCardHome$imageLoadTarget$1 implements f0 {
    final /* synthetic */ DefaultPromoCardHome this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    DefaultPromoCardHome$imageLoadTarget$1(DefaultPromoCardHome defaultPromoCardHome) {
        this.this$0 = defaultPromoCardHome;
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapFailed(Exception exc, Drawable drawable) {
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        h.e(bitmap, "bitmap");
        h.e(loadedFrom, "from");
        this.this$0.setBackgroundImage(bitmap, loadedFrom);
    }

    @Override // com.squareup.picasso.f0
    public void onPrepareLoad(Drawable drawable) {
    }
}
