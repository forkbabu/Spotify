package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.goldenpath.a;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.ui.view.anchorbar.AnchorBar;
import com.spotify.mobile.android.ui.view.anchorbar.AnchorItem;
import com.spotify.mobile.android.ui.view.anchorbar.f;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: va2  reason: default package */
public class va2 extends f {
    private wa2 f;
    private ImageView n;
    private TextView o;
    private TextView p;

    public va2(AnchorBar anchorBar) {
        super(anchorBar, C0707R.layout.layout_active_session_banner, va2.class.getSimpleName());
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.AnchorItem
    public void a(ViewGroup viewGroup) {
        int i = 0;
        View G = je.G(viewGroup, C0707R.layout.layout_active_session_banner, viewGroup, false);
        Context context = viewGroup.getContext();
        if (a.g(context)) {
            i = a.e(context.getResources());
        }
        if (i != 0) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) G.getLayoutParams();
            layoutParams.topMargin += i;
            G.setLayoutParams(layoutParams);
        }
        ImageButton imageButton = (ImageButton) G.findViewById(C0707R.id.banner_close_button);
        imageButton.setImageDrawable(new SpotifyIconDrawable(viewGroup.getContext(), SpotifyIconV2.X, viewGroup.getContext().getResources().getDimension(C0707R.dimen.banner_img_size)));
        G.setOnClickListener(new ka2(this));
        imageButton.setOnClickListener(new la2(this));
        this.n = (ImageView) G.findViewById(C0707R.id.banner_icon);
        this.o = (TextView) G.findViewById(C0707R.id.banner_title);
        this.p = (TextView) G.findViewById(C0707R.id.banner_subtitle);
        viewGroup.addView(G);
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.f, com.spotify.mobile.android.ui.view.anchorbar.AnchorItem
    public AnchorItem.Priority c() {
        return AnchorItem.Priority.HIGH;
    }

    /* access modifiers changed from: package-private */
    public void e(cb2 cb2) {
        TextView textView = this.o;
        textView.getClass();
        textView.setText(cb2.d());
        ImageView imageView = this.n;
        imageView.getClass();
        if (cb2.b() != null) {
            imageView.setImageDrawable(cb2.b());
        } else {
            imageView.setVisibility(4);
        }
        TextView textView2 = this.p;
        textView2.getClass();
        if (!TextUtils.isEmpty(cb2.c())) {
            textView2.setVisibility(0);
            textView2.setText(cb2.c());
            return;
        }
        textView2.setVisibility(8);
    }

    public void f(View view) {
        wa2 wa2 = this.f;
        wa2.getClass();
        wa2.J2();
    }

    public void g(View view) {
        wa2 wa2 = this.f;
        wa2.getClass();
        wa2.K2();
    }

    @Override // com.spotify.mobile.android.ui.view.anchorbar.f, com.spotify.mobile.android.ui.view.anchorbar.AnchorItem
    public AnchorItem.Type getType() {
        return AnchorItem.Type.NAVIGATION;
    }

    /* access modifiers changed from: package-private */
    public void h(wa2 wa2) {
        this.f = wa2;
    }
}
