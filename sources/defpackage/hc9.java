package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.filtertags.loader.FilterTagsResponse;
import io.reactivex.functions.l;
import io.reactivex.s;

/* renamed from: hc9  reason: default package */
public final /* synthetic */ class hc9 implements l {
    public final /* synthetic */ s a;
    public final /* synthetic */ lb9 b;

    public /* synthetic */ hc9(s sVar, lb9 lb9) {
        this.a = sVar;
        this.b = lb9;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        FilterTagsResponse filterTagsResponse = (FilterTagsResponse) obj;
        return this.a.N(new jc9(this.b, filterTagsResponse)).N0(1).j0(new kc9(filterTagsResponse));
    }
}
