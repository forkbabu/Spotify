package defpackage;

import java.nio.ByteBuffer;

@l40(tags = {6})
/* renamed from: s40  reason: default package */
public class s40 extends g40 {
    int d;

    public s40() {
        this.a = 6;
    }

    /* access modifiers changed from: package-private */
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
        return obj != null && s40.class == obj.getClass() && this.d == ((s40) obj).d;
    }

    public int hashCode() {
        return this.d;
    }

    @Override // defpackage.g40
    public String toString() {
        return je.A0(je.Z0("SLConfigDescriptor", "{predefined="), this.d, '}');
    }
}
