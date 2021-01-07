package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor;
import com.spotify.mobile.android.service.plugininterfaces.a;
import com.spotify.music.libs.viewuri.ViewUris;
import defpackage.t8a;

/* access modifiers changed from: package-private */
/* renamed from: q8a  reason: default package */
public class q8a implements SpotifyServiceIntentProcessor {
    private final Context a;
    private final t8a b;

    q8a(Context context, t8a.a aVar) {
        this.a = context;
        this.b = aVar.a(ViewUris.U1);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public SpotifyServiceIntentProcessor.Result a(boolean z, Intent intent) {
        String action = intent.getAction();
        action.hashCode();
        char c = 65535;
        switch (action.hashCode()) {
            case 504694202:
                if (action.equals("com.spotify.mobile.android.service.action.player.NOTIFICATION_UNBAN")) {
                    c = 0;
                    break;
                }
                break;
            case 845198323:
                if (action.equals("com.spotify.mobile.android.service.action.player.NOTIFICATION_BAN")) {
                    c = 1;
                    break;
                }
                break;
            case 1806053908:
                if (action.equals("com.spotify.mobile.android.service.action.player.NOTIFICATION_REMOVE_FROM_COLLECTION")) {
                    c = 2;
                    break;
                }
                break;
            case 2089210024:
                if (action.equals("com.spotify.mobile.android.service.action.player.NOTIFICATION_ADD_TO_COLLECTION")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                String stringExtra = intent.getStringExtra("uri");
                String stringExtra2 = intent.getStringExtra("context_source");
                if (!(stringExtra == null || stringExtra2 == null)) {
                    new t7a(this.a, ViewUris.U1).b(stringExtra, stringExtra2, false);
                    break;
                }
            case 1:
                String stringExtra3 = intent.getStringExtra("uri");
                String stringExtra4 = intent.getStringExtra("context_source");
                if (!(stringExtra3 == null || stringExtra4 == null)) {
                    new t7a(this.a, ViewUris.U1).a(stringExtra3, stringExtra4, false);
                    break;
                }
            case 2:
                this.b.f(intent.getStringExtra("uri"), false);
                break;
            case 3:
                this.b.a(intent.getStringExtra("uri"), intent.getStringExtra("context_source"), false);
                break;
        }
        return SpotifyServiceIntentProcessor.Result.IGNORABLE;
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor
    public /* synthetic */ SpotifyServiceIntentProcessor.Result b(boolean z, Intent intent, SpotifyServiceIntentProcessor.a aVar) {
        return a.a(this, z, intent, aVar);
    }
}
