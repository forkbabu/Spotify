package defpackage;

import java.io.InputStream;
import java.util.Arrays;

/* renamed from: a50  reason: default package */
public class a50 extends x40 {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int[] r;
    public int[] s;
    public int[] t;
    public boolean u;
    public int[] v;
    public a w;

    /* renamed from: a50$a */
    public static class a {
        public boolean a;
        public c50 b = new c50();
        public int c;

        public String toString() {
            return "PPSExt{transform_8x8_mode_flag=" + this.a + ", scalindMatrix=" + this.b + ", second_chroma_qp_index_offset=" + this.c + ", pic_scaling_list_present_flag=" + ((Object) null) + '}';
        }
    }

    public static a50 a(InputStream inputStream) {
        f50 f50 = new f50(inputStream);
        a50 a50 = new a50();
        a50.e = f50.k("PPS: pic_parameter_set_id");
        a50.f = f50.k("PPS: seq_parameter_set_id");
        a50.a = f50.d("PPS: entropy_coding_mode_flag");
        a50.g = f50.d("PPS: pic_order_present_flag");
        int k2 = f50.k("PPS: num_slice_groups_minus1");
        a50.h = k2;
        if (k2 > 0) {
            int k3 = f50.k("PPS: slice_group_map_type");
            a50.i = k3;
            int i2 = 1;
            int i3 = a50.h + 1;
            a50.r = new int[i3];
            a50.s = new int[i3];
            a50.t = new int[i3];
            if (k3 == 0) {
                for (int i4 = 0; i4 <= a50.h; i4++) {
                    a50.t[i4] = f50.k("PPS: run_length_minus1");
                }
            } else if (k3 == 2) {
                for (int i5 = 0; i5 < a50.h; i5++) {
                    a50.r[i5] = f50.k("PPS: top_left");
                    a50.s[i5] = f50.k("PPS: bottom_right");
                }
            } else if (k3 == 3 || k3 == 4 || k3 == 5) {
                a50.u = f50.d("PPS: slice_group_change_direction_flag");
                a50.d = f50.k("PPS: slice_group_change_rate_minus1");
            } else if (k3 == 6) {
                if (i3 > 4) {
                    i2 = 3;
                } else if (i3 > 2) {
                    i2 = 2;
                }
                int k4 = f50.k("PPS: pic_size_in_map_units_minus1");
                a50.v = new int[(k4 + 1)];
                for (int i6 = 0; i6 <= k4; i6++) {
                    int[] iArr = a50.v;
                    iArr[i6] = f50.i(i2, "PPS: slice_group_id [" + i6 + "]f");
                }
            }
        }
        a50.b = f50.k("PPS: num_ref_idx_l0_active_minus1");
        a50.c = f50.k("PPS: num_ref_idx_l1_active_minus1");
        a50.j = f50.d("PPS: weighted_pred_flag");
        a50.k = (int) f50.f(2, "PPS: weighted_bipred_idc");
        a50.l = f50.g("PPS: pic_init_qp_minus26");
        a50.m = f50.g("PPS: pic_init_qs_minus26");
        a50.n = f50.g("PPS: chroma_qp_index_offset");
        a50.o = f50.d("PPS: deblocking_filter_control_present_flag");
        a50.p = f50.d("PPS: constrained_intra_pred_flag");
        a50.q = f50.d("PPS: redundant_pic_cnt_present_flag");
        if (f50.b()) {
            a aVar = new a();
            a50.w = aVar;
            aVar.a = f50.d("PPS: transform_8x8_mode_flag");
            if (f50.d("PPS: pic_scaling_matrix_present_flag")) {
                for (int i7 = 0; i7 < ((a50.w.a ? 1 : 0) * 2) + 6; i7++) {
                    if (f50.d("PPS: pic_scaling_list_present_flag")) {
                        c50 c50 = a50.w.b;
                        b50[] b50Arr = new b50[8];
                        c50.a = b50Arr;
                        b50[] b50Arr2 = new b50[8];
                        c50.b = b50Arr2;
                        if (i7 < 6) {
                            b50Arr[i7] = b50.a(f50, 16);
                        } else {
                            b50Arr2[i7 - 6] = b50.a(f50, 64);
                        }
                    }
                }
            }
            a50.w.c = f50.g("PPS: second_chroma_qp_index_offset");
        }
        f50.h();
        return a50;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a50.class != obj.getClass()) {
            return false;
        }
        a50 a50 = (a50) obj;
        if (!Arrays.equals(this.s, a50.s) || this.n != a50.n || this.p != a50.p || this.o != a50.o || this.a != a50.a) {
            return false;
        }
        a aVar = this.w;
        if (aVar == null) {
            if (a50.w != null) {
                return false;
            }
        } else if (!aVar.equals(a50.w)) {
            return false;
        }
        return this.b == a50.b && this.c == a50.c && this.h == a50.h && this.l == a50.l && this.m == a50.m && this.g == a50.g && this.e == a50.e && this.q == a50.q && Arrays.equals(this.t, a50.t) && this.f == a50.f && this.u == a50.u && this.d == a50.d && Arrays.equals(this.v, a50.v) && this.i == a50.i && Arrays.equals(this.r, a50.r) && this.k == a50.k && this.j == a50.j;
    }

    public int hashCode() {
        int i2 = 1231;
        int hashCode = (((((((((Arrays.hashCode(this.s) + 31) * 31) + this.n) * 31) + (this.p ? 1231 : 1237)) * 31) + (this.o ? 1231 : 1237)) * 31) + (this.a ? 1231 : 1237)) * 31;
        a aVar = this.w;
        int hashCode2 = (((Arrays.hashCode(this.r) + ((((Arrays.hashCode(this.v) + ((((((((Arrays.hashCode(this.t) + ((((((((((((((((((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.b) * 31) + this.c) * 31) + this.h) * 31) + this.l) * 31) + this.m) * 31) + (this.g ? 1231 : 1237)) * 31) + this.e) * 31) + (this.q ? 1231 : 1237)) * 31)) * 31) + this.f) * 31) + (this.u ? 1231 : 1237)) * 31) + this.d) * 31)) * 31) + this.i) * 31)) * 31) + this.k) * 31;
        if (!this.j) {
            i2 = 1237;
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "PictureParameterSet{\n       entropy_coding_mode_flag=" + this.a + ",\n       num_ref_idx_l0_active_minus1=" + this.b + ",\n       num_ref_idx_l1_active_minus1=" + this.c + ",\n       slice_group_change_rate_minus1=" + this.d + ",\n       pic_parameter_set_id=" + this.e + ",\n       seq_parameter_set_id=" + this.f + ",\n       pic_order_present_flag=" + this.g + ",\n       num_slice_groups_minus1=" + this.h + ",\n       slice_group_map_type=" + this.i + ",\n       weighted_pred_flag=" + this.j + ",\n       weighted_bipred_idc=" + this.k + ",\n       pic_init_qp_minus26=" + this.l + ",\n       pic_init_qs_minus26=" + this.m + ",\n       chroma_qp_index_offset=" + this.n + ",\n       deblocking_filter_control_present_flag=" + this.o + ",\n       constrained_intra_pred_flag=" + this.p + ",\n       redundant_pic_cnt_present_flag=" + this.q + ",\n       top_left=" + this.r + ",\n       bottom_right=" + this.s + ",\n       run_length_minus1=" + this.t + ",\n       slice_group_change_direction_flag=" + this.u + ",\n       slice_group_id=" + this.v + ",\n       extended=" + this.w + '}';
    }
}
