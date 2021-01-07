package com.spotify.music.nowplaying.drivingmode.view.backgroundgradients;

import android.content.Context;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import io.reactivex.functions.l;

public final /* synthetic */ class a implements l {
    public final /* synthetic */ Context a;

    public /* synthetic */ a(Context context) {
        this.a = context;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Context context = this.a;
        Integer num = (Integer) obj;
        return num.intValue() == androidx.core.content.a.b(context, R.color.black) ? Integer.valueOf(androidx.core.content.a.b(context, C0707R.color.driving_npv_fallback_color)) : num;
    }
}
