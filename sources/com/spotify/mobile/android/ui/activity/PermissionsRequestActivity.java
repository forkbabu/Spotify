package com.spotify.mobile.android.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.app.a;
import com.spotify.android.paste.app.a;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import defpackage.ij9;
import defpackage.zi9;
import io.reactivex.s;

public class PermissionsRequestActivity extends Activity implements a.b, ij9.b, zi9 {
    public static final /* synthetic */ int f = 0;
    private com.spotify.android.paste.app.a a;
    private boolean b = true;
    private final zi9.a c = new zi9.a();

    public static Intent c(Context context, String... strArr) {
        if (strArr.length != 0) {
            Intent intent = new Intent(context, PermissionsRequestActivity.class);
            intent.putExtra("REQUESTED_PERMISSIONS", strArr);
            return intent;
        }
        throw new IllegalArgumentException("Permissions list is empty");
    }

    @Override // defpackage.dj9
    public void E(String str, String str2) {
        this.c.E(str, str2);
    }

    @Override // defpackage.dj9
    public void K() {
        this.c.K();
    }

    @Override // defpackage.zi9
    public s<ej9> o() {
        return this.c.o();
    }

    /* access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            String[] stringArrayExtra = getIntent().getStringArrayExtra("REQUESTED_PERMISSIONS");
            Assertion.j("empty permissions list", stringArrayExtra.length != 0);
            String string = getIntent().getExtras().getString("permission_rationale", "");
            boolean booleanExtra = getIntent().getBooleanExtra("permission_rationale_always_show", false);
            for (String str : stringArrayExtra) {
                booleanExtra |= androidx.core.app.a.j(this, str);
            }
            if (!booleanExtra || TextUtils.isEmpty(string)) {
                androidx.core.app.a.i(this, stringArrayExtra, 49374);
                return;
            }
            setContentView(C0707R.layout.empty_layout);
            setFinishOnTouchOutside(false);
            a.C0151a aVar = new a.C0151a(this, C0707R.style.res_2132083502_theme_glue_dialog_tos);
            aVar.k(true);
            aVar.e(string);
            aVar.j(C0707R.string.ok_with_exclamation_mark, new g(this, stringArrayExtra));
            aVar.i(new f(this, stringArrayExtra));
            aVar.f(this, PageIdentifiers.DIALOG_REQUESTPERMISSIONS_SHOWRATIONALE.path(), ViewUris.Y1.toString());
            com.spotify.android.paste.app.a c2 = aVar.c();
            this.a = c2;
            c2.show();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.spotify.android.paste.app.a aVar = this.a;
        if (aVar != null && aVar.isShowing()) {
            this.b = false;
            this.a.dismiss();
            this.a = null;
        }
    }

    @Override // android.app.Activity, androidx.core.app.a.b
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        a aVar = new a(strArr, iArr);
        Intent intent = new Intent();
        intent.putExtra("permission_result", aVar);
        setResult(-1, intent);
        finish();
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.REQUESTPERMISSIONS, ViewUris.Y1.toString());
    }

    public static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0199a();
        private final String[] a;
        private final int[] b;

        /* renamed from: com.spotify.mobile.android.ui.activity.PermissionsRequestActivity$a$a  reason: collision with other inner class name */
        static class C0199a implements Parcelable.Creator<a> {
            C0199a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public a[] newArray(int i) {
                return new a[i];
            }
        }

        public a(String[] strArr, int[] iArr) {
            this.a = strArr;
            this.b = iArr;
        }

        public boolean a() {
            int[] iArr = this.b;
            int length = iArr.length;
            boolean z = true;
            for (int i = 0; i < length; i++) {
                z &= iArr[i] == 0;
            }
            return z;
        }

        public boolean b(String str) {
            int b2 = org.apache.commons.lang3.a.b(this.a, str);
            return b2 != -1 && this.b[b2] == 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a.length);
            parcel.writeStringArray(this.a);
            parcel.writeInt(this.b.length);
            parcel.writeIntArray(this.b);
        }

        protected a(Parcel parcel) {
            String[] strArr = new String[parcel.readInt()];
            this.a = strArr;
            parcel.readStringArray(strArr);
            int[] iArr = new int[parcel.readInt()];
            this.b = iArr;
            parcel.readIntArray(iArr);
        }
    }
}
