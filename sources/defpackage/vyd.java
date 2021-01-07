package defpackage;

/* renamed from: vyd  reason: default package */
public final /* synthetic */ class vyd implements sg0 {
    public static final /* synthetic */ vyd a = new vyd();

    private /* synthetic */ vyd() {
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        String property = System.getProperty((String) obj);
        return property != null ? property : "";
    }
}
