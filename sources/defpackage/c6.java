package defpackage;

import android.os.Bundle;
import androidx.lifecycle.i0;
import androidx.lifecycle.n;
import androidx.loader.content.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: c6  reason: default package */
public abstract class c6 {

    /* renamed from: c6$a */
    public interface a<D> {
        void a(b<D> bVar, D d);

        b<D> b(int i, Bundle bundle);

        void c(b<D> bVar);
    }

    public static <T extends n & i0> c6 c(T t) {
        return new d6(t, t.Z());
    }

    public abstract void a(int i);

    @Deprecated
    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> b<D> d(int i, Bundle bundle, a<D> aVar);

    public abstract void e();
}
