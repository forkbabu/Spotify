package defpackage;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.os.Parcelable;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: sa1  reason: default package */
public class sa1 {
    private final String a;
    private final String b;
    private final String c;

    public sa1(String str, String str2, BluetoothClass bluetoothClass) {
        this.a = str;
        this.b = str2;
        if (bluetoothClass != null) {
            this.c = String.valueOf(bluetoothClass.getDeviceClass());
        } else {
            this.c = String.valueOf(1024);
        }
    }

    static sa1 a(Parcelable parcelable) {
        String str;
        String str2;
        NullPointerException e;
        BluetoothDevice bluetoothDevice = (BluetoothDevice) parcelable;
        BluetoothClass bluetoothClass = null;
        try {
            str2 = bluetoothDevice.getName();
            try {
                str = bluetoothDevice.getAddress();
                try {
                    bluetoothClass = bluetoothDevice.getBluetoothClass();
                } catch (NullPointerException e2) {
                    e = e2;
                }
            } catch (NullPointerException e3) {
                e = e3;
                str = null;
                Assertion.w("Unexpected nullpointer from BT api", e);
                return new sa1(str2, str, bluetoothClass);
            }
        } catch (NullPointerException e4) {
            e = e4;
            str2 = null;
            str = null;
            Assertion.w("Unexpected nullpointer from BT api", e);
            return new sa1(str2, str, bluetoothClass);
        }
        return new sa1(str2, str, bluetoothClass);
    }

    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa1)) {
            return false;
        }
        sa1 sa1 = (sa1) obj;
        String str = this.a;
        if (str == null ? sa1.a != null : !str.equals(sa1.a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null ? sa1.b != null : !str2.equals(sa1.b)) {
            return false;
        }
        String str3 = this.c;
        String str4 = sa1.c;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }
}
