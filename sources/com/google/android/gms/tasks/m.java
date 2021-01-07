package com.google.android.gms.tasks;

final class m implements Runnable {
    private final /* synthetic */ g a;
    private final /* synthetic */ k b;

    m(k kVar, g gVar) {
        this.b = kVar;
        this.a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.p()) {
            this.b.c.w();
            return;
        }
        try {
            this.b.c.v(this.b.b.a(this.a));
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.b.c.u((Exception) e.getCause());
            } else {
                this.b.c.u(e);
            }
        } catch (Exception e2) {
            this.b.c.u(e2);
        }
    }
}
