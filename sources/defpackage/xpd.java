package defpackage;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import java.util.Map;

/* renamed from: xpd  reason: default package */
public final /* synthetic */ class xpd implements Predicate {
    public final /* synthetic */ YourLibraryPageId a;

    public /* synthetic */ xpd(YourLibraryPageId yourLibraryPageId) {
        this.a = yourLibraryPageId;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        YourLibraryPageId yourLibraryPageId = this.a;
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        return Collections2.contains((Iterable) entry.getValue(), yourLibraryPageId);
    }
}
