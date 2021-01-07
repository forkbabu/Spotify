package com.spotify.music.genie;

import com.spotify.mobile.android.util.l0;
import com.spotify.music.genie.Wish;
import io.reactivex.functions.l;

public final /* synthetic */ class e implements l {
    public final /* synthetic */ q a;

    public /* synthetic */ e(q qVar) {
        this.a = qVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        this.a.getClass();
        String B = l0.a((String) obj).B();
        B.getClass();
        return new n(B, "Liked Songs", Wish.Action.PLAY_URI);
    }
}
