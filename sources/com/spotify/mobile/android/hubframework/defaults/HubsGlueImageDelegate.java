package com.spotify.mobile.android.hubframework.defaults;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

public interface HubsGlueImageDelegate {

    public interface ImageConfig {

        public enum IconSize {
            X_SMALL,
            SMALL,
            MEDIUM,
            LARGE
        }

        public enum ImageSize {
            SMALL,
            MEDIUM,
            LARGE
        }

        IconSize d();

        ImageSize g();
    }

    void a(ImageView imageView);

    Uri b(String str);

    o71 c();

    void d(ImageView imageView, x81 x81, ImageConfig imageConfig);

    Drawable e(String str, ImageConfig imageConfig);

    @Deprecated
    Picasso f();

    void g(ImageView imageView, String str);
}
