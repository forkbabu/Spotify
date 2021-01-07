package com.google.android.exoplayer2.util;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

public final class PriorityTaskManager {
    private final Object a = new Object();
    private final PriorityQueue<Integer> b = new PriorityQueue<>(10, Collections.reverseOrder());
    private int c = Integer.MIN_VALUE;

    public static class PriorityTooLowException extends IOException {
    }

    public void a(int i) {
        synchronized (this.a) {
            this.b.add(Integer.valueOf(i));
            this.c = Math.max(this.c, i);
        }
    }

    public void b(int i) {
        synchronized (this.a) {
            while (this.c != i) {
                this.a.wait();
            }
        }
    }

    public void c(int i) {
        int i2;
        synchronized (this.a) {
            this.b.remove(Integer.valueOf(i));
            if (this.b.isEmpty()) {
                i2 = Integer.MIN_VALUE;
            } else {
                Integer peek = this.b.peek();
                int i3 = f0.a;
                i2 = peek.intValue();
            }
            this.c = i2;
            this.a.notifyAll();
        }
    }
}
