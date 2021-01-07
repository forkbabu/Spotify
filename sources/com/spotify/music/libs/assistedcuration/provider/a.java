package com.spotify.music.libs.assistedcuration.provider;

import io.reactivex.functions.l;
import java.util.Map;
import java.util.Set;

public final /* synthetic */ class a implements l {
    public final /* synthetic */ y a;
    public final /* synthetic */ Set b;

    public /* synthetic */ a(y yVar, Set set) {
        this.a = yVar;
        this.b = set;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.f(this.b, (Map) obj);
    }
}
