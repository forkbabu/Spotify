package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;
import com.spotify.music.C0707R;

/* renamed from: xn4  reason: default package */
public final /* synthetic */ class xn4 implements Supplier {
    public final /* synthetic */ Context a;

    public /* synthetic */ xn4(Context context) {
        this.a = context;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        return Integer.valueOf(this.a.getResources().getInteger(C0707R.integer.connect_picker_max_columns));
    }
}
