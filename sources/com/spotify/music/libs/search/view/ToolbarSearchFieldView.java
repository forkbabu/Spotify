package com.spotify.music.libs.search.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.common.base.MoreObjects;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public class ToolbarSearchFieldView extends FrameLayout {
    private static final g D = new a();
    private static final f E = new b();
    private static final e F = new c();
    private e A;
    private d B;
    private boolean C;
    private final k a;
    private int b;
    private int c;
    private int f;
    private final View n;
    private final BackKeyEditText o;
    private final ImageButton p;
    private final ImageButton q;
    private final Button r;
    private final View s;
    private DrawableState t;
    private TransitionDrawable u;
    private final SpotifyIconDrawable v;
    private final SpotifyIconDrawable w;
    private final SpotifyIconDrawable x;
    private g y;
    private f z;

    public enum DrawableState {
        CLEAR,
        SCANNABLES
    }

    static class a implements g {
        a() {
        }

        @Override // com.spotify.music.libs.search.view.ToolbarSearchFieldView.g
        public void a() {
        }

        @Override // com.spotify.music.libs.search.view.ToolbarSearchFieldView.g
        public void n() {
        }
    }

    static class b implements f {
        b() {
        }

        @Override // com.spotify.music.libs.search.view.ToolbarSearchFieldView.f
        public void a() {
        }
    }

    static class c implements e {
        c() {
        }

        @Override // com.spotify.music.libs.search.view.ToolbarSearchFieldView.e
        public void a() {
        }

        @Override // com.spotify.music.libs.search.view.ToolbarSearchFieldView.e
        public void b() {
        }

        @Override // com.spotify.music.libs.search.view.ToolbarSearchFieldView.e
        public void c() {
        }
    }

    public class d {
        private final Animator a;
        private final Animator b;
        private final Animator c;
        private final Animator d;
        private boolean e;

        d(k kVar, View view, View view2) {
            Property<k, Integer> property = k.h;
            ObjectAnimator ofInt = ObjectAnimator.ofInt(kVar, property, 255);
            ofInt.setDuration(200L);
            this.c = ofInt;
            ObjectAnimator ofInt2 = ObjectAnimator.ofInt(kVar, property, 0);
            ofInt2.setDuration(200L);
            this.d = ofInt2;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, View.ALPHA, 0.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(ToolbarSearchFieldView.this.p, "scaleX", 1.0f);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(ToolbarSearchFieldView.this.p, "scaleY", 1.0f);
            ofFloat.setDuration(200L);
            ofFloat2.setDuration(200L);
            ofFloat3.setDuration(200L);
            ofFloat4.setDuration(200L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat).with(ofFloat3).with(ofFloat4).before(ofFloat2);
            animatorSet.addListener(new o(this, view, view2));
            this.a = animatorSet;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view2, View.ALPHA, 1.0f);
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(ToolbarSearchFieldView.this.p, "scaleX", 1.2f);
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(ToolbarSearchFieldView.this.p, "scaleY", 1.2f);
            ofFloat5.setDuration(200L);
            ofFloat6.setDuration(200L);
            ofFloat7.setDuration(200L);
            ofFloat8.setDuration(200L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(ofFloat5).with(ofFloat7).with(ofFloat8).before(ofFloat6);
            animatorSet2.addListener(new p(this, view2, view));
            this.b = animatorSet2;
        }

        private void a(Animator... animatorArr) {
            int length = animatorArr.length;
            Animator[] animatorArr2 = new Animator[length];
            for (int i = 0; i < animatorArr.length; i++) {
                animatorArr2[i] = animatorArr[i].clone();
                if (this.e) {
                    animatorArr2[i].setDuration(0);
                }
            }
            if (length == 1) {
                animatorArr2[0].start();
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(animatorArr2);
            animatorSet.start();
        }

        public void b() {
            a(this.c);
        }

        public void c() {
            a(this.c, this.b);
        }

        public boolean d() {
            return this.e;
        }

        public void e(boolean z) {
            this.e = z;
        }

        public void f() {
            if (ToolbarSearchFieldView.this.r.getVisibility() == 0) {
                Editable text = ToolbarSearchFieldView.this.o.getText();
                text.getClass();
                text.clear();
                return;
            }
            a(this.d, this.a);
        }

        public void g() {
            a(this.d);
        }
    }

    public interface e {
        void a();

        void b();

        void c();
    }

    public interface f {
        void a();
    }

    public interface g {
        void a();

        void n();
    }

    public ToolbarSearchFieldView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View getCancelButton() {
        return this.q;
    }

    public DrawableState getCurrentDrawableState() {
        return this.t;
    }

    public BackKeyEditText getQueryEditText() {
        return this.o;
    }

    public View getRightButton() {
        return this.p;
    }

    public View getSearchField() {
        return this.s;
    }

    public Button getSearchPlaceHolder() {
        return this.r;
    }

    public boolean k() {
        return this.u != null;
    }

    public /* synthetic */ void l(View view) {
        if (this.t == DrawableState.CLEAR) {
            this.y.n();
        } else {
            this.y.a();
        }
    }

    public /* synthetic */ void m(View view) {
        this.A.b();
    }

    public /* synthetic */ boolean n() {
        this.A.c();
        return true;
    }

    public /* synthetic */ void o(View view) {
        this.A.a();
    }

    public d p() {
        return this.B;
    }

    public void q() {
        this.C = true;
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{this.v, this.x});
        this.u = transitionDrawable;
        transitionDrawable.setCrossFadeEnabled(true);
        this.p.setImageDrawable(this.u);
        this.t = DrawableState.SCANNABLES;
        this.p.setVisibility(0);
        ImageButton imageButton = this.p;
        imageButton.setContentDescription(imageButton.getContext().getString(C0707R.string.search_open_scannables_accessibility));
        this.z.a();
        androidx.core.widget.c.h(this.r, null, null, null, null);
    }

    public void r() {
        TransitionDrawable transitionDrawable = this.u;
        if (transitionDrawable != null) {
            transitionDrawable.reverseTransition(200);
            ImageButton imageButton = this.p;
            int i = q4.g;
            imageButton.setScaleX(1.2f);
            this.p.setScaleY(1.2f);
            this.t = DrawableState.SCANNABLES;
            ImageButton imageButton2 = this.p;
            imageButton2.setContentDescription(imageButton2.getContext().getString(C0707R.string.search_open_scannables_accessibility));
        }
    }

    public void s() {
        TransitionDrawable transitionDrawable = this.u;
        if (transitionDrawable != null) {
            transitionDrawable.startTransition(200);
            this.t = DrawableState.CLEAR;
            ImageButton imageButton = this.p;
            imageButton.setContentDescription(imageButton.getContext().getString(C0707R.string.search_clear_query_accessibility));
        }
    }

    public void setRightButtonVisible(boolean z2) {
        this.p.setVisibility(z2 ? 0 : 4);
    }

    public void setToolbarSearchFieldCallbacks(e eVar) {
        this.A = (e) MoreObjects.firstNonNull(eVar, F);
    }

    public void setToolbarSearchFieldCameraCallback(f fVar) {
        this.z = (f) MoreObjects.firstNonNull(fVar, E);
    }

    public void setToolbarSearchFieldRightButtonListener(g gVar) {
        this.y = (g) MoreObjects.firstNonNull(gVar, D);
    }

    /* JADX INFO: finally extract failed */
    public ToolbarSearchFieldView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.t = DrawableState.SCANNABLES;
        this.y = D;
        this.z = E;
        this.A = F;
        LayoutInflater.from(context).inflate(C0707R.layout.search_toolbar, (ViewGroup) this, true);
        View G = q4.G(this, C0707R.id.search_background);
        this.n = G;
        BackKeyEditText backKeyEditText = (BackKeyEditText) q4.G(this, C0707R.id.query);
        this.o = backKeyEditText;
        ImageButton imageButton = (ImageButton) q4.G(this, C0707R.id.search_right_button);
        this.p = imageButton;
        Button button = (Button) q4.G(this, C0707R.id.search_placeholder);
        this.r = button;
        this.s = q4.G(this, C0707R.id.search_field);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.CAMERA, (float) context.getResources().getDimensionPixelSize(C0707R.dimen.actionbar_search_drawables_size));
        this.v = spotifyIconDrawable;
        int i2 = R.color.white;
        spotifyIconDrawable.r(androidx.core.content.a.b(context, i2));
        SpotifyIconDrawable spotifyIconDrawable2 = new SpotifyIconDrawable(context, SpotifyIconV2.X, (float) context.getResources().getDimensionPixelSize(C0707R.dimen.actionbar_search_drawables_size));
        this.x = spotifyIconDrawable2;
        spotifyIconDrawable2.r(androidx.core.content.a.b(context, i2));
        ImageButton imageButton2 = (ImageButton) q4.G(this, C0707R.id.cancel_button);
        this.q = imageButton2;
        bvd a2 = dvd.a(imageButton2);
        a2.f(imageButton2);
        a2.a();
        SpotifyIconDrawable spotifyIconDrawable3 = new SpotifyIconDrawable(context, SpotifyIconV2.ARROW_LEFT, (float) context.getResources().getDimensionPixelSize(C0707R.dimen.actionbar_search_drawables_size));
        spotifyIconDrawable3.r(androidx.core.content.a.b(context, i2));
        imageButton2.setImageDrawable(spotifyIconDrawable3);
        int g2 = nud.g(8.0f, context.getResources());
        int g3 = nud.g(4.0f, context.getResources());
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, j.a, 0, 0);
        try {
            k kVar = new k(obtainStyledAttributes.getDimensionPixelSize(2, g2), obtainStyledAttributes.getDimensionPixelSize(3, g2), obtainStyledAttributes.getDimensionPixelOffset(0, g3), obtainStyledAttributes.getColor(1, androidx.core.content.a.b(context, C0707R.color.cat_grayscale_55_40)));
            obtainStyledAttributes.recycle();
            this.a = kVar;
            int i3 = Build.VERSION.SDK_INT;
            G.setBackground(kVar);
            bvd a3 = dvd.a(button);
            a3.g(button);
            a3.a();
            SpotifyIconDrawable spotifyIconDrawable4 = new SpotifyIconDrawable(context, SpotifyIconV2.SEARCH, (float) context.getResources().getDimensionPixelSize(C0707R.dimen.actionbar_search_drawables_size));
            this.w = spotifyIconDrawable4;
            spotifyIconDrawable4.r(androidx.core.content.a.b(context, i2));
            this.f = ((FrameLayout.LayoutParams) imageButton.getLayoutParams()).rightMargin;
            this.u = null;
            this.t = DrawableState.CLEAR;
            imageButton.setImageDrawable(spotifyIconDrawable2);
            imageButton.setVisibility(8);
            androidx.core.widget.c.h(button, spotifyIconDrawable4, null, null, null);
            this.B = new d(kVar, button, getSearchField());
            imageButton.setOnClickListener(new g(this));
            imageButton2.setOnClickListener(new f(this));
            backKeyEditText.setBackKeyListener(new e(this));
            d dVar = new d(this);
            G.setOnClickListener(dVar);
            button.setOnClickListener(dVar);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
