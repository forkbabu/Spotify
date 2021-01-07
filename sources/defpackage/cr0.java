package defpackage;

import android.view.View;
import com.spotify.libs.callingcode.json.CallingCode;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import defpackage.xq0;

/* renamed from: cr0  reason: default package */
public class cr0 extends e<CallingCode> {
    static final Character E = 8206;
    private final xq0.b C;
    final i90 D;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public cr0(android.view.ViewGroup r4, defpackage.xq0.b r5) {
        /*
            r3 = this;
            k90 r0 = defpackage.e90.g()
            android.content.Context r1 = r4.getContext()
            r0.getClass()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r1)
            r1 = 2131624440(0x7f0e01f8, float:1.887606E38)
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            j90 r0 = new j90
            r0.<init>(r4)
            android.view.View r4 = r0.getView()
            r1 = 2131428622(0x7f0b050e, float:1.8478894E38)
            r4.setTag(r1, r0)
            android.view.View r4 = r0.getView()
            r3.<init>(r4)
            r3.D = r0
            r5.getClass()
            r3.C = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cr0.<init>(android.view.ViewGroup, xq0$b):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
    public void h0(CallingCode callingCode, int i) {
        CallingCode callingCode2 = callingCode;
        ((j90) this.D).b(callingCode2.c());
        i90 i90 = this.D;
        ((j90) i90).c(E + callingCode2.a());
        this.a.setOnClickListener(new tq0(this, callingCode2));
    }

    public /* synthetic */ void u0(CallingCode callingCode, View view) {
        if (w() != -1) {
            this.C.a(callingCode);
        }
    }
}
