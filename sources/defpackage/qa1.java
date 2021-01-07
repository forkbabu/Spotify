package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import io.reactivex.s;
import io.reactivex.t;
import io.reactivex.x;
import io.reactivex.y;

/* renamed from: qa1  reason: default package */
public class qa1 {
    private final Context a;
    private sa1 b;
    private final s<na1> c;
    private boolean d;

    public qa1(Context context, y yVar) {
        this.a = context;
        this.c = s.y(new ka1(this)).E0(new la1(this)).E().I0(yVar).v0(1).h1();
    }

    static String a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "UNKNOWN STATE" : "STATE_DISCONNECTING" : "STATE_CONNECTED" : "STATE_CONNECTING" : "STATE_DISCONNECTED";
    }

    static String d(int i) {
        switch (i) {
            case 10:
                return "STATE_OFF";
            case 11:
                return "STATE_TURNING_ON";
            case 12:
                return "STATE_ON";
            case 13:
                return "STATE_TURNING_OFF";
            default:
                return "UNKNOWN STATE";
        }
    }

    public static void h(qa1 qa1, x xVar) {
        BluetoothAdapter bluetoothAdapter;
        qa1.getClass();
        if (Build.VERSION.SDK_INT < 18) {
            bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        } else {
            BluetoothManager bluetoothManager = (BluetoothManager) qa1.a.getSystemService("bluetooth");
            if (bluetoothManager == null) {
                bluetoothAdapter = null;
            } else {
                bluetoothAdapter = bluetoothManager.getAdapter();
            }
        }
        if (bluetoothAdapter == null) {
            xVar.onNext(na1.f());
            xVar.onComplete();
        } else if (bluetoothAdapter.getProfileConnectionState(2) == 2) {
            qa1.d = false;
            bluetoothAdapter.getProfileProxy(qa1.a, new pa1(qa1, xVar, bluetoothAdapter), 2);
        } else {
            xVar.onNext(na1.f());
            xVar.onComplete();
        }
    }

    public s<na1> g() {
        return this.c;
    }

    public void i(t tVar) {
        z42.a("Must subscribe to createBluetoothA2dpObservable on main thread!");
        oa1 oa1 = new oa1(this, tVar);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        this.a.registerReceiver(oa1, intentFilter);
        tVar.e(new ma1(this, oa1));
    }

    public /* synthetic */ void j(BroadcastReceiver broadcastReceiver) {
        this.a.unregisterReceiver(broadcastReceiver);
        this.b = null;
    }
}
