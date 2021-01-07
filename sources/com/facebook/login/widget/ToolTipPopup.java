package com.facebook.login.widget;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.spotify.music.C0707R;
import java.lang.ref.WeakReference;

public class ToolTipPopup {
    private final String a;
    private final WeakReference<View> b;
    private final Context c;
    private d d;
    private PopupWindow e;
    private Style f = Style.BLUE;
    private long g = 6000;
    private final ViewTreeObserver.OnScrollChangedListener h = new a();

    public enum Style {
        BLUE,
        BLACK
    }

    class a implements ViewTreeObserver.OnScrollChangedListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            if (ToolTipPopup.this.b.get() != null && ToolTipPopup.this.e != null && ToolTipPopup.this.e.isShowing()) {
                if (ToolTipPopup.this.e.isAboveAnchor()) {
                    ToolTipPopup.this.d.e();
                } else {
                    ToolTipPopup.this.d.f();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    ToolTipPopup.this.d();
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!uf.c(this)) {
                try {
                    ToolTipPopup.this.d();
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public class d extends FrameLayout {
        private ImageView a = ((ImageView) findViewById(C0707R.id.com_facebook_tooltip_bubble_view_top_pointer));
        private ImageView b = ((ImageView) findViewById(C0707R.id.com_facebook_tooltip_bubble_view_bottom_pointer));
        private View c = findViewById(C0707R.id.com_facebook_body_frame);
        private ImageView f = ((ImageView) findViewById(C0707R.id.com_facebook_button_xout));

        public d(ToolTipPopup toolTipPopup, Context context) {
            super(context);
            LayoutInflater.from(getContext()).inflate(C0707R.layout.com_facebook_tooltip_bubble, this);
        }

        public void e() {
            this.a.setVisibility(4);
            this.b.setVisibility(0);
        }

        public void f() {
            this.a.setVisibility(0);
            this.b.setVisibility(4);
        }
    }

    public ToolTipPopup(String str, View view) {
        this.a = str;
        this.b = new WeakReference<>(view);
        this.c = view.getContext();
    }

    private void h() {
        if (this.b.get() != null) {
            this.b.get().getViewTreeObserver().removeOnScrollChangedListener(this.h);
        }
    }

    public void d() {
        h();
        PopupWindow popupWindow = this.e;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public void e(long j) {
        this.g = j;
    }

    public void f(Style style) {
        this.f = style;
    }

    public void g() {
        if (this.b.get() != null) {
            d dVar = new d(this, this.c);
            this.d = dVar;
            ((TextView) dVar.findViewById(C0707R.id.com_facebook_tooltip_bubble_view_text_body)).setText(this.a);
            if (this.f == Style.BLUE) {
                this.d.c.setBackgroundResource(C0707R.drawable.com_facebook_tooltip_blue_background);
                this.d.b.setImageResource(C0707R.drawable.com_facebook_tooltip_blue_bottomnub);
                this.d.a.setImageResource(C0707R.drawable.com_facebook_tooltip_blue_topnub);
                this.d.f.setImageResource(C0707R.drawable.com_facebook_tooltip_blue_xout);
            } else {
                this.d.c.setBackgroundResource(C0707R.drawable.com_facebook_tooltip_black_background);
                this.d.b.setImageResource(C0707R.drawable.com_facebook_tooltip_black_bottomnub);
                this.d.a.setImageResource(C0707R.drawable.com_facebook_tooltip_black_topnub);
                this.d.f.setImageResource(C0707R.drawable.com_facebook_tooltip_black_xout);
            }
            View decorView = ((Activity) this.c).getWindow().getDecorView();
            int width = decorView.getWidth();
            int height = decorView.getHeight();
            h();
            if (this.b.get() != null) {
                this.b.get().getViewTreeObserver().addOnScrollChangedListener(this.h);
            }
            this.d.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
            d dVar2 = this.d;
            PopupWindow popupWindow = new PopupWindow(dVar2, dVar2.getMeasuredWidth(), this.d.getMeasuredHeight());
            this.e = popupWindow;
            popupWindow.showAsDropDown(this.b.get());
            PopupWindow popupWindow2 = this.e;
            if (popupWindow2 != null && popupWindow2.isShowing()) {
                if (this.e.isAboveAnchor()) {
                    this.d.e();
                } else {
                    this.d.f();
                }
            }
            long j = this.g;
            if (j > 0) {
                this.d.postDelayed(new b(), j);
            }
            this.e.setTouchable(true);
            this.d.setOnClickListener(new c());
        }
    }
}
