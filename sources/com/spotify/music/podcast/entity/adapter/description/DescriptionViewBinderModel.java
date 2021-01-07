package com.spotify.music.podcast.entity.adapter.description;

public abstract class DescriptionViewBinderModel {

    /* access modifiers changed from: package-private */
    public enum DescriptionType {
        HTML,
        FALLBACK
    }

    interface a {
    }

    public abstract String a();

    public abstract DescriptionType b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract String e();
}
