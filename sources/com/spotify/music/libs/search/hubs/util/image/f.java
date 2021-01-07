package com.spotify.music.libs.search.hubs.util.image;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.libs.search.hubs.util.image.ImageConfig;

public class f extends LruCache<ImageConfig, Drawable> implements e {
    private final float a;
    private final Context b;

    public f(Context context) {
        super(9);
        this.b = context;
        this.a = context.getResources().getDimension(C0707R.dimen.image_placeholder_size);
    }

    @Override // com.spotify.music.libs.search.hubs.util.image.e
    public Drawable a(ImageConfig imageConfig) {
        return (Drawable) get(imageConfig);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // android.util.LruCache
    public Drawable create(ImageConfig imageConfig) {
        ImageConfig imageConfig2 = imageConfig;
        SpotifyIconV2 or = n71.a(imageConfig2.b().placeholder()).or((Optional<SpotifyIconV2>) SpotifyIconV2.TRACK);
        if (imageConfig2.d() == ImageConfig.Size.SMALL) {
            return yc0.m(this.b, or, Float.NaN, true, false, this.a);
        }
        return yc0.e(this.b, or, Float.NaN, true, false, this.a);
    }
}
