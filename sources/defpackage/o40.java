package defpackage;

import java.nio.ByteBuffer;

@l40(tags = {19})
/* renamed from: o40  reason: default package */
public class o40 extends g40 {
    byte[] d;

    public o40() {
        this.a = 19;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.g40
    public int a() {
        throw new RuntimeException("Not Implemented");
    }

    @Override // defpackage.g40
    public void e(ByteBuffer byteBuffer) {
        if (b() > 0) {
            byte[] bArr = new byte[b()];
            this.d = bArr;
            byteBuffer.get(bArr);
        }
    }

    @Override // defpackage.g40
    public String toString() {
        StringBuilder Z0 = je.Z0("ExtensionDescriptor", "{bytes=");
        byte[] bArr = this.d;
        return je.H0(Z0, bArr == null ? "null" : me.a(bArr), '}');
    }
}
