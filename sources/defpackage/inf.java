package defpackage;

import java.util.NoSuchElementException;
import kotlin.collections.k;

/* renamed from: inf  reason: default package */
public final class inf extends k {
    private final int a;
    private boolean b;
    private int c;
    private final int f;

    public inf(int i, int i2, int i3) {
        this.f = i3;
        this.a = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.b = z;
        this.c = !z ? i2 : i;
    }

    @Override // kotlin.collections.k
    public int a() {
        int i = this.c;
        if (i != this.a) {
            this.c = this.f + i;
        } else if (this.b) {
            this.b = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.b;
    }
}
