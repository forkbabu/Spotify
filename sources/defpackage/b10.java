package defpackage;

/* renamed from: b10  reason: default package */
public class b10 implements e10 {
    private final e10[] a;
    private final c10 b;

    public b10(int i, e10... e10Arr) {
        this.a = e10Arr;
        this.b = new c10(i);
    }

    @Override // defpackage.e10
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        e10[] e10Arr = this.a;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (e10 e10 : e10Arr) {
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = e10.a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? this.b.a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
