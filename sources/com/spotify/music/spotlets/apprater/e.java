package com.spotify.music.spotlets.apprater;

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.l;

public final /* synthetic */ class e implements l {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Optional optional = (Optional) obj;
        SpSharedPreferences.b<Object, Boolean> bVar = AppRaterFragment.s0;
        return optional.isPresent() ? ((ContextTrack) optional.get()).uri() : "";
    }
}
