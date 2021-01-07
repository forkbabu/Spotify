package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.android.paste.app.c;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.EmptyView;

/* access modifiers changed from: package-private */
/* renamed from: qb0  reason: default package */
public class qb0 implements gb0 {
    private final EmptyView a;
    private final b b = new b(null);
    private final Button c;
    private final Button f;

    /* renamed from: qb0$b */
    private class b extends ib0 {
        b(a aVar) {
        }

        @Override // defpackage.hb0
        public void a(boolean z) {
            qb0.this.f.setVisibility(z ? 0 : 8);
        }

        @Override // defpackage.hb0
        public void b(boolean z) {
            qb0.this.a.getImageView().setVisibility(z ? 0 : 8);
        }

        @Override // defpackage.hb0
        public void c(Drawable drawable) {
            qb0.this.a.setImageDrawable(drawable);
        }

        @Override // defpackage.hb0
        public Button d() {
            return qb0.this.f;
        }

        @Override // defpackage.hb0
        public ImageView getImageView() {
            return qb0.this.a.getImageView();
        }
    }

    public qb0(EmptyView emptyView) {
        this.a = emptyView;
        emptyView.setId(C0707R.id.empty);
        Context context = emptyView.getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        Button button = (Button) c.b(context, Button.class, null, C0707R.attr.glueButtonPrimaryWhite);
        this.c = button;
        button.setId(C0707R.id.button_primary);
        button.setSingleLine(true);
        button.setEllipsize(TextUtils.TruncateAt.END);
        button.setVisibility(8);
        linearLayout.addView(button, new LinearLayout.LayoutParams(-2, -2));
        Button button2 = (Button) c.b(context, Button.class, null, C0707R.attr.pasteButtonStyleSecondary);
        this.f = button2;
        button2.setId(C0707R.id.button_secondary);
        button2.setSingleLine(true);
        button2.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = nud.g(16.0f, context.getResources());
        button2.setLayoutParams(layoutParams);
        linearLayout.addView(button2);
        button2.setVisibility(8);
        emptyView.setAccessoryView(linearLayout);
    }

    @Override // defpackage.kb0
    public void A2(int i) {
        this.a.setText(i);
    }

    @Override // defpackage.gb0
    public hb0 D2() {
        return this.b;
    }

    @Override // defpackage.gb0
    public void b2(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }

    @Override // defpackage.kb0
    public TextView getSubtitleView() {
        return this.a.getTextView();
    }

    @Override // defpackage.kb0
    public TextView getTitleView() {
        return this.a.getTitleView();
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // defpackage.rb0
    public Button i() {
        return this.c;
    }

    @Override // defpackage.kb0
    public void setSubtitle(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    @Override // defpackage.kb0
    public void setTitle(CharSequence charSequence) {
        this.a.setTitle(charSequence);
    }

    @Override // defpackage.rb0
    public void w(int i) {
        this.c.setText(i);
    }

    @Override // defpackage.kb0
    public void setTitle(int i) {
        this.a.setTitle(i);
    }
}
