package com.spotify.android.dac.engine.view.binders.containers.list;

import android.view.View;
import android.view.ViewGroup;
import com.google.protobuf.Any;
import com.spotify.android.dac.api.view.helpers.a;
import com.spotify.dac.api.components.proto.HorizontalListComponent;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class HorizontalListComponentBinder implements a<HorizontalListComponent> {
    private final b a;
    private final wlf<s80> b;

    public HorizontalListComponentBinder(wlf<s80> wlf) {
        h.e(wlf, "dacResolverProvider");
        this.b = wlf;
        this.a = new b(wlf);
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public smf<ViewGroup, HorizontalListComponent, Boolean, View> builder() {
        return new HorizontalListComponentBinder$builder$1(this);
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public rmf<View, HorizontalListComponent, f> c() {
        return new HorizontalListComponentBinder$binder$1(this);
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public cmf<f> d() {
        return a.C0144a.a();
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public nmf<Any, HorizontalListComponent> e() {
        return HorizontalListComponentBinder$parser$1.a;
    }
}
