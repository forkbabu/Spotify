package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.service.media.browser.BrowserParams;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.o;
import com.spotify.mobile.android.util.l0;
import io.reactivex.s;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: nh1  reason: default package */
public class nh1 implements qh1 {
    private final s<String> a;
    private final faa b;
    private final o c;
    private final Context d;

    public nh1(Context context, o oVar, s<String> sVar, gaa gaa) {
        this.d = context;
        this.c = oVar;
        this.a = sVar;
        faa b2 = gaa.b();
        this.b = b2;
        b2.b().h(new ane("addTime", false, null, 6));
    }

    @Override // defpackage.qh1
    public /* synthetic */ z a(BrowserParams browserParams, Map map) {
        return ph1.a(this, browserParams, map);
    }

    @Override // defpackage.qh1
    public z<List<MediaBrowserItem>> b(BrowserParams browserParams) {
        this.b.b().d(false, !browserParams.n(), false);
        s<String> sVar = this.a;
        faa faa = this.b;
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Boolean bool = Boolean.TRUE;
        builder.mo51put("link", bool);
        builder.mo51put("name", bool);
        builder.mo51put("offline", bool);
        builder.mo51put("playable", bool);
        builder.mo51put("available", bool);
        builder.mo51put("isExplicit", bool);
        builder.mo51put("inCollection", bool);
        builder.mo51put("hasLyrics", bool);
        builder.mo51put("trackDescriptors", bool);
        builder.mo51put("covers", bool);
        return s.n(sVar, faa.a(builder.build()), new rf1(this, browserParams)).N0(1).B0();
    }

    public /* synthetic */ List c(BrowserParams browserParams, String str, ni0 ni0) {
        ArrayList arrayList = new ArrayList(100);
        String B = l0.a(str).B();
        if (B != null && !ni0.getItems().isEmpty()) {
            if (BrowserParams.q(browserParams.j())) {
                arrayList.add(com.spotify.mobile.android.service.media.browser.s.a(this.d, B));
            }
            for (com.spotify.playlist.models.o oVar : ni0.getItems()) {
                arrayList.add(this.c.i(oVar, B));
            }
        }
        return arrayList;
    }
}
