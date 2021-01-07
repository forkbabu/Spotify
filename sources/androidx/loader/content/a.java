package androidx.loader.content;

import android.content.Context;
import android.os.SystemClock;
import androidx.core.os.OperationCanceledException;
import androidx.loader.content.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

public abstract class a<D> extends b<D> {
    private final Executor h;
    volatile a<D>.RunnableC0032a i;
    volatile a<D>.RunnableC0032a j;
    long k = -10000;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.loader.content.a$a  reason: collision with other inner class name */
    public final class RunnableC0032a extends ModernAsyncTask<Void, Void, D> implements Runnable {
        private final CountDownLatch s = new CountDownLatch(1);

        RunnableC0032a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        /* access modifiers changed from: protected */
        @Override // androidx.loader.content.ModernAsyncTask
        public Object b(Void[] voidArr) {
            try {
                return a.this.m();
            } catch (OperationCanceledException e) {
                if (this.f.get()) {
                    return null;
                }
                throw e;
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.loader.content.ModernAsyncTask
        public void e(D d) {
            try {
                a aVar = a.this;
                if (aVar.j == this) {
                    aVar.k = SystemClock.uptimeMillis();
                    aVar.j = null;
                    aVar.l();
                }
            } finally {
                this.s.countDown();
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.loader.content.ModernAsyncTask
        public void f(D d) {
            try {
                a aVar = a.this;
                if (aVar.i != this) {
                    if (aVar.j == this) {
                        aVar.k = SystemClock.uptimeMillis();
                        aVar.j = null;
                        aVar.l();
                    }
                } else if (!aVar.e) {
                    aVar.k = SystemClock.uptimeMillis();
                    aVar.i = null;
                    b.a<D> aVar2 = aVar.b;
                    if (aVar2 != null) {
                        aVar2.a(aVar, d);
                    }
                }
            } finally {
                this.s.countDown();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.l();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        Executor executor = ModernAsyncTask.q;
        this.h = executor;
    }

    @Override // androidx.loader.content.b
    @Deprecated
    public void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.a);
        printWriter.print(" mListener=");
        printWriter.println(this.b);
        if (this.d || this.g) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(false);
        }
        if (this.e || this.f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.e);
            printWriter.print(" mReset=");
            printWriter.println(this.f);
        }
        if (this.i != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.i);
            printWriter.print(" waiting=");
            this.i.getClass();
            printWriter.println(false);
        }
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.j);
            printWriter.print(" waiting=");
            this.j.getClass();
            printWriter.println(false);
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        if (this.j == null && this.i != null) {
            this.i.getClass();
            this.i.c(this.h, null);
        }
    }

    public abstract D m();
}
