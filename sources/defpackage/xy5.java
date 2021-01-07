package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.C0707R;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import defpackage.qy5;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: xy5  reason: default package */
public final class xy5 implements uy5 {
    private final qy5 a;
    private final Context b;

    public xy5(qy5.a aVar, Context context) {
        h.e(aVar, "playerIntentsFactory");
        h.e(context, "context");
        this.b = context;
        this.a = aVar.a("ads");
    }

    private final SpannableString f() {
        SpannableString spannableString = new SpannableString(this.b.getString(C0707R.string.advertisement_title));
        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 17);
        return spannableString;
    }

    @Override // defpackage.uy5
    public SpannableString a(PlayerState playerState) {
        h.e(playerState, "state");
        ContextTrack contextTrack = playerState.track().get();
        h.d(contextTrack, AppProtocol.TrackData.TYPE_TRACK);
        if (kxd.h(contextTrack)) {
            return new SpannableString(this.b.getString(C0707R.string.widget_label));
        }
        return f();
    }

    @Override // defpackage.uy5
    public SpannableString b(PlayerState playerState) {
        h.e(playerState, "state");
        ContextTrack contextTrack = playerState.track().get();
        h.d(contextTrack, AppProtocol.TrackData.TYPE_TRACK);
        if (kxd.h(contextTrack)) {
            return new SpannableString(this.b.getString(C0707R.string.sas_interruption_title));
        }
        return f();
    }

    @Override // defpackage.uy5
    public boolean c(PlayerState playerState, c cVar) {
        h.e(playerState, "state");
        ContextTrack contextTrack = playerState.track().get();
        h.d(contextTrack, AppProtocol.TrackData.TYPE_TRACK);
        return (kxd.f(contextTrack) || kxd.h(contextTrack)) && !kxd.j(contextTrack);
    }

    @Override // defpackage.uy5
    public SpannableString d(PlayerState playerState) {
        h.e(playerState, "state");
        ContextTrack contextTrack = playerState.track().get();
        h.d(contextTrack, AppProtocol.TrackData.TYPE_TRACK);
        if (kxd.h(contextTrack)) {
            return null;
        }
        String q = kxd.q(contextTrack);
        boolean z = false;
        if (q != null && q.length() > 0) {
            z = true;
        }
        if (z) {
            return new SpannableString(kxd.q(contextTrack));
        }
        return new SpannableString(this.b.getString(C0707R.string.widget_label));
    }

    @Override // defpackage.uy5
    public List<cy5> e(PlayerState playerState) {
        h.e(playerState, "state");
        return d.u(oz5.c(playerState, this.a, true), oz5.b(playerState, this.a, true), oz5.a(playerState, this.a, true));
    }
}
