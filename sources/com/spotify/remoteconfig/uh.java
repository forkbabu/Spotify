package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidMusicLibsNowplayingScrollProperties;

/* access modifiers changed from: package-private */
public final class uh extends AndroidMusicLibsNowplayingScrollProperties {
    private final AndroidMusicLibsNowplayingScrollProperties.DebugDataSource a;

    static final class b extends AndroidMusicLibsNowplayingScrollProperties.a {
        private AndroidMusicLibsNowplayingScrollProperties.DebugDataSource a;

        b() {
        }

        public AndroidMusicLibsNowplayingScrollProperties a() {
            String str = this.a == null ? " debugDataSource" : "";
            if (str.isEmpty()) {
                return new uh(this.a, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidMusicLibsNowplayingScrollProperties.a b(AndroidMusicLibsNowplayingScrollProperties.DebugDataSource debugDataSource) {
            if (debugDataSource != null) {
                this.a = debugDataSource;
                return this;
            }
            throw new NullPointerException("Null debugDataSource");
        }
    }

    uh(AndroidMusicLibsNowplayingScrollProperties.DebugDataSource debugDataSource, a aVar) {
        this.a = debugDataSource;
    }

    @Override // com.spotify.remoteconfig.AndroidMusicLibsNowplayingScrollProperties
    public AndroidMusicLibsNowplayingScrollProperties.DebugDataSource a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AndroidMusicLibsNowplayingScrollProperties) {
            return this.a.equals(((AndroidMusicLibsNowplayingScrollProperties) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidMusicLibsNowplayingScrollProperties{debugDataSource=");
        V0.append(this.a);
        V0.append("}");
        return V0.toString();
    }
}
