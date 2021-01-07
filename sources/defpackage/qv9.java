package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import com.google.common.base.MoreObjects;
import com.google.protobuf.u;
import com.spotify.core.os.CpuFeatures;
import com.spotify.messages.AndroidDeviceReport;

/* renamed from: qv9  reason: default package */
public class qv9 {
    private final gl0<u> a;
    private final Context b;
    private final DisplayMetrics c;

    public qv9(gl0<u> gl0, DisplayMetrics displayMetrics, Context context) {
        this.a = gl0;
        this.c = displayMetrics;
        context.getClass();
        MoreObjects.checkArgument(context instanceof Application, "Not an application context.");
        this.b = context;
    }

    public void a() {
        gl0<u> gl0 = this.a;
        AndroidDeviceReport.b w = AndroidDeviceReport.w();
        w.u(Build.MODEL);
        w.m(Build.BRAND);
        w.r(Build.MANUFACTURER);
        w.q(Build.DISPLAY);
        w.v((long) pf.d());
        w.s((long) pf.b());
        w.t(pf.e(this.b));
        DisplayMetrics displayMetrics = this.c;
        float f = ((float) displayMetrics.widthPixels) / displayMetrics.xdpi;
        float f2 = ((float) displayMetrics.heightPixels) / displayMetrics.ydpi;
        w.x((float) Math.sqrt((double) ((f2 * f2) + (f * f))));
        w.y((long) this.c.widthPixels);
        w.w((long) this.c.heightPixels);
        w.p((long) qf.c(this.b));
        w.o(CpuFeatures.getCpuFeatures());
        w.n((long) CpuFeatures.getCpuFamily());
        gl0.c(w.build());
    }
}
