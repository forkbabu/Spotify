package com.spotify.music.features.eventshub.model;

import com.spotify.music.C0707R;

public enum EventSection {
    VIRTUAL(0, C0707R.string.events_hub_section_title_virtual),
    RECOMMENDATIONS(1, C0707R.string.events_hub_section_title_recommended),
    POPULAR(2, C0707R.string.events_hub_section_title_popular),
    ALL(3, C0707R.string.events_hub_section_title_all);
    
    public static final EventSection[] n = values();
    private final int mSectionId;
    private final int mTitleStringId;

    private EventSection(int i, int i2) {
        this.mSectionId = i;
        this.mTitleStringId = i2;
    }

    public int d() {
        return this.mSectionId;
    }

    public int g() {
        return this.mTitleStringId;
    }
}
