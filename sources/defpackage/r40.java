package defpackage;

import java.nio.ByteBuffer;

@l40(tags = {20})
/* renamed from: r40  reason: default package */
public class r40 extends g40 {
    int d;

    public r40() {
        this.a = 20;
    }

    @Override // defpackage.g40
    public int a() {
        return 1;
    }

    @Override // defpackage.g40
    public void e(ByteBuffer byteBuffer) {
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        this.d = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && r40.class == obj.getClass() && this.d == ((r40) obj).d;
    }

    public int hashCode() {
        return this.d;
    }

    @Override // defpackage.g40
    public String toString() {
        StringBuilder Z0 = je.Z0("ProfileLevelIndicationDescriptor", "{profileLevelIndicationIndex=");
        Z0.append(Integer.toHexString(this.d));
        Z0.append('}');
        return Z0.toString();
    }
}
