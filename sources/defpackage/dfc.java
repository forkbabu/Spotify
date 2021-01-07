package defpackage;

import com.spotify.playlist.models.l;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.function.UnaryOperator;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: dfc  reason: default package */
public final class dfc implements List<l>, zmf {
    public static final a n = new a(null);
    private final List<l> a;
    private final List<l> b;
    private final int c;
    private final int f;

    /* renamed from: dfc$a */
    public static final class a {
        public a(f fVar) {
        }
    }

    /* renamed from: dfc$b */
    public static final class b implements ListIterator<l>, zmf {
        private int a;
        final /* synthetic */ dfc b;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(dfc dfc) {
            this.b = dfc;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.util.ListIterator
        public /* synthetic */ void add(l lVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.a < this.b.f;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            if (hasNext()) {
                dfc dfc = this.b;
                int i = this.a;
                this.a = i + 1;
                return dfc.get(i);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.ListIterator
        public l previous() {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.util.ListIterator
        public /* synthetic */ void set(l lVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public dfc(List<l> list, List<l> list2, int i, int i2) {
        h.e(list, "limitedItems");
        h.e(list2, "items");
        this.a = list;
        this.b = list2;
        this.c = i;
        this.f = i2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List
    public /* synthetic */ void add(int i, l lVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends l> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends l> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        h.e(lVar, "element");
        if (indexOf(lVar) != -1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/util/Collection<+Ljava/lang/Object;>;)Ljava/lang/Void; */
    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        h.e(collection, "elements");
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /* renamed from: e */
    public l get(int i) {
        int i2 = this.c;
        if (i >= i2 && i < this.b.size() + i2) {
            return this.b.get(i - this.c);
        }
        if (i < this.a.size()) {
            l lVar = this.a.get(i);
            l.a h = lVar.h();
            StringBuilder sb = new StringBuilder();
            String f2 = lVar.f();
            if (f2 == null) {
                f2 = "";
            }
            sb.append(f2);
            sb.append("_placeholder_");
            sb.append(System.identityHashCode(lVar));
            h.f(sb.toString());
            return h.b();
        }
        l b2 = new l.a(null, null, null, null, null, EmptyMap.a, 31).b();
        l.a h2 = b2.h();
        StringBuilder V0 = je.V0("_placeholder_");
        V0.append(System.identityHashCode(b2));
        h2.f(V0.toString());
        return h2.b();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Object
    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof dfc) && obj.hashCode() == hashCode()) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Object
    public int hashCode() {
        int i = (this.f * 17) + this.c;
        Object[] array = this.b.toArray(new l[0]);
        if (array != null) {
            int hashCode = Arrays.hashCode(array) + i;
            Object[] array2 = this.a.toArray(new l[0]);
            if (array2 != null) {
                return Arrays.hashCode(array2) + hashCode;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof l)) {
            return -1;
        }
        l lVar = (l) obj;
        h.e(lVar, "element");
        b bVar = new b(this);
        int i = 0;
        while (bVar.hasNext()) {
            l.a h = ((l) bVar.next()).h();
            h.f("");
            l b2 = h.b();
            l.a h2 = lVar.h();
            h2.f("");
            if (h.a(b2, h2.b())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<l> iterator() {
        return new b(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof l)) {
            return -1;
        }
        h.e((l) obj, "element");
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override // java.util.List
    public ListIterator<l> listIterator() {
        return new b(this);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List
    public /* synthetic */ l remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<l> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List
    public /* synthetic */ l set(int i, l lVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f;
    }

    @Override // java.util.List
    public void sort(Comparator<? super l> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* Return type fixed from 'java.util.List' to match base method */
    @Override // java.util.List
    public List<l> subList(int i, int i2) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return e.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) e.b(this, tArr);
    }

    /* Return type fixed from 'java.util.ListIterator' to match base method */
    @Override // java.util.List
    public ListIterator<l> listIterator(int i) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
