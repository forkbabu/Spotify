package io.netty.channel;

public final class x0 {
    public static final x0 c = new x0(32768, 65536, false);
    private final int a;
    private final int b;

    x0(int i, int i2, boolean z) {
        if (z) {
            if (i < 0) {
                throw new IllegalArgumentException("write buffer's low water mark must be >= 0");
            } else if (i2 < i) {
                throw new IllegalArgumentException(je.s0("write buffer's high water mark cannot be less than  low water mark (", i, "): ", i2));
            }
        }
        this.a = i;
        this.b = i2;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public String toString() {
        StringBuilder T0 = je.T0(55, "WriteBufferWaterMark(low: ");
        T0.append(this.a);
        T0.append(", high: ");
        return je.B0(T0, this.b, ")");
    }
}
