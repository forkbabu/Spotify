package com.squareup.picasso;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* access modifiers changed from: package-private */
public class d0 {
    final HandlerThread a;
    final f b;
    final Handler c;
    long d;
    long e;
    long f;
    long g;
    long h;
    long i;
    long j;
    long k;
    int l;
    int m;
    int n;

    private static class a extends Handler {
        private final d0 a;

        /* renamed from: com.squareup.picasso.d0$a$a  reason: collision with other inner class name */
        class RunnableC0581a implements Runnable {
            final /* synthetic */ Message a;

            RunnableC0581a(a aVar, Message message) {
                this.a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                StringBuilder V0 = je.V0("Unhandled stats message.");
                V0.append(this.a.what);
                throw new AssertionError(V0.toString());
            }
        }

        a(Looper looper, d0 d0Var) {
            super(looper);
            this.a = d0Var;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.a.d++;
            } else if (i == 1) {
                this.a.e++;
            } else if (i == 2) {
                d0 d0Var = this.a;
                long j = (long) message.arg1;
                int i2 = d0Var.m + 1;
                d0Var.m = i2;
                long j2 = d0Var.g + j;
                d0Var.g = j2;
                d0Var.j = j2 / ((long) i2);
            } else if (i == 3) {
                d0 d0Var2 = this.a;
                long j3 = (long) message.arg1;
                d0Var2.n++;
                long j4 = d0Var2.h + j3;
                d0Var2.h = j4;
                d0Var2.k = j4 / ((long) d0Var2.m);
            } else if (i != 4) {
                Picasso.o.post(new RunnableC0581a(this, message));
            } else {
                d0 d0Var3 = this.a;
                d0Var3.l++;
                long longValue = ((Long) message.obj).longValue() + d0Var3.f;
                d0Var3.f = longValue;
                d0Var3.i = longValue / ((long) d0Var3.l);
            }
        }
    }

    d0(f fVar) {
        this.b = fVar;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.a = handlerThread;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        StringBuilder sb = j0.a;
        i0 i0Var = new i0(looper);
        i0Var.sendMessageDelayed(i0Var.obtainMessage(), 1000);
        this.c = new a(handlerThread.getLooper(), this);
    }

    /* access modifiers changed from: package-private */
    public e0 a() {
        return new e0(this.b.a(), this.b.size(), this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, System.currentTimeMillis());
    }
}
