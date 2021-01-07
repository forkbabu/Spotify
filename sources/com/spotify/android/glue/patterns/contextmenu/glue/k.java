package com.spotify.android.glue.patterns.contextmenu.glue;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.c;
import com.spotify.android.glue.patterns.contextmenu.glue.view.CheckableTextView;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;

public class k implements wa0 {
    private final Context a;
    private final ua0 b;
    private final LinearLayout.LayoutParams c = new LinearLayout.LayoutParams(-1, -2);
    private final m d;
    private final xa0 e;
    private ContextMenuViewModel f;

    class a implements View.OnClickListener {
        final /* synthetic */ b a;
        final /* synthetic */ CheckableTextView b;

        a(b bVar, CheckableTextView checkableTextView) {
            this.a = bVar;
            this.b = checkableTextView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.i();
            if (this.a.p()) {
                k.this.b.onDismiss();
            } else {
                b bVar = this.a;
                bVar.k(!bVar.f());
                this.b.setChecked(this.a.f());
            }
            nqe a2 = this.a.a();
            if (a2 != null) {
                k.this.e.a(a2);
            }
        }
    }

    public k(Context context, ua0 ua0, m mVar, xa0 xa0) {
        this.a = context;
        this.b = ua0;
        this.d = mVar;
        this.e = xa0;
    }

    @Override // defpackage.wa0
    public int a() {
        return this.a.getResources().getInteger(this.f.k().mVisibleItemsRes);
    }

    @Override // defpackage.wa0
    public View b(int i, ViewGroup viewGroup) {
        ContextMenuViewModel.ItemAppearance k = this.f.k();
        boolean z = this.f.I() || k.mAlwaysShowIcons;
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(C0707R.dimen.context_menu_item_width);
        if (dimensionPixelSize < 0) {
            dimensionPixelSize = -1;
        }
        LinearLayout.LayoutParams layoutParams = this.c;
        layoutParams.gravity = k.mGravity;
        layoutParams.width = dimensionPixelSize;
        b bVar = this.f.l().get(i);
        if (!bVar.g()) {
            CheckableTextView checkableTextView = (CheckableTextView) LayoutInflater.from(this.a).inflate(k.mLayoutRes, viewGroup, false);
            checkableTextView.setActivated(bVar.e());
            bvd bvd = new bvd(checkableTextView, dvd.d.a().floatValue());
            bvd.g(checkableTextView);
            bvd.a();
            checkableTextView.setText(bVar.d());
            checkableTextView.setLayoutParams(this.c);
            checkableTextView.setChecked(bVar.f());
            Drawable orNull = bVar.b().orNull();
            if (!z) {
                orNull = null;
            }
            c.h(checkableTextView, orNull, null, null, null);
            checkableTextView.setEnabled(bVar.h());
            checkableTextView.setOnClickListener(new a(bVar, checkableTextView));
            return checkableTextView;
        }
        View view = new View(this.a);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(dimensionPixelSize, this.a.getResources().getDimensionPixelSize(C0707R.dimen.context_menu_divider_height));
        layoutParams2.gravity = k.mGravity;
        layoutParams2.topMargin = this.a.getResources().getDimensionPixelSize(C0707R.dimen.context_menu_divider_padding_top);
        layoutParams2.bottomMargin = this.a.getResources().getDimensionPixelSize(C0707R.dimen.context_menu_divider_padding_bottom);
        view.setLayoutParams(layoutParams2);
        view.setBackgroundColor(androidx.core.content.a.b(this.a, R.color.gray_15));
        return view;
    }

    @Override // defpackage.wa0
    public int c() {
        return this.f.l().size();
    }

    public void f(ContextMenuViewModel contextMenuViewModel) {
        this.f = contextMenuViewModel;
        this.d.f(contextMenuViewModel);
    }

    @Override // defpackage.wa0
    public n getHeader() {
        return this.d;
    }
}
