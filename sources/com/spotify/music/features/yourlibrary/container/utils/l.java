package com.spotify.music.features.yourlibrary.container.utils;

import android.content.Context;
import com.spotify.music.C0707R;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageGroup;

public class l {
    private final Context a;

    public l(Context context) {
        this.a = context;
    }

    public String a(YourLibraryPageGroup yourLibraryPageGroup) {
        int ordinal = yourLibraryPageGroup.ordinal();
        if (ordinal == 0) {
            return this.a.getString(C0707R.string.your_library_music_tab_label);
        }
        if (ordinal == 1) {
            return this.a.getString(C0707R.string.your_library_podcasts_tab_label);
        }
        throw new IllegalArgumentException("Unsupported group");
    }
}
