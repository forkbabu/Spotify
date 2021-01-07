package com.spotify.music.features.eventshub.locationsearch;

import android.view.View;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.eventshub.locationsearch.model.Location;
import com.spotify.music.features.eventshub.locationsearch.model.LocationsHolder;
import io.reactivex.disposables.b;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.z;
import retrofit2.v;

public class h {
    private final j a;
    private final p05 b;
    private final f c;
    private final com.spotify.music.features.eventshub.eventshub.h d;
    private b e;
    private String f;
    private final l<String, z<v<LocationsHolder>>> g = new a();
    private LocationsHolder h = LocationsHolder.EMPTY;

    class a implements l<String, z<v<LocationsHolder>>> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public z<v<LocationsHolder>> apply(String str) {
            String str2 = str;
            h.this.f = str2;
            return h.this.b.d(str2);
        }
    }

    public h(j jVar, p05 p05, f fVar, com.spotify.music.features.eventshub.eventshub.h hVar) {
        Assertion.e(jVar);
        Assertion.e(p05);
        Assertion.e(fVar);
        this.a = jVar;
        this.b = p05;
        this.c = fVar;
        this.d = hVar;
    }

    private void j() {
        if (MoreObjects.isNullOrEmpty(this.f)) {
            LocationSearchFragment locationSearchFragment = (LocationSearchFragment) this.a;
            if (locationSearchFragment.e3()) {
                locationSearchFragment.r0.e(null);
            }
        } else if (this.h.getLocations().isEmpty()) {
            LocationSearchFragment locationSearchFragment2 = (LocationSearchFragment) this.a;
            if (locationSearchFragment2.e3()) {
                locationSearchFragment2.r0.e(null);
                locationSearchFragment2.r0.f(true);
            }
        } else {
            j jVar = this.a;
            LocationsHolder locationsHolder = this.h;
            LocationSearchFragment locationSearchFragment3 = (LocationSearchFragment) jVar;
            if (locationSearchFragment3.e3()) {
                locationSearchFragment3.r0.e(null);
                locationSearchFragment3.t0.clear();
                locationSearchFragment3.t0.addAll(locationsHolder.getLocations());
            }
        }
    }

    public void c(v vVar) {
        if (!vVar.f() || vVar.a() == null) {
            ((LocationSearchFragment) this.a).Q4();
            return;
        }
        this.h = (LocationsHolder) vVar.a();
        j();
    }

    public /* synthetic */ void d(Throwable th) {
        ((LocationSearchFragment) this.a).Q4();
    }

    public void e(Location location) {
        int indexOf = this.h.getLocations().indexOf(location);
        this.c.b(location);
        this.d.b(Integer.valueOf(indexOf));
        ((LocationSearchFragment) this.a).z0.a();
    }

    public void f() {
        View a3 = ((LocationSearchFragment) this.a).a3();
        if (a3 != null) {
            bd0.g(a3);
        }
    }

    public void g() {
        ((LocationSearchFragment) this.a).R4();
        View a3 = ((LocationSearchFragment) this.a).a3();
        if (a3 != null) {
            bd0.g(a3);
        }
        j();
    }

    public void h() {
        b bVar = this.e;
        if (bVar != null && !bVar.d()) {
            this.e.dispose();
        }
    }

    public void i(g<String> gVar) {
        b bVar = this.e;
        if (bVar != null && !bVar.d()) {
            this.e.dispose();
        }
        this.e = gVar.C(c.a).g0(this.g).Q(io.reactivex.android.schedulers.a.b()).subscribe(new a(this), new b(this));
        j();
    }
}
