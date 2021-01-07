package com.spotify.music.libs.search.trending;

import com.spotify.music.libs.search.trending.TrendingSearchConfig;

final class a extends TrendingSearchConfig {
    private final boolean a;
    private final TrendingSearchConfig.Style b;
    private final TrendingSearchConfig.ClickBehaviour c;

    a(boolean z, TrendingSearchConfig.Style style, TrendingSearchConfig.ClickBehaviour clickBehaviour) {
        this.a = z;
        if (style != null) {
            this.b = style;
            if (clickBehaviour != null) {
                this.c = clickBehaviour;
                return;
            }
            throw new NullPointerException("Null clickBehaviour");
        }
        throw new NullPointerException("Null style");
    }

    @Override // com.spotify.music.libs.search.trending.TrendingSearchConfig
    public TrendingSearchConfig.ClickBehaviour a() {
        return this.c;
    }

    @Override // com.spotify.music.libs.search.trending.TrendingSearchConfig
    public boolean c() {
        return this.a;
    }

    @Override // com.spotify.music.libs.search.trending.TrendingSearchConfig
    public TrendingSearchConfig.Style d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TrendingSearchConfig)) {
            return false;
        }
        TrendingSearchConfig trendingSearchConfig = (TrendingSearchConfig) obj;
        if (this.a != trendingSearchConfig.c() || !this.b.equals(trendingSearchConfig.d()) || !this.c.equals(trendingSearchConfig.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("TrendingSearchConfig{isEnabled=");
        V0.append(this.a);
        V0.append(", style=");
        V0.append(this.b);
        V0.append(", clickBehaviour=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}
