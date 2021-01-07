package defpackage;

import java.util.Set;

/* renamed from: pgb  reason: default package */
public class pgb implements blb {
    private final Set<blb> a;

    /* JADX WARN: Incorrect args count in method signature: (Ljava/util/Set<Lblb;>;Ljava/util/Set<Lblb;>;)V */
    pgb(Set set) {
        this.a = set;
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        for (blb blb : this.a) {
            blb.b(glb);
        }
    }
}
