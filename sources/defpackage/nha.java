package defpackage;

import android.content.Context;
import androidx.core.os.b;
import com.google.protobuf.u;
import com.spotify.localization.SpotifyLocale;
import com.spotify.messages.LanguageSelection;
import com.spotify.mobile.android.service.plugininterfaces.d;
import java.util.ArrayList;

/* renamed from: nha  reason: default package */
public class nha implements d {
    private final Context a;
    private final gl0<u> b;

    public nha(Context context, gl0<u> gl0) {
        this.a = context;
        this.b = gl0;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        gl0<u> gl0 = this.b;
        Context context = this.a;
        LanguageSelection.b l = LanguageSelection.l();
        b i = e2.i(context.getResources().getConfiguration());
        int c = i.c();
        String[] split = i.d().split(",");
        ArrayList arrayList = new ArrayList(c);
        for (int i2 = 0; i2 < c; i2++) {
            arrayList.add(split[i2].trim());
        }
        l.m(arrayList);
        l.n(SpotifyLocale.c());
        gl0.c(l.build());
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "LanguageMetrics";
    }
}
