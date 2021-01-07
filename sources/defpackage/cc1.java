package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.mobile.android.service.j;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.a;
import com.spotify.mobile.android.util.o0;
import com.spotify.music.libs.web.RxWebToken;
import com.spotify.music.z0;

/* renamed from: cc1  reason: default package */
public class cc1 implements SpotifyServiceIntentProcessor {
    private final Context a;
    private final RxWebToken b;
    private final o0 c;
    private final yu7 f;
    private final z0 n;

    public cc1(Context context, RxWebToken rxWebToken, z0 z0Var, o0 o0Var, yu7 yu7) {
        this.a = context;
        this.b = rxWebToken;
        this.n = z0Var;
        this.c = o0Var;
        this.f = yu7;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public SpotifyServiceIntentProcessor.Result a(boolean z, Intent intent) {
        Uri data = intent.getData();
        Intent intent2 = (Intent) intent.getParcelableExtra("log_intent");
        j.B(this.a, this.b, this.n, data, this.c);
        if (intent2 != null) {
            this.a.startService(intent2);
        }
        this.f.getClass();
        if (intent.hasExtra("push_data")) {
            this.f.a(intent);
        }
        return SpotifyServiceIntentProcessor.Result.IGNORABLE;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public /* synthetic */ SpotifyServiceIntentProcessor.Result b(boolean z, Intent intent, SpotifyServiceIntentProcessor.a aVar) {
        return a.a(this, z, intent, aVar);
    }
}
