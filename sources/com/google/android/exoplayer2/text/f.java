package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.d0;

public interface f {
    public static final f a = new a();

    static class a implements f {
        a() {
        }

        public e a(d0 d0Var) {
            String str = d0Var.r;
            if (str != null) {
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1351681404:
                        if (str.equals("application/dvbsubs")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1248334819:
                        if (str.equals("application/pgs")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1026075066:
                        if (str.equals("application/x-mp4-vtt")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1004728940:
                        if (str.equals("text/vtt")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 691401887:
                        if (str.equals("application/x-quicktime-tx3g")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 822864842:
                        if (str.equals("text/x-ssa")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 930165504:
                        if (str.equals("application/x-mp4-cea-608")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1566015601:
                        if (str.equals("application/cea-608")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 1566016562:
                        if (str.equals("application/cea-708")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 1668750253:
                        if (str.equals("application/x-subrip")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 1693976202:
                        if (str.equals("application/ttml+xml")) {
                            c = '\n';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return new zo(d0Var.t);
                    case 1:
                        return new cp();
                    case 2:
                        return new sp();
                    case 3:
                        return new xp();
                    case 4:
                        return new pp(d0Var.t);
                    case 5:
                        return new ep(d0Var.t);
                    case 6:
                    case 7:
                        return new to(str, d0Var.K);
                    case '\b':
                        return new vo(d0Var.K);
                    case '\t':
                        return new ip();
                    case '\n':
                        return new kp();
                }
            }
            throw new IllegalArgumentException(je.x0("Attempted to create decoder for unsupported MIME type: ", str));
        }
    }
}
