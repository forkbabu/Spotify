package defpackage;

/* renamed from: ohf  reason: default package */
public interface ohf<TRequest, TResponse> {

    /* renamed from: ohf$a */
    public interface a {
        void a();

        void onPreparePlayFailed();
    }

    void a();

    void b(TResponse tresponse, a aVar);

    void c(TRequest trequest, TResponse tresponse);
}
