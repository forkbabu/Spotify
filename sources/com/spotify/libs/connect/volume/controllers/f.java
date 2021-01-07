package com.spotify.libs.connect.volume.controllers;

import com.google.common.base.Optional;
import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.g;

final class f<T> implements g<Optional<GaiaDevice>> {
    final /* synthetic */ ConnectVolumeController a;

    f(ConnectVolumeController connectVolumeController) {
        this.a = connectVolumeController;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00b9  */
    @Override // io.reactivex.functions.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void accept(com.google.common.base.Optional<com.spotify.libs.connect.model.GaiaDevice> r6) {
        /*
            r5 = this;
            com.google.common.base.Optional r6 = (com.google.common.base.Optional) r6
            java.lang.String r0 = "it"
            kotlin.jvm.internal.h.d(r6, r0)
            boolean r0 = r6.isPresent()
            java.lang.String r1 = "it.get()"
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x003d
            java.lang.Object r0 = r6.get()
            kotlin.jvm.internal.h.d(r0, r1)
            com.spotify.libs.connect.model.GaiaDevice r0 = (com.spotify.libs.connect.model.GaiaDevice) r0
            boolean r0 = r0.isSelf()
            if (r0 != 0) goto L_0x003d
            java.lang.Object r0 = r6.get()
            com.spotify.libs.connect.model.GaiaDevice r0 = (com.spotify.libs.connect.model.GaiaDevice) r0
            boolean r0 = r0.supportsVolume()
            if (r0 == 0) goto L_0x003d
            java.lang.Object r0 = r6.get()
            kotlin.jvm.internal.h.d(r0, r1)
            com.spotify.libs.connect.model.GaiaDevice r0 = (com.spotify.libs.connect.model.GaiaDevice) r0
            int r0 = r0.getVolumeSteps()
            if (r0 <= 0) goto L_0x003d
            r0 = 1
            goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            if (r0 == 0) goto L_0x00b9
            java.lang.Object r0 = r6.get()
            kotlin.jvm.internal.h.d(r0, r1)
            com.spotify.libs.connect.model.GaiaDevice r0 = (com.spotify.libs.connect.model.GaiaDevice) r0
            int r0 = r0.getVolume()
            com.spotify.libs.connect.volume.controllers.ConnectVolumeController r4 = r5.a
            java.lang.Object r6 = r6.get()
            kotlin.jvm.internal.h.d(r6, r1)
            com.spotify.libs.connect.model.GaiaDevice r6 = (com.spotify.libs.connect.model.GaiaDevice) r6
            int r6 = r6.getVolumeSteps()
            com.spotify.libs.connect.volume.controllers.ConnectVolumeController.l(r4, r6)
            com.spotify.libs.connect.volume.controllers.ConnectVolumeController r6 = r5.a
            r1 = 1065353216(0x3f800000, float:1.0)
            int r4 = com.spotify.libs.connect.volume.controllers.ConnectVolumeController.i(r6)
            float r4 = (float) r4
            float r1 = r1 / r4
            com.spotify.libs.connect.volume.controllers.ConnectVolumeController.k(r6, r1)
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r6[r2] = r1
            com.spotify.libs.connect.volume.controllers.ConnectVolumeController r1 = r5.a
            int r1 = com.spotify.libs.connect.volume.controllers.ConnectVolumeController.i(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6[r3] = r1
            r1 = 2
            com.spotify.libs.connect.volume.controllers.ConnectVolumeController r2 = r5.a
            float r2 = com.spotify.libs.connect.volume.controllers.ConnectVolumeController.h(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r6[r1] = r2
            r1 = 3
            com.spotify.libs.connect.volume.controllers.ConnectVolumeController r2 = r5.a
            float r2 = com.spotify.libs.connect.volume.controllers.ConnectVolumeController.d(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r6[r1] = r2
            r1 = 4
            com.spotify.libs.connect.volume.controllers.ConnectVolumeController r2 = r5.a
            float r2 = r2.f()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r6[r1] = r2
            java.lang.String r1 = "deviceVolume %d volumeSteps %d volumeStep %f volume %f getVolume(): %f"
            com.spotify.base.java.logging.Logger.b(r1, r6)
            com.spotify.libs.connect.volume.controllers.ConnectVolumeController r6 = r5.a
            float r0 = (float) r0
            r1 = 65535(0xffff, float:9.1834E-41)
            float r1 = (float) r1
            float r0 = r0 / r1
            com.spotify.libs.connect.volume.controllers.ConnectVolumeController.j(r6, r0)
            goto L_0x00ca
        L_0x00b9:
            com.spotify.libs.connect.volume.controllers.ConnectVolumeController r6 = r5.a
            com.spotify.libs.connect.volume.controllers.ConnectVolumeController.l(r6, r2)
            com.spotify.libs.connect.volume.controllers.ConnectVolumeController r6 = r5.a
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            com.spotify.libs.connect.volume.controllers.ConnectVolumeController.k(r6, r0)
            com.spotify.libs.connect.volume.controllers.ConnectVolumeController r6 = r5.a
            com.spotify.libs.connect.volume.controllers.ConnectVolumeController.j(r6, r0)
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.libs.connect.volume.controllers.f.accept(java.lang.Object):void");
    }
}
