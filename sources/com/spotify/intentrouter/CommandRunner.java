package com.spotify.intentrouter;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.s;
import io.reactivex.x;

public class CommandRunner<T> {
    private io.reactivex.disposables.b a;
    private volatile g<T> b;
    private b<T> c;

    static class MonitorException extends RuntimeException {
        MonitorException(Throwable th) {
            super(th);
        }
    }

    class a implements x<Throwable> {
        a() {
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            CommandRunner.c(CommandRunner.this, "queue has been shut down");
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            CommandRunner.b(CommandRunner.this, "fatal error", th);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.x
        public void onNext(Throwable th) {
            Throwable th2 = th;
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw new RuntimeException(th2);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            CommandRunner.this.a = bVar;
        }
    }

    public interface b<T> {
    }

    public CommandRunner(s<g<T>> sVar) {
        sVar.w(new a(this)).N0(1).subscribe(new a());
    }

    static void b(CommandRunner commandRunner, String str, Throwable th) {
        synchronized (commandRunner) {
            commandRunner.b = null;
            new IllegalStateException(str, th);
        }
    }

    static void c(CommandRunner commandRunner, String str) {
        synchronized (commandRunner) {
            commandRunner.b = null;
            new IllegalStateException(str);
        }
    }

    public void d(g gVar, io.reactivex.disposables.b bVar) {
        synchronized (this) {
            this.b = gVar;
        }
        b<T> bVar2 = this.c;
        if (bVar2 != null) {
            dlb dlb = (dlb) bVar2;
            Logger.b("Command started: %s (%s)", gVar.c(), gVar.b());
        }
    }

    public void e() {
        g<T> gVar;
        synchronized (this) {
            gVar = this.b;
            this.b = null;
        }
        b<T> bVar = this.c;
        if (bVar != null) {
            dlb dlb = (dlb) bVar;
            Logger.b("Command complete: %s (%s)", gVar.c(), gVar.b());
        }
    }

    public Throwable f(g gVar, Throwable th) {
        synchronized (this) {
            this.b = null;
            new IllegalStateException("command failed", th);
        }
        b<T> bVar = this.c;
        if (bVar == null) {
            return th;
        }
        try {
            dlb dlb = (dlb) bVar;
            Assertion.i(String.format("Command failed: %s (%s)", gVar.c(), gVar.b()), th);
            return th;
        } catch (RuntimeException e) {
            return new MonitorException(e);
        }
    }

    public void g(b<T> bVar) {
        this.c = bVar;
    }
}
