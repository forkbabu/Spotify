package com.google.common.cache;

import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.Ticker;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.AbstractSequentialIterator;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Ints;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
public class LocalCache<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    static final Queue<?> DISCARDING_QUEUE = new AbstractQueue<Object>() {
        /* class com.google.common.cache.LocalCache.AnonymousClass2 */

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return ImmutableSet.of().iterator();
        }

        @Override // java.util.Queue
        public boolean offer(Object obj) {
            return true;
        }

        @Override // java.util.Queue
        public Object peek() {
            return null;
        }

        @Override // java.util.Queue
        public Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return 0;
        }
    };
    static final ValueReference<Object, Object> UNSET = new ValueReference<Object, Object>() {
        /* class com.google.common.cache.LocalCache.AnonymousClass1 */

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<Object, Object> copyFor(ReferenceQueue<Object> referenceQueue, Object obj, ReferenceEntry<Object, Object> referenceEntry) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public Object get() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<Object, Object> getEntry() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 0;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(Object obj) {
        }
    };
    static final Logger logger = Logger.getLogger(LocalCache.class.getName());
    final int concurrencyLevel;
    final EntryFactory entryFactory;
    Set<Map.Entry<K, V>> entrySet;
    final long expireAfterAccessNanos;
    final long expireAfterWriteNanos;
    final AbstractCache$StatsCounter globalStatsCounter;
    final Equivalence<Object> keyEquivalence;
    Set<K> keySet;
    final Strength keyStrength;
    final long maxWeight;
    final RemovalListener<K, V> removalListener;
    final Queue<RemovalNotification<K, V>> removalNotificationQueue;
    final int segmentMask;
    final int segmentShift;
    final Segment<K, V>[] segments;
    final Ticker ticker;
    final Equivalence<Object> valueEquivalence;
    final Strength valueStrength;
    Collection<V> values;
    final Weigher<K, V> weigher;

    abstract class AbstractCacheSet<T> extends AbstractSet<T> {
        final ConcurrentMap<?, ?> map;

        AbstractCacheSet(LocalCache localCache, ConcurrentMap<?, ?> concurrentMap) {
            this.map = concurrentMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.map.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.map.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.map.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return LocalCache.access$200(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <E> E[] toArray(E[] eArr) {
            return (E[]) LocalCache.access$200(this).toArray(eArr);
        }
    }

    static abstract class AbstractReferenceEntry<K, V> implements ReferenceEntry<K, V> {
        AbstractReferenceEntry() {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public K getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNext() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ValueReference<K, V> getValueReference() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(ValueReference<K, V> valueReference) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j) {
            throw new UnsupportedOperationException();
        }
    }

    static final class AccessQueue<K, V> extends AbstractQueue<ReferenceEntry<K, V>> {
        final ReferenceEntry<K, V> head = new AbstractReferenceEntry<K, V>(this) {
            /* class com.google.common.cache.LocalCache.AccessQueue.AnonymousClass1 */
            ReferenceEntry<K, V> nextAccess = this;
            ReferenceEntry<K, V> previousAccess = this;

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public long getAccessTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public ReferenceEntry<K, V> getNextInAccessQueue() {
                return this.nextAccess;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public ReferenceEntry<K, V> getPreviousInAccessQueue() {
                return this.previousAccess;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setAccessTime(long j) {
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
                this.nextAccess = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
                this.previousAccess = referenceEntry;
            }
        };

        AccessQueue() {
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            ReferenceEntry<K, V> nextInAccessQueue = this.head.getNextInAccessQueue();
            while (true) {
                ReferenceEntry<K, V> referenceEntry = this.head;
                if (nextInAccessQueue != referenceEntry) {
                    ReferenceEntry<K, V> nextInAccessQueue2 = nextInAccessQueue.getNextInAccessQueue();
                    Logger logger = LocalCache.logger;
                    NullEntry nullEntry = NullEntry.INSTANCE;
                    nextInAccessQueue.setNextInAccessQueue(nullEntry);
                    nextInAccessQueue.setPreviousInAccessQueue(nullEntry);
                    nextInAccessQueue = nextInAccessQueue2;
                } else {
                    referenceEntry.setNextInAccessQueue(referenceEntry);
                    ReferenceEntry<K, V> referenceEntry2 = this.head;
                    referenceEntry2.setPreviousInAccessQueue(referenceEntry2);
                    return;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((ReferenceEntry) obj).getNextInAccessQueue() != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.head.getNextInAccessQueue() == this.head;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<ReferenceEntry<K, V>> iterator() {
            ReferenceEntry<K, V> nextInAccessQueue = this.head.getNextInAccessQueue();
            if (nextInAccessQueue == this.head) {
                nextInAccessQueue = null;
            }
            return new AbstractSequentialIterator<ReferenceEntry<K, V>>(nextInAccessQueue) {
                /* class com.google.common.cache.LocalCache.AccessQueue.AnonymousClass2 */

                /* access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractSequentialIterator
                public Object computeNext(Object obj) {
                    ReferenceEntry<K, V> nextInAccessQueue = ((ReferenceEntry) obj).getNextInAccessQueue();
                    if (nextInAccessQueue == AccessQueue.this.head) {
                        return null;
                    }
                    return nextInAccessQueue;
                }
            };
        }

        @Override // java.util.Queue
        public boolean offer(Object obj) {
            ReferenceEntry<K, V> referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry<K, V> previousInAccessQueue = referenceEntry.getPreviousInAccessQueue();
            ReferenceEntry<K, V> nextInAccessQueue = referenceEntry.getNextInAccessQueue();
            Logger logger = LocalCache.logger;
            previousInAccessQueue.setNextInAccessQueue(nextInAccessQueue);
            nextInAccessQueue.setPreviousInAccessQueue(previousInAccessQueue);
            ReferenceEntry<K, V> previousInAccessQueue2 = this.head.getPreviousInAccessQueue();
            previousInAccessQueue2.setNextInAccessQueue(referenceEntry);
            referenceEntry.setPreviousInAccessQueue(previousInAccessQueue2);
            ReferenceEntry<K, V> referenceEntry2 = this.head;
            referenceEntry.setNextInAccessQueue(referenceEntry2);
            referenceEntry2.setPreviousInAccessQueue(referenceEntry);
            return true;
        }

        @Override // java.util.Queue
        public Object peek() {
            ReferenceEntry<K, V> nextInAccessQueue = this.head.getNextInAccessQueue();
            if (nextInAccessQueue == this.head) {
                return null;
            }
            return nextInAccessQueue;
        }

        @Override // java.util.Queue
        public Object poll() {
            ReferenceEntry<K, V> nextInAccessQueue = this.head.getNextInAccessQueue();
            if (nextInAccessQueue == this.head) {
                return null;
            }
            remove(nextInAccessQueue);
            return nextInAccessQueue;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry<K, V> previousInAccessQueue = referenceEntry.getPreviousInAccessQueue();
            ReferenceEntry<K, V> nextInAccessQueue = referenceEntry.getNextInAccessQueue();
            Logger logger = LocalCache.logger;
            previousInAccessQueue.setNextInAccessQueue(nextInAccessQueue);
            nextInAccessQueue.setPreviousInAccessQueue(previousInAccessQueue);
            NullEntry nullEntry = NullEntry.INSTANCE;
            referenceEntry.setNextInAccessQueue(nullEntry);
            referenceEntry.setPreviousInAccessQueue(nullEntry);
            return nextInAccessQueue != nullEntry;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i = 0;
            for (ReferenceEntry<K, V> nextInAccessQueue = this.head.getNextInAccessQueue(); nextInAccessQueue != this.head; nextInAccessQueue = nextInAccessQueue.getNextInAccessQueue()) {
                i++;
            }
            return i;
        }
    }

    /* access modifiers changed from: package-private */
    public enum EntryFactory {
        STRONG {
            /* access modifiers changed from: package-private */
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new StrongEntry(k, i, referenceEntry);
            }
        },
        STRONG_ACCESS {
            /* access modifiers changed from: package-private */
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                StrongAccessEntry strongAccessEntry = new StrongAccessEntry(referenceEntry.getKey(), referenceEntry.getHash(), referenceEntry2);
                copyAccessEntry(referenceEntry, strongAccessEntry);
                return strongAccessEntry;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new StrongAccessEntry(k, i, referenceEntry);
            }
        },
        STRONG_WRITE {
            /* access modifiers changed from: package-private */
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                StrongWriteEntry strongWriteEntry = new StrongWriteEntry(referenceEntry.getKey(), referenceEntry.getHash(), referenceEntry2);
                copyWriteEntry(referenceEntry, strongWriteEntry);
                return strongWriteEntry;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new StrongWriteEntry(k, i, referenceEntry);
            }
        },
        STRONG_ACCESS_WRITE {
            /* access modifiers changed from: package-private */
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                StrongAccessWriteEntry strongAccessWriteEntry = new StrongAccessWriteEntry(referenceEntry.getKey(), referenceEntry.getHash(), referenceEntry2);
                copyAccessEntry(referenceEntry, strongAccessWriteEntry);
                copyWriteEntry(referenceEntry, strongAccessWriteEntry);
                return strongAccessWriteEntry;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new StrongAccessWriteEntry(k, i, referenceEntry);
            }
        },
        WEAK {
            /* access modifiers changed from: package-private */
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new WeakEntry(segment.keyReferenceQueue, k, i, referenceEntry);
            }
        },
        WEAK_ACCESS {
            /* access modifiers changed from: package-private */
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> newEntry = newEntry(segment, referenceEntry.getKey(), referenceEntry.getHash(), referenceEntry2);
                copyAccessEntry(referenceEntry, newEntry);
                return newEntry;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new WeakAccessEntry(segment.keyReferenceQueue, k, i, referenceEntry);
            }
        },
        WEAK_WRITE {
            /* access modifiers changed from: package-private */
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> newEntry = newEntry(segment, referenceEntry.getKey(), referenceEntry.getHash(), referenceEntry2);
                copyWriteEntry(referenceEntry, newEntry);
                return newEntry;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new WeakWriteEntry(segment.keyReferenceQueue, k, i, referenceEntry);
            }
        },
        WEAK_ACCESS_WRITE {
            /* access modifiers changed from: package-private */
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> newEntry = newEntry(segment, referenceEntry.getKey(), referenceEntry.getHash(), referenceEntry2);
                copyAccessEntry(referenceEntry, newEntry);
                copyWriteEntry(referenceEntry, newEntry);
                return newEntry;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.common.cache.LocalCache.EntryFactory
            public <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new WeakAccessWriteEntry(segment.keyReferenceQueue, k, i, referenceEntry);
            }
        };
        
        static final EntryFactory[] factories;

        static {
            AnonymousClass1 r0;
            AnonymousClass2 r1;
            AnonymousClass3 r3;
            AnonymousClass4 r5;
            AnonymousClass5 r7;
            AnonymousClass6 r9;
            AnonymousClass7 r11;
            AnonymousClass8 r13;
            factories = new EntryFactory[]{r0, r1, r3, r5, r7, r9, r11, r13};
        }

        EntryFactory(AnonymousClass1 r3) {
        }

        /* access modifiers changed from: package-private */
        public <K, V> void copyAccessEntry(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            referenceEntry2.setAccessTime(referenceEntry.getAccessTime());
            ReferenceEntry<K, V> previousInAccessQueue = referenceEntry.getPreviousInAccessQueue();
            Logger logger = LocalCache.logger;
            previousInAccessQueue.setNextInAccessQueue(referenceEntry2);
            referenceEntry2.setPreviousInAccessQueue(previousInAccessQueue);
            ReferenceEntry<K, V> nextInAccessQueue = referenceEntry.getNextInAccessQueue();
            referenceEntry2.setNextInAccessQueue(nextInAccessQueue);
            nextInAccessQueue.setPreviousInAccessQueue(referenceEntry2);
            NullEntry nullEntry = NullEntry.INSTANCE;
            referenceEntry.setNextInAccessQueue(nullEntry);
            referenceEntry.setPreviousInAccessQueue(nullEntry);
        }

        /* access modifiers changed from: package-private */
        public <K, V> ReferenceEntry<K, V> copyEntry(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            return newEntry(segment, referenceEntry.getKey(), referenceEntry.getHash(), referenceEntry2);
        }

        /* access modifiers changed from: package-private */
        public <K, V> void copyWriteEntry(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            referenceEntry2.setWriteTime(referenceEntry.getWriteTime());
            ReferenceEntry<K, V> previousInWriteQueue = referenceEntry.getPreviousInWriteQueue();
            Logger logger = LocalCache.logger;
            previousInWriteQueue.setNextInWriteQueue(referenceEntry2);
            referenceEntry2.setPreviousInWriteQueue(previousInWriteQueue);
            ReferenceEntry<K, V> nextInWriteQueue = referenceEntry.getNextInWriteQueue();
            referenceEntry2.setNextInWriteQueue(nextInWriteQueue);
            nextInWriteQueue.setPreviousInWriteQueue(referenceEntry2);
            NullEntry nullEntry = NullEntry.INSTANCE;
            referenceEntry.setNextInWriteQueue(nullEntry);
            referenceEntry.setPreviousInWriteQueue(nullEntry);
        }

        /* access modifiers changed from: package-private */
        public abstract <K, V> ReferenceEntry<K, V> newEntry(Segment<K, V> segment, K k, int i, ReferenceEntry<K, V> referenceEntry);
    }

    final class EntryIterator extends LocalCache<K, V>.HashIterator {
        EntryIterator(LocalCache localCache) {
            super();
        }

        @Override // java.util.Iterator
        public Object next() {
            return nextEntry();
        }
    }

    final class EntrySet extends LocalCache<K, V>.AbstractCacheSet {
        EntrySet(ConcurrentMap<?, ?> concurrentMap) {
            super(LocalCache.this, concurrentMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            if ((obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = LocalCache.this.get(key)) != null && LocalCache.this.valueEquivalence.equivalent(entry.getValue(), obj2)) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator(LocalCache.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            if ((obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && LocalCache.this.remove(key, entry.getValue())) {
                return true;
            }
            return false;
        }
    }

    abstract class HashIterator<T> implements Iterator<T> {
        Segment<K, V> currentSegment;
        AtomicReferenceArray<ReferenceEntry<K, V>> currentTable;
        LocalCache<K, V>.WriteThroughEntry lastReturned;
        ReferenceEntry<K, V> nextEntry;
        LocalCache<K, V>.WriteThroughEntry nextExternal;
        int nextSegmentIndex;
        int nextTableIndex = -1;

        HashIterator() {
            this.nextSegmentIndex = LocalCache.this.segments.length - 1;
            advance();
        }

        /* access modifiers changed from: package-private */
        public final void advance() {
            this.nextExternal = null;
            if (!nextInChain() && !nextInTable()) {
                while (true) {
                    int i = this.nextSegmentIndex;
                    if (i >= 0) {
                        Segment<K, V>[] segmentArr = LocalCache.this.segments;
                        this.nextSegmentIndex = i - 1;
                        Segment<K, V> segment = segmentArr[i];
                        this.currentSegment = segment;
                        if (segment.count != 0) {
                            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.currentSegment.table;
                            this.currentTable = atomicReferenceArray;
                            this.nextTableIndex = atomicReferenceArray.length() - 1;
                            if (nextInTable()) {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean advanceTo(ReferenceEntry<K, V> referenceEntry) {
            boolean z;
            try {
                long read = LocalCache.this.ticker.read();
                K key = referenceEntry.getKey();
                LocalCache localCache = LocalCache.this;
                localCache.getClass();
                V v = null;
                if (referenceEntry.getKey() != null) {
                    V v2 = referenceEntry.getValueReference().get();
                    if (v2 != null) {
                        if (!localCache.isExpired(referenceEntry, read)) {
                            v = v2;
                        }
                    }
                }
                if (v != null) {
                    this.nextExternal = new WriteThroughEntry(key, v);
                    z = true;
                } else {
                    z = false;
                }
                return z;
            } finally {
                this.currentSegment.postReadCleanup();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.nextExternal != null;
        }

        /* access modifiers changed from: package-private */
        public LocalCache<K, V>.WriteThroughEntry nextEntry() {
            LocalCache<K, V>.WriteThroughEntry writeThroughEntry = this.nextExternal;
            if (writeThroughEntry != null) {
                this.lastReturned = writeThroughEntry;
                advance();
                return this.lastReturned;
            }
            throw new NoSuchElementException();
        }

        /* access modifiers changed from: package-private */
        public boolean nextInChain() {
            ReferenceEntry<K, V> referenceEntry = this.nextEntry;
            if (referenceEntry == null) {
                return false;
            }
            while (true) {
                this.nextEntry = referenceEntry.getNext();
                ReferenceEntry<K, V> referenceEntry2 = this.nextEntry;
                if (referenceEntry2 == null) {
                    return false;
                }
                if (advanceTo(referenceEntry2)) {
                    return true;
                }
                referenceEntry = this.nextEntry;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean nextInTable() {
            while (true) {
                int i = this.nextTableIndex;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.currentTable;
                this.nextTableIndex = i - 1;
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(i);
                this.nextEntry = referenceEntry;
                if (referenceEntry != null && (advanceTo(referenceEntry) || nextInChain())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            MoreObjects.checkState(this.lastReturned != null);
            LocalCache.this.remove(this.lastReturned.key);
            this.lastReturned = null;
        }
    }

    final class KeyIterator extends LocalCache<K, V>.HashIterator {
        KeyIterator(LocalCache localCache) {
            super();
        }

        @Override // java.util.Iterator
        public K next() {
            return nextEntry().key;
        }
    }

    final class KeySet extends LocalCache<K, V>.AbstractCacheSet {
        KeySet(ConcurrentMap<?, ?> concurrentMap) {
            super(LocalCache.this, concurrentMap);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.map.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<K> iterator() {
            return new KeyIterator(LocalCache.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return this.map.remove(obj) != null;
        }
    }

    /* access modifiers changed from: package-private */
    public static class LocalManualCache<K, V> implements Cache<K, V>, Serializable {
        private static final long serialVersionUID = 1;
        final LocalCache<K, V> localCache;

        LocalManualCache(CacheBuilder<? super K, ? super V> cacheBuilder) {
            this.localCache = new LocalCache<>(cacheBuilder);
        }

        @Override // com.google.common.cache.Cache
        public ConcurrentMap<K, V> asMap() {
            return this.localCache;
        }

        /* access modifiers changed from: package-private */
        public Object writeReplace() {
            return new ManualSerializationProxy(this.localCache);
        }
    }

    static class ManualSerializationProxy<K, V> extends ForwardingCache<K, V> implements Serializable {
        private static final long serialVersionUID = 1;
        final int concurrencyLevel;
        transient Cache<K, V> delegate;
        final long expireAfterAccessNanos;
        final long expireAfterWriteNanos;
        final Equivalence<Object> keyEquivalence;
        final Strength keyStrength;
        final CacheLoader<? super K, V> loader;
        final long maxWeight;
        final RemovalListener<? super K, ? super V> removalListener;
        final Ticker ticker;
        final Equivalence<Object> valueEquivalence;
        final Strength valueStrength;
        final Weigher<K, V> weigher;

        ManualSerializationProxy(LocalCache<K, V> localCache) {
            Strength strength = localCache.keyStrength;
            Strength strength2 = localCache.valueStrength;
            Equivalence<Object> equivalence = localCache.keyEquivalence;
            Equivalence<Object> equivalence2 = localCache.valueEquivalence;
            long j = localCache.expireAfterWriteNanos;
            long j2 = localCache.expireAfterAccessNanos;
            long j3 = localCache.maxWeight;
            Weigher<K, V> weigher2 = localCache.weigher;
            int i = localCache.concurrencyLevel;
            RemovalListener<K, V> removalListener2 = localCache.removalListener;
            Ticker ticker2 = localCache.ticker;
            this.keyStrength = strength;
            this.valueStrength = strength2;
            this.keyEquivalence = equivalence;
            this.valueEquivalence = equivalence2;
            this.expireAfterWriteNanos = j;
            this.expireAfterAccessNanos = j2;
            this.maxWeight = j3;
            this.weigher = weigher2;
            this.concurrencyLevel = i;
            this.removalListener = removalListener2;
            this.ticker = (ticker2 == Ticker.systemTicker() || ticker2 == CacheBuilder.NULL_TICKER) ? null : ticker2;
        }

        /* JADX DEBUG: Type inference failed for r14v2. Raw type applied. Possible types: com.google.common.cache.Cache<K1 extends K, V1 extends V>, com.google.common.cache.Cache<K, V> */
        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            CacheBuilder<Object, Object> newBuilder = CacheBuilder.newBuilder();
            Strength strength = this.keyStrength;
            Strength strength2 = newBuilder.keyStrength;
            boolean z = true;
            MoreObjects.checkState(strength2 == null, "Key strength was already set to %s", strength2);
            strength.getClass();
            newBuilder.keyStrength = strength;
            Strength strength3 = this.valueStrength;
            Strength strength4 = newBuilder.valueStrength;
            MoreObjects.checkState(strength4 == null, "Value strength was already set to %s", strength4);
            strength3.getClass();
            newBuilder.valueStrength = strength3;
            Equivalence<Object> equivalence = this.keyEquivalence;
            Equivalence<Object> equivalence2 = newBuilder.keyEquivalence;
            MoreObjects.checkState(equivalence2 == null, "key equivalence was already set to %s", equivalence2);
            equivalence.getClass();
            newBuilder.keyEquivalence = equivalence;
            Equivalence<Object> equivalence3 = this.valueEquivalence;
            Equivalence<Object> equivalence4 = newBuilder.valueEquivalence;
            MoreObjects.checkState(equivalence4 == null, "value equivalence was already set to %s", equivalence4);
            equivalence3.getClass();
            newBuilder.valueEquivalence = equivalence3;
            int i = this.concurrencyLevel;
            int i2 = newBuilder.concurrencyLevel;
            MoreObjects.checkState(i2 == -1, "concurrency level was already set to %s", i2);
            MoreObjects.checkArgument(i > 0);
            newBuilder.concurrencyLevel = i;
            RemovalListener<? super K, ? super V> removalListener2 = this.removalListener;
            MoreObjects.checkState(newBuilder.removalListener == null);
            removalListener2.getClass();
            newBuilder.removalListener = removalListener2;
            newBuilder.strictParsing = false;
            long j = this.expireAfterWriteNanos;
            if (j > 0) {
                newBuilder.expireAfterWrite(j, TimeUnit.NANOSECONDS);
            }
            long j2 = this.expireAfterAccessNanos;
            if (j2 > 0) {
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long j3 = newBuilder.expireAfterAccessNanos;
                MoreObjects.checkState(j3 == -1, "expireAfterAccess was already set to %s ns", j3);
                MoreObjects.checkArgument(j2 >= 0, "duration cannot be negative: %s %s", j2, timeUnit);
                newBuilder.expireAfterAccessNanos = timeUnit.toNanos(j2);
            }
            Weigher<K, V> weigher2 = this.weigher;
            if (weigher2 != CacheBuilder.OneWeigher.INSTANCE) {
                MoreObjects.checkState(newBuilder.weigher == null);
                if (newBuilder.strictParsing) {
                    long j4 = newBuilder.maximumSize;
                    MoreObjects.checkState(j4 == -1, "weigher can not be combined with maximum size", j4);
                }
                weigher2.getClass();
                newBuilder.weigher = weigher2;
                long j5 = this.maxWeight;
                if (j5 != -1) {
                    long j6 = newBuilder.maximumWeight;
                    MoreObjects.checkState(j6 == -1, "maximum weight was already set to %s", j6);
                    long j7 = newBuilder.maximumSize;
                    MoreObjects.checkState(j7 == -1, "maximum size was already set to %s", j7);
                    newBuilder.maximumWeight = j5;
                    MoreObjects.checkArgument(j5 >= 0, "maximum weight must not be negative");
                }
            } else {
                long j8 = this.maxWeight;
                if (j8 != -1) {
                    long j9 = newBuilder.maximumSize;
                    MoreObjects.checkState(j9 == -1, "maximum size was already set to %s", j9);
                    long j10 = newBuilder.maximumWeight;
                    MoreObjects.checkState(j10 == -1, "maximum weight was already set to %s", j10);
                    MoreObjects.checkState(newBuilder.weigher == null, "maximum size can not be combined with weigher");
                    MoreObjects.checkArgument(j8 >= 0, "maximum size must not be negative");
                    newBuilder.maximumSize = j8;
                }
            }
            Ticker ticker2 = this.ticker;
            if (ticker2 != null) {
                if (newBuilder.ticker != null) {
                    z = false;
                }
                MoreObjects.checkState(z);
                newBuilder.ticker = ticker2;
            }
            this.delegate = (Cache<K1, V1>) newBuilder.build();
        }

        private Object readResolve() {
            return this.delegate;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingObject
        /* renamed from: delegate */
        public Object mo25delegate() {
            return this.delegate;
        }
    }

    /* access modifiers changed from: private */
    public enum NullEntry implements ReferenceEntry<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return 0;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
            return 0;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public Object getKey() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getNext() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getNextInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getNextInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getPreviousInAccessQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<Object, Object> getPreviousInWriteQueue() {
            return this;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ValueReference<Object, Object> getValueReference() {
            return null;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return 0;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<Object, Object> referenceEntry) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(ValueReference<Object, Object> valueReference) {
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j) {
        }
    }

    /* access modifiers changed from: package-private */
    public static class Segment<K, V> extends ReentrantLock {
        final Queue<ReferenceEntry<K, V>> accessQueue;
        volatile int count;
        final ReferenceQueue<K> keyReferenceQueue;
        final LocalCache<K, V> map;
        final long maxSegmentWeight;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();
        final Queue<ReferenceEntry<K, V>> recencyQueue;
        final AbstractCache$StatsCounter statsCounter;
        volatile AtomicReferenceArray<ReferenceEntry<K, V>> table;
        int threshold;
        long totalWeight;
        final ReferenceQueue<V> valueReferenceQueue;
        final Queue<ReferenceEntry<K, V>> writeQueue;

        Segment(LocalCache<K, V> localCache, int i, long j, AbstractCache$StatsCounter abstractCache$StatsCounter) {
            this.map = localCache;
            this.maxSegmentWeight = j;
            abstractCache$StatsCounter.getClass();
            this.statsCounter = abstractCache$StatsCounter;
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = new AtomicReferenceArray<>(i);
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.threshold = length;
            if (!(localCache.weigher != CacheBuilder.OneWeigher.INSTANCE) && ((long) length) == j) {
                this.threshold = length + 1;
            }
            this.table = atomicReferenceArray;
            ReferenceQueue<V> referenceQueue = null;
            this.keyReferenceQueue = localCache.usesKeyReferences() ? new ReferenceQueue<>() : null;
            this.valueReferenceQueue = localCache.usesValueReferences() ? new ReferenceQueue<>() : referenceQueue;
            this.recencyQueue = localCache.usesAccessQueue() ? new ConcurrentLinkedQueue() : (Queue<ReferenceEntry<K, V>>) LocalCache.DISCARDING_QUEUE;
            this.writeQueue = localCache.expiresAfterWrite() ? new WriteQueue() : (Queue<ReferenceEntry<K, V>>) LocalCache.DISCARDING_QUEUE;
            this.accessQueue = localCache.usesAccessQueue() ? new AccessQueue() : (Queue<ReferenceEntry<K, V>>) LocalCache.DISCARDING_QUEUE;
        }

        /* access modifiers changed from: package-private */
        public ReferenceEntry<K, V> copyEntry(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            if (referenceEntry.getKey() == null) {
                return null;
            }
            ValueReference<K, V> valueReference = referenceEntry.getValueReference();
            V v = valueReference.get();
            if (v == null && valueReference.isActive()) {
                return null;
            }
            ReferenceEntry<K, V> copyEntry = this.map.entryFactory.copyEntry(this, referenceEntry, referenceEntry2);
            copyEntry.setValueReference(valueReference.copyFor(this.valueReferenceQueue, v, copyEntry));
            return copyEntry;
        }

        /* access modifiers changed from: package-private */
        public void drainRecencyQueue() {
            while (true) {
                ReferenceEntry<K, V> poll = this.recencyQueue.poll();
                if (poll == null) {
                    return;
                }
                if (this.accessQueue.contains(poll)) {
                    this.accessQueue.add(poll);
                }
            }
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f5, code lost:
            if (r11.isHeldByCurrentThread() == false) goto L_0x0110;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ff, code lost:
            if (r11.isHeldByCurrentThread() == false) goto L_0x0110;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0113, code lost:
            r10 = r10 + 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void drainReferenceQueues() {
            /*
            // Method dump skipped, instructions count: 295
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.Segment.drainReferenceQueues():void");
        }

        /* JADX WARN: Incorrect args count in method signature: (TK;ITV;ILcom/google/common/cache/RemovalCause;)V */
        /* access modifiers changed from: package-private */
        public void enqueueNotification(Object obj, Object obj2, int i, RemovalCause removalCause) {
            this.totalWeight -= (long) i;
            if (removalCause.wasEvicted()) {
                this.statsCounter.recordEviction();
            }
            if (this.map.removalNotificationQueue != LocalCache.DISCARDING_QUEUE) {
                this.map.removalNotificationQueue.offer(RemovalNotification.create(obj, obj2, removalCause));
            }
        }

        /* access modifiers changed from: package-private */
        public void evictEntries(ReferenceEntry<K, V> referenceEntry) {
            RemovalCause removalCause = RemovalCause.SIZE;
            if (this.map.evictsBySize()) {
                drainRecencyQueue();
                if (((long) referenceEntry.getValueReference().getWeight()) <= this.maxSegmentWeight || removeEntry(referenceEntry, referenceEntry.getHash(), removalCause)) {
                    while (this.totalWeight > this.maxSegmentWeight) {
                        for (ReferenceEntry<K, V> referenceEntry2 : this.accessQueue) {
                            if (referenceEntry2.getValueReference().getWeight() > 0) {
                                if (!removeEntry(referenceEntry2, referenceEntry2.getHash(), removalCause)) {
                                    throw new AssertionError();
                                }
                            }
                        }
                        throw new AssertionError();
                    }
                    return;
                }
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: package-private */
        public void expand() {
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                int i = this.count;
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray2 = new AtomicReferenceArray<>(length << 1);
                this.threshold = (atomicReferenceArray2.length() * 3) / 4;
                int length2 = atomicReferenceArray2.length() - 1;
                for (int i2 = 0; i2 < length; i2++) {
                    ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(i2);
                    if (referenceEntry != null) {
                        ReferenceEntry<K, V> next = referenceEntry.getNext();
                        int hash = referenceEntry.getHash() & length2;
                        if (next == null) {
                            atomicReferenceArray2.set(hash, referenceEntry);
                        } else {
                            ReferenceEntry<K, V> referenceEntry2 = referenceEntry;
                            while (next != null) {
                                int hash2 = next.getHash() & length2;
                                if (hash2 != hash) {
                                    referenceEntry2 = next;
                                    hash = hash2;
                                }
                                next = next.getNext();
                            }
                            atomicReferenceArray2.set(hash, referenceEntry2);
                            while (referenceEntry != referenceEntry2) {
                                int hash3 = referenceEntry.getHash() & length2;
                                ReferenceEntry<K, V> copyEntry = copyEntry(referenceEntry, atomicReferenceArray2.get(hash3));
                                if (copyEntry != null) {
                                    atomicReferenceArray2.set(hash3, copyEntry);
                                } else {
                                    removeCollectedEntry(referenceEntry);
                                    i--;
                                }
                                referenceEntry = referenceEntry.getNext();
                            }
                        }
                    }
                }
                this.table = atomicReferenceArray2;
                this.count = i;
            }
        }

        /* access modifiers changed from: package-private */
        public void expireEntries(long j) {
            ReferenceEntry<K, V> peek;
            ReferenceEntry<K, V> peek2;
            RemovalCause removalCause = RemovalCause.EXPIRED;
            drainRecencyQueue();
            do {
                peek = this.writeQueue.peek();
                if (peek == null || !this.map.isExpired(peek, j)) {
                    do {
                        peek2 = this.accessQueue.peek();
                        if (peek2 == null || !this.map.isExpired(peek2, j)) {
                            return;
                        }
                    } while (removeEntry(peek2, peek2.getHash(), removalCause));
                    throw new AssertionError();
                }
            } while (removeEntry(peek, peek.getHash(), removalCause));
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        public ReferenceEntry<K, V> getLiveEntry(Object obj, int i, long j) {
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
            ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i);
            while (true) {
                if (referenceEntry == null) {
                    referenceEntry = null;
                    break;
                }
                if (referenceEntry.getHash() == i) {
                    K key = referenceEntry.getKey();
                    if (key == null) {
                        tryDrainReferenceQueues();
                    } else if (this.map.keyEquivalence.equivalent(obj, key)) {
                        break;
                    }
                }
                referenceEntry = referenceEntry.getNext();
            }
            if (referenceEntry == null) {
                return null;
            }
            if (!this.map.isExpired(referenceEntry, j)) {
                return referenceEntry;
            }
            if (tryLock()) {
                try {
                    expireEntries(j);
                } finally {
                    unlock();
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void postReadCleanup() {
            if ((this.readCount.incrementAndGet() & 63) == 0) {
                runLockedCleanup(this.map.ticker.read());
                runUnlockedCleanup();
            }
        }

        /* access modifiers changed from: package-private */
        public V put(K k, int i, V v, boolean z) {
            int i2;
            lock();
            try {
                long read = this.map.ticker.read();
                runLockedCleanup(read);
                if (this.count + 1 > this.threshold) {
                    expand();
                }
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = i & (atomicReferenceArray.length() - 1);
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry<K, V> referenceEntry2 = referenceEntry;
                while (true) {
                    if (referenceEntry2 == null) {
                        this.modCount++;
                        ReferenceEntry<K, V> newEntry = this.map.entryFactory.newEntry(this, k, i, referenceEntry);
                        setValue(newEntry, k, v, read);
                        atomicReferenceArray.set(length, newEntry);
                        this.count++;
                        evictEntries(newEntry);
                        break;
                    }
                    K key = referenceEntry2.getKey();
                    if (referenceEntry2.getHash() != i || key == null || !this.map.keyEquivalence.equivalent(k, key)) {
                        referenceEntry2 = referenceEntry2.getNext();
                    } else {
                        ValueReference<K, V> valueReference = referenceEntry2.getValueReference();
                        V v2 = valueReference.get();
                        if (v2 == null) {
                            this.modCount++;
                            if (valueReference.isActive()) {
                                enqueueNotification(k, v2, valueReference.getWeight(), RemovalCause.COLLECTED);
                                setValue(referenceEntry2, k, v, read);
                                i2 = this.count;
                            } else {
                                setValue(referenceEntry2, k, v, read);
                                i2 = this.count + 1;
                            }
                            this.count = i2;
                            evictEntries(referenceEntry2);
                        } else {
                            if (z) {
                                if (this.map.expiresAfterAccess()) {
                                    referenceEntry2.setAccessTime(read);
                                }
                                this.accessQueue.add(referenceEntry2);
                            } else {
                                this.modCount++;
                                enqueueNotification(k, v2, valueReference.getWeight(), RemovalCause.REPLACED);
                                setValue(referenceEntry2, k, v, read);
                                evictEntries(referenceEntry2);
                            }
                            unlock();
                            runUnlockedCleanup();
                            return v2;
                        }
                    }
                }
                return null;
            } finally {
                unlock();
                runUnlockedCleanup();
            }
        }

        /* access modifiers changed from: package-private */
        public void removeCollectedEntry(ReferenceEntry<K, V> referenceEntry) {
            K key = referenceEntry.getKey();
            referenceEntry.getHash();
            enqueueNotification(key, referenceEntry.getValueReference().get(), referenceEntry.getValueReference().getWeight(), RemovalCause.COLLECTED);
            this.writeQueue.remove(referenceEntry);
            this.accessQueue.remove(referenceEntry);
        }

        /* access modifiers changed from: package-private */
        public boolean removeEntry(ReferenceEntry<K, V> referenceEntry, int i, RemovalCause removalCause) {
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
            int length = (atomicReferenceArray.length() - 1) & i;
            ReferenceEntry<K, V> referenceEntry2 = atomicReferenceArray.get(length);
            for (ReferenceEntry<K, V> referenceEntry3 = referenceEntry2; referenceEntry3 != null; referenceEntry3 = referenceEntry3.getNext()) {
                if (referenceEntry3 == referenceEntry) {
                    this.modCount++;
                    atomicReferenceArray.set(length, removeValueFromChain(referenceEntry2, referenceEntry3, referenceEntry3.getKey(), i, referenceEntry3.getValueReference().get(), referenceEntry3.getValueReference(), removalCause));
                    this.count--;
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public ReferenceEntry<K, V> removeEntryFromChain(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            int i = this.count;
            ReferenceEntry<K, V> next = referenceEntry2.getNext();
            while (referenceEntry != referenceEntry2) {
                ReferenceEntry<K, V> copyEntry = copyEntry(referenceEntry, next);
                if (copyEntry != null) {
                    next = copyEntry;
                } else {
                    removeCollectedEntry(referenceEntry);
                    i--;
                }
                referenceEntry = referenceEntry.getNext();
            }
            this.count = i;
            return next;
        }

        /* access modifiers changed from: package-private */
        public ReferenceEntry<K, V> removeValueFromChain(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2, K k, int i, V v, ValueReference<K, V> valueReference, RemovalCause removalCause) {
            enqueueNotification(k, v, valueReference.getWeight(), removalCause);
            this.writeQueue.remove(referenceEntry2);
            this.accessQueue.remove(referenceEntry2);
            if (!valueReference.isLoading()) {
                return removeEntryFromChain(referenceEntry, referenceEntry2);
            }
            valueReference.notifyNewValue(null);
            return referenceEntry;
        }

        /* access modifiers changed from: package-private */
        public void runLockedCleanup(long j) {
            if (tryLock()) {
                try {
                    drainReferenceQueues();
                    expireEntries(j);
                    this.readCount.set(0);
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void runUnlockedCleanup() {
            if (!isHeldByCurrentThread()) {
                LocalCache<K, V> localCache = this.map;
                while (true) {
                    RemovalNotification<K, V> poll = localCache.removalNotificationQueue.poll();
                    if (poll != null) {
                        try {
                            localCache.removalListener.onRemoval(poll);
                        } catch (Throwable th) {
                            LocalCache.logger.log(Level.WARNING, "Exception thrown by removal listener", th);
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void setValue(ReferenceEntry<K, V> referenceEntry, K k, V v, long j) {
            ValueReference<K, V> valueReference = referenceEntry.getValueReference();
            int weigh = this.map.weigher.weigh(k, v);
            MoreObjects.checkState(weigh >= 0, "Weights must be non-negative");
            referenceEntry.setValueReference(this.map.valueStrength.referenceValue(this, referenceEntry, v, weigh));
            drainRecencyQueue();
            this.totalWeight += (long) weigh;
            if (this.map.expiresAfterAccess()) {
                referenceEntry.setAccessTime(j);
            }
            if (this.map.recordsWrite()) {
                referenceEntry.setWriteTime(j);
            }
            this.accessQueue.add(referenceEntry);
            this.writeQueue.add(referenceEntry);
            valueReference.notifyNewValue(v);
        }

        /* access modifiers changed from: package-private */
        public void tryDrainReferenceQueues() {
            if (tryLock()) {
                try {
                    drainReferenceQueues();
                } finally {
                    unlock();
                }
            }
        }
    }

    static class SoftValueReference<K, V> extends SoftReference<V> implements ValueReference<K, V> {
        final ReferenceEntry<K, V> entry;

        SoftValueReference(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            super(v, referenceQueue);
            this.entry = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return new SoftValueReference(referenceQueue, v, referenceEntry);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<K, V> getEntry() {
            return this.entry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V v) {
        }
    }

    /* access modifiers changed from: package-private */
    public enum Strength {
        STRONG {
            /* access modifiers changed from: package-private */
            @Override // com.google.common.cache.LocalCache.Strength
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.equals();
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.common.cache.LocalCache.Strength
            public <K, V> ValueReference<K, V> referenceValue(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v, int i) {
                return i == 1 ? new StrongValueReference(v) : new WeightedStrongValueReference(v, i);
            }
        },
        SOFT {
            /* access modifiers changed from: package-private */
            @Override // com.google.common.cache.LocalCache.Strength
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.identity();
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.common.cache.LocalCache.Strength
            public <K, V> ValueReference<K, V> referenceValue(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v, int i) {
                return i == 1 ? new SoftValueReference(segment.valueReferenceQueue, v, referenceEntry) : new WeightedSoftValueReference(segment.valueReferenceQueue, v, referenceEntry, i);
            }
        },
        WEAK {
            /* access modifiers changed from: package-private */
            @Override // com.google.common.cache.LocalCache.Strength
            public Equivalence<Object> defaultEquivalence() {
                return Equivalence.identity();
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.common.cache.LocalCache.Strength
            public <K, V> ValueReference<K, V> referenceValue(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v, int i) {
                return i == 1 ? new WeakValueReference(segment.valueReferenceQueue, v, referenceEntry) : new WeightedWeakValueReference(segment.valueReferenceQueue, v, referenceEntry, i);
            }
        };

        Strength(AnonymousClass1 r3) {
        }

        /* access modifiers changed from: package-private */
        public abstract Equivalence<Object> defaultEquivalence();

        /* access modifiers changed from: package-private */
        public abstract <K, V> ValueReference<K, V> referenceValue(Segment<K, V> segment, ReferenceEntry<K, V> referenceEntry, V v, int i);
    }

    static final class StrongAccessEntry<K, V> extends StrongEntry<K, V> {
        volatile long accessTime = Long.MAX_VALUE;
        ReferenceEntry<K, V> nextAccess;
        ReferenceEntry<K, V> previousAccess;

        StrongAccessEntry(K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(k, i, referenceEntry);
            Logger logger = LocalCache.logger;
            NullEntry nullEntry = NullEntry.INSTANCE;
            this.nextAccess = nullEntry;
            this.previousAccess = nullEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return this.accessTime;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.nextAccess;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.previousAccess;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j) {
            this.accessTime = j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextAccess = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousAccess = referenceEntry;
        }
    }

    static final class StrongAccessWriteEntry<K, V> extends StrongEntry<K, V> {
        volatile long accessTime = Long.MAX_VALUE;
        ReferenceEntry<K, V> nextAccess;
        ReferenceEntry<K, V> nextWrite;
        ReferenceEntry<K, V> previousAccess;
        ReferenceEntry<K, V> previousWrite;
        volatile long writeTime;

        StrongAccessWriteEntry(K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(k, i, referenceEntry);
            Logger logger = LocalCache.logger;
            NullEntry nullEntry = NullEntry.INSTANCE;
            this.nextAccess = nullEntry;
            this.previousAccess = nullEntry;
            this.writeTime = Long.MAX_VALUE;
            this.nextWrite = nullEntry;
            this.previousWrite = nullEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return this.accessTime;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.nextAccess;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.nextWrite;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.previousAccess;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.previousWrite;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return this.writeTime;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j) {
            this.accessTime = j;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextAccess = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextWrite = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousAccess = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousWrite = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j) {
            this.writeTime = j;
        }
    }

    static class StrongEntry<K, V> extends AbstractReferenceEntry<K, V> {
        final int hash;
        final K key;
        final ReferenceEntry<K, V> next;
        volatile ValueReference<K, V> valueReference = ((ValueReference<K, V>) LocalCache.UNSET);

        StrongEntry(K k, int i, ReferenceEntry<K, V> referenceEntry) {
            this.key = k;
            this.hash = i;
            this.next = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public int getHash() {
            return this.hash;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public K getKey() {
            return this.key;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNext() {
            return this.next;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ValueReference<K, V> getValueReference() {
            return this.valueReference;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setValueReference(ValueReference<K, V> valueReference2) {
            this.valueReference = valueReference2;
        }
    }

    static class StrongValueReference<K, V> implements ValueReference<K, V> {
        final V referent;

        StrongValueReference(V v) {
            this.referent = v;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return this;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public V get() {
            return this.referent;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<K, V> getEntry() {
            return null;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V v) {
        }
    }

    static final class StrongWriteEntry<K, V> extends StrongEntry<K, V> {
        ReferenceEntry<K, V> nextWrite;
        ReferenceEntry<K, V> previousWrite;
        volatile long writeTime = Long.MAX_VALUE;

        StrongWriteEntry(K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(k, i, referenceEntry);
            Logger logger = LocalCache.logger;
            NullEntry nullEntry = NullEntry.INSTANCE;
            this.nextWrite = nullEntry;
            this.previousWrite = nullEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.nextWrite;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.previousWrite;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return this.writeTime;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextWrite = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousWrite = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j) {
            this.writeTime = j;
        }
    }

    final class ValueIterator extends LocalCache<K, V>.HashIterator {
        ValueIterator(LocalCache localCache) {
            super();
        }

        @Override // java.util.Iterator
        public V next() {
            return nextEntry().value;
        }
    }

    /* access modifiers changed from: package-private */
    public interface ValueReference<K, V> {
        ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry);

        V get();

        ReferenceEntry<K, V> getEntry();

        int getWeight();

        boolean isActive();

        boolean isLoading();

        void notifyNewValue(V v);
    }

    final class Values extends AbstractCollection<V> {
        private final ConcurrentMap<?, ?> map;

        Values(ConcurrentMap<?, ?> concurrentMap) {
            this.map = concurrentMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.map.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.map.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.map.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new ValueIterator(LocalCache.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.map.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return LocalCache.access$200(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <E> E[] toArray(E[] eArr) {
            return (E[]) LocalCache.access$200(this).toArray(eArr);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class WeakAccessEntry<K, V> extends WeakEntry<K, V> {
        volatile long accessTime = Long.MAX_VALUE;
        ReferenceEntry<K, V> nextAccess;
        ReferenceEntry<K, V> previousAccess;

        WeakAccessEntry(ReferenceQueue<K> referenceQueue, K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k, i, referenceEntry);
            Logger logger = LocalCache.logger;
            NullEntry nullEntry = NullEntry.INSTANCE;
            this.nextAccess = nullEntry;
            this.previousAccess = nullEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return this.accessTime;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.nextAccess;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.previousAccess;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j) {
            this.accessTime = j;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextAccess = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousAccess = referenceEntry;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class WeakAccessWriteEntry<K, V> extends WeakEntry<K, V> {
        volatile long accessTime = Long.MAX_VALUE;
        ReferenceEntry<K, V> nextAccess;
        ReferenceEntry<K, V> nextWrite;
        ReferenceEntry<K, V> previousAccess;
        ReferenceEntry<K, V> previousWrite;
        volatile long writeTime;

        WeakAccessWriteEntry(ReferenceQueue<K> referenceQueue, K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k, i, referenceEntry);
            Logger logger = LocalCache.logger;
            NullEntry nullEntry = NullEntry.INSTANCE;
            this.nextAccess = nullEntry;
            this.previousAccess = nullEntry;
            this.writeTime = Long.MAX_VALUE;
            this.nextWrite = nullEntry;
            this.previousWrite = nullEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            return this.accessTime;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            return this.nextAccess;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.nextWrite;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            return this.previousAccess;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.previousWrite;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return this.writeTime;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j) {
            this.accessTime = j;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextAccess = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextWrite = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousAccess = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousWrite = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j) {
            this.writeTime = j;
        }
    }

    static class WeakEntry<K, V> extends WeakReference<K> implements ReferenceEntry<K, V> {
        final int hash;
        final ReferenceEntry<K, V> next;
        volatile ValueReference<K, V> valueReference = ((ValueReference<K, V>) LocalCache.UNSET);

        WeakEntry(ReferenceQueue<K> referenceQueue, K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(k, referenceQueue);
            this.hash = i;
            this.next = referenceEntry;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getAccessTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public int getHash() {
            return this.hash;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public K getKey() {
            return (K) get();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNext() {
            return this.next;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInAccessQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public ValueReference<K, V> getValueReference() {
            return this.valueReference;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setAccessTime(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setValueReference(ValueReference<K, V> valueReference2) {
            this.valueReference = valueReference2;
        }

        @Override // com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j) {
            throw new UnsupportedOperationException();
        }
    }

    static class WeakValueReference<K, V> extends WeakReference<V> implements ValueReference<K, V> {
        final ReferenceEntry<K, V> entry;

        WeakValueReference(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            super(v, referenceQueue);
            this.entry = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return new WeakValueReference(referenceQueue, v, referenceEntry);
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public ReferenceEntry<K, V> getEntry() {
            return this.entry;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.LocalCache.ValueReference
        public void notifyNewValue(V v) {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class WeakWriteEntry<K, V> extends WeakEntry<K, V> {
        ReferenceEntry<K, V> nextWrite;
        ReferenceEntry<K, V> previousWrite;
        volatile long writeTime = Long.MAX_VALUE;

        WeakWriteEntry(ReferenceQueue<K> referenceQueue, K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(referenceQueue, k, i, referenceEntry);
            Logger logger = LocalCache.logger;
            NullEntry nullEntry = NullEntry.INSTANCE;
            this.nextWrite = nullEntry;
            this.previousWrite = nullEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getNextInWriteQueue() {
            return this.nextWrite;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public ReferenceEntry<K, V> getPreviousInWriteQueue() {
            return this.previousWrite;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public long getWriteTime() {
            return this.writeTime;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.nextWrite = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
            this.previousWrite = referenceEntry;
        }

        @Override // com.google.common.cache.LocalCache.WeakEntry, com.google.common.cache.ReferenceEntry
        public void setWriteTime(long j) {
            this.writeTime = j;
        }
    }

    static final class WeightedSoftValueReference<K, V> extends SoftValueReference<K, V> {
        final int weight;

        WeightedSoftValueReference(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry, int i) {
            super(referenceQueue, v, referenceEntry);
            this.weight = i;
        }

        @Override // com.google.common.cache.LocalCache.SoftValueReference, com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return new WeightedSoftValueReference(referenceQueue, v, referenceEntry, this.weight);
        }

        @Override // com.google.common.cache.LocalCache.SoftValueReference, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return this.weight;
        }
    }

    static final class WeightedStrongValueReference<K, V> extends StrongValueReference<K, V> {
        final int weight;

        WeightedStrongValueReference(V v, int i) {
            super(v);
            this.weight = i;
        }

        @Override // com.google.common.cache.LocalCache.StrongValueReference, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return this.weight;
        }
    }

    static final class WeightedWeakValueReference<K, V> extends WeakValueReference<K, V> {
        final int weight;

        WeightedWeakValueReference(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry, int i) {
            super(referenceQueue, v, referenceEntry);
            this.weight = i;
        }

        @Override // com.google.common.cache.LocalCache.WeakValueReference, com.google.common.cache.LocalCache.ValueReference
        public ValueReference<K, V> copyFor(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
            return new WeightedWeakValueReference(referenceQueue, v, referenceEntry, this.weight);
        }

        @Override // com.google.common.cache.LocalCache.WeakValueReference, com.google.common.cache.LocalCache.ValueReference
        public int getWeight() {
            return this.weight;
        }
    }

    static final class WriteQueue<K, V> extends AbstractQueue<ReferenceEntry<K, V>> {
        final ReferenceEntry<K, V> head = new AbstractReferenceEntry<K, V>(this) {
            /* class com.google.common.cache.LocalCache.WriteQueue.AnonymousClass1 */
            ReferenceEntry<K, V> nextWrite = this;
            ReferenceEntry<K, V> previousWrite = this;

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public ReferenceEntry<K, V> getNextInWriteQueue() {
                return this.nextWrite;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public ReferenceEntry<K, V> getPreviousInWriteQueue() {
                return this.previousWrite;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public long getWriteTime() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
                this.nextWrite = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry) {
                this.previousWrite = referenceEntry;
            }

            @Override // com.google.common.cache.LocalCache.AbstractReferenceEntry, com.google.common.cache.ReferenceEntry
            public void setWriteTime(long j) {
            }
        };

        WriteQueue() {
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            ReferenceEntry<K, V> nextInWriteQueue = this.head.getNextInWriteQueue();
            while (true) {
                ReferenceEntry<K, V> referenceEntry = this.head;
                if (nextInWriteQueue != referenceEntry) {
                    ReferenceEntry<K, V> nextInWriteQueue2 = nextInWriteQueue.getNextInWriteQueue();
                    Logger logger = LocalCache.logger;
                    NullEntry nullEntry = NullEntry.INSTANCE;
                    nextInWriteQueue.setNextInWriteQueue(nullEntry);
                    nextInWriteQueue.setPreviousInWriteQueue(nullEntry);
                    nextInWriteQueue = nextInWriteQueue2;
                } else {
                    referenceEntry.setNextInWriteQueue(referenceEntry);
                    ReferenceEntry<K, V> referenceEntry2 = this.head;
                    referenceEntry2.setPreviousInWriteQueue(referenceEntry2);
                    return;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ((ReferenceEntry) obj).getNextInWriteQueue() != NullEntry.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.head.getNextInWriteQueue() == this.head;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<ReferenceEntry<K, V>> iterator() {
            ReferenceEntry<K, V> nextInWriteQueue = this.head.getNextInWriteQueue();
            if (nextInWriteQueue == this.head) {
                nextInWriteQueue = null;
            }
            return new AbstractSequentialIterator<ReferenceEntry<K, V>>(nextInWriteQueue) {
                /* class com.google.common.cache.LocalCache.WriteQueue.AnonymousClass2 */

                /* access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractSequentialIterator
                public Object computeNext(Object obj) {
                    ReferenceEntry<K, V> nextInWriteQueue = ((ReferenceEntry) obj).getNextInWriteQueue();
                    if (nextInWriteQueue == WriteQueue.this.head) {
                        return null;
                    }
                    return nextInWriteQueue;
                }
            };
        }

        @Override // java.util.Queue
        public boolean offer(Object obj) {
            ReferenceEntry<K, V> referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry<K, V> previousInWriteQueue = referenceEntry.getPreviousInWriteQueue();
            ReferenceEntry<K, V> nextInWriteQueue = referenceEntry.getNextInWriteQueue();
            Logger logger = LocalCache.logger;
            previousInWriteQueue.setNextInWriteQueue(nextInWriteQueue);
            nextInWriteQueue.setPreviousInWriteQueue(previousInWriteQueue);
            ReferenceEntry<K, V> previousInWriteQueue2 = this.head.getPreviousInWriteQueue();
            previousInWriteQueue2.setNextInWriteQueue(referenceEntry);
            referenceEntry.setPreviousInWriteQueue(previousInWriteQueue2);
            ReferenceEntry<K, V> referenceEntry2 = this.head;
            referenceEntry.setNextInWriteQueue(referenceEntry2);
            referenceEntry2.setPreviousInWriteQueue(referenceEntry);
            return true;
        }

        @Override // java.util.Queue
        public Object peek() {
            ReferenceEntry<K, V> nextInWriteQueue = this.head.getNextInWriteQueue();
            if (nextInWriteQueue == this.head) {
                return null;
            }
            return nextInWriteQueue;
        }

        @Override // java.util.Queue
        public Object poll() {
            ReferenceEntry<K, V> nextInWriteQueue = this.head.getNextInWriteQueue();
            if (nextInWriteQueue == this.head) {
                return null;
            }
            remove(nextInWriteQueue);
            return nextInWriteQueue;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            ReferenceEntry referenceEntry = (ReferenceEntry) obj;
            ReferenceEntry<K, V> previousInWriteQueue = referenceEntry.getPreviousInWriteQueue();
            ReferenceEntry<K, V> nextInWriteQueue = referenceEntry.getNextInWriteQueue();
            Logger logger = LocalCache.logger;
            previousInWriteQueue.setNextInWriteQueue(nextInWriteQueue);
            nextInWriteQueue.setPreviousInWriteQueue(previousInWriteQueue);
            NullEntry nullEntry = NullEntry.INSTANCE;
            referenceEntry.setNextInWriteQueue(nullEntry);
            referenceEntry.setPreviousInWriteQueue(nullEntry);
            return nextInWriteQueue != nullEntry;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i = 0;
            for (ReferenceEntry<K, V> nextInWriteQueue = this.head.getNextInWriteQueue(); nextInWriteQueue != this.head; nextInWriteQueue = nextInWriteQueue.getNextInWriteQueue()) {
                i++;
            }
            return i;
        }
    }

    /* access modifiers changed from: package-private */
    public final class WriteThroughEntry implements Map.Entry<K, V> {
        final K key;
        V value;

        WriteThroughEntry(K k, V v) {
            this.key = k;
            this.value = v;
        }

        @Override // java.util.Map.Entry, java.lang.Object
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!this.key.equals(entry.getKey()) || !this.value.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry, java.lang.Object
        public int hashCode() {
            return this.key.hashCode() ^ this.value.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = (V) LocalCache.this.put(this.key, v);
            this.value = v;
            return v2;
        }

        @Override // java.lang.Object
        public String toString() {
            return ((Object) this.key) + "=" + ((Object) this.value);
        }
    }

    /* JADX WARN: Incorrect args count in method signature: (Lcom/google/common/cache/CacheBuilder<-TK;-TV;>;Lcom/google/common/cache/CacheLoader<-TK;TV;>;)V */
    LocalCache(CacheBuilder cacheBuilder) {
        int i = cacheBuilder.concurrencyLevel;
        char c = 4;
        this.concurrencyLevel = Math.min(i == -1 ? 4 : i, 65536);
        Strength strength = cacheBuilder.keyStrength;
        Strength strength2 = Strength.STRONG;
        Strength strength3 = (Strength) MoreObjects.firstNonNull(strength, strength2);
        this.keyStrength = strength3;
        this.valueStrength = (Strength) MoreObjects.firstNonNull(cacheBuilder.valueStrength, strength2);
        this.keyEquivalence = (Equivalence) MoreObjects.firstNonNull(cacheBuilder.keyEquivalence, ((Strength) MoreObjects.firstNonNull(cacheBuilder.keyStrength, strength2)).defaultEquivalence());
        this.valueEquivalence = (Equivalence) MoreObjects.firstNonNull(cacheBuilder.valueEquivalence, ((Strength) MoreObjects.firstNonNull(cacheBuilder.valueStrength, strength2)).defaultEquivalence());
        long j = 0;
        long j2 = (cacheBuilder.expireAfterWriteNanos == 0 || cacheBuilder.expireAfterAccessNanos == 0) ? 0 : cacheBuilder.weigher == null ? cacheBuilder.maximumSize : cacheBuilder.maximumWeight;
        this.maxWeight = j2;
        Weigher<? super K, ? super V> weigher2 = cacheBuilder.weigher;
        CacheBuilder.OneWeigher oneWeigher = CacheBuilder.OneWeigher.INSTANCE;
        Weigher<K, V> weigher3 = (Weigher) MoreObjects.firstNonNull(weigher2, oneWeigher);
        this.weigher = weigher3;
        long j3 = cacheBuilder.expireAfterAccessNanos;
        this.expireAfterAccessNanos = j3 == -1 ? 0 : j3;
        long j4 = cacheBuilder.expireAfterWriteNanos;
        this.expireAfterWriteNanos = j4 != -1 ? j4 : j;
        RemovalListener<? super K, ? super V> removalListener2 = cacheBuilder.removalListener;
        CacheBuilder.NullListener nullListener = CacheBuilder.NullListener.INSTANCE;
        RemovalListener<K, V> removalListener3 = (RemovalListener) MoreObjects.firstNonNull(removalListener2, nullListener);
        this.removalListener = removalListener3;
        this.removalNotificationQueue = removalListener3 == nullListener ? (Queue<RemovalNotification<K, V>>) DISCARDING_QUEUE : new ConcurrentLinkedQueue();
        int i2 = 1;
        boolean z = recordsWrite() || expiresAfterAccess();
        Ticker ticker2 = cacheBuilder.ticker;
        if (ticker2 == null) {
            ticker2 = z ? Ticker.systemTicker() : CacheBuilder.NULL_TICKER;
        }
        this.ticker = ticker2;
        this.entryFactory = EntryFactory.factories[(strength3 != Strength.WEAK ? 0 : c) | ((usesAccessQueue() || expiresAfterAccess()) ? (char) 1 : 0) | (expiresAfterWrite() || recordsWrite() ? 2 : 0)];
        this.globalStatsCounter = (AbstractCache$StatsCounter) cacheBuilder.statsCounterSupplier.get();
        int min = Math.min(16, 1073741824);
        if (evictsBySize()) {
            if (!(weigher3 != oneWeigher)) {
                min = (int) Math.min((long) min, j2);
            }
        }
        int i3 = 1;
        int i4 = 0;
        while (i3 < this.concurrencyLevel && (!evictsBySize() || ((long) (i3 * 20)) <= this.maxWeight)) {
            i4++;
            i3 <<= 1;
        }
        this.segmentShift = 32 - i4;
        this.segmentMask = i3 - 1;
        this.segments = new Segment[i3];
        int i5 = min / i3;
        while (i2 < (i5 * i3 < min ? i5 + 1 : i5)) {
            i2 <<= 1;
        }
        if (evictsBySize()) {
            long j5 = this.maxWeight;
            long j6 = (long) i3;
            long j7 = j5 % j6;
            long j8 = (j5 / j6) + 1;
            int i6 = 0;
            while (true) {
                Segment<K, V>[] segmentArr = this.segments;
                if (i6 < segmentArr.length) {
                    if (((long) i6) == j7) {
                        j8--;
                    }
                    segmentArr[i6] = new Segment<>(this, i2, j8, (AbstractCache$StatsCounter) cacheBuilder.statsCounterSupplier.get());
                    i6++;
                    j8 = j8;
                } else {
                    return;
                }
            }
        } else {
            int i7 = 0;
            while (true) {
                Segment<K, V>[] segmentArr2 = this.segments;
                if (i7 < segmentArr2.length) {
                    segmentArr2[i7] = new Segment<>(this, i2, -1, (AbstractCache$StatsCounter) cacheBuilder.statsCounterSupplier.get());
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    static ArrayList access$200(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Collections2.addAll(arrayList, collection.iterator());
        return arrayList;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        RemovalCause removalCause;
        Segment<K, V>[] segmentArr = this.segments;
        int length = segmentArr.length;
        for (int i = 0; i < length; i++) {
            Segment<K, V> segment = segmentArr[i];
            if (segment.count != 0) {
                segment.lock();
                try {
                    segment.runLockedCleanup(segment.map.ticker.read());
                    AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = segment.table;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        for (ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(i2); referenceEntry != null; referenceEntry = referenceEntry.getNext()) {
                            if (referenceEntry.getValueReference().isActive()) {
                                K key = referenceEntry.getKey();
                                V v = referenceEntry.getValueReference().get();
                                if (key != null) {
                                    if (v != null) {
                                        removalCause = RemovalCause.EXPLICIT;
                                        referenceEntry.getHash();
                                        segment.enqueueNotification(key, v, referenceEntry.getValueReference().getWeight(), removalCause);
                                    }
                                }
                                removalCause = RemovalCause.COLLECTED;
                                referenceEntry.getHash();
                                segment.enqueueNotification(key, v, referenceEntry.getValueReference().getWeight(), removalCause);
                            }
                        }
                    }
                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                        atomicReferenceArray.set(i3, null);
                    }
                    if (segment.map.usesKeyReferences()) {
                        while (segment.keyReferenceQueue.poll() != null) {
                        }
                    }
                    if (segment.map.usesValueReferences()) {
                        while (segment.valueReferenceQueue.poll() != null) {
                        }
                    }
                    segment.writeQueue.clear();
                    segment.accessQueue.clear();
                    segment.readCount.set(0);
                    segment.modCount++;
                    segment.count = 0;
                } finally {
                    segment.unlock();
                    segment.runUnlockedCleanup();
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int hash = hash(obj);
        Segment<K, V> segmentFor = segmentFor(hash);
        segmentFor.getClass();
        try {
            if (segmentFor.count != 0) {
                ReferenceEntry<K, V> liveEntry = segmentFor.getLiveEntry(obj, hash, segmentFor.map.ticker.read());
                if (liveEntry != null) {
                    if (liveEntry.getValueReference().get() != null) {
                        z = true;
                    }
                }
            }
            return z;
        } finally {
            segmentFor.postReadCleanup();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x007c A[ADDED_TO_REGION, SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean containsValue(java.lang.Object r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = 0
            if (r0 != 0) goto L_0x0008
            return r2
        L_0x0008:
            com.google.common.base.Ticker r3 = r1.ticker
            long r3 = r3.read()
            com.google.common.cache.LocalCache$Segment<K, V>[] r5 = r1.segments
            r6 = -1
            r8 = 0
        L_0x0013:
            r9 = 3
            if (r8 >= r9) goto L_0x00ad
            r9 = 0
            int r11 = r5.length
            r12 = 0
        L_0x001a:
            if (r12 >= r11) goto L_0x009a
            r13 = r5[r12]
            int r14 = r13.count
            java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.ReferenceEntry<K, V>> r14 = r13.table
            r15 = 0
        L_0x0023:
            int r2 = r14.length()
            if (r15 >= r2) goto L_0x008c
            java.lang.Object r2 = r14.get(r15)
            com.google.common.cache.ReferenceEntry r2 = (com.google.common.cache.ReferenceEntry) r2
        L_0x002f:
            if (r2 == 0) goto L_0x0085
            java.lang.Object r16 = r2.getKey()
            r17 = 0
            if (r16 != 0) goto L_0x0041
            r13.tryDrainReferenceQueues()
        L_0x003c:
            r18 = r5
        L_0x003e:
            r5 = r17
            goto L_0x006e
        L_0x0041:
            com.google.common.cache.LocalCache$ValueReference r16 = r2.getValueReference()
            java.lang.Object r16 = r16.get()
            if (r16 != 0) goto L_0x004f
            r13.tryDrainReferenceQueues()
            goto L_0x003c
        L_0x004f:
            r18 = r5
            com.google.common.cache.LocalCache<K, V> r5 = r13.map
            boolean r5 = r5.isExpired(r2, r3)
            if (r5 == 0) goto L_0x006c
            boolean r5 = r13.tryLock()
            if (r5 == 0) goto L_0x003e
            r13.expireEntries(r3)     // Catch:{ all -> 0x0066 }
            r13.unlock()
            goto L_0x003e
        L_0x0066:
            r0 = move-exception
            r2 = r0
            r13.unlock()
            throw r2
        L_0x006c:
            r5 = r16
        L_0x006e:
            r16 = r3
            if (r5 == 0) goto L_0x007c
            com.google.common.base.Equivalence<java.lang.Object> r3 = r1.valueEquivalence
            boolean r3 = r3.equivalent(r0, r5)
            if (r3 == 0) goto L_0x007c
            r0 = 1
            return r0
        L_0x007c:
            com.google.common.cache.ReferenceEntry r2 = r2.getNext()
            r3 = r16
            r5 = r18
            goto L_0x002f
        L_0x0085:
            r16 = r3
            r18 = r5
            int r15 = r15 + 1
            goto L_0x0023
        L_0x008c:
            r16 = r3
            r18 = r5
            int r2 = r13.modCount
            long r2 = (long) r2
            long r9 = r9 + r2
            int r12 = r12 + 1
            r3 = r16
            r2 = 0
            goto L_0x001a
        L_0x009a:
            r16 = r3
            r18 = r5
            int r2 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x00a3
            goto L_0x00ad
        L_0x00a3:
            int r8 = r8 + 1
            r6 = r9
            r3 = r16
            r5 = r18
            r2 = 0
            goto L_0x0013
        L_0x00ad:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LocalCache.containsValue(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        EntrySet entrySet2 = new EntrySet(this);
        this.entrySet = entrySet2;
        return entrySet2;
    }

    /* access modifiers changed from: package-private */
    public boolean evictsBySize() {
        return this.maxWeight >= 0;
    }

    /* access modifiers changed from: package-private */
    public boolean expiresAfterAccess() {
        return this.expireAfterAccessNanos > 0;
    }

    /* access modifiers changed from: package-private */
    public boolean expiresAfterWrite() {
        return this.expireAfterWriteNanos > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int hash = hash(obj);
        Segment<K, V> segmentFor = segmentFor(hash);
        segmentFor.getClass();
        try {
            if (segmentFor.count != 0) {
                long read = segmentFor.map.ticker.read();
                ReferenceEntry<K, V> liveEntry = segmentFor.getLiveEntry(obj, hash, read);
                if (liveEntry != null) {
                    V v = liveEntry.getValueReference().get();
                    if (v != null) {
                        if (segmentFor.map.expiresAfterAccess()) {
                            liveEntry.setAccessTime(read);
                        }
                        segmentFor.recencyQueue.add(liveEntry);
                        liveEntry.getKey();
                        segmentFor.map.getClass();
                        segmentFor.map.getClass();
                        segmentFor.postReadCleanup();
                        return v;
                    }
                    segmentFor.tryDrainReferenceQueues();
                }
            }
            return null;
        } finally {
            segmentFor.postReadCleanup();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    /* access modifiers changed from: package-private */
    public int hash(Object obj) {
        int hash = this.keyEquivalence.hash(obj);
        int i = hash + ((hash << 15) ^ -12931);
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = (i4 << 2) + (i4 << 14) + i4;
        return (i5 >>> 16) ^ i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        Segment<K, V>[] segmentArr = this.segments;
        long j = 0;
        for (int i = 0; i < segmentArr.length; i++) {
            if (segmentArr[i].count != 0) {
                return false;
            }
            j += (long) segmentArr[i].modCount;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < segmentArr.length; i2++) {
            if (segmentArr[i2].count != 0) {
                return false;
            }
            j -= (long) segmentArr[i2].modCount;
        }
        if (j != 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean isExpired(ReferenceEntry<K, V> referenceEntry, long j) {
        referenceEntry.getClass();
        if (expiresAfterAccess() && j - referenceEntry.getAccessTime() >= this.expireAfterAccessNanos) {
            return true;
        }
        if (!expiresAfterWrite() || j - referenceEntry.getWriteTime() < this.expireAfterWriteNanos) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        KeySet keySet2 = new KeySet(this);
        this.keySet = keySet2;
        return keySet2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        k.getClass();
        v.getClass();
        int hash = hash(k);
        return segmentFor(hash).put(k, hash, v, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.common.cache.LocalCache<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k, V v) {
        k.getClass();
        v.getClass();
        int hash = hash(k);
        return segmentFor(hash).put(k, hash, v, true);
    }

    /* access modifiers changed from: package-private */
    public boolean recordsWrite() {
        return expiresAfterWrite();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        RemovalCause removalCause;
        if (obj == null) {
            return null;
        }
        int hash = hash(obj);
        Segment<K, V> segmentFor = segmentFor(hash);
        segmentFor.lock();
        try {
            segmentFor.runLockedCleanup(segmentFor.map.ticker.read());
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = segmentFor.table;
            int length = (atomicReferenceArray.length() - 1) & hash;
            ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
            ReferenceEntry<K, V> referenceEntry2 = referenceEntry;
            while (true) {
                if (referenceEntry2 == null) {
                    break;
                }
                K key = referenceEntry2.getKey();
                if (referenceEntry2.getHash() != hash || key == null || !segmentFor.map.keyEquivalence.equivalent(obj, key)) {
                    referenceEntry2 = referenceEntry2.getNext();
                } else {
                    ValueReference<K, V> valueReference = referenceEntry2.getValueReference();
                    V v = valueReference.get();
                    if (v != null) {
                        removalCause = RemovalCause.EXPLICIT;
                    } else if (valueReference.isActive()) {
                        removalCause = RemovalCause.COLLECTED;
                    }
                    segmentFor.modCount++;
                    atomicReferenceArray.set(length, segmentFor.removeValueFromChain(referenceEntry, referenceEntry2, key, hash, v, valueReference, removalCause));
                    segmentFor.count--;
                    return v;
                }
            }
            segmentFor.unlock();
            segmentFor.runUnlockedCleanup();
            return null;
        } finally {
            segmentFor.unlock();
            segmentFor.runUnlockedCleanup();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k, V v) {
        k.getClass();
        v.getClass();
        int hash = hash(k);
        Segment<K, V> segmentFor = segmentFor(hash);
        segmentFor.lock();
        try {
            long read = segmentFor.map.ticker.read();
            segmentFor.runLockedCleanup(read);
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = segmentFor.table;
            int length = hash & (atomicReferenceArray.length() - 1);
            ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
            ReferenceEntry<K, V> referenceEntry2 = referenceEntry;
            while (true) {
                if (referenceEntry2 == null) {
                    break;
                }
                K key = referenceEntry2.getKey();
                if (referenceEntry2.getHash() != hash || key == null || !segmentFor.map.keyEquivalence.equivalent(k, key)) {
                    referenceEntry2 = referenceEntry2.getNext();
                } else {
                    ValueReference<K, V> valueReference = referenceEntry2.getValueReference();
                    V v2 = valueReference.get();
                    if (v2 != null) {
                        segmentFor.modCount++;
                        segmentFor.enqueueNotification(k, v2, valueReference.getWeight(), RemovalCause.REPLACED);
                        segmentFor.setValue(referenceEntry2, k, v, read);
                        segmentFor.evictEntries(referenceEntry2);
                        segmentFor.unlock();
                        segmentFor.runUnlockedCleanup();
                        return v2;
                    } else if (valueReference.isActive()) {
                        segmentFor.modCount++;
                        atomicReferenceArray.set(length, segmentFor.removeValueFromChain(referenceEntry, referenceEntry2, key, hash, v2, valueReference, RemovalCause.COLLECTED));
                        segmentFor.count--;
                    }
                }
            }
            return null;
        } finally {
            segmentFor.unlock();
            segmentFor.runUnlockedCleanup();
        }
    }

    /* access modifiers changed from: package-private */
    public Segment<K, V> segmentFor(int i) {
        return this.segments[(i >>> this.segmentShift) & this.segmentMask];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Segment<K, V>[] segmentArr;
        long j = 0;
        for (Segment<K, V> segment : this.segments) {
            j += (long) Math.max(0, segment.count);
        }
        return Ints.saturatedCast(j);
    }

    /* access modifiers changed from: package-private */
    public boolean usesAccessQueue() {
        return expiresAfterAccess() || evictsBySize();
    }

    /* access modifiers changed from: package-private */
    public boolean usesKeyReferences() {
        return this.keyStrength != Strength.STRONG;
    }

    /* access modifiers changed from: package-private */
    public boolean usesValueReferences() {
        return this.valueStrength != Strength.STRONG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        Values values2 = new Values(this);
        this.values = values2;
        return values2;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        RemovalCause removalCause;
        boolean z = false;
        if (obj == null || obj2 == null) {
            return false;
        }
        int hash = hash(obj);
        Segment<K, V> segmentFor = segmentFor(hash);
        RemovalCause removalCause2 = RemovalCause.EXPLICIT;
        segmentFor.lock();
        try {
            segmentFor.runLockedCleanup(segmentFor.map.ticker.read());
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = segmentFor.table;
            int length = hash & (atomicReferenceArray.length() - 1);
            ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
            ReferenceEntry<K, V> referenceEntry2 = referenceEntry;
            while (true) {
                if (referenceEntry2 == null) {
                    break;
                }
                K key = referenceEntry2.getKey();
                if (referenceEntry2.getHash() != hash || key == null || !segmentFor.map.keyEquivalence.equivalent(obj, key)) {
                    referenceEntry2 = referenceEntry2.getNext();
                    length = length;
                } else {
                    ValueReference<K, V> valueReference = referenceEntry2.getValueReference();
                    V v = valueReference.get();
                    if (segmentFor.map.valueEquivalence.equivalent(obj2, v)) {
                        removalCause = removalCause2;
                    } else if (v == null && valueReference.isActive()) {
                        removalCause = RemovalCause.COLLECTED;
                    }
                    segmentFor.modCount++;
                    atomicReferenceArray.set(length, segmentFor.removeValueFromChain(referenceEntry, referenceEntry2, key, hash, v, valueReference, removalCause));
                    segmentFor.count--;
                    if (removalCause == removalCause2) {
                        z = true;
                    }
                }
            }
            return z;
        } finally {
            segmentFor.unlock();
            segmentFor.runUnlockedCleanup();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k, V v, V v2) {
        k.getClass();
        v2.getClass();
        if (v == null) {
            return false;
        }
        int hash = hash(k);
        Segment<K, V> segmentFor = segmentFor(hash);
        segmentFor.lock();
        try {
            long read = segmentFor.map.ticker.read();
            segmentFor.runLockedCleanup(read);
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = segmentFor.table;
            int length = hash & (atomicReferenceArray.length() - 1);
            ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(length);
            ReferenceEntry<K, V> referenceEntry2 = referenceEntry;
            while (true) {
                if (referenceEntry2 == null) {
                    break;
                }
                K key = referenceEntry2.getKey();
                if (referenceEntry2.getHash() != hash || key == null || !segmentFor.map.keyEquivalence.equivalent(k, key)) {
                    referenceEntry2 = referenceEntry2.getNext();
                } else {
                    ValueReference<K, V> valueReference = referenceEntry2.getValueReference();
                    V v3 = valueReference.get();
                    if (v3 == null) {
                        if (valueReference.isActive()) {
                            segmentFor.modCount++;
                            atomicReferenceArray.set(length, segmentFor.removeValueFromChain(referenceEntry, referenceEntry2, key, hash, v3, valueReference, RemovalCause.COLLECTED));
                            segmentFor.count--;
                        }
                    } else if (segmentFor.map.valueEquivalence.equivalent(v, v3)) {
                        segmentFor.modCount++;
                        segmentFor.enqueueNotification(k, v3, valueReference.getWeight(), RemovalCause.REPLACED);
                        segmentFor.setValue(referenceEntry2, k, v2, read);
                        segmentFor.evictEntries(referenceEntry2);
                        segmentFor.unlock();
                        segmentFor.runUnlockedCleanup();
                        return true;
                    } else {
                        if (segmentFor.map.expiresAfterAccess()) {
                            referenceEntry2.setAccessTime(read);
                        }
                        segmentFor.accessQueue.add(referenceEntry2);
                    }
                }
            }
            return false;
        } finally {
            segmentFor.unlock();
            segmentFor.runUnlockedCleanup();
        }
    }
}
