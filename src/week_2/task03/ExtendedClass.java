package week_2.task03;

import java.util.Objects;

public class ExtendedClass {
    private final byte b;
    private final int i;
    private final double d;
    private final String s;

    public ExtendedClass(byte b, int i, double d, String s) {
        this.b = b;
        this.i = i;
        this.d = d;
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (this.hashCode() != o.hashCode()) return false;
        if (!(o instanceof ExtendedClass)) return false;
        ExtendedClass that = (ExtendedClass) o;
        return b == that.b && i == that.i && Double.compare(that.d, d) == 0 && s.equals(that.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(b, i, d, s);
    }

    @Override
    public String toString() {
        return "ExtendedClass{" +
                "b=" + b +
                ", i=" + i +
                ", d=" + d +
                ", s='" + s + '\'' +
                '}';
    }
}
