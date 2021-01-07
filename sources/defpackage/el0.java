package defpackage;

/* renamed from: el0  reason: default package */
public class el0 extends j7 {
    public el0() {
        super(8, 9);
    }

    @Override // defpackage.j7
    public void a(p7 p7Var) {
        p7Var.A("DROP TABLE EventSequenceNumbers");
        p7Var.A("CREATE TABLE EventSequenceNumbers (eventName TEXT NOT NULL,sequenceId BLOB NOT NULL,sequenceNumberNext INTEGER NOT NULL,PRIMARY KEY(eventName, sequenceId))");
    }
}
