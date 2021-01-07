package com.spotify.music.libs.search.hubs.util.image;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.core.content.a;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.libs.search.hubs.util.image.ImageConfig;
import com.spotify.paste.graphics.drawable.d;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;

public class c implements b {
    private final Picasso a;
    private final e b;
    private final int c;
    private final Drawable d;
    private final int e;

    public c(Context context, Picasso picasso, e eVar) {
        this.a = picasso;
        this.b = eVar;
        int b2 = a.b(context, R.color.gray_15);
        this.e = b2;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0707R.dimen.rounded_square_image_corner_radius);
        this.c = dimensionPixelSize;
        this.d = new h(dimensionPixelSize, b2);
    }

    @Override // com.spotify.music.libs.search.hubs.util.image.b
    public void a(ImageView imageView) {
        this.a.b(imageView);
    }

    @Override // com.spotify.music.libs.search.hubs.util.image.b
    public void b(ImageView imageView, ImageConfig imageConfig) {
        ImageConfig.Style style = ImageConfig.Style.ROUNDED_SQUARE;
        Drawable a2 = this.b.a(imageConfig);
        if (imageConfig.c()) {
            if (style == imageConfig.e().orNull()) {
                imageView.setBackground(this.d);
            } else {
                imageView.setBackgroundColor(this.e);
            }
        }
        String uri = imageConfig.b().uri();
        if (MoreObjects.isNullOrEmpty(uri)) {
            imageView.setImageDrawable(a2);
            return;
        }
        Optional<ImageConfig.Style> e2 = imageConfig.e();
        z m = this.a.m(uri);
        m.t(a2);
        if (style == e2.orNull()) {
            m.o(rwd.g(imageView, d.a((float) this.c), null));
        } else {
            m.m(imageView);
        }
    }
}
