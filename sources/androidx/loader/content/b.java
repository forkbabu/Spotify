package androidx.loader.content;

import android.content.Context;
import androidx.loader.content.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class b<D> {
    int a;
    a<D> b;
    Context c;
    boolean d = false;
    boolean e = false;
    boolean f = true;
    boolean g = false;

    public interface a<D> {
        void a(b<D> bVar, D d);
    }

    public b(Context context) {
        this.c = context.getApplicationContext();
    }

    public void a() {
        this.e = true;
    }

    public boolean b() {
        a aVar = (a) this;
        boolean z = false;
        if (aVar.i != null) {
            if (!aVar.d) {
                aVar.g = true;
            }
            if (aVar.j != null) {
                aVar.i.getClass();
                aVar.i = null;
            } else {
                aVar.i.getClass();
                z = aVar.i.a(false);
                if (z) {
                    aVar.j = aVar.i;
                }
                aVar.i = null;
            }
        }
        return z;
    }

    @Deprecated
    public void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw null;
    }

    public void d() {
        a aVar = (a) this;
        aVar.b();
        aVar.i = new a.RunnableC0032a();
        aVar.l();
    }

    public Context e() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public void f() {
    }

    public void g(int i, a<D> aVar) {
        if (this.b == null) {
            this.b = aVar;
            this.a = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public void h() {
        this.f = true;
        this.d = false;
        this.e = false;
        this.g = false;
    }

    public final void i() {
        this.d = true;
        this.f = false;
        this.e = false;
        f();
    }

    public void j() {
        this.d = false;
    }

    public void k(a<D> aVar) {
        a<D> aVar2 = this.b;
        if (aVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (aVar2 == aVar) {
            this.b = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        e2.a(this, sb);
        sb.append(" id=");
        return je.B0(sb, this.a, "}");
    }
}
