package defpackage;

import java.io.IOException;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import okhttp3.a;
import okhttp3.d0;
import okhttp3.e;
import okhttp3.f0;
import okhttp3.internal.connection.c;
import okhttp3.internal.connection.d;
import okhttp3.internal.connection.f;
import okhttp3.j;
import okhttp3.k;
import okhttp3.t;

/* renamed from: pnf  reason: default package */
public abstract class pnf {
    public static pnf a;

    public abstract void a(t.a aVar, String str);

    public abstract void b(t.a aVar, String str, String str2);

    public abstract void c(k kVar, SSLSocket sSLSocket, boolean z);

    public abstract int d(d0.a aVar);

    public abstract boolean e(j jVar, c cVar);

    public abstract Socket f(j jVar, a aVar, f fVar);

    public abstract boolean g(a aVar, a aVar2);

    public abstract c h(j jVar, a aVar, f fVar, f0 f0Var);

    public abstract void i(j jVar, c cVar);

    public abstract d j(j jVar);

    public abstract IOException k(e eVar, IOException iOException);
}
