package com.spotify.libs.instrumentation.performance;

import com.spotify.messages.ViewLoadSequence;
import java.util.ArrayList;
import java.util.List;

public class r {
    private volatile boolean a;
    private final List<ViewLoadSequence> b = new ArrayList();
    private final List<q> c = new ArrayList();

    public void a(q qVar) {
        this.c.add(qVar);
    }

    /* access modifiers changed from: protected */
    public void b(ViewLoadSequence viewLoadSequence) {
        c(viewLoadSequence);
    }

    /* access modifiers changed from: protected */
    public void c(ViewLoadSequence viewLoadSequence) {
        for (q qVar : this.c) {
            qVar.b(viewLoadSequence);
        }
    }

    /* access modifiers changed from: protected */
    public void d(ViewLoadSequence viewLoadSequence) {
        for (q qVar : this.c) {
            qVar.a(viewLoadSequence);
        }
    }

    public synchronized void e(ViewLoadSequence viewLoadSequence) {
        if (this.a) {
            b(viewLoadSequence);
        } else {
            this.b.add(viewLoadSequence);
        }
    }

    public synchronized void f() {
        for (ViewLoadSequence viewLoadSequence : this.b) {
            b(viewLoadSequence);
        }
        this.b.clear();
        this.a = true;
    }

    public synchronized void g() {
        for (q qVar : this.c) {
            qVar.shutdown();
        }
        this.a = false;
    }
}
