package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class o {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final RoomDatabase b;
    private volatile t7 c;

    public o(RoomDatabase roomDatabase) {
        this.b = roomDatabase;
    }

    public t7 a() {
        this.b.a();
        if (this.a.compareAndSet(false, true)) {
            if (this.c == null) {
                this.c = this.b.e(b());
            }
            return this.c;
        }
        return this.b.e(b());
    }

    /* access modifiers changed from: protected */
    public abstract String b();

    public void c(t7 t7Var) {
        if (t7Var == this.c) {
            this.a.set(false);
        }
    }
}
