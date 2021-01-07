package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.common.base.MoreObjects;
import com.spotify.android.paste.app.c;
import com.spotify.music.C0707R;
import java.util.Locale;

/* renamed from: o64  reason: default package */
class o64 implements t64 {
    private final FrameLayout a;
    private final Button b;

    public o64(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        int f = nud.f(8.0f, context.getResources());
        layoutParams.setMargins(f, f, f, f);
        frameLayout.setLayoutParams(layoutParams);
        Button button = (Button) c.b(context, Button.class, null, C0707R.attr.solarButtonTertiaryOutlined);
        this.b = button;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        button.setLayoutParams(layoutParams2);
        int f2 = nud.f(24.0f, context.getResources());
        button.setPadding(f2, 0, f2, 0);
        frameLayout.addView(button);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // defpackage.t64
    public Button l() {
        return this.b;
    }

    @Override // defpackage.t64
    public void setTitle(String str) {
        this.b.setText(MoreObjects.isNullOrEmpty(str) ? "" : str.toUpperCase(Locale.getDefault()));
        this.b.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }
}
