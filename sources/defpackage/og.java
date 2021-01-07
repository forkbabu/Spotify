package defpackage;

import com.google.android.datatransport.b;
import java.util.Arrays;

/* renamed from: og  reason: default package */
public final class og {
    private final b a;
    private final byte[] b;

    public og(b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.a = bVar;
            this.b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    public byte[] a() {
        return this.b;
    }

    public b b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og)) {
            return false;
        }
        og ogVar = (og) obj;
        if (!this.a.equals(ogVar.a)) {
            return false;
        }
        return Arrays.equals(this.b, ogVar.b);
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        StringBuilder V0 = je.V0("EncodedPayload{encoding=");
        V0.append(this.a);
        V0.append(", bytes=[...]}");
        return V0.toString();
    }
}
