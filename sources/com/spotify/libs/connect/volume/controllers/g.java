package com.spotify.libs.connect.volume.controllers;

import kotlin.jvm.internal.h;

final class g<T> implements io.reactivex.functions.g<Float> {
    final /* synthetic */ ConnectVolumeController a;

    g(ConnectVolumeController connectVolumeController) {
        this.a = connectVolumeController;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Float f) {
        Float f2 = f;
        ConnectVolumeController connectVolumeController = this.a;
        h.d(f2, "it");
        ConnectVolumeController.j(connectVolumeController, f2.floatValue());
    }
}
