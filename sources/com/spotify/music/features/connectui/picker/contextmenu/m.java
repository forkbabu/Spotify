package com.spotify.music.features.connectui.picker.contextmenu;

public final class m implements fjf<l> {
    private final wlf<DeviceContextMenuFragment> a;

    public m(wlf<DeviceContextMenuFragment> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l(this.a.get());
    }
}
