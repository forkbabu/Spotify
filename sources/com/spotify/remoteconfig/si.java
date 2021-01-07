package com.spotify.remoteconfig;

import com.spotify.remoteconfig.MusicLibsPageloaderForMusicProperties;

final class si extends MusicLibsPageloaderForMusicProperties {
    private final MusicLibsPageloaderForMusicProperties.PageLoaderScopePolicy a;

    static final class b extends MusicLibsPageloaderForMusicProperties.a {
        private MusicLibsPageloaderForMusicProperties.PageLoaderScopePolicy a;

        b() {
        }

        public MusicLibsPageloaderForMusicProperties a() {
            String str = this.a == null ? " pageLoaderScopePolicy" : "";
            if (str.isEmpty()) {
                return new si(this.a, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public MusicLibsPageloaderForMusicProperties.a b(MusicLibsPageloaderForMusicProperties.PageLoaderScopePolicy pageLoaderScopePolicy) {
            if (pageLoaderScopePolicy != null) {
                this.a = pageLoaderScopePolicy;
                return this;
            }
            throw new NullPointerException("Null pageLoaderScopePolicy");
        }
    }

    si(MusicLibsPageloaderForMusicProperties.PageLoaderScopePolicy pageLoaderScopePolicy, a aVar) {
        this.a = pageLoaderScopePolicy;
    }

    @Override // com.spotify.remoteconfig.MusicLibsPageloaderForMusicProperties
    public MusicLibsPageloaderForMusicProperties.PageLoaderScopePolicy a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MusicLibsPageloaderForMusicProperties) {
            return this.a.equals(((MusicLibsPageloaderForMusicProperties) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder V0 = je.V0("MusicLibsPageloaderForMusicProperties{pageLoaderScopePolicy=");
        V0.append(this.a);
        V0.append("}");
        return V0.toString();
    }
}
