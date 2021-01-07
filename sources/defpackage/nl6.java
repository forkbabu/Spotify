package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.viewpager.widget.ViewPager;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
/* renamed from: nl6  reason: default package */
public final class nl6 extends nc0 {
    private final TextView c;
    private final TextView f;

    /* renamed from: nl6$a */
    class a extends androidx.viewpager.widget.a {
        final /* synthetic */ View c;

        a(nl6 nl6, View view) {
            this.c = view;
        }

        @Override // androidx.viewpager.widget.a
        public void b(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView(this.c);
        }

        @Override // androidx.viewpager.widget.a
        public int d() {
            return 1;
        }

        @Override // androidx.viewpager.widget.a
        public Object h(ViewGroup viewGroup, int i) {
            if (this.c.getParent() != viewGroup) {
                viewGroup.addView(this.c);
            }
            return this.c;
        }

        @Override // androidx.viewpager.widget.a
        public boolean i(View view, Object obj) {
            return view == obj;
        }
    }

    nl6(Context context, ViewGroup viewGroup) {
        super(LayoutInflater.from(context).inflate(C0707R.layout.offline_user_mix_playlist_header_content_view, viewGroup, false));
        View findViewById = getView().findViewById(C0707R.id.view_pager);
        findViewById.getClass();
        ViewPager viewPager = (ViewPager) findViewById;
        viewPager.setPageMargin(context.getResources().getDimensionPixelSize(C0707R.dimen.content_area_horizontal_margin));
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.offline_user_mix_playlist_header_content_view_first_page, (ViewGroup) viewPager, false);
        View findViewById2 = inflate.findViewById(16908308);
        findViewById2.getClass();
        this.c = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(C0707R.id.cover_art_image);
        findViewById3.getClass();
        ImageView imageView = (ImageView) findViewById3;
        imageView.setVisibility(8);
        View findViewById4 = inflate.findViewById(16908309);
        findViewById4.getClass();
        TextView textView = (TextView) findViewById4;
        this.f = textView;
        textView.setVisibility(8);
        View findViewById5 = inflate.findViewById(C0707R.id.follow_button);
        findViewById5.getClass();
        ((ToggleButton) findViewById5).setVisibility(8);
        nud.g(12.0f, context.getResources());
        viewPager.setAdapter(new a(this, inflate));
        bvd b = dvd.b(imageView);
        b.f(imageView);
        b.a();
    }

    /* access modifiers changed from: package-private */
    public void setTitle(String str) {
        this.c.setText(str);
        TextView textView = this.c;
        textView.setPadding(textView.getPaddingLeft(), this.c.getPaddingTop(), this.c.getPaddingRight(), nud.g(24.0f, this.c.getResources()));
    }
}
