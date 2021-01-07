package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: zl9  reason: default package */
public abstract class zl9 implements Object<FrameLayout>, pk9 {

    /* renamed from: zl9$a */
    public static final class a extends zl9 {
        @Override // defpackage.s51
        public void b(View view, s81 s81, s51.a aVar, int[] iArr) {
            g91.a((Button) ((FrameLayout) view).getChildAt(0), s81, aVar, h91.a);
        }

        @Override // defpackage.pk9
        public int d() {
            return C0707R.id.free_tier_secondary_button;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.zl9
        public Button f(Context context) {
            context.getClass();
            return (Button) com.spotify.android.paste.app.c.b(context, Button.class, null, C0707R.attr.solarButtonSecondary);
        }
    }

    /* renamed from: zl9$b */
    public static final class b extends zl9 {
        @Override // defpackage.s51
        public void b(View view, s81 s81, s51.a aVar, int[] iArr) {
            g91.a((Button) ((FrameLayout) view).getChildAt(0), s81, aVar, h91.a);
        }

        @Override // defpackage.pk9
        public int d() {
            return C0707R.id.free_tier_tertiary_button;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.zl9
        public Button f(Context context) {
            context.getClass();
            return (Button) com.spotify.android.paste.app.c.b(context, Button.class, null, C0707R.attr.solarButtonTertiary);
        }
    }

    /* renamed from: zl9$c */
    public static final class c extends zl9 {
        @Override // defpackage.s51
        public void b(View view, s81 s81, s51.a aVar, int[] iArr) {
            g91.a((Button) ((FrameLayout) view).getChildAt(0), s81, aVar, h91.a);
        }

        @Override // defpackage.pk9
        public int d() {
            return C0707R.id.free_tier_tertiary_outlined_button;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.zl9
        public Button f(Context context) {
            context.getClass();
            return (Button) com.spotify.android.paste.app.c.b(context, Button.class, null, C0707R.attr.solarButtonTertiaryOutlined);
        }

        @Override // defpackage.zl9
        public FrameLayout g(ViewGroup viewGroup, w51 w51) {
            FrameLayout g = zl9.super.h(viewGroup, w51);
            g.setPadding(0, 0, 0, viewGroup.getResources().getDimensionPixelSize(C0707R.dimen.tertiary_button_bottom_padding));
            return g;
        }

        @Override // defpackage.zl9, defpackage.s51
        public View h(ViewGroup viewGroup, w51 w51) {
            FrameLayout g = zl9.super.h(viewGroup, w51);
            g.setPadding(0, 0, 0, viewGroup.getResources().getDimensionPixelSize(C0707R.dimen.tertiary_button_bottom_padding));
            return g;
        }
    }

    /* renamed from: zl9$d */
    public static final class d extends zl9 {
        @Override // defpackage.s51
        public void b(View view, s81 s81, s51.a aVar, int[] iArr) {
            g91.a((Button) ((FrameLayout) view).getChildAt(0), s81, aVar, h91.a);
        }

        @Override // defpackage.pk9
        public int d() {
            return C0707R.id.free_tier_white_primary_button;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.zl9
        public Button f(Context context) {
            context.getClass();
            return (Button) com.spotify.android.paste.app.c.b(context, Button.class, null, C0707R.attr.solarButtonPrimaryWhite);
        }
    }

    public void a(FrameLayout frameLayout, s81 s81, w51 w51) {
        Button button = (Button) frameLayout.getChildAt(0);
        button.setText(s81.text().title());
        t51.a(w51, button, s81);
    }

    @Override // defpackage.s51
    public /* bridge */ /* synthetic */ void c(View view, s81 s81, w51 w51, s51.b bVar) {
        a((FrameLayout) view, s81, w51);
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
    }

    /* access modifiers changed from: protected */
    public abstract Button f(Context context);

    /* renamed from: g */
    public FrameLayout h(ViewGroup viewGroup, w51 w51) {
        Context context = viewGroup.getContext();
        Button f = f(context);
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.LayoutParams c2 = com.spotify.android.goldenpath.a.c(context, viewGroup);
        if (c2 != null) {
            frameLayout.setLayoutParams(c2);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        f.setLayoutParams(layoutParams);
        f.setText("");
        frameLayout.addView(f);
        return frameLayout;
    }
}
