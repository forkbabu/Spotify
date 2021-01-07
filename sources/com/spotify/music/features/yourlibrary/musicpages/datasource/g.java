package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.google.common.base.Function;
import java.util.Map;

public final /* synthetic */ class g implements Function {
    public static final /* synthetic */ g a = new g();

    private /* synthetic */ g() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return (String) ((Map.Entry) obj).getKey();
    }
}
