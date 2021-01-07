package com.spotify.music.features.queue.service;

import io.reactivex.functions.l;
import java.util.List;

public final /* synthetic */ class j implements l {
    public final /* synthetic */ s a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ j(s sVar, String str, String str2) {
        this.a = sVar;
        this.b = str;
        this.c = str2;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.f(this.b, this.c, (List) obj);
    }
}
