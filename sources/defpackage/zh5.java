package defpackage;

import com.spotify.music.features.home.common.viewbinder.v;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.pageloader.ObservableLoadable;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.o0;
import com.spotify.pageloader.p0;
import com.spotify.pageloader.t0;
import com.spotify.remoteconfig.AndroidFeatureHomeProperties;
import io.reactivex.s;

/* renamed from: zh5  reason: default package */
public final class zh5 implements fjf<yh5> {
    public static yh5 a(ImpressionLogger impressionLogger) {
        return new yh5(impressionLogger);
    }

    public static o0<s<b91>> b(vh5 vh5) {
        return ObservableLoadable.a(vh5.e());
    }

    public static t0<s<b91>> c(zac zac, o0<s<b91>> o0Var, Object obj) {
        return new p0(zac.a(o0Var), (yh5) obj);
    }

    public static PageLoaderView.a<s<b91>> d(AndroidFeatureHomeProperties androidFeatureHomeProperties, v vVar, fi5 fi5) {
        PageLoaderView.a<s<b91>> aVar = new PageLoaderView.a<>();
        aVar.i(uh5.a);
        aVar.e(new th5(vVar, fi5));
        if (androidFeatureHomeProperties.c() == AndroidFeatureHomeProperties.HomePageloader.SKELETON) {
            aVar.i(hh5.a);
        }
        return aVar;
    }
}
