package com.spotify.music.features.browse.localcache;

public enum HubsCachedFeature {
    FIND("find");
    
    private final String mCacheIdentifier;

    private HubsCachedFeature(String str) {
        this.mCacheIdentifier = str;
    }

    public String d() {
        return this.mCacheIdentifier;
    }
}
