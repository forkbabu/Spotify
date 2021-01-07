package com.spotify.music.yourlibrary.interfaces;

public enum YourLibraryPageId {
    MUSIC_PLAYLISTS("music_playlists"),
    MUSIC_ARTISTS("music_artists"),
    MUSIC_ALBUMS("music_albums"),
    MUSIC_SONGS("music_songs"),
    PODCAST_DOWNLOADS("podcast_downloads"),
    PODCAST_EPISODES("podcast_episodes"),
    PODCAST_FOLLOWED("podcast_followed");
    
    private static final YourLibraryPageId[] q = values();
    private final String mId;

    private YourLibraryPageId(String str) {
        this.mId = str;
    }

    public static YourLibraryPageId d(String str) {
        YourLibraryPageId[] yourLibraryPageIdArr = q;
        for (YourLibraryPageId yourLibraryPageId : yourLibraryPageIdArr) {
            if (yourLibraryPageId.mId.equals(str)) {
                return yourLibraryPageId;
            }
        }
        return null;
    }

    public String g() {
        return this.mId;
    }
}
