package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.x;
import com.spotify.music.C0707R;

public final class g {
    private static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    private static g c;
    public static final /* synthetic */ int d = 0;
    private x a;

    /* access modifiers changed from: package-private */
    public class a implements x.e {
        private final int[] a = {C0707R.drawable.abc_textfield_search_default_mtrl_alpha, C0707R.drawable.abc_textfield_default_mtrl_alpha, C0707R.drawable.abc_ab_share_pack_mtrl_alpha};
        private final int[] b = {C0707R.drawable.abc_ic_commit_search_api_mtrl_alpha, C0707R.drawable.abc_seekbar_tick_mark_material, C0707R.drawable.abc_ic_menu_share_mtrl_alpha, C0707R.drawable.abc_ic_menu_copy_mtrl_am_alpha, C0707R.drawable.abc_ic_menu_cut_mtrl_alpha, C0707R.drawable.abc_ic_menu_selectall_mtrl_alpha, C0707R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        private final int[] c = {C0707R.drawable.abc_textfield_activated_mtrl_alpha, C0707R.drawable.abc_textfield_search_activated_mtrl_alpha, C0707R.drawable.abc_cab_background_top_mtrl_alpha, C0707R.drawable.abc_text_cursor_material, C0707R.drawable.abc_text_select_handle_left_mtrl_dark, C0707R.drawable.abc_text_select_handle_middle_mtrl_dark, C0707R.drawable.abc_text_select_handle_right_mtrl_dark, C0707R.drawable.abc_text_select_handle_left_mtrl_light, C0707R.drawable.abc_text_select_handle_middle_mtrl_light, C0707R.drawable.abc_text_select_handle_right_mtrl_light};
        private final int[] d = {C0707R.drawable.abc_popup_background_mtrl_mult, C0707R.drawable.abc_cab_background_internal_bg, C0707R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        private final int[] e = {C0707R.drawable.abc_tab_indicator_material, C0707R.drawable.abc_textfield_search_material};
        private final int[] f = {C0707R.drawable.abc_btn_check_material, C0707R.drawable.abc_btn_radio_material, C0707R.drawable.abc_btn_check_material_anim, C0707R.drawable.abc_btn_radio_material_anim};

        a() {
        }

        private boolean a(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList b(Context context, int i) {
            int c2 = c0.c(context, C0707R.attr.colorControlHighlight);
            return new ColorStateList(new int[][]{c0.b, c0.d, c0.c, c0.f}, new int[]{c0.b(context, C0707R.attr.colorButtonNormal), s2.e(c2, i), s2.e(c2, i), i});
        }

        private void d(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (q.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = g.b;
            }
            drawable.setColorFilter(g.e(i, mode));
        }

        /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x005c: APUT  
          (r0v15 int[][])
          (0 ??[int, short, byte, char])
          (wrap: int[] : 0x005a: SGET  (r3v1 int[]) =  androidx.appcompat.widget.c0.b int[])
         */
        /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0062: APUT  
          (r10v11 int[])
          (0 ??[int, short, byte, char])
          (wrap: int : 0x005e: INVOKE  (r3v2 int) = (r9v0 android.content.Context), (wrap: ?? : ?: SGET   com.spotify.music.R.attr.colorSwitchThumbNormal int) type: STATIC call: androidx.appcompat.widget.c0.b(android.content.Context, int):int)
         */
        public ColorStateList c(Context context, int i) {
            if (i == C0707R.drawable.abc_edit_text_material) {
                return i0.a(context, C0707R.color.abc_tint_edittext);
            }
            if (i == C0707R.drawable.abc_switch_track_mtrl_alpha) {
                return i0.a(context, C0707R.color.abc_tint_switch_track);
            }
            if (i == C0707R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                ColorStateList d2 = c0.d(context, C0707R.attr.colorSwitchThumbNormal);
                if (d2 == null || !d2.isStateful()) {
                    iArr[0] = c0.b;
                    iArr2[0] = c0.b(context, C0707R.attr.colorSwitchThumbNormal);
                    iArr[1] = c0.e;
                    iArr2[1] = c0.c(context, C0707R.attr.colorControlActivated);
                    iArr[2] = c0.f;
                    iArr2[2] = c0.c(context, C0707R.attr.colorSwitchThumbNormal);
                } else {
                    iArr[0] = c0.b;
                    iArr2[0] = d2.getColorForState(iArr[0], 0);
                    iArr[1] = c0.e;
                    iArr2[1] = c0.c(context, C0707R.attr.colorControlActivated);
                    iArr[2] = c0.f;
                    iArr2[2] = d2.getDefaultColor();
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i == C0707R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, c0.c(context, C0707R.attr.colorButtonNormal));
            } else {
                if (i == C0707R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i == C0707R.drawable.abc_btn_colored_material) {
                    return b(context, c0.c(context, C0707R.attr.colorAccent));
                }
                if (i == C0707R.drawable.abc_spinner_mtrl_am_alpha || i == C0707R.drawable.abc_spinner_textfield_background_material) {
                    return i0.a(context, C0707R.color.abc_tint_spinner);
                }
                if (a(this.b, i)) {
                    return c0.d(context, C0707R.attr.colorControlNormal);
                }
                if (a(this.e, i)) {
                    return i0.a(context, C0707R.color.abc_tint_default);
                }
                if (a(this.f, i)) {
                    return i0.a(context, C0707R.color.abc_tint_btn_checkable);
                }
                if (i == C0707R.drawable.abc_seekbar_thumb_material) {
                    return i0.a(context, C0707R.color.abc_tint_seek_thumb);
                }
                return null;
            }
        }

        public boolean e(Context context, int i, Drawable drawable) {
            if (i == C0707R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                d(layerDrawable.findDrawableByLayerId(16908288), c0.c(context, C0707R.attr.colorControlNormal), g.b);
                d(layerDrawable.findDrawableByLayerId(16908303), c0.c(context, C0707R.attr.colorControlNormal), g.b);
                d(layerDrawable.findDrawableByLayerId(16908301), c0.c(context, C0707R.attr.colorControlActivated), g.b);
                return true;
            } else if (i != C0707R.drawable.abc_ratingbar_material && i != C0707R.drawable.abc_ratingbar_indicator_material && i != C0707R.drawable.abc_ratingbar_small_material) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                d(layerDrawable2.findDrawableByLayerId(16908288), c0.b(context, C0707R.attr.colorControlNormal), g.b);
                d(layerDrawable2.findDrawableByLayerId(16908303), c0.c(context, C0707R.attr.colorControlActivated), g.b);
                d(layerDrawable2.findDrawableByLayerId(16908301), c0.c(context, C0707R.attr.colorControlActivated), g.b);
                return true;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0065 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean f(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.g.a()
                int[] r1 = r6.a
                boolean r1 = r6.a(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x0018
                r2 = 2130968922(0x7f04015a, float:1.7546511E38)
            L_0x0015:
                r8 = -1
            L_0x0016:
                r1 = 1
                goto L_0x0048
            L_0x0018:
                int[] r1 = r6.c
                boolean r1 = r6.a(r1, r8)
                if (r1 == 0) goto L_0x0024
                r2 = 2130968920(0x7f040158, float:1.7546507E38)
                goto L_0x0015
            L_0x0024:
                int[] r1 = r6.d
                boolean r1 = r6.a(r1, r8)
                if (r1 == 0) goto L_0x002f
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L_0x0015
            L_0x002f:
                r1 = 2131230774(0x7f080036, float:1.807761E38)
                if (r8 != r1) goto L_0x003f
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L_0x0016
            L_0x003f:
                r1 = 2131230750(0x7f08001e, float:1.8077562E38)
                if (r8 != r1) goto L_0x0045
                goto L_0x0015
            L_0x0045:
                r8 = -1
                r1 = 0
                r2 = 0
            L_0x0048:
                if (r1 == 0) goto L_0x0065
                boolean r1 = androidx.appcompat.widget.q.a(r9)
                if (r1 == 0) goto L_0x0054
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L_0x0054:
                int r7 = androidx.appcompat.widget.c0.c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.g.e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L_0x0064
                r9.setAlpha(r8)
            L_0x0064:
                return r5
            L_0x0065:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.g.a.f(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }
    }

    public static synchronized g b() {
        g gVar;
        synchronized (g.class) {
            if (c == null) {
                h();
            }
            gVar = c;
        }
        return gVar;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter h;
        synchronized (g.class) {
            h = x.h(i, mode);
        }
        return h;
    }

    public static synchronized void h() {
        synchronized (g.class) {
            if (c == null) {
                g gVar = new g();
                c = gVar;
                gVar.a = x.d();
                c.a.l(new a());
            }
        }
    }

    public synchronized Drawable c(Context context, int i) {
        return this.a.f(context, i);
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable d(Context context, int i, boolean z) {
        return this.a.g(context, i, z);
    }

    /* access modifiers changed from: package-private */
    public synchronized ColorStateList f(Context context, int i) {
        return this.a.i(context, i);
    }

    public synchronized void g(Context context) {
        this.a.k(context);
    }
}
