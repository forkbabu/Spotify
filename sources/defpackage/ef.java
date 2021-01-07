package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.facebook.internal.n;
import com.facebook.k;
import defpackage.we;

/* access modifiers changed from: package-private */
/* renamed from: ef  reason: default package */
public class ef implements SensorEventListener {
    private a a;

    /* renamed from: ef$a */
    public interface a {
    }

    ef() {
    }

    public void a(a aVar) {
        if (!uf.c(this)) {
            try {
                this.a = aVar;
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
        if (uf.c(this)) {
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (!uf.c(this)) {
            try {
                if (this.a != null) {
                    float[] fArr = sensorEvent.values;
                    boolean z = false;
                    float f = fArr[0];
                    double d = (double) (f / 9.80665f);
                    double d2 = (double) (fArr[1] / 9.80665f);
                    double d3 = (double) (fArr[2] / 9.80665f);
                    Double.isNaN(d);
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    Double.isNaN(d2);
                    double d4 = d2 * d2;
                    Double.isNaN(d3);
                    Double.isNaN(d3);
                    if (Math.sqrt((d3 * d3) + d4 + (d * d)) > 2.299999952316284d) {
                        we.a aVar = (we.a) this.a;
                        n nVar = aVar.a;
                        if (nVar != null && nVar.b()) {
                            z = true;
                        }
                        boolean k = k.k();
                        if (z && k) {
                            we.a(aVar.b);
                        }
                    }
                }
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }
}
