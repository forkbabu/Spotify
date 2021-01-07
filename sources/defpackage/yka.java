package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.spotify.libs.callingcode.json.CallingCode;
import com.spotify.libs.otp.ui.j0;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;
import com.spotify.music.libs.callingcode.CallingCodePickerActivity;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yka  reason: default package */
public class yka<H extends Parcelable> extends j0<H> {
    private final Fragment r;

    /* renamed from: yka$b */
    private class b extends m {
        b(a aVar) {
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void b(int i, int i2, Intent intent) {
            CallingCode callingCode;
            if (i2 == -1 && i == 46 && intent != null && (callingCode = (CallingCode) intent.getParcelableExtra("calling-code")) != null) {
                yka.this.q(callingCode);
            }
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void b1(Bundle bundle) {
            yka.this.n(bundle);
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void c(Bundle bundle) {
            yka.this.o(bundle);
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void d(Bundle bundle) {
            yka.this.n(bundle);
        }
    }

    public yka(Context context, Fragment fragment, k kVar, br0 br0, y yVar, y yVar2, j0.c cVar, j0.b<H> bVar) {
        super(context, br0, yVar, yVar2, cVar, bVar);
        this.r = fragment;
        kVar.y0(new b(null));
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.libs.otp.ui.j0
    public void r(List<CallingCode> list, CallingCode callingCode) {
        Context l4 = this.r.l4();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list);
        int i = CallingCodePickerActivity.G;
        Intent intent = new Intent(l4, CallingCodePickerActivity.class);
        intent.putExtra("selected-country-code", callingCode != null ? callingCode.b() : null);
        intent.putParcelableArrayListExtra("calling-codes", arrayList);
        this.r.H4(intent, 46, null);
    }
}
