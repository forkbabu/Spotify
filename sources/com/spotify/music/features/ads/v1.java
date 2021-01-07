package com.spotify.music.features.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class v1 implements SensorEventListener {
    private boolean a;
    private final SensorManager b;
    private final Sensor c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float[] h = {0.0f, 0.0f, 0.0f};
    private ScheduledExecutorService i;
    private boolean j;
    private Future<?> k;
    private final Runnable l = new a();
    private final List<b> m = new ArrayList(1);
    private boolean n;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v1.this.k != null && !v1.this.k.isCancelled()) {
                v1.b(v1.this);
            }
        }
    }

    public interface b {
        void a();

        void b();
    }

    public v1(Context context) {
        Sensor sensor;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.b = sensorManager;
        if (sensorManager.getDefaultSensor(10) == null) {
            sensor = sensorManager.getDefaultSensor(1);
        } else {
            sensor = sensorManager.getDefaultSensor(10);
        }
        this.c = sensor;
        this.a = false;
        this.j = false;
    }

    static void b(v1 v1Var) {
        boolean z = ((double) v1Var.g) > 0.1d;
        if (v1Var.n != z) {
            v1Var.n = z;
            if (z) {
                for (b bVar : v1Var.m) {
                    bVar.a();
                }
                return;
            }
            for (b bVar2 : v1Var.m) {
                bVar2.b();
            }
        }
    }

    public void c(b bVar) {
        this.m.add(bVar);
    }

    public boolean d() {
        return this.c != null;
    }

    public void e() {
        SensorManager sensorManager;
        Sensor sensor = this.c;
        if (sensor != null && (sensorManager = this.b) != null) {
            sensorManager.registerListener(this, sensor, 3);
            this.a = true;
            if (!this.j) {
                this.j = true;
                if (this.i == null) {
                    this.i = Executors.newSingleThreadScheduledExecutor();
                }
                ScheduledExecutorService scheduledExecutorService = this.i;
                this.i = scheduledExecutorService;
                this.k = scheduledExecutorService.scheduleAtFixedRate(this.l, 0, 3000, TimeUnit.MILLISECONDS);
            }
        }
    }

    public void f() {
        Future<?> future;
        this.m.clear();
        if (this.j && (future = this.k) != null) {
            future.cancel(false);
        }
        ScheduledExecutorService scheduledExecutorService = this.i;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
            this.i = null;
        }
        this.j = false;
        SensorManager sensorManager = this.b;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.a = false;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (!this.a) {
            SensorManager sensorManager = this.b;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
                this.a = false;
            }
            Logger.b("SensorUpdate disabled. return", new Object[0]);
            return;
        }
        if (sensorEvent != null) {
            if (sensorEvent.sensor.getType() == 10) {
                float[] fArr = sensorEvent.values;
                this.d = fArr[0];
                this.e = fArr[1];
                this.f = fArr[2];
            }
            if (sensorEvent.sensor.getType() == 1) {
                float[] fArr2 = this.h;
                float[] fArr3 = sensorEvent.values;
                fArr2[0] = (fArr3[0] * 0.19999999f) + (fArr2[0] * 0.8f);
                fArr2[1] = (fArr3[1] * 0.19999999f) + (fArr2[1] * 0.8f);
                fArr2[2] = (fArr3[2] * 0.19999999f) + (fArr2[2] * 0.8f);
                this.d = fArr3[0] - fArr2[0];
                this.e = fArr3[1] - fArr2[1];
                this.f = fArr3[2] - fArr2[2];
            }
        }
        float f2 = this.d;
        float f3 = this.e;
        float f4 = (f3 * f3) + (f2 * f2);
        float f5 = this.f;
        this.g = (f5 * f5) + f4;
    }
}
