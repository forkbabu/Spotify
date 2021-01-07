package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

@l40(tags = {5})
/* renamed from: k40  reason: default package */
public class k40 extends g40 {
    byte[] d;

    public k40() {
        this.a = 5;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.g40
    public int a() {
        return this.d.length;
    }

    @Override // defpackage.g40
    public void e(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.d = bArr;
        byteBuffer.get(bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && k40.class == obj.getClass() && Arrays.equals(this.d, ((k40) obj).d);
    }

    public int hashCode() {
        byte[] bArr = this.d;
        if (bArr != null) {
            return Arrays.hashCode(bArr);
        }
        return 0;
    }

    @Override // defpackage.g40
    public String toString() {
        StringBuilder Z0 = je.Z0("DecoderSpecificInfo", "{bytes=");
        byte[] bArr = this.d;
        return je.H0(Z0, bArr == null ? "null" : me.a(bArr), '}');
    }
}
