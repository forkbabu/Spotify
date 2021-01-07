package com.spotify.music.libs.carmodeengine.util;

import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.music.libs.carmodeengine.settings.CarModeUserSettingsLogger;
import io.reactivex.disposables.a;
import kotlin.jvm.internal.h;

public final class CarModeAutoActivationAlteringLogicPlugin implements d, t {
    private final a a = new a();
    private int b;
    private boolean c;
    private boolean f;
    private final j4a n;
    private final c6a o;
    private final CarModeUserSettingsLogger p;
    private final y q;

    public CarModeAutoActivationAlteringLogicPlugin(j4a j4a, c6a c6a, CarModeUserSettingsLogger carModeUserSettingsLogger, y yVar) {
        h.e(j4a, "carDetectionState");
        h.e(c6a, "carModeUserSettingsCache");
        h.e(carModeUserSettingsLogger, "carModeUserSettingsLogger");
        h.e(yVar, "carModeFeatureAvailability");
        this.n = j4a;
        this.o = c6a;
        this.p = carModeUserSettingsLogger;
        this.q = yVar;
    }

    public static final void c(CarModeAutoActivationAlteringLogicPlugin carModeAutoActivationAlteringLogicPlugin, boolean z) {
        if (!z && carModeAutoActivationAlteringLogicPlugin.c) {
            carModeAutoActivationAlteringLogicPlugin.f();
        }
        carModeAutoActivationAlteringLogicPlugin.c = z;
    }

    public static final void e(CarModeAutoActivationAlteringLogicPlugin carModeAutoActivationAlteringLogicPlugin, boolean z) {
        carModeAutoActivationAlteringLogicPlugin.f = z;
    }

    private final void f() {
        if (this.b == 0) {
            this.o.g(0);
            return;
        }
        int a2 = this.o.a() + this.b;
        this.b = 0;
        this.o.g(a2);
        if (Math.abs(a2) >= 3) {
            boolean z = a2 > 0;
            this.o.g(0);
            this.o.h(z);
            this.p.b(z, CarModeUserSettingsLogger.AutoActivationChangedReason.OPT_IN_LOGIC);
        }
    }

    @Override // com.spotify.music.libs.carmodeengine.util.t
    public void a() {
        if (this.c && this.f) {
            this.b++;
        }
    }

    @Override // com.spotify.music.libs.carmodeengine.util.t
    public void b() {
        if (this.c && this.f) {
            this.b--;
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.a.e(this.n.b().subscribe(new u(new CarModeAutoActivationAlteringLogicPlugin$onSessionStarted$1(this))), this.q.c().subscribe(new u(new CarModeAutoActivationAlteringLogicPlugin$onSessionStarted$2(this))));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.a.f();
        if (this.c) {
            f();
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "CarModeAutoActivationAlteringLogicImpl";
    }
}
