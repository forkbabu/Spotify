package com.spotify.magiclink.setpassword;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.q;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public class o<E> implements q<E> {
    private final BlockingQueue<E> a = new LinkedBlockingQueue();

    @Override // com.spotify.mobius.q
    public w92 a(da2<E> da2) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        Thread thread = new Thread(new b(this, atomicBoolean, da2));
        thread.start();
        return new c(atomicBoolean, thread);
    }

    public /* synthetic */ void b(AtomicBoolean atomicBoolean, da2 da2) {
        while (atomicBoolean.get()) {
            try {
                E take = this.a.take();
                if (atomicBoolean.get()) {
                    da2.accept(take);
                }
            } catch (InterruptedException unused) {
            }
        }
    }

    public synchronized void c(E e) {
        if (!this.a.offer(e)) {
            Logger.d("Failed to add the event to the queue", new Object[0]);
        }
    }
}
