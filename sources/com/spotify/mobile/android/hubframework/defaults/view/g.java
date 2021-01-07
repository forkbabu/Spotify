package com.spotify.mobile.android.hubframework.defaults.view;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories;
import com.spotify.mobile.android.util.x;

final class g implements HubsGlueViewBinderFactories.e {
    private final HubsGlueViewBinderFactories.e b;
    private final HubsGlueViewBinderFactories.e c;

    private g(HubsGlueViewBinderFactories.e eVar, HubsGlueViewBinderFactories.e eVar2) {
        eVar.getClass();
        this.b = eVar;
        eVar2.getClass();
        this.c = eVar2;
    }

    static HubsGlueViewBinderFactories.e c(HubsGlueViewBinderFactories.e eVar, HubsGlueViewBinderFactories.e eVar2) {
        return new g(eVar, eVar2);
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.e
    public e61 a(Context context, w51 w51) {
        return (x.h(context) ? this.b : this.c).a(context, w51);
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.view.HubsGlueViewBinderFactories.e
    public e61 b(Context context, w51 w51, RecyclerView.q qVar) {
        return (x.h(context) ? this.b : this.c).b(context, w51, qVar);
    }
}
