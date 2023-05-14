package data;

public class Sum {
    public int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void sum(int number) {
        total += number;
    }
}
