package defpackage;

import java.util.UUID;
import kotlin.jvm.internal.h;

/* renamed from: gea  reason: default package */
public final class gea {
    private final String a;
    private final int b;
    private final String c;
    private final String d;

    public gea(String str, int i, String str2, String str3) {
        h.e(str, "name");
        h.e(str3, "id");
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
    }

    public static gea a(gea gea, String str, int i, String str2, String str3, int i2) {
        if ((i2 & 1) != 0) {
            str = gea.a;
        }
        if ((i2 & 2) != 0) {
            i = gea.b;
        }
        String str4 = null;
        String str5 = (i2 & 4) != 0 ? gea.c : null;
        if ((i2 & 8) != 0) {
            str4 = gea.d;
        }
        h.e(str, "name");
        h.e(str4, "id");
        return new gea(str, i, str5, str4);
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.a;
    }

    public final int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gea)) {
            return false;
        }
        gea gea = (gea) obj;
        return h.a(this.a, gea.a) && this.b == gea.b && h.a(this.c, gea.c) && h.a(this.d, gea.d);
    }

    public final String f() {
        switch (this.b) {
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case 5:
                return "TYPE_LINE_ANALOG";
            case 6:
                return "TYPE_LINE_DIGITAL";
            case 7:
                return "TYPE_BLUETOOTH_SCO";
            case 8:
                return "TYPE_BLUETOOTH_A2DP";
            case 9:
                return "TYPE_HDMI";
            case 10:
                return "TYPE_HDMI_ARC";
            case 11:
                return "TYPE_USB_DEVICE";
            case 12:
                return "TYPE_USB_ACCESSORY";
            case 13:
                return "TYPE_DOCK";
            case 14:
                return "TYPE_FM";
            case 15:
            case 16:
            case 17:
            case 24:
            default:
                return "TYPE_UNKNOWN";
            case 18:
                return "TYPE_TELEPHONY";
            case 19:
                return "TYPE_AUX_LINE";
            case 20:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            case 23:
                return "TYPE_HEARING_AID";
            case 25:
                return "TYPE_REMOTE_SUBMIX";
        }
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.b) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AudioRouteInfo(name=");
        V0.append(this.a);
        V0.append(", type=");
        V0.append(this.b);
        V0.append(", address=");
        V0.append(this.c);
        V0.append(", id=");
        return je.I0(V0, this.d, ")");
    }

    public gea(String str, int i, String str2, String str3, int i2) {
        String str4 = null;
        str2 = (i2 & 4) != 0 ? null : str2;
        if ((i2 & 8) != 0) {
            str4 = UUID.randomUUID().toString();
            h.d(str4, "UUID.randomUUID().toString()");
        }
        h.e(str, "name");
        h.e(str4, "id");
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str4;
    }
}
