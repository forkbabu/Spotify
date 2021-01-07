package io.netty.handler.logging;

import io.netty.buffer.j;
import io.netty.buffer.l;
import io.netty.buffer.o;
import io.netty.channel.f;
import io.netty.channel.i;
import io.netty.channel.k;
import io.netty.channel.v;
import io.netty.util.internal.logging.AbstractInternalLogger;
import io.netty.util.internal.logging.InternalLogLevel;
import io.netty.util.internal.logging.b;
import io.netty.util.internal.logging.c;
import io.netty.util.internal.r;
import java.net.SocketAddress;

@i.a
public class a extends f {
    protected final b b = c.a(a.class);
    protected final InternalLogLevel c;

    public a() {
        LogLevel logLevel = LogLevel.DEBUG;
        this.c = logLevel.d();
    }

    private static String e(k kVar, String str, Object obj) {
        String obj2 = kVar.h().toString();
        String valueOf = String.valueOf(obj);
        int length = str.length();
        StringBuilder sb = new StringBuilder(valueOf.length() + length + obj2.length() + 1 + 2);
        sb.append(obj2);
        sb.append(' ');
        sb.append(str);
        sb.append(": ");
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // io.netty.channel.m, io.netty.channel.l
    public void F(k kVar) {
        if (((AbstractInternalLogger) this.b).x(this.c)) {
            ((AbstractInternalLogger) this.b).y(this.c, b(kVar, "REGISTERED"));
        }
        kVar.m();
    }

    @Override // io.netty.channel.m, io.netty.channel.l
    public void G(k kVar) {
        if (((AbstractInternalLogger) this.b).x(this.c)) {
            ((AbstractInternalLogger) this.b).y(this.c, b(kVar, "INACTIVE"));
        }
        kVar.m0();
    }

    @Override // io.netty.channel.r
    public void J(k kVar, SocketAddress socketAddress, SocketAddress socketAddress2, v vVar) {
        String str;
        if (((AbstractInternalLogger) this.b).x(this.c)) {
            b bVar = this.b;
            InternalLogLevel internalLogLevel = this.c;
            if (socketAddress2 == null) {
                str = e(kVar, "CONNECT", socketAddress);
            } else {
                String obj = kVar.h().toString();
                String valueOf = String.valueOf(socketAddress);
                String obj2 = socketAddress2.toString();
                StringBuilder sb = new StringBuilder((obj.length() + 1) + "CONNECT2" + valueOf.length() + 2 + obj2.length());
                sb.append(obj);
                sb.append(' ');
                sb.append("CONNECT");
                sb.append(": ");
                str = je.J0(sb, valueOf, ", ", obj2);
            }
            ((AbstractInternalLogger) bVar).y(internalLogLevel, str);
        }
        kVar.u(socketAddress, socketAddress2, vVar);
    }

    @Override // io.netty.channel.m, io.netty.channel.l
    public void M(k kVar) {
        if (((AbstractInternalLogger) this.b).x(this.c)) {
            ((AbstractInternalLogger) this.b).y(this.c, b(kVar, "ACTIVE"));
        }
        kVar.P();
    }

    @Override // io.netty.channel.r
    public void Q(k kVar, v vVar) {
        if (((AbstractInternalLogger) this.b).x(this.c)) {
            ((AbstractInternalLogger) this.b).y(this.c, b(kVar, "DISCONNECT"));
        }
        kVar.i(vVar);
    }

    @Override // io.netty.channel.m, io.netty.channel.l
    public void S(k kVar, Object obj) {
        if (((AbstractInternalLogger) this.b).x(this.c)) {
            ((AbstractInternalLogger) this.b).y(this.c, c(kVar, "RECEIVED", obj));
        }
        kVar.N(obj);
    }

    @Override // io.netty.channel.r
    public void U(k kVar, v vVar) {
        if (((AbstractInternalLogger) this.b).x(this.c)) {
            ((AbstractInternalLogger) this.b).y(this.c, b(kVar, "CLOSE"));
        }
        kVar.k(vVar);
    }

    @Override // io.netty.channel.r
    public void W(k kVar, Object obj, v vVar) {
        if (((AbstractInternalLogger) this.b).x(this.c)) {
            ((AbstractInternalLogger) this.b).y(this.c, c(kVar, "WRITE", obj));
        }
        kVar.x(obj, vVar);
    }

    /* access modifiers changed from: protected */
    public String b(k kVar, String str) {
        String obj = kVar.h().toString();
        StringBuilder sb = new StringBuilder(str.length() + obj.length() + 1);
        sb.append(obj);
        sb.append(' ');
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public String c(k kVar, String str, Object obj) {
        int i = 0;
        if (obj instanceof j) {
            j jVar = (j) obj;
            String obj2 = kVar.h().toString();
            int m1 = jVar.m1();
            if (m1 == 0) {
                StringBuilder sb = new StringBuilder(str.length() + obj2.length() + 1 + 4);
                sb.append(obj2);
                sb.append(' ');
                sb.append(str);
                sb.append(": 0B");
                return sb.toString();
            }
            int i2 = m1 / 16;
            if (m1 % 15 != 0) {
                i = 1;
            }
            int i3 = (i2 + i + 4) * 80;
            StringBuilder sb2 = new StringBuilder(i3 + str.length() + obj2.length() + 1 + 2 + 10 + 1 + 2);
            sb2.append(obj2);
            sb2.append(' ');
            sb2.append(str);
            sb2.append(": ");
            sb2.append(m1);
            sb2.append('B');
            sb2.append(r.a);
            o.b(sb2, jVar);
            return sb2.toString();
        } else if (!(obj instanceof l)) {
            return e(kVar, str, obj);
        } else {
            l lVar = (l) obj;
            String obj3 = kVar.h().toString();
            String obj4 = lVar.toString();
            j content = lVar.content();
            int m12 = content.m1();
            if (m12 == 0) {
                int length = str.length();
                StringBuilder sb3 = new StringBuilder(obj4.length() + length + obj3.length() + 1 + 2 + 4);
                sb3.append(obj3);
                sb3.append(' ');
                sb3.append(str);
                sb3.append(", ");
                return je.I0(sb3, obj4, ", 0B");
            }
            int i4 = m12 / 16;
            if (m12 % 15 != 0) {
                i = 1;
            }
            int length2 = str.length();
            int i5 = (i4 + i + 4) * 80;
            StringBuilder sb4 = new StringBuilder(i5 + obj4.length() + length2 + obj3.length() + 1 + 2 + 2 + 10 + 1 + 2);
            sb4.append(obj3);
            sb4.append(' ');
            sb4.append(str);
            sb4.append(": ");
            sb4.append(obj4);
            sb4.append(", ");
            sb4.append(m12);
            sb4.append('B');
            sb4.append(r.a);
            o.b(sb4, content);
            return sb4.toString();
        }
    }

    @Override // io.netty.channel.m, io.netty.channel.l
    public void c0(k kVar, Object obj) {
        if (((AbstractInternalLogger) this.b).x(this.c)) {
            ((AbstractInternalLogger) this.b).y(this.c, c(kVar, "USER_EVENT", obj));
        }
        kVar.s(obj);
    }

    @Override // io.netty.channel.m, io.netty.channel.j, io.netty.channel.i, io.netty.channel.l
    public void d(k kVar, Throwable th) {
        if (((AbstractInternalLogger) this.b).x(this.c)) {
            b bVar = this.b;
            InternalLogLevel internalLogLevel = this.c;
            String c2 = c(kVar, "EXCEPTION", th);
            AbstractInternalLogger abstractInternalLogger = (AbstractInternalLogger) bVar;
            abstractInternalLogger.getClass();
            int ordinal = internalLogLevel.ordinal();
            if (ordinal == 0) {
                abstractInternalLogger.k(c2, th);
            } else if (ordinal == 1) {
                abstractInternalLogger.t(c2, th);
            } else if (ordinal == 2) {
                abstractInternalLogger.i(c2, th);
            } else if (ordinal == 3) {
                abstractInternalLogger.j(c2, th);
            } else if (ordinal == 4) {
                abstractInternalLogger.n(c2, th);
            } else {
                throw new Error();
            }
        }
        kVar.v(th);
    }

    @Override // io.netty.channel.r
    public void g(k kVar) {
        if (((AbstractInternalLogger) this.b).x(this.c)) {
            ((AbstractInternalLogger) this.b).y(this.c, b(kVar, "FLUSH"));
        }
        kVar.flush();
    }

    @Override // io.netty.channel.m, io.netty.channel.l
    public void p(k kVar) {
        if (((AbstractInternalLogger) this.b).x(this.c)) {
            ((AbstractInternalLogger) this.b).y(this.c, b(kVar, "UNREGISTERED"));
        }
        kVar.I();
    }
}
