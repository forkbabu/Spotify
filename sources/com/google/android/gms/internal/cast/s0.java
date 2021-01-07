package com.google.android.gms.internal.cast;

import java.util.Arrays;

/* JADX WARN: Incorrect class signature, class is equals to this class: <E:Ljava/lang/Object;>Lcom/google/android/gms/internal/cast/s0<TE;>; */
public final class s0<E> extends q0 {
    Object[] a = new Object[4];
    int b = 0;
    boolean c;

    public s0() {
        s.g(4, "initialCapacity");
    }

    public final s0 a(Object obj) {
        obj.getClass();
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            int length = objArr.length;
            if (i >= 0) {
                int i2 = length + (length >> 1) + 1;
                if (i2 < i) {
                    i2 = Integer.highestOneBit(i - 1) << 1;
                }
                if (i2 < 0) {
                    i2 = Integer.MAX_VALUE;
                }
                this.a = Arrays.copyOf(objArr, i2);
                this.c = false;
            } else {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        } else if (this.c) {
            this.a = (Object[]) objArr.clone();
            this.c = false;
        }
        Object[] objArr2 = this.a;
        int i3 = this.b;
        this.b = i3 + 1;
        objArr2[i3] = obj;
        return this;
    }

    public final zzeu<E> b() {
        this.c = true;
        Object[] objArr = this.a;
        int i = this.b;
        return i == 0 ? (zzeu<E>) zzfa.o : new zzfa(objArr, i);
    }
}
