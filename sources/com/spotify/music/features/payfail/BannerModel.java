package com.spotify.music.features.payfail;

abstract class BannerModel {

    public enum Content {
        NONE,
        GENERIC,
        DOWNLOAD,
        PREMIUM_BENEFITS
    }

    BannerModel() {
    }

    /* access modifiers changed from: package-private */
    public abstract Content a();

    /* access modifiers changed from: package-private */
    public abstract int b();
}
