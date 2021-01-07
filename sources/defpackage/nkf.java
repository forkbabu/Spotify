package defpackage;

import java.nio.channels.SelectionKey;
import java.util.AbstractSet;
import java.util.Iterator;

/* access modifiers changed from: package-private */
/* renamed from: nkf  reason: default package */
public final class nkf extends AbstractSet<SelectionKey> {
    private SelectionKey[] a;
    private int b;
    private SelectionKey[] c;
    private int f;
    private boolean n = true;

    nkf() {
        SelectionKey[] selectionKeyArr = new SelectionKey[1024];
        this.a = selectionKeyArr;
        this.c = (SelectionKey[]) selectionKeyArr.clone();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        SelectionKey selectionKey = (SelectionKey) obj;
        if (selectionKey == null) {
            return false;
        }
        if (this.n) {
            int i = this.b;
            SelectionKey[] selectionKeyArr = this.a;
            int i2 = i + 1;
            selectionKeyArr[i] = selectionKey;
            this.b = i2;
            if (i2 == selectionKeyArr.length) {
                SelectionKey[] selectionKeyArr2 = new SelectionKey[(selectionKeyArr.length << 1)];
                System.arraycopy(selectionKeyArr, 0, selectionKeyArr2, 0, i2);
                this.a = selectionKeyArr2;
            }
        } else {
            int i3 = this.f;
            SelectionKey[] selectionKeyArr3 = this.c;
            int i4 = i3 + 1;
            selectionKeyArr3[i3] = selectionKey;
            this.f = i4;
            if (i4 == selectionKeyArr3.length) {
                SelectionKey[] selectionKeyArr4 = new SelectionKey[(selectionKeyArr3.length << 1)];
                System.arraycopy(selectionKeyArr3, 0, selectionKeyArr4, 0, i4);
                this.c = selectionKeyArr4;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public SelectionKey[] c() {
        if (this.n) {
            this.n = false;
            SelectionKey[] selectionKeyArr = this.a;
            selectionKeyArr[this.b] = null;
            this.f = 0;
            return selectionKeyArr;
        }
        this.n = true;
        SelectionKey[] selectionKeyArr2 = this.c;
        selectionKeyArr2[this.f] = null;
        this.b = 0;
        return selectionKeyArr2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator<SelectionKey> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        if (this.n) {
            return this.b;
        }
        return this.f;
    }
}
