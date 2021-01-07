package com.spotify.mobile.android.util;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.google.protobuf.u;
import com.spotify.encore.mobile.snackbar.SnackbarUtilsKt;
import com.spotify.messages.ProcessedSensorData;
import com.spotify.remoteconfig.ck;
import io.reactivex.functions.g;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.List;

public class SensorRecorder implements SensorEventListener {
    private final Context a;
    private final gl0<u> b;
    private final Handler c;
    private final Handler d;
    private SensorManager e;
    private Sensor f;
    private Sensor g;
    private String h;
    private io.reactivex.disposables.b i = EmptyDisposable.INSTANCE;
    private final ck j;
    private c k;
    private c l;

    public enum RecordingPurpose {
        TRAINING,
        CLASSIFICATION
    }

    /* access modifiers changed from: private */
    public class a implements g<Boolean> {
        private final int a;
        private final b b;

        public a(int i, b bVar) {
            this.a = i;
            this.b = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Boolean bool) {
            if (bool.booleanValue()) {
                SensorRecorder.this.h();
                SensorRecorder.this.c.postDelayed(this.b, (long) this.a);
            }
        }
    }

    /* access modifiers changed from: private */
    public class b implements Runnable {
        private final String a;
        private int b;

        public b(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b < 8) {
                SensorRecorder.c(SensorRecorder.this, this.a);
                SensorRecorder.this.c.postDelayed(this, 10000);
                this.b++;
            }
        }
    }

    /* access modifiers changed from: private */
    public static class c {
        List<Double> a;
        List<Double> b;
        List<Double> c;
        List<Double> d;

        public c(int i) {
            this.a = new ArrayList(i);
            this.b = new ArrayList(i);
            this.c = new ArrayList(i);
            this.d = new ArrayList(i);
        }

        public void a(float f, float f2, float f3) {
            this.a.add(Double.valueOf((double) f));
            this.b.add(Double.valueOf((double) f2));
            this.c.add(Double.valueOf((double) f3));
            float f4 = f3 * f3;
            this.d.add(Double.valueOf(Math.sqrt((double) (f4 + (f2 * f2) + (f * f)))));
        }
    }

    public SensorRecorder(Context context, ck ckVar, gl0<u> gl0) {
        this.a = context;
        this.b = gl0;
        this.c = new Handler();
        this.d = new Handler();
        this.j = ckVar;
    }

    static void c(SensorRecorder sensorRecorder, String str) {
        SensorManager sensorManager = (SensorManager) sensorRecorder.a.getSystemService("sensor");
        sensorRecorder.e = sensorManager;
        if (sensorManager != null) {
            sensorRecorder.f = sensorManager.getDefaultSensor(1);
            Sensor defaultSensor = sensorRecorder.e.getDefaultSensor(4);
            sensorRecorder.g = defaultSensor;
            if (sensorRecorder.f != null && defaultSensor != null) {
                sensorRecorder.k = new c(SnackbarUtilsKt.SNACKBAR_ACTION_DURATION);
                sensorRecorder.l = new c(SnackbarUtilsKt.SNACKBAR_ACTION_DURATION);
                sensorRecorder.h = str;
                boolean registerListener = sensorRecorder.e.registerListener(sensorRecorder, sensorRecorder.f, 0);
                boolean registerListener2 = sensorRecorder.e.registerListener(sensorRecorder, sensorRecorder.g, 0);
                if (registerListener && registerListener2) {
                    sensorRecorder.d.removeCallbacksAndMessages(null);
                    sensorRecorder.d.postDelayed(new i0(sensorRecorder), 5000);
                }
            }
        }
    }

    static void d(SensorRecorder sensorRecorder) {
        c cVar;
        if (!(sensorRecorder.l == null || (cVar = sensorRecorder.k) == null)) {
            sensorRecorder.e("accelerometer", sensorRecorder.h, cVar.d);
            sensorRecorder.e("accelerometer_X", sensorRecorder.h, sensorRecorder.k.a);
            sensorRecorder.e("accelerometer_Y", sensorRecorder.h, sensorRecorder.k.b);
            sensorRecorder.e("accelerometer_Z", sensorRecorder.h, sensorRecorder.k.c);
            sensorRecorder.e("gyroscope", sensorRecorder.h, sensorRecorder.l.d);
            sensorRecorder.e("gyroscope_X", sensorRecorder.h, sensorRecorder.l.a);
            sensorRecorder.e("gyroscope_Y", sensorRecorder.h, sensorRecorder.l.b);
            sensorRecorder.e("gyroscope_Z", sensorRecorder.h, sensorRecorder.l.c);
        }
        sensorRecorder.k = null;
        sensorRecorder.l = null;
    }

    private void e(String str, String str2, List<Double> list) {
        if (!(list == null || list.isEmpty())) {
            double doubleValue = list.get(0).doubleValue();
            double d2 = 0.0d;
            double d3 = doubleValue;
            double d4 = 0.0d;
            for (Double d5 : list) {
                d4 += d5.doubleValue();
                if (d5.doubleValue() < doubleValue) {
                    doubleValue = d5.doubleValue();
                }
                if (d5.doubleValue() > d3) {
                    d3 = d5.doubleValue();
                }
            }
            double size = (double) list.size();
            Double.isNaN(size);
            Double.isNaN(size);
            double d6 = d4 / size;
            for (Double d7 : list) {
                double doubleValue2 = d7.doubleValue() - d6;
                d2 += doubleValue2 * doubleValue2;
            }
            double size2 = (double) (list.size() - 1);
            Double.isNaN(size2);
            Double.isNaN(size2);
            ProcessedSensorData.b p = ProcessedSensorData.p();
            p.q(str);
            p.m(str2);
            p.p(doubleValue);
            p.n(d3);
            p.o(d6);
            p.r(d2 / size2);
            this.b.c(p.build());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void h() {
        this.d.removeCallbacksAndMessages(null);
        this.i.dispose();
        Sensor sensor = this.f;
        if (sensor != null) {
            this.e.unregisterListener(this, sensor);
        }
        Sensor sensor2 = this.g;
        if (sensor2 != null) {
            this.e.unregisterListener(this, sensor2);
        }
    }

    public void f(String str, RecordingPurpose recordingPurpose, int i2) {
        boolean z;
        a aVar = new a(i2, new b(str));
        if (recordingPurpose == RecordingPurpose.CLASSIFICATION) {
            z = this.j.a();
        } else {
            z = recordingPurpose == RecordingPurpose.TRAINING ? this.j.b() : false;
        }
        this.i = z.z(Boolean.valueOf(z)).subscribe(aVar);
    }

    public void g() {
        this.c.removeCallbacksAndMessages(null);
        h();
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent != null && this.k != null && this.l != null) {
            if (sensorEvent.sensor.getType() == 1 && this.k.d.size() < 2000) {
                c cVar = this.k;
                float[] fArr = sensorEvent.values;
                cVar.a(fArr[0], fArr[1], fArr[2]);
            } else if (sensorEvent.sensor.getType() == 4 && this.l.d.size() < 2000) {
                c cVar2 = this.l;
                float[] fArr2 = sensorEvent.values;
                cVar2.a(fArr2[0], fArr2[1], fArr2[2]);
            }
        }
    }
}
