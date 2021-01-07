package com.spotify.music.superbird.setup;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import androidx.lifecycle.u;
import com.spotify.music.superbird.setup.g;
import com.spotify.music.superbird.setup.model.CarThingDevice;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class SuperbirdSetupFragmentViewModel extends e0 {
    private final io.reactivex.disposables.a c = new io.reactivex.disposables.a();
    private final u<g> d = new u<>(g.b.a);
    private final SimpleDateFormat e = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());
    private final jld f;
    private final ekd g;

    public static final class a implements g0.b {
        private final jld a;
        private final ekd b;

        public a(jld jld, ekd ekd) {
            h.e(jld, "carThingDevicesEndpoint");
            h.e(ekd, "superbirdSharedPreferences");
            this.a = jld;
            this.b = ekd;
        }

        @Override // androidx.lifecycle.g0.b
        public <T extends e0> T a(Class<T> cls) {
            h.e(cls, "modelClass");
            return new SuperbirdSetupFragmentViewModel(this.a, this.b);
        }
    }

    static final class b<T> implements io.reactivex.functions.g<Throwable> {
        final /* synthetic */ SuperbirdSetupFragmentViewModel a;

        b(SuperbirdSetupFragmentViewModel superbirdSetupFragmentViewModel) {
            this.a = superbirdSetupFragmentViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            SuperbirdSetupFragmentViewModel.i(this.a);
        }
    }

    public SuperbirdSetupFragmentViewModel(jld jld, ekd ekd) {
        h.e(jld, "carThingDevicesEndpoint");
        h.e(ekd, "superbirdSharedPreferences");
        this.f = jld;
        this.g = ekd;
    }

    public static final void h(SuperbirdSetupFragmentViewModel superbirdSetupFragmentViewModel, List list) {
        Object obj;
        Object obj2;
        g gVar;
        String h = superbirdSetupFragmentViewModel.g.h();
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (h.a(((CarThingDevice) obj2).getSerial(), h)) {
                break;
            }
        }
        CarThingDevice carThingDevice = (CarThingDevice) obj2;
        if (carThingDevice == null) {
            Iterator it2 = d.J(list, new h(superbirdSetupFragmentViewModel)).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (superbirdSetupFragmentViewModel.g.b(((CarThingDevice) next).getSerial())) {
                    obj = next;
                    break;
                }
            }
            carThingDevice = (CarThingDevice) obj;
        }
        u<g> uVar = superbirdSetupFragmentViewModel.d;
        if (carThingDevice != null) {
            gVar = new g.c(carThingDevice.getVersionSoftware(), carThingDevice.getVersionOs());
        } else {
            gVar = g.d.a;
        }
        uVar.l(gVar);
    }

    public static final void i(SuperbirdSetupFragmentViewModel superbirdSetupFragmentViewModel) {
        superbirdSetupFragmentViewModel.d.l(g.a.a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.e0
    public void e() {
        this.c.dispose();
    }

    public final LiveData<g> j() {
        this.c.f();
        if (this.g.f()) {
            this.c.b(this.f.a().subscribe(new i(new SuperbirdSetupFragmentViewModel$getDeviceState$1(this)), new b(this)));
        } else {
            this.d.l(g.d.a);
        }
        return this.d;
    }
}
