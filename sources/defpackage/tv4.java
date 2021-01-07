package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.layouts.PasteLinearLayout;

/* renamed from: tv4  reason: default package */
public class tv4 implements g90 {
    private final PasteLinearLayout a;
    private final PasteLinearLayout b;
    private final uv4 c;
    private final View f;

    tv4(Context context, ViewGroup viewGroup, vv4 vv4) {
        Drawable j = nud.j(context, C0707R.attr.pasteListDivider);
        PasteLinearLayout pasteLinearLayout = new PasteLinearLayout(context, null);
        this.a = pasteLinearLayout;
        pasteLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        pasteLinearLayout.setOrientation(1);
        pasteLinearLayout.setDividerDrawable(j);
        pasteLinearLayout.setShowDividers(2);
        PasteLinearLayout pasteLinearLayout2 = new PasteLinearLayout(context, null);
        this.b = pasteLinearLayout2;
        pasteLinearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        pasteLinearLayout2.setOrientation(1);
        pasteLinearLayout2.setDividerDrawable(j);
        pasteLinearLayout2.setShowDividers(2);
        uv4 b2 = vv4.b(context, pasteLinearLayout);
        this.c = b2;
        qa0 e = e90.e().e(context, viewGroup);
        e.setTitle(context.getString(C0707R.string.data_saver_mode_settings_description_title));
        e.setSubtitle(context.getString(C0707R.string.data_saver_mode_settings_description_body));
        e.getSubtitleView().setMaxLines(Integer.MAX_VALUE);
        e.getSubtitleView().setEllipsize(null);
        View view = e.getView();
        this.f = view;
        e90.e().e(context, viewGroup);
        b2.J(context.getString(C0707R.string.data_saver_mode_settings_enabled));
        b2.W(context.getString(C0707R.string.data_saver_mode_settings_disabled));
        b2.w(context.getString(C0707R.string.data_saver_mode_settings_enabled_subtitle));
        b2.E(null);
        pasteLinearLayout.addView(b2.getView());
        pasteLinearLayout.addView(pasteLinearLayout2);
        pasteLinearLayout.addView(view);
        c(false);
        pasteLinearLayout.setTag(C0707R.id.glue_viewholder_tag, this);
    }

    public uv4 b() {
        return this.c;
    }

    public void c(boolean z) {
        int i = 0;
        boolean z2 = z && this.b.getChildCount() > 0;
        this.b.setVisibility(z2 ? 0 : 8);
        View view = this.f;
        if (z2) {
            i = 8;
        }
        view.setVisibility(i);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }
}
