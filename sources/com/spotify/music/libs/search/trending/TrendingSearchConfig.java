package com.spotify.music.libs.search.trending;

public abstract class TrendingSearchConfig {

    public enum ClickBehaviour {
        NAVIGATE,
        SEARCH
    }

    public enum Style {
        WHITE,
        BLACK
    }

    public static TrendingSearchConfig b(boolean z, Style style, ClickBehaviour clickBehaviour) {
        return new a(z, style, clickBehaviour);
    }

    public abstract ClickBehaviour a();

    public abstract boolean c();

    public abstract Style d();
}
