package com.google.android.gms.internal.cast;

import android.content.Context;
import android.view.View;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.media.h;
import com.spotify.music.C0707R;
import java.util.Iterator;
import java.util.List;

public final class y extends vq {
    private final View b;
    private final String c;
    private final String d;

    public y(View view, Context context) {
        this.b = view;
        this.c = context.getString(C0707R.string.cast_closed_captions);
        this.d = context.getString(C0707R.string.cast_closed_captions_unavailable);
        view.setEnabled(false);
    }

    private final void g() {
        boolean z;
        List<MediaTrack> I1;
        h b2 = b();
        if (b2 != null && b2.m()) {
            MediaInfo h = b2.h();
            if (h != null && (I1 = h.I1()) != null && !I1.isEmpty()) {
                Iterator<MediaTrack> it = I1.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    MediaTrack next = it.next();
                    if (next.getType() == 2) {
                        i++;
                        if (i > 1) {
                            break;
                        }
                    } else if (next.getType() == 1) {
                        break;
                    }
                }
                z = true;
                if (z && !b2.s()) {
                    this.b.setEnabled(true);
                    this.b.setContentDescription(this.c);
                    return;
                }
            }
            z = false;
            this.b.setEnabled(true);
            this.b.setContentDescription(this.c);
            return;
        }
        this.b.setEnabled(false);
        this.b.setContentDescription(this.d);
    }

    @Override // defpackage.vq
    public final void c() {
        g();
    }

    @Override // defpackage.vq
    public final void d() {
        this.b.setEnabled(false);
    }

    @Override // defpackage.vq
    public final void e(c cVar) {
        super.e(cVar);
        this.b.setEnabled(true);
        g();
    }

    @Override // defpackage.vq
    public final void f() {
        this.b.setEnabled(false);
        super.f();
    }
}
