package com.spotify.music.features.queue.service;

import com.spotify.player.model.PlayerQueue;
import io.reactivex.functions.l;
import java.util.List;

public final /* synthetic */ class f implements l {
    public final /* synthetic */ s a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String f;

    public /* synthetic */ f(s sVar, List list, String str, String str2) {
        this.a = sVar;
        this.b = list;
        this.c = str;
        this.f = str2;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.h(this.b, this.c, this.f, (PlayerQueue) obj);
    }
}
