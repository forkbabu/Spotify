package defpackage;

import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.cosmos.router.Response;
import com.spotify.music.C0707R;
import com.spotify.music.settings.SettingsState;
import com.spotify.rxjava2.p;
import io.reactivex.android.schedulers.a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: kk8  reason: default package */
public class kk8 implements hk8 {
    private final View a;
    private final Context b;
    private final ok8 c;
    private final LayerDrawable f;
    private final TextView n;
    private final TextView o;
    private final TextView p;
    private final TextView q;
    private final p r = new p();

    public kk8(Context context, ViewGroup viewGroup, ok8 ok8) {
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.settings_storage_bar, viewGroup, false);
        this.a = inflate;
        this.b = context;
        this.c = ok8;
        this.n = (TextView) inflate.findViewById(C0707R.id.device_storage_other);
        this.o = (TextView) inflate.findViewById(C0707R.id.device_storage_downloads);
        this.p = (TextView) inflate.findViewById(C0707R.id.device_storage_cache);
        this.q = (TextView) inflate.findViewById(C0707R.id.device_storage_free);
        this.f = (LayerDrawable) ((ImageView) inflate.findViewById(C0707R.id.device_storage_progress)).getDrawable();
        w();
    }

    public static void c(kk8 kk8, Response response) {
        kk8.getClass();
        if (response.getStatus() == 200) {
            try {
                JSONObject jSONObject = new JSONObject(response.getBodyString());
                int i = jSONObject.getInt("total_space");
                int i2 = jSONObject.getInt("free_space");
                int i3 = jSONObject.getInt("current_size");
                int i4 = jSONObject.getInt("current_locked_size");
                int i5 = (i - i2) - i3;
                kk8.g(C0707R.id.storage_progress_cache, i5 + i3, i);
                kk8.g(C0707R.id.storage_progress_downloads, i5 + i4, i);
                kk8.g(C0707R.id.storage_progress_others, i5, i);
                kk8.d(kk8.n, C0707R.id.device_storage_row_other, i5);
                kk8.d(kk8.o, C0707R.id.device_storage_row_downloads, i4);
                kk8.d(kk8.p, C0707R.id.device_storage_row_cache, i3 - i4);
                kk8.d(kk8.q, C0707R.id.device_storage_row_free, i2);
            } catch (JSONException unused) {
            }
        }
    }

    private void d(TextView textView, int i, int i2) {
        String str;
        if (i2 <= 0) {
            this.a.findViewById(i).setVisibility(8);
            return;
        }
        this.a.findViewById(i).setVisibility(0);
        Context context = this.b;
        if (i2 >= 1024) {
            double d = (double) i2;
            Double.isNaN(d);
            Double.isNaN(d);
            str = context.getString(C0707R.string.settings_storage_byte_unit_gigabytes_formatted_decimal, Double.valueOf(d / 1024.0d));
        } else {
            str = context.getString(C0707R.string.settings_storage_byte_unit_megabytes_formatted_decimal, Double.valueOf((double) i2));
        }
        textView.setText(str);
    }

    private void g(int i, int i2, int i3) {
        ((ClipDrawable) this.f.findDrawableByLayerId(i).mutate()).setLevel((int) ((((float) i2) * 10000.0f) / ((float) i3)));
    }

    @Override // defpackage.hk8
    public void B0(CharSequence charSequence) {
    }

    @Override // defpackage.hk8
    public void Y1() {
    }

    public void b() {
        this.r.a();
    }

    @Override // defpackage.hk8, com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // defpackage.hk8
    public void setEnabled(boolean z) {
        this.a.setEnabled(z);
    }

    @Override // defpackage.hk8
    public void setId(int i) {
        this.a.setId(i);
    }

    @Override // defpackage.hk8
    public void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override // defpackage.hk8
    public void setTitle(String str) {
    }

    @Override // defpackage.hk8
    public void v0(SettingsState settingsState) {
    }

    public final void w() {
        this.r.b(this.c.b().B(a.b()).subscribe(new ak8(this)));
    }
}
