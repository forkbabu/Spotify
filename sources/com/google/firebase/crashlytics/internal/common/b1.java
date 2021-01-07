package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.g;
import com.google.android.gms.tasks.h;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public class b1 implements Runnable {
    final /* synthetic */ Callable a;
    final /* synthetic */ h b;

    class a implements com.google.android.gms.tasks.a<T, Void> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.android.gms.tasks.a
        public Void a(g gVar) {
            if (gVar.r()) {
                b1.this.b.c(gVar.n());
                return null;
            }
            b1.this.b.b(gVar.m());
            return null;
        }
    }

    b1(Callable callable, h hVar) {
        this.a = callable;
        this.b = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ((g) this.a.call()).j(new a());
        } catch (Exception e) {
            this.b.b(e);
        }
    }
}
