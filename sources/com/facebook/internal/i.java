package com.facebook.internal;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.k;
import java.util.Iterator;
import java.util.List;

public abstract class i<CONTENT, RESULT> {
    protected static final Object e = new Object();
    private final Activity a;
    private final q b;
    private List<i<CONTENT, RESULT>.a> c;
    private int d;

    /* access modifiers changed from: protected */
    public abstract class a {
        protected a(i iVar) {
        }

        /* JADX WARN: Failed to parse method signature: (TCONTENTZ)Z */
        public abstract boolean a(Object obj, boolean z);

        /* JADX WARN: Failed to parse method signature: (TCONTENT)Lcom/facebook/internal/a; */
        public abstract a b(Object obj);

        public Object c() {
            return i.e;
        }
    }

    protected i(Activity activity, int i) {
        h0.f(activity, "activity");
        this.a = activity;
        this.b = null;
        this.d = i;
    }

    public boolean a(CONTENT content) {
        return b(content, e);
    }

    /* access modifiers changed from: protected */
    public boolean b(CONTENT content, Object obj) {
        boolean z = obj == e;
        if (this.c == null) {
            this.c = e();
        }
        for (i<CONTENT, RESULT>.a aVar : this.c) {
            if ((z || f0.b(aVar.c(), obj)) && aVar.a(content, false)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract a c();

    /* access modifiers changed from: protected */
    public Activity d() {
        Activity activity = this.a;
        if (activity != null) {
            return activity;
        }
        q qVar = this.b;
        if (qVar != null) {
            return qVar.a();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract List<i<CONTENT, RESULT>.a> e();

    public int f() {
        return this.d;
    }

    public void g(CONTENT content) {
        h(content, e);
    }

    /* access modifiers changed from: protected */
    public void h(CONTENT content, Object obj) {
        boolean z = obj == e;
        a aVar = null;
        if (this.c == null) {
            this.c = e();
        }
        Iterator<i<CONTENT, RESULT>.a> it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            i<CONTENT, RESULT>.a next = it.next();
            if ((z || f0.b(next.c(), obj)) && next.a(content, true)) {
                try {
                    aVar = next.b(content);
                    break;
                } catch (FacebookException e2) {
                    aVar = c();
                    h.e(aVar, e2);
                }
            }
        }
        if (aVar == null) {
            aVar = c();
            h.e(aVar, new FacebookException("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
        }
        if (aVar != null) {
            q qVar = this.b;
            if (qVar != null) {
                qVar.d(aVar.d(), aVar.c());
                aVar.f();
                return;
            }
            this.a.startActivityForResult(aVar.d(), aVar.c());
            aVar.f();
            return;
        }
        Log.e("FacebookDialog", "No code path should ever result in a null appCall");
        boolean z2 = k.n;
    }

    /* access modifiers changed from: protected */
    public void i(Intent intent, int i) {
        Activity activity = this.a;
        String str = null;
        if (activity != null) {
            activity.startActivityForResult(intent, i);
        } else {
            q qVar = this.b;
            if (qVar != null) {
                if (qVar.b() != null) {
                    this.b.b().startActivityForResult(intent, i);
                } else if (this.b.c() != null) {
                    this.b.c().H4(intent, i, null);
                }
            }
            str = "Failed to find Activity or Fragment to startActivityForResult ";
        }
        if (str != null) {
            LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
            getClass().getName();
            int i2 = y.e;
            k.v(loggingBehavior);
        }
    }

    protected i(q qVar, int i) {
        h0.f(qVar, "fragmentWrapper");
        this.b = qVar;
        this.a = null;
        this.d = i;
        if (qVar.a() == null) {
            throw new IllegalArgumentException("Cannot use a fragment that is not attached to an activity");
        }
    }
}
