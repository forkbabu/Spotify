package androidx.room;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class c<T> extends o {
    public c(RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    /* access modifiers changed from: protected */
    public abstract void d(t7 t7Var, T t);

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.room.c<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Iterable<? extends T> iterable) {
        t7 a = a();
        try {
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                d(a, it.next());
                a.P0();
            }
        } finally {
            c(a);
        }
    }

    public final void f(T t) {
        t7 a = a();
        try {
            d(a, t);
            a.P0();
        } finally {
            c(a);
        }
    }

    public final void g(T[] tArr) {
        t7 a = a();
        try {
            for (T t : tArr) {
                d(a, t);
                a.P0();
            }
        } finally {
            c(a);
        }
    }

    public final long h(T t) {
        t7 a = a();
        try {
            d(a, t);
            return a.P0();
        } finally {
            c(a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: androidx.room.c<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<Long> i(Collection<? extends T> collection) {
        t7 a = a();
        try {
            ArrayList arrayList = new ArrayList(collection.size());
            int i = 0;
            Iterator<? extends T> it = collection.iterator();
            while (it.hasNext()) {
                d(a, it.next());
                arrayList.add(i, Long.valueOf(a.P0()));
                i++;
            }
            return arrayList;
        } finally {
            c(a);
        }
    }
}
