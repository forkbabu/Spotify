package com.google.android.gms.cast.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class w {
    protected final b a;
    private final String b;
    private p c;
    private final List<r> d;

    public w(String str, String str2) {
        a.c(str);
        this.b = str;
        b bVar = new b(str2);
        this.a = bVar;
        if (!TextUtils.isEmpty(null)) {
            bVar.h(null);
        }
        this.d = Collections.synchronizedList(new ArrayList());
    }

    public final String a() {
        return this.b;
    }

    public final void b(p pVar) {
        this.c = pVar;
    }

    /* access modifiers changed from: protected */
    public final void c(r rVar) {
        this.d.add(rVar);
    }

    /* access modifiers changed from: protected */
    public final void d(String str, long j, String str2) {
        this.a.getClass();
        p pVar = this.c;
        if (pVar == null) {
            this.a.c("Attempt to send text message without a sink", new Object[0]);
        } else {
            pVar.o(this.b, str, j, null);
        }
    }

    public void e() {
        synchronized (this.d) {
            for (r rVar : this.d) {
                rVar.e();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final List<r> f() {
        return this.d;
    }

    /* access modifiers changed from: protected */
    public final long g() {
        p pVar = this.c;
        if (pVar != null) {
            return pVar.n();
        }
        this.a.c("Attempt to generate requestId without a sink", new Object[0]);
        return 0;
    }
}
