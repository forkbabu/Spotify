package com.fasterxml.jackson.core.util;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
public class ThreadLocalBufferManager {
    private final ReferenceQueue<BufferRecycler> _refQueue = new ReferenceQueue<>();
    private final Map<SoftReference<BufferRecycler>, Boolean> _trackedRecyclers = new ConcurrentHashMap();

    /* access modifiers changed from: private */
    public static final class ThreadLocalBufferManagerHolder {
        static final ThreadLocalBufferManager manager = new ThreadLocalBufferManager();
    }

    ThreadLocalBufferManager() {
    }

    public SoftReference<BufferRecycler> wrapAndTrack(BufferRecycler bufferRecycler) {
        SoftReference<BufferRecycler> softReference = new SoftReference<>(bufferRecycler, this._refQueue);
        this._trackedRecyclers.put(softReference, Boolean.TRUE);
        while (true) {
            SoftReference softReference2 = (SoftReference) this._refQueue.poll();
            if (softReference2 == null) {
                return softReference;
            }
            this._trackedRecyclers.remove(softReference2);
        }
    }
}
