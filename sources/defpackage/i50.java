package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: i50  reason: default package */
public class i50<E> extends AbstractList<E> {
    private static final j50 c = j50.a(i50.class);
    List<E> a;
    Iterator<E> b;

    /* renamed from: i50$a */
    class a implements Iterator<E> {
        int a = 0;

        a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a < i50.this.a.size() || i50.this.b.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (this.a < i50.this.a.size()) {
                List<E> list = i50.this.a;
                int i = this.a;
                this.a = i + 1;
                return list.get(i);
            }
            i50 i50 = i50.this;
            i50.a.add(i50.b.next());
            return (E) next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public i50(List<E> list, Iterator<E> it) {
        this.a = list;
        this.b = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        if (this.a.size() > i) {
            return this.a.get(i);
        }
        if (this.b.hasNext()) {
            this.a.add(this.b.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public int size() {
        j50 j50 = c;
        j50.b("potentially expensive size() call");
        j50.b("blowup running");
        while (this.b.hasNext()) {
            this.a.add(this.b.next());
        }
        return this.a.size();
    }
}
