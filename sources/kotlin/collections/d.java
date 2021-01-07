package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import kotlin.text.e;

public final class d extends f {
    public static <K, V> Map<K, V> A(Pair<? extends K, ? extends V>... pairArr) {
        h.e(pairArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(w(pairArr.length));
        E(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> B(List<? extends T> list) {
        h.e(list, "$this$optimizeReadOnlyList");
        int size = list.size();
        if (size == 0) {
            return EmptyList.a;
        }
        if (size != 1) {
            return list;
        }
        return t(list.get(0));
    }

    public static <T> List<T> C(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        h.e(collection, "$this$plus");
        h.e(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        a(arrayList2, iterable);
        return arrayList2;
    }

    public static <T> List<T> D(Collection<? extends T> collection, T t) {
        h.e(collection, "$this$plus");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    public static final <K, V> void E(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairArr) {
        h.e(map, "$this$putAll");
        h.e(pairArr, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairArr) {
            map.put((Object) pair.a(), (Object) pair.b());
        }
    }

    public static <T> boolean F(Collection<? super T> collection, Iterable<? extends T> iterable) {
        Collection<?> collection2;
        h.e(collection, "$this$removeAll");
        h.e(iterable, "elements");
        h.e(iterable, "$this$convertToSetForSetOperationWith");
        h.e(collection, "source");
        if (iterable instanceof Set) {
            collection2 = (Collection) iterable;
        } else if (!(iterable instanceof Collection)) {
            collection2 = O(iterable);
        } else if (collection.size() < 2) {
            collection2 = (Collection) iterable;
        } else {
            Collection<?> collection3 = (Collection) iterable;
            collection2 = collection3.size() > 2 && (collection3 instanceof ArrayList) ? O(iterable) : collection3;
        }
        return m.a(collection).removeAll(collection2);
    }

    public static <T> Set<T> G(T t) {
        Set<T> singleton = Collections.singleton(t);
        h.d(singleton, "java.util.Collections.singleton(element)");
        return singleton;
    }

    public static <T> Set<T> H(T... tArr) {
        EmptySet emptySet = EmptySet.a;
        h.e(tArr, "elements");
        if (tArr.length <= 0) {
            return emptySet;
        }
        h.e(tArr, "$this$toSet");
        int length = tArr.length;
        if (length == 0) {
            return emptySet;
        }
        if (length == 1) {
            return G(tArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(w(tArr.length));
        N(tArr, linkedHashSet);
        return linkedHashSet;
    }

    public static char I(char[] cArr) {
        h.e(cArr, "$this$single");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.util.Collection */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> J(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        h.e(iterable, "$this$sortedWith");
        h.e(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return Q(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            if (array != null) {
                h.e(array, "$this$sortWith");
                h.e(comparator, "comparator");
                if (array.length > 1) {
                    Arrays.sort(array, comparator);
                }
                return c(array);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        List<T> V = V(iterable);
        h.e(V, "$this$sortWith");
        h.e(comparator, "comparator");
        if (V.size() <= 1) {
            return V;
        }
        Collections.sort(V, comparator);
        return V;
    }

    public static <T> List<T> K(Iterable<? extends T> iterable, int i) {
        Object obj;
        h.e(iterable, "$this$take");
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(je.q0("Requested element count ", i, " is less than zero.").toString());
        } else if (i == 0) {
            return EmptyList.a;
        } else {
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return Q(iterable);
                }
                if (i == 1) {
                    h.e(iterable, "$this$first");
                    if (iterable instanceof List) {
                        obj = j((List) iterable);
                    } else {
                        Iterator<? extends T> it = iterable.iterator();
                        if (it.hasNext()) {
                            obj = it.next();
                        } else {
                            throw new NoSuchElementException("Collection is empty.");
                        }
                    }
                    return t(obj);
                }
            }
            ArrayList arrayList = new ArrayList(i);
            Iterator<? extends T> it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return B(arrayList);
        }
    }

    public static void L() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final <T, C extends Collection<? super T>> C M(Iterable<? extends T> iterable, C c) {
        h.e(iterable, "$this$toCollection");
        h.e(c, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c.add(it.next());
        }
        return c;
    }

    public static final <T, C extends Collection<? super T>> C N(T[] tArr, C c) {
        h.e(tArr, "$this$toCollection");
        h.e(c, "destination");
        for (T t : tArr) {
            c.add(t);
        }
        return c;
    }

    public static final <T> HashSet<T> O(Iterable<? extends T> iterable) {
        h.e(iterable, "$this$toHashSet");
        HashSet<T> hashSet = new HashSet<>(w(e(iterable, 12)));
        M(iterable, hashSet);
        return hashSet;
    }

    public static int[] P(Collection<Integer> collection) {
        h.e(collection, "$this$toIntArray");
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Integer num : collection) {
            iArr[i] = num.intValue();
            i++;
        }
        return iArr;
    }

    public static <T> List<T> Q(Iterable<? extends T> iterable) {
        h.e(iterable, "$this$toList");
        if (!(iterable instanceof Collection)) {
            return B(V(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return EmptyList.a;
        }
        if (size != 1) {
            return W(collection);
        }
        return t(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static <T> List<T> R(T[] tArr) {
        h.e(tArr, "$this$toList");
        int length = tArr.length;
        if (length == 0) {
            return EmptyList.a;
        }
        if (length == 1) {
            return t(tArr[0]);
        }
        h.e(tArr, "$this$toMutableList");
        h.e(tArr, "$this$asCollection");
        return new ArrayList(new c(tArr, false));
    }

    public static <K, V> Map<K, V> S(Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        EmptyMap emptyMap = EmptyMap.a;
        h.e(iterable, "$this$toMap");
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return emptyMap;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(w(collection.size()));
            T(iterable, linkedHashMap);
            return linkedHashMap;
        }
        return x((Pair) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: M extends java.util.Map<? super K, ? super V> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M T(Iterable<? extends Pair<? extends K, ? extends V>> iterable, M m) {
        h.e(iterable, "$this$toMap");
        h.e(m, "destination");
        h.e(m, "$this$putAll");
        h.e(iterable, "pairs");
        Iterator<? extends Pair<? extends K, ? extends V>> it = iterable.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            m.put(pair.a(), pair.b());
        }
        return m;
    }

    public static <K, V> Map<K, V> U(Map<? extends K, ? extends V> map) {
        h.e(map, "$this$toMap");
        int size = map.size();
        if (size == 0) {
            return EmptyMap.a;
        }
        if (size != 1) {
            return X(map);
        }
        return a0(map);
    }

    public static final <T> List<T> V(Iterable<? extends T> iterable) {
        h.e(iterable, "$this$toMutableList");
        if (iterable instanceof Collection) {
            return W((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        M(iterable, arrayList);
        return arrayList;
    }

    public static <T> List<T> W(Collection<? extends T> collection) {
        h.e(collection, "$this$toMutableList");
        return new ArrayList(collection);
    }

    public static <K, V> Map<K, V> X(Map<? extends K, ? extends V> map) {
        h.e(map, "$this$toMutableMap");
        return new LinkedHashMap(map);
    }

    public static <T> Set<T> Y(Iterable<? extends T> iterable) {
        h.e(iterable, "$this$toMutableSet");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        M(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static <T> Set<T> Z(Iterable<? extends T> iterable) {
        EmptySet emptySet = EmptySet.a;
        h.e(iterable, "$this$toSet");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return emptySet;
            }
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(w(collection.size()));
                M(iterable, linkedHashSet);
                return linkedHashSet;
            }
            return G(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        M(iterable, linkedHashSet2);
        h.e(linkedHashSet2, "$this$optimizeReadOnlySet");
        int size2 = linkedHashSet2.size();
        if (size2 != 0) {
            return size2 != 1 ? linkedHashSet2 : G(linkedHashSet2.iterator().next());
        }
        return emptySet;
    }

    public static <T> boolean a(Collection<? super T> collection, Iterable<? extends T> iterable) {
        h.e(collection, "$this$addAll");
        h.e(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (collection.add((Object) it.next())) {
                z = true;
            }
        }
        return z;
    }

    public static final <K, V> Map<K, V> a0(Map<? extends K, ? extends V> map) {
        h.e(map, "$this$toSingletonMap");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        h.d(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    public static <T> boolean b(Collection<? super T> collection, T[] tArr) {
        h.e(collection, "$this$addAll");
        h.e(tArr, "elements");
        return collection.addAll(c(tArr));
    }

    public static <T> Iterable<h<T>> b0(Iterable<? extends T> iterable) {
        h.e(iterable, "$this$withIndex");
        return new i(new CollectionsKt___CollectionsKt$withIndex$1(iterable));
    }

    public static <T> List<T> c(T[] tArr) {
        h.e(tArr, "$this$asList");
        List<T> asList = Arrays.asList(tArr);
        h.d(asList, "ArraysUtilJVM.asList(this)");
        return asList;
    }

    public static <T> List<List<T>> d(Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        Iterator it;
        h.e(iterable, "$this$chunked");
        h.e(iterable, "$this$windowed");
        int i2 = 1;
        if (!(i > 0 && i > 0)) {
            throw new IllegalArgumentException((i != i ? "Both size " + i + " and step " + i + " must be greater than zero." : je.q0("size ", i, " must be greater than zero.")).toString());
        }
        if (iterable instanceof RandomAccess) {
            List list = (List) iterable;
            int size = list.size();
            int i3 = size / i;
            if (size % i == 0) {
                i2 = 0;
            }
            arrayList = new ArrayList(i3 + i2);
            int i4 = 0;
            while (i4 >= 0 && size > i4) {
                int i5 = size - i4;
                if (i <= i5) {
                    i5 = i;
                }
                ArrayList arrayList2 = new ArrayList(i5);
                for (int i6 = 0; i6 < i5; i6++) {
                    arrayList2.add(list.get(i6 + i4));
                }
                arrayList.add(arrayList2);
                i4 += i;
            }
        } else {
            arrayList = new ArrayList();
            Iterator<? extends T> it2 = iterable.iterator();
            h.e(it2, "iterator");
            if (!it2.hasNext()) {
                it = g.a;
            } else {
                it = kotlin.sequences.h.c(new SlidingWindowKt$windowedIterator$1(i, i, it2, false, true, null));
            }
            while (it.hasNext()) {
                arrayList.add((List) it.next());
            }
        }
        return arrayList;
    }

    public static <T> int e(Iterable<? extends T> iterable, int i) {
        h.e(iterable, "$this$collectionSizeOrDefault");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static <T> boolean f(T[] tArr, T t) {
        int i;
        h.e(tArr, "$this$contains");
        h.e(tArr, "$this$indexOf");
        if (t != null) {
            int length = tArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (h.a(t, tArr[i2])) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
        } else {
            int length2 = tArr.length;
            i = 0;
            while (true) {
                if (i >= length2) {
                    break;
                } else if (tArr[i] == null) {
                    break;
                } else {
                    i++;
                }
            }
        }
        i = -1;
        if (i >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> void h(T[] tArr, T t, int i, int i2) {
        h.e(tArr, "$this$fill");
        Arrays.fill(tArr, i, i2, (Object) null);
    }

    public static <R> List<R> i(Iterable<?> iterable, Class<R> cls) {
        h.e(iterable, "$this$filterIsInstance");
        h.e(cls, "klass");
        ArrayList arrayList = new ArrayList();
        h.e(iterable, "$this$filterIsInstanceTo");
        h.e(arrayList, "destination");
        h.e(cls, "klass");
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static <T> T j(List<? extends T> list) {
        h.e(list, "$this$first");
        if (!list.isEmpty()) {
            return (T) list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T k(T[] tArr) {
        h.e(tArr, "$this$first");
        if (!(tArr.length == 0)) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <T> T l(List<? extends T> list) {
        h.e(list, "$this$firstOrNull");
        if (list.isEmpty()) {
            return null;
        }
        return (T) list.get(0);
    }

    public static <T> int m(List<? extends T> list) {
        h.e(list, "$this$lastIndex");
        return list.size() - 1;
    }

    public static <T> T n(List<? extends T> list, int i) {
        h.e(list, "$this$getOrNull");
        if (i < 0 || i > m(list)) {
            return null;
        }
        return (T) list.get(i);
    }

    public static <K, V> V o(Map<K, ? extends V> map, K k) {
        h.e(map, "$this$getValue");
        h.e(map, "$this$getOrImplicitDefault");
        if (map instanceof l) {
            return (V) ((l) map).c(k);
        }
        V v = (V) map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        throw new NoSuchElementException("Key " + ((Object) k) + " is missing in the map.");
    }

    public static String p(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, nmf nmf, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        String str = (i2 & 16) != 0 ? "..." : null;
        if ((i2 & 32) != 0) {
            nmf = null;
        }
        h.e(iterable, "$this$joinToString");
        h.e(charSequence, "separator");
        h.e(charSequence2, "prefix");
        h.e(charSequence3, "postfix");
        h.e(str, "truncated");
        StringBuilder sb = new StringBuilder();
        h.e(iterable, "$this$joinTo");
        h.e(sb, "buffer");
        h.e(charSequence, "separator");
        h.e(charSequence2, "prefix");
        h.e(charSequence3, "postfix");
        h.e(str, "truncated");
        sb.append(charSequence2);
        int i3 = 0;
        for (Object obj2 : iterable) {
            i3++;
            if (i3 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i3 > i) {
                break;
            }
            e.a(sb, obj2, nmf);
        }
        if (i >= 0 && i3 > i) {
            sb.append((CharSequence) str);
        }
        sb.append(charSequence3);
        String sb2 = sb.toString();
        h.d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static <T> T q(List<? extends T> list) {
        h.e(list, "$this$last");
        if (!list.isEmpty()) {
            return (T) list.get(m(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T r(List<? extends T> list) {
        h.e(list, "$this$lastOrNull");
        if (list.isEmpty()) {
            return null;
        }
        return (T) list.get(list.size() - 1);
    }

    public static <K, V> LinkedHashMap<K, V> s(Pair<? extends K, ? extends V>... pairArr) {
        h.e(pairArr, "pairs");
        LinkedHashMap<K, V> linkedHashMap = new LinkedHashMap<>(w(pairArr.length));
        h.e(pairArr, "$this$toMap");
        h.e(linkedHashMap, "destination");
        E(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static <T> List<T> t(T t) {
        List<T> singletonList = Collections.singletonList(t);
        h.d(singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    public static <T> List<T> u(T... tArr) {
        h.e(tArr, "elements");
        return tArr.length > 0 ? c(tArr) : EmptyList.a;
    }

    public static <T, R> List<R> v(Iterable<? extends T> iterable, nmf<? super T, ? extends R> nmf) {
        h.e(iterable, "$this$map");
        h.e(nmf, "transform");
        ArrayList arrayList = new ArrayList(e(iterable, 10));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(nmf.invoke((Object) it.next()));
        }
        return arrayList;
    }

    public static int w(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> Map<K, V> x(Pair<? extends K, ? extends V> pair) {
        h.e(pair, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(pair.c(), pair.d());
        h.d(singletonMap, "java.util.Collections.si…(pair.first, pair.second)");
        return singletonMap;
    }

    public static <K, V> Map<K, V> y(Pair<? extends K, ? extends V>... pairArr) {
        h.e(pairArr, "pairs");
        if (pairArr.length <= 0) {
            return EmptyMap.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(w(pairArr.length));
        h.e(pairArr, "$this$toMap");
        h.e(linkedHashMap, "destination");
        E(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static <T> List<T> z(T... tArr) {
        h.e(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new c(tArr, true));
    }
}
