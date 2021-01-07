package defpackage;

import com.google.android.exoplayer2.d0;

/* renamed from: xm  reason: default package */
public interface xm {
    public static final xm a = new a();

    /* renamed from: xm$a */
    static class a implements xm {
        a() {
        }

        @Override // defpackage.xm
        public wm a(d0 d0Var) {
            String str = d0Var.r;
            if (str != null) {
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1348231605:
                        if (str.equals("application/x-icy")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1248341703:
                        if (str.equals("application/id3")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1154383568:
                        if (str.equals("application/x-emsg")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1652648887:
                        if (str.equals("application/x-scte35")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new en();
                    case 1:
                        return new nn();
                    case 2:
                        return new cn();
                    case 3:
                        return new wn();
                }
            }
            throw new IllegalArgumentException(je.x0("Attempted to create decoder for unsupported MIME type: ", str));
        }

        @Override // defpackage.xm
        public boolean e(d0 d0Var) {
            String str = d0Var.r;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str);
        }
    }

    wm a(d0 d0Var);

    boolean e(d0 d0Var);
}
