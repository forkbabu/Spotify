package com.spotify.paste.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.C0707R;

public final class DialogLayout extends LinearLayout {
    private Button a;
    private Button b;
    private final Button c;
    private final Button f;
    private final Button n;
    private final Button o;
    private final LinearLayout p;
    private final TextView q;
    private final TextView r;
    private final ViewGroup s;
    private final ImageView t;
    private View u;
    private final View v;
    private CharSequence w;
    private CharSequence x;
    private View.OnClickListener y;
    private View.OnClickListener z;

    public DialogLayout(Context context) {
        this(context, null, false);
    }

    private void e() {
        if (this.w == null && this.x == null) {
            this.p.setVisibility(8);
            this.b = null;
            this.a = null;
            return;
        }
        this.p.setVisibility(0);
        if (this.w == null || this.x == null) {
            this.f.setVisibility(8);
            this.c.setVisibility(8);
            if (this.w != null) {
                this.n.setVisibility(0);
                this.o.setVisibility(8);
                this.n.setText(this.w);
                this.n.setOnClickListener(this.y);
                this.a = this.n;
                this.b = null;
            }
            if (this.x != null) {
                this.o.setVisibility(0);
                this.n.setVisibility(8);
                this.o.setText(this.x);
                this.o.setOnClickListener(this.z);
                this.b = this.o;
                this.a = null;
                return;
            }
            return;
        }
        this.f.setVisibility(0);
        this.c.setVisibility(0);
        this.n.setVisibility(8);
        this.o.setVisibility(8);
        this.c.setText(this.x);
        this.c.setOnClickListener(this.z);
        this.f.setText(this.w);
        this.f.setOnClickListener(this.y);
        this.a = this.f;
        this.b = this.c;
    }

    public void a(int i, View.OnClickListener onClickListener) {
        this.x = getResources().getText(i);
        this.z = onClickListener;
        e();
    }

    public void b(CharSequence charSequence, View.OnClickListener onClickListener) {
        this.x = charSequence;
        this.z = onClickListener;
        e();
    }

    public void c(int i, View.OnClickListener onClickListener) {
        this.w = getResources().getText(i);
        this.y = onClickListener;
        e();
    }

    public void d(CharSequence charSequence, View.OnClickListener onClickListener) {
        this.w = charSequence;
        this.y = onClickListener;
        e();
    }

    public TextView getBodyView() {
        return this.r;
    }

    public LinearLayout getButtonBar() {
        return this.p;
    }

    public View getContentView() {
        return this.u;
    }

    public ImageView getImageView() {
        return this.t;
    }

    /* access modifiers changed from: package-private */
    public Button getLeftButton() {
        return this.c;
    }

    public Button getNegativeButton() {
        return this.b;
    }

    public Button getPositiveButton() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public Button getRightButton() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public Button getSingleNegativeButton() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public Button getSinglePositiveButton() {
        return this.n;
    }

    public TextView getTitleView() {
        return this.q;
    }

    public void setBody(CharSequence charSequence) {
        this.r.setText(charSequence);
        this.r.setVisibility(0);
    }

    public void setContentView(View view) {
        View view2 = this.u;
        if (view2 != null) {
            this.s.removeView(view2);
        }
        if (view == null) {
            this.s.setVisibility(8);
            return;
        }
        this.u = view;
        this.s.addView(view, -1, -2);
        this.s.setVisibility(0);
    }

    public void setImage(int i) {
        this.t.setVisibility(0);
        this.t.setImageResource(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.q.setText(charSequence);
        this.v.setVisibility(0);
    }

    public DialogLayout(Context context, boolean z2) {
        this(context, null, z2);
    }

    public DialogLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, false);
    }

    public void setBody(int i) {
        setBody(getResources().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getResources().getText(i));
    }

    private DialogLayout(Context context, AttributeSet attributeSet, boolean z2) {
        super(context, attributeSet);
        LinearLayout.inflate(context, z2 ? C0707R.layout.paste_dialog : C0707R.layout.paste_dialog_noscroll, this);
        this.c = (Button) findViewById(C0707R.id.left_button);
        this.n = (Button) findViewById(C0707R.id.single_button_positive);
        this.o = (Button) findViewById(C0707R.id.single_button_negative);
        this.f = (Button) findViewById(C0707R.id.right_button);
        this.p = (LinearLayout) findViewById(C0707R.id.button_bar);
        this.q = (TextView) findViewById(C0707R.id.title);
        this.r = (TextView) findViewById(C0707R.id.body);
        this.s = (ViewGroup) findViewById(C0707R.id.content);
        this.t = (ImageView) findViewById(C0707R.id.image);
        this.v = findViewById(C0707R.id.title_container);
    }
}
