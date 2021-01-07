package defpackage;

import com.google.protobuf.u;
import com.spotify.messages.UbiProd1Impression;
import com.spotify.messages.UbiProd1Interaction;

/* renamed from: vqe  reason: default package */
public class vqe implements dre {
    private final gl0<u> a;
    private final bre b;
    private final yqe c;

    vqe(gl0<u> gl0, bre bre, yqe yqe) {
        this.a = gl0;
        this.b = bre;
        this.c = yqe;
    }

    @Override // defpackage.dre
    public void a(String str) {
        UbiProd1Interaction f = cre.f(str, this.b.get(), this.c.get());
        if (f != null) {
            this.a.c(f);
        }
    }

    @Override // defpackage.dre
    public void b(String str) {
        UbiProd1Impression c2 = cre.c(str, this.b.get(), this.c.get());
        if (c2 != null) {
            this.a.c(c2);
        }
    }
}
