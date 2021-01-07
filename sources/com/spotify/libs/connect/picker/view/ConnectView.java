package com.spotify.libs.connect.picker.view;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.encore.foundation.R;
import com.spotify.libs.connect.model.Tech;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.ArrayList;
import java.util.List;

public class ConnectView extends LinearLayout implements zud {
    private static final int[] s = {C0707R.attr.devices_available};
    private static final int[] t = {C0707R.attr.remote_active};
    private LinearLayout a;
    private TextView b;
    private j c;
    private i f;
    private k n;
    private boolean o;
    private boolean p;
    private boolean q;
    private final yud r = new yud(this);

    public ConnectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void a(List<String> list, j jVar) {
        if (jVar.isVisible() && (jVar.d().getDrawable() instanceof SpotifyIconDrawable)) {
            list.add(((SpotifyIconDrawable) jVar.d().getDrawable()).o().name());
        }
    }

    private void setConnectIconText(String str) {
        if (!TextUtils.equals(this.b.getText(), str)) {
            this.b.setText(str);
        }
    }

    private void setConnectIconTextAppearance(int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.b.setTextAppearance(i);
        } else {
            this.b.setTextAppearance(getContext(), i);
        }
    }

    public void b() {
        this.b.setVisibility(8);
    }

    public void c() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.a.getLayoutParams();
        layoutParams.height = (int) getResources().getDimension(C0707R.dimen.connect_device_icon_size);
        int dimension = (int) getResources().getDimension(C0707R.dimen.connect_device_icon_size);
        this.c.c(dimension, dimension);
        this.f.c(dimension, dimension);
        ((c) this.n).c(dimension, dimension);
        this.b.setPadding(0, 0, 0, 0);
        this.a.setLayoutParams(layoutParams);
        this.a.requestLayout();
    }

    public void d() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.a.getLayoutParams();
        int dimension = (int) getResources().getDimension(C0707R.dimen.connect_device_mini_height);
        layoutParams.height = dimension;
        this.c.c(dimension, dimension);
        this.f.c(dimension, dimension);
        ((c) this.n).c(dimension, dimension);
        this.b.setPadding((int) getResources().getDimension(C0707R.dimen.connect_device_space_for_device_name), 0, 0, 0);
        this.a.setLayoutParams(layoutParams);
        this.a.requestLayout();
        setConnectIconTextAppearance(R.style.TextAppearance_Encore_Finale);
        this.b.setTextColor(getResources().getColorStateList(C0707R.color.btn_now_playing_connect));
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.r.a();
    }

    public void e() {
        this.p = true;
        this.q = false;
        refreshDrawableState();
        setConnectIconText(getContext().getString(C0707R.string.player_connect_devices_available));
        setContentDescription(getContext().getString(C0707R.string.player_connect_devices_available));
        this.c.b();
        ((c) this.n).b();
        this.f.a();
    }

    public void f() {
        this.p = false;
        this.q = false;
        refreshDrawableState();
        setConnectIconText(getContext().getString(C0707R.string.player_connect_devices_available));
        setContentDescription(getContext().getString(C0707R.string.player_connect_devices_available));
        this.c.b();
        ((c) this.n).b();
        this.f.a();
    }

    public void g(Tech tech, String str) {
        this.p = true;
        this.q = true;
        refreshDrawableState();
        setConnectIconText(str);
        setContentDescription(getContext().getString(C0707R.string.accessibility_connect_device_listening_on, str));
        this.f.b();
        int ordinal = tech.ordinal();
        if (ordinal == 0) {
            this.c.e();
            ((c) this.n).b();
        } else if (ordinal == 1 || ordinal == 2) {
            this.c.b();
            ((c) this.n).e();
        } else {
            throw new IllegalArgumentException("Unknown tech: " + tech);
        }
    }

    @Override // defpackage.zud
    public l getStateListAnimatorCompat() {
        return this.r.b();
    }

    public List<String> getTechIconIds() {
        ArrayList arrayList = new ArrayList(5);
        a(arrayList, this.n);
        a(arrayList, this.c);
        a(arrayList, this.f);
        return arrayList;
    }

    public String getText() {
        return this.b.getText().toString();
    }

    public void h() {
        this.b.setVisibility(0);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.r.c();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.p) {
            LinearLayout.mergeDrawableStates(onCreateDrawableState, s);
        }
        if (this.q) {
            LinearLayout.mergeDrawableStates(onCreateDrawableState, t);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (LinearLayout) findViewById(C0707R.id.connect_buttons_container);
        this.b = (TextView) findViewById(C0707R.id.btn_connect);
        ImageView imageView = (ImageView) findViewById(C0707R.id.icn_connect);
        ImageView imageView2 = (ImageView) findViewById(C0707R.id.icn_cast);
        ImageView imageView3 = (ImageView) findViewById(C0707R.id.icn_devices);
        m mVar = new m(getContext(), nud.g(20.0f, getResources()), C0707R.color.btn_now_playing_connect);
        this.n = new c(imageView2, mVar);
        f fVar = new f(imageView, mVar);
        this.c = fVar;
        this.f = new i(imageView3, mVar);
        fVar.b();
        ((c) this.n).b();
        this.f.b();
        refreshDrawableState();
        bvd c2 = dvd.c(this);
        c2.g(this.b);
        c2.f(imageView, imageView2, imageView3);
        c2.a();
    }

    public void setIsConnecting(Tech tech) {
        this.p = true;
        this.q = true;
        refreshDrawableState();
        setConnectIconText(getContext().getString(C0707R.string.player_connect_connecting));
        setContentDescription(getContext().getString(C0707R.string.player_connect_connecting));
        this.f.b();
        int ordinal = tech.ordinal();
        if (ordinal == 0) {
            this.c.e();
            ((c) this.n).b();
        } else if (ordinal == 1 || ordinal == 2) {
            this.c.b();
            ((c) this.n).a();
        } else {
            throw new IllegalArgumentException("Unknown tech: " + tech);
        }
    }

    public void setPressable(boolean z) {
        this.o = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.o) {
            super.setPressed(z);
        }
    }

    @Override // defpackage.zud
    public void setStateListAnimatorCompat(l lVar) {
        this.r.d(lVar);
    }

    public void setText(String str) {
        this.b.setText(str);
    }

    public ConnectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
