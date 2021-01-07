package io.netty.util;

import io.netty.util.internal.PlatformDependent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class DefaultAttributeMap implements f {
    private static final AtomicReferenceFieldUpdater<DefaultAttributeMap, AtomicReferenceArray> b;
    private volatile AtomicReferenceArray<DefaultAttribute<?>> a;

    static {
        AtomicReferenceFieldUpdater<DefaultAttributeMap, AtomicReferenceArray> O = PlatformDependent.O(DefaultAttributeMap.class, "attributes");
        if (O == null) {
            O = AtomicReferenceFieldUpdater.newUpdater(DefaultAttributeMap.class, AtomicReferenceArray.class, "a");
        }
        b = O;
    }

    @Override // io.netty.util.f
    public <T> d<T> O(e<T> eVar) {
        if (eVar != null) {
            AtomicReferenceArray<DefaultAttribute<?>> atomicReferenceArray = this.a;
            if (atomicReferenceArray == null) {
                atomicReferenceArray = new AtomicReferenceArray<>(4);
                if (!b.compareAndSet(this, null, atomicReferenceArray)) {
                    atomicReferenceArray = this.a;
                }
            }
            int g = eVar.g() & 3;
            DefaultAttribute<?> defaultAttribute = atomicReferenceArray.get(g);
            if (defaultAttribute == null) {
                DefaultAttribute<?> defaultAttribute2 = new DefaultAttribute<>();
                DefaultAttribute defaultAttribute3 = new DefaultAttribute(defaultAttribute2, eVar);
                ((DefaultAttribute) defaultAttribute2).next = defaultAttribute3;
                defaultAttribute3.prev = defaultAttribute2;
                if (atomicReferenceArray.compareAndSet(g, null, defaultAttribute2)) {
                    return defaultAttribute3;
                }
                defaultAttribute = atomicReferenceArray.get(g);
            }
            synchronized (defaultAttribute) {
                DefaultAttribute<?> defaultAttribute4 = defaultAttribute;
                while (true) {
                    DefaultAttribute<?> defaultAttribute5 = ((DefaultAttribute) defaultAttribute4).next;
                    if (defaultAttribute5 == null) {
                        DefaultAttribute defaultAttribute6 = new DefaultAttribute(defaultAttribute, eVar);
                        ((DefaultAttribute) defaultAttribute4).next = defaultAttribute6;
                        defaultAttribute6.prev = defaultAttribute4;
                        return defaultAttribute6;
                    } else if (((DefaultAttribute) defaultAttribute5).key == eVar && !((DefaultAttribute) defaultAttribute5).removed) {
                        return defaultAttribute5;
                    } else {
                        defaultAttribute4 = defaultAttribute5;
                    }
                }
            }
        } else {
            throw new NullPointerException("key");
        }
    }

    private static final class DefaultAttribute<T> extends AtomicReference<T> implements d<T> {
        private static final long serialVersionUID = -2661411462200283011L;
        private final DefaultAttribute<?> head;
        private final e<T> key;
        private DefaultAttribute<?> next;
        private DefaultAttribute<?> prev;
        private volatile boolean removed;

        DefaultAttribute(DefaultAttribute<?> defaultAttribute, e<T> eVar) {
            this.head = defaultAttribute;
            this.key = eVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: io.netty.util.DefaultAttributeMap$DefaultAttribute<T> */
        /* JADX WARN: Multi-variable type inference failed */
        DefaultAttribute() {
            this.head = this;
            this.key = null;
        }
    }
}
