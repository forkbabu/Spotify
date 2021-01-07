package com.spotify.music.storylines.persistence.database;

import com.google.common.base.Function;

public final /* synthetic */ class b implements Function {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        String str = (String) obj;
        if (str != null) {
            return new f(str);
        }
        return null;
    }
}
