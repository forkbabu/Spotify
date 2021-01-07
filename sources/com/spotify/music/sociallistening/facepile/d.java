package com.spotify.music.sociallistening.facepile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import kotlin.jvm.internal.h;

public final class d extends RecyclerView.e<a> {
    private View.OnClickListener c;
    private ImmutableList<g> f;
    private int n = 4;
    private final Context o;
    private final Picasso p;
    private final a q;
    private final lqa r;

    public static final class a extends RecyclerView.b0 {
        private final ImageView C;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            h.e(view, "itemView");
            View findViewById = view.findViewById(C0707R.id.facepile_face_image);
            h.d(findViewById, "itemView.findViewById(R.id.facepile_face_image)");
            ImageView imageView = (ImageView) findViewById;
            this.C = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }

        public final ImageView h0() {
            return this.C;
        }
    }

    public d(Context context, Picasso picasso, a aVar, lqa lqa) {
        h.e(context, "context");
        h.e(picasso, "picasso");
        h.e(aVar, "circleDrawableFactory");
        h.e(lqa, "profilePictureLoader");
        this.o = context;
        this.p = picasso;
        this.q = aVar;
        this.r = lqa;
        ImmutableList<g> of = ImmutableList.of();
        h.d(of, "ImmutableList.of()");
        this.f = of;
        U(true);
    }

    private final boolean Y() {
        return this.f.size() > this.n;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0031: APUT  
      (r2v1 java.lang.Object[])
      (0 ??[int, short, byte, char])
      (wrap: java.lang.Integer : 0x002d: INVOKE  (r1v2 java.lang.Integer) = (r3v2 int) type: STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer)
     */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(a aVar, int i) {
        a aVar2 = aVar;
        h.e(aVar2, "viewHolder");
        if (i != this.n - 1 || !Y()) {
            g gVar = this.f.get(i);
            String a2 = gVar.a();
            String b = gVar.b();
            this.r.a(aVar2.h0(), gVar.c(), a2, b, false, null);
            aVar2.h0().setContentDescription(b);
        } else {
            Context context = this.o;
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(Y() ? (this.f.size() - this.n) + 1 : 0);
            String string = context.getString(C0707R.string.social_listening_facepile_overflow_character, objArr);
            h.d(string, "context.getString(\n     …acesCount()\n            )");
            this.p.b(aVar2.h0());
            ImageView h0 = aVar2.h0();
            a aVar3 = this.q;
            Context context2 = this.o;
            h0.setImageDrawable(aVar3.a(context2, string, androidx.core.content.a.b(context2, C0707R.color.face_background_gray_20)));
            aVar2.h0().setContentDescription(string);
        }
        aVar2.h0().setOnClickListener(new e(this));
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public a M(ViewGroup viewGroup, int i) {
        h.e(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0707R.layout.facepile_item, viewGroup, false);
        h.d(inflate, "root");
        return new a(inflate);
    }

    public final View.OnClickListener X() {
        return this.c;
    }

    public final void Z(View.OnClickListener onClickListener) {
        this.c = onClickListener;
    }

    public final void b0(ImmutableList<g> immutableList) {
        h.e(immutableList, "value");
        if (!h.a(immutableList, this.f)) {
            this.f = immutableList;
            z();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        if (Y()) {
            return this.n;
        }
        return this.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        if (i != this.n - 1 || !Y()) {
            return (long) this.f.get(i).a().hashCode();
        }
        return 0;
    }
}
