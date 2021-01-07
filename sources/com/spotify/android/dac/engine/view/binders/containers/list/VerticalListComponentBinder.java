package com.spotify.android.dac.engine.view.binders.containers.list;

import android.view.View;
import android.view.ViewGroup;
import com.google.protobuf.Any;
import com.spotify.android.dac.api.view.helpers.a;
import com.spotify.dac.api.components.proto.VerticalListComponent;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class VerticalListComponentBinder implements a<VerticalListComponent> {
    private final b a;

    public VerticalListComponentBinder(wlf<s80> wlf) {
        h.e(wlf, "dacResolverProvider");
        this.a = new b(wlf);
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public smf<ViewGroup, VerticalListComponent, Boolean, View> builder() {
        return new VerticalListComponentBinder$builder$1(this);
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public rmf<View, VerticalListComponent, f> c() {
        return new VerticalListComponentBinder$binder$1(this);
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public cmf<f> d() {
        return a.C0144a.a();
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public nmf<Any, VerticalListComponent> e() {
        return VerticalListComponentBinder$parser$1.a;
    }
}
