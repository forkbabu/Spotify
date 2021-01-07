package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.Multiset;
import com.google.common.primitives.Ints;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

public final class Collections2 {

    static class FilteredCollection<E> extends AbstractCollection<E> {
        final Predicate<? super E> predicate;
        final Collection<E> unfiltered;

        FilteredCollection(Collection<E> collection, Predicate<? super E> predicate2) {
            this.unfiltered = collection;
            this.predicate = predicate2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(E e) {
            MoreObjects.checkArgument(this.predicate.apply(e));
            return this.unfiltered.add(e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                MoreObjects.checkArgument(this.predicate.apply(it.next()));
            }
            return this.unfiltered.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            Collections2.removeIf(this.unfiltered, this.predicate);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (Collections2.safeContains(this.unfiltered, obj)) {
                return this.predicate.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return Collections2.containsAllImpl(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !Collections2.any(this.unfiltered, this.predicate);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            Iterator<E> it = this.unfiltered.iterator();
            Predicate<? super E> predicate2 = this.predicate;
            it.getClass();
            predicate2.getClass();
            return new Iterators$5(it, predicate2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return contains(obj) && this.unfiltered.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.unfiltered.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.predicate.apply(next) && collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.unfiltered.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.predicate.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i = 0;
            for (E e : this.unfiltered) {
                if (this.predicate.apply(e)) {
                    i++;
                }
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return Collections2.newArrayList(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) Collections2.newArrayList(iterator()).toArray(tArr);
        }
    }

    static class TransformedCollection<F, T> extends AbstractCollection<T> {
        final Collection<F> fromCollection;
        final Function<? super F, ? extends T> function;

        TransformedCollection(Collection<F> collection, Function<? super F, ? extends T> function2) {
            collection.getClass();
            this.fromCollection = collection;
            function2.getClass();
            this.function = function2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.fromCollection.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.fromCollection.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return Collections2.transform(this.fromCollection.iterator(), this.function);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.fromCollection.size();
        }
    }

    static Object access$100(Multiset.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getElement();
    }

    public static <T> boolean addAll(Collection<T> collection, Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        iterable.getClass();
        return addAll(collection, iterable.iterator());
    }

    public static <T> boolean any(Iterable<T> iterable, Predicate<? super T> predicate) {
        return indexOf(iterable.iterator(), predicate) != -1;
    }

    public static <E> List<E> asList(E e, E[] eArr) {
        return new Lists$OnePlusArrayList(e, eArr);
    }

    public static <K, V> Map<K, V> asMap(Set<K> set, Function<? super K, V> function) {
        return new Maps$AsMapView(set, function);
    }

    static int capacity(int i) {
        if (i < 3) {
            checkNonnegative(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    static Object checkElementNotNull(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(je.p0("at index ", i));
    }

    static Object[] checkElementsNotNull(Object... objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            checkElementNotNull(objArr[i], i);
        }
        return objArr;
    }

    static void checkEntryNotNull(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        } else if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }

    static int checkNonnegative(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    static void clear(Iterator<?> it) {
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    static int closedTableSize(int i, double d) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        double d2 = (double) highestOneBit;
        Double.isNaN(d2);
        if (max <= ((int) (d * d2))) {
            return highestOneBit;
        }
        int i2 = highestOneBit << 1;
        if (i2 > 0) {
            return i2;
        }
        return 1073741824;
    }

    public static boolean contains(Iterable<?> iterable, Object obj) {
        if (iterable instanceof Collection) {
            return safeContains((Collection) iterable, obj);
        }
        return contains(iterable.iterator(), obj);
    }

    static boolean containsAllImpl(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <E> Sets$SetView<E> difference(Set<E> set, Set<?> set2) {
        MoreObjects.checkNotNull(set, "set1");
        MoreObjects.checkNotNull(set2, "set2");
        return new Sets$3(set, set2);
    }

    static boolean equalsImpl(Multiset<?> multiset, Object obj) {
        if (obj == multiset) {
            return true;
        }
        if (obj instanceof Multiset) {
            Multiset multiset2 = (Multiset) obj;
            if (multiset.size() == multiset2.size() && multiset.entrySet().size() == multiset2.entrySet().size()) {
                for (Multiset.Entry entry : multiset2.entrySet()) {
                    if (multiset.count(entry.getElement()) != entry.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private static Object[] fillArray(Iterable<?> iterable, Object[] objArr) {
        Iterator<?> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    public static <E> Collection<E> filter(Collection<E> collection, Predicate<? super E> predicate) {
        if (collection instanceof FilteredCollection) {
            FilteredCollection filteredCollection = (FilteredCollection) collection;
            return new FilteredCollection(filteredCollection.unfiltered, MoreObjects.and(filteredCollection.predicate, predicate));
        }
        collection.getClass();
        return new FilteredCollection(collection, predicate);
    }

    public static <K, V> Map<K, V> filterEntries(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate) {
        if (map instanceof Maps$AbstractFilteredMap) {
            Maps$AbstractFilteredMap maps$AbstractFilteredMap = (Maps$AbstractFilteredMap) map;
            return new Maps$FilteredEntryMap(maps$AbstractFilteredMap.unfiltered, MoreObjects.and(maps$AbstractFilteredMap.predicate, predicate));
        }
        map.getClass();
        return new Maps$FilteredEntryMap(map, predicate);
    }

    public static <K, V> Map<K, V> filterKeys(Map<K, V> map, Predicate<? super K> predicate) {
        Predicate compose = MoreObjects.compose(predicate, Maps$EntryFunction.KEY);
        if (map instanceof Maps$AbstractFilteredMap) {
            Maps$AbstractFilteredMap maps$AbstractFilteredMap = (Maps$AbstractFilteredMap) map;
            return new Maps$FilteredEntryMap(maps$AbstractFilteredMap.unfiltered, MoreObjects.and(maps$AbstractFilteredMap.predicate, compose));
        }
        map.getClass();
        return new Maps$FilteredKeyMap(map, predicate, compose);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T find(java.lang.Iterable<? extends T> r1, com.google.common.base.Predicate<? super T> r2, T r3) {
        /*
            java.util.Iterator r1 = r1.iterator()
            r1.getClass()
        L_0x0007:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0018
            java.lang.Object r3 = r1.next()
            boolean r0 = r2.apply(r3)
            if (r0 == 0) goto L_0x0007
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Collections2.find(java.lang.Iterable, com.google.common.base.Predicate, java.lang.Object):java.lang.Object");
    }

    static <T> Serialization$FieldSetter<T> getFieldSetter(Class<T> cls, String str) {
        try {
            return new Serialization$FieldSetter<>(cls.getDeclaredField(str), null);
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    public static <T> T getNext(Iterator<? extends T> it, T t) {
        return it.hasNext() ? (T) it.next() : t;
    }

    public static <T> T getOnlyElement(Iterable<? extends T> iterable, T t) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t2 = (T) it.next();
        if (!it.hasNext()) {
            return t2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("expected one element but was: <");
        sb.append((Object) t2);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static boolean hasSameComparator(Comparator<?> comparator, Iterable<?> iterable) {
        Object obj;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            obj = ((SortedSet) iterable).comparator();
            if (obj == null) {
                obj = NaturalOrdering.INSTANCE;
            }
        } else if (!(iterable instanceof SortedIterable)) {
            return false;
        } else {
            obj = ((SortedIterable) iterable).comparator();
        }
        return comparator.equals(obj);
    }

    static int hashCodeImpl(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ((i + (next != null ? next.hashCode() : 0)) ^ -1) ^ -1;
        }
        return i;
    }

    public static <T> int indexOf(Iterator<T> it, Predicate<? super T> predicate) {
        MoreObjects.checkNotNull(predicate, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (predicate.apply(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static boolean isEmpty(Iterable<?> iterable) {
        return ((Collection) iterable).isEmpty();
    }

    static <E> Iterator<E> iteratorImpl(Multiset<E> multiset) {
        return new Multisets$MultisetIteratorImpl(multiset, multiset.entrySet().iterator());
    }

    static <K> K keyOrNull(Map.Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static <T> Iterable<T> limit(Iterable<T> iterable, int i) {
        iterable.getClass();
        MoreObjects.checkArgument(i >= 0, "limit is negative");
        return new Iterables$7(iterable, i);
    }

    public static <T> T[] newArray(T[] tArr, int i) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
    }

    public static <E> ArrayDeque<E> newArrayDeque(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new ArrayDeque<>((Collection) iterable);
        }
        ArrayDeque<E> arrayDeque = new ArrayDeque<>();
        addAll(arrayDeque, iterable);
        return arrayDeque;
    }

    public static <E> ArrayList<E> newArrayList(Iterator<? extends E> it) {
        ArrayList<E> arrayList = new ArrayList<>();
        addAll(arrayList, it);
        return arrayList;
    }

    public static <E> ArrayList<E> newArrayListWithCapacity(int i) {
        checkNonnegative(i, "initialArraySize");
        return new ArrayList<>(i);
    }

    public static <K, V> HashMap<K, V> newHashMapWithExpectedSize(int i) {
        return new HashMap<>(capacity(i));
    }

    public static <E> HashSet<E> newHashSet(E... eArr) {
        HashSet<E> newHashSetWithExpectedSize = newHashSetWithExpectedSize(eArr.length);
        Collections.addAll(newHashSetWithExpectedSize, eArr);
        return newHashSetWithExpectedSize;
    }

    public static <E> HashSet<E> newHashSetWithExpectedSize(int i) {
        return new HashSet<>(capacity(i));
    }

    static StringBuilder newStringBuilderForCollection(int i) {
        checkNonnegative(i, "size");
        return new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
    }

    static <T> T pollNext(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Map<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> void populateMap(Map<K, V> map, ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.google.common.collect.Multimap<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> void populateMultimap(Multimap<K, V> multimap, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            Collection collection = multimap.mo44get(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt; i3++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.common.collect.Multiset<E> */
    /* JADX WARN: Multi-variable type inference failed */
    static <E> void populateMultiset(Multiset<E> multiset, ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            multiset.add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    static boolean removeAllImpl(Set<?> set, Collection<?> collection) {
        collection.getClass();
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).mo69elementSet();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return removeAllImpl(set, collection.iterator());
        }
        Iterator<?> it = set.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static <T> boolean removeIf(Iterable<T> iterable, Predicate<? super T> predicate) {
        boolean z = false;
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            Iterator<T> it = iterable.iterator();
            predicate.getClass();
            while (it.hasNext()) {
                if (predicate.apply(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        List list = (List) iterable;
        predicate.getClass();
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = (Object) list.get(i);
            if (!predicate.apply(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (UnsupportedOperationException unused) {
                        slowRemoveIfForRemainingElements(list, predicate, i2, i);
                        return true;
                    } catch (IllegalArgumentException unused2) {
                        slowRemoveIfForRemainingElements(list, predicate, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        if (i != i2) {
            z = true;
        }
        return z;
    }

    static boolean safeContains(Collection<?> collection, Object obj) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    private static <T> void slowRemoveIfForRemainingElements(List<T> list, Predicate<? super T> predicate, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (predicate.apply(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 >= i) {
                list.remove(i2);
            } else {
                return;
            }
        }
    }

    static int smear(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    static int smearedHash(Object obj) {
        return smear(obj == null ? 0 : obj.hashCode());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.Collection] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T[] toArray(java.lang.Iterable<? extends T> r1, java.lang.Class<T> r2) {
        /*
            r0 = 0
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r0)
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x000e
            java.util.Collection r1 = (java.util.Collection) r1
            goto L_0x0016
        L_0x000e:
            java.util.Iterator r1 = r1.iterator()
            java.util.ArrayList r1 = newArrayList(r1)
        L_0x0016:
            java.lang.Object[] r1 = r1.toArray(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Collections2.toArray(java.lang.Iterable, java.lang.Class):java.lang.Object[]");
    }

    static <T> T[] toArrayImpl(Collection<?> collection, T[] tArr) {
        int size = collection.size();
        if (tArr.length < size) {
            tArr = (T[]) newArray(tArr, size);
        }
        fillArray(collection, tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    public static String toString(Iterable<?> iterable) {
        Iterator<?> it = iterable.iterator();
        StringBuilder S0 = je.S0('[');
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                S0.append(", ");
            }
            z = false;
            S0.append(it.next());
        }
        S0.append(']');
        return S0.toString();
    }

    static String toStringImpl(Map<?, ?> map) {
        StringBuilder newStringBuilderForCollection = newStringBuilderForCollection(map.size());
        newStringBuilderForCollection.append('{');
        boolean z = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z) {
                newStringBuilderForCollection.append(", ");
            }
            z = false;
            newStringBuilderForCollection.append(entry.getKey());
            newStringBuilderForCollection.append('=');
            newStringBuilderForCollection.append(entry.getValue());
        }
        newStringBuilderForCollection.append('}');
        return newStringBuilderForCollection.toString();
    }

    public static <F, T> Collection<T> transform(Collection<F> collection, Function<? super F, T> function) {
        return new TransformedCollection(collection, function);
    }

    public static <T> Optional<T> tryFind(Iterable<T> iterable, Predicate<? super T> predicate) {
        Iterator<T> it = iterable.iterator();
        it.getClass();
        predicate.getClass();
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                return Optional.of(next);
            }
        }
        return Optional.absent();
    }

    public static <E> NavigableSet<E> unmodifiableNavigableSet(NavigableSet<E> navigableSet) {
        return ((navigableSet instanceof ImmutableCollection) || (navigableSet instanceof Sets$UnmodifiableNavigableSet)) ? navigableSet : new Sets$UnmodifiableNavigableSet(navigableSet);
    }

    static <K, V> void writeMap(Map<K, V> map, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    static <K, V> void writeMultimap(Multimap<K, V> multimap, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(multimap.asMap().size());
        for (Map.Entry<K, Collection<V>> entry : multimap.asMap().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            for (V v : entry.getValue()) {
                objectOutputStream.writeObject(v);
            }
        }
    }

    static <E> void writeMultiset(Multiset<E> multiset, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(multiset.entrySet().size());
        for (Multiset.Entry<E> entry : multiset.entrySet()) {
            objectOutputStream.writeObject(entry.getElement());
            objectOutputStream.writeInt(entry.getCount());
        }
    }

    public static <F, T> List<T> transform(List<F> list, Function<? super F, ? extends T> function) {
        return list instanceof RandomAccess ? new Lists$TransformingRandomAccessList(list, function) : new Lists$TransformingSequentialList(list, function);
    }

    public static <E> ArrayList<E> newArrayList(Iterable<? extends E> iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList<>((Collection) iterable);
        }
        return newArrayList(iterable.iterator());
    }

    public static <E> HashSet<E> newHashSet(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new HashSet<>((Collection) iterable);
        }
        Iterator<? extends E> it = iterable.iterator();
        HashSet<E> hashSet = new HashSet<>();
        addAll(hashSet, it);
        return hashSet;
    }

    public static <F, T> Iterable<T> transform(Iterable<F> iterable, Function<? super F, ? extends T> function) {
        iterable.getClass();
        function.getClass();
        return new Iterables$5(iterable, function);
    }

    public static boolean contains(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Collection<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> boolean addAll(Collection<T> collection, Iterator<? extends T> it) {
        collection.getClass();
        it.getClass();
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    static boolean equalsImpl(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <T> T find(Iterator<T> it, Predicate<? super T> predicate) {
        it.getClass();
        predicate.getClass();
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static <F, T> Iterator<T> transform(Iterator<F> it, Function<? super F, ? extends T> function) {
        function.getClass();
        return new Iterators$6(it, function);
    }

    public static <T> Iterable<T> filter(Iterable<T> iterable, Predicate<? super T> predicate) {
        iterable.getClass();
        predicate.getClass();
        return new Iterables$4(iterable, predicate);
    }

    static Object[] toArrayImpl(Collection<?> collection) {
        Object[] objArr = new Object[collection.size()];
        fillArray(collection, objArr);
        return objArr;
    }

    @SafeVarargs
    public static <E> ArrayList<E> newArrayList(E... eArr) {
        eArr.getClass();
        int length = eArr.length;
        checkNonnegative(length, "arraySize");
        ArrayList<E> arrayList = new ArrayList<>(Ints.saturatedCast(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    static boolean equalsImpl(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <E> Set<E> filter(Set<E> set, Predicate<? super E> predicate) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof Sets$FilteredSet) {
                Sets$FilteredSet sets$FilteredSet = (Sets$FilteredSet) sortedSet;
                return new Sets$FilteredSortedSet((SortedSet) sets$FilteredSet.unfiltered, MoreObjects.and(sets$FilteredSet.predicate, predicate));
            }
            sortedSet.getClass();
            predicate.getClass();
            return new Sets$FilteredSortedSet(sortedSet, predicate);
        } else if (set instanceof Sets$FilteredSet) {
            Sets$FilteredSet sets$FilteredSet2 = (Sets$FilteredSet) set;
            return new Sets$FilteredSet((Set) sets$FilteredSet2.unfiltered, MoreObjects.and(sets$FilteredSet2.predicate, predicate));
        } else {
            set.getClass();
            predicate.getClass();
            return new Sets$FilteredSet(set, predicate);
        }
    }

    static boolean removeAllImpl(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
