package com.facebook.login;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.HttpMethod;
import com.facebook.appevents.i;
import com.facebook.internal.f0;
import com.facebook.internal.h0;
import com.facebook.k;
import com.facebook.login.LoginClient;
import com.facebook.m;
import com.facebook.o;
import com.facebook.q;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.model.Ad;
import java.util.Date;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class DeviceAuthDialog extends DialogFragment {
    private volatile ScheduledFuture A0;
    private volatile d B0;
    private Dialog C0;
    private boolean D0 = false;
    private boolean E0 = false;
    private LoginClient.d F0 = null;
    private View u0;
    private TextView v0;
    private TextView w0;
    private g x0;
    private AtomicBoolean y0 = new AtomicBoolean();
    private volatile o z0;

    /* access modifiers changed from: package-private */
    public class a implements m.c {
        a() {
        }

        @Override // com.facebook.m.c
        public void b(q qVar) {
            if (!DeviceAuthDialog.this.D0) {
                if (qVar.e() != null) {
                    DeviceAuthDialog.this.o5(qVar.e().f());
                    return;
                }
                JSONObject f = qVar.f();
                d dVar = new d();
                try {
                    dVar.i(f.getString("user_code"));
                    dVar.h(f.getString("code"));
                    dVar.f(f.getLong("interval"));
                    DeviceAuthDialog.this.r5(dVar);
                } catch (JSONException e) {
                    DeviceAuthDialog.this.o5(new FacebookException(e));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!uf.c(this)) {
                try {
                    DeviceAuthDialog.this.n5();
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    DeviceAuthDialog.this.p5();
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();
        private String a;
        private String b;
        private String c;
        private long f;
        private long n;

        static class a implements Parcelable.Creator<d> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        d() {
        }

        public String a() {
            return this.a;
        }

        public long b() {
            return this.f;
        }

        public String c() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String e() {
            return this.b;
        }

        public void f(long j) {
            this.f = j;
        }

        public void g(long j) {
            this.n = j;
        }

        public void h(String str) {
            this.c = str;
        }

        public void i(String str) {
            this.b = str;
            this.a = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", str);
        }

        public boolean j() {
            if (this.n != 0 && (new Date().getTime() - this.n) - (this.f * 1000) < 0) {
                return true;
            }
            return false;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeLong(this.f);
            parcel.writeLong(this.n);
        }

        protected d(Parcel parcel) {
            this.a = parcel.readString();
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.f = parcel.readLong();
            this.n = parcel.readLong();
        }
    }

    static void j5(DeviceAuthDialog deviceAuthDialog, String str, Long l, Long l2) {
        Date date;
        deviceAuthDialog.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        Date date2 = null;
        if (l.longValue() != 0) {
            date = new Date((l.longValue() * 1000) + new Date().getTime());
        } else {
            date = null;
        }
        if (l2.longValue() != 0) {
            date2 = new Date(l2.longValue() * 1000);
        }
        new m(new com.facebook.a(str, k.e(), Ad.DEFAULT_SKIPPABLE_AD_DELAY, null, null, null, null, date, null, date2), "me", bundle, HttpMethod.GET, new f(deviceAuthDialog, str, date, date2)).h();
    }

    static void l5(DeviceAuthDialog deviceAuthDialog, String str, f0.d dVar, String str2, Date date, Date date2) {
        g gVar = deviceAuthDialog.x0;
        String e = k.e();
        List<String> c2 = dVar.c();
        List<String> a2 = dVar.a();
        List<String> b2 = dVar.b();
        AccessTokenSource accessTokenSource = AccessTokenSource.DEVICE_AUTH;
        gVar.getClass();
        gVar.b.e(LoginClient.Result.e(gVar.b.p, new com.facebook.a(str2, e, str, c2, a2, b2, accessTokenSource, date, null, date2)));
        deviceAuthDialog.C0.dismiss();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void p5() {
        this.B0.g(new Date().getTime());
        Bundle bundle = new Bundle();
        bundle.putString("code", this.B0.c());
        this.z0 = new m(null, "device/login_status", bundle, HttpMethod.POST, new c(this)).h();
    }

    /* access modifiers changed from: private */
    public void q5() {
        this.A0 = g.l().schedule(new c(), this.B0.b(), TimeUnit.SECONDS);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void r5(d dVar) {
        Bitmap bitmap;
        this.B0 = dVar;
        this.v0.setText(dVar.e());
        String a2 = dVar.a();
        int i = sf.b;
        EnumMap enumMap = new EnumMap(EncodeHintType.class);
        enumMap.put((EnumMap) EncodeHintType.MARGIN, (EncodeHintType) 2);
        try {
            com.google.zxing.common.b a3 = new com.google.zxing.b().a(a2, BarcodeFormat.QR_CODE, 200, 200, enumMap);
            int d2 = a3.d();
            int e = a3.e();
            int[] iArr = new int[(d2 * e)];
            for (int i2 = 0; i2 < d2; i2++) {
                int i3 = i2 * e;
                for (int i4 = 0; i4 < e; i4++) {
                    iArr[i3 + i4] = a3.c(i4, i2) ? -16777216 : -1;
                }
            }
            bitmap = Bitmap.createBitmap(e, d2, Bitmap.Config.ARGB_8888);
            try {
                bitmap.setPixels(iArr, 0, e, 0, 0, e, d2);
            } catch (WriterException unused) {
            }
        } catch (WriterException unused2) {
            bitmap = null;
        }
        this.w0.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, new BitmapDrawable(R2(), bitmap), (Drawable) null, (Drawable) null);
        this.v0.setVisibility(0);
        this.u0.setVisibility(8);
        if (!this.E0 && sf.d(dVar.e())) {
            new i(F2()).f("fb_smart_login_service");
        }
        if (dVar.j()) {
            q5();
        } else {
            p5();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        super.N3(bundle);
        if (this.B0 != null) {
            bundle.putParcelable("request_state", this.B0);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog R4(Bundle bundle) {
        this.C0 = new Dialog(B2(), C0707R.style.com_facebook_auth_dialog);
        this.C0.setContentView(m5(sf.c() && !this.E0));
        return this.C0;
    }

    /* access modifiers changed from: protected */
    public View m5(boolean z) {
        View inflate = B2().getLayoutInflater().inflate(z ? C0707R.layout.com_facebook_smart_device_dialog_fragment : C0707R.layout.com_facebook_device_auth_dialog_fragment, (ViewGroup) null);
        this.u0 = inflate.findViewById(C0707R.id.progress_bar);
        this.v0 = (TextView) inflate.findViewById(C0707R.id.confirmation_code);
        ((Button) inflate.findViewById(C0707R.id.cancel_button)).setOnClickListener(new b());
        TextView textView = (TextView) inflate.findViewById(C0707R.id.com_facebook_device_auth_instructions);
        this.w0 = textView;
        textView.setText(Html.fromHtml(V2(C0707R.string.com_facebook_device_auth_instructions)));
        return inflate;
    }

    /* access modifiers changed from: protected */
    public void n5() {
        if (this.y0.compareAndSet(false, true)) {
            if (this.B0 != null) {
                sf.a(this.B0.e());
            }
            g gVar = this.x0;
            if (gVar != null) {
                gVar.b.e(LoginClient.Result.a(gVar.b.p, "User canceled log in."));
            }
            this.C0.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void o5(FacebookException facebookException) {
        if (this.y0.compareAndSet(false, true)) {
            if (this.B0 != null) {
                sf.a(this.B0.e());
            }
            g gVar = this.x0;
            gVar.b.e(LoginClient.Result.b(gVar.b.p, null, facebookException.getMessage()));
            this.C0.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (!this.D0) {
            n5();
        }
    }

    public void s5(LoginClient.d dVar) {
        this.F0 = dVar;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", dVar.i()));
        String g = dVar.g();
        if (g != null) {
            bundle.putString("redirect_uri", g);
        }
        String f = dVar.f();
        if (f != null) {
            bundle.putString("target_user_id", f);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(h0.a());
        sb.append("|");
        String j = k.j();
        if (j != null) {
            sb.append(j);
            bundle.putString("access_token", sb.toString());
            bundle.putString("device_info", sf.b());
            new m(null, "device/login", bundle, HttpMethod.POST, new a()).h();
            return;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token.");
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        d dVar;
        View w3 = super.w3(layoutInflater, viewGroup, bundle);
        this.x0 = (g) ((LoginFragment) ((FacebookActivity) B2()).u()).L4().g();
        if (!(bundle == null || (dVar = (d) bundle.getParcelable("request_state")) == null)) {
            r5(dVar);
        }
        return w3;
    }

    @Override // androidx.fragment.app.Fragment
    public void x3() {
        this.D0 = true;
        this.y0.set(true);
        super.x3();
        if (this.z0 != null) {
            this.z0.cancel(true);
        }
        if (this.A0 != null) {
            this.A0.cancel(true);
        }
    }
}
