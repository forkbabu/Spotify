package com.spotify.music.nowplayingmini.empty;

import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import io.reactivex.functions.l;

public final /* synthetic */ class a implements l {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        EmptyModeFragment emptyModeFragment = new EmptyModeFragment();
        d.a(emptyModeFragment, (c) obj);
        return emptyModeFragment;
    }
}
