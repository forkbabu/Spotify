package defpackage;

import com.spotify.libs.search.history.SearchHistoryItem;
import java.util.HashSet;
import java.util.Set;

/* renamed from: psa  reason: default package */
public class psa implements hsa<SearchHistoryItem> {
    private final dsa a;
    private final oqa<SearchHistoryItem> b;
    private final ksa c;
    private final tsa d;

    public psa(fsa fsa, rsa rsa, ksa ksa, tsa tsa) {
        this.a = fsa;
        this.b = rsa;
        this.c = ksa;
        this.d = tsa;
    }

    /* renamed from: b */
    public Set<dsa> a(SearchHistoryItem searchHistoryItem) {
        Object obj;
        HashSet hashSet = new HashSet(1);
        this.d.getClass();
        if (searchHistoryItem.isMogef19()) {
            obj = this.c;
        } else if (this.b.a(searchHistoryItem)) {
            obj = this.a;
        } else {
            obj = osa.a;
        }
        hashSet.add(obj);
        return hashSet;
    }
}
