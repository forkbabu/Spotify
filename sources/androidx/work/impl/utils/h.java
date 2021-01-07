package androidx.work.impl.utils;

import androidx.work.WorkerParameters;
import androidx.work.impl.l;

public class h implements Runnable {
    private l a;
    private String b;
    private WorkerParameters.a c;

    public h(l lVar, String str, WorkerParameters.a aVar) {
        this.a = lVar;
        this.b = str;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.m().i(this.b, this.c);
    }
}
