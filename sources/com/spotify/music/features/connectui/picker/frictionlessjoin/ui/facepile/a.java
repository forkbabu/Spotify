package com.spotify.music.features.connectui.picker.frictionlessjoin.ui.facepile;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.spotify.music.C0707R;
import com.spotify.music.features.connectui.picker.frictionlessjoin.model.d;
import com.squareup.picasso.Picasso;
import java.util.Collection;
import java.util.List;

public class a extends RecyclerView.e<C0224a> {
    private final Context c;
    private final Picasso f;
    private final tq4 n;
    private final lqa o;
    private ImmutableList<d> p;

    /* renamed from: com.spotify.music.features.connectui.picker.frictionlessjoin.ui.facepile.a$a  reason: collision with other inner class name */
    public static class C0224a extends RecyclerView.b0 {
        private final ImageView C;

        public C0224a(View view) {
            super(view);
            ImageView imageView = (ImageView) view.findViewById(C0707R.id.facepile_face_image);
            this.C = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    public a(Activity activity, Picasso picasso, tq4 tq4, lqa lqa) {
        this.c = activity.getBaseContext();
        this.f = picasso;
        this.n = tq4;
        this.o = lqa;
        U(true);
    }

    private boolean X() {
        return this.p.size() > 2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0028: APUT  
      (r2v1 java.lang.Object[])
      (0 ??[int, short, byte, char])
      (wrap: java.lang.Integer : 0x0024: INVOKE  (r0v3 java.lang.Integer) = (r3v2 int) type: STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer)
     */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(C0224a aVar, int i) {
        C0224a aVar2 = aVar;
        if (i != 1 || !X()) {
            d dVar = this.p.get(i);
            this.o.a(aVar2.C, dVar.b(), dVar.c(), dVar.a(), false, null);
            aVar2.C.setContentDescription(dVar.a());
            return;
        }
        Context context = this.c;
        Object[] objArr = new Object[1];
        objArr[0] = Integer.valueOf(X() ? (this.p.size() - 2) + 1 : 0);
        String string = context.getString(C0707R.string.device_picker_facepile_overflow_character, objArr);
        this.f.b(aVar2.C);
        aVar2.C.setImageDrawable(this.n.a(string, this.c.getResources().getColor(C0707R.color.face_background_gray_20)));
        aVar2.C.setContentDescription(string);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public C0224a M(ViewGroup viewGroup, int i) {
        return new C0224a(je.G(viewGroup, C0707R.layout.facepile_face, viewGroup, false));
    }

    public void Y(List<d> list) {
        if (!rw.equal(this.p, list)) {
            this.p = ImmutableList.copyOf((Collection) list);
            z();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        if (this.p == null) {
            return 0;
        }
        if (X()) {
            return 2;
        }
        return this.p.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        if (i != 1 || !X()) {
            return (long) this.p.get(i).c().hashCode();
        }
        return 0;
    }
}
