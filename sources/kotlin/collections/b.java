package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.h;

public abstract class b<E> extends AbstractCollection<E> implements List<E>, zmf {

    /* access modifiers changed from: private */
    public class a implements Iterator<E>, zmf {
        private int a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }

        /* access modifiers changed from: protected */
        public final int a() {
            return this.a;
        }

        /* access modifiers changed from: protected */
        public final void b(int i) {
            this.a = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a < b.this.d();
        }

        @Override // java.util.Iterator
        public E next() {
            if (hasNext()) {
                b bVar = b.this;
                int i = this.a;
                this.a = i + 1;
                return (E) bVar.get(i);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: kotlin.collections.b$b  reason: collision with other inner class name */
    public class C0633b extends b<E>.a implements ListIterator<E>, zmf {
        public C0633b(int i) {
            super();
            int d = b.this.d();
            if (i < 0 || i > d) {
                throw new IndexOutOfBoundsException(je.s0("index: ", i, ", size: ", d));
            }
            b(i);
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return a();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (hasPrevious()) {
                b bVar = b.this;
                b(a() - 1);
                return (E) bVar.get(a());
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private static final class c<E> extends b<E> implements RandomAccess {
        private int a;
        private final b<E> b;
        private final int c;

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.collections.b<? extends E> */
        /* JADX WARN: Multi-variable type inference failed */
        public c(b<? extends E> bVar, int i, int i2) {
            h.e(bVar, "list");
            this.b = bVar;
            this.c = i;
            int d = bVar.d();
            if (i < 0 || i2 > d) {
                StringBuilder X0 = je.X0("fromIndex: ", i, ", toIndex: ", i2, ", size: ");
                X0.append(d);
                throw new IndexOutOfBoundsException(X0.toString());
            } else if (i <= i2) {
                this.a = i2 - i;
            } else {
                throw new IllegalArgumentException(je.s0("fromIndex: ", i, " > toIndex: ", i2));
            }
        }

        @Override // kotlin.collections.AbstractCollection
        public int d() {
            return this.a;
        }

        @Override // kotlin.collections.b, java.util.List
        public E get(int i) {
            int i2 = this.a;
            if (i >= 0 && i < i2) {
                return this.b.get(this.c + i);
            }
            throw new IndexOutOfBoundsException(je.s0("index: ", i, ", size: ", i2));
        }
    }

    protected b() {
    }

    @Override // java.util.List
    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.lang.Object, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        h.e(this, "c");
        h.e(collection, "other");
        if (size() == collection.size()) {
            Iterator<E> it = collection.iterator();
            for (E e : this) {
                if (!h.a(e, it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public abstract E get(int i);

    @Override // java.util.Collection, java.lang.Object, java.util.List
    public int hashCode() {
        h.e(this, "c");
        Iterator<E> it = iterator();
        int i = 1;
        while (it.hasNext()) {
            E next = it.next();
            i = (i * 31) + (next != null ? next.hashCode() : 0);
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        int i = 0;
        for (E e : this) {
            if (h.a(e, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (h.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new C0633b(0);
    }

    @Override // java.util.List
    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return new c(this, i, i2);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return new C0633b(i);
    }
}
