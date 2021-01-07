package defpackage;

/* renamed from: j51  reason: default package */
public final /* synthetic */ class j51 implements v51 {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;

    public /* synthetic */ j51(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.v51
    public final int d(s81 s81) {
        String str = this.a;
        int i = this.b;
        if (s81.componentId().id().equals(str)) {
            return i;
        }
        return 0;
    }
}
