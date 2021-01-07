package com.spotify.music.libs.assistedcuration.provider;

import com.google.common.collect.ImmutableList;
import com.spotify.music.libs.assistedcuration.model.e;
import com.spotify.music.libs.assistedcuration.model.h;
import com.spotify.music.libs.assistedcuration.provider.y;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* access modifiers changed from: package-private */
public class w0 implements y.a<e0> {
    final /* synthetic */ x0 a;

    w0(x0 x0Var) {
        this.a = x0Var;
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.y.a
    public s<Map<String, e0>> a(Set<String> set, String str) {
        return s.n(s.i0(set), this.a.b.a(2, 100, str), new u(this));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, boolean] */
    @Override // com.spotify.music.libs.assistedcuration.provider.y.a
    public h b(e0 e0Var, boolean z) {
        e0 e0Var2 = e0Var;
        return new v0(this, e0Var2.k(), ImmutableList.copyOf((Collection) e0Var2.e()), e0Var2.g());
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: io.reactivex.s<java.lang.Object>, io.reactivex.s<java.util.Map<java.lang.String, com.spotify.music.libs.assistedcuration.provider.e0>> */
    @Override // com.spotify.music.libs.assistedcuration.provider.y.a
    public s<Map<String, e0>> c(e eVar, Set<String> set) {
        return o.a;
    }

    /* Return type fixed from 'io.reactivex.s' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.spotify.music.libs.assistedcuration.model.e, java.util.Set, java.lang.Object] */
    @Override // com.spotify.music.libs.assistedcuration.provider.y.a
    public s<e0> d(e eVar, Set set, e0 e0Var) {
        return s.B(new t(e0Var, eVar));
    }

    /* Return type fixed from 'io.reactivex.s' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.spotify.music.libs.assistedcuration.provider.y.a
    public s<e0> e(e0 e0Var) {
        e0 e0Var2 = e0Var;
        e0Var2.a();
        return s.i0(e0Var2);
    }
}
