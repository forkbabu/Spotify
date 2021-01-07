package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.maybe.b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: sm9  reason: default package */
public final /* synthetic */ class sm9 implements l {
    public final /* synthetic */ vm9 a;
    public final /* synthetic */ List b;

    public /* synthetic */ sm9(vm9 vm9, List list) {
        this.a = vm9;
        this.b = list;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        vm9 vm9 = this.a;
        List<MediaBrowserItem> list = this.b;
        vm9.getClass();
        String str = (String) ((Optional) obj).orNull();
        ArrayList arrayList = new ArrayList(list.size());
        for (MediaBrowserItem mediaBrowserItem : list) {
            if (mediaBrowserItem.a() == MediaBrowserItem.ActionType.PLAYABLE && mediaBrowserItem.o() && mediaBrowserItem.i() != null && !mediaBrowserItem.e().equals(str)) {
                arrayList.add(mm9.a(mediaBrowserItem.e(), mediaBrowserItem.i()));
            }
        }
        return arrayList.isEmpty() ? b.a : io.reactivex.l.k(arrayList);
    }
}
