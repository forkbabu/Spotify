package com.spotify.android.dac.engine.view.binders.common;

import android.view.View;
import android.view.ViewGroup;
import com.google.protobuf.Any;
import com.spotify.android.dac.api.view.helpers.a;
import com.spotify.dac.api.components.proto.NotFoundComponent;
import kotlin.f;

public final class NotFoundComponentBinder implements a<NotFoundComponent> {
    @Override // com.spotify.android.dac.api.view.helpers.a
    public smf<ViewGroup, NotFoundComponent, Boolean, View> builder() {
        return NotFoundComponentBinder$builder$1.a;
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public rmf<View, NotFoundComponent, f> c() {
        return NotFoundComponentBinder$binder$1.a;
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public cmf<f> d() {
        return a.C0144a.a();
    }

    @Override // com.spotify.android.dac.api.view.helpers.a
    public nmf<Any, NotFoundComponent> e() {
        return NotFoundComponentBinder$parser$1.a;
    }
}
