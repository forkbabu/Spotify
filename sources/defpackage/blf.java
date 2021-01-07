package defpackage;

import io.netty.util.concurrent.l;
import java.net.InetSocketAddress;

/* renamed from: blf  reason: default package */
public class blf extends elf {
    private volatile ykf<InetSocketAddress> b;

    public blf(l lVar) {
        super(lVar);
    }

    public ykf d() {
        ykf<InetSocketAddress> ykf = this.b;
        if (ykf == null) {
            synchronized (this) {
                ykf = this.b;
                if (ykf == null) {
                    ykf = new dlf(a(), this);
                    this.b = ykf;
                }
            }
        }
        return ykf;
    }
}
