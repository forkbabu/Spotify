package defpackage;

import com.facebook.internal.logging.ExternalLog;
import com.facebook.internal.logging.a;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: dg  reason: default package */
public class dg implements a {
    private static dg b;
    private static final Integer c = 100;
    private Queue<ExternalLog> a = new LinkedList();

    private dg() {
    }

    public static synchronized dg c() {
        dg dgVar;
        synchronized (dg.class) {
            if (b == null) {
                b = new dg();
            }
            dgVar = b;
        }
        return dgVar;
    }

    public boolean a(Collection<? extends ExternalLog> collection) {
        if (collection != null) {
            this.a.addAll(collection);
        }
        return this.a.size() >= c.intValue();
    }

    public ExternalLog b() {
        return this.a.poll();
    }

    public boolean d() {
        return this.a.isEmpty();
    }
}
