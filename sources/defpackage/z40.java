package defpackage;

import java.util.Arrays;

/* renamed from: z40  reason: default package */
public class z40 {
    public int a;
    public int b;
    public int c;
    public int[] d;
    public int[] e;
    public boolean[] f;
    public int g;
    public int h;
    public int i;
    public int j;

    public String toString() {
        StringBuilder sb = new StringBuilder("HRDParameters{cpb_cnt_minus1=");
        sb.append(this.a);
        sb.append(", bit_rate_scale=");
        sb.append(this.b);
        sb.append(", cpb_size_scale=");
        sb.append(this.c);
        sb.append(", bit_rate_value_minus1=");
        sb.append(Arrays.toString(this.d));
        sb.append(", cpb_size_value_minus1=");
        sb.append(Arrays.toString(this.e));
        sb.append(", cbr_flag=");
        sb.append(Arrays.toString(this.f));
        sb.append(", initial_cpb_removal_delay_length_minus1=");
        sb.append(this.g);
        sb.append(", cpb_removal_delay_length_minus1=");
        sb.append(this.h);
        sb.append(", dpb_output_delay_length_minus1=");
        sb.append(this.i);
        sb.append(", time_offset_length=");
        return je.A0(sb, this.j, '}');
    }
}
