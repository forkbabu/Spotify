package com.spotify.encore.mobile.utils.picassocolorextractor;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;
import com.squareup.picasso.g;
import kotlin.jvm.internal.h;

public final class SpotifyPicassoTarget implements f0 {
    private g callback;
    private pud factory;
    private final ImageView imageView;

    public SpotifyPicassoTarget(ImageView imageView2, pud pud) {
        h.e(imageView2, "imageView");
        h.e(pud, "factory");
        this.imageView = imageView2;
        this.factory = pud;
    }

    private final void extractColor(Bitmap bitmap) {
        kvd.a(bitmap).b(new SpotifyPicassoTarget$extractColor$1(this));
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof SpotifyPicassoTarget)) {
            return false;
        }
        SpotifyPicassoTarget spotifyPicassoTarget = (SpotifyPicassoTarget) obj;
        if (spotifyPicassoTarget.imageView == this.imageView && spotifyPicassoTarget.factory == this.factory) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.imageView.hashCode();
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapFailed(Exception exc, Drawable drawable) {
        h.e(exc, "e");
        h.e(drawable, "drawable");
        this.imageView.setImageDrawable(drawable);
        g gVar = this.callback;
        if (gVar != null) {
            gVar.onError(exc);
        }
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        h.e(bitmap, "bitmap");
        h.e(loadedFrom, "loadedFrom");
        if (!bitmap.isRecycled()) {
            ImageView imageView2 = this.imageView;
            Drawable createDrawable = this.factory.createDrawable(bitmap);
            h.d(createDrawable, "factory.createDrawable(bitmap)");
            InternalPicassoDrawableKt.withDrawable(imageView2, createDrawable, loadedFrom);
            g gVar = this.callback;
            if (gVar != null) {
                gVar.onSuccess();
                if (this.callback instanceof ColorCallback) {
                    extractColor(bitmap);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.squareup.picasso.f0
    public void onPrepareLoad(Drawable drawable) {
        h.e(drawable, "drawable");
        InternalPicassoDrawableKt.setPlaceholder(this.imageView, 0, drawable);
    }

    public final void setCallback(g gVar) {
        this.callback = gVar;
    }
}
