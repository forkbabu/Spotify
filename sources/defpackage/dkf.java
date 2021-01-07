package defpackage;

import defpackage.ckf;
import io.netty.channel.d;
import io.netty.channel.i;
import io.netty.channel.j0;
import io.netty.channel.p;
import io.netty.util.e;
import io.netty.util.internal.r;
import java.net.SocketAddress;
import java.util.Map;

/* renamed from: dkf  reason: default package */
public abstract class dkf<B extends ckf<B, C>, C extends d> {
    protected final B a;

    protected dkf(B b) {
        if (b != null) {
            this.a = b;
            return;
        }
        throw new NullPointerException("bootstrap");
    }

    public final i a() {
        return this.a.m();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(r.f(this));
        sb.append('(');
        j0 j0Var = this.a.a;
        if (j0Var != null) {
            sb.append("group: ");
            sb.append(r.f(j0Var));
            sb.append(", ");
        }
        hkf<? extends C> e = this.a.e();
        if (e != null) {
            sb.append("channelFactory: ");
            sb.append(e);
            sb.append(", ");
        }
        SocketAddress p = this.a.p();
        if (p != null) {
            sb.append("localAddress: ");
            sb.append(p);
            sb.append(", ");
        }
        Map<p<?>, Object> q = this.a.q();
        if (!q.isEmpty()) {
            sb.append("options: ");
            sb.append(q);
            sb.append(", ");
        }
        Map<e<?>, Object> b = this.a.b();
        if (!b.isEmpty()) {
            sb.append("attrs: ");
            sb.append(b);
            sb.append(", ");
        }
        i a2 = a();
        if (a2 != null) {
            sb.append("handler: ");
            sb.append(a2);
            sb.append(", ");
        }
        if (sb.charAt(sb.length() - 1) == '(') {
            sb.append(')');
        } else {
            sb.setCharAt(sb.length() - 2, ')');
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }
}
