package com.spotify.music.features.showentity;

import com.spotify.music.features.showentity.r;
import com.spotify.music.libs.podcast.loader.s;
import io.reactivex.functions.l;
import io.reactivex.y;

public final /* synthetic */ class g implements l {
    public final /* synthetic */ qna a;
    public final /* synthetic */ y b;
    public final /* synthetic */ y c;

    public /* synthetic */ g(qna qna, y yVar, y yVar2) {
        this.a = qna;
        this.b = yVar;
        this.c = yVar2;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        r.b bVar = (r.b) obj;
        return new s(bVar.a(), this.a, this.b, this.c).a().j0(b.a).r0(new h(bVar));
    }
}
