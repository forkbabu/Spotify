package defpackage;

import android.os.Looper;
import android.view.View;
import io.reactivex.disposables.c;
import io.reactivex.s;
import io.reactivex.x;
import kotlin.f;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: o50  reason: default package */
public final class o50 extends s<f> {
    private final View a;

    /* renamed from: o50$a */
    private static final class a extends io.reactivex.android.a implements View.OnClickListener {
        private final View b;
        private final x<? super f> c;

        public a(View view, x<? super f> xVar) {
            h.f(view, "view");
            h.f(xVar, "observer");
            this.b = view;
            this.c = xVar;
        }

        /* access modifiers changed from: protected */
        @Override // io.reactivex.android.a
        public void a() {
            this.b.setOnClickListener(null);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.f(view, "v");
            if (!d()) {
                this.c.onNext(f.a);
            }
        }
    }

    public o50(View view) {
        h.f(view, "view");
        this.a = view;
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.s
    public void H0(x<? super f> xVar) {
        h.f(xVar, "observer");
        h.f(xVar, "observer");
        boolean z = true;
        if (!h.a(Looper.myLooper(), Looper.getMainLooper())) {
            xVar.onSubscribe(c.a());
            StringBuilder V0 = je.V0("Expected to be called on the main thread but was ");
            Thread currentThread = Thread.currentThread();
            h.b(currentThread, "Thread.currentThread()");
            V0.append(currentThread.getName());
            xVar.onError(new IllegalStateException(V0.toString()));
            z = false;
        }
        if (z) {
            a aVar = new a(this.a, xVar);
            xVar.onSubscribe(aVar);
            this.a.setOnClickListener(aVar);
        }
    }
}
