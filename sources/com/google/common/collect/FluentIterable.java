package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public abstract class FluentIterable<E> implements Iterable<E> {
    private final Optional<Iterable<E>> iterableDelegate;

    protected FluentIterable() {
        this.iterableDelegate = Optional.absent();
    }

    public static <T> FluentIterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        final Iterable[] iterableArr = {iterable, iterable2};
        for (int i = 0; i < 2; i++) {
            iterableArr[i].getClass();
        }
        return new FluentIterable<T>() {
            /* class com.google.common.collect.FluentIterable.AnonymousClass3 */

            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return new Iterators$ConcatenatedIterator(new AbstractIndexedListIterator<Iterator<? extends T>>(iterableArr.length) {
                    /* class com.google.common.collect.FluentIterable.AnonymousClass3.AnonymousClass1 */

                    @Override // com.google.common.collect.AbstractIndexedListIterator
                    public Object get(int i) {
                        return iterableArr[i].iterator();
                    }
                });
            }
        };
    }

    public static <E> FluentIterable<E> from(final Iterable<E> iterable) {
        return iterable instanceof FluentIterable ? (FluentIterable) iterable : new FluentIterable<E>(iterable) {
            /* class com.google.common.collect.FluentIterable.AnonymousClass1 */

            @Override // java.lang.Iterable
            public Iterator<E> iterator() {
                return iterable.iterator();
            }
        };
    }

    private Iterable<E> getDelegate() {
        return this.iterableDelegate.or((Optional<Iterable<E>>) this);
    }

    public final boolean anyMatch(Predicate<? super E> predicate) {
        return Collections2.any(getDelegate(), predicate);
    }

    public final FluentIterable<E> append(E... eArr) {
        return concat(getDelegate(), Arrays.asList(eArr));
    }

    public final <C extends Collection<? super E>> C copyInto(C c) {
        Iterable<E> delegate = getDelegate();
        if (delegate instanceof Collection) {
            c.addAll((Collection) delegate);
        } else {
            for (E e : delegate) {
                c.add(e);
            }
        }
        return c;
    }

    public final FluentIterable<E> filter(Predicate<? super E> predicate) {
        return from(Collections2.filter(getDelegate(), predicate));
    }

    public final Optional<E> first() {
        Iterator<E> it = getDelegate().iterator();
        return it.hasNext() ? Optional.of(it.next()) : Optional.absent();
    }

    public final Optional<E> firstMatch(Predicate<? super E> predicate) {
        return Collections2.tryFind(getDelegate(), predicate);
    }

    public final boolean isEmpty() {
        return !getDelegate().iterator().hasNext();
    }

    public final FluentIterable<E> limit(int i) {
        return from(Collections2.limit(getDelegate(), i));
    }

    public final FluentIterable<E> skip(int i) {
        Iterable<E> delegate = getDelegate();
        delegate.getClass();
        MoreObjects.checkArgument(i >= 0, "number to skip cannot be negative");
        return from(new Iterables$6(delegate, i));
    }

    public final E[] toArray(Class<E> cls) {
        return (E[]) Collections2.toArray(getDelegate(), cls);
    }

    public final ImmutableList<E> toList() {
        return ImmutableList.copyOf(getDelegate());
    }

    public final <V> ImmutableMap<E, V> toMap(Function<? super E, V> function) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (E e : getDelegate()) {
            linkedHashMap.put(e, function.apply(e));
        }
        return ImmutableMap.copyOf(linkedHashMap);
    }

    public final ImmutableSet<E> toSet() {
        return ImmutableSet.copyOf(getDelegate());
    }

    @Override // java.lang.Object
    public String toString() {
        return Collections2.toString(getDelegate());
    }

    public final <T> FluentIterable<T> transform(Function<? super E, T> function) {
        return from(Collections2.transform(getDelegate(), function));
    }

    public <T> FluentIterable<T> transformAndConcat(Function<? super E, ? extends Iterable<? extends T>> function) {
        final FluentIterable from = from(Collections2.transform(getDelegate(), function));
        from.getClass();
        return new FluentIterable<T>() {
            /* class com.google.common.collect.FluentIterable.AnonymousClass2 */

            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return new Iterators$ConcatenatedIterator(new Iterators$6(from.iterator(), new Iterables$10()));
            }
        };
    }

    FluentIterable(Iterable<E> iterable) {
        iterable.getClass();
        this.iterableDelegate = Optional.fromNullable(this == iterable ? null : iterable);
    }
}
