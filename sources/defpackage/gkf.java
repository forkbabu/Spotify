package defpackage;

import io.netty.channel.d;
import java.net.SocketAddress;

/* renamed from: gkf  reason: default package */
public final class gkf extends dkf<fkf, d> {
    gkf(fkf fkf) {
        super(fkf);
    }

    @Override // defpackage.dkf
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.setLength(sb.length() - 1);
        sb.append(", resolver: ");
        sb.append(((fkf) this.a).z());
        SocketAddress y = ((fkf) this.a).y();
        if (y != null) {
            sb.append(", remoteAddress: ");
            sb.append(y);
        }
        sb.append(')');
        return sb.toString();
    }
}
