package com.spotify.imageresolve;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;

public final /* synthetic */ class h implements Predicate {
    public final /* synthetic */ Optional a;

    public /* synthetic */ h(Optional optional) {
        this.a = optional;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return ((v) this.a.get()).c().equals(((a0) obj).b());
    }
}
