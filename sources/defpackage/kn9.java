package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.maybe.b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: kn9  reason: default package */
public final /* synthetic */ class kn9 implements l {
    public final /* synthetic */ mn9 a;
    public final /* synthetic */ List b;

    public /* synthetic */ kn9(mn9 mn9, List list) {
        this.a = mn9;
        this.b = list;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        mn9 mn9 = this.a;
        List<MediaBrowserItem> list = this.b;
        mn9.getClass();
        String str = (String) ((Optional) obj).orNull();
        ArrayList arrayList = new ArrayList(list.size());
        for (MediaBrowserItem mediaBrowserItem : list) {
            if (mediaBrowserItem.a() == MediaBrowserItem.ActionType.PLAYABLE && mediaBrowserItem.h() != null && mediaBrowserItem.i() != null && !mediaBrowserItem.h().toString().equals(str)) {
                arrayList.add(mm9.a(mediaBrowserItem.h().toString(), mediaBrowserItem.i()));
            }
        }
        return arrayList.isEmpty() ? b.a : io.reactivex.l.k(arrayList);
    }
}
