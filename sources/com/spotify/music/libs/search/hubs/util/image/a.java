package com.spotify.music.libs.search.hubs.util.image;

import com.google.common.base.Optional;
import com.spotify.music.libs.search.hubs.util.image.ImageConfig;

final class a extends ImageConfig {
    private final x81 a;
    private final ImageConfig.Size b;
    private final Optional<ImageConfig.Style> c;
    private final boolean d;

    /* access modifiers changed from: package-private */
    public static final class b implements ImageConfig.a {
        private x81 a;
        private ImageConfig.Size b;
        private Optional<ImageConfig.Style> c = Optional.absent();
        private Boolean d;

        b() {
        }

        @Override // com.spotify.music.libs.search.hubs.util.image.ImageConfig.a
        public ImageConfig.a a(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.libs.search.hubs.util.image.ImageConfig.a
        public ImageConfig.a b(ImageConfig.Size size) {
            this.b = size;
            return this;
        }

        @Override // com.spotify.music.libs.search.hubs.util.image.ImageConfig.a
        public ImageConfig build() {
            String str = this.a == null ? " data" : "";
            if (this.b == null) {
                str = je.x0(str, " size");
            }
            if (this.d == null) {
                str = je.x0(str, " showBackground");
            }
            if (str.isEmpty()) {
                return new a(this.a, this.b, this.c, this.d.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.libs.search.hubs.util.image.ImageConfig.a
        public ImageConfig.a c(x81 x81) {
            if (x81 != null) {
                this.a = x81;
                return this;
            }
            throw new NullPointerException("Null data");
        }

        @Override // com.spotify.music.libs.search.hubs.util.image.ImageConfig.a
        public ImageConfig.a d(ImageConfig.Style style) {
            this.c = Optional.of(style);
            return this;
        }
    }

    a(x81 x81, ImageConfig.Size size, Optional optional, boolean z, C0299a aVar) {
        this.a = x81;
        this.b = size;
        this.c = optional;
        this.d = z;
    }

    @Override // com.spotify.music.libs.search.hubs.util.image.ImageConfig
    public x81 b() {
        return this.a;
    }

    @Override // com.spotify.music.libs.search.hubs.util.image.ImageConfig
    public boolean c() {
        return this.d;
    }

    @Override // com.spotify.music.libs.search.hubs.util.image.ImageConfig
    public ImageConfig.Size d() {
        return this.b;
    }

    @Override // com.spotify.music.libs.search.hubs.util.image.ImageConfig
    public Optional<ImageConfig.Style> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImageConfig)) {
            return false;
        }
        ImageConfig imageConfig = (ImageConfig) obj;
        if (!this.a.equals(imageConfig.b()) || !this.b.equals(imageConfig.d()) || !this.c.equals(imageConfig.e()) || this.d != imageConfig.c()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("ImageConfig{data=");
        V0.append(this.a);
        V0.append(", size=");
        V0.append(this.b);
        V0.append(", style=");
        V0.append(this.c);
        V0.append(", showBackground=");
        return je.P0(V0, this.d, "}");
    }
}
