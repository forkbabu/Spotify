package com.google.android.gms.cast.framework.media;

import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.framework.media.h;
import com.google.android.gms.cast.internal.q;
import com.google.android.gms.cast.internal.s;
import com.google.android.gms.common.api.Status;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class u implements s {
    private final /* synthetic */ h.g a;

    u(h.g gVar, h hVar) {
        this.a = gVar;
    }

    @Override // com.google.android.gms.cast.internal.s
    public final void a(long j) {
        try {
            h.g gVar = this.a;
            Status status = new Status(2103, (String) null);
            gVar.getClass();
            gVar.a(new t(status));
        } catch (IllegalStateException e) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestReplaced", e);
        }
    }

    @Override // com.google.android.gms.cast.internal.s
    public final void b(long j, int i, Object obj) {
        MediaError mediaError = null;
        q qVar = obj instanceof q ? (q) obj : null;
        try {
            h.g gVar = this.a;
            Status status = new Status(i, (String) null);
            JSONObject jSONObject = qVar != null ? qVar.a : null;
            if (qVar != null) {
                mediaError = qVar.b;
            }
            gVar.a(new h.C0093h(status, jSONObject, mediaError));
        } catch (IllegalStateException e) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestCompleted", e);
        }
    }
}
