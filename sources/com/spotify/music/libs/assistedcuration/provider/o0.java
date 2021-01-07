package com.spotify.music.libs.assistedcuration.provider;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.l0;
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
public class o0 implements y.a<z0> {
    final /* synthetic */ p0 a;

    o0(p0 p0Var) {
        this.a = p0Var;
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: io.reactivex.s<java.lang.Object>, io.reactivex.s<java.util.Map<java.lang.String, com.spotify.music.libs.assistedcuration.provider.z0>> */
    @Override // com.spotify.music.libs.assistedcuration.provider.y.a
    public s<Map<String, z0>> a(Set<String> set, String str) {
        return o.a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, boolean] */
    @Override // com.spotify.music.libs.assistedcuration.provider.y.a
    public h b(z0 z0Var, boolean z) {
        z0 z0Var2 = z0Var;
        return new n0(this, z0Var2.getUri(), z0Var2.k(), ImmutableList.copyOf((Collection) z0Var2.e()), z0Var2.g());
    }

    @Override // com.spotify.music.libs.assistedcuration.provider.y.a
    public s<Map<String, z0>> c(e eVar, Set<String> set) {
        String uri = eVar.getUri();
        return s.m(this.a.b.a(uri, set, Collections.emptyList(), 50), this.a.c.a(uri, set), this.a.d.a(uri, set), new o(this, eVar));
    }

    /* Return type fixed from 'io.reactivex.s' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.spotify.music.libs.assistedcuration.model.e, java.util.Set, java.lang.Object] */
    @Override // com.spotify.music.libs.assistedcuration.provider.y.a
    public s<z0> d(e eVar, Set set, z0 z0Var) {
        z0 z0Var2 = z0Var;
        int ordinal = l0.z(z0Var2.getUri()).q().ordinal();
        if (ordinal == 6 || ordinal == 14) {
            return s.B(new q(z0Var2, eVar));
        }
        return this.a.b.a(eVar.getUri(), set, z0Var2.f(), this.a.f.g()).j0(new p(z0Var2, eVar));
    }

    /* Return type fixed from 'io.reactivex.s' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.spotify.music.libs.assistedcuration.provider.y.a
    public s<z0> e(z0 z0Var) {
        z0 z0Var2 = z0Var;
        z0Var2.a();
        return s.i0(z0Var2);
    }
}
