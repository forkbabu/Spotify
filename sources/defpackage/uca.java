package defpackage;

import androidx.media.v;
import com.spotify.libs.connect.instrumentation.ConnectVolumeControlInstrumentation;
import com.spotify.libs.connect.instrumentation.g;
import com.spotify.libs.connect.volume.controllers.k;
import kotlin.f;

/* renamed from: uca  reason: default package */
public class uca extends v {
    private final k f;
    private final dda g;
    private final g h;
    private final ConnectVolumeControlInstrumentation i;
    private final String j;
    private final int k;

    public uca(k kVar, dda dda, g gVar, ConnectVolumeControlInstrumentation connectVolumeControlInstrumentation, String str, float f2, int i2) {
        super(2, i2, Math.round(((float) i2) * f2));
        this.k = i2;
        this.f = kVar;
        this.g = dda;
        this.h = gVar;
        this.i = connectVolumeControlInstrumentation;
        this.j = str;
    }

    private Float k(int i2) {
        return Float.valueOf(((float) i2) / ((float) this.k));
    }

    @Override // androidx.media.v
    public void e(int i2) {
        int round = Math.round(this.f.f() * ((float) this.k));
        if (i2 == -1) {
            this.f.c();
            this.g.a();
            int max = Math.max(round - 1, 0);
            this.i.c(ConnectVolumeControlInstrumentation.SystemVolumeUpdated.b, k(max).floatValue(), Float.valueOf(this.f.f()));
            h(max);
        } else if (i2 == 1) {
            this.f.e();
            this.g.a();
            int min = Math.min(round + 1, this.k);
            this.i.c(ConnectVolumeControlInstrumentation.SystemVolumeUpdated.a, k(min).floatValue(), Float.valueOf(this.f.f()));
            h(min);
        }
    }

    @Override // androidx.media.v
    public void f(int i2) {
        float floatValue = Float.valueOf(((float) i2) / ((float) this.k)).floatValue();
        this.f.b(floatValue, new mca(this, floatValue, i2));
        this.g.a();
    }

    public /* synthetic */ f i(float f2, int i2) {
        ((nu0) this.h.a()).c((double) f2, this.j);
        this.i.c(ConnectVolumeControlInstrumentation.SystemVolumeUpdated.c, f2, Float.valueOf(this.f.f()));
        h(i2);
        return f.a;
    }

    public void j(float f2) {
        h(Math.round(((float) this.k) * f2));
    }
}
