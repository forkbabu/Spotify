package com.facebook.appevents;

/* access modifiers changed from: package-private */
public final class k implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    k(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!uf.c(this)) {
            try {
                if (!l.a().get()) {
                    l.b();
                }
                l.c().edit().putString(this.a, this.b).apply();
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }
}
