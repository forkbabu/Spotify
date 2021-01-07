package com.spotify.music.nowplaying.drivingmode.view.voiceview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import androidx.core.widget.c;
import androidx.viewpager.widget.ViewPager;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.music.nowplaying.drivingmode.presenter.voice.DrivingVoiceState;
import com.spotify.music.nowplaying.drivingmode.view.DrivingModeVoiceFragment;
import com.spotify.music.nowplaying.drivingmode.view.micbutton.DrivingMicButton;
import com.spotify.music.nowplaying.drivingmode.view.voiceinputanimation.VoiceInputAnimationView;
import com.squareup.picasso.Picasso;
import defpackage.tvb;
import defpackage.wvb;
import java.util.List;

public class DrivingVoiceView extends ConstraintLayout implements wvb, tvb {
    private ViewPager a;
    private tvb.a b;
    private wvb.a c;
    private TextSwitcher f;
    private TextSwitcher n;
    private vvb o;
    private AppCompatTextView p;
    private AppCompatTextView q;
    private VoiceInputAnimationView r;
    private View s;
    private DrivingMicButton t;

    public DrivingVoiceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        J();
    }

    private TextView G(int i) {
        TextView textView = new TextView(getContext());
        c.n(textView, i);
        textView.setGravity(1);
        textView.setMaxLines(1);
        textView.setMinLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        return textView;
    }

    private void J() {
        ViewGroup.inflate(getContext(), C0707R.layout.driving_voice_view, this);
        this.s = findViewById(C0707R.id.driving_voice_view_intent_title_background);
        AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById(C0707R.id.driving_voice_view_intent_title);
        this.p = appCompatTextView;
        c.n(appCompatTextView, C0707R.style.res_2132083372_textappearance_driving_voice_intenttitle);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) findViewById(C0707R.id.driving_voice_error_hint_text);
        this.q = appCompatTextView2;
        c.n(appCompatTextView2, C0707R.style.res_2132083371_textappearance_driving_voice_errorhint);
        this.r = (VoiceInputAnimationView) findViewById(C0707R.id.driving_voice_input_animation_view);
        DrivingMicButton drivingMicButton = (DrivingMicButton) findViewById(C0707R.id.driving_voice_mic_button);
        this.t = drivingMicButton;
        Drawable c2 = fvb.c(getContext(), R.color.gray_95);
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        drivingMicButton.setBackground(c2);
        this.a = (ViewPager) findViewById(C0707R.id.driving_voice_result_viewpager);
        vvb vvb = new vvb();
        this.o = vvb;
        this.a.setAdapter(vvb);
        this.a.c(new e(this));
        this.f = (TextSwitcher) findViewById(C0707R.id.driving_voice_view_context_title);
        this.n = (TextSwitcher) findViewById(C0707R.id.driving_voice_view_pager_subtitle);
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), 17432576);
        loadAnimation.setDuration(150);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), 17432577);
        loadAnimation2.setDuration(150);
        this.f.setFactory(new b(this));
        this.f.setInAnimation(loadAnimation);
        this.f.setOutAnimation(loadAnimation2);
        this.n.setFactory(new a(this));
        this.n.setInAnimation(loadAnimation);
        this.n.setOutAnimation(loadAnimation2);
    }

    private void U(boolean z) {
        int i = 0;
        this.f.setVisibility(z ? 0 : 8);
        TextSwitcher textSwitcher = this.n;
        if (!z) {
            i = 8;
        }
        textSwitcher.setVisibility(i);
    }

    private void V(boolean z) {
        this.q.setVisibility(z ? 0 : 8);
    }

    private void a0(boolean z) {
        this.t.setVisibility(z ? 0 : 4);
    }

    /* access modifiers changed from: private */
    public void setContextTitleAndSubtitle(uvb uvb) {
        this.f.setText(uvb.e());
        this.n.setText(uvb.d());
    }

    private void setErrorHintText(int i) {
        this.q.setText(i);
    }

    private void setTitleBackgroundTint(int i) {
        q4.L(this.s, a.c(getContext(), i));
    }

    private void setTitleColor(int i) {
        this.p.setTextColor(a.b(getContext(), i));
    }

    public /* synthetic */ View K() {
        return G(C0707R.style.res_2132083374_textappearance_driving_voice_suggesteditemtitle);
    }

    public /* synthetic */ View P() {
        return G(C0707R.style.res_2132083373_textappearance_driving_voice_suggesteditemsubtitle);
    }

    public void W() {
        this.r.setVisibility(8);
        this.p.setText(C0707R.string.driving_voice_state_rescue);
        this.a.setVisibility(8);
        U(false);
        V(true);
        setErrorHintText(getResources().getString(C0707R.string.driving_voice_state_rescue_hint, getResources().getString(C0707R.string.driving_voice_state_rescue_hint_command_example)));
        a0(true);
        setTitleBackgroundTint(C0707R.color.driving_voice_title_background_rescue_color);
        setTitleColor(R.color.white);
        ((DrivingModeVoiceFragment) this.c).L4(DrivingVoiceState.ERROR);
    }

    public void Y() {
        this.r.setVisibility(0);
        this.p.setText(C0707R.string.driving_voice_state_listening);
        this.a.setVisibility(8);
        U(false);
        V(false);
        a0(false);
        setTitleBackgroundTint(C0707R.color.driving_voice_title_background_default_color);
        setTitleColor(R.color.black);
        ((DrivingModeVoiceFragment) this.c).L4(DrivingVoiceState.LISTENING);
    }

    public void b0() {
        this.r.setVisibility(8);
        this.p.setText(C0707R.string.driving_voice_state_network_error);
        this.a.setVisibility(8);
        U(false);
        V(true);
        setErrorHintText(C0707R.string.driving_voice_state_network_error_hint);
        a0(true);
        setTitleBackgroundTint(C0707R.color.driving_voice_title_background_error_color);
        setTitleColor(R.color.white);
        ((DrivingModeVoiceFragment) this.c).L4(DrivingVoiceState.ERROR);
    }

    public void d0(List<uvb> list, String str) {
        this.r.setVisibility(8);
        this.p.setText(str);
        this.a.setVisibility(0);
        this.o.t(list);
        this.a.A(0, false);
        U(true);
        setContextTitleAndSubtitle(list.get(0));
        V(false);
        a0(true);
        setTitleBackgroundTint(C0707R.color.driving_voice_title_background_default_color);
        setTitleColor(R.color.black);
        ((DrivingModeVoiceFragment) this.c).L4(DrivingVoiceState.SUCCESS);
    }

    public void setListener(wvb.a aVar) {
        this.c = aVar;
    }

    public void setPicasso(Picasso picasso) {
        this.o.s(picasso);
    }

    private void setErrorHintText(String str) {
        this.q.setText(str);
    }

    @Override // defpackage.tvb
    public void setListener(tvb.a aVar) {
        this.b = aVar;
    }

    public DrivingVoiceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        J();
    }
}
