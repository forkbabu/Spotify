package com.spotify.music.libs.assistedcuration.adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.libs.assistedcuration.b;
import com.spotify.music.libs.assistedcuration.model.h;
import com.spotify.music.preview.q;
import com.squareup.picasso.Picasso;
import defpackage.kz9;
import defpackage.pz9;
import defpackage.rz9;

public class AssistedCurationCardAdapter extends RecyclerView.e<tz9> {
    private final a c;
    private final q f;
    private final Picasso n;
    private final b o;
    private h p;
    private boolean q;
    private boolean r;

    /* access modifiers changed from: package-private */
    public enum Type {
        SECTION_HEADER,
        TRACK_ITEM,
        SECTION_FOOTER;
        
        private static final Type[] f = values();
    }

    public interface a extends pz9.a, rz9.a {
    }

    public AssistedCurationCardAdapter(a aVar, q qVar, Picasso picasso, b bVar) {
        this.c = aVar;
        this.f = qVar;
        this.n = picasso;
        this.o = bVar;
        U(true);
    }

    private static Type X(int i) {
        if (i >= 0 && i < Type.f.length) {
            return Type.f[i];
        }
        throw new IllegalArgumentException("Unsupported view type");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(tz9 tz9, int i) {
        tz9 tz92 = tz9;
        int ordinal = X(w(i)).ordinal();
        if (ordinal == 0) {
            h hVar = this.p;
            kz9.a aVar = (kz9.a) l70.o(((qz9) tz92).a, kz9.a.class);
            aVar.setTitle(hVar.getTitle());
            aVar.getSubtitleView().setVisibility(8);
            aVar.S(false);
        } else if (ordinal == 1) {
            h hVar2 = this.p;
            int i2 = i - 1;
            ((rz9) tz92).h0(hVar2, hVar2.f().get(i2), i2, this.r, this.q);
        } else if (ordinal == 2) {
            ((pz9) tz92).h0(this.p);
        } else {
            throw new IllegalArgumentException("Unsupported view type");
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public tz9 M(ViewGroup viewGroup, int i) {
        int ordinal = X(i).ordinal();
        if (ordinal == 0) {
            return new qz9(viewGroup);
        }
        if (ordinal == 1) {
            return new rz9(viewGroup, this.c, this.f, this.n, this.o);
        }
        if (ordinal == 2) {
            return new pz9(viewGroup, this.c, this.o);
        }
        throw new IllegalArgumentException("Unsupported view type");
    }

    public void Y(h hVar, boolean z, boolean z2) {
        this.p = hVar;
        this.q = z2;
        this.r = z;
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        h hVar = this.p;
        if (hVar != null) {
            return hVar.f().size() + 2;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        int hashCode;
        String d = this.p.d();
        int ordinal = X(w(i)).ordinal();
        if (ordinal == 0) {
            hashCode = ("header" + d).hashCode();
        } else if (ordinal == 1) {
            hashCode = (this.p.f().get(i - 1).getUri() + d).hashCode();
        } else if (ordinal == 2) {
            hashCode = ("footer" + d).hashCode();
        } else {
            throw new IllegalArgumentException("Unsupported view type");
        }
        return (long) hashCode;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        if (i == 0) {
            Type type = Type.SECTION_HEADER;
            return 0;
        } else if (i < this.p.f().size() + 1) {
            Type type2 = Type.TRACK_ITEM;
            return 1;
        } else {
            Type type3 = Type.SECTION_FOOTER;
            return 2;
        }
    }
}
