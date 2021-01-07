package com.spotify.mobile.android.storylines.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.cardview.widget.CardView;
import com.spotify.android.stories.view.StoriesProgressView;
import com.spotify.mobile.android.storylines.model.StorylinesCardImageModel;
import com.spotify.mobile.android.storylines.ui.StorylinesCardView;
import com.spotify.mobile.android.storylines.ui.l;
import com.spotify.music.C0707R;
import com.spotify.music.newplaying.scroll.widgets.storylines.StorylinesWidgetPresenter;
import com.spotify.paste.widgets.carousel.CarouselLayoutManager;
import com.spotify.paste.widgets.carousel.CarouselView;
import com.squareup.picasso.Picasso;
import java.util.List;

public class StorylinesView extends CardView implements l, StoriesProgressView.a, StorylinesCardView.a {
    private ToggleButton A;
    private TextView B;
    private TextView C;
    private View D;
    private int E;
    private int F = -1;
    private boolean G;
    private final Handler H = new Handler();
    private final Runnable I = new e(this);
    private j s;
    private CarouselView t;
    private StoriesProgressView u;
    private View v;
    private TextView w;
    private ImageView x;
    private l.a y;
    private Picasso z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            StorylinesView.this.c(0);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            StorylinesView.this.D.setVisibility(8);
        }
    }

    public StorylinesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        FrameLayout.inflate(getContext(), C0707R.layout.storylines, this);
        this.u = (StoriesProgressView) q4.G(this, C0707R.id.progress_view);
        this.t = (CarouselView) q4.G(this, C0707R.id.carousel);
        this.v = q4.G(this, C0707R.id.artist_attribution);
        this.w = (TextView) q4.G(this, C0707R.id.storylines_by);
        this.x = (ImageView) q4.G(this, C0707R.id.artist_avatar);
        this.A = (ToggleButton) q4.G(this, C0707R.id.follow_button);
        this.B = (TextView) q4.G(this, C0707R.id.error_title);
        this.C = (TextView) q4.G(this, C0707R.id.error_message);
        this.D = q4.G(this, C0707R.id.loading_view);
        setBackground(getResources().getDrawable(C0707R.drawable.background_empty));
        setRadius(getResources().getDimension(C0707R.dimen.std_8dp));
        q4.N(this, 0.0f);
        this.t.setLayoutManager(new CarouselLayoutManager(CarouselLayoutManager.MeasureMode.FILL));
        q4.G(this, C0707R.id.reverse).setOnTouchListener(new c(this));
        q4.G(this, C0707R.id.skip).setOnTouchListener(new d(this));
        this.v.setOnClickListener(new b(this));
        this.A.setOnClickListener(new f(this));
        this.u.setProgressListener(this);
    }

    private double getPercentVisible() {
        Window window = getWindow();
        if (window == null) {
            return -1.0d;
        }
        int measuredHeight = window.getDecorView().getMeasuredHeight();
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int height = getHeight();
        int i = iArr[1];
        int i2 = i + height;
        if (height == 0) {
            return -1.0d;
        }
        if (i2 < 0 || i > measuredHeight) {
            return 0.0d;
        }
        double min = (double) (Math.min(measuredHeight, i2) - Math.max(0, i));
        double d = (double) height;
        Double.isNaN(min);
        Double.isNaN(d);
        Double.isNaN(min);
        Double.isNaN(d);
        return Math.floor((min / d) * 100.0d);
    }

    private Window getWindow() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow();
            }
        }
        return null;
    }

    public static void p(StorylinesView storylinesView) {
        int i = storylinesView.F;
        if (i >= 0 && i != storylinesView.E - 1) {
            ((StorylinesWidgetPresenter) storylinesView.y).j(i, storylinesView.getPercentVisible());
        }
    }

    public static void u(StorylinesView storylinesView) {
        storylinesView.G = true;
        l.a aVar = storylinesView.y;
        if (aVar != null && storylinesView.F >= 0) {
            ((StorylinesWidgetPresenter) aVar).o(storylinesView.t.getCurrentPosition(), storylinesView.getPercentVisible());
        }
    }

    public static void v(StorylinesView storylinesView) {
        int i = storylinesView.F;
        if (i >= 1) {
            ((StorylinesWidgetPresenter) storylinesView.y).k(i, storylinesView.getPercentVisible());
        }
    }

    private boolean z(MotionEvent motionEvent, Runnable runnable) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        this.u.f();
                        this.H.removeCallbacks(this.I);
                        this.G = false;
                    }
                }
            }
            this.u.f();
            this.H.removeCallbacks(this.I);
            if (!this.G && motionEvent.getAction() == 1) {
                runnable.run();
            }
            this.G = false;
        } else {
            this.u.e();
            this.H.postDelayed(this.I, 200);
        }
        return true;
    }

    @Override // com.spotify.mobile.android.storylines.ui.l
    public void a(boolean z2, boolean z3) {
        ViewPropertyAnimator startDelay = this.u.animate().alpha(z2 ? 1.0f : 0.0f).setDuration(400).setStartDelay(z2 ? 200 : 0);
        if (z2 && z3) {
            startDelay.setListener(new a());
        } else if (!z2) {
            startDelay.setListener(null);
            this.F = -1;
            this.u.g(-1, false);
        }
        startDelay.start();
    }

    @Override // com.spotify.mobile.android.storylines.ui.l
    public void c(int i) {
        this.F = i;
        this.s.z();
        this.t.I0(this.F);
        this.u.g(this.F, true);
        ((StorylinesWidgetPresenter) this.y).p(i, getPercentVisible());
    }

    @Override // com.spotify.mobile.android.storylines.ui.l
    public void f() {
        this.B.setVisibility(8);
        this.C.setVisibility(8);
        this.D.setVisibility(0);
    }

    @Override // com.spotify.mobile.android.storylines.ui.l
    public void g(List<StorylinesCardImageModel> list, com.spotify.mobile.android.storylines.model.b bVar) {
        this.s.X(list, this, bVar);
        this.t.setPosition(0);
        this.E = list.size();
        this.u.setStoriesCount(list.size());
        this.u.setStoryDuration(6000);
    }

    @Override // com.spotify.mobile.android.storylines.ui.l
    public void h() {
        this.B.setVisibility(0);
        this.C.setVisibility(0);
        this.D.setVisibility(8);
        this.B.setText(getResources().getString(C0707R.string.loading_error_title));
        this.C.setText(getResources().getString(C0707R.string.loading_error_message));
    }

    @Override // com.spotify.android.stories.view.StoriesProgressView.a
    public void j(int i) {
        int i2 = this.F;
        if (i2 != this.E - 1) {
            c(i2 + 1);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        double size = (double) View.MeasureSpec.getSize(i);
        Double.isNaN(size);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) Math.floor(size * 1.33d), 1073741824));
    }

    public /* synthetic */ boolean q(View view, MotionEvent motionEvent) {
        z(motionEvent, new g(this));
        return true;
    }

    public /* synthetic */ boolean r(View view, MotionEvent motionEvent) {
        z(motionEvent, new a(this));
        return true;
    }

    public void s(View view) {
        l.a aVar = this.y;
        if (aVar != null) {
            ((StorylinesWidgetPresenter) aVar).g(this.t.getCurrentPosition(), getPercentVisible());
        }
    }

    @Override // com.spotify.mobile.android.storylines.ui.l
    public void setArtistAvatar(String str) {
        this.z.m(str).o(rwd.c(this.x));
    }

    @Override // com.spotify.mobile.android.storylines.ui.l
    public void setArtistName(String str) {
        this.w.setText(String.format(getContext().getString(C0707R.string.by_artist_name), str));
    }

    @Override // com.spotify.mobile.android.storylines.ui.l
    public void setFollowState(boolean z2) {
        this.A.setTextOn(getContext().getResources().getString(C0707R.string.track_story_following_artist));
        this.A.setTextOff(getContext().getResources().getString(C0707R.string.track_story_follow_artist));
        this.A.setChecked(z2);
    }

    @Override // com.spotify.mobile.android.storylines.ui.l
    public void setListener(l.a aVar) {
        this.y = aVar;
    }

    public void setPicasso(Picasso picasso) {
        this.z = picasso;
    }

    public void setStorylinesCarouselAdapter(j jVar) {
        this.s = jVar;
        this.t.setAdapter(jVar);
    }

    @Override // com.spotify.mobile.android.storylines.ui.l
    public void setStorylinesContentVisible(boolean z2) {
        float f = z2 ? 1.0f : 0.0f;
        this.t.animate().alpha(f).setDuration(400).setListener(new b()).start();
        je.g(this.v, f, 400);
        this.A.animate().alpha(f).setDuration(400).start();
        if (z2) {
            ((StorylinesWidgetPresenter) this.y).p(0, getPercentVisible());
        }
    }

    public void setVisible(boolean z2) {
        setVisibility(z2 ? 0 : 8);
    }

    public void t(View view) {
        l.a aVar = this.y;
        if (aVar != null) {
            ((StorylinesWidgetPresenter) aVar).h(this.t.getCurrentPosition(), getPercentVisible());
        }
    }

    public void w(com.spotify.mobile.android.storylines.model.b bVar) {
        ((StorylinesWidgetPresenter) this.y).l(bVar);
    }

    public void x(com.spotify.mobile.android.storylines.model.b bVar) {
        ((StorylinesWidgetPresenter) this.y).m(bVar);
    }

    public void y(com.spotify.mobile.android.storylines.model.b bVar) {
        ((StorylinesWidgetPresenter) this.y).n(bVar);
    }
}
