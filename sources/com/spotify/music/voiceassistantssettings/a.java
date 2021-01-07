package com.spotify.music.voiceassistantssettings;

import com.google.common.collect.ImmutableMap;
import com.spotify.music.libs.partnerapps.PartnerType;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class a<T> implements g<ImmutableMap<PartnerType, bla>> {
    final /* synthetic */ c a;

    a(c cVar) {
        this.a = cVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(ImmutableMap<PartnerType, bla> immutableMap) {
        ImmutableMap<PartnerType, bla> immutableMap2 = immutableMap;
        h.e(immutableMap2, "integrations");
        c.b(this.a, immutableMap2);
    }
}
