package com.facebook.share.internal;

import com.facebook.internal.f0;
import com.facebook.internal.z;
import com.facebook.share.model.o;
import java.util.UUID;

/* access modifiers changed from: package-private */
public final class h0 implements f0.c<o, z.b> {
    final /* synthetic */ UUID a;

    h0(UUID uuid) {
        this.a = uuid;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.facebook.internal.f0.c
    public z.b apply(o oVar) {
        return c.a(this.a, oVar);
    }
}
