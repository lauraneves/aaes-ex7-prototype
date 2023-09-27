package src;

abstract class Transaction implements Cloneable {
    protected String type;
    protected double value;

    public abstract void showDetails();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
