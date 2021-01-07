package defpackage;

import com.spotify.searchview.assistedcuration.proto.Entity;
import java.util.HashSet;
import java.util.Set;

/* renamed from: vva  reason: default package */
public class vva implements hsa<Entity> {
    private final fsa a;
    private final sua b;
    private final ksa c;
    private final wua d;
    private final msa e;
    private final yua f;

    public vva(fsa fsa, sua sua, ksa ksa, wua wua, msa msa, yua yua) {
        this.a = fsa;
        this.b = sua;
        this.c = ksa;
        this.d = wua;
        this.e = msa;
        this.f = yua;
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
        } else if (this.f.a(entity2)) {
            obj = this.e;
        } else {
            obj = tva.a;
        }
        hashSet.add(obj);
        return hashSet;
    }
}
