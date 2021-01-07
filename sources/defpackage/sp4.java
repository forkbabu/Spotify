package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.core.content.a;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.components.toolbar.ToolbarSide;
import com.spotify.android.glue.components.toolbar.c;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.internal.StateListAnimatorImageButton;

/* renamed from: sp4  reason: default package */
public class sp4 implements xp4 {
    private final tp4 a;
    private final Context b;
    private ImageButton c;
    private ImageButton d;
    private c e;

    public sp4(Context context, tp4 tp4) {
        this.b = context;
        this.a = tp4;
    }

    private ImageButton a(SpotifyIconV2 spotifyIconV2, int i, String str) {
        StateListAnimatorImageButton stateListAnimatorImageButton = new StateListAnimatorImageButton(this.b);
        Context context = this.b;
        stateListAnimatorImageButton.setImageDrawable(new SpotifyIconDrawable(context, spotifyIconV2, (float) context.getResources().getDimensionPixelSize(C0707R.dimen.toolbar_context_menu_icon_size)));
        int i2 = q4.g;
        int i3 = Build.VERSION.SDK_INT;
        stateListAnimatorImageButton.setBackground(null);
        stateListAnimatorImageButton.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        stateListAnimatorImageButton.setId(i);
        stateListAnimatorImageButton.setContentDescription(str);
        return stateListAnimatorImageButton;
    }

    public c b() {
        return this.e;
    }

    public void c() {
        this.d.setVisibility(8);
    }

    public void d(int i) {
        this.e.setBackgroundColor(i);
        this.e.getView().setBackgroundColor(a.b(this.b, i));
    }

    public void e() {
        this.e.F0(false);
    }

    public void f(String str) {
        this.e.setTitle(str);
    }

    public void g(float f) {
        this.e.o(f);
    }

    public void h(c cVar, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        this.e = cVar;
        this.c = a(SpotifyIconV2.X, C0707R.id.actionbar_close, this.b.getString(C0707R.string.connect_close_button_accessibility));
        this.d = a(SpotifyIconV2.HELPCIRCLE, C0707R.id.actionbar_help, this.b.getString(C0707R.string.connect_help_button_accessibility));
        this.c.setOnClickListener(onClickListener);
        this.d.setOnClickListener(onClickListener2);
        this.e.H1(ToolbarSide.START, this.c, C0707R.id.actionbar_close);
        this.e.H1(ToolbarSide.END, this.d, C0707R.id.actionbar_help);
        this.a.a(this, this.b.getString(C0707R.string.connect_picker_header_text));
    }

    public void i() {
        this.d.setVisibility(0);
    }

    public void j(SpotifyIconV2 spotifyIconV2) {
        Context context = this.b;
        this.c.setImageDrawable(new SpotifyIconDrawable(context, spotifyIconV2, (float) context.getResources().getDimensionPixelSize(C0707R.dimen.toolbar_context_menu_icon_size)));
    }

    public void k(String str) {
        l(str, this.b.getString(C0707R.string.connect_picker_header_text));
    }

    public void l(String str, String str2) {
        this.a.b(str, this.b.getResources().getConfiguration().orientation, str2, this);
    }

    public void m(Fragment fragment) {
        if (fragment != null) {
            zn4 zn4 = null;
            Bundle D2 = fragment.D2();
            if (D2 != null) {
                zn4 = (zn4) D2.get("tag_education_item");
            }
            String X2 = fragment.X2();
            if (X2 == null) {
                return;
            }
            if (zn4 != null) {
                l(X2, zn4.h());
            } else {
                l(X2, this.b.getString(C0707R.string.connect_picker_header_text));
            }
        }
    }
}
