package defpackage;

import com.google.common.base.Predicate;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;

/* renamed from: l19  reason: default package */
public final /* synthetic */ class l19 implements Predicate {
    public final /* synthetic */ YourLibraryPageId a;

    public /* synthetic */ l19(YourLibraryPageId yourLibraryPageId) {
        this.a = yourLibraryPageId;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return ((YourLibraryPageId) obj) != this.a;
    }
}
