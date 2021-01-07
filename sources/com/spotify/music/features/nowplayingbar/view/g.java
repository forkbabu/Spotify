package com.spotify.music.features.nowplayingbar.view;

import android.content.Context;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.music.C0707R;
import com.spotify.music.sociallistening.models.b;
import defpackage.k4d;
import kotlin.jvm.internal.h;

public final /* synthetic */ class g implements ea2 {
    public final /* synthetic */ GaiaDevice a;
    public final /* synthetic */ b b;

    public /* synthetic */ g(GaiaDevice gaiaDevice, b bVar) {
        this.a = gaiaDevice;
        this.b = bVar;
    }

    @Override // defpackage.ea2
    public final Object apply(Object obj) {
        GaiaDevice gaiaDevice = this.a;
        b bVar = this.b;
        Context context = (Context) obj;
        k4d.a aVar = k4d.a;
        h.e(context, "context");
        h.e(bVar, "socialListeningState");
        h.e(context, "context");
        h.e(bVar, "socialListeningState");
        StringBuilder sb = new StringBuilder();
        if (gaiaDevice != null && !gaiaDevice.isSelf()) {
            sb.append(gaiaDevice.getName());
        }
        int size = bVar.d().size();
        if (size >= 2) {
            if (sb.length() > 0) {
                sb.append(" • ");
            }
            sb.append(context.getResources().getQuantityString(C0707R.plurals.social_listening_participants_listening, size, Integer.valueOf(size)));
        }
        String sb2 = sb.toString();
        h.d(sb2, "nameStringBuilder.toString()");
        return sb2;
    }
}
