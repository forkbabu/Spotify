package com.spotify.music.features.connectui.picker.frictionlessjoin;

import com.spotify.music.features.connectui.picker.frictionlessjoin.FrictionlessJoinManager;
import com.spotify.music.features.connectui.picker.frictionlessjoin.model.AvailableSession;
import com.spotify.music.features.connectui.picker.frictionlessjoin.model.AvailableSessionDevice;
import com.spotify.music.features.connectui.picker.frictionlessjoin.model.DeviceExposureStatus;
import com.spotify.music.features.connectui.picker.frictionlessjoin.model.DevicesExposure;
import com.spotify.music.sociallistening.models.JoinType;
import com.spotify.music.sociallistening.models.Session;
import io.reactivex.d0;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

public final class WebgateFrictionlessJoinManager implements FrictionlessJoinManager, f4d {
    private final io.reactivex.subjects.a<com.spotify.music.sociallistening.models.b> a;
    private final sq4 b;
    private final f4d c;

    static final class a<T, R> implements l<DevicesExposure, com.spotify.music.features.connectui.picker.frictionlessjoin.model.c> {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public com.spotify.music.features.connectui.picker.frictionlessjoin.model.c apply(DevicesExposure devicesExposure) {
            DevicesExposure devicesExposure2 = devicesExposure;
            h.e(devicesExposure2, "it");
            Map<String, DeviceExposureStatus> devicesExposure3 = devicesExposure2.getDevicesExposure();
            DeviceExposureStatus deviceExposureStatus = devicesExposure3 != null ? devicesExposure3.get(this.a) : null;
            String str = this.a;
            if (deviceExposureStatus == null) {
                deviceExposureStatus = DeviceExposureStatus.NOT_EXPOSABLE;
            }
            return new com.spotify.music.features.connectui.picker.frictionlessjoin.model.c(str, deviceExposureStatus);
        }
    }

    static final class b<T, R> implements l<com.spotify.music.features.connectui.picker.frictionlessjoin.model.b, d0<? extends List<? extends AvailableSession>>> {
        public static final b a = new b();

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends List<? extends AvailableSession>> apply(com.spotify.music.features.connectui.picker.frictionlessjoin.model.b bVar) {
            com.spotify.music.features.connectui.picker.frictionlessjoin.model.b bVar2 = bVar;
            h.e(bVar2, "it");
            if (bVar2.a() != null) {
                return z.z(bVar2.a());
            }
            return z.z(EmptyList.a);
        }
    }

    static final class c<T, R> implements l<String, v<? extends Session>> {
        final /* synthetic */ WebgateFrictionlessJoinManager a;

        c(WebgateFrictionlessJoinManager webgateFrictionlessJoinManager) {
            this.a = webgateFrictionlessJoinManager;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends Session> apply(String str) {
            String str2 = str;
            h.e(str2, "it");
            return this.a.b.a(str2).P();
        }
    }

    static final class d<T, R> implements l<DevicesExposure, com.spotify.music.features.connectui.picker.frictionlessjoin.model.c> {
        final /* synthetic */ String a;

        d(String str) {
            this.a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public com.spotify.music.features.connectui.picker.frictionlessjoin.model.c apply(DevicesExposure devicesExposure) {
            DevicesExposure devicesExposure2 = devicesExposure;
            h.e(devicesExposure2, "it");
            Map<String, DeviceExposureStatus> devicesExposure3 = devicesExposure2.getDevicesExposure();
            DeviceExposureStatus deviceExposureStatus = devicesExposure3 != null ? devicesExposure3.get(this.a) : null;
            String str = this.a;
            if (deviceExposureStatus == null) {
                deviceExposureStatus = DeviceExposureStatus.NOT_EXPOSED;
            }
            return new com.spotify.music.features.connectui.picker.frictionlessjoin.model.c(str, deviceExposureStatus);
        }
    }

    static final class e<T, R> implements l<DevicesExposure, com.spotify.music.features.connectui.picker.frictionlessjoin.model.c> {
        final /* synthetic */ String a;

        e(String str) {
            this.a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public com.spotify.music.features.connectui.picker.frictionlessjoin.model.c apply(DevicesExposure devicesExposure) {
            DevicesExposure devicesExposure2 = devicesExposure;
            h.e(devicesExposure2, "it");
            Map<String, DeviceExposureStatus> devicesExposure3 = devicesExposure2.getDevicesExposure();
            DeviceExposureStatus deviceExposureStatus = devicesExposure3 != null ? devicesExposure3.get(this.a) : null;
            String str = this.a;
            if (deviceExposureStatus == null) {
                deviceExposureStatus = DeviceExposureStatus.EXPOSED;
            }
            return new com.spotify.music.features.connectui.picker.frictionlessjoin.model.c(str, deviceExposureStatus);
        }
    }

    public WebgateFrictionlessJoinManager(sq4 sq4, f4d f4d) {
        h.e(sq4, "frictionlessJoinEndpoint");
        h.e(f4d, "socialListening");
        this.b = sq4;
        this.c = f4d;
        io.reactivex.subjects.a<com.spotify.music.sociallistening.models.b> h1 = io.reactivex.subjects.a.h1();
        h.d(h1, "BehaviorSubject.create()");
        this.a = h1;
    }

    @Override // defpackage.f4d
    public s<com.spotify.music.sociallistening.models.b> a() {
        s<com.spotify.music.sociallistening.models.b> N = this.c.a().N(new k(new WebgateFrictionlessJoinManager$state$1(this.a)));
        h.d(N, "socialListening.state().doOnNext(subj::onNext)");
        return N;
    }

    @Override // com.spotify.music.features.connectui.picker.frictionlessjoin.FrictionlessJoinManager
    public s<List<Session>> b(List<String> list) {
        h.e(list, "joinTokens");
        s<List<Session>> P = s.d0(list).W(new c(this), false, Integer.MAX_VALUE).Z0().P();
        h.d(P, "Observable.fromIterable(…          .toObservable()");
        return P;
    }

    @Override // defpackage.f4d
    public void c(String str) {
        h.e(str, "joinToken");
        this.c.c(str);
    }

    @Override // com.spotify.music.features.connectui.picker.frictionlessjoin.FrictionlessJoinManager
    public z<List<AvailableSession>> d(List<String> list, FrictionlessJoinManager.Origin origin) {
        h.e(list, "discoveredDevices");
        h.e(origin, "origin");
        sq4 sq4 = this.b;
        ArrayList arrayList = new ArrayList(kotlin.collections.d.e(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new AvailableSessionDevice(it.next()));
        }
        z<R> s = sq4.b(new com.spotify.music.features.connectui.picker.frictionlessjoin.model.a(arrayList), origin.d()).s(b.a);
        h.d(s, "frictionlessJoinEndpoint…)\n            }\n        }");
        return s;
    }

    @Override // com.spotify.music.features.connectui.picker.frictionlessjoin.FrictionlessJoinManager
    public z<com.spotify.music.features.connectui.picker.frictionlessjoin.model.c> e(String str) {
        h.e(str, "physicalIdentifier");
        z<R> A = this.b.e().A(new a(str));
        h.d(A, "frictionlessJoinEndpoint…          )\n            }");
        return A;
    }

    @Override // defpackage.f4d
    public void f() {
        this.c.f();
    }

    @Override // com.spotify.music.features.connectui.picker.frictionlessjoin.FrictionlessJoinManager
    public com.spotify.music.sociallistening.models.b g() {
        return this.a.j1();
    }

    @Override // com.spotify.music.features.connectui.picker.frictionlessjoin.FrictionlessJoinManager
    public z<com.spotify.music.features.connectui.picker.frictionlessjoin.model.c> h(String str) {
        h.e(str, "physicalIdentifier");
        z<R> A = this.b.d(str).A(new e(str));
        h.d(A, "frictionlessJoinEndpoint…          )\n            }");
        return A;
    }

    @Override // defpackage.f4d
    public void i() {
        this.c.i();
    }

    @Override // defpackage.f4d
    public void j(boolean z) {
        this.c.j(z);
    }

    @Override // defpackage.f4d
    public com.spotify.music.sociallistening.models.b k() {
        return this.c.k();
    }

    @Override // defpackage.f4d
    public void l(String str, boolean z, JoinType joinType) {
        h.e(str, "token");
        h.e(joinType, "joinType");
        this.c.l(str, z, joinType);
    }

    @Override // defpackage.f4d
    public s<com.spotify.music.sociallistening.models.a> m() {
        return this.c.m();
    }

    @Override // com.spotify.music.features.connectui.picker.frictionlessjoin.FrictionlessJoinManager
    public z<com.spotify.music.features.connectui.picker.frictionlessjoin.model.c> n(String str) {
        h.e(str, "physicalIdentifier");
        z<R> A = this.b.c(str).A(new d(str));
        h.d(A, "frictionlessJoinEndpoint…          )\n            }");
        return A;
    }
}
