package com.spotify.music.follow.resolver;

import android.net.Uri;
import com.google.common.base.Function;

public final /* synthetic */ class d implements Function {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        String str = (String) obj;
        str.getClass();
        return Uri.decode(str);
    }
}
