package com.spotify.music.features.connect.dialogs.newdevice;

import android.content.Intent;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.music.features.connect.dialogs.newdevice.NewDeviceFragment;
import io.reactivex.functions.l;

public final /* synthetic */ class b implements l {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        int i = NewDeviceFragment.s0;
        return new NewDeviceFragment.a((GaiaDevice) ((Intent) obj).getParcelableExtra("connect_device"));
    }
}
