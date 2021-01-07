package com.spotify.music.libs.yourepisodes.views.tooltip;

import android.app.Activity;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;
import kotlin.jvm.internal.Lambda;

final class YourEpisodesTooltipPrefsImpl$sharedPreferences$2 extends Lambda implements cmf<SpSharedPreferences<Object>> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ i $sharedPreferencesFactory;
    final /* synthetic */ String $username;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    YourEpisodesTooltipPrefsImpl$sharedPreferences$2(i iVar, Activity activity, String str) {
        super(0);
        this.$sharedPreferencesFactory = iVar;
        this.$activity = activity;
        this.$username = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public SpSharedPreferences<Object> invoke() {
        return this.$sharedPreferencesFactory.b(this.$activity, this.$username);
    }
}
