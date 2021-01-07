package defpackage;

import com.spotify.libs.connect.model.DeviceState;

/* renamed from: ps0  reason: default package */
public class ps0 {
    final String a;
    final boolean b;
    final boolean c;
    final boolean d;
    final String e;
    final String f;

    ps0(DeviceState deviceState, boolean z, boolean z2, String str, String str2, boolean z3) {
        this.a = deviceState.toString();
        this.b = z;
        this.c = z2;
        this.e = str;
        this.f = str2;
        this.d = z3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps0)) {
            return false;
        }
        ps0 ps0 = (ps0) obj;
        if (this.b == ps0.b && this.c == ps0.c && this.a.equals(ps0.a) && this.e.equals(ps0.e) && this.d == ps0.d) {
            return this.f.equals(ps0.f);
        }
        return false;
    }

    public int hashCode() {
        return this.f.hashCode() + je.Y0(this.e, ((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31, 31);
    }
}
