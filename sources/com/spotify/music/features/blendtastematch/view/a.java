package com.spotify.music.features.blendtastematch.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.features.blendtastematch.BlendTasteMatchInjector;
import com.spotify.music.features.blendtastematch.api.TasteMatch;
import com.spotify.music.features.blendtastematch.api.c;
import com.spotify.music.features.blendtastematch.api.d;
import com.spotify.pageloader.s0;
import com.squareup.picasso.Picasso;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

public final class a implements s0 {
    public MobiusLoop.g<w44, t44> a;
    private c b;
    private final BlendTasteMatchInjector c;
    private final String f;
    private final Picasso n;
    private final d o;

    public a(BlendTasteMatchInjector blendTasteMatchInjector, String str, Picasso picasso, d dVar) {
        h.e(blendTasteMatchInjector, "injector");
        h.e(str, "invitationToken");
        h.e(picasso, "picasso");
        h.e(dVar, "tasteMatchResponse");
        this.c = blendTasteMatchInjector;
        this.f = str;
        this.n = picasso;
        this.o = dVar;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        c cVar = this.b;
        if (cVar != null) {
            return cVar.e();
        }
        return null;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        w44 w44;
        h.e(context, "context");
        h.e(viewGroup, "parent");
        h.e(layoutInflater, "inflater");
        this.b = new c(layoutInflater, this.n);
        d dVar = this.o;
        if (dVar instanceof TasteMatch) {
            TasteMatch tasteMatch = (TasteMatch) dVar;
            w44 = new w44(new c54(f54.a, this.f, tasteMatch.getSender().getName(), tasteMatch.getSender().getImageUrl(), tasteMatch.getRecipient().getImageUrl(), tasteMatch.getRecipient().getName(), tasteMatch.getTasteMatch(), tasteMatch.getPlaylistUri()));
        } else if (dVar instanceof c) {
            w44 = new w44(a54.a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        MobiusLoop.g<w44, t44> a2 = this.c.a(w44);
        this.a = a2;
        if (a2 != null) {
            c cVar = this.b;
            h.c(cVar);
            a2.c(cVar);
            return;
        }
        h.k("controller");
        throw null;
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        MobiusLoop.g<w44, t44> gVar = this.a;
        if (gVar != null) {
            gVar.start();
        } else {
            h.k("controller");
            throw null;
        }
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        MobiusLoop.g<w44, t44> gVar = this.a;
        if (gVar != null) {
            gVar.stop();
            MobiusLoop.g<w44, t44> gVar2 = this.a;
            if (gVar2 != null) {
                gVar2.d();
            } else {
                h.k("controller");
                throw null;
            }
        } else {
            h.k("controller");
            throw null;
        }
    }
}
