package com.spotify.music.libs.mediabrowserservice;

import com.spotify.music.genie.Wish;
import io.reactivex.functions.l;

public final /* synthetic */ class b1 implements l {
    public final /* synthetic */ z2 a;

    public /* synthetic */ b1(z2 z2Var) {
        this.a = z2Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return z2.a(this.a, (Wish) obj);
    }
}
