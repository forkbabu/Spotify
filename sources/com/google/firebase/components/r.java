package com.google.firebase.components;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public class r implements r10, q10 {
    private final Map<Class<?>, ConcurrentHashMap<p10<Object>, Executor>> a = new HashMap();
    private Queue<o10<?>> b = new ArrayDeque();
    private final Executor c;

    r(Executor executor) {
        this.c = executor;
    }

    @Override // defpackage.r10
    public <T> void a(Class<T> cls, p10<? super T> p10) {
        b(cls, this.c, p10);
    }

    @Override // defpackage.r10
    public synchronized <T> void b(Class<T> cls, Executor executor, p10<? super T> p10) {
        cls.getClass();
        p10.getClass();
        executor.getClass();
        if (!this.a.containsKey(cls)) {
            this.a.put(cls, new ConcurrentHashMap<>());
        }
        this.a.get(cls).put(p10, executor);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        Queue<o10<?>> queue;
        Set<Map.Entry<p10<Object>, Executor>> emptySet;
        synchronized (this) {
            queue = this.b;
            if (queue != null) {
                this.b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (o10<?> o10 : queue) {
                o10.getClass();
                synchronized (this) {
                    Queue<o10<?>> queue2 = this.b;
                    if (queue2 != null) {
                        queue2.add(o10);
                    } else {
                        synchronized (this) {
                            ConcurrentHashMap<p10<Object>, Executor> concurrentHashMap = this.a.get(null);
                            emptySet = concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
                        }
                        for (Map.Entry<p10<Object>, Executor> entry : emptySet) {
                            entry.getValue().execute(q.a(entry, o10));
                        }
                    }
                }
            }
        }
    }
}
