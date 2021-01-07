package defpackage;

import android.os.Build;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.google.common.base.Optional;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;
import com.spotify.music.C0707R;
import com.spotify.music.libs.mediasession.SpotifyRemoteControlClient;
import com.spotify.music.settings.SettingsState;

/* renamed from: ck8  reason: default package */
public class ck8 extends bk8 {
    private final SwitchCompat n;
    private final i o;
    private boolean p;
    private Optional<c> q;

    /* renamed from: ck8$a */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ck8.this.n.toggle();
        }
    }

    /* renamed from: ck8$b */
    class b implements CompoundButton.OnCheckedChangeListener {
        b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (ck8.this.q.isPresent()) {
                ((c) ck8.this.q.get()).a(z);
            }
            if (z != ck8.this.p) {
                ck8.this.p = z;
                ck8.this.E();
            }
        }
    }

    /* renamed from: ck8$c */
    public interface c {
        void a(boolean z);
    }

    public ck8(View view, x90 x90, i iVar) {
        super(view, x90);
        this.o = iVar;
        SwitchCompat switchCompat = new SwitchCompat(b(), null);
        this.n = switchCompat;
        this.c.z0(switchCompat);
        TextView subtitleView = x90.getSubtitleView();
        int i = q4.g;
        if (Build.VERSION.SDK_INT >= 17) {
            subtitleView.setLabelFor(C0707R.id.settings_menu_toggle);
        }
        switchCompat.setId(C0707R.id.settings_menu_toggle);
        setOnClickListener(new a());
        switchCompat.setOnCheckedChangeListener(new b());
    }

    public void E() {
        SpSharedPreferences.a<Object> b2 = this.o.d(b()).b();
        b2.a(SpotifyRemoteControlClient.w, this.p);
        b2.i();
    }

    public void J(c cVar) {
        this.q = Optional.fromNullable(cVar);
    }

    @Override // defpackage.bk8, defpackage.hk8
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.n.setEnabled(z);
    }

    @Override // defpackage.hk8
    public void v0(SettingsState settingsState) {
        boolean d = this.o.d(b()).d(SpotifyRemoteControlClient.w, false);
        this.p = d;
        this.n.setChecked(d);
    }
}
