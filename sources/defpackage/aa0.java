package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.a;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
/* renamed from: aa0  reason: default package */
public class aa0 extends q90 implements x90 {
    private final TextView c;
    private final TextView f;

    public aa0(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(16908308);
        this.c = textView;
        TextView textView2 = (TextView) view.findViewById(16908309);
        this.f = textView2;
        if (!view.isInEditMode()) {
            vc0.h(textView);
            vc0.i(textView2);
            vc0.g(getView());
        }
        bvd c2 = dvd.c(getView().findViewById(C0707R.id.row_view));
        c2.g(getTitleView(), getSubtitleView());
        c2.a();
    }

    private void b(boolean z) {
        Context context = getView().getContext();
        int i = z ? C0707R.attr.pasteTextAppearanceMetadata : C0707R.attr.pasteTextAppearanceSecondary;
        int i2 = z ? R.attr.encoreTextColorMetadata : C0707R.attr.glueRowSubtitleColor;
        nud.p(context, this.f, i);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        this.f.setTextColor(a.b(context, typedValue.resourceId));
    }

    @Override // defpackage.x90
    public void e(CharSequence charSequence) {
        b(true);
        this.f.setText(charSequence);
    }

    @Override // defpackage.x90
    public TextView getSubtitleView() {
        return this.f;
    }

    @Override // defpackage.x90
    public TextView getTitleView() {
        return this.c;
    }

    @Override // defpackage.x90
    public void setSubtitle(CharSequence charSequence) {
        b(false);
        this.f.setTransformationMethod(null);
        this.f.setText(charSequence);
    }

    @Override // defpackage.x90
    public void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
