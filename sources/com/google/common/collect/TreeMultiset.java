package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Multiset;
import com.google.common.primitives.Ints;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class TreeMultiset<E> extends AbstractSortedMultiset<E> implements Serializable {
    public static final /* synthetic */ int a = 0;
    private static final long serialVersionUID = 1;
    private final transient AvlNode<E> header;
    private final transient GeneralRange<E> range;
    private final transient Reference<AvlNode<E>> rootReference;

    /* access modifiers changed from: private */
    public enum Aggregate {
        SIZE {
            /* access modifiers changed from: package-private */
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public int nodeAggregate(AvlNode<?> avlNode) {
                return ((AvlNode) avlNode).elemCount;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public long treeAggregate(AvlNode<?> avlNode) {
                if (avlNode == null) {
                    return 0;
                }
                return ((AvlNode) avlNode).totalCount;
            }
        },
        DISTINCT {
            /* access modifiers changed from: package-private */
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public int nodeAggregate(AvlNode<?> avlNode) {
                return 1;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            public long treeAggregate(AvlNode<?> avlNode) {
                if (avlNode == null) {
                    return 0;
                }
                return (long) ((AvlNode) avlNode).distinctElements;
            }
        };

        Aggregate(AnonymousClass1 r3) {
        }

        /* access modifiers changed from: package-private */
        public abstract int nodeAggregate(AvlNode<?> avlNode);

        /* access modifiers changed from: package-private */
        public abstract long treeAggregate(AvlNode<?> avlNode);
    }

    /* access modifiers changed from: private */
    public static final class Reference<T> {
        private T value;

        Reference(AnonymousClass1 r1) {
        }

        public void checkAndSet(T t, T t2) {
            if (this.value == t) {
                this.value = t2;
                return;
            }
            throw new ConcurrentModificationException();
        }

        /* access modifiers changed from: package-private */
        public void clear() {
            this.value = null;
        }

        public T get() {
            return this.value;
        }
    }

    TreeMultiset(Reference<AvlNode<E>> reference, GeneralRange<E> generalRange, AvlNode<E> avlNode) {
        super(generalRange.comparator());
        this.rootReference = reference;
        this.range = generalRange;
        this.header = avlNode;
    }

    static AvlNode access$1200(TreeMultiset treeMultiset) {
        AvlNode<E> avlNode;
        if (treeMultiset.rootReference.get() == null) {
            return null;
        }
        if (treeMultiset.range.hasLowerBound()) {
            E lowerEndpoint = treeMultiset.range.getLowerEndpoint();
            avlNode = treeMultiset.rootReference.get().ceiling(treeMultiset.comparator, lowerEndpoint);
            if (avlNode == null) {
                return null;
            }
            if (treeMultiset.range.getLowerBoundType() == BoundType.OPEN && treeMultiset.comparator.compare(lowerEndpoint, avlNode.getElement()) == 0) {
                avlNode = ((AvlNode) avlNode).succ;
            }
        } else {
            avlNode = ((AvlNode) treeMultiset.header).succ;
        }
        if (avlNode == treeMultiset.header || !treeMultiset.range.contains(avlNode.getElement())) {
            return null;
        }
        return avlNode;
    }

    static AvlNode access$1600(TreeMultiset treeMultiset) {
        AvlNode<E> avlNode;
        if (treeMultiset.rootReference.get() == null) {
            return null;
        }
        if (treeMultiset.range.hasUpperBound()) {
            E upperEndpoint = treeMultiset.range.getUpperEndpoint();
            avlNode = treeMultiset.rootReference.get().floor(treeMultiset.comparator, upperEndpoint);
            if (avlNode == null) {
                return null;
            }
            if (treeMultiset.range.getUpperBoundType() == BoundType.OPEN && treeMultiset.comparator.compare(upperEndpoint, avlNode.getElement()) == 0) {
                avlNode = ((AvlNode) avlNode).pred;
            }
        } else {
            avlNode = ((AvlNode) treeMultiset.header).pred;
        }
        if (avlNode == treeMultiset.header || !treeMultiset.range.contains(avlNode.getElement())) {
            return null;
        }
        return avlNode;
    }

    private long aggregateAboveRange(Aggregate aggregate, AvlNode<E> avlNode) {
        long treeAggregate;
        long aggregateAboveRange;
        if (avlNode == null) {
            return 0;
        }
        int compare = this.comparator.compare(this.range.getUpperEndpoint(), (Object) ((AvlNode) avlNode).elem);
        if (compare > 0) {
            return aggregateAboveRange(aggregate, ((AvlNode) avlNode).right);
        }
        if (compare == 0) {
            int ordinal = this.range.getUpperBoundType().ordinal();
            if (ordinal == 0) {
                treeAggregate = (long) aggregate.nodeAggregate(avlNode);
                aggregateAboveRange = aggregate.treeAggregate(((AvlNode) avlNode).right);
            } else if (ordinal == 1) {
                return aggregate.treeAggregate(((AvlNode) avlNode).right);
            } else {
                throw new AssertionError();
            }
        } else {
            treeAggregate = aggregate.treeAggregate(((AvlNode) avlNode).right) + ((long) aggregate.nodeAggregate(avlNode));
            aggregateAboveRange = aggregateAboveRange(aggregate, ((AvlNode) avlNode).left);
        }
        return treeAggregate + aggregateAboveRange;
    }

    private long aggregateBelowRange(Aggregate aggregate, AvlNode<E> avlNode) {
        long treeAggregate;
        long aggregateBelowRange;
        if (avlNode == null) {
            return 0;
        }
        int compare = this.comparator.compare(this.range.getLowerEndpoint(), (Object) ((AvlNode) avlNode).elem);
        if (compare < 0) {
            return aggregateBelowRange(aggregate, ((AvlNode) avlNode).left);
        }
        if (compare == 0) {
            int ordinal = this.range.getLowerBoundType().ordinal();
            if (ordinal == 0) {
                treeAggregate = (long) aggregate.nodeAggregate(avlNode);
                aggregateBelowRange = aggregate.treeAggregate(((AvlNode) avlNode).left);
            } else if (ordinal == 1) {
                return aggregate.treeAggregate(((AvlNode) avlNode).left);
            } else {
                throw new AssertionError();
            }
        } else {
            treeAggregate = aggregate.treeAggregate(((AvlNode) avlNode).left) + ((long) aggregate.nodeAggregate(avlNode));
            aggregateBelowRange = aggregateBelowRange(aggregate, ((AvlNode) avlNode).right);
        }
        return treeAggregate + aggregateBelowRange;
    }

    private long aggregateForEntries(Aggregate aggregate) {
        AvlNode<E> avlNode = this.rootReference.get();
        long treeAggregate = aggregate.treeAggregate(avlNode);
        if (this.range.hasLowerBound()) {
            treeAggregate -= aggregateBelowRange(aggregate, avlNode);
        }
        return this.range.hasUpperBound() ? treeAggregate - aggregateAboveRange(aggregate, avlNode) : treeAggregate;
    }

    public static <E extends Comparable> TreeMultiset<E> create() {
        return new TreeMultiset<>(NaturalOrdering.INSTANCE);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        Collections2.getFieldSetter(AbstractSortedMultiset.class, "comparator").set((Serialization$FieldSetter) this, (Object) comparator);
        Collections2.getFieldSetter(TreeMultiset.class, "range").set((Serialization$FieldSetter) this, (Object) GeneralRange.all(comparator));
        Collections2.getFieldSetter(TreeMultiset.class, "rootReference").set((Serialization$FieldSetter) this, (Object) new Reference(null));
        AvlNode avlNode = new AvlNode(null, 1);
        Collections2.getFieldSetter(TreeMultiset.class, "header").set((Serialization$FieldSetter) this, (Object) avlNode);
        avlNode.succ = avlNode;
        avlNode.pred = avlNode;
        Collections2.populateMultiset(this, objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(super.mo69elementSet().comparator());
        Collections2.writeMultiset(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public int add(E e, int i) {
        Collections2.checkNonnegative(i, "occurrences");
        if (i == 0) {
            return count(e);
        }
        MoreObjects.checkArgument(this.range.contains(e));
        AvlNode<E> avlNode = this.rootReference.get();
        if (avlNode == null) {
            this.comparator.compare(e, e);
            AvlNode<E> avlNode2 = new AvlNode<>(e, i);
            AvlNode<E> avlNode3 = this.header;
            ((AvlNode) avlNode3).succ = avlNode2;
            ((AvlNode) avlNode2).pred = avlNode3;
            ((AvlNode) avlNode2).succ = avlNode3;
            ((AvlNode) avlNode3).pred = avlNode2;
            this.rootReference.checkAndSet(avlNode, avlNode2);
            return 0;
        }
        int[] iArr = new int[1];
        this.rootReference.checkAndSet(avlNode, avlNode.add(this.comparator, e, i, iArr));
        return iArr[0];
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        if (this.range.hasLowerBound() || this.range.hasUpperBound()) {
            Collections2.clear(new Iterator<Multiset.Entry<E>>() {
                /* class com.google.common.collect.TreeMultiset.AnonymousClass2 */
                AvlNode<E> current;
                Multiset.Entry<E> prevEntry;

                {
                    this.current = TreeMultiset.access$1200(TreeMultiset.this);
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    if (this.current == null) {
                        return false;
                    }
                    if (!TreeMultiset.this.range.tooHigh(this.current.getElement())) {
                        return true;
                    }
                    this.current = null;
                    return false;
                }

                @Override // java.util.Iterator
                public Object next() {
                    if (hasNext()) {
                        TreeMultiset treeMultiset = TreeMultiset.this;
                        AvlNode<E> avlNode = this.current;
                        int i = TreeMultiset.a;
                        treeMultiset.getClass();
                        AnonymousClass1 r2 = new Multisets$AbstractEntry<E>(avlNode) {
                            /* class com.google.common.collect.TreeMultiset.AnonymousClass1 */
                            final /* synthetic */ AvlNode val$baseEntry;

                            {
                                this.val$baseEntry = r2;
                            }

                            @Override // com.google.common.collect.Multiset.Entry
                            public int getCount() {
                                int count = this.val$baseEntry.getCount();
                                return count == 0 ? TreeMultiset.this.count(getElement()) : count;
                            }

                            @Override // com.google.common.collect.Multiset.Entry
                            public E getElement() {
                                return (E) this.val$baseEntry.getElement();
                            }
                        };
                        this.prevEntry = r2;
                        if (((AvlNode) this.current).succ == TreeMultiset.this.header) {
                            this.current = null;
                        } else {
                            this.current = ((AvlNode) this.current).succ;
                        }
                        return r2;
                    }
                    throw new NoSuchElementException();
                }

                @Override // java.util.Iterator
                public void remove() {
                    MoreObjects.checkState(this.prevEntry != null, "no calls to next() since the last call to remove()");
                    TreeMultiset.this.setCount(this.prevEntry.getElement(), 0);
                    this.prevEntry = null;
                }
            });
            return;
        }
        AvlNode<E> avlNode = ((AvlNode) this.header).succ;
        while (true) {
            AvlNode<E> avlNode2 = this.header;
            if (avlNode != avlNode2) {
                AvlNode<E> avlNode3 = ((AvlNode) avlNode).succ;
                ((AvlNode) avlNode).elemCount = 0;
                ((AvlNode) avlNode).left = null;
                ((AvlNode) avlNode).right = null;
                ((AvlNode) avlNode).pred = null;
                ((AvlNode) avlNode).succ = null;
                avlNode = avlNode3;
            } else {
                ((AvlNode) avlNode2).succ = avlNode2;
                ((AvlNode) avlNode2).pred = avlNode2;
                this.rootReference.clear();
                return;
            }
        }
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public Comparator comparator() {
        return this.comparator;
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public boolean contains(Object obj) {
        return count(obj) > 0;
    }

    @Override // com.google.common.collect.Multiset
    public int count(Object obj) {
        try {
            AvlNode<E> avlNode = this.rootReference.get();
            if (this.range.contains(obj)) {
                if (avlNode != null) {
                    return avlNode.count(this.comparator, obj);
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractSortedMultiset
    public Iterator<Multiset.Entry<E>> descendingEntryIterator() {
        return new Iterator<Multiset.Entry<E>>() {
            /* class com.google.common.collect.TreeMultiset.AnonymousClass3 */
            AvlNode<E> current;
            Multiset.Entry<E> prevEntry = null;

            {
                this.current = TreeMultiset.access$1600(TreeMultiset.this);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.current == null) {
                    return false;
                }
                if (!TreeMultiset.this.range.tooLow(this.current.getElement())) {
                    return true;
                }
                this.current = null;
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                if (hasNext()) {
                    TreeMultiset treeMultiset = TreeMultiset.this;
                    AvlNode<E> avlNode = this.current;
                    int i = TreeMultiset.a;
                    treeMultiset.getClass();
                    AnonymousClass1 r2 = new Multisets$AbstractEntry<E>(avlNode) {
                        /* class com.google.common.collect.TreeMultiset.AnonymousClass1 */
                        final /* synthetic */ AvlNode val$baseEntry;

                        {
                            this.val$baseEntry = r2;
                        }

                        @Override // com.google.common.collect.Multiset.Entry
                        public int getCount() {
                            int count = this.val$baseEntry.getCount();
                            return count == 0 ? TreeMultiset.this.count(getElement()) : count;
                        }

                        @Override // com.google.common.collect.Multiset.Entry
                        public E getElement() {
                            return (E) this.val$baseEntry.getElement();
                        }
                    };
                    this.prevEntry = r2;
                    if (((AvlNode) this.current).pred == TreeMultiset.this.header) {
                        this.current = null;
                    } else {
                        this.current = ((AvlNode) this.current).pred;
                    }
                    return r2;
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                MoreObjects.checkState(this.prevEntry != null, "no calls to next() since the last call to remove()");
                TreeMultiset.this.setCount(this.prevEntry.getElement(), 0);
                this.prevEntry = null;
            }
        };
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultiset
    public int distinctElements() {
        return Ints.saturatedCast(aggregateForEntries(Aggregate.DISTINCT));
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultiset
    public Iterator<E> elementIterator() {
        return new Multisets$5(new Iterator<Multiset.Entry<E>>() {
            /* class com.google.common.collect.TreeMultiset.AnonymousClass2 */
            AvlNode<E> current;
            Multiset.Entry<E> prevEntry;

            {
                this.current = TreeMultiset.access$1200(TreeMultiset.this);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.current == null) {
                    return false;
                }
                if (!TreeMultiset.this.range.tooHigh(this.current.getElement())) {
                    return true;
                }
                this.current = null;
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                if (hasNext()) {
                    TreeMultiset treeMultiset = TreeMultiset.this;
                    AvlNode<E> avlNode = this.current;
                    int i = TreeMultiset.a;
                    treeMultiset.getClass();
                    AnonymousClass1 r2 = new Multisets$AbstractEntry<E>(avlNode) {
                        /* class com.google.common.collect.TreeMultiset.AnonymousClass1 */
                        final /* synthetic */ AvlNode val$baseEntry;

                        {
                            this.val$baseEntry = r2;
                        }

                        @Override // com.google.common.collect.Multiset.Entry
                        public int getCount() {
                            int count = this.val$baseEntry.getCount();
                            return count == 0 ? TreeMultiset.this.count(getElement()) : count;
                        }

                        @Override // com.google.common.collect.Multiset.Entry
                        public E getElement() {
                            return (E) this.val$baseEntry.getElement();
                        }
                    };
                    this.prevEntry = r2;
                    if (((AvlNode) this.current).succ == TreeMultiset.this.header) {
                        this.current = null;
                    } else {
                        this.current = ((AvlNode) this.current).succ;
                    }
                    return r2;
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                MoreObjects.checkState(this.prevEntry != null, "no calls to next() since the last call to remove()");
                TreeMultiset.this.setCount(this.prevEntry.getElement(), 0);
                this.prevEntry = null;
            }
        });
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultiset
    public Iterator<Multiset.Entry<E>> entryIterator() {
        return new Iterator<Multiset.Entry<E>>() {
            /* class com.google.common.collect.TreeMultiset.AnonymousClass2 */
            AvlNode<E> current;
            Multiset.Entry<E> prevEntry;

            {
                this.current = TreeMultiset.access$1200(TreeMultiset.this);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.current == null) {
                    return false;
                }
                if (!TreeMultiset.this.range.tooHigh(this.current.getElement())) {
                    return true;
                }
                this.current = null;
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                if (hasNext()) {
                    TreeMultiset treeMultiset = TreeMultiset.this;
                    AvlNode<E> avlNode = this.current;
                    int i = TreeMultiset.a;
                    treeMultiset.getClass();
                    AnonymousClass1 r2 = new Multisets$AbstractEntry<E>(avlNode) {
                        /* class com.google.common.collect.TreeMultiset.AnonymousClass1 */
                        final /* synthetic */ AvlNode val$baseEntry;

                        {
                            this.val$baseEntry = r2;
                        }

                        @Override // com.google.common.collect.Multiset.Entry
                        public int getCount() {
                            int count = this.val$baseEntry.getCount();
                            return count == 0 ? TreeMultiset.this.count(getElement()) : count;
                        }

                        @Override // com.google.common.collect.Multiset.Entry
                        public E getElement() {
                            return (E) this.val$baseEntry.getElement();
                        }
                    };
                    this.prevEntry = r2;
                    if (((AvlNode) this.current).succ == TreeMultiset.this.header) {
                        this.current = null;
                    } else {
                        this.current = ((AvlNode) this.current).succ;
                    }
                    return r2;
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                MoreObjects.checkState(this.prevEntry != null, "no calls to next() since the last call to remove()");
                TreeMultiset.this.setCount(this.prevEntry.getElement(), 0);
                this.prevEntry = null;
            }
        };
    }

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: headMultiset */
    public SortedMultiset<E> mo37headMultiset(E e, BoundType boundType) {
        return new TreeMultiset(this.rootReference, this.range.intersect(GeneralRange.upTo(this.comparator, e, boundType)), this.header);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new Multisets$MultisetIteratorImpl(this, entrySet().iterator());
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public int remove(Object obj, int i) {
        Collections2.checkNonnegative(i, "occurrences");
        if (i == 0) {
            return count(obj);
        }
        AvlNode<E> avlNode = this.rootReference.get();
        int[] iArr = new int[1];
        try {
            if (this.range.contains(obj)) {
                if (avlNode != null) {
                    this.rootReference.checkAndSet(avlNode, avlNode.remove(this.comparator, obj, i, iArr));
                    return iArr[0];
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public int setCount(E e, int i) {
        Collections2.checkNonnegative(i, "count");
        boolean z = true;
        if (!this.range.contains(e)) {
            if (i != 0) {
                z = false;
            }
            MoreObjects.checkArgument(z);
            return 0;
        }
        AvlNode<E> avlNode = this.rootReference.get();
        if (avlNode == null) {
            if (i > 0) {
                add(e, i);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.rootReference.checkAndSet(avlNode, avlNode.setCount(this.comparator, e, i, iArr));
        return iArr[0];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return Ints.saturatedCast(aggregateForEntries(Aggregate.SIZE));
    }

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: tailMultiset */
    public SortedMultiset<E> mo38tailMultiset(E e, BoundType boundType) {
        return new TreeMultiset(this.rootReference, this.range.intersect(GeneralRange.downTo(this.comparator, e, boundType)), this.header);
    }

    TreeMultiset(Comparator<? super E> comparator) {
        super(comparator);
        this.range = GeneralRange.all(comparator);
        AvlNode<E> avlNode = new AvlNode<>(null, 1);
        this.header = avlNode;
        ((AvlNode) avlNode).succ = avlNode;
        ((AvlNode) avlNode).pred = avlNode;
        this.rootReference = new Reference<>(null);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public boolean setCount(E e, int i, int i2) {
        Collections2.checkNonnegative(i2, "newCount");
        Collections2.checkNonnegative(i, "oldCount");
        MoreObjects.checkArgument(this.range.contains(e));
        AvlNode<E> avlNode = this.rootReference.get();
        if (avlNode != null) {
            int[] iArr = new int[1];
            this.rootReference.checkAndSet(avlNode, avlNode.setCount(this.comparator, e, i, i2, iArr));
            if (iArr[0] == i) {
                return true;
            }
            return false;
        } else if (i != 0) {
            return false;
        } else {
            if (i2 > 0) {
                add(e, i2);
            }
            return true;
        }
    }

    /* access modifiers changed from: private */
    public static final class AvlNode<E> {
        private int distinctElements;
        private final E elem;
        private int elemCount;
        private int height;
        private AvlNode<E> left;
        private AvlNode<E> pred;
        private AvlNode<E> right;
        private AvlNode<E> succ;
        private long totalCount;

        AvlNode(E e, int i) {
            MoreObjects.checkArgument(i > 0);
            this.elem = e;
            this.elemCount = i;
            this.totalCount = (long) i;
            this.distinctElements = 1;
            this.height = 1;
            this.left = null;
            this.right = null;
        }

        private AvlNode<E> addLeftChild(E e, int i) {
            AvlNode<E> avlNode = new AvlNode<>(e, i);
            this.left = avlNode;
            AvlNode<E> avlNode2 = this.pred;
            int i2 = TreeMultiset.a;
            avlNode2.succ = avlNode;
            avlNode.pred = avlNode2;
            avlNode.succ = this;
            this.pred = avlNode;
            this.height = Math.max(2, this.height);
            this.distinctElements++;
            this.totalCount += (long) i;
            return this;
        }

        private AvlNode<E> addRightChild(E e, int i) {
            AvlNode<E> avlNode = new AvlNode<>(e, i);
            this.right = avlNode;
            AvlNode<E> avlNode2 = this.succ;
            int i2 = TreeMultiset.a;
            this.succ = avlNode;
            avlNode.pred = this;
            avlNode.succ = avlNode2;
            avlNode2.pred = avlNode;
            this.height = Math.max(2, this.height);
            this.distinctElements++;
            this.totalCount += (long) i;
            return this;
        }

        private int balanceFactor() {
            return height(this.left) - height(this.right);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private AvlNode<E> ceiling(Comparator<? super E> comparator, E e) {
            int compare = comparator.compare(e, this.elem);
            if (compare < 0) {
                AvlNode<E> avlNode = this.left;
                return avlNode == null ? this : (AvlNode) MoreObjects.firstNonNull(avlNode.ceiling(comparator, e), this);
            } else if (compare == 0) {
                return this;
            } else {
                AvlNode<E> avlNode2 = this.right;
                if (avlNode2 == null) {
                    return null;
                }
                return avlNode2.ceiling(comparator, e);
            }
        }

        private AvlNode<E> deleteMe() {
            int i = this.elemCount;
            this.elemCount = 0;
            AvlNode<E> avlNode = this.pred;
            AvlNode<E> avlNode2 = this.succ;
            int i2 = TreeMultiset.a;
            avlNode.succ = avlNode2;
            avlNode2.pred = avlNode;
            AvlNode<E> avlNode3 = this.left;
            if (avlNode3 == null) {
                return this.right;
            }
            AvlNode<E> avlNode4 = this.right;
            if (avlNode4 == null) {
                return avlNode3;
            }
            if (avlNode3.height >= avlNode4.height) {
                AvlNode<E> avlNode5 = this.pred;
                avlNode5.left = avlNode3.removeMax(avlNode5);
                avlNode5.right = this.right;
                avlNode5.distinctElements = this.distinctElements - 1;
                avlNode5.totalCount = this.totalCount - ((long) i);
                return avlNode5.rebalance();
            }
            AvlNode<E> avlNode6 = this.succ;
            avlNode6.right = avlNode4.removeMin(avlNode6);
            avlNode6.left = this.left;
            avlNode6.distinctElements = this.distinctElements - 1;
            avlNode6.totalCount = this.totalCount - ((long) i);
            return avlNode6.rebalance();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private AvlNode<E> floor(Comparator<? super E> comparator, E e) {
            int compare = comparator.compare(e, this.elem);
            if (compare > 0) {
                AvlNode<E> avlNode = this.right;
                return avlNode == null ? this : (AvlNode) MoreObjects.firstNonNull(avlNode.floor(comparator, e), this);
            } else if (compare == 0) {
                return this;
            } else {
                AvlNode<E> avlNode2 = this.left;
                if (avlNode2 == null) {
                    return null;
                }
                return avlNode2.floor(comparator, e);
            }
        }

        private static int height(AvlNode<?> avlNode) {
            if (avlNode == null) {
                return 0;
            }
            return ((AvlNode) avlNode).height;
        }

        private AvlNode<E> rebalance() {
            int balanceFactor = balanceFactor();
            if (balanceFactor == -2) {
                if (this.right.balanceFactor() > 0) {
                    this.right = this.right.rotateRight();
                }
                return rotateLeft();
            } else if (balanceFactor != 2) {
                recomputeHeight();
                return this;
            } else {
                if (this.left.balanceFactor() < 0) {
                    this.left = this.left.rotateLeft();
                }
                return rotateRight();
            }
        }

        private void recompute() {
            int i;
            long j;
            AvlNode<E> avlNode = this.left;
            int i2 = TreeMultiset.a;
            int i3 = 0;
            if (avlNode == null) {
                i = 0;
            } else {
                i = avlNode.distinctElements;
            }
            int i4 = i + 1;
            AvlNode<E> avlNode2 = this.right;
            if (avlNode2 != null) {
                i3 = avlNode2.distinctElements;
            }
            this.distinctElements = i4 + i3;
            long j2 = (long) this.elemCount;
            AvlNode<E> avlNode3 = this.left;
            long j3 = 0;
            if (avlNode3 == null) {
                j = 0;
            } else {
                j = avlNode3.totalCount;
            }
            long j4 = j2 + j;
            AvlNode<E> avlNode4 = this.right;
            if (avlNode4 != null) {
                j3 = avlNode4.totalCount;
            }
            this.totalCount = j4 + j3;
            recomputeHeight();
        }

        private void recomputeHeight() {
            this.height = Math.max(height(this.left), height(this.right)) + 1;
        }

        private AvlNode<E> removeMax(AvlNode<E> avlNode) {
            AvlNode<E> avlNode2 = this.right;
            if (avlNode2 == null) {
                return this.left;
            }
            this.right = avlNode2.removeMax(avlNode);
            this.distinctElements--;
            this.totalCount -= (long) avlNode.elemCount;
            return rebalance();
        }

        private AvlNode<E> removeMin(AvlNode<E> avlNode) {
            AvlNode<E> avlNode2 = this.left;
            if (avlNode2 == null) {
                return this.right;
            }
            this.left = avlNode2.removeMin(avlNode);
            this.distinctElements--;
            this.totalCount -= (long) avlNode.elemCount;
            return rebalance();
        }

        private AvlNode<E> rotateLeft() {
            MoreObjects.checkState(this.right != null);
            AvlNode<E> avlNode = this.right;
            this.right = avlNode.left;
            avlNode.left = this;
            avlNode.totalCount = this.totalCount;
            avlNode.distinctElements = this.distinctElements;
            recompute();
            avlNode.recomputeHeight();
            return avlNode;
        }

        private AvlNode<E> rotateRight() {
            MoreObjects.checkState(this.left != null);
            AvlNode<E> avlNode = this.left;
            this.left = avlNode.right;
            avlNode.right = this;
            avlNode.totalCount = this.totalCount;
            avlNode.distinctElements = this.distinctElements;
            recompute();
            avlNode.recomputeHeight();
            return avlNode;
        }

        /* access modifiers changed from: package-private */
        public AvlNode<E> add(Comparator<? super E> comparator, E e, int i, int[] iArr) {
            int compare = comparator.compare(e, this.elem);
            boolean z = true;
            if (compare < 0) {
                AvlNode<E> avlNode = this.left;
                if (avlNode == null) {
                    iArr[0] = 0;
                    addLeftChild(e, i);
                    return this;
                }
                int i2 = avlNode.height;
                AvlNode<E> add = avlNode.add(comparator, e, i, iArr);
                this.left = add;
                if (iArr[0] == 0) {
                    this.distinctElements++;
                }
                this.totalCount += (long) i;
                return add.height == i2 ? this : rebalance();
            } else if (compare > 0) {
                AvlNode<E> avlNode2 = this.right;
                if (avlNode2 == null) {
                    iArr[0] = 0;
                    addRightChild(e, i);
                    return this;
                }
                int i3 = avlNode2.height;
                AvlNode<E> add2 = avlNode2.add(comparator, e, i, iArr);
                this.right = add2;
                if (iArr[0] == 0) {
                    this.distinctElements++;
                }
                this.totalCount += (long) i;
                return add2.height == i3 ? this : rebalance();
            } else {
                int i4 = this.elemCount;
                iArr[0] = i4;
                long j = (long) i;
                if (((long) i4) + j > 2147483647L) {
                    z = false;
                }
                MoreObjects.checkArgument(z);
                this.elemCount += i;
                this.totalCount += j;
                return this;
            }
        }

        public int count(Comparator<? super E> comparator, E e) {
            int compare = comparator.compare(e, this.elem);
            if (compare < 0) {
                AvlNode<E> avlNode = this.left;
                if (avlNode == null) {
                    return 0;
                }
                return avlNode.count(comparator, e);
            } else if (compare <= 0) {
                return this.elemCount;
            } else {
                AvlNode<E> avlNode2 = this.right;
                if (avlNode2 == null) {
                    return 0;
                }
                return avlNode2.count(comparator, e);
            }
        }

        /* access modifiers changed from: package-private */
        public int getCount() {
            return this.elemCount;
        }

        /* access modifiers changed from: package-private */
        public E getElement() {
            return this.elem;
        }

        /* access modifiers changed from: package-private */
        public AvlNode<E> remove(Comparator<? super E> comparator, E e, int i, int[] iArr) {
            int compare = comparator.compare(e, this.elem);
            if (compare < 0) {
                AvlNode<E> avlNode = this.left;
                if (avlNode == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.left = avlNode.remove(comparator, e, i, iArr);
                if (iArr[0] > 0) {
                    if (i >= iArr[0]) {
                        this.distinctElements--;
                        this.totalCount -= (long) iArr[0];
                    } else {
                        this.totalCount -= (long) i;
                    }
                }
                return iArr[0] == 0 ? this : rebalance();
            } else if (compare > 0) {
                AvlNode<E> avlNode2 = this.right;
                if (avlNode2 == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.right = avlNode2.remove(comparator, e, i, iArr);
                if (iArr[0] > 0) {
                    if (i >= iArr[0]) {
                        this.distinctElements--;
                        this.totalCount -= (long) iArr[0];
                    } else {
                        this.totalCount -= (long) i;
                    }
                }
                return rebalance();
            } else {
                int i2 = this.elemCount;
                iArr[0] = i2;
                if (i >= i2) {
                    return deleteMe();
                }
                this.elemCount = i2 - i;
                this.totalCount -= (long) i;
                return this;
            }
        }

        /* access modifiers changed from: package-private */
        public AvlNode<E> setCount(Comparator<? super E> comparator, E e, int i, int[] iArr) {
            int compare = comparator.compare(e, this.elem);
            if (compare < 0) {
                AvlNode<E> avlNode = this.left;
                if (avlNode == null) {
                    iArr[0] = 0;
                    if (i > 0) {
                        addLeftChild(e, i);
                    }
                    return this;
                }
                this.left = avlNode.setCount(comparator, e, i, iArr);
                if (i == 0 && iArr[0] != 0) {
                    this.distinctElements--;
                } else if (i > 0 && iArr[0] == 0) {
                    this.distinctElements++;
                }
                this.totalCount += (long) (i - iArr[0]);
                return rebalance();
            } else if (compare > 0) {
                AvlNode<E> avlNode2 = this.right;
                if (avlNode2 == null) {
                    iArr[0] = 0;
                    if (i > 0) {
                        addRightChild(e, i);
                    }
                    return this;
                }
                this.right = avlNode2.setCount(comparator, e, i, iArr);
                if (i == 0 && iArr[0] != 0) {
                    this.distinctElements--;
                } else if (i > 0 && iArr[0] == 0) {
                    this.distinctElements++;
                }
                this.totalCount += (long) (i - iArr[0]);
                return rebalance();
            } else {
                int i2 = this.elemCount;
                iArr[0] = i2;
                if (i == 0) {
                    return deleteMe();
                }
                this.totalCount += (long) (i - i2);
                this.elemCount = i;
                return this;
            }
        }

        public String toString() {
            return new Multisets$ImmutableEntry(this.elem, this.elemCount).toString();
        }

        /* access modifiers changed from: package-private */
        public AvlNode<E> setCount(Comparator<? super E> comparator, E e, int i, int i2, int[] iArr) {
            int compare = comparator.compare(e, this.elem);
            if (compare < 0) {
                AvlNode<E> avlNode = this.left;
                if (avlNode == null) {
                    iArr[0] = 0;
                    if (i == 0 && i2 > 0) {
                        addLeftChild(e, i2);
                    }
                    return this;
                }
                this.left = avlNode.setCount(comparator, e, i, i2, iArr);
                if (iArr[0] == i) {
                    if (i2 == 0 && iArr[0] != 0) {
                        this.distinctElements--;
                    } else if (i2 > 0 && iArr[0] == 0) {
                        this.distinctElements++;
                    }
                    this.totalCount += (long) (i2 - iArr[0]);
                }
                return rebalance();
            } else if (compare > 0) {
                AvlNode<E> avlNode2 = this.right;
                if (avlNode2 == null) {
                    iArr[0] = 0;
                    if (i == 0 && i2 > 0) {
                        addRightChild(e, i2);
                    }
                    return this;
                }
                this.right = avlNode2.setCount(comparator, e, i, i2, iArr);
                if (iArr[0] == i) {
                    if (i2 == 0 && iArr[0] != 0) {
                        this.distinctElements--;
                    } else if (i2 > 0 && iArr[0] == 0) {
                        this.distinctElements++;
                    }
                    this.totalCount += (long) (i2 - iArr[0]);
                }
                return rebalance();
            } else {
                int i3 = this.elemCount;
                iArr[0] = i3;
                if (i == i3) {
                    if (i2 == 0) {
                        return deleteMe();
                    }
                    this.totalCount += (long) (i2 - i3);
                    this.elemCount = i2;
                }
                return this;
            }
        }
    }
}
