package com.spotify.music.libs.search.hubs.util.image;

import com.google.common.base.Optional;
import com.spotify.music.libs.search.hubs.util.image.a;

public abstract class ImageConfig {

    public enum Size {
        SMALL,
        LARGE
    }

    public enum Style {
        SQUARE,
        ROUNDED_SQUARE
    }

    public interface a {
        a a(boolean z);

        a b(Size size);

        ImageConfig build();

        a c(x81 x81);

        a d(Style style);
    }

    public static a a() {
        return new a.b();
    }

    public abstract x81 b();

    public abstract boolean c();

    public abstract Size d();

    public abstract Optional<Style> e();
}
