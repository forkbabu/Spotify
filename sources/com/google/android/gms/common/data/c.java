package com.google.android.gms.common.data;

import androidx.annotation.RecentlyNonNull;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.internal.m;
import java.util.Arrays;

public class c {
    @RecentlyNonNull
    protected final DataHolder a;
    protected int b;
    private int c;

    public c(@RecentlyNonNull DataHolder dataHolder, int i) {
        if (dataHolder != null) {
            this.a = dataHolder;
            g.o(i >= 0 && i < dataHolder.getCount());
            this.b = i;
            this.c = dataHolder.q2(i);
            return;
        }
        throw new NullPointerException("null reference");
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    public byte[] a(@RecentlyNonNull String str) {
        return this.a.I1(str, this.b, this.c);
    }

    /* access modifiers changed from: protected */
    public int b(@RecentlyNonNull String str) {
        return this.a.Q1(str, this.b, this.c);
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    public String c(@RecentlyNonNull String str) {
        return this.a.p2(str, this.b, this.c);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (m.a(Integer.valueOf(cVar.b), Integer.valueOf(this.b)) && m.a(Integer.valueOf(cVar.c), Integer.valueOf(this.c)) && cVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), this.a});
    }
}
