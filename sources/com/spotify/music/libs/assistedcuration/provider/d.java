package com.spotify.music.libs.assistedcuration.provider;

import io.reactivex.functions.l;
import java.util.Set;

public final /* synthetic */ class d implements l {
    public final /* synthetic */ y a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ String c;

    public /* synthetic */ d(y yVar, Set set, String str) {
        this.a = yVar;
        this.b = set;
        this.c = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.e(this.b, this.c, (CardAction) obj);
    }
}
