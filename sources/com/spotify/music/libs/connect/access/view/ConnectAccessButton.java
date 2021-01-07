package com.spotify.music.libs.connect.access.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.C0707R;

public class ConnectAccessButton extends ConstraintLayout {
    private TextView a;
    private ImageView b;
    private PressableConnectCardView c;

    public ConnectAccessButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void C() {
        this.a.setVisibility(8);
    }

    public void D() {
        this.a.setVisibility(0);
    }

    public View getViewToBeAnimated() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(C0707R.id.text_connect_access);
        this.b = (ImageView) findViewById(C0707R.id.image_connect_access);
        PressableConnectCardView pressableConnectCardView = (PressableConnectCardView) findViewById(C0707R.id.connect_access_card_button);
        this.c = pressableConnectCardView;
        dvd.a(pressableConnectCardView).a();
        setVisibility(8);
    }

    public void setActive(boolean z) {
        this.b.setActivated(z);
    }

    public void setIcon(Drawable drawable) {
        this.b.setImageDrawable(drawable);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }

    public void setText(CharSequence charSequence) {
        if (!TextUtils.equals(this.a.getText(), charSequence)) {
            this.a.setText(charSequence);
        }
    }

    public ConnectAccessButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.inflate(context, C0707R.layout.connect_access_button, this);
    }

    public void setText(int i) {
        this.a.setText(i);
    }
}
