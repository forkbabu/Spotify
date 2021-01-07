package com.spotify.music.features.yourlibrary.container.view;

import com.google.common.base.Function;
import com.spotify.music.yourlibrary.interfaces.f;

public final /* synthetic */ class d implements Function {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        int i = GroupedTabLayout.y;
        return ((f) obj).getViewUri().toString();
    }
}
