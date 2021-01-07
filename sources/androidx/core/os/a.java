package androidx.core.os;

public final class a {
    private boolean a;
    private AbstractC0029a b;
    private boolean c;

    /* renamed from: androidx.core.os.a$a  reason: collision with other inner class name */
    public interface AbstractC0029a {
        void b();
    }

    public void a() {
        AbstractC0029a aVar;
        synchronized (this) {
            if (!this.a) {
                this.a = true;
                this.c = true;
                aVar = this.b;
            } else {
                return;
            }
        }
        if (aVar != null) {
            try {
                aVar.b();
            } catch (Throwable th) {
                synchronized (this) {
                    this.c = false;
                    notifyAll();
                    throw th;
                }
            }
        }
        synchronized (this) {
            this.c = false;
            notifyAll();
        }
    }

    public boolean b() {
        boolean z;
        synchronized (this) {
            z = this.a;
        }
        return z;
    }

    public void c(AbstractC0029a aVar) {
        synchronized (this) {
            while (this.c) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.b != aVar) {
                this.b = aVar;
                if (this.a) {
                    aVar.b();
                }
            }
        }
    }
}
