package com.spotify.music.podcast.ui.trailer;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.common.base.MoreObjects;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;

/* access modifiers changed from: package-private */
public class f implements f0 {
    private final ImageView a;
    private d b;
    private PodcastTrailerOverlayDrawable c;

    f(ImageView imageView, d dVar) {
        this.a = imageView;
        this.b = dVar;
    }

    public static f a(ImageView imageView, d dVar) {
        f fVar = (f) imageView.getTag(C0707R.id.picasso_target);
        if (fVar == null) {
            f fVar2 = new f(imageView, dVar);
            imageView.setTag(C0707R.id.picasso_target, fVar2);
            return fVar2;
        }
        fVar.b = dVar;
        return fVar;
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapFailed(Exception exc, Drawable drawable) {
        this.a.setImageDrawable(drawable);
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        MoreObjects.checkArgument(!bitmap.isRecycled());
        PodcastTrailerOverlayDrawable podcastTrailerOverlayDrawable = this.c;
        if (podcastTrailerOverlayDrawable != null) {
            podcastTrailerOverlayDrawable.e(bitmap);
        } else {
            this.c = this.b.b(bitmap);
        }
        this.a.setImageDrawable(this.c);
        MoreObjects.checkArgument(!bitmap.isRecycled());
    }

    @Override // com.squareup.picasso.f0
    public void onPrepareLoad(Drawable drawable) {
        this.a.setImageDrawable(drawable);
    }
}
