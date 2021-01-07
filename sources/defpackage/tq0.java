package defpackage;

import android.view.View;
import com.spotify.libs.callingcode.json.CallingCode;

/* renamed from: tq0  reason: default package */
public final /* synthetic */ class tq0 implements View.OnClickListener {
    public final /* synthetic */ cr0 a;
    public final /* synthetic */ CallingCode b;

    public /* synthetic */ tq0(cr0 cr0, CallingCode callingCode) {
        this.a = cr0;
        this.b = callingCode;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.u0(this.b, view);
    }
}
