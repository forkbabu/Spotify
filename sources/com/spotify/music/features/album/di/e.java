package com.spotify.music.features.album.di;

import com.google.common.base.Predicate;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;

public final /* synthetic */ class e implements Predicate {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        s81 s81 = (s81) obj;
        return s81 != null && je.B(s81, HubsGlueComponent.SHUFFLE_BUTTON.id());
    }
}
