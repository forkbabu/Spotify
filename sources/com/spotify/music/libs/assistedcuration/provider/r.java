package com.spotify.music.libs.assistedcuration.provider;

import com.spotify.music.libs.assistedcuration.model.e;
import io.reactivex.functions.l;
import java.util.List;

public final /* synthetic */ class r implements l {
    public final /* synthetic */ v a;
    public final /* synthetic */ e b;

    public /* synthetic */ r(v vVar, e eVar) {
        this.a = vVar;
        this.b = eVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        v vVar = this.a;
        vVar.b(this.b, (List) obj);
        return vVar;
    }
}
