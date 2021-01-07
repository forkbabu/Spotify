package com.spotify.android.glue.patterns.contextmenu.glue;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;

public class m implements n {
    private final Context a;
    private final Picasso b;
    private final View c;
    private final ImageView d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private final TextView h;
    private final TextView i;
    private final int j;
    private final ViewTreeObserver.OnGlobalLayoutListener k;
    private final View.OnClickListener l = new b();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            m.this.e();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m.this.h.setMaxLines(Integer.MAX_VALUE);
            m.this.i.setVisibility(8);
        }
    }

    public m(Context context, Picasso picasso, String str) {
        a aVar = new a();
        this.k = aVar;
        this.a = context;
        this.b = picasso;
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.glue_context_menu_header, (ViewGroup) null);
        this.c = inflate;
        this.d = (ImageView) inflate.findViewById(C0707R.id.image);
        this.e = (TextView) inflate.findViewById(C0707R.id.title);
        this.f = (TextView) inflate.findViewById(C0707R.id.subtitle);
        this.g = (TextView) inflate.findViewById(C0707R.id.description_header);
        TextView textView = (TextView) inflate.findViewById(C0707R.id.description);
        this.h = textView;
        TextView textView2 = (TextView) inflate.findViewById(C0707R.id.description_show_more);
        this.i = textView2;
        textView.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new SpotifyIconDrawable(context, SpotifyIcon.CHEVRON_DOWN_16, (float) context.getResources().getDimensionPixelSize(C0707R.dimen.context_menu_description_show_more_drawable_size)), (Drawable) null);
        textView2.setText(str);
        this.j = context.getResources().getInteger(C0707R.integer.context_menu_description_max_lines);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void e() {
        Layout layout;
        TextView textView = this.h;
        if (textView != null && (layout = textView.getLayout()) != null) {
            int lineCount = layout.getLineCount();
            boolean z = true;
            int i2 = 0;
            if (lineCount <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
                z = false;
            }
            TextView textView2 = this.i;
            if (!z) {
                i2 = 8;
            }
            textView2.setVisibility(i2);
            View.OnClickListener onClickListener = null;
            this.i.setOnClickListener(z ? this.l : null);
            TextView textView3 = this.h;
            if (z) {
                onClickListener = this.l;
            }
            textView3.setOnClickListener(onClickListener);
            if (z) {
                this.h.setMaxLines(this.j);
            }
        }
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.glue.n
    public int a() {
        return (this.d.getHeight() / 2) + this.d.getTop() + this.c.getTop();
    }

    public void f(ContextMenuViewModel contextMenuViewModel) {
        this.e.setText(contextMenuViewModel.p());
        int i2 = 8;
        if (TextUtils.isEmpty(contextMenuViewModel.m()) && TextUtils.isEmpty(contextMenuViewModel.o())) {
            this.f.setVisibility(8);
        } else if (TextUtils.isEmpty(contextMenuViewModel.m())) {
            nud.p(this.a, this.f, C0707R.attr.pasteTextAppearanceBodySmall);
            this.f.setTextColor(androidx.core.content.a.b(this.a, R.color.white_70));
            this.f.setAllCaps(false);
            this.f.setText(contextMenuViewModel.o());
            this.f.setVisibility(0);
        } else {
            nud.p(this.a, this.f, C0707R.attr.pasteTextAppearanceMetadata);
            this.f.setAllCaps(true);
            this.f.setTextColor(androidx.core.content.a.b(this.a, R.color.white_70));
            this.f.setText(contextMenuViewModel.m());
            this.f.setVisibility(0);
        }
        ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
        if (contextMenuViewModel.t()) {
            layoutParams.width = View.MeasureSpec.makeMeasureSpec(this.a.getResources().getDimensionPixelSize(C0707R.dimen.context_menu_header_large_image_width), Integer.MIN_VALUE);
            layoutParams.height = View.MeasureSpec.makeMeasureSpec(this.a.getResources().getDimensionPixelSize(C0707R.dimen.context_menu_header_large_image_height), 1073741824);
            this.d.setAdjustViewBounds(true);
        } else if (contextMenuViewModel.s()) {
            layoutParams.width = (int) ((((float) layoutParams.height) * 16.0f) / 9.0f);
        } else {
            layoutParams.width = layoutParams.height;
        }
        this.d.setLayoutParams(layoutParams);
        ImageView imageView = this.d;
        Uri j2 = contextMenuViewModel.j();
        boolean r = contextMenuViewModel.r();
        SpotifyIconV2 n = contextMenuViewModel.n();
        if (j2 == null || TextUtils.isEmpty(j2.toString())) {
            j2 = null;
        }
        Drawable m = n != null ? yc0.m(this.a, n, Float.NaN, false, false, (float) nud.g(32.0f, this.a.getResources())) : null;
        z l2 = this.b.l(j2);
        if (m != null) {
            l2.t(m);
        } else {
            l2.q();
        }
        if (m != null) {
            l2.g(m);
        }
        if (r) {
            l2.o(rwd.c(imageView));
        } else {
            l2.n(imageView, null);
        }
        this.g.setVisibility(TextUtils.isEmpty(contextMenuViewModel.h()) ? 8 : 0);
        this.g.setText(contextMenuViewModel.h());
        if (!TextUtils.isEmpty(contextMenuViewModel.g())) {
            vc0.h(this.g);
            vc0.g(this.c);
        }
        TextView textView = this.h;
        if (!TextUtils.isEmpty(contextMenuViewModel.g())) {
            i2 = 0;
        }
        textView.setVisibility(i2);
        this.h.setText(contextMenuViewModel.g());
        e();
    }

    @Override // com.spotify.android.glue.patterns.contextmenu.glue.n
    public View getView() {
        return this.c;
    }
}
