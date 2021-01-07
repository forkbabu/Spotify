package com.spotify.music.features.connect.dialogs.newdevice;

import com.spotify.music.features.connect.dialogs.newdevice.NewDeviceFragment;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ NewDeviceFragment a;

    public /* synthetic */ c(NewDeviceFragment newDeviceFragment) {
        this.a = newDeviceFragment;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        NewDeviceFragment.M4(this.a, (NewDeviceFragment.a) obj);
    }
}
