package defpackage;

import com.google.common.base.Function;
import com.spotify.mobile.android.util.SortOption;

/* renamed from: oj3  reason: default package */
public final /* synthetic */ class oj3 implements Function {
    public static final /* synthetic */ oj3 a = new oj3();

    private /* synthetic */ oj3() {
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        ane ane = (ane) obj;
        int i = pj3.d;
        SortOption sortOption = new SortOption(ane.c(), true);
        sortOption.h(ane.e(), false);
        return sortOption;
    }
}
