package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.common.base.Optional;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import com.spotify.music.inappmessaging.MessageRequest;
import com.spotify.music.settings.SettingsState;
import com.spotify.music.settings.a;
import com.spotify.ubi.specification.factories.r3;
import java.util.Arrays;

/* renamed from: jk8  reason: default package */
public class jk8 extends bk8 {
    private final com.spotify.music.settings.a n;
    private a.C0340a<Integer> o;
    private sg0<SettingsState, Integer> p;
    private final Spinner q;
    private int r = -1;
    private c s;
    private String[] t;
    private b u;
    private final com.spotify.music.inappmessaging.b v;
    private final SnackbarManager w;
    private final ere x;
    private final r3 y;
    private final AdapterView.OnItemSelectedListener z = new a();

    /* renamed from: jk8$a */
    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (jk8.this.t == null || jk8.this.t.length <= i || jk8.this.t[i] == null) {
                int i2 = jk8.this.r;
                jk8.this.r = i;
                if (i2 != jk8.this.r) {
                    if (jk8.this.u != null) {
                        jk8.this.u.a(i, i2);
                    }
                    jk8.this.P0();
                    return;
                }
                return;
            }
            String str = jk8.this.t[i];
            if ("streaming-quality".equals(str)) {
                jk8.this.v.b(MessageRequest.a("upsell", jk8.this.t[i], "v1"));
            } else if ("mini-streaming-quality".equals(str)) {
                jk8.this.x.a(jk8.this.y.k().e().c().a());
                je.e(C0707R.string.toast_streaming_quality_not_available, jk8.this.w);
            } else if ("mini-download-quality".equals(str)) {
                jk8.this.x.a(jk8.this.y.k().b().c().a());
                je.e(C0707R.string.toast_download_quality_not_available, jk8.this.w);
            } else {
                je.e(C0707R.string.toast_feature_not_available, jk8.this.w);
            }
            if (i == jk8.this.r) {
                jk8.this.q.setSelection(jk8.this.s.c());
            } else {
                jk8.this.q.setSelection(jk8.this.r);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            jk8.this.r = -1;
        }
    }

    /* renamed from: jk8$b */
    public interface b {
        void a(int i, int i2);
    }

    /* renamed from: jk8$c */
    public interface c {
        Optional<Integer> a(int i);

        int b(int i);

        int c();
    }

    public jk8(View view, x90 x90, com.spotify.music.settings.a aVar, com.spotify.music.inappmessaging.b bVar, SnackbarManager snackbarManager, ere ere, r3 r3Var) {
        super(view, x90);
        this.n = aVar;
        Spinner spinner = new Spinner(b());
        this.q = spinner;
        this.c.z0(spinner);
        this.v = bVar;
        this.w = snackbarManager;
        this.x = ere;
        this.y = r3Var;
    }

    public void A1(c cVar) {
        this.s = cVar;
    }

    public void E1(a.C0340a<Integer> aVar) {
        this.o = aVar;
    }

    public void P0() {
        int i = this.r;
        if (i >= 0) {
            this.n.b(this.o, Integer.valueOf(this.s.b(i)));
        }
    }

    public void S0(SpinnerAdapter spinnerAdapter) {
        this.q.setOnItemSelectedListener(null);
        this.q.setAdapter(spinnerAdapter);
    }

    public void Z0(sg0<SettingsState, Integer> sg0) {
        this.p = sg0;
    }

    public void b1(String[] strArr) {
        this.t = (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Override // defpackage.bk8, defpackage.hk8
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        this.q.setEnabled(z2);
    }

    @Override // defpackage.hk8
    public void v0(SettingsState settingsState) {
        this.q.setOnItemSelectedListener(null);
        Optional<Integer> a2 = this.s.a(this.p.apply(settingsState).intValue());
        if (a2.or((Optional<Integer>) 0).intValue() >= this.q.getCount()) {
            a2 = Optional.absent();
        }
        int intValue = a2.or((Optional<Integer>) Integer.valueOf(this.q.getCount())).intValue();
        this.r = intValue;
        this.q.setSelection(intValue);
        this.q.setOnItemSelectedListener(this.z);
    }

    public void z1(b bVar) {
        this.u = bVar;
    }
}
