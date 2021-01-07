package com.spotify.music.podcastentityrow;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.C0707R;

public class h {
    private static final ImmutableMap<String, Integer> b;
    private final Context a;

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put("today", Integer.valueOf((int) C0707R.string.episodes_adapter_header_section_today));
        builder.mo51put("yesterday", Integer.valueOf((int) C0707R.string.episodes_adapter_header_section_yesterday));
        builder.mo51put("thisWeek", Integer.valueOf((int) C0707R.string.episodes_adapter_header_section_week));
        builder.mo51put("twoDaysAgo", Integer.valueOf((int) C0707R.string.episodes_adapter_header_section_two_days_ago));
        builder.mo51put("unplayed", Integer.valueOf((int) C0707R.string.episodes_adapter_header_section_unplayed));
        builder.mo51put("unfinished", Integer.valueOf((int) C0707R.string.episodes_adapter_header_section_continue));
        b = builder.build();
    }

    public h(Context context) {
        this.a = context;
    }

    public String a(String str) {
        Integer num = b.get(str);
        if (num == null) {
            num = Integer.valueOf((int) C0707R.string.episodes_adapter_header_section_unplayed);
        }
        return this.a.getString(num.intValue());
    }
}
