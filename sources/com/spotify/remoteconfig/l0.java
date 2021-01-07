package com.spotify.remoteconfig;

import com.spotify.remoteconfig.xi;

public final /* synthetic */ class l0 implements o0e {
    public static final /* synthetic */ l0 a = new l0();

    private /* synthetic */ l0() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("sensor-recorder", "driving_car_view_record_sensor_data_for_classification", false);
        boolean a3 = p0e.a("sensor-recorder", "driving_car_view_record_sensor_data_for_training", false);
        xi.b bVar = new xi.b();
        bVar.b(false);
        bVar.c(false);
        bVar.b(a2);
        bVar.c(a3);
        return bVar.a();
    }
}
