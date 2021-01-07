package io.branch.referral;

public enum Defines$ModuleNameKeys {
    imei("imei");
    
    private String key = "";

    private Defines$ModuleNameKeys(String str) {
        this.key = str;
    }

    public String d() {
        return this.key;
    }

    @Override // java.lang.Enum, java.lang.Object
    public String toString() {
        return this.key;
    }
}
