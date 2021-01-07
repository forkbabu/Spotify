package defpackage;

import android.app.Application;
import com.spotify.base.java.logging.Logger;
import com.spotify.encore.foundation.R;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.waze.model.WazeTransportDrivingDirection;
import com.spotify.rxjava2.p;
import com.waze.sdk.WazeSdkConstants$WazeInstructions;
import com.waze.sdk.c;
import com.waze.sdk.d;
import com.waze.sdk.h;
import defpackage.o92;
import io.reactivex.functions.g;
import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* renamed from: m92  reason: default package */
public final class m92 implements o92 {
    private a a;
    private final p b = new p();
    private final Application c;
    private final com.spotify.mobile.android.waze.sdkprotocol.a d;
    private final i92 e;
    private final y f;

    /* renamed from: m92$a */
    public static final class a implements h, c.b {
        private final io.reactivex.subjects.a<Boolean> a;
        private final o92.a b;

        public a(o92.a aVar) {
            kotlin.jvm.internal.h.e(aVar, "callback");
            this.b = aVar;
            io.reactivex.subjects.a<Boolean> h1 = io.reactivex.subjects.a.h1();
            kotlin.jvm.internal.h.d(h1, "BehaviorSubject.create()");
            this.a = h1;
        }

        @Override // com.waze.sdk.h
        public void a(int i) {
            this.a.onNext(Boolean.FALSE);
            this.b.h(false);
        }

        @Override // com.waze.sdk.g.c
        public void b(String str) {
        }

        @Override // com.waze.sdk.g.c
        public void c(int i) {
            this.b.d(i);
        }

        @Override // com.waze.sdk.h
        public void d() {
            this.a.onNext(Boolean.TRUE);
            this.b.h(true);
        }

        @Override // com.waze.sdk.g.c
        public void e(WazeSdkConstants$WazeInstructions wazeSdkConstants$WazeInstructions) {
            WazeTransportDrivingDirection wazeTransportDrivingDirection;
            if (wazeSdkConstants$WazeInstructions != null) {
                o92.a aVar = this.b;
                int i = r92.e;
                switch (wazeSdkConstants$WazeInstructions.ordinal()) {
                    case 0:
                        wazeTransportDrivingDirection = WazeTransportDrivingDirection.NONE;
                        break;
                    case 1:
                        wazeTransportDrivingDirection = WazeTransportDrivingDirection.TURN_LEFT;
                        break;
                    case 2:
                        wazeTransportDrivingDirection = WazeTransportDrivingDirection.TURN_RIGHT;
                        break;
                    case 3:
                        wazeTransportDrivingDirection = WazeTransportDrivingDirection.KEEP_LEFT;
                        break;
                    case 4:
                        wazeTransportDrivingDirection = WazeTransportDrivingDirection.KEEP_RIGHT;
                        break;
                    case 5:
                        wazeTransportDrivingDirection = WazeTransportDrivingDirection.CONTINUE_STRAIGHT;
                        break;
                    case 6:
                        wazeTransportDrivingDirection = WazeTransportDrivingDirection.ROUNDABOUT_ENTER;
                        break;
                    case 7:
                        wazeTransportDrivingDirection = WazeTransportDrivingDirection.ROUNDABOUT_EXIT;
                        break;
                    case 8:
                        wazeTransportDrivingDirection = WazeTransportDrivingDirection.ROUNDABOUT_LEFT;
                        break;
                    case 9:
                        wazeTransportDrivingDirection = WazeTransportDrivingDirection.ROUNDABOUT_EXIT_LEFT;
                        break;
                    case 10:
                        wazeTransportDrivingDirection = WazeTransportDrivingDirection.ROUNDABOUT_STRAIGHT;
                        break;
                    case 11:
                        wazeTransportDrivingDirection = WazeTransportDrivingDirection.ROUNDABOUT_EXIT_STRAIGHT;
                        break;
                    case 12:
                        wazeTransportDrivingDirection = WazeTransportDrivingDirection.ROUNDABOUT_RIGHT;
                        break;
                    case 13:
                        wazeTransportDrivingDirection = WazeTransportDrivingDirection.ROUNDABOUT_EXIT_RIGHT;
                        break;
                    case 14:
                        wazeTransportDrivingDirection = WazeTransportDrivingDirection.ROUNDABOUT_U;
                        break;
                    case 15:
                        wazeTransportDrivingDirection = WazeTransportDrivingDirection.ROUNDABOUT_EXIT_U;
                        break;
                    case 16:
                        wazeTransportDrivingDirection = WazeTransportDrivingDirection.APPROACHING_DESTINATION;
                        break;
                    case 17:
                        wazeTransportDrivingDirection = WazeTransportDrivingDirection.EXIT_LEFT;
                        break;
                    case 18:
                        wazeTransportDrivingDirection = WazeTransportDrivingDirection.EXIT_RIGHT;
                        break;
                    case 19:
                        wazeTransportDrivingDirection = WazeTransportDrivingDirection.WAYPOINT_DELAY;
                        break;
                    case 20:
                        wazeTransportDrivingDirection = WazeTransportDrivingDirection.U_TURN;
                        break;
                    default:
                        wazeTransportDrivingDirection = WazeTransportDrivingDirection.NONE;
                        break;
                }
                aVar.a(wazeTransportDrivingDirection);
            }
        }

        @Override // com.waze.sdk.g.c
        public void f(boolean z) {
            this.b.b(z);
        }

        @Override // com.waze.sdk.g.c
        public void g(boolean z) {
            this.b.c(z);
        }

        @Override // com.waze.sdk.g.c
        public void h(String str, int i) {
            if (i > 0 || str != null) {
                this.b.f(String.valueOf(i), str);
            } else {
                Logger.l("Filtering distance update", new Object[0]);
            }
        }

        public final io.reactivex.subjects.a<Boolean> i() {
            return this.a;
        }
    }

    /* renamed from: m92$b */
    static final class b<T> implements g<Boolean> {
        final /* synthetic */ m92 a;

        b(m92 m92) {
            this.a = m92;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Boolean bool) {
            Boolean bool2 = bool;
            kotlin.jvm.internal.h.d(bool2, "it");
            if (bool2.booleanValue()) {
                this.a.d.a();
            }
        }
    }

    /* renamed from: m92$c */
    static final class c<T> implements g<Throwable> {
        public static final c a = new c();

        c() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
        }
    }

    public m92(Application application, com.spotify.mobile.android.waze.sdkprotocol.a aVar, i92 i92, y yVar) {
        kotlin.jvm.internal.h.e(application, "context");
        kotlin.jvm.internal.h.e(aVar, "wazeAudioSdkProtocol");
        kotlin.jvm.internal.h.e(i92, "wazePendingIntentProvider");
        kotlin.jvm.internal.h.e(yVar, "computationScheduler");
        this.c = application;
        this.d = aVar;
        this.e = i92;
        this.f = yVar;
    }

    @Override // defpackage.o92
    public void a() {
        if (b()) {
            this.d.a();
            return;
        }
        a aVar = this.a;
        if (aVar != null) {
            this.b.b(aVar.i().U0(5, TimeUnit.SECONDS, this.f, s.i0(Boolean.FALSE)).T().subscribe(new b(this), c.a));
        }
    }

    @Override // defpackage.o92
    public boolean b() {
        return this.d.h();
    }

    @Override // defpackage.o92
    public void c(o92.a aVar) {
        kotlin.jvm.internal.h.e(aVar, "messageCallback");
        if (b()) {
            Assertion.g("WazeSdkWrapper has already been started!");
            return;
        }
        d.b bVar = new d.b();
        bVar.b(this.e.a(this.c));
        d.b bVar2 = bVar;
        bVar2.c(androidx.core.content.a.b(this.c, R.color.green_light));
        d a2 = bVar2.a();
        a aVar2 = new a(aVar);
        com.spotify.mobile.android.waze.sdkprotocol.a aVar3 = this.d;
        Application application = this.c;
        kotlin.jvm.internal.h.d(a2, "settings");
        aVar3.c(application, a2, aVar2);
        aVar3.e(aVar2);
        aVar3.f();
        this.a = aVar2;
    }

    @Override // defpackage.o92
    public void stop() {
        if (!b()) {
            Assertion.g("Trying to stop WazeSdkWrapper which hasn't been started yet!");
            return;
        }
        this.d.d();
        this.a = null;
        this.b.a();
    }
}
