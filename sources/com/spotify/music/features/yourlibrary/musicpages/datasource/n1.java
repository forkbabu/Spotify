package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.google.common.base.Function;
import java.util.Map;

public final /* synthetic */ class n1 implements Function {
    public final /* synthetic */ o4 a;

    public /* synthetic */ n1(o4 o4Var) {
        this.a = o4Var;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return this.a.e((Map.Entry) obj);
    }
}
