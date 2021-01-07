package com.google.android.gms.internal.recaptcha;

final class x extends w {
    private int a;
    private int b;
    private int c = Integer.MAX_VALUE;

    x(byte[] bArr, int i, int i2, boolean z, y yVar) {
        super(null);
        this.a = i2 + i;
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
            throw new zzeo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzeo("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
}
