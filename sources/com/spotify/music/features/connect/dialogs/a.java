package com.spotify.music.features.connect.dialogs;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ SwitchDeviceFragment a;

    public /* synthetic */ a(SwitchDeviceFragment switchDeviceFragment) {
        this.a = switchDeviceFragment;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.M4((GaiaDevice) obj);
    }
}
