package com.spotify.music.libs.yourepisodes.views.tooltip;

import android.app.Activity;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;
import kotlin.a;
import kotlin.d;
import kotlin.jvm.internal.h;

public final class YourEpisodesTooltipPrefsImpl implements k {
    private final d a;

    public YourEpisodesTooltipPrefsImpl(Activity activity, i iVar, String str) {
        h.e(activity, "activity");
        h.e(iVar, "sharedPreferencesFactory");
        h.e(str, "username");
        this.a = a.b(new YourEpisodesTooltipPrefsImpl$sharedPreferences$2(iVar, activity, str));
    }

    @Override // com.spotify.music.libs.yourepisodes.views.tooltip.k
    public void a() {
        SpSharedPreferences.a b = ((SpSharedPreferences) this.a.getValue()).b();
        b.a(m.a, true);
        b.i();
    }

    @Override // com.spotify.music.libs.yourepisodes.views.tooltip.k
    public boolean b() {
        return ((SpSharedPreferences) this.a.getValue()).d(m.a, false);
    }
}
