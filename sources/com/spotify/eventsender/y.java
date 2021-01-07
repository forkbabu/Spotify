package com.spotify.eventsender;

import java.util.Arrays;

/* access modifiers changed from: package-private */
public final class y extends q0 {
    private final String a;
    private final byte[] b;
    private final boolean c;

    y(String str, byte[] bArr, boolean z) {
        if (str != null) {
            this.a = str;
            if (bArr != null) {
                this.b = bArr;
                this.c = z;
                return;
            }
            throw new NullPointerException("Null payload");
        }
        throw new NullPointerException("Null eventName");
    }

    @Override // com.spotify.eventsender.q0
    public boolean a() {
        return this.c;
    }

    @Override // com.spotify.eventsender.q0
    public String b() {
        return this.a;
    }

    @Override // com.spotify.eventsender.q0
    public byte[] c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (this.a.equals(q0Var.b())) {
            byte[] bArr2 = this.b;
            if (q0Var instanceof y) {
                bArr = ((y) q0Var).b;
            } else {
                bArr = q0Var.c();
            }
            if (Arrays.equals(bArr2, bArr) && this.c == q0Var.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("PendingEvent{eventName=");
        V0.append(this.a);
        V0.append(", payload=");
        V0.append(Arrays.toString(this.b));
        V0.append(", authenticated=");
        return je.P0(V0, this.c, "}");
    }
}
