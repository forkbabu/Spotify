package defpackage;

import com.spotify.searchview.proto.Entity;
import java.util.HashSet;
import java.util.Set;

/* renamed from: dwa  reason: default package */
public class dwa implements hsa<Entity> {
    private final dsa a;
    private final oqa<Entity> b;
    private final ksa c;
    private final cva d;

    public dwa(fsa fsa, ava ava, ksa ksa, cva cva) {
        this.a = fsa;
        this.b = ava;
        this.c = ksa;
        this.d = cva;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.hsa
    public Set a(Entity entity) {
        Object obj;
        Entity entity2 = entity;
        HashSet hashSet = new HashSet(1);
        if (this.d.a(entity2)) {
            obj = this.c;
        } else if (this.b.a(entity2)) {
            obj = this.a;
        } else {
            obj = uva.a;
        }
        hashSet.add(obj);
        return hashSet;
    }
}
