package defpackage;

import com.google.common.base.MoreObjects;
import io.reactivex.functions.l;

/* renamed from: z2b  reason: default package */
public final /* synthetic */ class z2b implements l {
    public static final /* synthetic */ z2b a = new z2b();

    private /* synthetic */ z2b() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        b91 b91 = (b91) obj;
        b91.getClass();
        String title = b91.title();
        return MoreObjects.isNullOrEmpty(title) ? "" : title;
    }
}
