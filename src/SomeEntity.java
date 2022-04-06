class SomeEntity implements SomeInterface {

    int field;

    @Override
    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }
}
