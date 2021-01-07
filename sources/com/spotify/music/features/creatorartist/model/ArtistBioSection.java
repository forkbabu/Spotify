package com.spotify.music.features.creatorartist.model;

public enum ArtistBioSection {
    GALLERY(0),
    MONTHLY_LISTENERS(1),
    BIOGRAPHY(2),
    AUTOBIOGRAPHY(3),
    SOCIAL_LINKS(4);
    
    private final int mSectionId;

    private ArtistBioSection(int i) {
        this.mSectionId = i;
    }

    public int d() {
        return this.mSectionId;
    }
}
