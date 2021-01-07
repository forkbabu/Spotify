package com.spotify.music.libs.yourepisodes.views.tooltip;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import kotlin.jvm.internal.h;

public final class m {
    private static final SpSharedPreferences.b<Object, Boolean> a;

    static {
        SpSharedPreferences.b<Object, Boolean> e = SpSharedPreferences.b.e("is_your_episodes_tooltip_shown");
        h.d(e, "PrefsKey.makeUserKey(PREFS_ID)");
        a = e;
    }
}
