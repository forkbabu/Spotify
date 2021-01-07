package com.spotify.music.features.freetierartist.discographysortandfilter.sort;

import com.spotify.music.C0707R;

public enum SortCriteria {
    DEFAULT(C0707R.string.discography_sort_criteria_release_date),
    ALPHABETICAL(C0707R.string.discography_sort_criteria_alphabetical),
    RELEASE_DATE(C0707R.string.discography_sort_criteria_release_date),
    POPULARITY(C0707R.string.discography_sort_criteria_popularity);
    
    private final int label;

    private SortCriteria(int i) {
        this.label = i;
    }

    public final int d() {
        return this.label;
    }
}
