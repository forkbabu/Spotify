package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;

public final class a {
    private final b a;
    private final SavedStateRegistry b = new SavedStateRegistry();

    private a(b bVar) {
        this.a = bVar;
    }

    public static a a(b bVar) {
        return new a(bVar);
    }

    public SavedStateRegistry b() {
        return this.b;
    }

    public void c(Bundle bundle) {
        Lifecycle A = this.a.A();
        if (A.b() == Lifecycle.State.INITIALIZED) {
            A.a(new Recreator(this.a));
            this.b.b(A, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void d(Bundle bundle) {
        this.b.c(bundle);
    }
}
