package defpackage;

import com.google.common.base.Predicate;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import com.spotify.music.yourlibrary.interfaces.g;

/* renamed from: ypd  reason: default package */
public final /* synthetic */ class ypd implements Predicate {
    public final /* synthetic */ YourLibraryPageId a;

    public /* synthetic */ ypd(YourLibraryPageId yourLibraryPageId) {
        this.a = yourLibraryPageId;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return ((g) obj).b() == this.a;
    }
}
