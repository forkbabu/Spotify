package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.libs.connect.instrumentation.e;
import com.spotify.music.C0707R;
import defpackage.qp4;

/* renamed from: ln4  reason: default package */
public class ln4 implements qu0 {
    private final qp4 a;
    private final bq4 b;
    private final dq4 c;
    private final zp4 d;
    private final e e;
    private a f;
    private c g;
    private boolean h;
    private boolean i;

    /* renamed from: ln4$a */
    public interface a {
    }

    /* renamed from: ln4$b */
    public static class b extends RecyclerView.b0 {
        final y90 C;

        public b(y90 y90) {
            super(y90.getView());
            this.C = y90;
        }
    }

    /* renamed from: ln4$c */
    public interface c {
    }

    public ln4(qp4 qp4, bq4 bq4, dq4 dq4, zp4 zp4, e eVar) {
        this.a = qp4;
        this.b = bq4;
        this.c = dq4;
        this.d = zp4;
        this.e = eVar;
    }

    @Override // defpackage.qu0
    public RecyclerView.b0 b(ViewGroup viewGroup, int i2) {
        return new b(e90.d().i(viewGroup.getContext(), viewGroup));
    }

    @Override // defpackage.qu0
    public int c() {
        return this.a.a().size();
    }

    @Override // defpackage.qu0
    public int[] e() {
        return new int[]{31};
    }

    @Override // defpackage.qu0
    public void f(RecyclerView.b0 b0Var, int i2) {
        com.spotify.libs.connect.model.a aVar = this.a.a().get(i2);
        boolean z = true;
        if (b0Var instanceof b) {
            b bVar = (b) b0Var;
            Context context = bVar.a.getContext();
            bVar.C.z0(z42.i(context, SpotifyIconV2.MORE_ANDROID));
            TextView subtitleView = bVar.C.getSubtitleView();
            bVar.C.setActive(aVar.isActive());
            View view = bVar.a;
            if (this.h || aVar.isDisabled()) {
                z = false;
            }
            view.setEnabled(z);
            if (aVar.isActive()) {
                bVar.C.setTitle(this.c.a(this.i));
            } else {
                bVar.C.setTitle(aVar.getName());
            }
            bVar.C.setSubtitle(this.c.b(aVar));
            subtitleView.setTextColor(androidx.core.content.a.c(context, C0707R.color.txt_connect_picker_subtitle));
            subtitleView.setCompoundDrawablesWithIntrinsicBounds(this.b.c(subtitleView, aVar), (Drawable) null, (Drawable) null, (Drawable) null);
            int f2 = this.b.f();
            bVar.C.getImageView().setPadding(f2, f2, f2, f2);
            bVar.C.getImageView().setImageDrawable(this.b.a(aVar));
            if (this.d.c(aVar)) {
                View W1 = bVar.C.W1();
                W1.setVisibility(0);
                W1.setOnClickListener(new hn4(this, aVar, i2));
            } else {
                View W12 = bVar.C.W1();
                W12.setVisibility(4);
                W12.setOnClickListener(null);
            }
            ((vt0) this.e.b()).e(aVar.getLoggingIdentifier(), i2);
            bVar.a.setOnClickListener(new in4(this, bVar, aVar, i2));
            return;
        }
        throw new RuntimeException(String.format("Wrong ViewHolder received. Expected: %s Received: %s", b.class.getSimpleName(), b0Var.getClass().getSimpleName()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if ((r4.getState() == com.spotify.libs.connect.model.DeviceState.GaiaDeviceState.CONNECTING) == false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(defpackage.ln4.b r3, com.spotify.libs.connect.model.a r4, int r5, android.view.View r6) {
        /*
            r2 = this;
            ln4$a r6 = r2.f
            if (r6 == 0) goto L_0x0048
            android.view.View r3 = r3.a
            boolean r3 = r3.isEnabled()
            if (r3 == 0) goto L_0x0048
            zp4 r3 = r2.d
            r3.getClass()
            boolean r3 = r4.isActive()
            r6 = 1
            r0 = 0
            if (r3 != 0) goto L_0x002d
            boolean r3 = r4.isDisabled()
            if (r3 != 0) goto L_0x002d
            com.spotify.libs.connect.model.DeviceState r3 = r4.getState()
            com.spotify.libs.connect.model.DeviceState$GaiaDeviceState r1 = com.spotify.libs.connect.model.DeviceState.GaiaDeviceState.CONNECTING
            if (r3 != r1) goto L_0x0029
            r3 = 1
            goto L_0x002a
        L_0x0029:
            r3 = 0
        L_0x002a:
            if (r3 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r6 = 0
        L_0x002e:
            if (r6 == 0) goto L_0x0048
            com.spotify.libs.connect.instrumentation.e r3 = r2.e
            com.spotify.libs.connect.instrumentation.e$b r3 = r3.a()
            java.lang.String r6 = r4.getLoggingIdentifier()
            zt0 r3 = (defpackage.zt0) r3
            r3.n(r6, r5)
            ln4$a r3 = r2.f
            ap4 r3 = (defpackage.ap4) r3
            fp4 r3 = r3.a
            r3.l(r4, r5)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln4.g(ln4$b, com.spotify.libs.connect.model.a, int, android.view.View):void");
    }

    @Override // defpackage.qu0
    public long getItemId(int i2) {
        return (long) this.a.a().get(i2).hashCode();
    }

    @Override // defpackage.qu0
    public int getItemViewType(int i2) {
        return 31;
    }

    public void h(com.spotify.libs.connect.model.a aVar, int i2, View view) {
        if (this.g != null) {
            ((zt0) this.e.a()).h(aVar.getLoggingIdentifier(), i2);
            ((zo4) this.g).a.m(aVar, i2);
        }
    }

    public void i(a aVar) {
        this.f = aVar;
    }

    public void j(boolean z) {
        this.h = z;
    }

    public void k(boolean z) {
        this.i = z;
    }

    public void l(c cVar) {
        this.g = cVar;
    }

    public void m(qp4.a aVar) {
        this.a.c(aVar);
    }

    public void start() {
        this.a.d();
    }

    public void stop() {
        this.a.e();
    }
}
