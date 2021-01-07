package defpackage;

import com.spotify.mobile.android.share.menu.preview.SharePreviewMenuFragment;
import com.spotify.mobile.android.share.menu.preview.api.h;
import com.spotify.mobile.android.share.menu.preview.domain.c;
import com.spotify.mobile.android.share.menu.preview.domain.d;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import io.reactivex.w;
import io.reactivex.y;
import java.util.List;
import java.util.Map;

/* renamed from: io1  reason: default package */
public final class io1 {

    /* access modifiers changed from: package-private */
    /* renamed from: io1$a */
    public static final class a implements io.reactivex.functions.a {
        final /* synthetic */ SharePreviewMenuFragment a;

        a(SharePreviewMenuFragment sharePreviewMenuFragment) {
            this.a = sharePreviewMenuFragment;
        }

        @Override // io.reactivex.functions.a
        public final void run() {
            this.a.M4();
        }
    }

    public static final w<c, d> a(List<? extends cmf<com.spotify.mobile.android.share.menu.preview.api.d>> list, Map<String, ? extends rmf<? super com.spotify.mobile.android.share.menu.preview.api.a, ? super com.spotify.mobile.android.share.menu.preview.api.c, ? extends h>> map, SharePreviewMenuFragment sharePreviewMenuFragment, y yVar) {
        kotlin.jvm.internal.h.e(list, "sharePayloadProviderList");
        kotlin.jvm.internal.h.e(map, "shareDestinationActionMap");
        kotlin.jvm.internal.h.e(sharePreviewMenuFragment, "sharePreviewMenuFragment");
        kotlin.jvm.internal.h.e(yVar, "ioScheduler");
        m f = i.f();
        kotlin.jvm.internal.h.e(list, "sharePayloadProviderList");
        kotlin.jvm.internal.h.e(yVar, "ioScheduler");
        f.h(c.b.class, new eo1(yVar, list));
        kotlin.jvm.internal.h.e(map, "shareDestinationActionMap");
        f.h(c.C0188c.class, new ho1(map));
        f.b(c.a.class, new a(sharePreviewMenuFragment));
        return f.i();
    }
}
