package defpackage;

import defpackage.Cdo;

/* renamed from: bo  reason: default package */
public final /* synthetic */ class bo implements Runnable {
    public final /* synthetic */ Cdo.b a;

    public /* synthetic */ bo(Cdo.b bVar) {
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Cdo.b bVar = this.a;
        if (Cdo.this.g != null) {
            Cdo.a(Cdo.this);
        }
    }
}
