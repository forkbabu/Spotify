package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.google.common.base.Predicate;
import java.util.Map;

public final /* synthetic */ class j2 implements Predicate {
    public final /* synthetic */ x4 a;

    public /* synthetic */ j2(x4 x4Var) {
        this.a = x4Var;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return this.a.b((Map.Entry) obj);
    }
}
