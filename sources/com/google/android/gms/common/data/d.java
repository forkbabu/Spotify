package com.google.android.gms.common.data;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.exoplayer2.util.g;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX WARN: Incorrect class signature, class is equals to this class: <T:Ljava/lang/Object;>Lcom/google/android/gms/common/data/d<TT;>; */
public abstract class d<T> implements a {
    @RecentlyNullable
    protected final DataHolder a;
    private boolean b = false;
    private ArrayList<Integer> c;

    protected d(@RecentlyNonNull DataHolder dataHolder) {
        this.a = dataHolder;
    }

    private final int J(int i) {
        if (i >= 0 && i < this.c.size()) {
            return this.c.get(i).intValue();
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("Position ");
        sb.append(i);
        sb.append(" is out of bounds for this buffer");
        throw new IllegalArgumentException(sb.toString());
    }

    private final void M() {
        synchronized (this) {
            if (!this.b) {
                DataHolder dataHolder = this.a;
                g.l(dataHolder);
                int count = dataHolder.getCount();
                ArrayList<Integer> arrayList = new ArrayList<>();
                this.c = arrayList;
                if (count > 0) {
                    arrayList.add(0);
                    String p2 = this.a.p2("path", 0, this.a.q2(0));
                    for (int i = 1; i < count; i++) {
                        int q2 = this.a.q2(i);
                        String p22 = this.a.p2("path", i, q2);
                        if (p22 != null) {
                            if (!p22.equals(p2)) {
                                this.c.add(Integer.valueOf(i));
                                p2 = p22;
                            }
                        } else {
                            StringBuilder sb = new StringBuilder("path".length() + 78);
                            sb.append("Missing value for markerColumn: ");
                            sb.append("path");
                            sb.append(", at row: ");
                            sb.append(i);
                            sb.append(", for window: ");
                            sb.append(q2);
                            throw new NullPointerException(sb.toString());
                        }
                    }
                }
                this.b = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    public abstract T I(int i, int i2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d();
    }

    @Override // com.google.android.gms.common.api.g
    public void d() {
        DataHolder dataHolder = this.a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // com.google.android.gms.common.data.a
    @RecentlyNonNull
    public final T get(int i) {
        int i2;
        int i3;
        int i4;
        M();
        int J = J(i);
        if (i < 0 || i == this.c.size()) {
            i2 = 0;
        } else {
            if (i == this.c.size() - 1) {
                DataHolder dataHolder = this.a;
                g.l(dataHolder);
                i4 = dataHolder.getCount();
                i3 = this.c.get(i).intValue();
            } else {
                i4 = this.c.get(i + 1).intValue();
                i3 = this.c.get(i).intValue();
            }
            i2 = i4 - i3;
            if (i2 == 1) {
                int J2 = J(i);
                DataHolder dataHolder2 = this.a;
                g.l(dataHolder2);
                dataHolder2.q2(J2);
            }
        }
        return I(J, i2);
    }

    @Override // com.google.android.gms.common.data.a
    public int getCount() {
        M();
        return this.c.size();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new b(this);
    }
}
