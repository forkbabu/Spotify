package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.a;
import com.google.android.gms.tasks.g;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public class j implements a<Void, T> {
    final /* synthetic */ Callable a;

    j(h hVar, Callable callable) {
        this.a = callable;
    }

    @Override // com.google.android.gms.tasks.a
    public T a(g<Void> gVar) {
        return (T) this.a.call();
    }
}
