package defpackage;

import android.content.Context;
import android.view.View;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

/* renamed from: rn2  reason: default package */
public final class rn2 extends tu1 {
    private final Context d;

    /* renamed from: rn2$a */
    static final class a implements View.OnClickListener {
        final /* synthetic */ rn2 a;

        a(rn2 rn2) {
            this.a = rn2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.m();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rn2(Context context) {
        super(true);
        h.e(context, "context");
        this.d = context;
    }

    @Override // defpackage.uu1
    public Integer b() {
        return Integer.valueOf(androidx.core.content.a.b(this.d, R.color.white));
    }

    @Override // defpackage.tu1, defpackage.uu1
    public Integer c() {
        return Integer.valueOf(this.d.getResources().getDimensionPixelOffset(C0707R.dimen.tooltip_anchor_distance));
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.tu1
    public int l() {
        return C0707R.layout.tooltip_carmode_home;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.tu1
    public void n(View view) {
        h.e(view, "rootView");
        view.findViewById(C0707R.id.tooltip_close_btn).setOnClickListener(new a(this));
    }
}
