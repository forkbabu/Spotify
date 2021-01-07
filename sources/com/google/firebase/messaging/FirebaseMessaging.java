package com.google.firebase.messaging;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.f;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.j;
import com.google.firebase.c;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.e0;
import com.google.firebase.iid.s;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FirebaseMessaging {
    static f d;
    private final Context a;
    private final FirebaseInstanceId b;
    private final g<w> c;

    FirebaseMessaging(c cVar, FirebaseInstanceId firebaseInstanceId, b20 b20, HeartBeatInfo heartBeatInfo, com.google.firebase.installations.g gVar, f fVar) {
        d = fVar;
        this.b = firebaseInstanceId;
        Context g = cVar.g();
        this.a = g;
        e0 e0Var = new e0(g);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new tr("Firebase-Messaging-Topics-Io"));
        int i = w.j;
        g<w> c2 = j.c(scheduledThreadPoolExecutor, new v(g, scheduledThreadPoolExecutor, firebaseInstanceId, e0Var, new s(cVar, e0Var, b20, heartBeatInfo, gVar)));
        this.c = c2;
        c2.i(new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new tr("Firebase-Messaging-Trigger-Topics-Io")), new h(this));
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(c cVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) cVar.f(FirebaseMessaging.class);
        }
        return firebaseMessaging;
    }

    /* access modifiers changed from: package-private */
    public final void a(w wVar) {
        if (this.b.q()) {
            wVar.f();
        }
    }
}
