package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import defpackage.m;

/* access modifiers changed from: package-private */
/* renamed from: h1  reason: default package */
public class h1 extends m.a {
    private Handler a = new Handler(Looper.getMainLooper());
    final /* synthetic */ f1 b;

    /* renamed from: h1$a */
    class a implements Runnable {
        final /* synthetic */ int a;
        final /* synthetic */ Bundle b;

        a(int i, Bundle bundle) {
            this.a = i;
            this.b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            h1.this.b.a(this.a, this.b);
        }
    }

    /* renamed from: h1$b */
    class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ Bundle b;

        b(String str, Bundle bundle) {
            this.a = str;
            this.b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            h1.this.b.getClass();
        }
    }

    /* renamed from: h1$c */
    class c implements Runnable {
        final /* synthetic */ Bundle a;

        c(Bundle bundle) {
            this.a = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            h1.this.b.getClass();
        }
    }

    /* renamed from: h1$d */
    class d implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ Bundle b;

        d(String str, Bundle bundle) {
            this.a = str;
            this.b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            h1.this.b.getClass();
        }
    }

    /* renamed from: h1$e */
    class e implements Runnable {
        final /* synthetic */ int a;
        final /* synthetic */ Uri b;
        final /* synthetic */ boolean c;
        final /* synthetic */ Bundle f;

        e(int i, Uri uri, boolean z, Bundle bundle) {
            this.a = i;
            this.b = uri;
            this.c = z;
            this.f = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            h1.this.b.getClass();
        }
    }

    h1(g1 g1Var, f1 f1Var) {
        this.b = f1Var;
    }

    @Override // defpackage.m
    public void X0(String str, Bundle bundle) {
        if (this.b != null) {
            this.a.post(new b(str, bundle));
        }
    }

    @Override // defpackage.m
    public void g3(int i, Bundle bundle) {
        if (this.b != null) {
            this.a.post(new a(i, bundle));
        }
    }

    @Override // defpackage.m
    public Bundle k0(String str, Bundle bundle) {
        f1 f1Var = this.b;
        if (f1Var == null) {
            return null;
        }
        f1Var.getClass();
        return null;
    }

    @Override // defpackage.m
    public void s3(String str, Bundle bundle) {
        if (this.b != null) {
            this.a.post(new d(str, bundle));
        }
    }

    @Override // defpackage.m
    public void t3(Bundle bundle) {
        if (this.b != null) {
            this.a.post(new c(bundle));
        }
    }

    @Override // defpackage.m
    public void w3(int i, Uri uri, boolean z, Bundle bundle) {
        if (this.b != null) {
            this.a.post(new e(i, uri, z, bundle));
        }
    }
}
