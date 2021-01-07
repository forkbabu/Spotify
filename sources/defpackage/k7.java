package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: k7  reason: default package */
public class k7 {
    private static final Map<String, Lock> e = new HashMap();
    private final File a;
    private final Lock b;
    private final boolean c;
    private FileChannel d;

    public k7(String str, File file, boolean z) {
        Lock lock;
        File file2 = new File(file, je.x0(str, ".lck"));
        this.a = file2;
        String absolutePath = file2.getAbsolutePath();
        Map<String, Lock> map = e;
        synchronized (map) {
            lock = map.get(absolutePath);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(absolutePath, lock);
            }
        }
        this.b = lock;
        this.c = z;
    }

    public void a() {
        this.b.lock();
        if (this.c) {
            try {
                FileChannel channel = new FileOutputStream(this.a).getChannel();
                this.d = channel;
                channel.lock();
            } catch (IOException e2) {
                throw new IllegalStateException("Unable to grab copy lock.", e2);
            }
        }
    }

    public void b() {
        FileChannel fileChannel = this.d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.b.unlock();
    }
}
