package defpackage;

import android.content.res.Resources;
import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.spotify.android.flags.c;
import com.spotify.music.C0707R;
import com.spotify.music.libs.carmodeengine.settings.CarModeUserSettingsLogger;
import com.spotify.music.libs.carmodeengine.util.y;
import defpackage.y6a;

/* renamed from: wj8  reason: default package */
public class wj8 {
    private final Resources a;
    private final y b;
    private final wlf<yj8> c;
    private final c6a d;
    private final CarModeUserSettingsLogger e;
    private final String[] f;
    private final ImmutableList<y6a> g;
    private y6a h;

    public wj8(Resources resources, y yVar, wlf<yj8> wlf, c6a c6a, CarModeUserSettingsLogger carModeUserSettingsLogger, fm9 fm9, c cVar) {
        this.a = resources;
        this.b = yVar;
        this.c = wlf;
        this.d = c6a;
        this.e = carModeUserSettingsLogger;
        if (fm9.a(cVar)) {
            this.g = ImmutableList.of(y6a.b(), y6a.d());
        } else {
            this.g = ImmutableList.of(y6a.b(), y6a.d(), y6a.a());
        }
        this.h = c7a.a.c();
        this.f = (String[]) Collections2.toArray(Collections2.transform((Iterable) this.g, (Function) new oj8(this)), String.class);
    }

    public static String e(wj8 wj8, y6a y6a) {
        return wj8.a.getString(((Integer) y6a.c(kj8.a, rj8.a, tj8.a)).intValue());
    }

    public String a() {
        int i;
        if (this.b.c().d().booleanValue()) {
            i = ((Integer) this.h.c(qj8.a, sj8.a, nj8.a)).intValue();
        } else {
            i = ((Integer) this.h.c(lj8.a, pj8.a, mj8.a)).intValue();
        }
        return this.a.getString(i);
    }

    public String b() {
        return this.a.getString(C0707R.string.settings_car_mode_availability_title);
    }

    public String[] c() {
        return this.f;
    }

    public int d() {
        return this.g.indexOf(this.h);
    }

    public void f(int i) {
        y6a y6a = this.g.get(i);
        this.d.d(y6a);
        this.e.c(y6a);
        y6a.getClass();
        if ((y6a instanceof y6a.a) && !this.b.c().d().booleanValue()) {
            this.c.get().d();
        }
    }

    public void g(boolean z) {
        this.d.h(z);
        this.e.b(z, CarModeUserSettingsLogger.AutoActivationChangedReason.SETTINGS_INTERACTION);
    }

    public void h(y6a y6a) {
        if (!this.g.contains(y6a)) {
            this.h = c7a.a.c();
        } else {
            this.h = y6a;
        }
    }

    public void i(boolean z) {
        this.d.c(z);
        this.e.a(z);
    }
}
