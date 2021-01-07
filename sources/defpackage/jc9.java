package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.filtertags.loader.FilterTagsResponse;
import io.reactivex.functions.g;

/* renamed from: jc9  reason: default package */
public final /* synthetic */ class jc9 implements g {
    public final /* synthetic */ lb9 a;
    public final /* synthetic */ FilterTagsResponse b;

    public /* synthetic */ jc9(lb9 lb9, FilterTagsResponse filterTagsResponse) {
        this.a = lb9;
        this.b = filterTagsResponse;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b((String) obj, this.b);
    }
}
