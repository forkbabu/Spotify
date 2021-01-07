package com.spotify.imageresolve;

import android.net.Uri;
import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class t implements s {
    private final r a;

    public t(r rVar) {
        this.a = rVar;
    }

    @Override // com.spotify.imageresolve.s
    public Set<Uri> a(Set<Uri> set) {
        return this.a.a(CacheStatusRequest.create(ImmutableSet.copyOf(Collections2.transform((Iterable) set, (Function) i.a)))).A(e.a).F((R) ImmutableSet.of()).d();
    }
}
