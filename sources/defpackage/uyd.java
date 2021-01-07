package defpackage;

/* renamed from: uyd  reason: default package */
public final /* synthetic */ class uyd implements sg0 {
    public static final /* synthetic */ uyd a = new uyd();

    private /* synthetic */ uyd() {
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        String property = System.getProperty((String) obj);
        return property != null ? property : "";
    }
}
