package com.spotify.mobile.android.util;

class i0 implements Runnable {
    final /* synthetic */ SensorRecorder a;

    i0(SensorRecorder sensorRecorder) {
        this.a = sensorRecorder;
    }

    @Override // java.lang.Runnable
    public void run() {
        SensorRecorder.a(this.a);
        SensorRecorder.d(this.a);
    }
}
