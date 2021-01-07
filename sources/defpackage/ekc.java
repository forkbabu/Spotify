package defpackage;

import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.C0707R;

/* renamed from: ekc  reason: default package */
public final class ekc implements fjf<SortOption> {

    /* access modifiers changed from: private */
    /* renamed from: ekc$a */
    public static final class a {
        private static final ekc a = new ekc();
    }

    public static ekc a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        SortOption sortOption = new SortOption("name");
        SortOption sortOption2 = new SortOption("addTime", C0707R.string.sort_order_recently_added, true);
        sortOption2.i(sortOption);
        return sortOption2;
    }
}
