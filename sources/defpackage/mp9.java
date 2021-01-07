package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.C0707R;

/* renamed from: mp9  reason: default package */
public class mp9 implements np9 {
    private final View a;
    private final TextView b;
    private final TextView c;

    public mp9(Context context, ViewGroup viewGroup) {
        context.getClass();
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.home_section_header, viewGroup, false);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(C0707R.id.title);
        this.c = (TextView) inflate.findViewById(C0707R.id.subtitle);
        q4.J(inflate, true);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // defpackage.np9
    public void r1(int i) {
        this.b.setTextSize(0, (float) i);
    }

    @Override // defpackage.np9
    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.c.setText(charSequence);
            this.c.setVisibility(0);
            return;
        }
        this.c.setVisibility(8);
    }

    @Override // defpackage.np9
    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.b.setText(charSequence);
            this.b.setVisibility(0);
            return;
        }
        this.b.setVisibility(8);
    }
}
