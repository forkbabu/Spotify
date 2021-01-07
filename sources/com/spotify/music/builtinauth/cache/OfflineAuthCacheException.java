package com.spotify.music.builtinauth.cache;

public final class OfflineAuthCacheException extends Exception {
    private static final long serialVersionUID = 0;

    public enum ErrorMessage {
        CACHE_UPDATE_ERROR("Updating local auth cache failed."),
        CACHE_CLEAR_ERROR("Clearing local auth cache failed."),
        CACHE_REMOVE_ENTRY_ERROR("Could not remove entry from local auth cache."),
        CACHE_INSERT_ENTRY_ERROR("Could not insert entry to local auth cache."),
        CACHE_GET_ENTRY_ERROR("Could not find entry in local auth cache.");
        
        private final String mMessage;

        private ErrorMessage(String str) {
            this.mMessage = str;
        }

        public String d() {
            return this.mMessage;
        }
    }

    public OfflineAuthCacheException(ErrorMessage errorMessage) {
        super(errorMessage.d());
    }
}
