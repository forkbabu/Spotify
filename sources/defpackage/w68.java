package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.libs.search.history.SearchHistoryItem;
import com.spotify.libs.search.history.h;
import com.spotify.libs.search.history.j;
import com.spotify.libs.search.history.k;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueSectionHeader;
import com.spotify.music.libs.viewuri.ViewUris;
import defpackage.b91;
import defpackage.s81;
import java.util.List;

/* renamed from: w68  reason: default package */
public class w68 implements h {
    private final boolean a;
    private final boolean b;
    private final String c;
    private final j d;
    private final k e;
    private final bc8 f;

    public w68(boolean z, boolean z2, String str, j jVar, k kVar, bc8 bc8) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = jVar;
        this.e = kVar;
        this.f = bc8;
    }

    @Override // com.spotify.libs.search.history.h
    public Optional<b91> a(List<SearchHistoryItem> list, boolean z) {
        String str;
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int i2 = 0;
        for (SearchHistoryItem searchHistoryItem : list) {
            if (searchHistoryItem == null) {
                throw new IllegalStateException("Search history can't have null items.");
            } else if (this.d.b(searchHistoryItem)) {
                if (!ViewUris.y.a(searchHistoryItem.getOriginUri())) {
                    str = searchHistoryItem.getTargetUri();
                } else if (this.a || this.b) {
                    str = searchHistoryItem.getOriginUri();
                } else {
                    str = searchHistoryItem.getTargetUri();
                }
                builder.mo53add((ImmutableList.Builder) this.e.a(searchHistoryItem, i2, str, z));
                i2++;
            }
        }
        if (i2 <= 0) {
            return Optional.absent();
        }
        ImmutableList build = builder.build();
        String str2 = this.c;
        b91.a k = z81.i().k("search-history");
        int size = build.size();
        if (str2 != null) {
            k = k.b(z81.c().s("search-history-header").o(HubsGlueSectionHeader.SECTION_HEADER.id(), HubsComponentCategory.HEADER.d()).y(z81.h().a(str2)).l());
            size++;
        }
        b91.a a2 = k.a(build);
        s81.a o = z81.c().s("search-history-clear").o("search:clearSearchHistory", HubsComponentCategory.ROW.d());
        int i3 = k58.n;
        return Optional.of(a2.b(o.f("click", z81.b().e("clearHistory").c()).h(this.f.a(size)).l()).g());
    }

    @Override // com.spotify.libs.search.history.h
    public boolean b(b91 b91) {
        return rw.equal(b91.id(), "search-history");
    }
}
