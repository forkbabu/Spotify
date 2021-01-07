package com.google.android.gms.internal.recaptcha;

final class o1 implements d1 {
    private final f1 a;
    private final String b;
    private final Object[] c;
    private final int d;

    o1(f1 f1Var, String str, Object[] objArr) {
        this.a = f1Var;
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

    @Override // com.google.android.gms.internal.recaptcha.d1
    public final int a() {
        return (this.d & 1) == 1 ? 1 : 2;
    }

    @Override // com.google.android.gms.internal.recaptcha.d1
    public final boolean b() {
        return (this.d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.recaptcha.d1
    public final f1 c() {
        return this.a;
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
