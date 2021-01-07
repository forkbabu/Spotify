package defpackage;

import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.drivingmode.view.connectionlabel.BluetoothConnectionState;
import com.spotify.music.nowplaying.drivingmode.view.connectionlabel.ConnectionLabelView;
import com.spotify.music.nowplaying.drivingmode.view.connectionlabel.b;
import com.spotify.music.nowplaying.drivingmode.view.connectionlabel.e;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.p;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: vub  reason: default package */
public class vub {
    private final e a;
    private final g<PlayerState> b;
    private final y c;
    private final p d = new p();
    private com.spotify.music.nowplaying.drivingmode.view.connectionlabel.g e;

    /* access modifiers changed from: private */
    /* renamed from: vub$a */
    public static class a {
        private final BluetoothConnectionState a;
        private final boolean b;

        private a(BluetoothConnectionState bluetoothConnectionState, boolean z) {
            this.a = bluetoothConnectionState;
            this.b = z;
        }

        static a c(BluetoothConnectionState bluetoothConnectionState, boolean z) {
            return new a(bluetoothConnectionState, z);
        }
    }

    public vub(e eVar, g<PlayerState> gVar, y yVar) {
        this.a = eVar;
        this.b = gVar;
        this.c = yVar;
    }

    public static void a(vub vub, a aVar) {
        vub.getClass();
        BluetoothConnectionState bluetoothConnectionState = aVar.a;
        boolean z = aVar.b;
        int ordinal = bluetoothConnectionState.b().ordinal();
        if (ordinal == 0) {
            bluetoothConnectionState.a().getClass();
            ((ConnectionLabelView) vub.e).k(bluetoothConnectionState.a(), z);
        } else if (ordinal == 1) {
            ConnectionLabelView connectionLabelView = (ConnectionLabelView) vub.e;
            connectionLabelView.k(connectionLabelView.getResources().getString(C0707R.string.driving_label_unknown), false);
        } else if (ordinal == 2) {
            ((ConnectionLabelView) vub.e).l();
        }
    }

    public /* synthetic */ void b(Throwable th) {
        ((ConnectionLabelView) this.e).l();
    }

    public void c(com.spotify.music.nowplaying.drivingmode.view.connectionlabel.g gVar) {
        this.e = gVar;
        p pVar = this.d;
        e eVar = this.a;
        eVar.getClass();
        pVar.b(g.i(g.p(new b(eVar), BackpressureStrategy.BUFFER), this.b.O(mub.a), hub.a).Q(this.c).subscribe(new lub(this), new kub(this)));
        this.a.c();
    }

    public void d() {
        this.d.a();
        this.a.d();
    }
}
