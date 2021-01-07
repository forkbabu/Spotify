package androidx.room;

import java.util.Iterator;

public abstract class b<T> extends o {
    public b(RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    /* access modifiers changed from: protected */
    public abstract void d(t7 t7Var, T t);

    public final int e(T t) {
        t7 a = a();
        try {
            d(a, t);
            return a.E();
        } finally {
            c(a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: androidx.room.b<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final int f(Iterable<? extends T> iterable) {
        t7 a = a();
        try {
            Iterator<? extends T> it = iterable.iterator();
            int i = 0;
            while (it.hasNext()) {
                d(a, it.next());
                i += a.E();
            }
            return i;
        } finally {
            c(a);
        }
    }
}
