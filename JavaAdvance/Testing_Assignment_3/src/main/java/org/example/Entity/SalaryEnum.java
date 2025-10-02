package org.example.Entity;

public enum SalaryEnum {
    DEV(600), TEST(700), SCRUMMASTER(1500), PM(2000);

    private final int value;

    SalaryEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
