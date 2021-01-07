package defpackage;

import defpackage.e50;
import java.io.InputStream;

/* renamed from: d50  reason: default package */
public class d50 extends x40 {
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int[] G;
    public e50 H;
    public c50 I;
    public int J;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public y40 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public boolean v;
    public int w;
    public int x;
    public int y;
    public boolean z;

    public static d50 a(InputStream inputStream) {
        y40 y40 = y40.g;
        y40 y402 = y40.e;
        f50 f50 = new f50(inputStream);
        d50 d50 = new d50();
        d50.m = (int) f50.f(8, "SPS: profile_idc");
        d50.n = f50.d("SPS: constraint_set_0_flag");
        d50.o = f50.d("SPS: constraint_set_1_flag");
        d50.p = f50.d("SPS: constraint_set_2_flag");
        d50.q = f50.d("SPS: constraint_set_3_flag");
        d50.r = f50.d("SPS: constraint_set_4_flag");
        d50.s = f50.d("SPS: constraint_set_5_flag");
        f50.f(2, "SPS: reserved_zero_2bits");
        d50.t = (int) f50.f(8, "SPS: level_idc");
        d50.u = f50.k("SPS: seq_parameter_set_id");
        int i2 = d50.m;
        if (i2 == 100 || i2 == 110 || i2 == 122 || i2 == 144) {
            int k2 = f50.k("SPS: chroma_format_idc");
            y40 y403 = y40.d;
            if (k2 == 0) {
                y402 = y403;
            } else if (k2 != 1) {
                y402 = y40.f;
                if (k2 != 2) {
                    y402 = k2 == 3 ? y40 : null;
                }
            }
            d50.e = y402;
            if (y402 == y40) {
                d50.v = f50.d("SPS: residual_color_transform_flag");
            }
            d50.j = f50.k("SPS: bit_depth_luma_minus8");
            d50.k = f50.k("SPS: bit_depth_chroma_minus8");
            d50.l = f50.d("SPS: qpprime_y_zero_transform_bypass_flag");
            if (f50.d("SPS: seq_scaling_matrix_present_lag")) {
                d50.I = new c50();
                for (int i3 = 0; i3 < 8; i3++) {
                    if (f50.d("SPS: seqScalingListPresentFlag")) {
                        c50 c50 = d50.I;
                        b50[] b50Arr = new b50[8];
                        c50.a = b50Arr;
                        b50[] b50Arr2 = new b50[8];
                        c50.b = b50Arr2;
                        if (i3 < 6) {
                            b50Arr[i3] = b50.a(f50, 16);
                        } else {
                            b50Arr2[i3 - 6] = b50.a(f50, 64);
                        }
                    }
                }
            }
        } else {
            d50.e = y402;
        }
        d50.f = f50.k("SPS: log2_max_frame_num_minus4");
        int k3 = f50.k("SPS: pic_order_cnt_type");
        d50.a = k3;
        if (k3 == 0) {
            d50.g = f50.k("SPS: log2_max_pic_order_cnt_lsb_minus4");
        } else if (k3 == 1) {
            d50.b = f50.d("SPS: delta_pic_order_always_zero_flag");
            d50.w = f50.g("SPS: offset_for_non_ref_pic");
            d50.x = f50.g("SPS: offset_for_top_to_bottom_field");
            int k4 = f50.k("SPS: num_ref_frames_in_pic_order_cnt_cycle");
            d50.J = k4;
            d50.G = new int[k4];
            for (int i4 = 0; i4 < d50.J; i4++) {
                int[] iArr = d50.G;
                iArr[i4] = f50.g("SPS: offsetForRefFrame [" + i4 + "]");
            }
        }
        d50.y = f50.k("SPS: num_ref_frames");
        d50.z = f50.d("SPS: gaps_in_frame_num_value_allowed_flag");
        d50.i = f50.k("SPS: pic_width_in_mbs_minus1");
        d50.h = f50.k("SPS: pic_height_in_map_units_minus1");
        boolean d2 = f50.d("SPS: frame_mbs_only_flag");
        d50.A = d2;
        if (!d2) {
            d50.c = f50.d("SPS: mb_adaptive_frame_field_flag");
        }
        d50.d = f50.d("SPS: direct_8x8_inference_flag");
        boolean d3 = f50.d("SPS: frame_cropping_flag");
        d50.B = d3;
        if (d3) {
            d50.C = f50.k("SPS: frame_crop_left_offset");
            d50.D = f50.k("SPS: frame_crop_right_offset");
            d50.E = f50.k("SPS: frame_crop_top_offset");
            d50.F = f50.k("SPS: frame_crop_bottom_offset");
        }
        if (f50.d("SPS: vui_parameters_present_flag")) {
            e50 e50 = new e50();
            boolean d4 = f50.d("VUI: aspect_ratio_info_present_flag");
            e50.a = d4;
            if (d4) {
                w40 a2 = w40.a((int) f50.f(8, "VUI: aspect_ratio"));
                e50.y = a2;
                if (a2 == w40.b) {
                    e50.b = (int) f50.f(16, "VUI: sar_width");
                    e50.c = (int) f50.f(16, "VUI: sar_height");
                }
            }
            boolean d5 = f50.d("VUI: overscan_info_present_flag");
            e50.d = d5;
            if (d5) {
                e50.e = f50.d("VUI: overscan_appropriate_flag");
            }
            boolean d6 = f50.d("VUI: video_signal_type_present_flag");
            e50.f = d6;
            if (d6) {
                e50.g = (int) f50.f(3, "VUI: video_format");
                e50.h = f50.d("VUI: video_full_range_flag");
                boolean d7 = f50.d("VUI: colour_description_present_flag");
                e50.i = d7;
                if (d7) {
                    e50.j = (int) f50.f(8, "VUI: colour_primaries");
                    e50.k = (int) f50.f(8, "VUI: transfer_characteristics");
                    e50.l = (int) f50.f(8, "VUI: matrix_coefficients");
                }
            }
            boolean d8 = f50.d("VUI: chroma_loc_info_present_flag");
            e50.m = d8;
            if (d8) {
                e50.n = f50.k("VUI chroma_sample_loc_type_top_field");
                e50.o = f50.k("VUI chroma_sample_loc_type_bottom_field");
            }
            boolean d9 = f50.d("VUI: timing_info_present_flag");
            e50.p = d9;
            if (d9) {
                e50.q = (int) f50.f(32, "VUI: num_units_in_tick");
                e50.r = (int) f50.f(32, "VUI: time_scale");
                e50.s = f50.d("VUI: fixed_frame_rate_flag");
            }
            boolean d10 = f50.d("VUI: nal_hrd_parameters_present_flag");
            if (d10) {
                e50.v = b(f50);
            }
            boolean d11 = f50.d("VUI: vcl_hrd_parameters_present_flag");
            if (d11) {
                e50.w = b(f50);
            }
            if (d10 || d11) {
                e50.t = f50.d("VUI: low_delay_hrd_flag");
            }
            e50.u = f50.d("VUI: pic_struct_present_flag");
            if (f50.d("VUI: bitstream_restriction_flag")) {
                e50.a aVar = new e50.a();
                e50.x = aVar;
                aVar.a = f50.d("VUI: motion_vectors_over_pic_boundaries_flag");
                e50.x.b = f50.k("VUI max_bytes_per_pic_denom");
                e50.x.c = f50.k("VUI max_bits_per_mb_denom");
                e50.x.d = f50.k("VUI log2_max_mv_length_horizontal");
                e50.x.e = f50.k("VUI log2_max_mv_length_vertical");
                e50.x.f = f50.k("VUI num_reorder_frames");
                e50.x.g = f50.k("VUI max_dec_frame_buffering");
            }
            d50.H = e50;
        }
        f50.h();
        return d50;
    }

    private static z40 b(f50 f50) {
        z40 z40 = new z40();
        z40.a = f50.k("SPS: cpb_cnt_minus1");
        z40.b = (int) f50.f(4, "HRD: bit_rate_scale");
        z40.c = (int) f50.f(4, "HRD: cpb_size_scale");
        int i2 = z40.a + 1;
        z40.d = new int[i2];
        z40.e = new int[i2];
        z40.f = new boolean[i2];
        for (int i3 = 0; i3 <= z40.a; i3++) {
            z40.d[i3] = f50.k("HRD: bit_rate_value_minus1");
            z40.e[i3] = f50.k("HRD: cpb_size_value_minus1");
            z40.f[i3] = f50.d("HRD: cbr_flag");
        }
        z40.g = (int) f50.f(5, "HRD: initial_cpb_removal_delay_length_minus1");
        z40.h = (int) f50.f(5, "HRD: cpb_removal_delay_length_minus1");
        z40.i = (int) f50.f(5, "HRD: dpb_output_delay_length_minus1");
        z40.j = (int) f50.f(5, "HRD: time_offset_length");
        return z40;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SeqParameterSet{ \n        pic_order_cnt_type=");
        sb.append(this.a);
        sb.append(", \n        field_pic_flag=");
        sb.append(false);
        sb.append(", \n        delta_pic_order_always_zero_flag=");
        sb.append(this.b);
        sb.append(", \n        weighted_pred_flag=");
        sb.append(false);
        sb.append(", \n        weighted_bipred_idc=");
        sb.append(0);
        sb.append(", \n        entropy_coding_mode_flag=");
        sb.append(false);
        sb.append(", \n        mb_adaptive_frame_field_flag=");
        sb.append(this.c);
        sb.append(", \n        direct_8x8_inference_flag=");
        sb.append(this.d);
        sb.append(", \n        chroma_format_idc=");
        sb.append(this.e);
        sb.append(", \n        log2_max_frame_num_minus4=");
        sb.append(this.f);
        sb.append(", \n        log2_max_pic_order_cnt_lsb_minus4=");
        sb.append(this.g);
        sb.append(", \n        pic_height_in_map_units_minus1=");
        sb.append(this.h);
        sb.append(", \n        pic_width_in_mbs_minus1=");
        sb.append(this.i);
        sb.append(", \n        bit_depth_luma_minus8=");
        sb.append(this.j);
        sb.append(", \n        bit_depth_chroma_minus8=");
        sb.append(this.k);
        sb.append(", \n        qpprime_y_zero_transform_bypass_flag=");
        sb.append(this.l);
        sb.append(", \n        profile_idc=");
        sb.append(this.m);
        sb.append(", \n        constraint_set_0_flag=");
        sb.append(this.n);
        sb.append(", \n        constraint_set_1_flag=");
        sb.append(this.o);
        sb.append(", \n        constraint_set_2_flag=");
        sb.append(this.p);
        sb.append(", \n        constraint_set_3_flag=");
        sb.append(this.q);
        sb.append(", \n        constraint_set_4_flag=");
        sb.append(this.r);
        sb.append(", \n        constraint_set_5_flag=");
        sb.append(this.s);
        sb.append(", \n        level_idc=");
        sb.append(this.t);
        sb.append(", \n        seq_parameter_set_id=");
        sb.append(this.u);
        sb.append(", \n        residual_color_transform_flag=");
        sb.append(this.v);
        sb.append(", \n        offset_for_non_ref_pic=");
        sb.append(this.w);
        sb.append(", \n        offset_for_top_to_bottom_field=");
        sb.append(this.x);
        sb.append(", \n        num_ref_frames=");
        sb.append(this.y);
        sb.append(", \n        gaps_in_frame_num_value_allowed_flag=");
        sb.append(this.z);
        sb.append(", \n        frame_mbs_only_flag=");
        sb.append(this.A);
        sb.append(", \n        frame_cropping_flag=");
        sb.append(this.B);
        sb.append(", \n        frame_crop_left_offset=");
        sb.append(this.C);
        sb.append(", \n        frame_crop_right_offset=");
        sb.append(this.D);
        sb.append(", \n        frame_crop_top_offset=");
        sb.append(this.E);
        sb.append(", \n        frame_crop_bottom_offset=");
        sb.append(this.F);
        sb.append(", \n        offsetForRefFrame=");
        sb.append(this.G);
        sb.append(", \n        vuiParams=");
        sb.append(this.H);
        sb.append(", \n        scalingMatrix=");
        sb.append(this.I);
        sb.append(", \n        num_ref_frames_in_pic_order_cnt_cycle=");
        return je.A0(sb, this.J, '}');
    }
}
