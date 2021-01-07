package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.b;
import com.spotify.mobile.android.util.SensorRecorder;
import com.spotify.music.libs.bluetooth.i;
import com.spotify.music.libs.bluetooth.j;
import com.spotify.music.libs.bluetooth.l;
import com.spotify.rxjava2.q;
import io.reactivex.g;
import io.reactivex.internal.operators.flowable.FlowableReplay;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: hn1  reason: default package */
public class hn1 implements b {
    private final j a;
    private final y b;
    private final hv3 c;
    private final SensorRecorder f;
    private final s<na1> n;
    private final q o = new q();
    private final l p;
    private io.reactivex.disposables.b q;
    private bx1 r;

    public hn1(j jVar, l lVar, y yVar, hv3 hv3, SensorRecorder sensorRecorder, s<na1> sVar) {
        this.a = jVar;
        this.p = lVar;
        this.b = yVar;
        this.c = hv3;
        this.f = sensorRecorder;
        this.n = sVar;
    }

    public static void b(hn1 hn1, yda yda) {
        j jVar = hn1.a;
        jVar.getClass();
        g r0 = FlowableReplay.t0(jVar.a(yda.f()).O(j.g).Q(hn1.b)).r0();
        hn1.q = r0.subscribe(new cm1(hn1), am1.a);
        bx1 bx1 = new bx1(new v(r0), yda, hn1.c);
        hn1.r = bx1;
        bx1.a();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void a() {
        this.o.b(this.n.I0(this.b).Q(xl1.a).j0(rm1.a).j0(bm1.a).subscribe(new yl1(this)), this.n.I0(this.b).Q(lm1.a).subscribe(new zl1(this)));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void c() {
        this.o.c();
        this.a.e();
        io.reactivex.disposables.b bVar = this.q;
        if (bVar != null && !bVar.d()) {
            this.q.dispose();
        }
    }

    public void d(na1 na1) {
        this.f.g();
        bx1 bx1 = this.r;
        if (bx1 != null) {
            bx1.b();
        }
        this.p.b();
        io.reactivex.disposables.b bVar = this.q;
        if (bVar != null && !bVar.d()) {
            this.q.dispose();
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public void e(String str) {
        char c2;
        SensorRecorder sensorRecorder = this.f;
        switch (str.hashCode()) {
            case -2010949979:
                if (str.equals("headphones")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -2008522753:
                if (str.equals("speaker")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -284840886:
                if (str.equals("unknown")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 98260:
                if (str.equals("car")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        sensorRecorder.f(c2 != 0 ? c2 != 1 ? c2 != 2 ? "bt_connected_unknown" : "bt_connected_speaker" : "bt_connected_headphones" : "bt_connected_car", SensorRecorder.RecordingPurpose.TRAINING, 180000);
        l lVar = this.p;
        i.a a2 = i.a();
        a2.a(str);
        a2.b(true);
        lVar.a(a2.build());
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public String name() {
        return "BluetoothA2dpCarConnectionsPlugin";
    }
}
