package com.spotify.libs.onboarding.allboarding.search;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.allboarding.model.v1.proto.SearchItem;
import com.squareup.picasso.Picasso;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class b extends RecyclerView.b0 {
    private final ImageView C;
    private final TextView D;
    private final TextView E;
    private final View F;
    private final Picasso G;
    private final rmf<Integer, SearchItem, f> H;
    private final rmf<Integer, SearchItem, f> I;

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {
        final /* synthetic */ b a;
        final /* synthetic */ SearchItem b;

        a(b bVar, SearchItem searchItem) {
            this.a = bVar;
            this.b = searchItem;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            rmf rmf = this.a.H;
            if (rmf != null) {
                f fVar = (f) rmf.invoke(Integer.valueOf(this.a.w()), this.b);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: rmf<? super java.lang.Integer, ? super com.spotify.allboarding.model.v1.proto.SearchItem, kotlin.f> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: rmf<? super java.lang.Integer, ? super com.spotify.allboarding.model.v1.proto.SearchItem, kotlin.f> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view, Picasso picasso, rmf<? super Integer, ? super SearchItem, f> rmf, rmf<? super Integer, ? super SearchItem, f> rmf2) {
        super(view);
        h.e(view, "view");
        h.e(picasso, "picasso");
        this.F = view;
        this.G = picasso;
        this.H = rmf;
        this.I = rmf2;
        this.C = (ImageView) view.findViewById(16908294);
        this.D = (TextView) view.findViewById(16908308);
        this.E = (TextView) view.findViewById(16908309);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        if ((r2.length() > 0) == true) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j0(com.spotify.allboarding.model.v1.proto.SearchItem r6) {
        /*
            r5 = this;
            java.lang.String r0 = "searchItem"
            kotlin.jvm.internal.h.e(r6, r0)
            rmf<java.lang.Integer, com.spotify.allboarding.model.v1.proto.SearchItem, kotlin.f> r0 = r5.I
            if (r0 == 0) goto L_0x0017
            int r1 = r5.w()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.invoke(r1, r6)
            kotlin.f r0 = (kotlin.f) r0
        L_0x0017:
            android.widget.TextView r0 = r5.D
            java.lang.String r1 = "title"
            kotlin.jvm.internal.h.d(r0, r1)
            java.lang.String r1 = r6.o()
            r0.setText(r1)
            android.widget.TextView r0 = r5.E
            java.lang.String r1 = "subTitle"
            kotlin.jvm.internal.h.d(r0, r1)
            com.spotify.allboarding.model.v1.proto.NullableString r2 = r6.n()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0046
            java.lang.String r2 = r2.i()
            if (r2 == 0) goto L_0x0046
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0042
            r2 = 1
            goto L_0x0043
        L_0x0042:
            r2 = 0
        L_0x0043:
            if (r2 != r3) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r3 = 0
        L_0x0047:
            if (r3 == 0) goto L_0x004b
            r2 = 0
            goto L_0x004d
        L_0x004b:
            r2 = 8
        L_0x004d:
            r0.setVisibility(r2)
            android.widget.TextView r0 = r5.E
            kotlin.jvm.internal.h.d(r0, r1)
            com.spotify.allboarding.model.v1.proto.NullableString r2 = r6.n()
            r3 = 0
            if (r2 == 0) goto L_0x0061
            java.lang.String r2 = r2.i()
            goto L_0x0062
        L_0x0061:
            r2 = r3
        L_0x0062:
            r0.setText(r2)
            android.widget.TextView r0 = r5.E
            kotlin.jvm.internal.h.d(r0, r1)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L_0x00ea
            r2 = r1
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r2.topMargin = r4
            r0.setLayoutParams(r1)
            com.spotify.allboarding.model.v1.proto.SearchItem$SearchItemType r0 = r6.p()
            com.spotify.allboarding.model.v1.proto.SearchItem$SearchItemType r1 = com.spotify.allboarding.model.v1.proto.SearchItem.SearchItemType.SHOW
            if (r0 != r1) goto L_0x008b
            android.view.View r0 = r5.F
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r0 = defpackage.yc0.g(r0)
            goto L_0x0095
        L_0x008b:
            android.view.View r0 = r5.F
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r0 = defpackage.yc0.a(r0)
        L_0x0095:
            com.spotify.allboarding.model.v1.proto.NullableString r1 = r6.i()
            java.lang.String r2 = "searchItem.imageUrl"
            kotlin.jvm.internal.h.d(r1, r2)
            java.lang.String r1 = r1.i()
            if (r1 == 0) goto L_0x00da
            boolean r2 = kotlin.text.e.n(r1)
            if (r2 == 0) goto L_0x00ab
            goto L_0x00da
        L_0x00ab:
            com.squareup.picasso.Picasso r2 = r5.G
            com.squareup.picasso.z r1 = r2.m(r1)
            r1.t(r0)
            r1.g(r0)
            com.spotify.allboarding.model.v1.proto.SearchItem$SearchItemType r0 = r6.p()
            com.spotify.allboarding.model.v1.proto.SearchItem$SearchItemType r2 = com.spotify.allboarding.model.v1.proto.SearchItem.SearchItemType.ARTIST
            if (r0 != r2) goto L_0x00ce
            r1.i()
            r1.a()
            cwd r0 = new cwd
            r0.<init>()
            r1.x(r0)
            goto L_0x00d4
        L_0x00ce:
            r1.i()
            r1.a()
        L_0x00d4:
            android.widget.ImageView r0 = r5.C
            r1.n(r0, r3)
            goto L_0x00df
        L_0x00da:
            android.widget.ImageView r1 = r5.C
            r1.setImageDrawable(r0)
        L_0x00df:
            android.view.View r0 = r5.F
            com.spotify.libs.onboarding.allboarding.search.b$a r1 = new com.spotify.libs.onboarding.allboarding.search.b$a
            r1.<init>(r5, r6)
            r0.setOnClickListener(r1)
            return
        L_0x00ea:
            kotlin.TypeCastException r6 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.libs.onboarding.allboarding.search.b.j0(com.spotify.allboarding.model.v1.proto.SearchItem):void");
    }
}
