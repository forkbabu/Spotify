package defpackage;

import com.spotify.music.libs.viewuri.c;
import com.spotify.music.ubi.interactions.InteractionAction;
import java.util.Set;

/* renamed from: q71  reason: default package */
public class q71 implements p71 {
    private final jz1 b;
    private final a c;
    private final c.a d;
    private final cqe e;

    /* renamed from: q71$a */
    private static class a {
        private ifd a;

        public a(ifd ifd) {
            this.a = ifd;
        }

        public String a() {
            return this.a.getName();
        }
    }

    public q71(jz1 jz1, ifd ifd, c.a aVar, cqe cqe) {
        jz1.getClass();
        this.b = jz1;
        ifd.getClass();
        this.c = new a(ifd);
        aVar.getClass();
        this.d = aVar;
        this.e = cqe;
    }

    @Override // defpackage.p71
    public void a(String str, s81 s81, String str2, InteractionAction interactionAction) {
        m91 m91;
        p81 logging = s81.logging();
        Set<String> keySet = logging.keySet();
        if (keySet.contains("ui:source") || keySet.contains("ui:group") || keySet.contains("ui:index_in_block")) {
            if (interactionAction != null) {
                m91 = new ga1(logging.string("ui:source"), this.c.a(), this.d.getViewUri().toString(), logging.string("ui:group"), logging.longValue("ui:index_in_block", -1), str, "hit", str2, (double) this.e.d(), interactionAction.d());
            } else {
                m91 = new fa1(logging.string("ui:source"), this.c.a(), this.d.getViewUri().toString(), logging.string("ui:group"), logging.longValue("ui:index_in_block", -1), str, "hit", str2, (double) this.e.d());
            }
            this.b.a(m91);
        }
    }
}
