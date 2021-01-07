package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: kjf  reason: default package */
public final class kjf<T> implements fjf<Set<T>> {
    private static final fjf<Set<Object>> c = gjf.a(Collections.emptySet());
    private final List<wlf<T>> a;
    private final List<wlf<Collection<T>>> b;

    /* renamed from: kjf$b */
    public static final class b<T> {
        private final List<wlf<T>> a;
        private final List<wlf<Collection<T>>> b;

        b(int i, int i2, a aVar) {
            List<wlf<T>> list;
            List<wlf<Collection<T>>> list2;
            if (i == 0) {
                list = Collections.emptyList();
            } else {
                list = new ArrayList(i);
            }
            this.a = list;
            if (i2 == 0) {
                list2 = Collections.emptyList();
            } else {
                list2 = new ArrayList<>(i2);
            }
            this.b = list2;
        }

        public b<T> a(wlf<? extends Collection<? extends T>> wlf) {
            this.b.add(wlf);
            return this;
        }

        public b<T> b(wlf<? extends T> wlf) {
            this.a.add(wlf);
            return this;
        }

        public kjf<T> c() {
            return new kjf<>(this.a, this.b, null);
        }
    }

    kjf(List list, List list2, a aVar) {
        this.a = list;
        this.b = list2;
    }

    public static <T> b<T> a(int i, int i2) {
        return new b<>(i, i2, null);
    }

    public static <T> fjf<Set<T>> b() {
        return (fjf<Set<T>>) c;
    }

    @Override // defpackage.wlf
    public Object get() {
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(this.b.size());
        int size2 = this.b.size();
        for (int i = 0; i < size2; i++) {
            Collection<T> collection = this.b.get(i).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet b2 = cjf.b(size);
        int size3 = this.a.size();
        for (int i2 = 0; i2 < size3; i2++) {
            T t = this.a.get(i2).get();
            t.getClass();
            b2.add(t);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                obj.getClass();
                b2.add(obj);
            }
        }
        return Collections.unmodifiableSet(b2);
    }
}
