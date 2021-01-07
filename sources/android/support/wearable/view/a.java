package android.support.wearable.view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.C0707R;

public class a extends Dialog {
    protected ImageView a = ((ImageView) findViewById(16908294));
    protected TextView b = ((TextView) findViewById(16908310));
    protected TextView c = ((TextView) findViewById(16908299));
    protected View f;
    protected ImageButton n;
    protected ImageButton o;
    protected DialogInterface.OnClickListener p;
    protected DialogInterface.OnClickListener q;
    protected View r;
    private final View.OnClickListener s;

    /* renamed from: android.support.wearable.view.a$a  reason: collision with other inner class name */
    class View$OnClickListenerC0011a implements View.OnClickListener {
        View$OnClickListenerC0011a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogInterface.OnClickListener onClickListener;
            DialogInterface.OnClickListener onClickListener2;
            a aVar = a.this;
            if (view == aVar.n && (onClickListener2 = aVar.p) != null) {
                onClickListener2.onClick(aVar, -1);
            } else if (view == aVar.o && (onClickListener = aVar.q) != null) {
                onClickListener.onClick(aVar, -2);
            }
            a.this.dismiss();
        }
    }

    public a(Context context) {
        super(context, 0);
        View$OnClickListenerC0011a aVar = new View$OnClickListenerC0011a();
        this.s = aVar;
        setContentView(C0707R.layout.accept_deny_dialog);
        ImageButton imageButton = (ImageButton) findViewById(16908313);
        this.n = imageButton;
        imageButton.setOnClickListener(aVar);
        ImageButton imageButton2 = (ImageButton) findViewById(16908314);
        this.o = imageButton2;
        imageButton2.setOnClickListener(aVar);
        this.r = findViewById(C0707R.id.spacer);
        this.f = findViewById(C0707R.id.buttonPanel);
    }

    public void a(int i, DialogInterface.OnClickListener onClickListener) {
        if (i == -2) {
            this.q = onClickListener;
        } else if (i == -1) {
            this.p = onClickListener;
        } else {
            return;
        }
        int i2 = 8;
        this.r.setVisibility((this.p == null || this.q == null) ? 8 : 4);
        this.n.setVisibility(this.p == null ? 8 : 0);
        this.o.setVisibility(this.q == null ? 8 : 0);
        View view = this.f;
        if (!(this.p == null && this.q == null)) {
            i2 = 0;
        }
        view.setVisibility(i2);
    }

    public void b(Drawable drawable) {
        this.a.setVisibility(drawable == null ? 8 : 0);
        this.a.setImageDrawable(drawable);
    }

    public void c(CharSequence charSequence) {
        this.c.setText(charSequence);
        this.c.setVisibility(charSequence == null ? 8 : 0);
    }

    /* access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b.getRootView().requestFocus();
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
