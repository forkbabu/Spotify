package androidx.fragment.app;

import androidx.core.os.a;
import androidx.fragment.app.e0;
import androidx.fragment.app.o;

/* access modifiers changed from: package-private */
public final class y implements Runnable {
    final /* synthetic */ e0.a a;
    final /* synthetic */ Fragment b;
    final /* synthetic */ a c;

    y(e0.a aVar, Fragment fragment, a aVar2) {
        this.a = aVar;
        this.b = fragment;
        this.c = aVar2;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((o.b) this.a).a(this.b, this.c);
    }
}
