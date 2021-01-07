package defpackage;

/* renamed from: e50  reason: default package */
public class e50 {
    public boolean a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public int n;
    public int o;
    public boolean p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public z40 v;
    public z40 w;
    public a x;
    public w40 y;

    /* renamed from: e50$a */
    public static class a {
        public boolean a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public String toString() {
            StringBuilder sb = new StringBuilder("BitstreamRestriction{");
            sb.append("motion_vectors_over_pic_boundaries_flag=");
            sb.append(this.a);
            sb.append(", max_bytes_per_pic_denom=");
            sb.append(this.b);
            sb.append(", max_bits_per_mb_denom=");
            sb.append(this.c);
            sb.append(", log2_max_mv_length_horizontal=");
            sb.append(this.d);
            sb.append(", log2_max_mv_length_vertical=");
            sb.append(this.e);
            sb.append(", num_reorder_frames=");
            sb.append(this.f);
            sb.append(", max_dec_frame_buffering=");
            return je.A0(sb, this.g, '}');
        }
    }

    public String toString() {
        return "VUIParameters{\naspect_ratio_info_present_flag=" + this.a + "\n, sar_width=" + this.b + "\n, sar_height=" + this.c + "\n, overscan_info_present_flag=" + this.d + "\n, overscan_appropriate_flag=" + this.e + "\n, video_signal_type_present_flag=" + this.f + "\n, video_format=" + this.g + "\n, video_full_range_flag=" + this.h + "\n, colour_description_present_flag=" + this.i + "\n, colour_primaries=" + this.j + "\n, transfer_characteristics=" + this.k + "\n, matrix_coefficients=" + this.l + "\n, chroma_loc_info_present_flag=" + this.m + "\n, chroma_sample_loc_type_top_field=" + this.n + "\n, chroma_sample_loc_type_bottom_field=" + this.o + "\n, timing_info_present_flag=" + this.p + "\n, num_units_in_tick=" + this.q + "\n, time_scale=" + this.r + "\n, fixed_frame_rate_flag=" + this.s + "\n, low_delay_hrd_flag=" + this.t + "\n, pic_struct_present_flag=" + this.u + "\n, nalHRDParams=" + this.v + "\n, vclHRDParams=" + this.w + "\n, bitstreamRestriction=" + this.x + "\n, aspect_ratio=" + this.y + "\n}";
    }
}
