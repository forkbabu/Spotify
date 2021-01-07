package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.os.Build;
import android.os.ParcelUuid;
import com.spotify.base.java.logging.Logger;
import defpackage.ds9;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* renamed from: fs9  reason: default package */
public class fs9 implements ds9.a {
    private final Set<BluetoothDevice> a = new HashSet();
    private final ws9 b;
    private final rt9 c;
    private final ScanCallback d;
    private BluetoothLeScanner e;
    private ds9 f;

    fs9(ws9 ws9, rt9 rt9) {
        this.b = ws9;
        this.c = rt9;
        if (Build.VERSION.SDK_INT >= 23) {
            this.d = new es9(this);
        } else {
            this.d = null;
        }
    }

    @Override // defpackage.ds9.a
    public void a() {
        BluetoothLeScanner bluetoothLeScanner;
        if (Build.VERSION.SDK_INT >= 23 && (bluetoothLeScanner = this.e) != null) {
            bluetoothLeScanner.stopScan(this.d);
        }
    }

    @Override // defpackage.ds9.a
    public void b() {
        this.e = BluetoothAdapter.getDefaultAdapter().getBluetoothLeScanner();
        ScanSettings.Builder builder = new ScanSettings.Builder();
        builder.setScanMode(2);
        builder.setCallbackType(1);
        builder.setMatchMode(1);
        builder.setNumOfMatches(1);
        builder.setReportDelay(0);
        this.e.startScan(Collections.singletonList(new ScanFilter.Builder().setServiceUuid(new ParcelUuid(UUID.fromString("000018AA-0000-1000-8000-00805f9b34fb"))).build()), builder.build(), this.d);
        Logger.b("scan started", new Object[0]);
    }

    @Override // defpackage.ds9.a
    public void c(ds9 ds9) {
        this.f = ds9;
    }

    @Override // defpackage.ds9.a
    public void d(BluetoothDevice bluetoothDevice) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.c.g(bluetoothDevice.getAddress());
            this.b.g();
        }
    }
}
