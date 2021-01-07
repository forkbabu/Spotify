package com.google.android.gms.internal.cast;

final class n7 implements x6 {
    private final z6 a;
    private final String b;
    private final Object[] c;
    private final int d;

    n7(z6 z6Var, String str, Object[] objArr) {
        this.a = z6Var;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.d = i | (charAt2 << i2);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.x6
    public final boolean a() {
        return (this.d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.cast.x6
    public final z6 b() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.cast.x6
    public final int c() {
        return (this.d & 1) == 1 ? 1 : 2;
    }

    /* access modifiers changed from: package-private */
    public final String d() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public final Object[] e() {
        return this.c;
    }
}
