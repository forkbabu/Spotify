package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.os.ParcelUuid;
import com.spotify.base.java.logging.Logger;
import io.reactivex.l;
import io.reactivex.m;
import io.reactivex.o;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/* renamed from: ae5  reason: default package */
public class ae5 {
    static final UUID b = UUID.fromString("9B26D8C0-A8ED-440B-95B0-C4714A518BCC");
    static final UUID c = UUID.fromString("CC8B514A-71C4-B095-0B44-EDA8C0D8269B");
    private final BluetoothDevice a;

    /* renamed from: ae5$a */
    static class a implements o<InputStream> {
        private final BluetoothDevice a;

        public a(BluetoothDevice bluetoothDevice) {
            this.a = bluetoothDevice;
        }

        @Override // io.reactivex.o
        public void subscribe(m<InputStream> mVar) {
            Logger.g("Go: Creating socket", new Object[0]);
            BluetoothSocket createInsecureRfcommSocketToServiceRecord = this.a.createInsecureRfcommSocketToServiceRecord(ae5.b);
            if (createInsecureRfcommSocketToServiceRecord == null) {
                Logger.d("Failed to create a socket.", new Object[0]);
                if (!mVar.d()) {
                    mVar.onComplete();
                    return;
                }
                return;
            }
            mVar.e(new yd5(createInsecureRfcommSocketToServiceRecord));
            try {
                createInsecureRfcommSocketToServiceRecord.connect();
                InputStream inputStream = createInsecureRfcommSocketToServiceRecord.getInputStream();
                if (!mVar.d()) {
                    mVar.onSuccess(inputStream);
                }
            } catch (IOException e) {
                Logger.e(e, "Go: Failed to connect to socket", new Object[0]);
                if (!mVar.d()) {
                    mVar.onComplete();
                }
            }
        }
    }

    public ae5(BluetoothDevice bluetoothDevice) {
        this.a = bluetoothDevice;
    }

    public String a() {
        return this.a.getAddress();
    }

    public String b() {
        return this.a.getName();
    }

    public boolean c() {
        ParcelUuid[] uuids = this.a.getUuids();
        if (uuids == null) {
            return false;
        }
        for (ParcelUuid parcelUuid : uuids) {
            UUID uuid = parcelUuid.getUuid();
            if (b.equals(uuid) || c.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public l<InputStream> d() {
        return l.d(new a(this.a));
    }
}
