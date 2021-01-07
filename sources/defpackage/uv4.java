package defpackage;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.spotify.music.C0707R;

/* renamed from: uv4  reason: default package */
public class uv4 implements g90 {
    private final x90 a;
    private final SwitchCompat b;
    private qg0<Boolean> c;
    private CharSequence f;
    private CharSequence n;
    private CharSequence o;
    private CharSequence p;

    uv4(x90 x90) {
        this.a = x90;
        TextView subtitleView = x90.getSubtitleView();
        View view = x90.getView();
        subtitleView.setEllipsize(null);
        subtitleView.setSingleLine(false);
        SwitchCompat switchCompat = new SwitchCompat(view.getContext(), null);
        this.b = switchCompat;
        switchCompat.setOnCheckedChangeListener(new sv4(this));
        view.setOnClickListener(new rv4(this));
        x90.z0(switchCompat);
        getView().setTag(C0707R.id.glue_viewholder_tag, this);
    }

    private void e0(boolean z) {
        this.a.setTitle(z ? this.f : this.n);
        this.a.setSubtitle(z ? this.o : this.p);
    }

    /* access modifiers changed from: package-private */
    public void E(CharSequence charSequence) {
        this.p = null;
        e0(this.b.isChecked());
    }

    /* access modifiers changed from: package-private */
    public void J(CharSequence charSequence) {
        this.f = charSequence;
        e0(this.b.isChecked());
    }

    /* access modifiers changed from: package-private */
    public void W(CharSequence charSequence) {
        this.n = charSequence;
        e0(this.b.isChecked());
    }

    public /* synthetic */ void b(CompoundButton compoundButton, boolean z) {
        qg0<Boolean> qg0 = this.c;
        if (qg0 != null) {
            qg0.accept(Boolean.valueOf(z));
        }
        e0(z);
    }

    public /* synthetic */ void c(View view) {
        this.b.toggle();
    }

    public void d(boolean z, boolean z2) {
        qg0<Boolean> qg0 = this.c;
        this.c = null;
        this.b.setChecked(z);
        if (!z2) {
            this.b.jumpDrawablesToCurrentState();
        }
        this.c = qg0;
    }

    public void g(qg0<Boolean> qg0) {
        this.c = qg0;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a.getView();
    }

    /* access modifiers changed from: package-private */
    public void w(CharSequence charSequence) {
        this.o = charSequence;
        e0(this.b.isChecked());
    }
}
