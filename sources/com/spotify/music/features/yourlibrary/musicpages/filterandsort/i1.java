package com.spotify.music.features.yourlibrary.musicpages.filterandsort;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.C0707R;

public class i1 {
    private final ImmutableMap<String, String> a;

    public i1(Context context) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put("available_offline_only", context.getString(C0707R.string.your_library_music_pages_filtered_offline_only_indicator_title));
        this.a = builder.build();
    }

    public String a(String str) {
        return this.a.get(str);
    }
}
