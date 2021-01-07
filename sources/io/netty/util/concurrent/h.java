package io.netty.util.concurrent;

import java.util.Arrays;

/* access modifiers changed from: package-private */
public final class h {
    private s<? extends r<?>>[] a;
    private int b = 2;

    h(s<? extends r<?>> sVar, s<? extends r<?>> sVar2) {
        s<? extends r<?>>[] sVarArr = new s[2];
        this.a = sVarArr;
        sVarArr[0] = sVar;
        sVarArr[1] = sVar2;
    }

    public void a(s<? extends r<?>> sVar) {
        s<? extends r<?>>[] sVarArr = this.a;
        int i = this.b;
        if (i == sVarArr.length) {
            sVarArr = (s[]) Arrays.copyOf(sVarArr, i << 1);
            this.a = sVarArr;
        }
        sVarArr[i] = sVar;
        this.b = i + 1;
    }

    public s<? extends r<?>>[] b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }
}
