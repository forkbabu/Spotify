package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import com.spotify.music.homething.addnewdevice.scandevices.view.ScanDevicesFragment;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: es9  reason: default package */
public class es9 extends ScanCallback {
    final /* synthetic */ fs9 a;

    es9(fs9 fs9) {
        this.a = fs9;
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onBatchScanResults(List<ScanResult> list) {
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onScanFailed(int i) {
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onScanResult(int i, ScanResult scanResult) {
        BluetoothDevice device = scanResult.getDevice();
        if (!this.a.a.contains(device)) {
            this.a.a.add(device);
            ((ScanDevicesFragment) this.a.f).K4(device);
        }
    }
}
