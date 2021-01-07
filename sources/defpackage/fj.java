package defpackage;

import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: fj  reason: default package */
public class fj extends bj {
    public final cj a = new cj();
    public ByteBuffer b;
    public long c;
    public ByteBuffer f;
    private final int n;

    public fj(int i) {
        this.n = i;
    }

    private ByteBuffer k(int i) {
        int i2 = this.n;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.b;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i + ")");
    }

    @Override // defpackage.bj
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
    }

    @EnsuresNonNull({"data"})
    public void l(int i) {
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer == null) {
            this.b = k(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.b.position();
        int i2 = i + position;
        if (capacity < i2) {
            ByteBuffer k = k(i2);
            if (position > 0) {
                this.b.flip();
                k.put(this.b);
            }
            this.b = k;
        }
    }

    public final void m() {
        this.b.flip();
        ByteBuffer byteBuffer = this.f;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
    }

    public final boolean n() {
        return getFlag(1073741824);
    }

    public final boolean p() {
        return this.b == null && this.n == 0;
    }
}
