package com.github.anrwatchdog;

import android.os.Looper;
import com.github.anrwatchdog.ANRError$$;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class ANRError extends Error {
    private static final long serialVersionUID = 1;
    public final long duration;

    static class a implements Comparator<Thread> {
        final /* synthetic */ Thread a;

        a(Thread thread) {
            this.a = thread;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(Thread thread, Thread thread2) {
            Thread thread3 = thread;
            Thread thread4 = thread2;
            if (thread3 == thread4) {
                return 0;
            }
            Thread thread5 = this.a;
            if (thread3 == thread5) {
                return 1;
            }
            if (thread4 == thread5) {
                return -1;
            }
            return thread4.getName().compareTo(thread3.getName());
        }
    }

    private ANRError(ANRError$$._Thread _thread, long j) {
        super("Application Not Responding for at least " + j + " ms.", _thread);
        this.duration = j;
    }

    static ANRError a(long j, String str, boolean z) {
        Thread thread = Looper.getMainLooper().getThread();
        TreeMap treeMap = new TreeMap(new a(thread));
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            if (entry.getKey() == thread || (entry.getKey().getName().startsWith(str) && (z || entry.getValue().length > 0))) {
                treeMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!treeMap.containsKey(thread)) {
            treeMap.put(thread, thread.getStackTrace());
        }
        ANRError$$._Thread _thread = null;
        for (Map.Entry entry2 : treeMap.entrySet()) {
            _thread = new ANRError$$._Thread(_thread, null);
        }
        return new ANRError(_thread, j);
    }

    static ANRError b(long j) {
        Thread thread = Looper.getMainLooper().getThread();
        return new ANRError(new ANRError$$._Thread(null, null), j);
    }

    private static String c(Thread thread) {
        return thread.getName() + " (state = " + thread.getState() + ")";
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
