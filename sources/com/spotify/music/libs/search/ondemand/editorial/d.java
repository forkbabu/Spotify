package com.spotify.music.libs.search.ondemand.editorial;

import com.spotify.music.libs.search.ondemand.editorial.e;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ EditorialOnDemandInfo a;
    public final /* synthetic */ e.a b;
    public final /* synthetic */ e.a c;

    public /* synthetic */ d(EditorialOnDemandInfo editorialOnDemandInfo, e.a aVar, e.a aVar2) {
        this.a = editorialOnDemandInfo;
        this.b = aVar;
        this.c = aVar2;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        EditorialOnDemandInfo editorialOnDemandInfo = this.a;
        e.a aVar = this.b;
        e.a aVar2 = this.c;
        if (((Boolean) obj).booleanValue()) {
            aVar.accept(editorialOnDemandInfo);
        } else {
            aVar2.accept(editorialOnDemandInfo);
        }
    }
}
