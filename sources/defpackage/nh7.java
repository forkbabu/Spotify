package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.f;
import androidx.appcompat.widget.SwitchCompat;
import com.spotify.encore.foundation.R;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;

/* renamed from: nh7  reason: default package */
public final class nh7 implements lh7, g<ig7, gg7> {
    private final View a;
    private final SwitchCompat b;
    private final View c;
    private final TextView f;
    private f n;

    /* renamed from: nh7$a */
    public static final class a implements h<ig7> {
        final /* synthetic */ nh7 a;
        final /* synthetic */ da2 b;

        a(nh7 nh7, da2 da2) {
            this.a = nh7;
            this.b = da2;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            ig7 ig7 = (ig7) obj;
            kotlin.jvm.internal.h.e(ig7, "model");
            this.a.f.setText(ig7.c().a());
            if (!ig7.e() || !(ig7.b() instanceof og7)) {
                this.a.b.setEnabled(false);
            } else {
                this.a.b.setEnabled(true);
                nh7.f(this.a, (og7) ig7.b(), this.b);
            }
            this.a.c.setOnClickListener(new mh7(this));
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            this.a.b.setOnCheckedChangeListener(null);
        }
    }

    public nh7(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        kotlin.jvm.internal.h.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0707R.layout.notification_bottom_drawer, viewGroup, false);
        kotlin.jvm.internal.h.d(inflate, "inflater.inflate(R.layou…om_drawer, parent, false)");
        this.a = inflate;
        View G = q4.G(inflate, C0707R.id.opt_in_toggle);
        kotlin.jvm.internal.h.d(G, "ViewCompat.requireViewBy…root, R.id.opt_in_toggle)");
        SwitchCompat switchCompat = (SwitchCompat) G;
        this.b = switchCompat;
        View G2 = q4.G(inflate, C0707R.id.unfollow_row);
        kotlin.jvm.internal.h.d(G2, "ViewCompat.requireViewBy…(root, R.id.unfollow_row)");
        this.c = G2;
        View G3 = q4.G(inflate, C0707R.id.show_title);
        kotlin.jvm.internal.h.d(G3, "ViewCompat.requireViewBy…w>(root, R.id.show_title)");
        this.f = (TextView) G3;
        Context context = inflate.getContext();
        kotlin.jvm.internal.h.d(context, "root.context");
        androidx.core.graphics.drawable.a.i(androidx.core.graphics.drawable.a.l(switchCompat.getTrackDrawable()), new ColorStateList(new int[][]{new int[]{16842912}, new int[]{-16842912}}, new int[]{s2.h(androidx.core.content.a.b(context, R.color.green), (int) 100.0f), androidx.core.content.a.b(context, R.color.gray_30)}));
    }

    public static final void f(nh7 nh7, og7 og7, da2 da2) {
        nh7.b.setOnCheckedChangeListener(null);
        if (nh7.b.isChecked() != og7.a()) {
            nh7.b.setChecked(og7.a());
        }
        nh7.b.setOnCheckedChangeListener(new oh7(da2));
    }

    @Override // defpackage.lh7
    public void a() {
        f fVar = this.n;
        if (fVar != null) {
            fVar.show();
        } else {
            kotlin.jvm.internal.h.k("systemPermissionsDialog");
            throw null;
        }
    }

    @Override // defpackage.lh7
    public void b() {
        Context context = this.a.getContext();
        Intent intent = new Intent();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            kotlin.jvm.internal.h.d(context, "context");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        } else if (i >= 21) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            kotlin.jvm.internal.h.d(context, "context");
            intent.putExtra("app_package", context.getPackageName());
            intent.putExtra("app_uid", context.getApplicationInfo().uid);
        } else {
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            StringBuilder sb = new StringBuilder();
            sb.append("package:");
            kotlin.jvm.internal.h.d(context, "context");
            sb.append(context.getPackageName());
            intent.setData(Uri.parse(sb.toString()));
            intent.addCategory("android.intent.category.DEFAULT");
        }
        int i2 = androidx.core.content.a.b;
        context.startActivity(intent, null);
    }

    public final View g() {
        return this.a;
    }

    @Override // com.spotify.mobius.g
    public h<ig7> t(da2<gg7> da2) {
        kotlin.jvm.internal.h.e(da2, "eventConsumer");
        Context context = this.a.getContext();
        kotlin.jvm.internal.h.d(context, "root.context");
        f.a aVar = new f.a(context);
        aVar.g(C0707R.string.system_permission_dialog_message);
        aVar.k(C0707R.string.system_permission_dialog_allow_text, new kh7(0, da2));
        aVar.h(C0707R.string.system_permission_dialog_deny_text, new kh7(1, da2));
        f a2 = aVar.a();
        kotlin.jvm.internal.h.d(a2, "builder.create()");
        this.n = a2;
        return new a(this, da2);
    }
}
