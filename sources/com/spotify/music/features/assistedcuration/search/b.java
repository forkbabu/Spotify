package com.spotify.music.features.assistedcuration.search;

import com.google.common.base.Function;

public final /* synthetic */ class b implements Function {
    public final /* synthetic */ String a;

    public /* synthetic */ b(String str) {
        this.a = str;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        String str = this.a;
        oxa oxa = new oxa();
        oxa.b((String) obj, str);
        return oxa.a();
    }
}
