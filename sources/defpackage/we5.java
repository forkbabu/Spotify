package defpackage;

import com.spotify.remoteconfig.x6;

/* renamed from: we5  reason: default package */
public class we5 implements ve5 {
    private final x6 a;

    public we5(x6 x6Var) {
        this.a = x6Var;
    }

    @Override // defpackage.ve5
    public ue5 a(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -437048859:
                if (str.equals("microsoft-surface-buds-legacy-client-id")) {
                    c = 0;
                    break;
                }
                break;
            case 808029390:
                if (str.equals("e11b1a8713164f739d2a9d9fed5a4c01")) {
                    c = 1;
                    break;
                }
                break;
            case 1547293299:
                if (str.equals("bdbbbe571cef4b148a51a0defb957475")) {
                    c = 2;
                    break;
                }
                break;
            case 2031309907:
                if (str.equals("1d2cf25b1643474983fae381b00cea3c")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new ue5(this.a.h());
            case 1:
                return new ue5(this.a.f());
            case 2:
                return new ue5(this.a.g());
            case 3:
                return new ue5(this.a.b());
            default:
                return new ue5(true);
        }
    }
}
