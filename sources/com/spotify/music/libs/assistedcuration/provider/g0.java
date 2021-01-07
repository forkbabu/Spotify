package com.spotify.music.libs.assistedcuration.provider;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.libs.assistedcuration.model.e;
import com.spotify.music.libs.assistedcuration.model.h;
import com.spotify.music.libs.assistedcuration.provider.y;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* access modifiers changed from: package-private */
public class g0 implements y.a<v> {
    final /* synthetic */ h0 a;

    g0(h0 h0Var) {
        this.a = h0Var;
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.y.a
    public s<Map<String, v>> a(Set<String> set, String str) {
        faa faa = this.a.b;
        q1a q1a = q1a.a;
        q1a.getClass();
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put("name", Boolean.valueOf(q1a.name()));
        builder.mo51put("artist", Boolean.valueOf(q1a.artist()));
        builder.mo51put("link", Boolean.valueOf(q1a.link()));
        builder.mo51put("covers", Boolean.valueOf(q1a.covers()));
        builder.mo51put("playable", Boolean.valueOf(q1a.playable()));
        builder.mo51put("playabilityRestriction", Boolean.valueOf(q1a.playabilityRestriction()));
        builder.mo51put("is19PlusOnly", Boolean.valueOf(q1a.is19PlusOnly()));
        return faa.a(builder.build()).j0(new l(this, set));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, boolean] */
    @Override // com.spotify.music.libs.assistedcuration.provider.y.a
    public h b(v vVar, boolean z) {
        v vVar2 = vVar;
        return new f0(this, ImmutableList.copyOf((Collection) vVar2.e()), vVar2.g());
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
        return s.B(new k(vVar, eVar));
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
