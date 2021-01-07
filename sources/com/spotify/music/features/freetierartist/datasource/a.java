package com.spotify.music.features.freetierartist.datasource;

import io.reactivex.functions.l;
import java.util.Map;

public final /* synthetic */ class a implements l {
    public final /* synthetic */ q a;
    public final /* synthetic */ String b;

    public /* synthetic */ a(q qVar, String str) {
        this.a = qVar;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b(this.b, (Map) obj);
    }
}
