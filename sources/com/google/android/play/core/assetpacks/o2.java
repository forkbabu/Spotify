package com.google.android.play.core.assetpacks;

import android.support.annotation.Nullable;
import java.util.Arrays;

/* access modifiers changed from: package-private */
public final class o2 {
    private final String a;
    private final long b;
    private final int c;
    private final boolean d;
    private final boolean e;
    private final byte[] f;

    o2() {
    }

    o2(@Nullable String str, long j, int i, boolean z, boolean z2, @Nullable byte[] bArr) {
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = bArr;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        String str = this.a;
        if (str == null) {
            return false;
        }
        return str.endsWith("/");
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.c == 0;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public String c() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public long d() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o2) {
            o2 o2Var = (o2) obj;
            String str = this.a;
            if (str != null ? str.equals(o2Var.a) : o2Var.a == null) {
                if (this.b == o2Var.b && this.c == o2Var.c && this.d == o2Var.d && this.e == o2Var.e && Arrays.equals(this.f, o2Var.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public byte[] h() {
        return this.f;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = 1237;
        int i2 = (((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003;
        if (true == this.e) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ Arrays.hashCode(this.f);
    }

    public String toString() {
        String str = this.a;
        long j = this.b;
        int i = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        String arrays = Arrays.toString(this.f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(arrays).length());
        sb.append("ZipEntry{name=");
        sb.append(str);
        sb.append(", size=");
        sb.append(j);
        sb.append(", compressionMethod=");
        sb.append(i);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", isEndOfArchive=");
        sb.append(z2);
        return je.J0(sb, ", headerBytes=", arrays, "}");
    }
}
