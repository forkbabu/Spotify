package com.facebook.share.internal;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.x;
import com.facebook.FacebookRequestError;
import com.facebook.HttpMethod;
import com.facebook.internal.h0;
import com.facebook.k;
import com.facebook.m;
import com.facebook.share.model.d;
import com.facebook.share.model.f;
import com.facebook.share.model.l;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.C0707R;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class DeviceShareDialogFragment extends DialogFragment {
    private static ScheduledThreadPoolExecutor A0;
    private ProgressBar u0;
    private TextView v0;
    private Dialog w0;
    private volatile c x0;
    private volatile ScheduledFuture y0;
    private d z0;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!uf.c(this)) {
                try {
                    DeviceShareDialogFragment.this.w0.dismiss();
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    DeviceShareDialogFragment.this.w0.dismiss();
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();
        private String a;
        private long b;

        static class a implements Parcelable.Creator<c> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public c[] newArray(int i) {
                return new c[i];
            }
        }

        c() {
        }

        public long a() {
            return this.b;
        }

        public String b() {
            return this.a;
        }

        public void c(long j) {
            this.b = j;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void e(String str) {
            this.a = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeLong(this.b);
        }

        protected c(Parcel parcel) {
            this.a = parcel.readString();
            this.b = parcel.readLong();
        }
    }

    private void d5(int i, Intent intent) {
        if (this.x0 != null) {
            sf.a(this.x0.b());
        }
        FacebookRequestError facebookRequestError = (FacebookRequestError) intent.getParcelableExtra(AppProtocol.LogMessage.SEVERITY_ERROR);
        if (facebookRequestError != null) {
            Toast.makeText(F2(), facebookRequestError.c(), 0).show();
        }
        if (e3()) {
            androidx.fragment.app.c B2 = B2();
            B2.setResult(i, intent);
            B2.finish();
        }
    }

    /* access modifiers changed from: private */
    public void e5(FacebookRequestError facebookRequestError) {
        if (e3()) {
            x i = K2().i();
            i.p(this);
            i.i();
        }
        Intent intent = new Intent();
        intent.putExtra(AppProtocol.LogMessage.SEVERITY_ERROR, facebookRequestError);
        d5(-1, intent);
    }

    /* access modifiers changed from: private */
    public void f5(c cVar) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        this.x0 = cVar;
        this.v0.setText(cVar.b());
        this.v0.setVisibility(0);
        this.u0.setVisibility(8);
        synchronized (DeviceShareDialogFragment.class) {
            if (A0 == null) {
                A0 = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = A0;
        }
        this.y0 = scheduledThreadPoolExecutor.schedule(new b(), cVar.a(), TimeUnit.SECONDS);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void N3(Bundle bundle) {
        super.N3(bundle);
        if (this.x0 != null) {
            bundle.putParcelable("request_state", this.x0);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog R4(Bundle bundle) {
        this.w0 = new Dialog(B2(), C0707R.style.com_facebook_auth_dialog);
        Bundle bundle2 = null;
        View inflate = B2().getLayoutInflater().inflate(C0707R.layout.com_facebook_device_auth_dialog_fragment, (ViewGroup) null);
        this.u0 = (ProgressBar) inflate.findViewById(C0707R.id.progress_bar);
        this.v0 = (TextView) inflate.findViewById(C0707R.id.confirmation_code);
        ((Button) inflate.findViewById(C0707R.id.cancel_button)).setOnClickListener(new a());
        ((TextView) inflate.findViewById(C0707R.id.com_facebook_device_auth_instructions)).setText(Html.fromHtml(V2(C0707R.string.com_facebook_device_auth_instructions)));
        this.w0.setContentView(inflate);
        d dVar = this.z0;
        if (dVar != null) {
            if (dVar instanceof f) {
                bundle2 = c.i((f) dVar);
            } else if (dVar instanceof l) {
                bundle2 = c.j((l) dVar);
            }
        }
        if (bundle2 == null || bundle2.size() == 0) {
            e5(new FacebookRequestError(0, "", "Failed to get share content"));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(h0.a());
        sb.append("|");
        String j = k.j();
        if (j != null) {
            sb.append(j);
            bundle2.putString("access_token", sb.toString());
            bundle2.putString("device_info", sf.b());
            new m(null, "device/share", bundle2, HttpMethod.POST, new b(this)).h();
            return this.w0;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token.");
    }

    public void g5(d dVar) {
        this.z0 = dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.y0 != null) {
            this.y0.cancel(true);
        }
        d5(-1, new Intent());
    }

    @Override // androidx.fragment.app.Fragment
    public View w3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        c cVar;
        View w3 = super.w3(layoutInflater, viewGroup, bundle);
        if (!(bundle == null || (cVar = (c) bundle.getParcelable("request_state")) == null)) {
            f5(cVar);
        }
        return w3;
    }
}
