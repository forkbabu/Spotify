package kotlin.coroutines;

public interface c {

    public interface a extends c {
    }

    public interface b<E extends a> {
    }

    <E extends a> E c(b<E> bVar);
}
