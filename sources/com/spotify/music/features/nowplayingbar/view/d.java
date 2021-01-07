package com.spotify.music.features.nowplayingbar.view;

import android.content.Context;
import com.spotify.libs.connect.model.GaiaDevice;

public final /* synthetic */ class d implements ea2 {
    public final /* synthetic */ GaiaDevice a;

    public /* synthetic */ d(GaiaDevice gaiaDevice) {
        this.a = gaiaDevice;
    }

    @Override // defpackage.ea2
    public final Object apply(Object obj) {
        Context context = (Context) obj;
        return this.a.getName();
    }
}
