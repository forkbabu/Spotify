package defpackage;

import com.spotify.libs.search.offline.model.OfflineEntity;
import java.util.HashSet;
import java.util.Set;

/* renamed from: zsa  reason: default package */
public class zsa implements hsa<OfflineEntity> {
    private final dsa a;
    private final oqa<OfflineEntity> b;
    private final ksa c;
    private final oqa<OfflineEntity> d;

    public zsa(fsa fsa, kta kta, ksa ksa, mta mta) {
        this.a = fsa;
        this.b = kta;
        this.c = ksa;
        this.d = mta;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.hsa
    public Set a(OfflineEntity offlineEntity) {
        Object obj;
        OfflineEntity offlineEntity2 = offlineEntity;
        HashSet hashSet = new HashSet(1);
        if (this.d.a(offlineEntity2)) {
            obj = this.c;
        } else if (this.b.a(offlineEntity2)) {
            obj = this.a;
        } else {
            obj = xsa.a;
        }
        hashSet.add(obj);
        return hashSet;
    }
}
