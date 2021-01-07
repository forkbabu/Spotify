package com.spotify.music.marquee.trigger;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.spotify.music.marquee.MarqueeActivity;
import io.reactivex.functions.l;

public final /* synthetic */ class d implements l {
    public final /* synthetic */ tjb a;
    public final /* synthetic */ Context b;

    public /* synthetic */ d(tjb tjb, Context context) {
        this.a = tjb;
        this.b = context;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        F f;
        tjb tjb = this.a;
        Context context = this.b;
        u3 u3Var = (u3) obj;
        S s = u3Var.b;
        if (!(s == null || (f = u3Var.a) == null)) {
            hjb a2 = f.a();
            tjb.getClass();
            int i = MarqueeActivity.I;
            Intent intent = new Intent(context, MarqueeActivity.class);
            intent.putExtra("extra_marquee", a2);
            intent.putExtra("FlagsArgumentHelper.Flags", (Parcelable) s);
            intent.setFlags(268500992);
            context.startActivity(intent);
        }
        return z.a;
    }
}
