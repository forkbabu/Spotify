package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.tasks.g;
import java.util.Map;
import java.util.concurrent.Executor;

class i0 {
    private final Executor a;
    private final Map<Pair<String, String>, g<w>> b = new m1();

    interface a {
    }

    i0(Executor executor) {
        this.a = executor;
    }

    /* access modifiers changed from: package-private */
    public synchronized g<w> a(String str, String str2, a aVar) {
        Pair<String, String> pair = new Pair<>(str, str2);
        g<w> gVar = this.b.get(pair);
        if (gVar != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String.valueOf(pair).length();
            }
            return gVar;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String.valueOf(pair).length();
        }
        g<w> l = ((n) aVar).a().l(this.a, new h0(this, pair));
        this.b.put(pair, l);
        return l;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ g b(Pair pair, g gVar) {
        synchronized (this) {
            this.b.remove(pair);
        }
        return gVar;
    }
}
