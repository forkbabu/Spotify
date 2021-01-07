package com.spotify.music.features.findfriends;

import io.reactivex.functions.l;
import java.util.Locale;

public final /* synthetic */ class z implements l {
    public static final /* synthetic */ z a = new z();

    private /* synthetic */ z() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((String) obj).toLowerCase(Locale.getDefault());
    }
}
