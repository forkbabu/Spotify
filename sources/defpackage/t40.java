package defpackage;

import java.nio.ByteBuffer;
import java.util.logging.Logger;

/* renamed from: t40  reason: default package */
public class t40 extends g40 {
    private ByteBuffer d;

    static {
        Logger.getLogger(t40.class.getName());
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.g40
    public int a() {
        throw new RuntimeException("sdjlhfl");
    }

    @Override // defpackage.g40
    public void e(ByteBuffer byteBuffer) {
        this.d = byteBuffer.slice();
    }

    @Override // defpackage.g40
    public String toString() {
        StringBuilder Z0 = je.Z0("UnknownDescriptor", "{tag=");
        Z0.append(this.a);
        Z0.append(", sizeOfInstance=");
        Z0.append(this.b);
        Z0.append(", data=");
        Z0.append(this.d);
        Z0.append('}');
        return Z0.toString();
    }
}
