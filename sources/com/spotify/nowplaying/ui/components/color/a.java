package com.spotify.nowplaying.ui.components.color;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.f0;

public final class a implements f0 {
    private final AbstractC0356a a;

    /* renamed from: com.spotify.nowplaying.ui.components.color.a$a  reason: collision with other inner class name */
    public interface AbstractC0356a {
        void a(int i);

        void b();
    }

    private a(AbstractC0356a aVar) {
        this.a = aVar;
    }

    public static a a(AbstractC0356a aVar) {
        return new a(aVar);
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapFailed(Exception exc, Drawable drawable) {
        this.a.b();
    }

    @Override // com.squareup.picasso.f0
    public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        MoreObjects.checkArgument(!bitmap.isRecycled());
        if (bitmap.getHeight() == 1 && bitmap.getWidth() == 1 && bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            this.a.a(bitmap.getPixel(0, 0));
        } else {
            Logger.d("The loaded bitmap is not a 1x1 color bitmap. Use ColorExtractorTransformation in the chain before loading the bitmap or check if the bitmap has a valid color config.", new Object[0]);
            this.a.b();
        }
        MoreObjects.checkArgument(!bitmap.isRecycled());
    }

    @Override // com.squareup.picasso.f0
    public void onPrepareLoad(Drawable drawable) {
    }
}
