package com.google.android.gms.internal.cast;

final class f5 extends e5 {
    private int a;
    private int b;
    private int c = Integer.MAX_VALUE;

    f5(byte[] bArr, int i) {
        super(null);
        this.a = i + 0;
    }

    public final int a(int i) {
        if (i >= 0) {
            int i2 = i + 0;
            int i3 = this.c;
            if (i2 <= i3) {
                this.c = i2;
                int i4 = this.a + this.b;
                this.a = i4;
                int i5 = i4 + 0;
                if (i5 > i2) {
                    int i6 = i5 - i2;
                    this.b = i6;
                    this.a = i4 - i6;
                } else {
                    this.b = 0;
                }
                return i3;
            }
            throw new zzmo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzmo("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
}
