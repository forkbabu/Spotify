package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class l<E> extends i {
    private final Activity a;
    private final Context b;
    private final Handler c;
    final o f = new q();

    l(c cVar) {
        Handler handler = new Handler();
        this.a = cVar;
        e2.c(cVar, "context == null");
        this.b = cVar;
        e2.c(handler, "handler == null");
        this.c = handler;
    }

    /* access modifiers changed from: package-private */
    public Activity c() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public Context d() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public Handler e() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public abstract void f(Fragment fragment);

    public abstract void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract E h();

    public abstract LayoutInflater i();

    public abstract void j(Fragment fragment, String[] strArr, int i);

    public abstract boolean k(Fragment fragment);

    public abstract void l(Fragment fragment, Intent intent, int i, Bundle bundle);

    public abstract void m(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle);

    public abstract void n();
}
