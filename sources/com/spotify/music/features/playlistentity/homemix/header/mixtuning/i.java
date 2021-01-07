package com.spotify.music.features.playlistentity.homemix.header.mixtuning;

import android.view.View;
import io.reactivex.functions.l;

public final /* synthetic */ class i implements l {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;

    public /* synthetic */ i(View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        View view = this.a;
        View view2 = this.b;
        Boolean bool = (Boolean) obj;
        view.setSelected(false);
        view2.setEnabled(false);
        view2.setSelected(!bool.booleanValue());
        return Boolean.valueOf(!bool.booleanValue());
    }
}
