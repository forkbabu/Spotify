package com.spotify.mobile.android.hubframework.defaults.playback;

import io.reactivex.functions.l;
import java.util.List;

public final /* synthetic */ class f implements l {
    public final /* synthetic */ HubsTracksPlayerHelper a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String f;

    public /* synthetic */ f(HubsTracksPlayerHelper hubsTracksPlayerHelper, List list, int i, String str) {
        this.a = hubsTracksPlayerHelper;
        this.b = list;
        this.c = i;
        this.f = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.a(this.b, this.c, this.f, (Boolean) obj);
    }
}
