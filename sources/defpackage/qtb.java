package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.util.t;
import com.spotify.mobile.android.util.x;
import io.reactivex.s;
import java.util.Map;

/* renamed from: qtb  reason: default package */
public class qtb {
    private final rtb a;
    private final Map<String, String> b;

    public qtb(rtb rtb, cqe cqe, t tVar, String str, Context context) {
        this.a = rtb;
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put("signal", "is_car_connected:true");
        builder.mo51put("client-platform", "android");
        builder.mo51put("client-locale", str);
        builder.mo51put("client-timezone", cqe.f().getID());
        builder.mo51put("client-version", tVar.c());
        builder.mo51put("tablet-layout", String.valueOf(x.g(context)));
        this.b = builder.build();
    }

    public s<b91> a() {
        return this.a.a(this.b).P().h(b91.class);
    }
}
