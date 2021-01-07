package defpackage;

import android.view.View;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.offlinetrials.limited.logging.OfflineUserMixInteractionLogger;
import com.spotify.music.offlinetrials.limited.logging.c;

/* renamed from: vk6  reason: default package */
public class vk6 implements View.OnClickListener {
    private final String a;
    private final wec b;
    private final OfflineUserMixInteractionLogger c;

    public vk6(wec wec, String str, c cVar) {
        this.a = str;
        this.b = wec;
        this.c = cVar.b(ViewUris.b0, PageIdentifiers.OFFLINE_MIX_ENTITY);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.c.a(this.a);
        this.b.b(this.a, 30, "OfflineUserMixPlaylistTrackHandler", null, view.getContext().getString(C0707R.string.assisted_curation_description_for_offline_user_mix), new String[0]);
    }
}
