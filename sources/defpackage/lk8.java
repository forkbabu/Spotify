package defpackage;

import android.os.Build;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.spotify.music.C0707R;
import com.spotify.music.settings.SettingsState;
import com.spotify.music.settings.a;

/* renamed from: lk8  reason: default package */
public class lk8 extends bk8 {
    private final com.spotify.music.settings.a n;
    private boolean o;
    private boolean p;
    private final SwitchCompat q;
    private a.C0340a<Boolean> r;
    private sg0<SettingsState, Boolean> s;
    private final View.OnClickListener t = new a();
    private c u;
    private final CompoundButton.OnCheckedChangeListener v = new b();

    /* renamed from: lk8$a */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            lk8.this.q.toggle();
        }
    }

    /* renamed from: lk8$b */
    class b implements CompoundButton.OnCheckedChangeListener {
        b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z != lk8.this.p) {
                lk8.this.E();
                if (lk8.this.u != null) {
                    lk8.this.u.a(z);
                }
            }
        }
    }

    /* renamed from: lk8$c */
    public interface c {
        void a(boolean z);
    }

    public lk8(View view, x90 x90, com.spotify.music.settings.a aVar) {
        super(view, x90);
        this.n = aVar;
        SwitchCompat switchCompat = new SwitchCompat(b(), null);
        this.q = switchCompat;
        TextView subtitleView = x90.getSubtitleView();
        int i = q4.g;
        if (Build.VERSION.SDK_INT >= 17) {
            subtitleView.setLabelFor(C0707R.id.settings_menu_toggle);
        }
        switchCompat.setId(C0707R.id.settings_menu_toggle);
        this.c.z0(switchCompat);
    }

    public void E() {
        this.n.b(this.r, Boolean.valueOf(this.q.isChecked()));
    }

    public void J(sg0<SettingsState, Boolean> sg0) {
        this.s = sg0;
    }

    public void W(c cVar) {
        this.u = cVar;
    }

    public void e0(a.C0340a<Boolean> aVar) {
        this.r = aVar;
    }

    @Override // defpackage.bk8, defpackage.hk8
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.q.setEnabled(z);
    }

    @Override // defpackage.hk8
    public void v0(SettingsState settingsState) {
        boolean booleanValue = this.s.apply(settingsState).booleanValue();
        if (!this.o || this.p != booleanValue) {
            this.o = true;
            setOnClickListener(null);
            this.q.setOnCheckedChangeListener(null);
            this.p = booleanValue;
            this.q.setChecked(booleanValue);
            setOnClickListener(this.t);
            this.q.setOnCheckedChangeListener(this.v);
        }
    }

    public SwitchCompat w() {
        return this.q;
    }
}
