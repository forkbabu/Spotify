package com.spotify.music.features.connectui.picker.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.spotify.music.C0707R;
import com.spotify.music.features.connectui.picker.frictionlessjoin.ui.facepile.FacePile;
import defpackage.d5;

public class ListeningOnView extends ConstraintLayout {
    private TextView a;
    private ImageView b;
    private LottieAnimationView c;
    private FacePile f;
    private ImageView n;
    private TextView o;
    private String p;
    private String q;
    private String r;
    private ImageView s;
    private final b t = new b(null);

    private class b extends z3 {
        b(a aVar) {
        }

        @Override // defpackage.z3
        public void onInitializeAccessibilityNodeInfo(View view, d5 d5Var) {
            super.onInitializeAccessibilityNodeInfo(view, d5Var);
            d5Var.b(new d5.a(C0707R.id.accessibility_action_more_options, view.getContext().getString(C0707R.string.accessibility_action_more_options)));
        }

        @Override // defpackage.z3
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i != C0707R.id.accessibility_action_more_options) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            ListeningOnView.this.s.performClick();
            return true;
        }
    }

    public ListeningOnView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        K();
    }

    private void K() {
        ViewGroup.inflate(getContext(), C0707R.layout.listening_on_view, this);
        this.p = getContext().getString(C0707R.string.device_picker_title_listening_on);
        this.q = getContext().getString(C0707R.string.device_picker_title_watching_on);
        this.r = getContext().getString(C0707R.string.device_picker_title_group_session_on);
        q4.J(this, true);
    }

    public void D() {
        this.s.setVisibility(8);
        q4.I(this, null);
    }

    public void E() {
        this.n.setVisibility(8);
    }

    public void G() {
        this.c.setVisibility(4);
        this.f.setVisibility(8);
        this.b.setVisibility(0);
    }

    public void J() {
        this.b.setVisibility(0);
        this.f.setVisibility(8);
        this.c.setVisibility(4);
        this.c.l();
    }

    public void P() {
        this.o.setText(this.r);
    }

    public void U() {
        this.o.setText(this.p);
    }

    public void V() {
        this.o.setText(this.q);
    }

    public void W() {
        this.s.setVisibility(0);
        q4.I(this, this.t);
    }

    public void Y() {
        this.n.setVisibility(0);
    }

    public void a0() {
        this.b.setVisibility(4);
        this.c.setVisibility(4);
        this.f.setVisibility(0);
    }

    public void b0() {
        this.b.setVisibility(4);
        this.f.setVisibility(8);
        this.c.setVisibility(0);
        this.c.m();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(C0707R.id.active_device_name);
        this.b = (ImageView) findViewById(C0707R.id.image_device_playing_on);
        this.c = (LottieAnimationView) findViewById(C0707R.id.animation_playing_on);
        this.n = (ImageView) findViewById(C0707R.id.picker_device_subtitle_icon);
        this.o = (TextView) findViewById(C0707R.id.title_listening_on);
        this.s = (ImageView) findViewById(C0707R.id.active_device_context_menu);
        this.f = (FacePile) findViewById(C0707R.id.participants_face_pile);
    }

    public void setActiveContextMenuIcon(Drawable drawable) {
        this.s.setImageDrawable(drawable);
    }

    public void setActiveDeviceIconForSubtitle(Drawable drawable) {
        this.n.setImageDrawable(drawable);
    }

    public void setContextMenuClickListener(View.OnClickListener onClickListener) {
        this.s.setOnClickListener(onClickListener);
    }

    public void setDeviceName(String str) {
        this.a.setText(str);
        this.a.setSelected(true);
    }

    public void setDeviceTypeIcon(Drawable drawable) {
        this.b.setImageDrawable(drawable);
    }

    public void setParticipantsFacePileAdapter(com.spotify.music.features.connectui.picker.frictionlessjoin.ui.facepile.a aVar) {
        this.f.setAdapter(aVar);
    }

    public ListeningOnView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        K();
    }
}
