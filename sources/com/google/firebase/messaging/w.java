package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.h;
import com.google.android.gms.tasks.j;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.e0;
import com.google.firebase.iid.s;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class w {
    private static final long i = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int j = 0;
    private final FirebaseInstanceId a;
    private final Context b;
    private final e0 c;
    private final s d;
    private final Map<String, ArrayDeque<h<Void>>> e = new m1();
    private final ScheduledExecutorService f;
    private boolean g = false;
    private final u h;

    private w(FirebaseInstanceId firebaseInstanceId, e0 e0Var, u uVar, s sVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.a = firebaseInstanceId;
        this.c = e0Var;
        this.h = uVar;
        this.d = sVar;
        this.b = context;
        this.f = scheduledExecutorService;
    }

    private static <T> T a(g<T> gVar) {
        try {
            return (T) j.b(gVar, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e2);
            }
        } catch (InterruptedException | TimeoutException e3) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e3);
        }
    }

    static boolean b() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
        }
        return true;
    }

    static final /* synthetic */ w c(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseInstanceId firebaseInstanceId, e0 e0Var, s sVar) {
        return new w(firebaseInstanceId, e0Var, u.a(context, scheduledExecutorService), sVar, context, scheduledExecutorService);
    }

    public void d(Runnable runnable, long j2) {
        this.f.schedule(runnable, j2, TimeUnit.SECONDS);
    }

    public synchronized void e(boolean z) {
        this.g = z;
    }

    public void f() {
        boolean z;
        if (this.h.b() != null) {
            synchronized (this) {
                z = this.g;
            }
            if (!z) {
                h(0);
            }
        }
    }

    public boolean g() {
        t b2;
        boolean z;
        while (true) {
            synchronized (this) {
                b2 = this.h.b();
                z = true;
                if (b2 == null) {
                    b();
                    return true;
                }
            }
            try {
                String b3 = b2.b();
                char c2 = 65535;
                int hashCode = b3.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85) {
                        if (b3.equals("U")) {
                            c2 = 1;
                        }
                    }
                } else if (b3.equals("S")) {
                    c2 = 0;
                }
                if (c2 == 0) {
                    String c3 = b2.c();
                    com.google.firebase.iid.w wVar = (com.google.firebase.iid.w) a(this.a.l());
                    a(this.d.d(wVar.getId(), wVar.getToken(), c3));
                    if (b()) {
                        String.valueOf(b2.c()).length();
                    }
                } else if (c2 == 1) {
                    String c4 = b2.c();
                    com.google.firebase.iid.w wVar2 = (com.google.firebase.iid.w) a(this.a.l());
                    a(this.d.e(wVar2.getId(), wVar2.getToken(), c4));
                    if (b()) {
                        String.valueOf(b2.c()).length();
                    }
                } else if (b()) {
                    String.valueOf(b2).length();
                }
            } catch (IOException e2) {
                if ("SERVICE_NOT_AVAILABLE".equals(e2.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e2.getMessage())) {
                    String message = e2.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 53);
                    sb.append("Topic operation failed: ");
                    sb.append(message);
                    sb.append(". Will retry Topic operation.");
                    Log.e("FirebaseMessaging", sb.toString());
                } else if (e2.getMessage() == null) {
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                } else {
                    throw e2;
                }
                z = false;
            }
            if (!z) {
                return false;
            }
            this.h.c(b2);
            synchronized (this.e) {
                String d2 = b2.d();
                if (this.e.containsKey(d2)) {
                    ArrayDeque<h<Void>> arrayDeque = this.e.get(d2);
                    h<Void> poll = arrayDeque.poll();
                    if (poll != null) {
                        poll.c(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.e.remove(d2);
                    }
                }
            }
        }
    }

    public void h(long j2) {
        this.f.schedule(new x(this, this.b, this.c, Math.min(Math.max(30L, j2 << 1), i)), j2, TimeUnit.SECONDS);
        e(true);
    }
}
