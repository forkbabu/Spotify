package defpackage;

import android.util.SparseArray;

/* renamed from: d61  reason: default package */
public class d61 implements u51 {
    private final SparseArray<s51<?>> a;

    /* renamed from: d61$b */
    public static class b {
        private final SparseArray<s51<?>> a = new SparseArray<>();

        b(a aVar) {
        }

        public d61 a() {
            return new d61(this.a, null);
        }

        public b b(SparseArray<s51<?>> sparseArray) {
            sparseArray.getClass();
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                s51<?> valueAt = sparseArray.valueAt(i);
                if (valueAt == null) {
                    throw new IllegalArgumentException(je.p0("Null binder for id ", keyAt));
                } else if (keyAt > 0) {
                    this.a.put(keyAt, valueAt);
                } else {
                    throw new IllegalArgumentException("Illegal id registered: " + keyAt + '=' + valueAt + " (only positive IDs are allowed");
                }
            }
            return this;
        }
    }

    d61(SparseArray sparseArray, a aVar) {
        sparseArray.getClass();
        this.a = sparseArray.clone();
    }

    public static b b(SparseArray<s51<?>> sparseArray) {
        b bVar = new b(null);
        bVar.b(sparseArray);
        return bVar;
    }

    @Override // defpackage.u51
    public s51<?> a(int i) {
        return this.a.get(i);
    }
}
