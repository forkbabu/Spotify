package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.g0;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.b;

public abstract class a extends g0.c {
    private final SavedStateRegistry a;
    private final Lifecycle b;
    private final Bundle c;

    public a(b bVar, Bundle bundle) {
        this.a = bVar.g0();
        this.b = bVar.A();
        this.c = bundle;
    }

    @Override // androidx.lifecycle.g0.c, androidx.lifecycle.g0.b
    public final <T extends e0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.lifecycle.g0.e
    public void b(e0 e0Var) {
        SavedStateHandleController.a(e0Var, this.a, this.b);
    }

    @Override // androidx.lifecycle.g0.c
    public final <T extends e0> T c(String str, Class<T> cls) {
        SavedStateHandleController c2 = SavedStateHandleController.c(this.a, this.b, str, this.c);
        T t = (T) d(str, cls, c2.d());
        t.f("androidx.lifecycle.savedstate.vm.tag", c2);
        return t;
    }

    /* access modifiers changed from: protected */
    public abstract <T extends e0> T d(String str, Class<T> cls, a0 a0Var);
}
