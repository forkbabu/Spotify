package defpackage;

import android.os.Environment;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.music.json.e;
import com.spotify.music.json.g;
import io.reactivex.functions.l;
import io.reactivex.y;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: h81  reason: default package */
public class h81 {
    private final g a;
    private final y b;

    /* access modifiers changed from: private */
    /* renamed from: h81$b */
    public static class b implements l<Long, Long> {
        private final String a;

        b(String str, a aVar) {
            this.a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Long apply(Long l) {
            try {
                return Long.valueOf(new File(this.a).lastModified());
            } catch (Exception unused) {
                return 0L;
            }
        }
    }

    public h81(g gVar, y yVar) {
        this.a = gVar;
        this.b = yVar;
    }

    public io.reactivex.g<b91> a() {
        String str = Environment.getExternalStorageDirectory().getPath() + "/hubs-live.json";
        TimeUnit timeUnit = TimeUnit.SECONDS;
        int i = io.reactivex.g.b;
        return io.reactivex.g.M(1, 1, timeUnit, io.reactivex.schedulers.a.a()).e0(this.b).O(new b(str, null)).C(e81.a).s().F(new f81(this, str));
    }

    public HubsJsonViewModel b(String str) {
        Logger.b("Loading model from %s", str);
        e b2 = this.a.b();
        b2.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (HubsJsonViewModel) b2.build().readValue(new File(str), HubsJsonViewModel.class);
    }
}
