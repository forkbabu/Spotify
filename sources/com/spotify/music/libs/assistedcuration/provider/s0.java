package com.spotify.music.libs.assistedcuration.provider;

import com.google.common.collect.ImmutableList;
import com.spotify.music.libs.assistedcuration.model.e;
import com.spotify.music.libs.assistedcuration.model.h;
import com.spotify.music.libs.assistedcuration.provider.y;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* access modifiers changed from: package-private */
public class s0 implements y.a<v> {
    final /* synthetic */ t0 a;

    s0(t0 t0Var) {
        this.a = t0Var;
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.y.a
    public s<Map<String, v>> a(Set<String> set, String str) {
        return this.a.b.b(set, str, set, 100).j0(y0a.a).r0(v0a.a).j0(new s(this, set)).E0(s.i0(Collections.emptyMap()));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, boolean] */
    @Override // com.spotify.music.libs.assistedcuration.provider.y.a
    public h b(v vVar, boolean z) {
        v vVar2 = vVar;
        return new r0(this, z, ImmutableList.copyOf((Collection) vVar2.e()), vVar2.g());
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: io.reactivex.s<java.lang.Object>, io.reactivex.s<java.util.Map<java.lang.String, com.spotify.music.libs.assistedcuration.provider.v>> */
    @Override // com.spotify.music.libs.assistedcuration.provider.y.a
    public s<Map<String, v>> c(e eVar, Set<String> set) {
        return o.a;
    }

    /* Return type fixed from 'io.reactivex.s' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.spotify.music.libs.assistedcuration.model.e, java.util.Set, java.lang.Object] */
    @Override // com.spotify.music.libs.assistedcuration.provider.y.a
    public s<v> d(e eVar, Set set, v vVar) {
        v vVar2 = vVar;
        return this.a.b.a(eVar.getUri(), set, vVar2.f(), this.a.d.g()).j0(new r(vVar2, eVar));
    }

    /* Return type fixed from 'io.reactivex.s' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.spotify.music.libs.assistedcuration.provider.y.a
    public s<v> e(v vVar) {
        v vVar2 = vVar;
        vVar2.a();
        return s.i0(vVar2);
    }
}
